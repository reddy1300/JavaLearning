**Expressions, Statements , Code Blocks, and Methods**

**Keywords and Expressions:** Java have 51 reserved and 16 contextual (which we use in specific use cases) keywords that
have a predefined meaning.

- Other than these keywords' java reserved true, false, and null these are literals not reserved keywords.

**Java's Code Units:**

Writing code too similar to writing a document. it consists of special hierarchical, which together form a whole.
- **Expression:** An expression computes to a single value.
- **Statement:** Statements are stand-alone units of work.
- **Code Blocks:** A code block is a set of zero, one, or more statements, usually grouped together in some way to achieve
  a single goal.

**Statements, White spaces and Indentation:**

Whitespaces: 
- Whitespace is any extra spacing, horizontally or vertically, placed around java source code.
- it's usually added for human readability purposes.
- In java, all these extra spaces are ignored.
- Indentation is not mandatory, but we can use for readability.

### Methods:
- Methods in java give us a kind of way to write code once, and the reuse that code anywhere in our program.
- A method declares executable code that can be invoked, passing a fixed number of values as arguments.

**Benefits of the Method:**
- A method is a way of reducing code duplication.
- A method can be executed many times with potentially different results, by passing data to the method in the form of 
  arguments.
- To execute a method, we can write a statement code, which we say is calling, or invoking, the method.
- `calculateScore();`

**Parameters and Arguments:**
* Parameters and Arguments are the terms that are often used interchangeably by developers.
* But technically, a parameter is the definition as shown in the method declaration, and the argument will be the value 
  that's passed to the method when we call it.
* To execute a method that's defined with parameters, you have to pass variables, values, or expressions that match the 
  type, order and number of parameters declared.
* In method whenever we pass arguments' java automatically creates' variables with these parameters names with specified 
  data type whenever we execute method.

**Method structures with parameters and return type:**
- ` public static dataType methodName(p1type p1, p2type p2){
 // Method statements
  return value;
}`
- So, similar to declaring a variable with a type, we can declare a method to have a type.
- This declared type is placed just before the method name.
- In addition, a return statement is required in the code block, as shown on the slide, which return the result from the
  method.

**The return statement:**
- Java states that a return statement returns control to the invoker of a method.
- The most common usage of the return statement, is to return a value back from a method.
- In a method that doesn't return anything, in other words a method declared with void as the return type, a return statement
  not required.
- But in methods that do return data, a return statement with a value is required.

**What are Functions and Procedure?**
- Some programming languages will call a method that returns a value, a function, and a method that doesn't return a 
  value, a procedure.
- we will often hear function and method used interchangeably in java.
- The term procedure is somewhat less common, when applied to java methods, but you may still hear a method with void return 
  type, called procedure.
- From method, the return type can be any primitive data type or class.
- If return statement is defined, the code block must use at least one return statement, returning a value, of the declared
  type or comparable type.

**The Method Signature:**
- A method is uniquely defined in a class by its name, and the number and type of parameters that are declared for it.
- This is called the method signature.
- We can have multiple methods with the same method name, as long as the method signature (meaning the parameters declared)
  are different.[Overloading]
- This will become important later in this section, when we cover overloaded methods.

**Default values for Parameters:**
- In many languages, methods can be defined with default values, and you can omit passing values for these when calling 
  the method.
- But java doesn't support default values for parameters.
- There are work-around for this limitations, and we'll be reviewing those at a later date.

**Method Overloading:**
- Method overloading occurs when a class has multiple methods, with the same name, but the methods are declared with 
  different parameters.
- So we can execute a method with one name, but call it with different arguments.
- Java can resolve which method it needs to execute,based on the arguments being passes, when the method is invoked.
- To overload method signature should be unique.

**More on Method Signatures:** A method signature consists of the name of the method, and the uniqueness of the declaration
of its parameters.
- In other words, a signature is unique, not just by the method name, but in combination with the number of parameters,
  the types, and the order  in which they are declared.
- A method's return type is not part of the signature.
- A parameter name is also not part of the method signature.
- The type, order, and number of parameters, in conjunction with th name, make method signature is unique.
- A unique method signature is the key for the java compiler, to determine if a method is overloaded correctly.