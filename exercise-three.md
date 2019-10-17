# Exercise Two: Let's test the new functionality

Great! We got here! We can be comfortable with our implementation as it's all covered with tests, and as such now we want to add some new functionality.

The new functionality revolves around our new output writer, and adding additional logging to it, as well as adding new capabilities to our Add method.

The new requirement is:

 - The Output Writer needs to output the sums done in order of operations, taking into account any brackets in the input

Naturally, the add method will still have the same output, as we're only adding numbers together at this point. So your previous tests should all still work throughout. If they don't though, you can back out your changes and try and figure out what's gone wrong.

When we have the input `"2,3,(4,5)"`
Then the output writer should log `"4 + 5, 2 + 3, 5 + 9"`

This illustrates the steps that the string calculator should be taking under the hood to process brackets.

Some more examples:

input: `"34,12,(100,40),30"`
output writer: `"100 + 40, 34 + 12, 46 + 140, 186 + 30"`
return value: `"216"`

input: `"5,6,8"`
output writer: `"5 + 6, 11 + 8"`
return value: `"19"`

input: `"3"`
output writer: `""` (empty string, as no sums are done)
return value: `"3"`

The most important part of this exercise is that you don't forget to follow TDD!

RED, GREEN, REFACTOR!

If you're stuck at any point or want a few hints or pointers, just ask one of us and we'll be more than happy to help.
