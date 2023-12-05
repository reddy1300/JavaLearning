### Control Flow Statements

**Four key Control Statements:**
- Switch Statements
- For Statement
- While Statement
- Do While Statement

**The Switch Statement:** (Instead of if-else if we are using or testing a same variable)
`int value = 1;
switch (value){ 
    case 1:
        //Code for value 1
        break;
    case 2:
        //Code for value 2
        break;
    case 3: case 4: case 5:
        //Code for value 3, 4, 5
        break;
    default:
        //end statement
}`

**Switch Value Types:**
- Switch statement supports only few data types 

Valid Switch Value Types:
- byte, short, int, char
- Byte, Short, Integer, Character
- String
- enum

**Important:** Cannot use long, float, double or boolean or their wrappers. They result error in our code.

**Fall through in Switch Statement:**
- Once a switch case label matches the switch variable, no more cases are checked.
- Any code after the case label where there was a match found, will be executed, until a break statement, or the end of 
  the statement, or the end of the switch statement occurs.
- Without a break statement, execution will continue to fall through any case labels declared below the matching one, and
  execute each case's code.

**Traditional Switch Statement vs Enhanced Switch Statement:**

**Traditional Switch Statement:**
                                                          
`   int value = 1;                                 
    switch (value){
        case 1:
            System.out.println("Value was 1");
            break;
        case 2:
            System.out.println("Value was 2");
            break;
        case 3: case 4: case 5:
            System.out.println("Value was 3, 4, or 5");
            break;
        default:
        System.out.println("there is no matching value");
        break;
        }`

**Enhanced Switch Statement:**  
                                                         
`   int value = 1;
    switch (value){
        case 1 -> System.out.println("Value was 1");

        case 2 -> System.out.println("Value was 2");
                
        case 3, 4, 5 -> System.out.println("Value was 3, 4, or 5");
            
        default -> System.out.println("there is no matching value");
        }` 

- Default label is required in most conditions. but we have exception when we use enum.

**yield:**
- If we use code blocks in switch statement inside block to return an expression we don't have to use return instead we 
  have to use yield.
- The word yield is a new keyword introduced for the switch expression to turn a value back.
- always yield we have to use within a code block.

**Looping:**
- Looping lets us execute the code a multiple number of times.There are several looping statements in java.
- The statements will continue to execute a block of code repetitively, until a condition, or some set of condition is met.

**Java supports three looping statements:**

![looping statements](/Images/looping_statements.png)

**The for statement:**

- The for statement is often referred to as the for loop.
- It repeatedly loops something until a condition is satisfied.
- `for (init; expression; increment{}`
- **These parts are all optional and consists of the following:**
- The initialization section declares or sets state, usually declaring and initializing a loop variable, before the loop
  begins processing.
- The expression section, once it becomes false, will end the loop processing.
- The increment section is executed after the expression is tested, and is generally the place where the loop variable 
  is incremented.

**A Class:**
- A class can be described as 
- a custom data type.
- a special code block that contains methods.

**An Object:**
- An object is called an instance of a particular class.

**Declaring and instantiating a new object from a Class:**
- The most common way to create an object, is to use the new keyword.
- The new keyword creates an instance, and you can sometimes pass data, when creating an instance, to set up data on that
  object.

**Reading data from the console:**

 ![read data from console](/Images/Reading_data_from_console.png)