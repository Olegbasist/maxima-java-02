package org.example;

// TODO: 22.09.2022 Описать класс Logistics - бизнес логику нашей логистики,
//  при создании которого мы будем передавать ему некоторое количество объектов класса Transport ,
//  заполняя свойство vehicles.
//
//
// TODO: 22.09.2022 Описать методы Transport getShipping(City city, int weight, int hours) - найти самое оптимальное по стоимости доставки транспортное средство.
//
// TODO: 22.09.2022 Необходимо учесть грузоподъемность и необходимость доставки в указанный срок,
//  для определения возможности перевозки определенным транспортом описать метод isShippingAvailable()
//
// TODO: 22.09.2022 В классе Logistics учесть состояние транспортного средства при расчете грузоперевозок.
//

import java.util.ArrayList;
import java.util.Collections;

public class Logistics {

    public Logistics(Transport vehicles) {
        this.vehicles = vehicles;
    }

    public Transport getVehicles() {
        return vehicles;
    }
    ArrayList<Transport> arrOfVehicles = new ArrayList<>();

    public void setVehicles(Transport vehicles) {
        this.vehicles = vehicles;
        Collections.addAll(arrOfVehicles, vehicles);
    }



    Transport vehicles;

    public Transport getShipping(City city, int weight, int hours){
        float costOfDelivery;
        float minCostOfDelivery = Float.MAX_VALUE;
        Transport cheapestVehicle = null;

        for (Transport obj: arrOfVehicles){
            costOfDelivery = obj.getPrice(city);
            if (minCostOfDelivery > costOfDelivery && costOfDelivery != 0){
                minCostOfDelivery = costOfDelivery;
                cheapestVehicle = obj;
            }
        }



        return cheapestVehicle;
    }



}
