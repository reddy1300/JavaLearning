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