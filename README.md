JDK - is a compiler in java like V8 compiler in nodejs for js
java 9 and above has jshell a playing ground for experimental
jvm understads byte codes
jvm is platform dependent but java is not
we can use java compiler to convert to byte code for jvm to understand (javac)
The excution first file must have main method

<!-- OOP -->
- JVM is the one that creates objects it do so from the class created by the programmer, during the compilation is when it is created.
-Static varibles are shared btw objects and can be accessed using class not object. meaning you are making it as class member not object member, it helps saving memory since the varibales become shareble across the classes
- when using constructor static variable can be initiated in static block
static
{
   "name":"";
}

- always class loads first then object initated hence static variables will always be printed first
- this used to differentaite the conflicting object field and parameter names in setters
- setter and getter helps to add more rule to avoid wrong access to the class properties