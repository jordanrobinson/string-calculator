# Exercise Three: Let's add new functionality

Great! We got here! We can be comfortable with our implementation as it's all covered with tests, and as such now we want to add some new functionality.

The new functionality revolves around our new output writer, and adding additional logging to it.

The new requirement is:

 - The Output Writer needs to output the sums done in order of operations

Naturally, the add method will still have the same output, as we're only adding numbers together at this point. So your previous tests should all still work throughout. If they don't though, you can back out your changes and try and figure out what's gone wrong.

When we have the input `"2,3,4,5"`
Then the output writer should log `"2 + 3, 5 + 4, 9 + 5"`

Note the accumulator, how `2 + 3` then becomes `5` and is used for the next sum.

This illustrates the steps that the string calculator should be taking under the hood.

Some more examples:

input: `"34,12,100,40,30"`
output writer: `"34 + 12, 46 + 100, 146 + 40, 186 + 30"`
return value: `"216"`

input: `"5,6,8"`
output writer: `"5 + 6, 11 + 8"`
return value: `"19"`

input: `"7,23,5,9"`
output writer: `"7 + 23, 30 + 5, 35 + 9"`
return value: `"44"`

input: `"3"`
output writer: `""` (empty string, as no sums are done)
return value: `"3"`

The most important part of this exercise is that you don't forget to follow TDD!

RED, GREEN, REFACTOR!

If you're stuck at any point or want a few hints or pointers, just ask one of us and we'll be more than happy to help.
