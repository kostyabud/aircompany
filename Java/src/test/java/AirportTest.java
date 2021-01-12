import org.testng.Assert;
import org.testng.annotations.Test;

public class AirportTest {

    @Test
    public void testGetTransportMilitaryPlanes() {
        Assert.assertTrue(PageObject.getTransportMilitaryPlanes());
    }

    @Test
    public void testShowPassengerPlaneWithMaxCapacity() {

        Assert.assertTrue(PageObject.showPassengerPlaneWithMaxCapacity());

    }

    @Test
    public void testPlanesSortedByMaxLoadCapacity() {

        Assert.assertTrue(PageObject.sortedPlaneByMaxLoadCapacity());
    }

    @Test
    public void testHasAtLeastOneBomberInMilitaryPlanes() {
        Assert.assertTrue(PageObject.hasAtLeastOneBomberInMilitaryPlanes());
    }

    @Test
    public void testExperimentalPlanesHasClassificationLevelHigherThanUnclassified() {
        Assert.assertFalse(PageObject.experimentalPlanesHasClassificationLevelHigherThanUnclassified());
    }
}
