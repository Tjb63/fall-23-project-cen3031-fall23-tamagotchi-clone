public class Tamagotchi {
  /**
   * Name of Tamagotchi.
   * 
   */
  private String name;

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
   * Getter for Tamagotchi name.
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
}
