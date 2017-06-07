public class Test{
	
	static{
		print(10);
	}
	static void print (int x) {
		System.out.println (x);
		System.exit(0);
	}
	
	public static void main(String[] args){
		//Test t = new Test();
		Test.print(50);
	}

}