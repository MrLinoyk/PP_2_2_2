package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import services.CarService;
import services.CarServiceImp;
import web.Models.Car;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    @Autowired
    CarServiceImp carServiceImp;

    @GetMapping("/cars")
    public String getCats (@RequestParam (value = "count", defaultValue = "5") int allCars, Model cars) {
        List<Car> carsArray = new ArrayList<>();
        carsArray.add(new Car("Ford", 1969, false));
        carsArray.add(new Car("Nissan", 2021, true));
        carsArray.add(new Car("Toyota", 2008, false));
        carsArray.add(new Car("Cherry", 2022, true));
        carsArray.add(new Car("Haval", 2020, true));
        carsArray = carServiceImp.numberOfCars(carsArray, allCars);
        cars.addAttribute("carsArray", carsArray);
        return "cars";

    }

}
