package chap2;

public class OpEx04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte a = 10;
		byte b = 20;
		byte c = (byte)(a + b); // int���� ���� �ڷ����� �������� int����.

		char ch = 'A';
		ch = (char)(ch+ 2); // int���� ���� �ڷ����� �������� int����.

		float f = (float)(3 / 2); // float f = 3f / 2;

		long l= (long)(3000 * 3000 * 3000); //long l= 3000L * 3000 * 3000; 
		                                                 // => ���� ū �ڷ����� �i�� ���Ƿ� �Ѱ��� �ٲ㵵 �ȴ�.
		float f2 = 0.1f;
		double d = 0.1f;
		boolean result = d==f2;

		System.out.println("c="+c);
		System.out.println("ch="+ch);
		System.out.println("f="+f);
		System.out.println("l="+l);
		System.out.println("result="+result);

	}

}
