-module(tests).
-export([multiply/2, multiply/4]).

multiply(Limit, Max) -> multiply(Limit, Max, Limit, []).

multiply(Limit, Max, Count, List) ->


if 
Limit > Max ->
List;
true ->
multiply ((Limit + Count), Max, Count , lists:reverse([Limit|List]))
end.