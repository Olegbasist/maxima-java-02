package org.example;

// TODO: 12.09.2022  Описать класс Transport (транспортное средство) со свойствами:
//        name — имя, строка.
//        capacity — грузоподъемность, число.
//        speed — скорость, число.
//        costOfKm — стоимость за километр, дробное число

public class Transport
{
    public Transport() {
    }
    String name; //Название

    public Transport(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    int capacity; //Вместимость

    public Transport(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }


    int speed; //Скорость

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    float costOfKm;//Стоимость километра

    public Transport(float costOfKm) {
        this.costOfKm = costOfKm;
    }

    public float getCostOfKm() {
        return costOfKm;
    }

    public void setCostOfKm(float costOfKm) {
        this.costOfKm = costOfKm;
    }
}
