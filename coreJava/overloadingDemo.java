package coreJava;
class product{
	int id;
	String name;
	double price;
	
public void information(int id,String name){
	System.out.println("welcome ");
	
}
	
public void information(String name,double price){
	System.out.println("welcome priya");
	
}	
	
	
	
	
}
public class overloadingDemo {

	public static void main(String[] args) {
	product pr= new product();
	pr.information(1, "android");
	pr.information("cars", 1000000.00);
//decided in a runtime which implementation of a  function is execute
	}

}
