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

