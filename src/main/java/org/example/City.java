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

    public City(boolean hasAirport, boolean isOnWater) {
        this.hasAirport = hasAirport;
        this.isOnWater = isOnWater;
    }

    public City(String name, int distanceKm) {
        this.name = name;
        this.distanceKm = distanceKm;
    }

    public City() {

    }


    // Вывод описания города
    public void printDistance() {
        System.out.println(name + " находится на расстоянии " + distanceKm + " Км.");
        if (hasAirport){
        System.out.print("В городе имется аэропорт");
        }
        else {
            System.out.print("В городе нет аэропорта");
        }
        if (isOnWater){
            System.out.println(", и есть река.");

        }
        else {
            System.out.println(", и нет реки.");
        }

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
