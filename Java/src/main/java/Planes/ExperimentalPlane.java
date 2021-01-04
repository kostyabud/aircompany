package Planes;

import models.ClassificationLevel;


public class ExperimentalPlane extends Plane{

    private final ClassificationLevel CLASSIFICATION_LEVEL;

    public ExperimentalPlane(String model, int maxSpeed, int maxFlightDistance, int maxLoadCapacity, ClassificationLevel classificationLevel) {
        super(model, maxSpeed, maxFlightDistance, maxLoadCapacity);
        this.CLASSIFICATION_LEVEL = classificationLevel;
    }

    public  ClassificationLevel getCLASSIFICATION_LEVEL(){
        return CLASSIFICATION_LEVEL;
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return "experimentalPlane{" +
                "model='" + model + '\'' +
                '}';
    }

}
