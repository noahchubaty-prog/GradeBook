import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Welcome to your Grade Book!");
		int x=in.nextInt();
		if (x>100) {
			System.out.println("Too high. Try again.");
			while (x>100) { 
				System.out.println("Too high. Try again.");
				x=in.nextInt();
			}
		}
		System.out.println("input grade:");
		
		int grade1 = in.nextInt();
		System.out.println("input grade:2");
        int grade2 = in.nextInt();
        
	}

}
