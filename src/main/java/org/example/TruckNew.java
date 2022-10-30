package org.example;
//

public class TruckNew extends Transport{

    public TruckNew(String name, int capacity, int speed, float costOfKm) {
        super(name, capacity, speed, costOfKm);
    }


    private boolean repairing;

    @Override
    public float getPrice(City city) {
        return  (getCostOfKm() * city.getDistanceKm());
    }

    @Override
    public void startRepair() {
        this.repairing = true;

    }

    @Override
    public void finishRepair() {
        this.repairing = false;
    }

    @Override
    public boolean isRepairing() {
        return repairing;
    }
}
