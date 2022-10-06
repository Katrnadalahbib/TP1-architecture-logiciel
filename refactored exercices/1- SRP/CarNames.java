package com.directi.training.srp.exercise;

import java.util.List;

public class CarNames{
   
    public String getCarsNames(List<Car> carsDb)
    {
        StringBuilder sb = new StringBuilder();
        for (Car car : carsDb) {
            sb.append(car.getBrand());
            sb.append(" ");
            sb.append(car.getModel());
            sb.append(", ");
        }
        return sb.substring(0, sb.length() - 2);
    }


}