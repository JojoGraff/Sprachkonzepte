lexer grammar computerLanguage;

PART:
          'Motherboard'
        | 'Central Prossessing Unit'
        | 'Graphics Card'
        | 'Random Access Memory'
        | 'M2 Drive'
        | 'Hard Disc'
        | 'Solid State Drive'
        | 'Fan'
        | 'Watercooler'
        | 'Aircooler'
        | 'Case'
        | 'Power Supply'
        | 'Cables'
        | 'Peripials'
        | 'Monitor';

PRODUCER:

          'Intel'
        | 'AMD'
        | 'ASUS'
        | 'Nvidia'
        | 'Corsair'
        | 'Samsung'
        | 'MSI'
        | 'Toshiba'
        | 'Seasonic'
        | 'Western Digital'
        | 'Noctua'
        | 'LG';



PRICE: ([0-9])+;

CURRENCY:
              '$';



WS: [ \t\r\n]+ -> channel(HIDDEN);




