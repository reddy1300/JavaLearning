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

**Control Flow in Try-Catch:** 
`
try
{
Statement1;
Statement2;
Statement3;
}
catch (X e)
{
Statement4;
}
Statement5;
`

**Case1:** If there is no exception 1, 2, 3, 5 Normal Termination.
**Case2:** If an exception raised at Statement 2 and corresponding catch block is matched  1, 4, 5 Normal Termination.
**Case3:** If an exception raised at Statement 2 and corresponding catch block is not matched  1 Abnormal Termination.
**Case4:** If an exception raised at Statement 4 or 5 then it always Abnormal Termination.

**Note:**
- Within the try block if anywhere exception raised then rest of the try block won't be executed even though we handled 
  that exception. Hence, within the try block we have to take only risky code and length of try block should be as less as possible.
- In addition to try block there may be a chance of raising an exception in catch and finally blocks.
- If any statement which is not part of try block and raises an exception then it is always an abnormal termination.

**Methods to Print Exception Information:**

- Throwable class defines the following methods to print exception information.
1) printStackTrace(); -- Name of exception: Description  Stack trace
2) toString();        -- Name of exception: Description
3) getMessage();      -- Description

- Internally default exception handler use printStackTrace(); method to print exception information to the console.
`
try
{
System.out.println(10/0);
}
catch (ArithmeticException e)
{
e.printStackTrace(); // Name of exception: Description  Stack trace
System.out.println(e); // Name of exception: Description
System.out.println(e.toString()); // Name of exception: Description
System.out.println(e.getMessage()); //Description
}
`

`
java.lang.ArithmeticException: / by zero
at Main.main(Main.java:6)
java.lang.ArithmeticException: / by zero
java.lang.ArithmeticException: / by zero
/ by zero
`

**Try with Multiple catch blocks:**
- The way of handling an exception is varied from exception to exception. Hence, for every exception type it is highly 
  recommended taking separate catch block that is try with multiple catch blocks is always possible and recommended to use.
- It is not a good practice to use single catch block for different types of exception.
`
  try
  {
  Risky Code
  }
  catch (ArithmeticException e)
  {
  Perform alternative arithmetic operation
  }
  catch (SQLException e)
  {
  Use MySql db instead of Oracle DB
  }
  catch (FileNotFoundException e)
  {
  Use local file instead of remote file
  }
  catch (Exception e)
  {
  Default exception handling code
  }
`

- If try with multiple catch blocks present then the order of catch blocks is important. we have to take child first and
  then parent. Otherwise, we will get compile time error saying java: exception xxx(Ex-java.lang.ArithmeticException) has 
  already been caught.
`
  try
  {
  System.out.println(10/0);
  }
  catch (Exception e)
  {
  System.out.println("exception");
  }
  catch (ArithmeticException e)
  {
  System.out.println("exception");
  }
`

- We can't declare two catch blocks for the same exception. Otherwise, we will get compile time error.
`
  try
  {
  System.out.println(10/0);
  }
  catch (ArithmeticException e)
  {
  System.out.println("exception");
  }
  catch (ArithmeticException e)
  {
  System.out.println("exception");
  }
`

**Final:**
- final is a modifier applicable for classes, methods and variables.
- If a class is declared as final, then we can't extend that class. That is we can't create child class for that class.
  That is inheritance is not possible for final classes.
- If a method is final then we can't override that method in the child class.
- If a variable declared as final, then we can't perform are-assignment for that variable.

**Finally:**
- Finally, is a block always is associated with try-catch to maintain clean-up code.
`
  try
  {
  Risky code
  }
  catch (ArithmeticException e)
  {
  Handling Code
  }
  finally {
  Clean-up code

}
`
- The speciality of finally block is it will always be executed irrespective of whether exception raised or not and whether 
  handled or not.

**Finalize():**
- finalize is a method always invoked by Garbage Collector just before destroying an object to perform clean-up activities.
- Once finalize method completes immediately GC destroys that object.

**Note:** Finally block is responsible to perform clean up activities related to try block. that is what ever resources 
  we opened as the part of try block will be closed inside finally block.
- Whereas finalized method is responsible to perform clean-up activities related to object. That is whatever resources 
  associated with object will be de-allocated before destroying an object by using finalize method.

**Various possible combinations of try-catch-finally:**
- In try-catch-finally order is important.
- Whenever we are writing try compulsory we should write either catch or finally.Otherwise, we will get compile time error.
  That is try without catch or finally is invalid.
- Whenever we are writing catch block compulsory try block must be required. That is catch without try is invalid.
- Whenever we are writing finally block compulsory we should write try block. That is finally without try is invalid.
- Inside try, catch and finally block we can declare try catch finally blocks. That is nesting of try, catch, finally is allowed.
- For try, catch, finally block curly braces are mandatory.

**Throw Keyword or statement or clause:**
- Sometimes we can create exception object explicitly and handover to the JVM manually. for this we have to use throw keyword.
- Hence, the main objective of throw keyword is to hand over our created exception object to the JVM manually.
- Hence, the result of following two programs are same.
- The resultant exception output is same in both default exception and throw exception. there is no difference but default 
  exception happen internally but by using throw we are handling exception explicitly and hand over to JVM.

`
public static void main(String[] args)  {
System.out.println(10/0);
}
O/P:Exception in thread "main" java.lang.ArithmeticException: / by zero
at Main.main(Main.java:4)
`
- In this case main method is responsible to create exception object and hand over to the JVM.

`
public static void main(String[] args)  {
throw new ArithmeticException("/ by zero");
//new ArithmeticException("/ by zero"); - Creation of ArithmeticException Object manually
//throw - Hand-over our created exception object to the JVM manually.
}
`
- In this case programmer creating exception object explicitly and hand over to the JVM manually.

**Note:** Best use of throw keyword is for User defined exception and Customised exceptions.
**Case1:** 
`
public class Main{
static ArithmeticException e;
public static void main(String[] args) {
throw e;
}
}
O/P:Exception in thread "main" java.lang.NullPointerException: Cannot throw exception because "Main.e" is null
at Main.main(Main.java:4)
`
- `throw e;`  if e refers null then we will get NullPointerException

`
public class Main{
static ArithmeticException e = new ArithmeticException();
public static void main(String[] args) {
throw e;
}
}
`
- `throw e;` In this case we will get ArithmeticException.

**Case2:**
`
public class Main{
    public static void main(String[] args) {
        throw new ArithmeticException();
        System.out.println("Hello");
    }
}
O/P: java: unreachable statement
`
- After throw statement we are not allowed to write any statement directly otherwise we will get compile time saying 
  unreachable statement.

`
public class Main{
public static void main(String[] args) {
System.out.println(10/0);
System.out.println("Hello");
}
}
O/P: RE: AE: / by zero.
`

**Case3:**
- We can use throw keyword only for throwable types.If we are trying to use for normal objects we will get compile time error
  saying incompatible types.
`
  public class Main {
  public static void main(String[] args) {
  throw new Main();
  }
  }
O/P: java: incompatible types: Main cannot be converted to java.lang.Throwable
`

`
public class Main extends RuntimeException{
public static void main(String[] args) {
throw new Main();
}
}
O/P: Exception in thread "main" Main
at Main.main(Main.java:3)
`
