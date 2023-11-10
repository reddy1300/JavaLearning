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

  ![Java primitive types](/Images/java_primitive_types.png)
* Consider these types as the building blocks of data manipulation.
* Primitive data types are simply placeholders in memory for a value.

**Integer:** Integer is a whole number, meaning it doesn't contain a fractional element. or decimal element.
* There's a specified range of values allowed for the **int**, which is true for most data types.
* What this means is, that the allowable range of values is NOT infinite.
* There's a defined minimum, and maximum value, for each numeric data type, meaning you can't assign a number bigger or 
  smaller (outside that range).

**Get Primitive data type ranges:**

**Using the + sign in System.out.print:** The + sign when used in System.out.print will print different data types 
  together as a single line os text.

- `int myMinIntValue = Integer.MIN_VALUE;`   This will give us that the minimum value you can assign to an int, is 
  **-2147483648**. we can't assign less than this value to integer data type.
- `System.out.print("Integer Minimum Value" + myMinIntValue);` - Here we are printing a label before numeric integer value.
- Whatever follows the plus sign in **System.ot.print** here, is converted to a **String** by java, and concatenated to the 
  **String** before it.
- `System.out.print("Integer Minimum Value" + Integer.MIN_VALUE);`

- `int myMinIntValue = Integer.MAX_VALUE;`   This will give us that the maximum value you can assign to an int, is
  **-2147483648**. we can't assign less than this value to integer data type.
- `System.out.print("Integer value range(" + Integer.MIN_VALUE + " to " +  Integer.MIN_VALUE + ")" );`


### Classes:

**What is a class:** A class is a building block for object-oriented programming, and allows us to build custom data types.

### Wrapper Classes: 

* java uses the concept of a wrapper class, for all of its eight primitive data types.
* A wrapper class provides simple operations, as well as some basic information about the primitive data type, which 
  cannot be stored on the primitive itself.
* We saw that MIN_VALUE, and MAX_VALUE, are elements of this basic information, for the int data type.

- The wrapper clasess for char and int, Character and Integer respectively, are the only two that differ in name.

  ![Wrapper Classes](/Images/primitive_data_type_wrapper_classes.png)

**Overflow and Underflow:**
- Wrapper Classes gives us ways to perform operations on Primitive data type.
- If we try and put a value larger than the maximum value into an int, you'll create something called an Overflow situation.
- Similarly, if we try and put a value smaller than the minimum value into an int, you'll create something called an 
  Underflow situation.
- **These situations are also known as integer wraparounds.**
- The Maximum value, when it overflows, wraps around to the minimum value, and just continues processing without an error.
- The Minimum value, when it Underflows, wraps around to the maximum value, and just continues processing without an error.
- ### Note: This is not usually behaviour you really want, and as a developer, you need to be aware that this can happen,
   and choose the appropriate data type.
- `System.out.print(myMaxIntValue + 1);` output - -2147483648. is add one to the maximum value, which technically 
  shouldn't possible, because myMaxIntValue already contains the maximum value of an integer.
- a negative number? This is called an Overflow - meaning, we tried to put too large a number into the space allocated 
  by the computer for an integer, Now it didn't fit, but the computer tried to fit it anyway (Instead of throwing an error)
  and by doing that, it overflowed.
- The reverse is also true meaning if we tried to subtract from a int minimum value. This concept is called Underflow.
- So `System.out.print(myMinIntValue - 1);` output - +2147483647.


**When will you get an Overflow? When will you get an error?**

* int myMaxIntValue = +2147483648; throw an error like integer number is too large.
* An integer wraparound event, either an overflow or underflow, can occur in java when you are using expression that are
  not a simple literal value.
* The Java compiler does,t attempt to evaluate the expression to determine its value, so it DOES NOT give an error.
* `int willThisCompile = (Integer.MAX_VALUE + 1);`
* `int willThisCompile = (2147483647 + 1);`
* Even though we are using numeric literals in the expression, the compiler still won't try to evaluate this expression, 
  and the code will compile, resulting in an overflow condition.

**What does an underscore mean in a numeric literal?**
* In java, you cannot put commas in a numeric literal.
* For example, the following is not a valid syntax.
* `int myMaxIntTest = 2,147,483,647;`
* So java provided an alternative way to improve readability, the underscore.
* `int myMaxIntTest = 2_147_483_647;` 
* we can put the underscore anywhere we might want a comma, but we can't use an underscore at the start or end of the 
  numeric literal.

**byte, short, int, long:**
* these are the four primitive data types to store whole numbers.

  ![java primitive data types to store whole numbers](/Images/java_primitive_data_types_for_whole_numbers.png)
* The byte supports the smallest range and the long supports the largest range.

**The byte data type:**
- `System.out.print("Integer value range(" + Byte.MIN_VALUE + " to " +  Byte.MIN_VALUE + ")" );`
* The minimum value of a byte is -128.
* The maximum value of a byte is 127.
* Given its small range, you probably won't be using the byte data type a lot.
* May be one reason to use a byte is, if you had a requirement to store a lot of numbers that are within that range, and
  ypu want to save memory or try to boost performance.
* A smaller data type takes up less space, and can be quicker to access.
* Generally this is less of a concern today, because of speed of modern computers, but certainly was a factor when java 
  was first created.
* Another reason to use byte instead of int, is if you wanted to document that you are only expecting, or using, a small
  range of values.

**The short data type:**
- `System.out.print("Integer value range(" + Integer.MIN_VALUE + " to " +  Integer.MIN_VALUE + ")" );`
* The minimum value of a short is -32768.
* The maximum value of a short is +32767.
* Both the byte and short, have the same overflow and underflow issue as the int data type has, but obviously with their
  own range of numbers.

**Size of Primitive types and Width:**

  ![size of primitive types and width](/Images/size_of_primitive_data_types_and_width.png)

* A byte can store 256 numbers and occupies eight bits, and has a width of 8. 
* A short can store a large range of numbers and occupies 16 bits, and has a width of 8.
* An int, has a much large range as we know, and occupies 32 bits, and has a width of 32.

**The long data type:**

**Using a numeric literal character suffix:**
* The number 100, by default, is an int.
* Java allows certain numeric literals to have s suffix appended to the value, to force it to be a different data type 
  from the default type.
* The long is one if these types, and it's suffix is an 'L'.
* This is one of the few instances java is not case-sensitive, a lowercase 'l' or an uppercase 'L' at the end of a whole
  number mean the same thing - the number is a long.
* `long myLongValue = 100L;`
* To check the width of a data type we can use Long.size;
* `long bigLongLiteralValue = 1_147_483_647;` - will work fine without an error. because long can store higher values so
  java automatically converts to int max number to long.
* `long bigLongLiteralValue = 1_147_483_647_888;` - will throw error integer number too large when we not give suffix 'l'
  or 'L'. Because without suffix java still treating number as an int due to default java data type is int.

**When is L required?**
* Aq numeric literal that exceeds Integer.MAX_VALUE must use the 'L' suffix.
* We cannot create a numeric literal in java, that exceeds Integer.MAX_VALUE, without using the 'L' suffix, we'll always 
  get the error 'integer number too large'.

**Casting:** Which is a way to get java to treat a variable of one type like a different data type.

**Valid Syntax :** 
* short myMinShortValue = Short.MIN_VALUE; int myMinIntValue = Integer.MIN_VALUE; - Print output in two different lines.
* byte myMinByteValue = Byte.MIN_VALUE, myMaxByteValue = Byte.MAX_VALUE; - print two variables with values in two lines.

**Rules for declaring multiple variables in one statement:**
* we cannot declare variables with different data types in a single statement.
* if we declare multiple variables  of the same data type in a single statement, you must specify the data type only 
  once before any variable names.


- `int myTotal = (myMinIntValue /2);` - output: -1073741824
- `byte myNewByteValue = (myMinByteValue / 2);` - ouput: incompatible types possible lossy conversion from int to byte.

**Assigning expression to variables with data types that don't match:**
* The java compiler does not attempt to evaluate the value, in a variable, when it's used in a calculation, so it doesn't
  know if the value fits, and throws an error.
* `byte myNewByteValue = (myMinByteValue / 2);`
* If our calculation uses literal values, java can figure out the end result at compile time, and whether it fits into 
  the variable, and won't throw an error if it does.
* `byte myNewByteValue = (-128 / 2);`
* In both examples, an int result being returned from the calculation, but in the second example, java knows the returned 
  value can fit into a byte.

**So how do we let java know it fit:**

* **Casting in Java:** Casting means to treat or convert a number, from one type to another. we put the type we want the
  number to be, in parentheses like this:
* `(byte) (myMinByteValue / 2);'
* Other languages also support casting it is general thing in all languages.
* `byte myNewByteValue = (byte) (myMinByteValue / 2);`

**Float and Double:**

* Unlike whole numbers, floating-point numbers have fractional parts that we express with a decimal point.
* Floating point numbers(float & double) are also known as real numbers.
* We use a floating-point number when we need more precision in calculations.
* The double is the java's default type for any decimal or real number.

**Single and Double Precision:**
* Precision refers to the format and amount of space occupied by the relevant type.
* This table shows the width of each of the floating point types and their ranges.

  ![float and double precision](/Images/Primitiva_data_types_Float_and_Double_Precision.png)

* The double data type can be specified as a numeric literal with a suffix of either lowercase 'd', or uppercase 'D', but
  because doubles are the default in java, the suffix is optional to use.
* On the other hand, the float data type can be specified as a numeric literal with a suffix of lowercase 'f', or uppercase
  'F'. This suffix is required if you are assigning a real number to a variable that was declared with a float type.
* `float myFloatValue = 5.25;` - output: possible lossy conversion from double to float. because java default for real numbers
  is double. so we have to use casting.
* `float myFloatValue = (float) 5.25;`


**Why is the double a better choice in most circumstances?**
* First, it's actually faster to process on many modern computers.
* That's because computers have, at chi-p level, the functionality to actually deal with these double numbers faster than
  the equivalent float.
* Second, the java libraries that we'll get into later in the course, particularly math functions, and are often written
  to process doubles and not floats, and to return the result as a double.
* The creators of java selected the double because it's more precise, and can handle a large range of numbers.

**Precise Calculations:**
* In general, float and double are great for general floating point operations.
* But neither should be used when precise calculations are required - this is due to a limitation with how floating point
  numbers are stored, and not a java problem as such.
* Java has a class called **BigDecimal** that overcomes this.

**Single Precision:**
* In Java, single precision is represented by the float data type.
* It is a 32-bit floating-point number.
* It provides approximately 7 decimal digits of precision

**Double Precision:**
* In Java, double precision is represented by the double data type.
* It is a 64-bit floating-point number.
* It provides approximately 15 decimal digits of precision.

**Character:**

  ![String and char comparison](/Images/String_and_char_comparision.png)

**Is there a good use for the char data type in today's computing world:**
* Why would we want to use a variable that only allows you to store one character?
* One example might be to store the last key pressed by a user in a game.
* Another example might be to loop programmatically through the letters in an alphabet.
* A char occupies two bytes of memory, or 16 bits, and thus has a width of 16.
* The reason it's not just a single byte, is that a char is stored as a 2 byte number, similar to the short.

**This number gets mapped to a single character by java:**
* So, when you print a char, you will see the mapped character, and not the representative number.
* And you can use single quotes and a character literal to assign a value to a char, which is much simpler than looking
  up the representative number.
* If this mapping not done by java, we have to go and look up the value in some lookup table, each time we want to set or
  get a char.
* Some instances, characters aren't represented on the keyboard, or you may have reason to use special characters in other
  languages. To do this, java supports a unicode value for characters, which you can use to set a char value.

**Unicode:** 
- Unicode is an international encoding standard for use with different languages and scripts by which each letter, digit,
  or symbol is assigned a unique numeric value that applies across different platforms and programs.
- In english alphabet, we've got the letters A through Z, meaning only 26 characters are needed in total to represent the
  entire English Alphabet.
- But other languages need more characters, and often a lot more. Unicode allows us to represent these languages.
- The way it works, is that by using a combination of the two bytes that a char takes up in memory. it can represent any
  one of 65,535 different types of characters.
- [https://symbl.cc/en/unicode/table/](https://symbl.cc/en/unicode/table/)
- `char myUnicode = '\u0044';` represent D. or `char myUnicode = 68;`
- any literal we can form by using **Literal, Unicode, or Decimal**.

**Boolean Primitive Type:**
* A boolean value allows for two opposite choices, true or false, yes or no, one or zero.
* For boolean we can set to two values only either true or false.

**Why would you start your boolean variable name with the prefix 'is'?**

* Developers will often use the word, is as a prefix for a boolean variable name.
* This creates a name that seems to ask a question, which makes reading the code more intuitive.
* But other prefixes can be just as valid.

Boolean variable name examples:
- isCustomerOverTwentyOne
- isEligibleForDiscount
- hasValidLicense
- hasChildren


**So what is a string?**
* A String is a class that contains a sequence of characters.
* A String is very much like a primitive type in terms of how we use it, meaning we can just assign a String literal to 
  a variable.
* `String sample = "This is a String";`
* **String Concatenation:** 
* In java, the + symbol is an operator which can mean addition, if used for numbers.
* But it also means concatenation when applied to a String.
* A String + anything else, gives us a String as a result, concatenating anything after the String as text to the initial 
  String.
* String class is different compare to other classes. because String are **Immutable**.
* Immutable means that you can't change a String after it's created.
* `lastString = lastString + myInt;` in the case of the code we've written, the value 120.47 is technically not appended
  to the current contents of lastString.
* Instead, a new String is created automatically by java. The new String consists of the previous value of **lastString**
  plus a textual representation of the double value 120.47
* The net result, is that our variable, **lastString**, has the concatenated value. However, Java created a new String in the 
  process, and the old one will get discarded from memory automatically.
* This is quite inefficient. Because a new String gets created for every operation appending values like this is inefficient
  and generally not recommended.
* So Java provides another class that is more efficient if you are doing a lot of appending of multiple string or values.

**String vs StringBuilder:**
* The String class is immutable, but can be used much like a primitive data type.
* The StringBuilder class is mutable, but does not share the String's special features, such as being able to assign it 
  a String literal ot use the + operator on it.
* Both are classes, but the String is in a special category in the java language.

**Operators, Operands and Expression:**

**So what are operators?**
- Operators in java are special symbols that perform specific operations on one, two, or three operands, and then return
  a result.

**So what is an Operand?**
- An operand is a term used to describe any object that is manipulated by an operator.
- Variable names used instead of values are also called operands.

**The + Operator on char:**
- When you use the plus operator with chars, it is these numbers in memory that get added together.
- The characters values don't get concatenated.
- `char firstChar = 'A'; char secondChar = 'B';`
- `System.out.print(firstChar + secondChar');` output: 131

**Incrementing by One:**

  ![Increment by One](/Images/Increment_by_one.png)
  
**- Compound assignments neglect possible error like `int result = 10; result -= 5.5` output: 4
- But when we use `int result = result - 5.5;` - output: possible lossy conversion. because result is an int type.
- So have to use type conversion `int result = (int) result - 5.5;`**
