import java.util.Scanner;

public class Powers_Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Welcome the user
		System.out.println("Welcome to the Squares and Cubes table");
		System.out.println();

		Scanner sc = new Scanner(System.in);
		String choice = "y";

		do {
			// Get input from the user
			System.out.print("Enter an integer: ");
			int input = sc.nextInt();

			// Create a header
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

			// See if the user wants to continue
			System.out.print("Continue? (y/n): ");
			choice = sc.next();
			System.out.println();

		} while (!choice.equalsIgnoreCase("n"));

		System.out.println("See ya next time!");

	}

}
