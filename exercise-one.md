# Exercise One: Let's make a stub

The scenario here is that you've created a basic implementation of a [String Calculator](https://katalyst.codurance.com/string-calculator) add method, that takes input such as:

```
"1,2,3"
6
```
```
"1,2,3,4,5,6,7,8,9"
45
```

The Add method is already created for you and has some tests that work.

## Getting it working
First off, straight after cloning the repo, your code should run, and the tests should pass.

To begin the exercise, uncomment the commented out code in the main add method, this will break all your tests.

## Fixing the tests
For this you will need a stub, which we've (hopefully) just learned about

The idea is that you want to stub out the output writer, so that your tests can pass.

In a normal situation you might use something like dependency injection, but as this is just a simple project, passing your stub in through the constructor is totally fine.
