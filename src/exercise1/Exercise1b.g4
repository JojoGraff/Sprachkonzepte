grammar Exercise1b;

time : hours COLON minutes SPACE daytime | hours COLON TIMELOWER | TIMEUPPER;

hours : HOURS;
minutes : MINUTES;
daytime : DAYTIME;

HOURS : ('0'[1-9] | '1'[0-2]);
MINUTES : ([0-5][0-9]);
TIMELOWER: ('noon' | 'midnight');
TIMEUPPER: ('Noon' | 'Midnight');
DAYTIME : ('a.m.' | 'p.m.');
COLON: (':');
SPACE: (' ');