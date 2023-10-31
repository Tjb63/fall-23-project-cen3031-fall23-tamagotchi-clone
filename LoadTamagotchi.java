import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LoadTamagotchi {
  private Tamagotchi loadedTamagotchi;

  /**
   * Runs the user through the process of loading an existing Tamagotchi
 * @throws IOException 
   * 
   */
  public LoadTamagotchi() {
    // TODO: Load Tamagotchi from file
	  
	  String fileName = "data.txt"; // Replace with your file path

      String name = "";
      double effectMultiplier = 0.0;
      int hunger = 0;
      int thirst = 0;
      int hygiene = 0;
      int sadness = 0;
      int basehunger = 0;
      int basethirst = 0;
      int basehygiene = 0;
      int basesadness = 0;
      try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
	      name = reader.readLine(); 
	      effectMultiplier = Double.parseDouble(reader.readLine());
	       hunger = Integer.parseInt(reader.readLine());
	       thirst = Integer.parseInt(reader.readLine());
	       hygiene = Integer.parseInt(reader.readLine());
	       sadness = Integer.parseInt(reader.readLine());
	       basehunger = Integer.parseInt(reader.readLine());
	       basethirst = Integer.parseInt(reader.readLine());
	       basehygiene = Integer.parseInt(reader.readLine());
	       basesadness = Integer.parseInt(reader.readLine());
      }
      catch(IOException e) {
    	    e.printStackTrace();
      } catch (NumberFormatException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
       
      
    // TEMP TESTING TAMA
    loadedTamagotchi = new Tamagotchi(name, effectMultiplier, hunger, thirst, hygiene, sadness);
    loadedTamagotchi.setValues(basehunger, basethirst, basehygiene, basesadness);
  }

  /**
   * Returns the loaded Tamagotchi
   * 
   * @return Existing Tamagotchi
   */
  public Tamagotchi getTamagotchi() {
    return loadedTamagotchi;
  }
}
