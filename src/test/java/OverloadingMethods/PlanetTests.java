package OverloadingMethods;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PlanetTests {
    @Test
    public void info_NoParametersProvidedFullInfo_ReturnsFullInfo() {
        Planet mars = new Planet("Mars", 1.026, 6787, 2, false);

        Assertions.assertEquals("Name: Mars\n" +
                        "Rotation period (days): 1.026\n" +
                        "Diameter (km): 6787\n" +
                        "Moons: 2\n" +
                        "Has rings?: false",
                        mars.info());
    }
    @Test
    public void info_MessageProvidedFullInfo_ReturnsFullInfo(){
         Planet mars = new Planet("Mars", 1.026, 6787, 2, false);
         String message = "It's the favourite one!";
         Assertions.assertEquals("Name: Mars\n" +
                         "Rotation period (days): 1.026\n" +
                         "Diameter (km): 6787\n" +
                         "Moons: 2\n" +
                         "Has rings?: false" +
                         "\n\n" + message
                 ,
                          mars.info(message));


    }

}
