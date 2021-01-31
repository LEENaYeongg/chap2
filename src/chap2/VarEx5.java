package chap2;
/*
 * 특수문자 : \
 * 
 * */
public class VarEx5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char single = '\''; //문자 : 한개의 문자 저장. '
		String str = "Hello \"홍길동\""; // 문자열 : " 로 표시.
		System.out.println(str);
		String dir = "c:\\";
		System.out.println(dir);
		
		System.out.println("서울\t대전\t대구\t부산"); // \t : tab 표시
		System.out.println("안녕하세요\n이부분은 다음줄에 출력됩니다."); // \n : 다음줄로 넘기기
		System.out.println("\uD64D\uAE38\uB3D9"); // \ u : 유니코드값. 코드값을 16진수로 표시.
		
		
	}

}
