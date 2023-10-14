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
}
