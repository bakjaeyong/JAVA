
public class Tutorial2 {

	public static void main(String[] args) {
		
		//점수에 따라서 다른 메세지를 출력하는 프로그램 작성
		int score = 95;
		
		if (score >= 90) 
		{
			System.out.println("A+입니다.");
		}
		else if (score >= 80) 
		{
			System.out.println("B+입니다.");
		}
		else if (score >= 70) 
		{
			System.out.println("C+입니다.");
		}
		else
		{
			System.out.println("F입니다.");
		}
	}

}
