package web.services;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImp implements CarService{
    public static final List <Car> carList = new ArrayList<>();
    static {
        carList.add(new Car("Ford", 1969, false));
        carList.add(new Car("Nissan", 2021, true));
        carList.add(new Car("Toyota", 2008, false));
        carList.add(new Car("Cherry", 2022, true));
        carList.add(new Car("Haval", 2020, true));
    }

    @Override
    public List<Car> numberOfCars(List<Car> cars, int number) {
        if (number == 0 || number > 5) return cars;
        return cars.stream().limit(number).collect(Collectors.toList());
    }
}
