import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TamagotchiTest {
  @Test
  public void testGetName() {
    Tamagotchi defaultTamagotchi;
    Tamagotchi paramTamagotchi;
    // Arrange
    String defaultName = "";
    String paramName = "Testo";

    // Act
    defaultTamagotchi = new Tamagotchi();
    paramTamagotchi = new Tamagotchi(paramName);

    // Assert
    assertEquals(defaultName, defaultTamagotchi.getName());
    assertEquals(paramName, paramTamagotchi.getName());

  }

  @Test
  public void testSetName() {
    Tamagotchi defaultTamagotchi;
    Tamagotchi paramTamagotchi;
    // Arrange
    defaultTamagotchi = new Tamagotchi();
    paramTamagotchi = new Tamagotchi("Testo");
    String newName = "Steeeeeve";

    // Act
    defaultTamagotchi.setName(newName);
    paramTamagotchi.setName(newName);

    // Assert
    assertEquals(newName, defaultTamagotchi.getName());
    assertEquals(newName, paramTamagotchi.getName());

  }

  @Test
  public void testDefaultStatus() {
    Tamagotchi defaultTamagotchi;
    // Arrange
    defaultTamagotchi = new Tamagotchi();
    String status;
    Status hunger = new Status("Hunger");
    Status thirst = new Status("Thirst");
    Status hygiene = new Status("Hygiene");

    // Act
    status = hunger.toString() + "\n" + thirst.toString() + "\n" + hygiene.toString() + "\n";

    // Assert
    assertEquals(status, defaultTamagotchi.getStatus());

  }

  @Test
  public void testBaseHungerIncrement(){
    Tamagotchi defaultTamagotchi;
    // Arrange
    defaultTamagotchi = new Tamagotchi();
    String status;
    Status hunger = new Status("Hunger");
    Status thirst = new Status("Thirst");
    Status hygiene = new Status("Hygiene");

    // Act
    hunger.setValue(1);
    status = hunger.toString() + "\n" + thirst.toString() + "\n" + hygiene.toString() + "\n";
    defaultTamagotchi.hungerIncrement();

    // Assert
    assertEquals(status, defaultTamagotchi.getStatus());
  }

  @Test
  public void testHungerIncrement(){
    Tamagotchi defaultTamagotchi;
    // Arrange
    defaultTamagotchi = new Tamagotchi();
    String status;
    Status hunger = new Status("Hunger");
    Status thirst = new Status("Thirst");
    Status hygiene = new Status("Hygiene");
    defaultTamagotchi.setBaseHunger(10);
    defaultTamagotchi.setEffectMultiplier(2);

    // Act
    hunger.setValue(20);
    status = hunger.toString() + "\n" + thirst.toString() + "\n" + hygiene.toString() + "\n";
    defaultTamagotchi.hungerIncrement();

    // Assert
    assertEquals(status, defaultTamagotchi.getStatus());
  }

  @Test
  public void testFeed(){
    Tamagotchi defaultTamagotchi;
    // Arrange
    defaultTamagotchi = new Tamagotchi("Name", 1, 100, 1);
    defaultTamagotchi.hungerIncrement();
    String status;
    Status hunger = new Status("Hunger");
    Status thirst = new Status("Thirst");
    Status hygiene = new Status("Hygiene");
    hunger.setValue(70);
    status = hunger.toString() + "\n" + thirst.toString() + "\n" + hygiene.toString() + "\n";

    // Act
    defaultTamagotchi.feed(30);
    
    // Assert
    assertEquals(status, defaultTamagotchi.getStatus());
  }

  @Test
  public void testFullFeed(){
    Tamagotchi defaultTamagotchi;
    // Arrange
    defaultTamagotchi = new Tamagotchi("Name", 1, 100, 1);
    defaultTamagotchi.hungerIncrement();
    String status;
    Status hunger = new Status("Hunger");
    Status thirst = new Status("Thirst");
    Status hygiene = new Status("Hygiene");
    hunger.setValue(0);
    status = hunger.toString() + "\n" + thirst.toString() + "\n" + hygiene.toString() + "\n";

    // Act
    defaultTamagotchi.fullFeed();
    
    // Assert
    assertEquals(status, defaultTamagotchi.getStatus());
  }

  @Test
  public void testBaseThirstIncrement(){
    Tamagotchi defaultTamagotchi;
    // Arrange
    defaultTamagotchi = new Tamagotchi();
    String status;
    Status hunger = new Status("Hunger");
    Status thirst = new Status("Thirst");
    Status hygiene = new Status("Hygiene");

    // Act
    thirst.setValue(1);
    status = hunger.toString() + "\n" + thirst.toString() + "\n" + hygiene.toString() + "\n";
    defaultTamagotchi.thirstIncrement();

    // Assert
    assertEquals(status, defaultTamagotchi.getStatus());
  }
}
