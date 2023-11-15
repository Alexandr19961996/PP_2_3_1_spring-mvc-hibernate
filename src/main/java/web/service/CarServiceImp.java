package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImp implements CarService {

    private final List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car(1, "BMW", "Blue"));
        cars.add(new Car(2, "Lamborghini", "White"));
        cars.add(new Car(3, "Ferrari", "Black"));
        cars.add(new Car(4, "Mercedes", "Red"));
        cars.add(new Car(5, "Range Rover", "Grey"));
    }

    @Override
    public List<Car> showCars(Integer count) {
        return cars.stream().filter(car -> car.getId() <= count).toList();
    }
}
