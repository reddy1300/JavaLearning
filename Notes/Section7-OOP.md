**What is Object-Oriented Programming:** 
- OOP is a way to model real world objects, as software objects, which contain both data and code.
- Classes is the fundamental component of OOP. Which also called class-based programming.

**Class-based Programming:**
- Class based programming starts with classes, which become the blueprints for objects.

* Every real world objects have two major components: 
- State
- Behaviour

State: (for ex Computer)
- The amount of RAM it has.
- The Operating system it's running.
- The hard drive size.
- The size of the monitor.
- These are characteristics about the item, that can describe it.

Behaviour:
- Actions that can be performed by the object.
- Booting up.
- Shutting down.
- Beeping, or outputting some form of sound.
- Drawing something on the screen.

- So modelling real world objects as software objects, is a fundamental part of OOP.
- A software object stores its state in fields, which can also be called variables, or attributes.
- Objects expose their behaviour with methods, which we've talked about before.

**The class as the blueprint:**

- The Class describes the data (fields), and behaviour (methods) that are relevant to the real world object we want to describe.
- These are called class members.
- A class member can be a filed, or a method, or some other type of dependent element.
- If a field is static, there is only one copy in memory, and this value is associated with the class, or template, itself.
- If field is not static, it's called an instance field, and each object may have a different value stored fo this field.
- A static method can't be dependent on anyone objects state, so it can't reference any instance members.
- In other words, any method that operates on instance fields, needs to be non-static.

**Organizing Classes:**

- Classes can be organized into logical groupings, which are called packages.
- We declare a package name in the class using the package statement.
- If we don't declare a package the class implicitly belongs to the default package.

**Access modifiers for the class:**
- A class is said to be a top-level class, if it is defined in the source code file, and not enclosed in the code block 
  of another class, type, or method.

**A top-level class has only two valid access modifiers options: public, or none.**
- public - public means any other class in any package can access this class.
- none: when modifier is omitted, this has special meaning, called package access, meaning the class is accessible only to 
  classes in the same package.

**Access modifier for class members:**
- Access modifier at the member level, allows granular control over class members.
- The valid access modifiers are shown in this table from the least restrictive to the most restrictive.

 ![access modifiers for class members](/Images/access-modifiers-for-class-members.png)

**Encapsulation:**
- Encapsulation in OOP usually has two meanings.
- One is the bundling of behaviour and attributes on a single object.
- The other is the practice of hiding fields, and some methods, from public access.

**What is null?**
- null is a special keyword in java, meaning the variable or attribute has a type, but no reference to an object.
- That means that no instance or object is assigned to the variable or field.
- Fields with primitive data types are never null.

**What are getters and setters? Why should we use them?**

- A getter is a method on a class, that retrieves the value of a private field and returns it.
- A setter is a method on a class, that sets the value of a private field.
- The purpose of these methods is to control, and protect, access to private fields.
- Another important aspect is that the getter and setter method signatures are part of car's public interface, but the 
  attribute names and types aren't.
- This means that we can change things internally like the name or type of attribute, but as long as we use the same getter
  and setter method, these changes should have no effect on code that uses our class. Our internal changes are hidden from users.

**this:**
- this is a special keyword in java.
- What it really refers to is the instance that was created when the object was instantiated.
- So this is a special reference name for the object or instance, which it can use to describe itself.
- And we can use this to access fields on the class.

**Constructor:**
- A constructor is used in the creation of an object, that's an instance of a class.
- It is a special type of code block that has a specific name and parameters, much like a method.
- It has the same name as the class itself, and it doesn't return any values.
- You never include a return type from a constructor, not even void.
- You can and should specify an appropriate access modifier to control who should be able to create new instance of the class.
- It can be used to initialize.

**The default constructor:**
- If a class contains no constructor declaration then a default constructor is implicitly declared.
- This constructor has no parameters and is often called th eno-args (no -arguments) constructor.
- If a class contains any other constructor declarations then a default constructor is not implicitly declared.

**Constructor Overloading:**
- Constructor overloading is declaring multiple constructors, with different formal parameters.
- The number of parameters can be different between constructors.
- Or is the number of parameters is the same between two constructors their types or order of the types must be differed.

**Constructor chaining with this():**
- Constructor chaining is when one constructor explicitly calls another overloaded constructor.
- You can call a constructor only from another constructor.
- You must use the special statement this() to execute another constructor passing it arguments if required.
- And this() must be the first executable statement if it's used from another constructor.

**POJO: Plain old java object**
- A plain old java object is a class that generally only has instance fields.
- It used to house data, and pass data between functional classes.It usually has few, if any methods other than getters and setters.
- Many database frameworks use POJO's to read data from, or to write data to, databases, files or streams.
- A POJO also might be called a bean or javabean.
- A javabean is just a POJO, with some extra rules applied to it.
- A POJO sometimes called an entity, because it mirrors database entities.
- Another acronym is DTO , for Data Transfer Object.
- It's a description of an object, that can be modeled as just data.

**Inheritance:**
- We can look at inheritance as a form of code re-use.
- It's a way to organize classes into a parent-child hierarchy, which lets the child inherit (re-use) fields and methods
  from its parent.

**super():**
- super() is a lot like this().
- It's a way to call a constructor on the super class, directly form the subclass's constructor.
- Like this() it has to be the first statement of the constructor.
- Because of that rule, this() and super() can never be called from the same constructor.
- If you don't make a call to super() then java makes it for you using super's default constructor.
- If your super class doesn't have a default constructor than you must explicitly call super() in all your constructor
  passing the right arguments to that constructor.

**Overriding a method:**
- Overriding a method is when you create a method on a subclass, which has the same signature as a method on a super class.
- You override a parent class method, when you want the child class to show different behaviour for that method.

**The overridden method can do one of three things:**
- It can implement completely different behaviour overriding the behaviour of the parent.
- It can simply call the parent class's method which is somewhat redundant to do.
- Or the method can call the parent class's method and include other code to run, so it can extend the functionality for 
  the dog for that behaviour.