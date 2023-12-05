### Exception Handling
1) Introduction
2) Runtime Stack Mechanism
3) Default Exception Handling in Java
4) **Exception Hierarchy**
5) Customised Exception Handling by using try & catch
6) Control flow in try-catch
7) Methods to Print Exception Information
8) Try with Multiple Catch Blocks
9) Finally block
10) Difference between final, finally and finalize
11) Various Possible combinations of try-catch-finally
12) Control flow in try-catch-finally
13) Control flow in Nested try-catch-finally
14) Throw Keyword
15) Throws Keyword
16) Exception Handling Keywords Summary
17) Various Possible Compile Time Errors in Exception Handling
18) Customised or User Defined Exceptions
19) Top 10 Exceptions
20) 1.7 Version Enhancements - Try with resources - multi-catch block

**Introduction:**
- An unwanted, unexpected event that disturbs the normal flow of the program is called an exception.
- For graceful termination, it is highly recommended to write an exception-handling program.
- Defining an alternative way to continue our programming normally.
- Exception handling doesn't mean repairing an exception we have to provide an alternative way to continue rest of the 
  program normally is the concept of exception handling.
- For example, our programming requirement is to read data from a remote file located at London at run time if london file
  is not available our program should not terminate abnormally. we have to provide some local files to continue the rest of the 
  program normally. this way of defining alternatives is nothing but exception handling.

`try {
read data from a remote file located in london
}
catch(FileNotFoundException e)
{
Use local file & Continue
rest of the program normally
}`

**Runtime Stack Mechanism:**
- For every thread, JVM will create a run-time stack. every method call performed by that thread will be stored 
  in the corresponding stack.
- Each entry in the stack is called a stack frame or activation record.
- After completing every method call the corresponding entry from the stack will be removed.
- After completing all method calls the stack will become empty and the empty stack will be destroyed by JVM just before 
  terminating the thread.

`public class Main{

public static void main(String[] args) {
doStuff();
}
public static void doStuff(){
doMoreStuff();
}

public static void doMoreStuffStuff(){
System.out.println("Hello");
}
}`

 ![run time stack mechanism](/Images/run-time-stack-mechanism.png)

