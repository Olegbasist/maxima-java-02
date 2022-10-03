package org.example;


public class Ship extends Transport
{
    public Ship(String name, int capacity, int speed, float costOfKm) {
        super(name, capacity, speed, costOfKm);
    }

    // Переопределяем подсчёт стоимости перевозки
    public float getPrice(City city){
        return !city.isOnWater() ? 0 : (getCostOfKm() * city.getDistanceKm());

    }


}
