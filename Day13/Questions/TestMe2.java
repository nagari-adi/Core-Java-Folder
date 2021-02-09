package tester;

public class TestMe2 {

	public static void main(String[] args) {
		int b1=120;
		test(b1);

	}
//	private static void test(int i) 
//	{
//		System.out.println("1");
//	}
//	private static void test(Integer i) //auto boxing 
//	{
//		System.out.println("2");
//	}
	private static void test(int... i) //var-args
	{
		System.out.println("3");
	}
	

}
