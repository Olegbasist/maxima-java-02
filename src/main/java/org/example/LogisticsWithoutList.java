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

public class LogisticsWithoutList {

    public LogisticsWithoutList(Transport ... vehicles) {
        this.vehicles=vehicles;
    }


    public Transport[] getVehicles() {
        return vehicles;
    }

    Transport[] vehicles;

    public Transport getShipping(City city, int weight, int hours){
        float costOfDelivery;
        float minCostOfDelivery = Float.MAX_VALUE;
        Transport cheapestVehicle = null;

        for (Transport obj: vehicles){
            costOfDelivery = obj.getPrice(city);
            if (minCostOfDelivery > costOfDelivery && costOfDelivery != 0){
                minCostOfDelivery = costOfDelivery;
                cheapestVehicle = obj;
            }
        }



        return cheapestVehicle;
    }



    public void listOfVehicles (){
        ArrayList<Transport> arr = new ArrayList<>();

        Collections.addAll(arr, vehicles);
        arr.forEach(element -> System.out.println(element.getName()));
    }



}
