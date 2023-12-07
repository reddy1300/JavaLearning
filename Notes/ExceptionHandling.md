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

`
try {
read data from a remote file located in london
}
catch(FileNotFoundException e)
{
Use local file & Continue
rest of the program normally
}
`

**Runtime Stack Mechanism:**
- For every thread, JVM will create a run-time stack. every method call performed by that thread will be stored 
  in the corresponding stack.
- Each entry in the stack is called a stack frame or activation record.
- After completing every method call the corresponding entry from the stack will be removed.
- After completing all method calls the stack will become empty and the empty stack will be destroyed by JVM just before 
  terminating the thread.

`
public class Main{
public static void main(String[] args) {
doStuff();
}
public static void doStuff(){
doMoreStuff();
}
public static void doMoreStuffStuff(){
System.out.println("Hello");
}
}
`


 ![run time stack mechanism](/Images/run-time-stack-mechanism.png)

**Default Exception Handling in JAVA:**

`
public class Main{
public static void main(String[] args) {
doStuff();
}
public static void doStuff(){
doMoreStuff();
}
public static void doMoreStuffStuff(){
System.out.println(10/0);
}
}
`

`
Exception in thread "main" java.lang.ArithmeticException: / by zero
at Main.doMoreStuff(Main.java:11)
at Main.doStuff(Main.java:7)
at Main.main(Main.java:4)
`

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
` 
Exception in thread "xxx" Name of exception: Description
 Stack trace
`

`
Exception in thread "main" java.lang.ArithmeticException: / by zero
at Main.doMoreStuff(Main.java:11)
at Main.doStuff(Main.java:7)
at Main.main(Main.java:4)
`


`
public class Main{
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
}
`

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

`
try
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

**Checked Exceptions VS Unchecked Exceptions:**
- The exceptions which are checked by compiler for smooth execution of the program are called checked exceptions.
- Ex: HallTicketMissingExceptions, PenNotWorkingException, FileNotFoundExceptions Ext
- In our program if there is a chance of raising checked exception then compulsory we should handle that checked exception.
  [Either by try-catch or throws keyword] otherwise we will get compile time error.
- The exceptions which are not checked by compiler whether the programmer handling or not such type of exceptions are called
  unchecked exceptions.
- For Ex: ArithmeticExceptions, BombBlastExceptions ext.
- **Note:** Whether it is checked or unchecked every exception occurs at run time only. There is no chance of occurring any
  exception at compile time.
- **Note:** Runtime exception and its child classes, error, and it's child classes are unchecked except these remaining are
  checked.

**Fully Checked VS Partially Checked:**
- A checked exception is said to be fully checked if and only if all it's child classes also checked.
- Ex: IOException, InterruptedException
- A checked exception is said to be partially checked if and only if some of its child classes are unchecked.
- Ex: Exception, Throwable

**Note:** The only possible partially checked exceptions in java are Exception, Throwable.

**Describe The behaviour of following exceptions:**
- IOExceptions -> Checked -> Fully Checked
- RuntimeExceptions -> Unchecked
- InterruptedException -> FullyChecked
- Error -> Unchecked
- Throwable -> Partially Checked
- ArithmeticException -> Unchecked
- NullPointerExceptions -> Unchecked
- Exception -> Partially Checked
- FileNotFoundException -> Fully Checked

**Customised Exception Handling by using try-catch:**
- It is highly recommended handling exceptions.
- The code which may rise an exception is called risky code, and we have to define that code inside try block and corresponding 
  handling code we have to define inside catch block.

`
try
{
Rusky Code
}
catch (Exception e)
{
Handling Code
}
`

`
try
{
System.out.println(10/0);
}
catch (ArithmeticException e)
{
System.out.println(10/2);
}
`
