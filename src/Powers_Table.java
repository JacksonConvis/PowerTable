import java.util.Scanner;

public class Powers_Table {

	public static void main(String[] args) {
		System.out.println("Welcome to the Squares and Cubes table \n");

		Scanner sc = new Scanner(System.in);
		String choice = "y";

		do {
			System.out.print("Enter an integer: ");
			int input = sc.nextInt();

			String header = "Number  " + "Squared " + "Cubed   " + "\n" + "======  " + "======= " + "=====   ";
			System.out.println(header);

			int squared = 0;
			int cubed = 0;

			String columns = "";
			for (int i = 1; i <= input; i++) {

				squared = i * i;
				cubed = i * i * i;

				columns = i + "       " + squared + "       " + cubed;
				System.out.println(columns);
			}

			System.out.print("Continue? (y/n): ");
			choice = sc.next();
			System.out.println("\n");

		} while (!choice.equalsIgnoreCase("n"));

		System.out.println("See ya next time!");

	}

}
