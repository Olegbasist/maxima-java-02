package org.example;

// 15.09.2022 Для корабля и самолета при невозможности перевозки в указанный город
//                  метод float getPrice(City city) должен возвращать 0.

public class Ship extends Transport
{
    public Ship(String name, int capacity, int speed, float costOfKm) {
        super(name, capacity, speed, costOfKm);
    }

    // Переопределяем подсчёт стоимости перевозки
    public float getPrice(City city){
        return !city.isOnWater() ? 0 : super.getPrice(city);

    }


}
