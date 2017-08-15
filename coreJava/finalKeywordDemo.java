package coreJava;
final class mobile{
	final int id;//because this is blank here we need to initialize it
	String name;
mobile(){
	id=1;
}
@Override
public String toString() {
	return "mobile [id=" + id + ", name=" + name + "]";
}


public void fun1(){
	int y;
	//System.out.println(y);  local variable is also a  blank variable  so we don't access it before initialization
}
}
/*class android extends mobile{
	//this shows error because we don't expand the final class and not override the final methods.
}*/

public class finalKeywordDemo {

	public static void main(String[] args) {
		
mobile samsung= new mobile();
System.out.println(samsung);
samsung.fun1();
	}

}
