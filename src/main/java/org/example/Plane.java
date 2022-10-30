package org.example;
//

public class Plane extends Transport{

    public Plane(String name, int capacity, int speed, float costOfKm) {
        super(name, capacity, speed, costOfKm);
    }

    // Подсчёт стоимости перевозки
    public float getPrice(City city){
        if (city.isHasAirport()) {
            return (getCostOfKm() * city.getDistanceKm());
        }
        else {
            return 0;
        }

    }

}
