package service;

import entity.Car;

import java.util.List;

public interface CarService {
    boolean addCar(Car car);
    boolean updateCar(Car car);
    boolean deleteCar(int id);
    List<Car> showCars();
    Car findCarById(int id);
    Car findCarByName(String name);
}