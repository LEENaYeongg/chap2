package chap2;
/*
 * 1. public class VarEx1 => ������ �̸��� �ݵ�� VarEx1.java ������.
 * 		������ �̸��� public class�� �̸��� ���ƾ���.
 * 		=> �� ���� �ڹ� �ҽ� ���Ͽ��� �Ѱ��� public class�� �����ؾ� ��.
 * 2. �ڹٴ� ��ҹ��ڸ� �����Ѵ�.
 * 		num, NUM ������ �ٸ� �����̴�.
 * 3. �ڹ� �����Ϸ� : javac
 * 		=> VarEx1.java �ҽ������� �����Ͽ�, VarEx1.class ������ ������.
 * 	     �ڹ� �������� : java
 * 		=> JVM ȯ���� ����. ����Ʈ �ڵ带 �����ϴ� ���.
 * 4. �ڹ��� ������ �ݵ�� ;���� �����ؾ���.
 * 5. �ּ� : ������ ���� �ʴ� ���� => ������ ����� ����.
 * 	    ���� ���Ǵ� /* * / ������ �ּ� ������.
 *    // ���� �ּ�
 * */
public class VarEx1 {

	public static void main(String[] args) { //���α׷��� ����
		// TODO Auto-generated method stub
		int num; //���� ����
		num=100; // ���� �ʱ�ȭ
		byte b1= 100; //byte: -128~127 ���� ���� ����.
		short s1 =200;
		int i1 = 300;
		long l1=400;
		System.out.println(num);
		System.out.println(b1);
		System.out.println(s1);
		System.out.println(i1);
		System.out.println(l1);
		
		byte b2 = (byte)310;
		System.out.println(b2);
	}

}
