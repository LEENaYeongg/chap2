package chap2;
/*
 * Ư������ : \
 * 
 * */
public class VarEx5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char single = '\''; //���� : �Ѱ��� ���� ����. '
		String str = "Hello \"ȫ�浿\""; // ���ڿ� : " �� ǥ��.
		System.out.println(str);
		String dir = "c:\\";
		System.out.println(dir);
		
		System.out.println("����\t����\t�뱸\t�λ�"); // \t : tab ǥ��
		System.out.println("�ȳ��ϼ���\n�̺κ��� �����ٿ� ��µ˴ϴ�."); // \n : �����ٷ� �ѱ��
		System.out.println("\uD64D\uAE38\uB3D9"); // \ u : �����ڵ尪. �ڵ尪�� 16������ ǥ��.
		
		
	}

}
