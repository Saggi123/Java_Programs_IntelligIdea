/*import java.io.*;
public class Customergrabage {
    Customer obj=new Customer();//variable obj of customer type the new keyword allocates memory for the object in the heap;
Now if we have a main function it will create a block of memory for the main in stack. All the data members will have memory allocated inside main block
Then if we call the read function a separate block of memory for read will be created inside main block in stack to store local variables.
All data members of read function will be allocated in the read block inside main block
All the memory in stack will point to a memory in heap
once we come out of main function the stack gets free but heap memory stays there
Java has a program called garbage collector in the jvm it will monitor the heap area for the objects not used anymore
(i.e. there is no memory for it in the stack) it will clear the memory for those objects
Global variables will be in code area the entire code will be in code area anything in the code area will be available throughout
finalize method will be called before doing garbage collection by the garbage collector.Any code we want to run before doing garbage collector
will be kept inside the finalize method
functions will have memory in code area
data members in heap area and local variables in stack

Outer Layer is JDK iside JDK is JRE and inside that is JVM

JDK stands for java development kit. It contrains a lot of packkages which contains classes with features of Java.
The entire functionality of the java program is conatined in packages inside the JDK

  JVM is patform dependant however they can run any class file created
}*/
