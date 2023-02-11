lexer grammar Exercise1b;

Time : HOURS COLON MINUTES SPACE DAYTIME | HOURS COLON TIMELOWER | TIMEUPPER;

fragment HOURS : ('0'[1-9] | '1'[0-2]);
fragment MINUTES : ([0-5][0-9]);
fragment TIMELOWER: ('noon' | 'midnight');
fragment TIMEUPPER: ('Noon' | 'Midnight');
fragment DAYTIME : ('a.m.' | 'p.m.');
fragment COLON: (':');
fragment SPACE: (' ');

WS: [ \t\r\n]+ -> channel(HIDDEN);