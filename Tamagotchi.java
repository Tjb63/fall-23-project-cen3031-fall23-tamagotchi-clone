public class Tamagotchi {
  /**
   * Name of Tamagotchi.
   * 
   */
  private String name;
  private double effectMultiplier;
  private int baseHunger;
  private int baseThirst;

  // Status fields, probably needs to be cleaned up
  private Status hunger;
  private Status thirst;
  private Status hygiene;

  /**
   * Default contructor for Tamagotchi class. Sets fields to default values.
   * 
   */
  public Tamagotchi() {
    name = "";
    hunger = new Status("Hunger");
    thirst = new Status("Thirst");
    hygiene = new Status("Hygiene");
    effectMultiplier = 1;
    baseHunger = 1;
    baseThirst = 1;
  }

  /**
   * Parameterized constructor for Tamagotchi class. Sets fields to given values.
   * 
   * @param name String to set Tamagotchi's name.
   */
  public Tamagotchi(String name) {
    this.name = name;
    hunger = new Status("Hunger");
    thirst = new Status("Thirst");
    hygiene = new Status("Hygiene");
    effectMultiplier = 1;
    baseHunger = 1;
    baseThirst = 1;
  }

  /**
   * Parameterized constructor for Tamagotchi class. Sets fields to given values.
   * 
   * @param name String to set Tamagotchi's name.
   * @param effectMultiplier double to set effectMultiplier to.
   * @param baseHunger nt to set baseHunger to.
   */
  public Tamagotchi(String name, double effectMultiplier, int baseHunger, int baseThirst) {
    this.name = name;
    hunger = new Status("Hunger");
    thirst = new Status("Thirst");
    hygiene = new Status("Hygiene");
    this.effectMultiplier = effectMultiplier;
    this.baseHunger = baseHunger;
    this.baseThirst = baseThirst;
  }

  /**
   * Getter for Tamagotchi name.
   * 
   * @return String representation of Tamagotchi's name.
   */
  public String getName() {
    return name;
  }

  /**
   * Setter for Tamagotchi name.
   * 
   * @param name String to set Tamagotchi's name to.
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Get the status values of the Tamagotchi.
   * 
   * @return String representation of Tamagotchi's status
   */
  public String getStatus() {
    return hunger.toString() + "\n" + thirst.toString() + "\n" + hygiene.toString() + "\n";
  }

  /**
   * Setter for effect multiplier.
   * 
   * @param effectMultiplier double to set effectMultiplier to.
   */
  public void setEffectMultiplier(double effectMultiplier){
    this.effectMultiplier = effectMultiplier;
  }

  /**
   * Setter for base hunger.
   * 
   * @param baseHunger int to set baseHunger to.
   */
  public void setBaseHunger(int baseHunger){
    this.baseHunger = baseHunger;
  }

  /**
   * Setter for base Thirst.
   * 
   * @param baseThirst int to set baseThirst to.
   */
  public void setBaseThirst(int baseThirst){
    this.baseThirst = baseThirst;
  }

  /**
   * Increments the hunger of the tamagochi.
   * It is calculated by geting the old value and adding the multiplication of the baseHunger stat and the effectMultiplier. 
   * 
   */
  public void hungerIncrement(){
    int newHunger = hunger.getValue() + (int)(baseHunger * effectMultiplier);
    if(newHunger > 100){
      newHunger = 100;
    }
    hunger.setValue(newHunger);
  }

  /**
   * Decreases the amount hunger of the tamagochi by a certain value.
   * It is calculated by geting the old value and substracting the selected amount. 
   * 
   * @param amount int amount to remove from hunger.
   */
  public void feed(int amount){
    int newHunger = hunger.getValue() - amount;
    if(newHunger < 0){
      newHunger = 0;
    }
    hunger.setValue(newHunger);
  }

  /**
   * Fully feeds tamagotchi.
   * Hunger is set to 0 
   * 
   */
  public void fullFeed(){
    hunger.setValue(0);
  }

  /**
   * Increments the thirst of the tamagochi.
   * It is calculated by geting the old value and adding the multiplication of the baseThirst stat and the effectMultiplier. 
   * 
   */
  public void thirstIncrement(){
    int newThirst = thirst.getValue() + (int)(baseThirst * effectMultiplier);
    if(newThirst > 100){
      newThirst = 100;
    }
    thirst.setValue(newThirst);
  }
}
