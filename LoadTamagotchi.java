
public class LoadTamagotchi {
  private Tamagotchi loadedTamagotchi;

  /**
   * Runs the user through the process of loading an existing Tamagotchi
   * 
   */
  public LoadTamagotchi() {
    // TODO: Load Tamagotchi from file

    // TEMP TESTING TAMA
    loadedTamagotchi = new Tamagotchi("LoadTesto");
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
