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
    Status sadness = new Status("Sadness");

    // Act
    status = hunger.toString() + "\n" + thirst.toString() + "\n" + hygiene.toString() + "\n" + sadness.toString() + "\n";

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
    Status sadness = new Status("Sadness");

    // Act
    hunger.setValue(1);
    status = hunger.toString() + "\n" + thirst.toString() + "\n" + hygiene.toString() + "\n" + sadness.toString() + "\n";
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
    Status sadness = new Status("Sadness");
    defaultTamagotchi.setBaseHunger(10);
    defaultTamagotchi.setEffectMultiplier(2);

    // Act
    hunger.setValue(20);
    status = hunger.toString() + "\n" + thirst.toString() + "\n" + hygiene.toString() + "\n" + sadness.toString() + "\n";
    defaultTamagotchi.hungerIncrement();

    // Assert
    assertEquals(status, defaultTamagotchi.getStatus());
  }

  @Test
  public void testFeed(){
    Tamagotchi defaultTamagotchi;
    // Arrange
    defaultTamagotchi = new Tamagotchi("Name", 1, 100, 1, 1, 1);
    defaultTamagotchi.hungerIncrement();
    String status;
    Status hunger = new Status("Hunger");
    Status thirst = new Status("Thirst");
    Status hygiene = new Status("Hygiene");
    Status sadness = new Status("Sadness");
    hunger.setValue(70);
    status = hunger.toString() + "\n" + thirst.toString() + "\n" + hygiene.toString() + "\n" + sadness.toString() + "\n";

    // Act
    defaultTamagotchi.feed(30);
    
    // Assert
    assertEquals(status, defaultTamagotchi.getStatus());
  }

  @Test
  public void testFullFeed(){
    Tamagotchi defaultTamagotchi;
    // Arrange
    defaultTamagotchi = new Tamagotchi("Name", 1, 100, 1, 1, 1);
    defaultTamagotchi.hungerIncrement();
    String status;
    Status hunger = new Status("Hunger");
    Status thirst = new Status("Thirst");
    Status hygiene = new Status("Hygiene");
    Status sadness = new Status("Sadness");
    hunger.setValue(0);
    status = hunger.toString() + "\n" + thirst.toString() + "\n" + hygiene.toString() + "\n" + sadness.toString() + "\n";

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
    Status sadness = new Status("Sadness");

    // Act
    thirst.setValue(1);
    status = hunger.toString() + "\n" + thirst.toString() + "\n" + hygiene.toString() + "\n" + sadness.toString() + "\n";
    defaultTamagotchi.thirstIncrement();

    // Assert
    assertEquals(status, defaultTamagotchi.getStatus());
  }

  @Test
  public void testThirstIncrement(){
    Tamagotchi defaultTamagotchi;
    // Arrange
    defaultTamagotchi = new Tamagotchi("Name", 2, 1, 10, 1, 1);
    String status;
    Status hunger = new Status("Hunger");
    Status thirst = new Status("Thirst");
    Status hygiene = new Status("Hygiene");
    Status sadness = new Status("Sadness");

    // Act
    thirst.setValue(20);
    status = hunger.toString() + "\n" + thirst.toString() + "\n" + hygiene.toString() + "\n" + sadness.toString() + "\n";
    defaultTamagotchi.thirstIncrement();

    // Assert
    assertEquals(status, defaultTamagotchi.getStatus());
  }

  @Test
  public void testWater(){
    Tamagotchi defaultTamagotchi;
    // Arrange
    defaultTamagotchi = new Tamagotchi("Name", 1, 1, 100, 1, 1);
    defaultTamagotchi.thirstIncrement();
    String status;
    Status hunger = new Status("Hunger");
    Status thirst = new Status("Thirst");
    Status hygiene = new Status("Hygiene");
    Status sadness = new Status("Sadness");
    thirst.setValue(70);
    status = hunger.toString() + "\n" + thirst.toString() + "\n" + hygiene.toString() + "\n" + sadness.toString() + "\n";

    // Act
    defaultTamagotchi.water(30);
    
    // Assert
    assertEquals(status, defaultTamagotchi.getStatus());
  }

  @Test
  public void testFullWater(){
    Tamagotchi defaultTamagotchi;
    // Arrange
    defaultTamagotchi = new Tamagotchi("Name", 1, 1, 100, 1, 1);
    defaultTamagotchi.thirstIncrement();
    String status;
    Status hunger = new Status("Hunger");
    Status thirst = new Status("Thirst");
    Status hygiene = new Status("Hygiene");
    Status sadness = new Status("Sadness");
    thirst.setValue(0);
    status = hunger.toString() + "\n" + thirst.toString() + "\n" + hygiene.toString() + "\n" + sadness.toString() + "\n";

    // Act
    defaultTamagotchi.fullWater();
    
    // Assert
    assertEquals(status, defaultTamagotchi.getStatus());
  }
  
  @Test
  public void testBaseHygieneIncrement(){
    Tamagotchi defaultTamagotchi;
    // Arrange
    defaultTamagotchi = new Tamagotchi();
    String status;
    Status hunger = new Status("Hunger");
    Status thirst = new Status("Thirst");
    Status hygiene = new Status("Hygiene");
    Status sadness = new Status("Sadness");

    // Act
    hygiene.setValue(1);
    status = hunger.toString() + "\n" + thirst.toString() + "\n" + hygiene.toString() + "\n" + sadness.toString() + "\n";
    defaultTamagotchi.hygieneIncrement();

    // Assert
    assertEquals(status, defaultTamagotchi.getStatus());
  }
  
  @Test
  public void testHygieneIncrement(){
    Tamagotchi defaultTamagotchi;
    // Arrange
    defaultTamagotchi = new Tamagotchi("Name", 2, 1, 1, 10, 1);
    String status;
    Status hunger = new Status("Hunger");
    Status thirst = new Status("Thirst");
    Status hygiene = new Status("Hygiene");
    Status sadness = new Status("Sadness");

    // Act
    hygiene.setValue(20);
    status = hunger.toString() + "\n" + thirst.toString() + "\n" + hygiene.toString() + "\n" + sadness.toString() + "\n";
    defaultTamagotchi.hygieneIncrement();

    // Assert
    assertEquals(status, defaultTamagotchi.getStatus());
  }
  
  @Test
  public void testBathe(){
    Tamagotchi defaultTamagotchi;
    // Arrange
    defaultTamagotchi = new Tamagotchi("Name", 1, 1, 1, 100, 1);
    defaultTamagotchi.hygieneIncrement();
    String status;
    Status hunger = new Status("Hunger");
    Status thirst = new Status("Thirst");
    Status hygiene = new Status("Hygiene");
    Status sadness = new Status("Sadness");
    hygiene.setValue(70);
    status = hunger.toString() + "\n" + thirst.toString() + "\n" + hygiene.toString() + "\n" + sadness.toString() + "\n";

    // Act
    defaultTamagotchi.bathe(30);
    
    // Assert
    assertEquals(status, defaultTamagotchi.getStatus());
  }
  
  @Test
  public void testFullBathe(){
    Tamagotchi defaultTamagotchi;
    // Arrange
    defaultTamagotchi = new Tamagotchi("Name", 1, 1, 1, 100, 1);
    defaultTamagotchi.hygieneIncrement();
    String status;
    Status hunger = new Status("Hunger");
    Status thirst = new Status("Thirst");
    Status hygiene = new Status("Hygiene");
    Status sadness = new Status("Sadness");
    hygiene.setValue(0);
    status = hunger.toString() + "\n" + thirst.toString() + "\n" + hygiene.toString() + "\n" + sadness.toString() + "\n";

    // Act
    defaultTamagotchi.fullBathe();
    
    // Assert
    assertEquals(status, defaultTamagotchi.getStatus());
  }
  
  @Test
  public void testBaseSadnessIncrement(){
    Tamagotchi defaultTamagotchi;
    // Arrange
    defaultTamagotchi = new Tamagotchi();
    String status;
    Status hunger = new Status("Hunger");
    Status thirst = new Status("Thirst");
    Status hygiene = new Status("Hygiene");
    Status sadness = new Status("Sadness");

    // Act
    sadness.setValue(1);
    status = hunger.toString() + "\n" + thirst.toString() + "\n" + hygiene.toString() + "\n" + sadness.toString() + "\n";
    defaultTamagotchi.sadnessIncrement();

    // Assert
    assertEquals(status, defaultTamagotchi.getStatus());
  }
  
  @Test
  public void testSadnessIncrement(){
    Tamagotchi defaultTamagotchi;
    // Arrange
    defaultTamagotchi = new Tamagotchi("Name", 2, 1, 1, 1, 10);
    String status;
    Status hunger = new Status("Hunger");
    Status thirst = new Status("Thirst");
    Status hygiene = new Status("Hygiene");
    Status sadness = new Status("Sadness");

    // Act
    sadness.setValue(20);
    status = hunger.toString() + "\n" + thirst.toString() + "\n" + hygiene.toString() + "\n" + sadness.toString() + "\n";
    defaultTamagotchi.sadnessIncrement();

    // Assert
    assertEquals(status, defaultTamagotchi.getStatus());
  }
  
  @Test
  public void testPlay(){
    Tamagotchi defaultTamagotchi;
    // Arrange
    defaultTamagotchi = new Tamagotchi("Name", 1, 1, 1, 1, 100);
    defaultTamagotchi.sadnessIncrement();
    String status;
    Status hunger = new Status("Hunger");
    Status thirst = new Status("Thirst");
    Status hygiene = new Status("Hygiene");
    Status sadness = new Status("Sadness");
    sadness.setValue(70);
    status = hunger.toString() + "\n" + thirst.toString() + "\n" + hygiene.toString() + "\n" + sadness.toString() + "\n";

    // Act
    defaultTamagotchi.play(30);
    
    // Assert
    assertEquals(status, defaultTamagotchi.getStatus());
  }
  
  @Test
  public void testFullPlay(){
	    Tamagotchi defaultTamagotchi;
	    // Arrange
	    defaultTamagotchi = new Tamagotchi("Name", 1, 1, 1, 1, 100);
	    defaultTamagotchi.sadnessIncrement();
	    String status;
	    Status hunger = new Status("Hunger");
	    Status thirst = new Status("Thirst");
	    Status hygiene = new Status("Hygiene");
	    Status sadness = new Status("Sadness");
	    sadness.setValue(0);
	    status = hunger.toString() + "\n" + thirst.toString() + "\n" + hygiene.toString() + "\n" + sadness.toString() + "\n";

	    // Act
	    defaultTamagotchi.fullPlay();
	    
	    // Assert
	    assertEquals(status, defaultTamagotchi.getStatus());
  }
}
