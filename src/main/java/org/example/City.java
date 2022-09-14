package org.example;

// TODO: 12.09.2022  Описать класс City (город) со свойствами:
//        name — имя, строка.
//        distanceKm — расстояние, число

public class City
{
    String name;
    int distanceKm;

   public void printDistance()
    {
        System.out.println(name+ " находится на расстоянии " +distanceKm+ " Км.");
    }

}
