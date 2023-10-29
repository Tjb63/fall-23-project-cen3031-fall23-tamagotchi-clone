import java.util.Scanner;

public class PlayTamaApp {
  public static void main(String[] args) {
    // Input variables and setup
    Scanner input = new Scanner(System.in);
		input.useDelimiter("\r");
		int choice = 0;

    Tamagotchi currTamagotchi = null;
    TamaSimulation currSimulation = null;

    System.out.println("Starting Tama App");

    // Main game loop
    while (true) {

      // Tamagotchi Setup
			do {
				choice = 0;
				System.out.println();
				System.out.println("1. New Tamagotchi");
				System.out.println("2. Existing Tamagotchi");
				System.out.println();
				System.out.print("Enter choice: ");

				choice = input.nextInt();
				input.nextLine();

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
      input.close();

      // Tamagotchi is now selected, start simulation
      currSimulation = new TamaSimulation(currTamagotchi);
      currSimulation.run();

    }
  }
}
