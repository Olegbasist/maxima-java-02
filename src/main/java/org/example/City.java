package org.example;

// 12.09.2022  Описать класс City (город) со свойствами:
//        name — имя, строка.
//        distanceKm — расстояние, число

public class City
{
    private String name; //Название города
    public City(String name) {
        this.name = name;
    }


   private int distanceKm; // Расстояние до города

    public City(int distanceKm) {
        this.distanceKm = distanceKm;
    }

    public City() {

    }

    public void printDistance()
    {
        System.out.println(name+ " находится на расстоянии " +distanceKm+ " Км.");

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDistanceKm() {
        return distanceKm;
    }

    public void setDistanceKm(int distanceKm) {
        this.distanceKm = distanceKm;
    }
}
