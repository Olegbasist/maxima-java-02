package org.example;
//

public class Plane extends Transport
{


    public Plane(String name, int capacity, int speed, float costOfKm) {
        super(name, capacity, speed, costOfKm);
    }
    /*final boolean needAirport = true;
    final boolean needWater = false;

    public boolean isNeedAirport() {
        return needAirport;
    }

    public boolean isNeedWater() {
        return needWater;
    }*/

    // Переопределяем подсчёт стоимости перевозки
    public float getPrice(City city){
        return !city.isHasAirport() ? 0 : (getCostOfKm() * city.getDistanceKm());

    }




}
