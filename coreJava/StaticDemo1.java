package coreJava;
class Studen{
static int id;
	String name;
	String address;
	
	Studen(int id,String name,String address){
		this.id=id;
		this.name=name;
		this.address= address;
	}
	public static void info(){
    System.out.println(Studen.id);
	}
	
  public void information(){
	System.out.println(id+" "+this.name);;
	
}
	@Override
	public String toString() {
		return "Student [name=" + name + ", address=" + address + "]";
	}
}
public class StaticDemo1 {

	public static void main(String[] args) {
System.out.println(Studen.id);
Studen.id=2;
System.out.println(Studen.id);
Studen st= new Studen(3, "priya","delhi");//override student id
System.out.println(st.id);
System.out.println(Studen.id);
Studen.info();
st.information();

	}

}
