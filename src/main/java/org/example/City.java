package org.example;

// 12.09.2022  Описать класс City (город) со свойствами:
//        name — имя, строка.
//        distanceKm — расстояние, число

// 15.09.2022  Добавить классу City свойства:
//          boolean hasAirport - Есть ли в городе аэропорт
//          boolean isOnWater - стоит ли город на воде

public class City {
    private String name; // Название города

    private int distanceKm; // Расстояние до города

    private boolean hasAirport; // Наличие аэропорта

    private boolean isOnWater; // Наличие водного пути

    // Конструктор
    public City(String name, int distanceKm, boolean hasAirport, boolean isOnWater) {
        this.name = name;
        this.distanceKm = distanceKm;
        this.hasAirport = hasAirport;
        this.isOnWater = isOnWater;
    }

    public City() {

    }


    // Вывод описания города
    public void printDistance() {
        System.out.println(name + " находится на расстоянии " + distanceKm + " Км.");


    }

    // Геттеры и сеттеры

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

    public boolean isHasAirport() {
        return hasAirport;
    }

    public void setHasAirport(boolean hasAirport) {
        this.hasAirport = hasAirport;
    }

    public boolean isOnWater() {
        return isOnWater;
    }

    public void setOnWater(boolean onWater) {
        isOnWater = onWater;
    }
}
