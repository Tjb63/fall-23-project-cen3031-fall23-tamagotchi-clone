public class GenerateTamagotchi {
  private Tamagotchi generatedTamagotchi;

  /** Runs user throught the process of making a new Tamagotchi
   * 
   */
  public GenerateTamagotchi() {
    // TODO: Set up Tamagotchi generation logic

    // TEMP TESTING TAMA
    generatedTamagotchi = new Tamagotchi("GenerateTesto");
  }

  /** Returns the generated Tamagotchi
   * @return New Tamagochi
   */
  public Tamagotchi getTamagotchi() {
    return generatedTamagotchi;
  }
  
}
