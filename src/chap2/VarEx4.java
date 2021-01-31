package chap2;
/*
 * 식별자 정의 규칙
 * 권장사항 : 컴파일 오류 발생 안함
 * 클래스명 : 첫자는 대문자로 시작. 의미 변경시 대문자로
 * 메서드명 : 첫자는 소문자. 의미변경시 대문자로. => getName()
 * 변수명 : 첫자는 소문자. 의미변경시 대문자로. => studNo
 * 상수명 : 대문자표현. 의미변경시_		=> MAX_NUM
 * 
 * 규칙 : 컴파일 오류 발생
 * 1. 식별자는 반드시 문자와 숫자, _ , $만 가능함.
 * 		num1 (o)
 * 		max-num  (x) : - 사용 불가
 * 2. 숫자 시작 안됨.
 * 	   7Up  (x) : 숫자로 시작 안됨.
 * 3. _, $ 시작됨.
 * 		_id (o)
 * 4. 예약어 식별자 사용 불가
 * 		true (x)
 * 		True (o)
 * */
public class VarEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 10;
//		int max-num = 100; // 오류발생, - 식별자 사용 불가
//		int 7up = 100; // 오류발생, 숫자로 시작불가
		int _id = 1000;
		int $harp = 1000;
		
//		boolean true = false; // 오류 발생. 예약어 식별자로 사용 불가.
		
	}

}
