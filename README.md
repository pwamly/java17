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
- this the current object calling another class etc
- every contstructor in java has super method
- every super class in java extends object
- this method excute constructor of same class
- folders are called packages
- java deos not support mult level ineheritance due to ambiguity
- by default all java class imports java.lang* by default
- note * means files not folders
- when sharing packages to the world you need to make it unique so normally reverse the domains name 
- if property is in another package, you need to make it public. public can be accessed anywhere.
- private can be used within same class regardless of packages