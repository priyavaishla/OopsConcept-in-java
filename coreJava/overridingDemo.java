package coreJava;
class person{
	int id;
	String name;
	String address;
	 public void data(){
		 System.out.println("hey! welcome in the java world");
	 }
}
	class starry extends person{
		/*@Override
		public void data(){
			System.out.println("student function call");
		}
*/
		@Override
		public String toString() {
			return "student [id=" + id + ", name=" + name + ", address="
					+ address + "]";
		}
		
	}

public class overridingDemo {

	public static void main(String[] args) {
		starry priya = new starry();
		priya.id=1;
		priya.name="priya";
		priya.address="modinahar";
System.out.println(priya);
priya.data();

	}

}
