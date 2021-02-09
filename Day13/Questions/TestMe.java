package tester;

public class TestMe {

	public static void main(String[] args) {
		byte b1=120;
		test(b1);

	}
//	private static void test(int i) //widening
//	{
//		System.out.println("1");
//	}
	private static void test(Integer i) //auto boxing byte : Byte ----> XXXXXXXXX --->Integer
	{
		System.out.println("2");
	}
	private static void test(int... i) //var-args
	{
		System.out.println("3");
	}
	

}
