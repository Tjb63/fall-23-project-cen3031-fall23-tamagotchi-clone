public class Tamagotchi {
  /** Name of Tamagotchi.
   * 
   */
  private String name;

  /** Default contructor for Tamagotchi class. Sets fields to default values.
   * 
   */
  public Tamagotchi() {
    name = "";
  }

  /** Parameterized constructor for Tamagotchi class. Sets fields to given values.
   * @param name String to set Tamagotchi's name.
   */
  public Tamagotchi(String name) {
    this.name = name;
  }

  /** Getter for Tamagotchi name.
   * @return String representation of Tamagotchi's name.
   */
  public String getName() {
    return name;
  }

  /** Getter for Tamagotchi name.
   * @param name String to set Tamagotchi's name to.
   */
  public void setName(String name) {
    this.name = name;
  }
  
}
