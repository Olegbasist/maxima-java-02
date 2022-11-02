package org.example;

//  02.11.2022  Описать класс TransportFactory со методом Transport getTransport(City city, int weight, int hours)
//  TODO: 02.11.2022 который будет в зависимости от города, веса и срока доставки конструировать нам транспортное средство по следующим правилам:

//       - Название и стоимость — для самолета, корабля и грузовика различные константы, выберите из сами, задайте их в начале метода.
//     TODO:  - Если скорость, необходимая для выполнения заказа до 40 км/ч и город на воде, то корабль.
//      Если нужна скорость выше 120 км/ч, и есть аэропорт, то самолет.
//      В остальных случаях — грузовик.

//       - Грузоподъемность должна равняться весу груза, округленного вверх до числа кратного 500.
//       - Скорость должна равняться скорости, необходимой для прибытия в срок, округленной вверх до ближайшего десятка.
//       - Если вес кратен 500 и или скорость кратна 10, то округлять не нужно.

public class TransportFactory {

    public Transport getTransport(City city, int weight, int hours){

        float requiredSpeed = (float) city.getDistanceKm()/hours;

        return requiredSpeed < 40 && city.isOnWater() ? getShip(getRightCapacity(weight), getRightSpeed(requiredSpeed))
                : requiredSpeed > 120 && city.isHasAirport() ? getPlane(getRightCapacity(weight), getRightSpeed(requiredSpeed))
                : getTruck(getRightCapacity(weight), getRightSpeed(requiredSpeed));
    }

    private int getRightSpeed (float requiredSpeed){

        final int speedMultiplicity = 10;

        return requiredSpeed<= speedMultiplicity ? speedMultiplicity
                : requiredSpeed/ speedMultiplicity == requiredSpeed% speedMultiplicity ? (int) requiredSpeed //Кажется бессмысленно лишний код... всё равно 2 операции - можно было просто посчитать последним условием
                : (int) (Math.ceil((float) requiredSpeed/ speedMultiplicity)* speedMultiplicity);
    }

    private int getRightCapacity (int weight){

        final int weightMultiplicity = 500;

        return weight <= weightMultiplicity ? weightMultiplicity
                : (float) weight/ weightMultiplicity == weight% weightMultiplicity ? weight //Кажется бессмысленно лишний код... всё равно 2 операции - можно было просто посчитать последним условием
                : (int) (Math.ceil((float) weight/ weightMultiplicity))* weightMultiplicity;
    }

    private Transport getTruck (int capacity, int speed ){

        final float costOfKm = 2.5f;
        final String trackName = "Автопоезд 'Нарядный купальщик'";

        return new Truck(trackName,capacity, speed, costOfKm);
    }

    private Transport getShip (int capacity, int speed ){

        final float costOfKm = 1.7f;
        String shipName = "Сухогруз 'Доктор наук профессор Шварценгольд'";

        return new Ship(shipName,capacity, speed, costOfKm);
    }

    private Transport getPlane (int capacity, int speed ){

        final float costOfKm = 7.8f;
        String airplaneName = "Грузовой самолёт 'Сибирский буревестник'";

        return new Plane(airplaneName,capacity, speed, costOfKm);
    }


}
