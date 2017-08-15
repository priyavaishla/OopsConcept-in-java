package coreJava;
abstract class family{
	int id;
	String name;
	
	abstract public void fun1();
	
	public void fun2(){
		System.out.println("this is not abstract method");
		//if class is abstract than it is not necessary that method is also abstract.
	} 
	
}
class jointfamily extends family{

	@Override
	public void fun1() {
		System.out.println("overriden mothod which have implementation");	
	}
	
}
public class abstractionDemo {

	public static void main(String[] args) {
		jointfamily jn= new jointfamily();
		jn.id=1;
		jn.name="vaishla";;
		jn.fun2();
		jn.fun1();
		System.out.println(jn);
		
	}

}
