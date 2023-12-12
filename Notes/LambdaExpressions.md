### Lambda Expressions

- Introduced in Java 1.8
- The main objective of introducing lambda expressions in java is to bring functional programming features in java.
- Java is a OOP language which generally doesn't support functional features. So to bring functional programming features 
  in java lambda expressions are introduced.
- In OOP the data will be stored and maintained in the form of classes and Objects. 
- When we come to functional programming the data will be stored and maintained in the form of functions and variables.
- The other main objective is code optimisation or concise code.

**Lambda Expression:**
- Lambda expression is an anonymous function[ Which also called Name less function]. means it doesn't have method name, 
  return type and access modifier.

**Normal Method:**
`
public void m1()
{
System.out.println("Welcome");
}
`
**Lambda Method:**
`
( ) ->
{
System.out.println("Welcome");
}
`
- If we have only one statement to execute this we can specify in a more concise way by removing curly braces.
`
  public static void m1(int a, int b)
  {
  System.out.println(a + b);
  }
`

`(int a, int b) -> System.out.println(a + b);`

- in Lambda expression we don't need to specify in runtime java compiler will automatically find the type of variables 
  based on context.
- `(a, b) -> System.out.println(a + b);`
 
**Return:**
`
public int m1(int a)
{
return a * a;
}
`
- `(int a) -> {return (a * a)}`
- `(a) -> a * a;`
- `a -> a * a;`
- If we have single parameters we don't need parenthesis also.
- If we have to include curly braces then only we need to include return statement otherwise we don't need to write return.
- n -> return n * n;   -- wrong due to not included curly braces when we are using return.
- n -> {return n * n;}; -- correct
- n -> {return n * n}; -- In-correct due to not included semi-colon.
- n -> {n * n;};   -- wrong no need of curly braces when we are not using return.
- n -> n * n;      -- correct

**Functional Interface:**

- lambda expression can only be invoked through functional interface.
- Once we write lambda expression to invoke this lambda expression we need to know the functional interface concept.
- If any interface contain only one abstract method that is called as functional interface.[ Single abstract method]
- If any interface contain more than one abstract method then it is not called a functional interface.
- From java 1.7 onwards in interface we can define 
1) Abstract Methods
2) Default Methods
3) Static Methods.
- Functional interface should only contain one abstract method. But can contain any number of Default and Static methods.

**Few Ex of Default functional interfaces:**
- Runnable Interface - contain only one abstract method run();
- Callable Interface - contain only one abstract method call();
- Comparable Interface - contain only one abstract method CompareTo();
- Action Listener Interface - contain only one abstract method actionPerformed();
- If we want to explicitly say this is an functional interface Then we can use @FunctionalInterface annotation introduced 
  in  1.7 version. This will not allow another abstract method.

**Pre-defined functional interfaces:**(1.8 version)
Present in java.util.Function
1) Predicate
2) Function
3) Consumer
4) Supplier

**Predicate:**
- Contain one abstract method test();
- It will take one argument (Which may be primitive or Object) and returns boolean.
- We can use only if we have  conditional checks in our program.
- 