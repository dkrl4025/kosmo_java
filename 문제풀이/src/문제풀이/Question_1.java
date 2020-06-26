package 문제풀이;

public class Question_1 {

	public static void main(String[] args) {
		
		int a = 10,b = 10;
		boolean c = ++a > b++ || a++ >= ++b;
		System.out.println(a+ "," + b);
		System.out.println("변수 c의 값:" +c);
	}

}
