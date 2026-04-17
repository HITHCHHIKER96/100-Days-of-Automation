datatype{] variable_name = new datatype
// syntax :
    datatype[] variable_name = new datatype[size];
	int[] var1 = new int[5]; // this line means that the reference variable "var1" is pointing an array object that ype is integer.
	// or directly
	int[] var2 = {23, 6, 78, 10, 23};

So what is actually happening is:
	1. int[] var1 : this is the declaration of array. var1 is getting defined in the stack. and also this thing happened at "COMPILE" Time.
	2. new int[5] : this is the initialisation: actualy object is created is here in the heap memory. and this happened at "RUNTIME". and this is called "DYNAMIC MEMORY ALLOCATION" where this array created at runtime.And this "new" keyword is used to create an object in heap memory.
and Heap Objects that are not "CONTINOUS" in Java. Internally Array is not continous in JAVA, basically depends on JVM.
