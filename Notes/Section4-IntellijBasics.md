### Intellij Basics

**Why do we need an Integrated Development Environment(IDE)?**

An IDE is the easiest, least error-prone way to develop, manage and deploy java classes. it provides many benefits to 
developers, including
- Increase Productivity,
- Code completion,
- Refactoring of code,
- Debugging Tools,
- Version Control

* The main feature is a text editor, that we type our code into. But an IDE also compiles and runs our programs for us. 
  And it also warns us about errors in our code, before we run it.

- .idea folder has IntelliJ Idea's working files. and this IML file.

- `public class FirstClass {
  public static void main(String[] args) {
  System.out.println("Hello World!");
  }
  }`

**Access Modifier:**
- The **public** java keyword is what's called an **access modifier**.
- An access modifier allows us to define which parts of our code, or even someone else's code, can access a particular 
  element.

**Class Keyword:**
- The **class** keyword is used to define a class. The class name will be the next following the keyword, so FirstName 
  in thi case.
- Left and Right curly braces, they are used to define the class code block, or class body.
- within a class we can have data, and code.

**What is a Method:**
- A method is a collection of statements, one or more, that perform an action.
- We'll be using a special method called the main method, that java looks for when running a program.
- It's the entry point for any java code, and java looks for the main method to start and run the program when we use it.
- we can also create our own methods.

**If-then Statement:**
* the if-then statement is the most basic of all the control flow statements. It tells your program to execute a certain
  section of code, only if a particular tests evaluates to true.
* This is known as conditional logic.

**Conditional Logic:**
Conditional logic uses specific statements in java to allow us to check a condition, and execute certain code based on
whether condition (the expression) is true or false.
 - `boolean isAlien = false;
   if (isAlien == false) System.out.println("It is not an alien!");`
 - = is an assigning operator
 - == Equality operator

**The Code Block:** A code block allows more than one statement to be executed, in other words, a block of code.
`if (expression) {
//put one or more statements here
}`

**Logical AND Operator:**
`boolean hasLicense = true;
 int isHavingRequiredAge = 21;
if (hasLicense && isHavingRequiredAge >= 18){
System.out.println("You can drive");
}`

**The Logical AND operator and the Logical OR operator:**
- The and operator comes in two flavours in java, as does the or operator.
- && is the Logical and which operates on boolean operands - Checking if a given condition is true or false.
- Then & is a bitwise operator working at the bit level. This is an advanced concept that we won't get into here.
- Likewise, || is the logical or, and it operates on boolean operands to check if a given condition is true or false.
- Then | is a bitwise operator, which also working at the bit level.
- we are not using bitwise operators much we almost use logical operators.

**Ternary Operator:** (Condition ? Operator1 : Operator2)
- The ternary operator - Java officially calls it the Conditional Operator - has three operands, the only operator currently
  in java that does have three.
- Structure: operand1 ? operand2 : operand3
- operand1 is a condition if this is true it will return operand2 otherwise it will return operand3.
- `int age = 18;
   String eligibleForVote = age >= 18 ? "eligible for voting" : "not eligible for voting"; `

**Operator Precedence:**