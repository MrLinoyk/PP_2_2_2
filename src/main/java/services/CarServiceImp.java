package services;

import org.springframework.stereotype.Component;
import web.Models.Car;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarServiceImp implements CarService{

    @Override
    public List<Car> numberOfCars(List<Car> cars, int number) {
        if (number == 0 || number > 5) return cars;
        return cars.stream().limit(number).collect(Collectors.toList());
    }
}
