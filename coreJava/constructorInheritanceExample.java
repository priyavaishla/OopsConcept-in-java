package coreJava;
interface Institution{
	public void fun1();
	public void fun2();}

class ducat implements Institution{
	int id;
	String name;
	String address;

	@Override
	public void fun1() {
		System.out.println("f1 overriden");}

	@Override
	public void fun2() {
		System.out.println("f2 overriden");}}
	
class studentse extends ducat{
	public void method(){
		int i;
		for (i=0;i<=2;i++)
			System.out.println(i);
		
	}
}
public class constructorInheritanceExample {
	
	public static void main(String[] args) {
		
studentse st= new studentse();
st.id=1;
st.address="modinagar";
st.fun1();
st.fun2();
st.method();
System.out.println(st);

	}

}
