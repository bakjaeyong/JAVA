
public class Tutorial3 {

	public static void main(String[] args) {
		//if else ���ǹ�
		String a = "Man";
		int b = 0;
		
		// �ڹٴ� String�� ���� �� equal()�� �̿��մϴ�.
		// �� ������ String�� �ٸ� �ڷ����� �ٸ� ���ڿ� �ڷ����̱� �����Դϴ�.
		if (a.equals("Man")) 
		{
			System.out.println("�����Դϴ�.");
		}
		else 
		{
			System.out.println("���ڰ� �ƴմϴ�.");
		}
		if (b == 3) 
		{
			System.out.println("b�� 3�Դϴ�.");
		}
		else 
		{
			System.out.println("b�� 3�� �ƴմϴ�.");
		}
		if(a.equalsIgnoreCase("man") && b == 0)
		{
			System.out.println("���Դϴ�.");
		}
		else 
		{
			System.out.println("�����Դϴ�.");
		}
	}

}
