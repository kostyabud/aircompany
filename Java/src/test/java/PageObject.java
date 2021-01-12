import Planes.ExperimentalPlane;
import Planes.MilitaryPlane;
import Planes.PassengerPlane;
import Planes.Plane;
import models.ClassificationLevel;
import models.MilitaryType;
import java.util.Arrays;
import java.util.List;

public class PageObject {

    private static final List<Plane> PLANES = Arrays.asList(
            new PassengerPlane("Boeing-737", 900, 12000, 60500, 164),
            new PassengerPlane("Boeing-737-800", 940, 12300, 63870, 192),
            new PassengerPlane("Boeing-747", 980, 16100, 70500, 242),
            new PassengerPlane("Airbus A320", 930, 11800, 65500, 188),
            new PassengerPlane("Airbus A330", 990, 14800, 80500, 222),
            new PassengerPlane("Embraer 190", 870, 8100, 30800, 64),
            new PassengerPlane("Sukhoi Superjet 100", 870, 11500, 50500, 140),
            new PassengerPlane("Bombardier CS300", 920, 11000, 60700, 196),
            new MilitaryPlane("B-1B Lancer", 1050, 21000, 80000, MilitaryType.BOMBER),
            new MilitaryPlane("B-2 Spirit", 1030, 22000, 70000, MilitaryType.BOMBER),
            new MilitaryPlane("B-52 Stratofortress", 1000, 20000, 80000, MilitaryType.BOMBER),
            new MilitaryPlane("F-15", 1500, 12000, 10000, MilitaryType.FIGHTER),
            new MilitaryPlane("F-22", 1550, 13000, 11000, MilitaryType.FIGHTER),
            new MilitaryPlane("C-130 Hercules", 650, 5000, 110000, MilitaryType.TRANSPORT),
            new ExperimentalPlane("Bell X-14", 277, 482, 500, ClassificationLevel.SECRET),
            new ExperimentalPlane("Ryan X-13 Vertijet", 560, 307, 500, ClassificationLevel.TOP_SECRET)
    );

    private static final PassengerPlane PLANE_WITH_MAX_PASSENGER_CAPACITY = new PassengerPlane("Boeing-747", 980, 16100, 70500, 242);

    public static boolean getTransportMilitaryPlanes() {
        Airport airport = new Airport(PLANES);
        List<MilitaryPlane> transportMilitaryPlanes = airport.getTransportMilitaryPlanes();
        for (MilitaryPlane militaryPlane : transportMilitaryPlanes) {
            if ((militaryPlane.getTYPE() == MilitaryType.TRANSPORT)) {
                return true;

            }
        }

        return false;
    }

    public static boolean sortedPlaneByMaxLoadCapacity() {
        Airport airport = new Airport(PLANES);
        airport.sortByMaxLoadCapacity();
        List<? extends Plane> planesSortedByMaxLoadCapacity = airport.getPLANES();
        for (int i = 0; i < planesSortedByMaxLoadCapacity.size() - 1; i++) {
            Plane currentPlane = planesSortedByMaxLoadCapacity.get(i);
            Plane nextPlane = planesSortedByMaxLoadCapacity.get(i + 1);
            if (currentPlane.getMinLoadCapacity() > nextPlane.getMinLoadCapacity()) {
                return false;

            }
        }
        return true;
    }

    public static boolean hasAtLeastOneBomberInMilitaryPlanes() {
        Airport airport = new Airport(PLANES);
        List<MilitaryPlane> bomberMilitaryPlanes = airport.getBomberMilitaryPlanes();
        for (MilitaryPlane militaryPlane : bomberMilitaryPlanes) {
            if ((militaryPlane.getTYPE() == MilitaryType.BOMBER)) {
                return true;
            }
        }
        return false;
    }

    public static boolean experimentalPlanesHasClassificationLevelHigherThanUnclassified() {
        Airport airport = new Airport(PLANES);
        List<ExperimentalPlane> experimentalPlanes = airport.getExperimentalPlanes();

        for (ExperimentalPlane experimentalPlane : experimentalPlanes) {
            if (experimentalPlane.getCLASSIFICATION_LEVEL() == ClassificationLevel.UNCLASSIFIED) {
                return true;
            }
        }
        return false;

    }

    public static boolean showPassengerPlaneWithMaxCapacity() {

        Airport airport = new Airport(PLANES);
        PassengerPlane expectedPlaneWithMaxPassengersCapacity = airport.getPassengerPlaneWithMaxPassengersCapacity();
        if (PLANE_WITH_MAX_PASSENGER_CAPACITY.equals(expectedPlaneWithMaxPassengersCapacity)) {
            return true;
        };
        return false;

    }
}
