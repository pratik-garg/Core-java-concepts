//int , float , char , double 
public class WrapperclassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 5;
		Integer ii = new Integer(i);  // in-built class
		//boxing or wrapping of primitive data type into object 
		int j = ii.intValue();  
		//unboxing of the object to primitive data type
		System.out.println(j);
		
		// some more examples
		char ch = 'A';
		Character k = new Character(ch);  // k named object created
		
		// now 
		System.out.println(k.charValue());  //unboxed or unwrapped
		
		// now comes to autoboxing  and autounboxing
		// here we dont need to create object by new keyword
		Double d = 2.34;  // this d is object and value directly asigned 
		System.out.println(d); //this value directly returened 
		// no need to call get method
		
		
		// why we are learning it ???
		// in java hibernate and collection api does not suppoort primitive data type
		// here the super class of these wrapper class is Number which is abstract class
		Number a = new Integer(5);
		System.out.println(a);  // will print 5
		
		String str = "123";
		int n = Integer.parseInt(str);
		System.out.println(n); // will print 123 as number
		n = n + 2;
		System.out.println(n); // 125
	}

}
