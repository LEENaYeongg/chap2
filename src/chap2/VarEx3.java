package chap2;
/*
 * �ٸ� �ڷ������� ���� => ����� ū�ڷ���
 * => int������ �����ڷ����� ������ ����� int��.
 * 
 * */

public class VarEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b1=10;
		int i1=20;
		float f1=10.5f;
		double d1 =1.0;
		
		int i2=b1+i1;
		System.out.println(i2);
		float f2 = i1+f1;
		System.out.println(f2);
		double d2 = f1 + d1;
		System.out.println(d2);
		
		float l1 =f1 +1000L; //float > long �̹Ƿ�, float = float+long
		System.out.println(l1);
		byte b2 =10;
		byte b3 = (byte)(b1+b2); //int���� ���� �ڷ��� ������ ����� int��.
		System.out.println(b3);
		int b4 = b1+b2;
		
		//char ���� ����ȯ
		char c1= 'A'; // 65 : 64 + 1 : 01000001
		System.out.println(c1 + "=" + (int)c1);
		char c2 = (char)(c1 + 32); //97 :64 +32 +1 : 01100001
		System.out.print(c2); //a
		System.out.println(c2 + "=" + (int)c2);
	}

}
