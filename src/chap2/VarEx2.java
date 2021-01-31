package chap2;
/*
 * 리터널 상수값
 * 
 * 리터널에 사용되는 접미사
 * L,l : long형 리터널로 설정
 * F,f : float형 리터널로 설정
 * D,d: double형 리터널로 설정
 * 
 * 자료형 => 암기할 것
 * 기본자료형
 * 		논리형 : boolean (1바이트)
 * 		문자형 : char(2바이트)
 * 		정수형 : byte(1바이트), short(2바이트), int(4바이트), long(8바이트)
 * 		실수형 : float(4바이트), double(8바이트)
 * 참조자료형 : 사용자정의 자료형 또는 자바 API 클래스.=> 객체. 
 * 		배열
 * 		클래스
 * 		인터페이스
 * 
 * 형변환:
 * 1: 기본자료형과 참조자료형간의 형변환 불가. (Wrapper 클래스는 예외)
 * 2. 기본자료형 중 boolean을 제외한 나머지 7가지의 자료형은 서로 형변환됨.
 * 3. 형변환 연산자 생략 가능 => 자동형변환
 *    형변환 연산자 생략 불가능=> 명시적형변환
 * */


public class VarEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b1 = 10;
		short s1 = 100;
		
		int i1 = 1000;
		long l1 = 10000;
		
		float f1 = (float)10.5; // 실수형 리터널은 기본 double 형으로 취급한다.
		float f2 = 10.5F; //float 리터널로 초기화시 f를 붙인다.
		double d1 = 10.5;
		System.out.println(f1);
		System.out.println(d1);
		
		double d2 = i1; // int형 값이 double형으로 형변환 (작은 자료형에서 큰 자료형으로 변환 : 값의 유실이 없음.)
		System.out.print(d2);
		float f3 = (float)d2; // double 타입이 float 형변환 (큰 자료형에서 작은 자료형으로 변환 : 값의 유실 가능성 있음.)
								// 형변환연산자 생략 불가=명시적 형변환
	
	}

}
