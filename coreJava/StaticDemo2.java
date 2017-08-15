package coreJava;
class Employee{
	static int id;
	static String name;
     static	String address;
     
     
     public static void inform(){
    	id=1;
    	name="priyanka singh";
    	address="adarshnagar";
    	System.out.println(id+" "+name+" "+address);
     }
     
     public void  work(){
    	 int y;
    	 for(y=0;y<=5;y++)
    			 System.out.println("woeking in progress"+name);
    	 
     }
     
     
     
}
public class StaticDemo2 {

	public static void main(String[] args) {
		
Employee.inform();
Employee emp= new Employee();
emp.work();

	}

}
