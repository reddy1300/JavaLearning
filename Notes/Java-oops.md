### Object Oriented Programming

**Java Source File Structure:**

**Class Level Modifiers:**
- Modifiers describe the behaviour of the class.
- If the class is public we can access this anywhere in the project.
- If the class is abstract object creation is not possible.
- If the class is final then child class creation is not possible.
- We can declare top level classes by using public, default, abstract, final, strictfp.
- For inner classes we can use private, protected, static.


**Abstract Modifier:**
- Abstract modifier applicable for classes and methods.

**Abstract method:**
* Abstract method which has only declaration but not implementation.
* Abstract method compulsory ends with semicolon.
* If we not sure what we have to implement then we can declare method as abstract.
* Child classes are responsible for implementation.

**Abstract Class:**
- If class implementation is not complete such type of partially implemented classes we have to declare as abstract classes.
- It's not possible to create an object for abstract class.
- If a class contain at least  one abstract method then we should declare that class as abstract.
- Even though a class doesn't contain any abstract methods  still we can declare that class as an abstract means abstract 
  class contain zero abstract methods. Ex: Adapter classes, HttpServlets.
- Even thought class doesn't contain any abstract methods still we can declare that class as an abstract one to restrict 
  object creation.
- It is child class responsibility and mandatory to implement all parent abstract methods.

**Member Modifiers: (Methods or Variables)**
- 

**Types of Inheritance:**
1) Single Inheritance 
2) Multi Level Inheritance
3) Hierarchical Inheritance [Opposite of multiple inheritance]
4) Hybrid Inheritance //Not supported
5) Multiple Inheritance //Not Supported