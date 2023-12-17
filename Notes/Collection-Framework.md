### Collection Framework

**Array:**
- An array is an indexed collection of fixed number of homogenous data elements. 
- The main advantage of arrays is we can represent multiple values by using single variable. so that readability of the 
  code will be improved.

**Limitations of Arrays:**
- Arrays are fixed in size. That is once we create an array there is no chance of increasing or decreasing the size based
  on our requirement. due to this, to use array's concept compulsory we should know the size in advance which may nor possible 
  always.
- Array can hold only homogenous data type elements.
- `Student[] s = new Student[10000];`
- `s[0] = new Student(); //valid`
- `s[1] = new Customer();` //In-valid CE: incompatible found: Customer required: Student
- We can solve this problem by using Object type arrays.
- `Object[] ob = new Object[10000];`
- `ob[0] = new Student(); ` //valid
- `ob[1] = new Customer();`  //In-valid
- Arrays concept not implemented based on some standard data structure and hence, ready-made method support is not available.
- For every requirement we have to write the code explicitly which increases complexity of programming.
- To overcome above problems of arrays we should go for Collections concept.
- Collections are growable in nature. that is based on our requirement we can increase or decrease the size.
- Collections can hold both homogenous and heterogeneous objects.
- Every collection class is implemented based on some standard data structure hence, for every requirement ready-made method
  support is available.
- Being a programmer we are responsible to use those methods, and we are not responsible to implement those methods.

**Differences between Arrays and Collections:**
- **A:** Arrays are fixed in size. that is once we create an array we can't increase or decrease the size based on our requirement.
- **C:** Collections are growable in nature. that is based our requirement we can increase or decrease the size.
- **A:** W.r.t memory arrays are not recommended to use.
- **C:** W.r.t memory collections are recommended to use.
- **A:** W.r.t performance arrays are recommended to use.
- **C:** W.r.t performance collections are not recommended to use.
- **A:** Arrays can hold only homogenous datatype elements.
- **C:** Collections can hold both homogenous and heterogeneous elements.
- **A:** There is no underlying data structure for arrays. and hence, ready-made method support is not available. for every 
  requirement we have to write the code explicitly which increases complexity of programming.
- **C:** Every collection class is implemented based on some standard data structure and hence, for every requirement 
  ready-made method support is available. being a programmer we can use these methods directly, and we are not responsible 
  to implement those methods.
- **A:** Arrays can hold both primitives and Objects.
- **C:** Collections can hold only Object types but not primitives.

**Collection:**
- If we want to represent a group of individual Objects as a single entity then we should go for collection.

**Collection Framework:**
- It contains several classes and interfaces which can be used to represent a group of individual objects as a single entity.

**Java:** Collection -> Collection Framework equivalent terminology in c++
**C++:** Container -> Standard Template Library

**9 Key Interfaces of Collection Framework:**
1) Collection 
2) List
3) Set
4) SortedSet
5) NavigableSet
6) Queue
7) Map
8) SortedMap
9) NavigableMap

**Collection(I):**
- If we want to represent a group of individual objects as a single entity then we should go for collection.
- Collection interface defines the most common methods which are applicable for any collection object.
- In general collection interface is considered as root interface of collection framework.
- There is no concrete class which implements collection interface directly.
- Collection(I) -> List(I)
- Collection(I)(1.2) -> Set(I)(1.2) -> SortedSet(I)(1.2) -> NavigableSet(I)(1.6) -> TreeSet(C)(1.2)
- Collection(I) -> Queue(I)
- Collection(I) -> Map(I) -> SortedMap(I) -> NavigableMap(I)

**Difference between Collection and Collections:**
- Collection is an interface If we want to represent a group of individual objects as a single entity then we should go 
  for collection.
- Collections is a utility class present in java.util package to define several utility methods for collection objects.
  [Like sorting, searching ext]

**List(I)(1.2):**
- It is the child interface of collection.
- If we want to represent a group of individual objects as a single entity where duplicates are allowed and insertion order 
  must be preserved. Then we should go for List.
- **List -> ArrayList (1.2)**
- **List -> LinkedList(1.2)**
- **List -> Vector(1.0) -> Stack(1.0)**
- In 1.2 version vector and stack classes are re-engineered to implement List interface.

**Set(I)(1.2):**
- It is the child interface of collection.
- If we want to represent a group of individual objects as a single entity where duplicates are not allowed and insertion 
  order not required then we should go for set interface.
- **Set -> HashSet(1.2) -> LinkedHashSet(1.4)**

**SortedSet(I):**
- It is the child interface of Set.
- If we want to represent a group of individual objects as a single entity where duplicates are not allowed and all objects
  should be inserted according to some sorting order. then we should go for sorted set.

**NavigableSet(I):**
- It is the child interface of SortedSet(I).
- It contains several methods for navigation purposes.

**Differences between List and Set:**
- **L:** Duplicates are allowed.
- **S:** Duplicates are not-allowed.
- **L:** Insertion order preserved.
- **S:** Insertion order not preserved.

**Queue(I):**
- It is the child interface of collection.
- If we want to represent a group of individual objects prior to processing then we should go for Queue.
- Usually queue follows first in first our order but based on our requirement we can implement our own priority order also.
- Ex: before sending a mail all mail id's we have to store in some data structure. in which order we added mail id's in the same 
  order only mail should be delivered. for this requirement queue is the best choice.
- Collection -> Queue(1.5)
- Queue -> [Priority Queue(C), BlockingQueue(C)]
- BlockingQueue(C) - > [PriorityBlockingQueue(C), LinkedBlockingQueue(C)]

**Note:** All the above interfaces [Collection. List, Set, SortedSet, NavigableSet, Queue] meant for representing a group 
of individual objects.
- If we want to represent a group of objects as key, value pairs then we should go for Map.

**Map(I):**
- Map is not child interface of collection.
- If we want to represent a group of objects as key, value pairs then we should go for map.
- Both key and value are Objects only. duplicate keys are not allowed. but values can be duplicated.
- Map(I) -> [(HashMap(1.2) -> LinkedHashMap(1.4)), WeakHashMap(1.2), IdentityHashMap(1.4), (Hashtable(1.0)) -> Properties(1.0)]

**SortedMap(I):**
- It is the child interface of map.
- If we want to represent a group of key, value pairs according to some sorting order of keys then we should go for sorted map.
- In sorted map the sorting should be based on key but not based on value.

**NavigableMap(I):**
- It is the child interface sorted map.
- If defines several methods for Navigation purposes.
- Only TreeMap implements NavigableMap.

**Note:** The following are legacy characters present in Collection Framework.
- Enumeration(I)
- Dictionary(AC)
- Vector(C)
- Stack(C)
- Hashtable(C)
- Properties(C)

**Sorting:**
- Comparable(I)
- Comparator(I)

**Cursors:**
- Enumeration(I)
- Iterator(I)
- ListIterator(I)

**Utility Classes:**
- Collections
- Arrays


**Collection(I):**
- If we want to represent a group of individual  objects as a single entity then we should go for collection.
- Collection interface defines the most common methods which are applicable for any collection object.
- There is no concrete class which implements collection interface directly.
 
**List(I):**
- List is a child interface of collection.
- If we want to represent a group of individual objects as a single entity where duplicates are allowed and insertion order
  must be preserved then we should go for list.
- We can preserve insertion order via index, and we can differentiate duplicate objects by using index. hence, index will
  play very important role in list.
- List interface defines the following specific methods.

**ArrayList(C):**
- The underlying data structure is re-sizable array or growable array.
- Duplicate objects are allowed.
- Insertion order is preserved.
- Heterogeneous objects are allowed.[Except TreeSet and TreeMap everywhere heterogeneous objects are allowed.]
- null insertion is possible.

**Constructors**: ArrayList contain three constructors (Empty, Initial capacity, convertible)
- ArrayList l = new ArrayList(); creates an empty array list object with default initial capacity 10.
- Once array list reaches its max capacity then a new array list object will be created with new Capacity = (current capacity * 3/2) + 1;
- ArrayList l = new ArrayList(int initialCapacity); creates an empty array list object with specified initial capacity.
- ArrayList l = new ArrayList(Collection c); creates an equivalent array list object for the given collection.
- Usually we can use collection's to hold and transfer objects from one location to another location[Container]. to provide
  support for this requirement every collection class by default implements serializable and cloneable interfaces.
- ArrayList and Vector classes implements RandomAccess interface. so that any random element we can access with the same speed.

**RandomAccess:**
- random access interface present in java.util package, and it doesn't contain any methods. it is a marker interface, where 
  required ability will be provided automatically by the JVM.
- ArrayList is the best choice if our frequent operation is retrieval operation[Because array list implements RandomAccess interface]
- ArrayList is the worst choice if our frequent operation is insertion or deletion in the middle.

**Differences between ArrayList and Vector:**
- **AL:** Every method present in the ArrayList is non-synchronized.
- **V:** Every method present in the vector is synchronized.
- **AL:** At a time multiple threads are allowed to operate on array list object and hence, it is not thread safe.
- **V:** At a time only one thread is allowed to operate on vector object and hence, it is thread safe.
- **AL:** Relatively performance is high because threads are not required to wait to operate on array list object.
- **V:** Relatively performance is low because threads are required to wait to operate on vector object.
- **AL:** Introduced in 1.2v, and it is non legacy.
- **V:** Introduced in 1.0v, and it is legacy.

**How to get synchronized version of ArrayList object:**
- By default, ArrayList is non-synchronized. but we can get synchronized version of ArrayList object by using synchronizedList();
  method of Collections class.
- **public static List synchronizedList(List l)**
- `ArrayList l = new ArrayList();`
- `List l1 = Collections.synchronizedList(l);` l - non-synchronized l1 - Synchronized. 
- Similarly, we can get synchronized version of Set and Map objects by using the following methods of Collections class.
- **public static Set synchronizedSet(Set s)**
- **public static Map synchronizedMap(Map m)**

**LinkedList:**
- The underlying data structure is doubly linked list.
- Insertion order is preserved and duplicates objects are allowed.
- Heterogeneous objects are allowed.
- null insertion is possible.
- LinkedList implements serializable and cloneable interfaces but not RandomAccess.
- Linked list is the best choice if our frequent operation is insertion or deletion in the middle.
- LinkedList is a not good choice if our frequent operation is retrieval operation.

**Constructors:**
- LinkedList l = new LinkedList(); creates an empty LinkedList object.
- LinkedList l = new LinkedList(Collection c); creates an equivalent linked list object for the given collection.


**LinkedList class specific methods:**
- Usually we can use LinkedList to develop stack's and queue's. to provide support for this requirement linked list class
  defines the following specific methods.
- void addFirst();
- void addLast();
- Object getFirst();
- Object getLast();
- Object removeFirst();
- Object removeLast();

**Differences between ArrayList and LinkedList:**
- AL: is the best choice if our frequent operation is retrieval operation.
- LL: is the best choice if our frequent operation is insertion or deletion in the middle.
- AL: is the worst choice if our frequent operation is insertion or deletion in the middle because internally several shift 
  operations are performed.
- LL: is the worst choice if our frequent operation is retrieval operation.
- AL: in array list the elements will be stored in consecutive memory locations. and hence, retrieval operations will become
  easy.
- LL: In linked list the elements won't be stored in consecutive memory locations and hence, retrieval operations will 
  become complex.

**Vector:**
- The underlying data structure is re-sizable array or growable array.
- Duplicate objects are allowed.
- Insertion order is preserved.
- Heterogeneous objects are allowed.[Except TreeSet and TreeMap everywhere heterogeneous objects are allowed.]
- null insertion is possible.
- It implements Serializable, Cloneable, RandomAccess Interfaces
- Every method present in the vector is synchronized and hence, vector object is thread safe.

**Constructors:**
- Vector v = new Vector(); creates an empty vector object with default initial capacity 10.
- once vector reaches it max capacity then a new vector object will be created with `new capacity = current capacity * 2;`
- Vector v = new Vector(int initialCapacity); creates an empty vector object with specified initial capacity.
- Vector v = new Vector(int initialCapacity, int incrementalCapacity); 
- Vector v = new Vector(Collection c); creates an equivalent vector object for the given collection. this constructor meant
  for interconversion between collection objects.

**Vector Specific Methods:**

**To add objects:**
- add(Object o) -> C
- add(int index, Object o) -> L
- addElement(Object 0) -> V

**To Remove Objects:**
- remove(Object o) -> C
- removeElement(Object o) -> V
- remove(int index) -> L
- removeElementAt(int index) -> V
- clear() -> C
- removeAllElements() -> V

**To Get Objects:**
- Object get(int index) -> L
- Object elementAt(int index) -> V
- Object firstElement() -> V
- Object lastElement() -> V

**Other Methods:**
- int size();
- int capacity();
- Enumeration elements();

**Stack:**
- It is the child class of Vector.
- It is a specially designed class for last in first out order.

**Constructor:**
- Stack s = new Stack();

**Methods:**
- push(Object o)
- Object pop() // to remove and return top of the stack
- Object peek(); //return top of the stack without removal.
- boolean empty();
- int search(Object o); // return off-set(values start from top like 1, 2, 3) if available otherwise return -1.

**The Three Cursors of JAVA:**
- If we want to get objects one by one from the collection then we should go for cursor.
- There are three types of cursor's available in java.
1) Enumeration
2) Iterator
3) List Iterator

**Enumeration:**
- We can use enumeration to get objects one by one from legacy collection object.
- We can create enumeration object by using elements method of vector class.
- public Enumeration elements();
- Enumeration e = v.elements();

**Methods:**
- public boolean hasMoreElements();
- public Object nextElement();

**Limitations of Enumeration:**
- We can apply enumeration concepts for only legacy classes and, it's not a universal cursor.
- By using enumeration we can get only read access and, we can't perform remove operation.
- To overcome above limitations we should go for iterator.

**Iterator(I):**
- We can apply iterator concept for any collection object and hence, it is universal cursor.
- By using iterator we can perform both read and remove operations.
- We can create iterator object by using iterator method of collection interface.
- public Iterator iterator()
- Iterator itr = c.iterator(); // c is any collection object

**Methods:**
- public boolean hasNext()
- public Object next()
- public void remove()

**Limitations of Iterator:**
- By using enumeration and iterator we can always move only towards forward direction and, we can't move backward direction.
  these are single directional cursor but not bi-directional cursors.
- By using iterator we can perform only read and remove operations and, we can't perform replacement and addition of new objects.
- To overcome above limitations we should go for list iterator.

**ListIterator(I):**
- By using list iterator we can move either to the forward direction or to the backward direction and hence, it is bi-directional 
  cursor.
- By using list iterator we can perform replacement and addition of new objects in addition to read and remove operations.
- we can create list iterator by using list iterator method of list interface.
- public ListIterator listIterator()
- ListIterator lts = l.listIterator();

**Methods:**
- ListIterator is the child interface of Iterator and hence, all methods present in iterator interface is by default available
  in the ListIterator.
- ListIterator defines the following nine methods.
1) public boolean hasNext()
2) public Object next()
3) public int nextIndex()
4) public boolean hasPrevious()
5) public Object previous()
6) public int previousIndex()
7) public void remove()
8) public void set(Object o)
9) public void add(Object o)

**Note:** The most powerful cursor is ListIterator but, it's limitation is, it's applicable for only for List Objects.

**Comparison table of Three Cursors:**

**Internal Implementation of Cursors:**
- Vector v = new Vector();
- Enumeration e = v.elements();
- Iterator itr = v,iterator();
- ListIterator ltr = v.listIterator();
- System.out.println(e.getClass().getName()); O/P: java.util.Vector$1
- System.out.println(itr.getClass().getName()); O/P: java.util.Vector$Itr
- System.out.println(ltr.getClass().getName()); O/P: java.util.Vector$ListItr

**Set(I):**
- Set is child interface of collection.
- If we want to represent a group of individual objects as a single entity where duplicates are not allowed and insertion 
  order not preserved.
- Set interface doesn't contain any new method and, we have to use only collection interface methods.

**HashSet(C):**
- The underlying data structure is hash table.
- Duplicate objects are not-allowed.
- Insertion order is not preserved and, it is based on hash code of objects.
- null insertion is possible.[Only once]
- Heterogeneous objects are allowed.
- Implements Serializable and Cloneable but not RandomAccess Interface.
- HashSet is the best choice if our frequent operation is search operation.

**Note:** In HashSet duplicates are not allowed if we are trying to insert duplicates then we won't get any compile time 
or runtime error's and add method simply return's false.

- HashSet h = new HashSet();
- h.add("A"); //true
- h.add("A"); //false

**Constructors:**
- HashSet h = new HashSet(); creates an empty hash set object with default initial capacity 16. and default fill ratio 0.75.
- HashSet h = new HashSet(int initialCapacity); creates an empty hash set object with specified initial capacity and default 
  fill ratio 0.75.
- HashSet h = new HashSet(int initialCapacity, float fillRatio); //0.9
- HashSet h = new HashSet(Collection c); creates an equivalent HashSet for the given collection. this constructor meant
  for interconversion between collection objects.

**Fill Ratio or Load Factor:**
- After filling how much ratio a new HashSet object will be created, This ratio is called fill ratio or load factor.
- for Ex: Fill Ratio 0.75 means after filling 75% ratio a new hash set object will be created.

**LinkedHashSet(C):**
- 