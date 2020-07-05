import java.util.Scanner;
public class Test {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
	
		System.out.print("enter the student grade: ");
		
		int grade = input.nextInt();
		
		switch (grade) {
		
		case 70:
			System.out.println("A");
		 break;
		 
		case 60:
			 System.out.println("B");
			 break;
			 
		case 50:
			 System.out.println("C");
			 break;
			 
		case 40: 
			 System.out.println("D");
		 break;
		
		case 30:
			System.out.println("failed");
			break;
		default: 
			System.out.println("You did not take the exam");
		}		
		
	}
}
