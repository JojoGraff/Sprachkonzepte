parser grammar computerGrammar;
options {
            tokenVocab = computerLanguage;
            }

start: computer;

computer: parts+ price;

parts: PART PRODUCER price ;

price: PRICE CURRENCY;