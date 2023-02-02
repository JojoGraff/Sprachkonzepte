sum([], 0).
sum([H|T], SUM) :-
    sum(T, Rest),
    SUM is H + Rest.