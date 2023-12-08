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

**Throws Keyword:**
- In our program if there is a possibility of raising checked exception then compulsory we should handle that checked exception.
  Otherwise, we will get compile time error saying 
`java: unreported exception java.io.FileNotFoundException; must be caught or declared to be thrown`

`
import java.io.PrintWriter;
public class Main {
public static void main(String[] args) {
PrintWriter pw = new PrintWriter("abc.txt");
pw.println("Hello");
}
}
`

**EX2:**
`
public class Main {
public static void main(String[] args)  {
Thread.sleep(10000);
}
}
O/P: java: unreported exception java.lang.InterruptedException; must be caught or declared to be thrown
`
- We can handle this compile time error by using the following two ways.
**By using try-catch**
`
  public class Main {
  public static void main(String[] args)  {
  try {
  Thread.sleep(10000);
  }
  catch (InterruptedException e){}
  }
  }
`
**By using Throws Keyword:**
- We can use throws keyword to delegate responsibility of exception handling to the caller[It may be another method or JVM].
  Then caller method is responsible to handle that exception.
`
  public class Main {
  public static void main(String[] args) throws InterruptedException {
  Thread.sleep(10000);
  }
  }
`
- Throws keyword requires only for checked exceptions. and usage of throws keyword for unchecked exceptions there is no use or impact.
- Throws keyword require only to convince compiler and usage of throws keyword doesn't prevent abnormal termination of program.

`
public class Main {
public static void main(String[] args) throws InterruptedException {
doStuff();
}
public static void doStuff() throws InterruptedException {
doMoreStuff();
    }
    public static void doMoreStuff() throws InterruptedException {
        Thread.sleep(10000);
    }
}
`
- Here we need different levels of delegation. doMoreStuff() delegate doStuff(), doStuff() delegate main(). Otherwise, we 
  will get Unreported Exception: J.L.InterruptedException must be caught or declared to be thrown.
- In the above program if we remove at-least one throws statement then the code won't compile.
- It is always recommended to use try-catch instead of throws.

**Case1:** We can use throws keyword for methods and constructors but not for classes.
**Case2:** We can use throws keyword only for throwable types. If we are trying to use for normal java classes then we will
get compile time error saying incompatible types.

`
public class Main {
public void m1() throws Main{}
}
O/P: Incompatible types found: Main required: J.L.Throwable
`
`
public class Main extends RuntimeException{
public void m1() throws Main{}
}
O/P: Compiles fine.
`

**Case3:**
`
//Checked Exception
public class Main extends RuntimeException{
    public static void main(String[] args)  {
        throw new Exception();
    }
}
O/P: CE: java: unreported exception java.lang.Exception; must be caught or declared to be thrown
`

`
//Unchecked Exception
public class Main extends RuntimeException{
    public static void main(String[] args)  {
        throw new Error();
    }
}
O/P: RE: Exception in thread "main" java.lang.Error
at Main.main(Main.java:4)
`

**Case4:**
- Within the try block if there is no chance of raising an exception then we can't write catch block for that exception.
  otherwise, we will get compile time error saying java: exception xxx[java.lang.InterruptedException] is never thrown in
  body of corresponding try statement.
- But this rule is only applicable for fully checked exceptions.

**Exception Handling Keywords Summary:**

1) try -> To maintain risky code.
2) catch -> To maintain exception handling code.
3) finally -> To maintain cleanup code.
4) throw -> To hand over our created exception object to the JVM manually.
5) throws -> To delegate responsibility of exception handling to the caller.

**Various possible compile time error in Exception Handling:**
1) unreported exception xxx; must be caught or declared to be thrown.
2) Exception XXX has already been caught.
3) Exception XXX is never thrown in body of corresponding try statement.
4) unreachable statement.
5) Incompatible types found: Test required: java,lang.Throwable.
6) try without catch or finally.
7) catch without try.
8) finally, without try.

**Customised or User Defined Exceptions:**
- Sometimes to meet program requirements we can define our own exceptions. such types of exceptions are called customised 
  or user defined exceptions.
- Ex- TooYoungException, TooOldException, InSufficientFundsException etc.
`
  class TooYoungException extends RuntimeException
  {
  TooYoungException(String s)
  {
  super(s);
  }
  }
  class TooOldException extends RuntimeException
  {
  TooOldException(String s)
  {
  super(s); // To make description available to default exception handler.
  }
  }
  class CustException
  {
  public static void main(String[] args) {
  int age = Integer.parseInt(args[0]);
  if (age > 60)
  {
  throw new TooYoungException("Plz wait some more time... you will get best match soon");
  }
  else if (age < 18)
  {
  throw new TooOldException("your age is already crossed");
  }
  else
  {
  System.out.println("you will get match details soon");
  }
  }
  }
`

**Note1:** throw keyword is the best suitable for user defined or customised exceptions but not for predefined exceptions.
**Note2:** It is highly recommended defining customised exceptions as unchecked that is we have to extend Runtime Exception 
but not exception.
**Note3:** CustomException -> RunTimeException -> Exception -> Throwable, throwable contain print stack track method. default 
exception handler call this method to print exception information.

**Top 10 Exceptions:**
- Based on who is raising an exception all exceptions are divided into two categories.
1) JVM Exceptions
2) Programmatic exceptions

**JVM Exceptions:**
- The exceptions which are raised automatically by JVM whenever a particular event occurs are called JVM exceptions.
- Ex: ArithmeticException, NullPointerException, etc

**Programmatic Exceptions:**
- The exceptions which are raised explicitly either by programmer or by API developer to indicate that something goes wrong
  are called programmatic exceptions.
- Ex: TooOldExceptions, IllegalArgumentExceptions, etc.

**1) ArrayIndexOutOfBoundsException**
- It is the child class of RuntimeException and Hence, it is unchecked.
- Raised automatically by JVM whenever we are trying to access array element with, out of range index.

**2) NullPointerException:**
- It is the child class of RuntimeException and Hence, it is unchecked.
- Raised automatically by JVM whenever we are trying to perform any operation on null.
`
String s = null;
System.out.println(s.length());
`

**3) ClassCastException:**
- It is the child class of RuntimeException and Hence, it is unchecked.
- Raised automatically by JVM whenever we are trying to typecast parent object to child type.

`
public static void main(String[] args) {
Object o = new Object();
String s = (String) o;
}
O/P: RE: ClassCastException
`

`
public static void main(String[] args) {
String s = new String("Nagendra");
Object o = (Object) s;
}
O/P: Compiles fine no error. because we can cast child to parent.
`

`
public static void main(String[] args) {
Object o = new String("Nagendra");
String s = (String) o;
}
O/P: works fine.
`

**4) StackOverflowError:**
- It is the child class of Error and Hence, it is unchecked.
- Raised automatically by JVM whenever we are trying to perform recursive method call.

`
public static void main(String[] args) {
m1();
}
public static void m1()
{
m2();
}
public static void m2()
{
m1();
}
O/P: Exception in thread "main" java.lang.StackOverflowError
`

**5) NoClassDefFoundError:**
- It is the child class of Error and Hence, it is unchecked.
- Raised automatically whenever JVM unable to find required .class file.
- `Java Test ` if Test.class file is not available then we will get runtime exception time saying NoClassDefFoundError: Test

**6) ExceptionInInitializerError:**
- It is the child class of Error and Hence, it is unchecked.
- Raised automatically by JVM if any exception occurs while executing static variable assignment's and static blocks.
`
public static void main(String[] args) {
static int x = 10/0;
}
`
`
static
{
String s = null;
System.out.println(s.length());
}
`

**7) IllegalArgumentException:**
- It is the child class of RuntimeException and Hence, it is unchecked.
- Raised explicitly either by programmer or by API developer to indicate that a method has been invoked with illegal argument.
- Ex: The valid range of Thread priorities is 1 to 10.If we are trying to set the priority with any other value then we will
  get runtime exception saying IllegalArgumentException.

`
public static void main(String[] args) {
Thread t = new Thread();
t.setPriority(11);
}
O/P: Exception in thread "main" java.lang.IllegalArgumentException
at java.base/java.lang.Thread.setPriority(Thread.java:1138)
at Main.main(Main.java:5)
`

**8) NumberFormatException:**
- It is the direct child class of IllegalArgumentException which is the child class of RumTimeException and Hence, it is 
  unchecked.
- Raised explicitly either by programmer or API developer to indicate that we are trying to convert String to Number amd
  the string is not properly formatted.

`
public static void main(String[] args) {
int i = Integer.parseInt("Hello");
}
O/P: NumberFormatException
`

**9) IllegalStateException:**
- It is the child class of runtime exception and hence it is unchecked.
- Raise explicitly either programmer or by API developer to indicate that a method has been invoked at wrong time.
- Ex: After starting of a thread we are not allowed to restart the same thread once again otherwise, we will get run time
  exception saying IllegalThreadStateException.

`
public static void main(String[] args) {
Thread t = new Thread();
t.start();
t.start();
}
O/P: Exception in thread "main" java.lang.IllegalThreadStateException
at java.base/java.lang.Thread.start(Thread.java:793)
at Main.main(Main.java:6)
`

**10) Assertion Error:**
- It is the child class of Error Hence, it is unchecked.
- Raise explicitly either programmer or by API developer to indicate that Assert statement fails.
- Ex: Assert(x>10);
- If x is not greater than 10 then we will get runtime exception saying AssertionError.

**1.7 Version enhancements wrt to exception handling:**
As the part of 1.7 version in exception handling the following two concepts introduced:
1) Try with resources
2) Multi catch block.

**Try with resources:**
- Until 1.6 version it is highly recommended writing finally block to close resources which are opened as the part of try 
  block.
- The problems in this approach are 
1) Compulsory programmer is required to close resources inside finally block. it increases complexity of programming.
2) We have to write finally block compulsory and hence it increases length of the code and reduces readability.
3) To overcome above problems sun people introduced try with resources in 1.7 version.
4) The main advantage of try with resources is whatever resources we open as part of try block will be close automatically 
  once control reaches end of try block either normally or abnormally. Hence, we are not require to close explicitly. so that 
  complexity of the program will be reduced.
5) We are not require to write finally block so length of the code will be reduced and readability is improved.

`
public static void main(String[] args) {
Buffer br = null;
try {
br = new Buffer(new FileReader("Input.txt"));
//use br based on our requirement
}
catch(IOException e)
{
// Handling Code
}
finally {
if (br != null)
{
br.close();
}
}
}
`
**1.7**
`
try (Buffer br = new Buffer(new FileReader("Input.txt"))){
;
//use br based on our requirement
/* br will be closed automatically once control reaches end of the try block
          * either normally or abnormally and we are not responsible to close explicitly*/
}
catch(IOException e)
{
// Handling Code
}
`

**Conclusions:**
- We can declare multiple resources but these resources should be separated with semicolon.
- `try(r1; r2; r3){}`
- `try(FileWriter fw = new FileWriter("Output.txt"); FileReader fr = new FileReader("output.txt");){}`
- All resources should be auto closable resources. 
- A resource is said to be auto closable if and only if corresponding class implements java.lang.AutoClosable interface.
- All io related resources, database related resources, and network related resources are already implemented auto closable 
  interface.
- Being a programmer we are not require doing anything just we should be aware the point.
- Auto closure interface came in 1.7 version, and it contains only one method `public void close();`
- All resource reference variables are implicitly final. Hence, within the try block we can't perform reassignment otherwise,
  we will get compile time error.

`
try (BufferedReader br = new BufferedReader(new FileReader("input.txt"))){
br = new BufferedReader(new FileReader("output.txt"))
        }
O/P: java: auto-closeable resource br may not be assigned
`
- Until 1.6 version try should be associated with either catch or finally. but from 1.7 version onwards we can take only try
  with resource without catch or finally.
- `try(R){}`
- The main advantage of try with resources is we are not require writing finally block explicitly because we are not require 
  closing resources explicitly. Hence. until 1.6 version finally block is mandatory but from 1.7 version onwards it is not
  required.

**Multi-Catch Block:**
- Until 1.6 version even though multiple different exceptions having same handling code for every exception type we have
  to write a separate catch block. it increases length of the code and reduces readability.

`
public static void main(String[] args) {
try{}
catch(ArithmeticException e){e.printStackTrace();}
catch(IOException e){e.printStackTrace();}
catch(NullPointerException e){e.getMessage();}
catch(InterruptedException e){e.getMessage();}
}
`

- To overcome this problem sun people introduced multi catch blocks in 1.7 version.
- According to this we can write a single catch block that can handle multiple different type of exceptions.

`
public static void main(String[] args) {
try{}
catch(ArithmeticException | IOException e){e.printStackTrace();}
catch(NullPointerException | InterruptedException e){e.getMessage();}
}
`
- The main advantage of this approach is length of the code will be reduced and readability will be improved.
- In multi catch block there should not be any relation between exception types.[Either child to parent or parent to child
  or same type] Otherwise, we will get compile time error.

`
public static void main(String[] args) {
try{}
catch (ArithmeticException | Exception e){}
}
O/P: java: Alternatives in a multi-catch statement cannot be related by subclassing
Alternative java.lang.ArithmeticException is a subclass of alternative java.lang.Exception
`

**Exception Propagation:**
- Inside a method if an exception raised and if we are not handling that exception then exception object will be propagated 
  to caller then caller method is responsible to handle exception.
- This process is called exception propagation.

**Rethrowing Exception:**
- we can use this approach to convert one exception type to another exception type.

`
public static void main(String[] args) {
try{
System.out.println(10/0);
}
catch (ArithmeticException e){
throw new NullPointerException();
}
    }
`