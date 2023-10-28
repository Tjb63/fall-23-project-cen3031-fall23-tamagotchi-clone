public class Tamagotchi {
  /**
   * Name of Tamagotchi.
   * 
   */
  private String name;
  private double effectMultiplier;
  private int baseHunger;
  private int baseThirst;
  private int baseHygiene;
  private int baseSadness;
  // Status fields, probably needs to be cleaned up
  private Status hunger;
  private Status thirst;
  private Status hygiene;
  private Status sadness;

  /**
   * Default contructor for Tamagotchi class. Sets fields to default values.
   * 
   */
  public Tamagotchi() {
    name = "";
    hunger = new Status("Hunger");
    thirst = new Status("Thirst");
    hygiene = new Status("Hygiene");
    sadness = new Status("Sadness");
    effectMultiplier = 1;
    baseHunger = 1;
    baseThirst = 1;
    baseHygiene = 1;
    baseSadness = 1;
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
    sadness = new Status("Sadness");
    effectMultiplier = 1;
    baseHunger = 1;
    baseThirst = 1;
    baseHygiene = 1;
    baseSadness = 1;
  }

  /**
   * Parameterized constructor for Tamagotchi class. Sets fields to given values.
   * 
   * @param name String to set Tamagotchi's name.
   * @param effectMultiplier double to set effectMultiplier to.
   * @param baseHunger nt to set baseHunger to.
   */
  public Tamagotchi(String name, double effectMultiplier, int baseHunger, int baseThirst, int baseHygiene, int baseSadness) {
    this.name = name;
    hunger = new Status("Hunger");
    thirst = new Status("Thirst");
    hygiene = new Status("Hygiene");
    sadness = new Status("Sadness");
    this.effectMultiplier = effectMultiplier;
    this.baseHunger = baseHunger;
    this.baseThirst = baseThirst;
    this.baseHygiene = baseHygiene;
    this.baseSadness = baseSadness;
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
    return hunger.toString() + "\n" + thirst.toString() + "\n" + hygiene.toString() + "\n" + sadness.toString() + "\n";
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
   * Setter for base Hygiene.
   * 
   * @param baseHygiene int to set baseHygiene to.
   */
  public void setBaseHygiene(int baseHygiene){
    this.baseHygiene = baseHygiene;
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

  /**
   * Decreases the amount thirst of the tamagochi by a certain value.
   * It is calculated by geting the old value and substracting the selected amount. 
   * 
   * @param amount int amount to remove from thirst.
   */
  public void water(int amount){
    int newThirst = thirst.getValue() - amount;
    if(newThirst < 0){
      newThirst = 0;
    }
    thirst.setValue(newThirst);
  }

  /**
   * Fully waters tamagotchi.
   * Thirst is set to 0 
   * 
   */
  public void fullWater(){
    thirst.setValue(0);
  }
  
  /**
   * Increments the hygiene of the tamagochi.
   * It is calculated by geting the old value and adding the multiplication of the baseHygiene stat and the effectMultiplier. 
   * 
   */
  public void hygieneIncrement(){
    int newHygiene = hygiene.getValue() + (int)(baseHygiene * effectMultiplier);
    if(newHygiene > 100){
    	newHygiene = 100;
    }
    hygiene.setValue(newHygiene);
  }

  /**
   * Decreases the amount hygiene of the tamagochi by a certain value.
   * It is calculated by geting the old value and substracting the selected amount. 
   * 
   * @param amount int amount to remove from hygiene.
   */
  public void bathe(int amount){
    int newHygiene = hygiene.getValue() - amount;
    if(newHygiene < 0){
    	newHygiene = 0;
    }
    hygiene.setValue(newHygiene);
  }

  /**
   * Fully Bathes tamagotchi.
   * hygiene is set to 0 
   * 
   */
  public void fullBathe(){
	  hygiene.setValue(0);
  }
  
  /**
   * Increments the sadness of the tamagochi.
   * It is calculated by geting the old value and adding the multiplication of the baseSadness stat and the effectMultiplier. 
   * 
   */
  public void sadnessIncrement(){
    int newSadness = sadness.getValue() + (int)(baseSadness * effectMultiplier);
    if(newSadness > 100){
    	newSadness = 100;
    }
    sadness.setValue(newSadness);
  }

  /**
   * Decreases the amount sadness of the tamagochi by a certain value.
   * It is calculated by geting the old value and substracting the selected amount. 
   * 
   * @param amount int amount to remove from sadness.
   */
  public void play(int amount){
    int newSadness = sadness.getValue() - amount;
    if(newSadness < 0){
    	newSadness = 0;
    }
    sadness.setValue(newSadness);
  }

  /**
   * Fully plays tamagotchi.
   * sadness is set to 0 
   * 
   */
  public void fullPlay(){
	  sadness.setValue(0);
  }
}
