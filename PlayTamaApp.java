import java.util.Scanner;

public class PlayTamaApp {
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		// Input variables and setup
		// input.useDelimiter("\r");
		int choice = 0;

		Tamagotchi currTamagotchi = null;
		TamaSimulation currSimulation = null;
		Thread timeThread = null;

		System.out.println("Starting Tama App");

		// Tamagotchi Setup
		do {
			choice = 0;
			System.out.println();
			System.out.println("1. New Tamagotchi");
			System.out.println("2. Existing Tamagotchi");
			System.out.println();
			System.out.print("Enter choice: ");

			choice = input.nextInt();
			// input.nextLine();

			switch (choice) {
				case 1: // New Tamagotchi
					GenerateTamagotchi newTama = new GenerateTamagotchi();
					currTamagotchi = newTama.getTamagotchi();
					break;

				case 2: // Existing Tamagotchi
					LoadTamagotchi existingTama = new LoadTamagotchi();
					currTamagotchi = existingTama.getTamagotchi();
					break;

				default:
					System.out.println("Please enter 1 or 2.");
					break;
			}
		} while (choice > 2 || choice < 1);

		// Tamagotchi is now selected, start simulation
		currSimulation = new TamaSimulation(currTamagotchi);
		timeThread = new Thread(new Time(currTamagotchi));
		timeThread.start();
		currSimulation.run();

		System.out.println("Thank you for playing!");
		input.close();

	}

}
