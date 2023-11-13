public class GenerateTamagotchi {
  private Tamagotchi generatedTamagotchi;

  /**
   * Runs user throught the process of making a new Tamagotchi
   * 
   */
  public GenerateTamagotchi() {
	  int sumAnswers = QuestionBank();
	  switch(sumAnswers) { //Implemented to do num of tamagotchis / range of question sums, determines model
	  	case 3:
	  	case 4:
	  		System.out.println("Tamo Model 1");
			break;
	  	case 5:
	  	case 6:
	  	case 7:
	  		System.out.println("Tamo Model 2");
			break;
	  	case 8:
	  	case 9:
	  		System.out.println("Tamo Model 3");
			break;
		default:
			System.out.println("ERROR: Out of range");
			break;
	  }
	  
	  String TamoName = "";
	  do {
			System.out.println();
			System.out.println("Enter the name for your Tamogotchi");
			System.out.println();
			System.out.print("Enter name: ");

			TamoName = PlayTamaApp.input.nextLine();
			TamoName = PlayTamaApp.input.nextLine(); //Need to investigate further, bugs if this is not here, not familar with scanner enough to understand why

			if(TamoName == "")
				System.out.println("Please enter a valid name.");
		} while (TamoName == "");
	  generatedTamagotchi = new Tamagotchi(TamoName);
  }
  
  public int QuestionBank() {
	  int sum = 0;
	  sum = Question1() + Question2() + Question3();
	  return sum;
  }
  
  public int Question1() {
	  int choice = 0;
	  int answer = 0;
	  
	  do {
			choice = 0;
			System.out.println();
			System.out.println("Are you introverted or extroverted?");
			System.out.println("1. Introverted");
			System.out.println("2. In Between");
			System.out.println("3. Extroverted");
			System.out.println();
			System.out.print("Enter choice: ");

			choice = PlayTamaApp.input.nextInt();

			switch (choice) {
				case 1:
					answer = 1;
					break;

				case 2:
					answer = 2;
					break;

				case 3:
					answer = 3;
					break;

				default:
					System.out.println("Please enter 1, 2, or 3.");
					break;
			}
		} while (choice > 3 || choice < 1);
	  return answer;
  }
  
  public int Question2() {
	  int choice = 0;
	  int answer = 0;
	  
	  do {
			choice = 0;
			System.out.println();
			System.out.println("Are you logical or emotional?");
			System.out.println("1. Logical");
			System.out.println("2. In Between");
			System.out.println("3. Emotional");
			System.out.println();
			System.out.print("Enter choice: ");

			choice = PlayTamaApp.input.nextInt();

			switch (choice) {
				case 1:
					answer = 1;
					break;

				case 2:
					answer = 2;
					break;

				case 3:
					answer = 3;
					break;

				default:
					System.out.println("Please enter 1, 2, or 3.");
					break;
			}
		} while (choice > 3 || choice < 1);
	  return answer;
  }
  
  public int Question3() {
	  int choice = 0;
	  int answer = 0;
	  
	  do {
			choice = 0;
			System.out.println();
			System.out.println("What is your favorite animal group?");
			System.out.println("1. Mammals");
			System.out.println("2. Insects");
			System.out.println("3. Aquatic");
			System.out.println();
			System.out.print("Enter choice: ");

			choice = PlayTamaApp.input.nextInt();

			switch (choice) {
				case 1:
					answer = 1;
					break;

				case 2:
					answer = 2;
					break;

				case 3:
					answer = 3;
					break;

				default:
					System.out.println("Please enter 1, 2, or 3.");
					break;
			}
		} while (choice > 3 || choice < 1);
	  return answer;
  }

  /**
   * Returns the generated Tamagotchi
   * 
   * @return New Tamagochi
   */
  public Tamagotchi getTamagotchi() {
    return generatedTamagotchi;
  }

}
