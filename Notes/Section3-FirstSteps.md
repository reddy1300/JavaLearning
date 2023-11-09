##### What is statement?
##### Keywords
##### Variables
##### Data Type
##### Declaration Statement
##### Expression
##### Operators
##### Naming Conventions

**Statement:** 

What is a statement?

* It's a complete command to be executed. It can include one or more expressions.
* What we've typed above, is a command to print some information to the screen, using syntax provided by the java language.
* We specified what we wanted java to print in the parenthesis and double quotes - in this case, the text "Hello World" 
  - effectively we're telling java to print out the words, as we've specified them in the quotes - "Hello World".
  
**Keywords:**  A keyword is any one of a number of reserved words, that have a predefined meaning in the java language.

* In java syntax, all code is case-sensitive, and this includes keywords. As we'll soon see, an int, all in lowercase, 
  is not the same as Int, with a capital I. Here, an int, (all in lowercase) is a keyword in java.
  Keywords - [https://docs.oracle.com//javase/specs/jls/se17/html/jls-3.html#jls-3.9](https://docs.oracle.com//javase/specs/jls/se17/html/jls-3.html#jls-3.9)

**Variables:**  Variables are a way to store information in our computer.
* Variables that we define in a program, can be **accessed by a name we give them**, and the computer does the hard work
  of figuring out where they get stored, in the computer's random access memory, or RAM.
* variable's we have to initialize only once or in the declaration statement.

**Data Type:** There are lots of different types of data, that we can define for our variables, some of which i've shown
  you in the keyword list previously.
* Collectively, these are known as data types.
* As you may have guessed, some data types are keywords in java. when we get to the Object-Oriented features of Java, you will 
  see that we have a lot of flexibility for creating our own data types, but in the next couple of videos, we'll explore
  primitive data types, which are built into the java language.

**int:** integer represent whole number means without decimal point. 
* datatype variableName = value;
* `int myFirstNumber = 5;`
* `int myFirstNumber = 5;` after this what happened behind the scenes, is that java has allocated a place in memory, to 
  store a single whole number, and set up a mechanism to allow us to access that memory location, by the name we gave it,
  in this case myFirstNumber. That's how we'll access it.
* We don't need to know where computer stores it in memory because we don't use memory location to use or retrieve data 
  we use variable name to access data.

**Declaration Statement:**
* **`int myFirstNumber = 5;`** A declaration statement is used to define a variable by indicating the data type, and the 
  name, then optionally to set the variable to a specific value.
* Assigning a value in this statement(or initialization) is optional here; in other words, we could've omitted the equals
  five. With java, in general, variables have to be initialized before being used.

**Expressions:** An expression is a coding construct, that evaluates to a single value.

* `System.out.print("myFirstNumber");` will not give desired results. because whatever we included in double quotes it's 
  called **string literal**. 
* Now literal unlike a variable, cannot be changed - a literal is the simplest form of an expression, and not a variable.
* To print we have to use `System.out.print(myFirstNumber);` without using quotes.

**Re-assign:** To re-assign a value to a variable that already declared we don't have to use data type. So it will set 
  the value in that memory, changing it from 5 to 10.
* `myFirstNumber = 10;`
* `System.out.print(myFirstNumber);`  will give output as 10. 

**Variable Declarations in Jshell:** By declaring a variable again, we are effectively re-declaring a variable, and in 
  normal java programming, that would not be allowed, and would throw an error.

* Due to its interactive nature, Jshell "holds our hand", and allows the declaration to occur without throwing error.
* Knowing that re-declaring a variable for a second, or subsequent time, is not allowed.


**Operators:** Java operators, or just operators. perform an operation (hence the term) on a variable or value.
- Addition, Division, Multiplication, Subtraction etc.

**Starting out with Expression:**

* The expression is the code segment that is on the right side of the equal sign in an assignment or declaration statement.
* This code can be a simple literal value, like the number 5, or it can be a complex mathematical equation using multiple
  literal values and mathematical operators.

- `int myFirstNumber = (10 + 5) + (2 * 10);`
- `int mySecondNumber = 12;`
- `int myThirdNumber = 6;`
- `int myTotal = myFirstNumber + mySecondNumber + myThirdNumber;`

**Java code is case-sensitive:**

* Java code is case-sensitive.
* This includes not only keywords and language syntax, but variable names and data types as well.
* Keywords need to be in lowercase.

**Java Name Conventions:**

- In Java, there are conventions and naming rules to follow when writing keywords, methods, class names, and package names.
Adhering to these conventions improves code readability and makes your code more consistent with Java coding standards. 
Here are some common naming conventions:

**Packages:**

- Package names are written in all lowercase letters.
- Use reverse domain notation for package names to ensure uniqueness (e.g., com.example.myproject).

**Classes:**

- Class names should start with an uppercase letter and follow camelCase (e.g., MyClass, PersonDetails).

**Interfaces:**

- Interface names should also start with an uppercase letter and follow camelCase (e.g., MyInterface, Runnable).

**Methods:**

- Method names should start with a lowercase letter and follow camelCase (e.g., calculateTotal, getUserDetails()).

**Variables:**

- Variable names should start with a lowercase letter and follow camelCase (e.g., myVariable, totalCount).

**Constants:**

- Constant names should be written in uppercase letters with underscores separating words (e.g., MAX_VALUE, PI_VALUE).

**Keywords:**

- Java keywords are reserved and must be written in lowercase (e.g., int, public, class).

**Primitive Types:**

* In Java, primitive types are the most basic data types.
* The eight primitive data types in java are shown in the table below, listed by the type of data stored for each:

  ![Java primitive types](/Images/javaprimitivetypes.png)


  

