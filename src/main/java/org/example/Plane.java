package org.example;


public class Plane extends Transport
{


    public Plane(String name, int capacity, int speed, float costOfKm) {
        super(name, capacity, speed, costOfKm);
    }

    // Переопределяем подсчёт стоимости перевозки
    public float getPrice(City city){
        return !city.isHasAirport() ? 0 : super.getPrice(city);

    }




}
