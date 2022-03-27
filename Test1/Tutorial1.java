
public class Tutorial1 {

	public static void main(String[] args) {
		// 조건문 연습
		String a = "I Love you";
		if (a.contains("Love")) 
		{
		   //포함되는 경우 실행되는 부분
			System.out.println("Me Too");
		}
		else 
		{
			//포함되지 않는 경우 실행
			System.out.println("I Hate you");
		}
		// 결과값은 위에 Love가 포함되었기 때문에 if부분 실행
	}

}
