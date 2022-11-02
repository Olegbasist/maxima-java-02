package org.example;

//  02.11.2022  Описать класс TransportFactory со методом Transport getTransport(City city, int weight, int hours)
//  TODO: 02.11.2022 который будет в зависимости от города, веса и срока доставки конструировать нам транспортное средство по следующим правилам:

//       - Название и стоимость — для самолета, корабля и грузовика различные константы, выберите из сами, задайте их в начале метода.
//     TODO:  - Если скорость, необходимая для выполнения заказа до 40 км/ч и город на воде, то корабль. Если нужна скорость выше 120 км/ч, и есть аэропорт, то самолет. В остальных случаях — грузовик.
//     TODO:  - Грузоподъемность должна равняться весу груза, округленного вверх до числа кратного 500.
//     TODO:  - Скорость должна равняться скорости, необходимой для прибытия в срок, округленной вверх до ближайшего десятка.
//     TODO:  - Если вес кратен 500 и или скорость кратна 10, то округлять не нужно.

public class TransportFactory {

    private final String shipName = "Сухогруз 'Доктор наук профессор Шварценгольд'";
    private final String airplaneName = "Грузовой самолёт 'Сибирский буревестник'";
    private final int weightMultiplicity = 500;
    private final int speedMultiplicity = 10;

    public Transport getTransport(City city, int weight, int hours){
        float requiredSpeed = city.getDistanceKm()/hours;



        return makeTruck(getRightCapacity(weight), getRightSpeed(requiredSpeed));
    }

    private int getRightSpeed (float requiredSpeed){
        int speed = requiredSpeed<=speedMultiplicity? speedMultiplicity
                : requiredSpeed/speedMultiplicity == requiredSpeed%speedMultiplicity ? (int) requiredSpeed //Кажется бессмысленно лишний код... всё равно 2 операции - можно было просто посчитать последним условием
                : (int) (Math.ceil((float) requiredSpeed/speedMultiplicity)*speedMultiplicity);
        return speed;
    }

    private int getRightCapacity (int weight){
        int capacity = weight <= weightMultiplicity ? weightMultiplicity
                : (float) weight/weightMultiplicity == weight%weightMultiplicity ? weight //Кажется бессмысленно лишний код... всё равно 2 операции - можно было просто посчитать последним условием
                : (int) (Math.ceil((float) weight/weightMultiplicity))*weightMultiplicity;
        return capacity;
    }

    private Transport makeTruck (int capacity, int speed ){

        final float costOfKm = 2.5f;
        final String trackName = "Автопоезд 'Нарядный купальщик'";
        return new Truck(trackName,capacity, speed, costOfKm);
    }


}
