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
- For graceful termination, it is highly recommended writing an exception-handling program.
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

**Default Exception Handling in JAVA:**

`public class Main{
public static void main(String[] args) {
doStuff();
}
public static void doStuff(){
doMoreStuff();
}
public static void doMoreStuffStuff(){
System.out.println(10/0);
}
}`

`Exception in thread "main" java.lang.ArithmeticException: / by zero
at Main.doMoreStuff(Main.java:11)
at Main.doStuff(Main.java:7)
at Main.main(Main.java:4)`

- Inside a method if any exception occurs the method in which it is raised is responsible to create an exception object
  by including the following information.
1) Name of Exception 
2) Description of Exception
3) Location at which exception occurs[Stack Trace]
- After creating an exception object method hand-overs that object to the JVM. JVM will check whether the method contains
  any exception handling code or not.
- If the method does not contain exception handling code then JVM terminates that method abnormally and removes corresponding 
  entry from stack.
- Then JVM identifies caller method and checks whether caller method contain any handling code ot not. If the caller method
  doesn't contain handler code then JVM terminates that caller method also abnormally and removes corresponding entry from the stack.
- This process will be continued until main method and if the main method also doesn't contain handling code then JVM terminates
  main method also abnormally and removes corresponding entry from the stack.
- Then JVM hand-overs responsibility of exception handling to default exception handler, which is the part of JVM.
- Default Exception Handler prints exception information in the following format and terminates program abnormally.
` Exception in thread "xxx" Name of exception: Description
 Stack trace`

`Exception in thread "main" java.lang.ArithmeticException: / by zero
at Main.doMoreStuff(Main.java:11)
at Main.doStuff(Main.java:7)
at Main.main(Main.java:4)`


`public class Main{
public static void main(String[] args) {
doStuff();
}
public static void doStuff(){
doMoreStuff();
System.out.println(10/0);
}
public static void doMoreStuffStuff(){
System.out.println("Hello");
}
}`

o/p: Hello
Exception in thread "main" java.lang.ArithmeticException: / by zero
at Main.doStuff(Main.java:7)
at Main.main(Main.java:4)

**Note:** In a program if at-least one method terminates abnormally then the program termination is abnormal termination.
If all methods terminates normally then only program termination is normal termination.

**Exception Hierarchy:**
- Throwable class acts as root for java exception hierarchy.
- Throwable class defines two child classes
1) Exception 
2) Error

**Exception:**
- Most of the time exceptions are caused by our program and these are recoverable.
- For ex if our programming requirement is to read data from remote file locating at london. at run time if remote file is
  not available then we will get run time exception saying FileNotFoundException.
- If FileNotFoundException occurs we can provide local file and continue rest of the program normally.

`try
{
Read data from remote file locating at london
}
catch (FileNotFoundException e)
{
use local file and continue
rest of the program normally    
}
`

**Error:**
- Most of the time errors are not caused by our program and these are due to lack of system resources.
- Errors are non recoverable.
- For ex if OutOfMemoryError occurs being a programmer we can't do anything and the program will be terminated abnormally.
- System admin or server admin is responsible to increase heap memory.

  ![exception hierarchy](/Images/exception-hierarchy.png)