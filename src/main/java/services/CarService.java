package services;

import web.Models.Car;

import java.util.List;

public interface CarService {
    List <Car> numberOfCars (List<Car> cars, int number);
}
