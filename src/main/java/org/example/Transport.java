package org.example;

// 12.09.2022  Описать класс Transport (транспортное средство) со свойствами:
//        name — имя, строка.
//        capacity — грузоподъемность, число.
//        speed — скорость, число.
//        costOfKm — стоимость за километр, дробное число

// 15.09.2022 Для корабля и самолета при невозможности перевозки в указанный город
//                  метод float getPrice(City city) должен возвращать 0.

public class Transport
{
    public Transport() {
    }
    private String name; //Название
    private int capacity; //Вместимость
    private int speed; //Скорость
    private float costOfKm;//Стоимость километра


    // Конструктор - один за всех
    public Transport(String name, int capacity, int speed, float costOfKm) {
        this.name = name;
        this.capacity = capacity;
        this.speed = speed;
        this.costOfKm = costOfKm;
    }

    // Геттеры-сеттеры

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public float getCostOfKm() {
        return costOfKm;
    }

    public void setCostOfKm(float costOfKm) {
        this.costOfKm = costOfKm;
    }

    // Вывод получившегося транспорта
    public void printVehicleFetcher(){
        System.out.println(name+ " вмещает " +capacity+ "Кг. груза, двигается со скоростью " +speed+ "Км/ч, а стоимость перевозки составляет " +costOfKm+ " рубля за 1Км. пути");
    }


    // Подсчёт стоимости перевозки
    public float getPrice(City city){
        return (getCostOfKm() * city.getDistanceKm());

    }


    // Вывод получившейся стоимости
    public void printPrice(float price){

        System.out.println("Стоимость перевозки " +price+ " рублей");
    }


}
