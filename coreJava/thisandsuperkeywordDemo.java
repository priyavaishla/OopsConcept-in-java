package coreJava;
class car{
	int id;
	String name;

car(int id,String name){
	this.id=id;//THIS IS USED HERE FOR SOLVING THE PROBLEM OF NAME CONFLICT
	this.name=name;	
}

public void fun1(){
	System.out.println("parent car");
}
}
class swift extends car{

	swift(int id, String name) {
		super(id, name);//parent constructor call first
	this.id=id;
	this.name=name;
	}
public void fun2(){
	super.fun1();
	System.out.println("child function call");
	this.fun3();
	
}
public void fun3(){
	
	System.out.println("child func3 call");
	
}
}
public class thisandsuperkeywordDemo {

	public static void main(String[] args) {
	swift sf= new swift(2,"swiftcar");
	sf.fun2();
	

	}

}
