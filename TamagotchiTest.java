import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class TamagotchiTest {

  Tamagotchi defaultTamagotchi;
  Tamagotchi paramTamagotchi;

  @Test
  void testGetName() {
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
  void testSetName() {
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
  void testDefaultStatus() {
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
}
