package chap2;
/*
 * 1. public class VarEx1 => 파일의 이름은 반드시 VarEx1.java 여야함.
 * 		파일의 이름은 public class의 이름과 같아야함.
 * 		=> 한 개의 자바 소스 파일에는 한개의 public class만 존재해야 함.
 * 2. 자바는 대소문자를 구분한다.
 * 		num, NUM 변수는 다른 변수이다.
 * 3. 자바 컴파일러 : javac
 * 		=> VarEx1.java 소스파일은 번역하여, VarEx1.class 파일을 생성함.
 * 	     자바 인프리터 : java
 * 		=> JVM 환경을 생성. 바이트 코드를 실행하는 기능.
 * 4. 자바의 문장은 반드시 ;으로 종료해야함.
 * 5. 주석 : 컴파일 되지 않는 영역 => 문법과 상관이 없다.
 * 	    현재 사용되는 /* * / 영역이 주석 영역임.
 *    // 한줄 주석
 * */
public class VarEx1 {

	public static void main(String[] args) { //프로그램의 시작
		// TODO Auto-generated method stub
		int num; //변수 선언
		num=100; // 변수 초기화
		byte b1= 100; //byte: -128~127 까지 값만 저장.
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
