package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.services.CarService;
import web.services.CarServiceImp;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    final
    CarService carService;
    @Autowired
    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/cars")
    public String getCats (@RequestParam (value = "count", defaultValue = "5") int allCars, Model cars) {
        cars.addAttribute("cars", carService.numberOfCars(CarServiceImp.carList, allCars));
        return "cars";

    }

}
