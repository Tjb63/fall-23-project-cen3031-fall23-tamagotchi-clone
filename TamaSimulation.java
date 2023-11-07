import java.util.Scanner;

public class TamaSimulation {
  private Tamagotchi currTamagotchi;
  private Boolean running = true;

  /**
   * Constructor that creates Simulation with given Tamagotchi.
   * 
   * @param currTamagotchi The tamagotchi being used.
   */
  public TamaSimulation(Tamagotchi currTamagotchi) {
    this.currTamagotchi = currTamagotchi;
  }

  /**
   * Starts the Tamagotchi Simulation
   * 
   */
  public void run() {
    // Input handling variables
    Scanner input = new Scanner(System.in);
    // input.useDelimiter("\r");
    int choice;
    
    new Thread(() -> {checkDeath();}).start();

    // Menu loop
    while (running) {
      
      printStatus();
      choice = 0; // Reset choice variable before use

      choice = input.nextInt();
      // input.nextLine();
      
      if(!running) {
    	  System.out.println("Your Tamagotchi has died!");
    	  choice = 9;
      }
      
      switch (choice) {
        case 1: // Feed
          currTamagotchi.fullFeed();
          System.out.println("Gave " + currTamagotchi.getName() + " food!");
          System.out.println();
          break;

        case 2: // Water
          currTamagotchi.fullWater();
          System.out.println("Gave " + currTamagotchi.getName() + " water!");
          System.out.println();
          break;

        case 3: // Play
          currTamagotchi.fullPlay();
          System.out.println("Played with " + currTamagotchi.getName() + "!");
          System.out.println();
          break;

        case 4: // Bathe
          currTamagotchi.fullBathe();
          System.out.println("Bathed " + currTamagotchi.getName() + "!");
          System.out.println();
          break;
          
        case 5: // Bathe
            printStatus();
            break;
            
        case 8:
        	SaveTamagotchi saveTama = new SaveTamagotchi();
        	saveTama.save(currTamagotchi.getFullStatus());
        	break;

        case 9: // Exit
          input.close(); // NOTE: Will close the System.in in the main scanner as well. Will need to
                         // change if want to loop the main menu
          return;

        default: // Do nothing
          break;
      }

    }
    
    input.close();
  }
  
  private void checkDeath() {
	  while(running) {
		  try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		  if(currTamagotchi.checkDead()) {
			  running = false;
		  }
	  }
  }
  
  /**
   * Prints the Tamagotchi status
   * 
   */
  private void printStatus() {
	  System.out.println("Name: " + currTamagotchi.getName());
      System.out.print(currTamagotchi.getStatus());

      // Action menu
      System.out.println("1. Give " + currTamagotchi.getName() + " food");
      System.out.println("2. Give " + currTamagotchi.getName() + " water");
      System.out.println("3. Play with " + currTamagotchi.getName());
      System.out.println("4. Bathe " + currTamagotchi.getName());
      System.out.println("8. Save");
      System.out.println("9. Exit");
      System.out.println();
      System.out.print("Enter choice: ");
  }
}
