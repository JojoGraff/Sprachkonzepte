# Sprachkonzepte Bericht

### Team:
- Rebecca Schmidt
- Johannes Graff

### Lösungen:
- Alle Lösungen sind per GitHub angegeben sowie bei der Abgabe beigelegt.
- Die Gesamten Files mit generierten Dateien kann man im Repository finden


## Aufgabe 1

Teil A
- Schreiben Sie ein Java-Programm, das in einem String Formatspezifikationen gemäß java.util.Formatter findet. Erstellen Sie dazu mit der Syntax von java.util.regex.Pattern einen regulären Ausdruck für eine solche Formatspezifikation. Sie brauchen darin nicht zu berücksichtigen, dass bestimmte Angaben innerhalb einer Formatspezifikation nur bei bestimmten Konversionen erlaubt sind. Achten Sie aber bei argument_index, width und precision darauf, ob der Zahlbereich bei 0 oder 1 beginnt.   

        Beispieleingaben:
        xxx %d yyy%n
        xxx%1$d yyy
        %1$-02.3dyyy
        Wochentag: %tA Uhrzeit: %tT

        Beispielausgaben:
        TEXT("xxx ")FORMAT("%d")TEXT(" yyy")FORMAT("%n")
        TEXT("xxx")FORMAT("%1$d")TEXT(" yyy")
        FORMAT("%1$-02.3d")TEXT("yyy")
        TEXT("Wochentag:")FORMAT("%tA")TEXT("Uhrzeit:")FORMAT("%tT")

Teil B  
Erkennen Sie mit ANTLR 4 Lexer-Regeln Zeitangaben im digitalen 12-Sunden-Format gemäß https://en.wikipedia.org/wiki/12-hour_clock.  
Beachten Sie auch die alternativen Schreibweisen 12 midnight und 12 noon

### Lösungen:
- [Exercise1a.java](https://github.com/JojoGraff/Sprachkonzepte/blob/master/src/exercise1/Exercise1a.java)
- [Exercise1b.g4](https://github.com/JojoGraff/Sprachkonzepte/blob/master/src/exercise1/Exercise1b.g4)

Zu B: 
- Testen über eingebautes Intellij ANTLR4 Plugin war deutlich praktischer


## Aufgabe 2

Teil A
- Denken Sie sich eine kleine Sprache aus. Definieren Sie deren Vokabular mit einer ANTLR4 lexer grammar und deren Grammatik mit einer ANTLR4 parser grammar. Erzeugen Sie für einige Beispieltexte mit Hilfe von org.antlr.v4.gui.TestRig den Ableitungsbaum (Parse Tree).

Teil B
- Definieren Sie mit Java-Klassen die abstrakte Syntax Ihrer Sprache aus a) und
schreiben Sie ein Java-Programm, das den ANTLR4 Parse Tree in einen AST überführt.

### Lösungen:

Zu A:
- Sprache zum Konfigurieren eines Computers erstellt
- Computer besitzt mehrere Teile, die Typ, Hersteller und Preis besitzen
- Preis besitzt Nummer und Währung. Währung wurde später auf $ beschränkt weil € sehr inkonsistent erkannt wurde
- Computer besitzt einen eigenen Preis, der nicht zwingend mit der Summe der Teile übereinstimmt
- Die Grammatik erlaubt mehrere Teile und einen Gesamtpreis des Computers
- [computerLanguage.g4](https://github.com/JojoGraff/Sprachkonzepte/blob/master/src/exercise2/computerLanguage.g4)
- [computerGrammar.g4](https://github.com/JojoGraff/Sprachkonzepte/blob/master/src/exercise2/computerGrammar.g4)
- Ableitungsbaum per Intellij getestet:
- [Tree.png](https://github.com/JojoGraff/Sprachkonzepte/blob/master/src/exercise2/Tree.png)


Zu B:
- Die abstrakte Syntax wurde mit den Klassen Computer und Part beschrieben
- [Computer.java](https://github.com/JojoGraff/Sprachkonzepte/blob/master/src/exercise2/Computer.java)
- [Part.java](https://github.com/JojoGraff/Sprachkonzepte/blob/master/src/exercise2/Part.java)

- Für die Generierung eines AST werden ein Builder und ein Test benötigt (generierte Files bitte Repo entnehmen)
- [ComputerBuild.java](https://github.com/JojoGraff/Sprachkonzepte/blob/master/src/exercise2/ComputerBuild.java)
- [ComputerTest.java](https://github.com/JojoGraff/Sprachkonzepte/blob/master/src/exercise2/ComputerTest.java)

## Aufgabe 3

Teil A   
Sie haben in Aufgabe 2 eine kleine Sprache mit konkreter und abstrakter Syntax definiert.   
Lässt sich eine statische Semantik für Ihre abstrakte Syntax angeben?
- Ja, jedes Teil muss einen Hersteller und Preis haben und der Pc muss einen Gesamtpreis besitzen
- Außerdem dürfen bestimmte Teile nicht mehrfach vorkommen, wie z.B Motherboard    

Erlaubt Ihre konkrete Syntax Formulierungen, die die statische Semantik verletzen?
- Ja, es können Teile mehrfach hinzugefügt werden, auch wenn dies keinen Sinn ergibt
Ergänzen Sie gegebenenfalls eine statische Semantikprüfung für Ihre Sprache.
- Bestimmte Teile dürfen nun nur noch ein mal im Computer vorkommen --> siehe ComputerBuild.exitParts

Teil B   
Programmieren Sie für Ihre eigene Sprache aus Aufgabe 2 mindestens eine dynamische Semantik
- Die Gesamtkosten der einzelnen Teile wird berechnet und ein Text ausgegeben, ob der Preis des Computers fair ist --> siehe Computer.dynamicSemantic

### Lösungen:
- [ComputerBuild.java](https://github.com/JojoGraff/Sprachkonzepte/blob/master/src/exercise2/ComputerBuild.java)
- [Computer.java](https://github.com/JojoGraff/Sprachkonzepte/blob/master/src/exercise2/Computer.java)


## Aufgabe 4

Teil A   
Vervollständigen Sie das folgende Java-Programm, indem Sie die aufgerufenen Klassenmethoden ergänzen. Was an dem Java-Programm ist eindeutig prozeduraler Stil?
- Die verwendeten Methoden geben Werte, nicht Funktionen zurück

Teil B
Stellen Sie das Programm aus 4a mit Hilfe von java.util.streams und Lambdas auf einen funktionalen Stil um. Ihr Programm darf nach der Umstellung keine Schleifen, Verzweigungen und Seiteneffekte mehr enthalten.

Teil C
Vergleichen Sie die Laufzeiten der Programme aus 4a und 4b.
- Prozedual: 3426 microsec
- Declarative: 16029 microsec
- Prozedual ist deutlich schneller 

### Lösungen:
- [Procedural.java](https://github.com/JojoGraff/Sprachkonzepte/blob/master/src/exercise4/Procedural.java)
- [Declarative.java](https://github.com/JojoGraff/Sprachkonzepte/blob/master/src/exercise4/Declarative.java)


## Aufgabe 5

Teil A  
Lösen Sie die Aufgaben von Folie 25 (rechte Spalte der Tabelle), 26 (Berechnung Fakultät) und 28 (Anfragen letzter Spiegelpunkt) aus Eck-Prolog.pdf.

Teil B   
Programmieren Sie ein Prädikat sum, das die Summe einer Liste von Zahlen berechnet   

Teil C   
Definieren Sie ein Prädikat verbindung, das beschreibt, ob zwischen zwei Städten nach einer gegebenen Abfahrtszeit eine Verbindung inklusive Umsteigen existiert

### Lösungen:
- [exercise5a.txt](https://github.com/JojoGraff/Sprachkonzepte/blob/master/src/exercise5/exercise5a)
- [exercise5b.pl](https://github.com/JojoGraff/Sprachkonzepte/blob/master/src/exercise5/exercise5b.pl)
- [exercise5c.pl](https://github.com/JojoGraff/Sprachkonzepte/blob/master/src/exercise5/exercise5c.pl)


## Aufgabe 6
Implementieren Sie eine Java-Anwendung, die für beliebige Java-Klassen und -Interfaces eine HTML-Seite im Format der Beispieldatei aufgabe6.html (siehe Moodle-Kursseite) generiert. Leiten Sie dazu aus aufgabe6.html eine Stringtemplategroup-Datei aufgabe6.stg ab. Die Java-Anwendung soll die gewünschten voll qualifizierten Klassen- und Interfacenamen als Aufrufparameter bekommen und mit Hilfe der Templates die HTML-Darstellung erzeugen

### Lösungen
- [Exercise6.java](https://github.com/JojoGraff/Sprachkonzepte/blob/master/src/exercise6/Exercise6.java)
- [aufgabe6.stg](https://github.com/JojoGraff/Sprachkonzepte/blob/master/src/exercise6/aufgabe6.stg)

## Aufgabe 7

Implementieren Sie eine kleine Anwendung mit einer Scriptsprache und analysieren Sie, welche typischen Eigenschaften einer Scriptsprache Sie dabei ausnutzen

- Kleine Wetter Anwendung, die den Standort des Users bestimmt und anschließend Temperatur, Windrichtung und Windgeschwindigkeit ausgibt
- Umgesetzt als Vue Projekt mit TypeScript und Vuetify, wobei kein Wert auf HTML Website gelegt wurde, da hier Vue/HTML verwendet wird
- Bedient sich bei einer Norwegischen Wetter API, die wir auch im Teamprojekt verwenden (könnte auch noch mehr Daten ausgeben)
- Vue stellt Server bereit -- Logik komplett mit TypeScript implementiert

Eigenschaften einer Skriptsprache:
- Es werden nur Methoden verwendet, keine Klassen
- Variablen werden Teilweise implizit deklariert, wobei sich hier der Linter beschwert
- So viele "Einzeiler" wie möglich 

Hinweise:
- Zum Testen im Browser wird ein [Plugin](https://chrome.google.com/webstore/detail/allow-cors-access-control/lhobafahddgcelffkeicbaginigeejlf?hl=en) benötigt, da die API keine Calls von localhost entgegen nimmt und dieses Plugin dies umgeht

Wichtigste Datei im Vue Projekt mit TS: 
- [App.vue](https://github.com/JojoGraff/Sprachkonzepte/blob/master/src/exercise7/vueproject/src/App.vue)

