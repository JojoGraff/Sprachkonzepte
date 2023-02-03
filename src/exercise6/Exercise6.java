package exercise6;

import java.io.FileWriter;
import java.lang.reflect.Method;
import java.util.ArrayList;

import org.stringtemplate.v4.ST;
import org.stringtemplate.v4.STGroupFile;

public final class Exercise6 {
    private Exercise6() {
    }

    public static void main(String[] args) throws Exception {
        ArrayList<Classes> classArray = new ArrayList<>();
        for (String argument : args) {
            Class<?> c = Class.forName(argument);
            Classes classes = new Classes(c.getName(), c);
            classArray.add(classes);
        }

        ST template = new STGroupFile("aufgabe6.stg").getInstanceOf("aufgabe6");
        template.add("classes", classArray);
        String result = template.render();

        FileWriter fileWriter = new FileWriter("output.html");
        fileWriter.write(result);
        fileWriter.close();
    }
}

final class Classes {
    public String name;
    public ArrayList<InterfaceMethods> interfaces = new ArrayList<>();
    public Method[] classMethods;
    public boolean isInterface;

    public Classes(String name, Class<?> classObject) {
        if (classObject.isInterface()) {
            this.name = name;
            isInterface = true;
            this.classMethods = classObject.getMethods();
        } else {
            this.name = name;
            for(Class<?> c : classObject.getInterfaces())
                interfaces.add(new InterfaceMethods(c.getName(), c.getMethods()));
        }
    }
}

final class InterfaceMethods {
    public String interfaceName;
    public Method[] interfaceMethods;

    public InterfaceMethods(String interfaceName, Method[] interfaceMethods) {
        this.interfaceMethods = interfaceMethods;
        this.interfaceName = interfaceName;
    }
}