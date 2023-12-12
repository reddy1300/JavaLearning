### Generics

1) Introduction
2) Generic Classes
3) Bounded Types
4) Generic Methods & Wild-card character(?)
5) Communication with non-generic code
6) Conclusions

**- The main objectives of generics are to provide type-safety and to resolve type casting problems.**

**Case1: Type-Safety**
- Arrays are Type-safe that is we can give the guarantee for the type of elements present inside an array.
- For ex: if our program requirement is to hold only string type of objects we can choose string array. By mistake if we are
  trying to add any other type of objects we will get compile time error.
`
  String[] s = new String[10000];
  s[0] = "Nagendra";
  s[0] = new Integer(10);
O/P: CE: Incompatible Types 
  Required type:String
  Provided: Integer
`
- Hence, string array can contain only string type of objects. Due to this we can give the guarantee for the type of elements 
  present inside array. Hence, arrays are safe to use with to respect to type. That is arrays are type-safe.
- But collection are not type-safe that is we can't give the guarantee for the type of elements present inside collection.
- For ex if our programme requirement is to hold only string type of objects and if we choose array list, by mistake if 
  we are trying to add any other type of object we won't get any compile time error but the program may fail at runtime.

`
ArrayList al = new ArrayList();
al.add("Durga");
al.add("Nagendra");
al.add(new Integer(10));
String name = (String) al.get(2);
O/P: RE: Exception in thread "main" java.lang.ClassCastException
class java.lang.Integer cannot be cast to class java.lang.String
`
- Hence, we can't give the guarantee for the type of elements present inside collection due to this collections are not 
  safe to use with respect to type. That is collections are not type-safe.

**Case2: Type-Casting**
- In the case of arrays at the time of retrieval it's not required to perform type-casting because there is a guarantee 
  for the type of elements present inside array.
`
  String[] s = new String[10];
  s[0] = "Durga";
  String name1 = s[0]; // Type casting not required.
`
- But in the case of collections at the time of retrieval compulsory we should perform type-casting. because, there is no 
  guarantee for the type of elements present inside collections.
`
- ArrayList al = new ArrayList();
  al.add("Durga");
  String s = (String) al.get(0); // Type-casting is mandatory.
  String s = al.get(0); 
O/P: CE: Incompatible types 
Found: j.l.Object
Required: j.l.String
`
- Hence, type casting is a bigger headache in collections.
- To overcome above problems of collection sun people introduced Generics concepts in 1.5 version.
- Hence, the main objectives of generics are 
1) To provide type safety
2) To resolve type casting problems.

- For ex to hold only string type os objects we can create generic version of array list object as follows.
`
  ArrayList<String> al = new ArrayList<String>();
  al.add("Durga");
  al.add(10); //CE: Required type: String Provided: int
`
- For this array list we can add string type of objects. by mistake if we are trying to add any other type then we will get
  compile time error.
- Hence, through generics we are getting safety.
- At the time of retrieval we are not required ot provide type-casting.
`
  String name = al.get(0);  // Type casting not required.
`
- Hence, Through generics we can solve type casting problem.

**Conclusion1:** Polymorphism concept is applicable only for the base type but not for parameter type.
[Usage of parent reference to hold child object is the concept of polymorphism]
`
ArrayList<String> al = new ArrayList<String>(); //ArrayList<String>  ArrayList - base type String - parameter type
List<String> al1 = new ArrayList<String>();
Collection<String> al2 = new ArrayList<String>();
ArrayList<Object> al3 = ArrayList<String>(); // CE: Incompatible types Found: Arraylist[String] Required: AL[Object]
`

**Conclusion2:** For the type parameter we can provide any class or interface name but not primitives. If we are trying to 
provide primitive then we will get compile time error.
`
ArrayList<int> al = new ArrayList<int>(); //CE: java: unexpected type required: reference found:    int
`

**Generic Classes:**
- Until 1.4 version an non generic version of ArrayList class as follows.
`
- class ArrayList
{
add (Object o)
Object get(int index)
}
`
- The argument two add method is object. and hence, we can add any type of object to the array list. Due to this we are 
  missing type safety.
- The return type of get method is Object. Hence, at the time of retrieval we  have to perform type casting.
- But in 1.5 version a generic version of array list class in declared as follows.

`
class ArrayList<T> //T is type parameter.
{
add(T t);
T get(int index); // return type of get parameter is type.
}
`
- Based on our run time requirement T will be replaced with our provided type.
- For ex to hold only string type of objects a generic version of array list objects can be created as follows.
- For this requirement compiler considered version of array list class as follows.

`
class ArrayList<String>
{
add(String t);
String get(int index);
}
`
- The argument 2 add method is String type and hence  we can add only string type of objects. by mistake if we are trying 
  to add any other type we will get compile time error.
`
  ArrayList<String> al = new ArrayList<String>();
  al.add("Nagendra");
  al.add(new Integer(10)); //CE: can not find symbol symbol: method add(j.l.Integer) location: class AL<String>
`
- Hence, through generics we are getting type safety.
- Return type of get method is String and hence, at the time of retrieval we are not required to perform type casting.
- ` String name = al.get(0);`
- In generics, we are associating a type parameter to the class such type of parameterised classes are nothing but Generic
  classes or Template classes.
- Based on our requirements we can define our own generic classes also.
`
class Account<T>
  {
}
Account<Gold> a1 = Account<Gold>();
Account<Platinum> a2 = Account<Platinum>();
`

**Our GenDemo:**
`
public class Gen <T>{
T ob;
Gen(T ob)
{
this.ob = ob;
}
public void show()
{
System.out.println("The type of object " + ob.getClass().getName());
}
public T getOb()
{
return ob;
}
}
class GenDemo
{
public static void main(String[] args) {
Gen<String> g1 = new Gen<String>("Durga");
g1.show();
System.out.println(g1.getOb());
        Gen<Integer> g2 = new Gen<Integer>(10);
        g2.show();
        System.out.println(g2.getOb());
        Gen<Double> g3 = new Gen<Double>(10.5);
        g3.show();
        System.out.println(g3.getOb());
    }
}
O/P: 
The type of object java.lang.String
Durga
The type of object java.lang.Integer
10
The type of object java.lang.Double
10.5
`

**Bounded Types:**
- We can bound the type parameter for a particular range by using extends keyword. such types are called bounded types.
`
class Test<T>
{}
`
- As the type parameter we can pass any type and there are no restrictions and hence, it is unbounded type.
- `Test<Integer> t1 = new Test<Integer>;`
- `Test<String> t2 = new Test<String>;`

`
calss Test<T extends Number>
{}
`
**Syntax for Bounded Types:**
`
class Test<T extends x>
{}
`
- x can be either class or interface.
- If x is a class then as the type parameter we can pass either x type or it's child classes.
- If x is an interface then as the type parameter we can pass either x type or it's implementation classes.

`
public class Gen <T extends  Number>{
}
class GenDemo
{
Gen<Integer> t1 = new Gen<Integer>();  //Valid
Gen<String> t1 = new Gen<String>();  // CE: Type parameter: j.l,String is not within its bound
}
`
`
public class Gen <T extends  Runnable>{
}
class GenDemo
{
Gen<Runnable> t1 = new Gen<Runnable>(); // valid
Gen<Thread> t1 = new Gen<Thread>();  //valid
Gen<Integer> t1 = new Gen<Integer>();  // CE: Type parameter: j.l.Integer is not within its bound
}
`

- We can define bounded types even in combination also 
- ex

`
public class Gen <T extends  Number & Runnable>{
}
`
- As the type parameter we can take anything which should be child class of number and should implement runnable interface.

`
class Test<T extends Runnable & Comparable>  //valid
class Test<T extends Number & Runnable & Comparable> //valid
class Test<T extends Runnable & Number> //In-valid because we have to take class first followed by interface next
class Test<T extends Number & Thread>  //In-valid because we can't extend more than one class simultaneously.
`

**Conclusions:**
- we can define bounded types only by using extends keyword (for both classes and interfaces) and we can't use implements
  and super keywords. but we can replace implements keyword purpose with extends keyword.
- `class Test<T extends Number>{}` //Valid
- `class Test<T implements Runnable>{}` //Invalid
- `class Test<T extends Runnable>{}` //valid
- `class Test<T super String>{}`  //Invalid

**Note:** As the type parameter 'T' we can take any valid java identifier but, it is convention to use 'T'.
- `class Test<T>` //valid
- `class Test<X>`  //valid
- `class Test<A>`  //valid
- `class Test<Nagendra>`  //valid

**Note:** Based on our requirement we can declare any number of type parameters and all these type parameters should be separated
with ,
`class Test<A, B>`  //valid
`class Test<A, B, C>`  //valid
`class HashMap<K, V>{} //K - key, V - value
HashMap<Integer, String> h = HashMap<Integer, String>();`

**Generic Methods $ Wild-card character:**
- `m1(ArrayList<String> l)` - We can call this method by passing array list of only string type.
- But within the method we can add only string type of objects to the list.
- By mistake if we are trying to add any other type then we will get compile time error.

`
m1(ArrayList<String> l){
l.add("A"); //valid
l.add(null); //valid because null is valid value for any type.
l.add(10); //Invalid
`

- `m1(ArrayList<?> l)` - We can call this method by passing array list of any unknown type or any type.
- But within the method we can't add anything to the list except null. because we don't know the type exactly.
- null is allowed because it is valid value for any type.

`
m1(ArrayList<?> l){
a.add(10.5); //invalid
a.add("A"); //invalid
a.add(10); //invalid
a.add(null); //valid
`
- This type of methods are the best suitable for read only operations.
- `m1(ArrayList<?> l){System.ot.println(l)}`

- `m1(ArrayList<? extends X> l)` X can be either class or interface. 
- If X is a class then we can call this method by passing array list of either X type or it's child classes.
- If X is an interface then we can call this method by passing array list of either X type or it's implementation classes.
- But within the method we can't add anything to the list except null. because we don't know the type of X exactly.
- This type of methods also the best suitable for read only operations.

- `m1(ArrayList<? super X> l)` - X can be either class or interface.
- If X is a class then we can call this method by passing array list of either X type or it's super classes.
- If X is an interface then we can call this method by passing array list of either X type or super class of implementation X.
- Object (super of thread) -> Thread (Implementation class of Runnable) -> Runnable(I)
- But within the method we can add X type of objects and null to the list.

- `ArrayList<String> l = new ArrayList<String>();`  //valid
- `ArrayList<?> l = new ArrayList<String>();`  //valid
- `ArrayList<?> l = new ArrayList<Integer>();`  //valid
- `ArrayList<? extends Number> l = new ArrayList<Integer>();`  //valid
- `ArrayList<? extends Number> l = new ArrayList<String>();` //CE: Incompatible types found: AL<String> Required: AL<? extends Number>
- `ArrayList<? super String> l = new ArrayList<Object>();`  //valid
- `ArrayList<?> l = new ArrayList<?>();`  //CE: unexpected type found: ? required: class or interface without bounds
- `ArrayList<?> l = new ArrayList<? extends Number>();` //CE: unexpected type found: ? extends Number required: class or
   interface without bounds.

- We can declare type parameter either at class level or at method level.

**Declaring Type parameter at class level:**
`class Test(T){
we can use 'T' within this class based on our requirement.
}
`

**Declaring Type parameter at method level:** we have to declare type parameter just before return type.
`class Test{
public <T>void m1 (T ob)
{
we can use T anywhere based on our requirement
}
}
`

- We can define bounded types even at method level also.
- `public <T extends Number>void m1()`
- `public <T extends Runnable>>void m1()`
- `public <T extends Number & Runnable>void m1()`
- `public <T extends Comparable & Runnable>void m1()`
- `public <T extends Number & Comparable & Runnable>void m1()`
- `public <T extends Runnable & Number>void m1()` //Invalid First we have to take class and then interface
- `public <T Number & Thread>void m1()` // We can't extend more than one class

**Communication with Non-Generic code:**
- If we send generic object to non-generic area then it starts behaving like non-generic object.
- Similarly, if we send non-generic object to generic area then it starts behaving like generic object.
- That is the location in which object is present based on that behaviour will be defined.

`
class Test{
public static void main(String[] args){
ArrayList<String> l = new ArrayList<String>();
l.add("durga");
l.add("Ravi");
l.add(10);  //CE: 
m1(l);
System.out.println(l); //["Durga", "Ravi", 10, 10.5];
l.add(10.5); //Invalid

public static void m1(ArrayList l){  //Non-generic area
l.add(10);    
l.add(10.5);
l.add(true);
}
`

**Conclusions:**
- The main purpose of generics is to provide type safety and to resolve type casting problems. Type-safety and type-casting 
  both are applicable at compile time. Hence, generics concept also applicable only at compile time but not at run time.
- At the time of compilation as last step generics syntax will be removed. and Hence, for the JVM generics syntax won't be available.

`
ArrayList l = new ArrayList<String>();
l.add(10);
l.add(10.5);
l.add(true);
System.out.println(l); //[10, 10.5, true]
`
- Hence, the following declaration are equal.

`
ArrayList l = new ArrayList<String>();
ArrayList l = new ArrayList<Integer>();
ArrayList l = new ArrayList<Double>();
ArrayList l = new ArrayList();
`

- The following declarations are equal
- `ArrayList<String> l = new ArrayList<String>();`
- `ArrayList<String> l = new ArrayList();`
- for these array list objects we can add only string type of objects.

**At compile time:**
- compile code normally by considering generic syntax.
- Remove generic syntax.
- compile once again resultant code.

`
class Test
{
public void m1(ArrayList<String> l){
}
} public void m1(ArrayList<Integer> l){
}
}
O/P: CE: name clash: Both methods have same erasure
`