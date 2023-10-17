class Bike{
	String name;
	int id;
	String size;
	
	public void display() {
		System.out.println("details of bike:");
	}
	
}
class Example{
	public static void main(String args[]) {
		Bike obj=new Bike();
		obj.display();
		obj.name="honda";
		obj.id=123;
		obj.size="large";
		System.out.println(obj.name);
		System.out.println(obj.id);
		System.out.println(obj.size);
	}
}
