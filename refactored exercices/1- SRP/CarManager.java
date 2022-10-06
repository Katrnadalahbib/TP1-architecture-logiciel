package com.directi.training.srp.exercise;

import java.util.Arrays;
import java.util.List;

public class CarManager
{

    private CarDB carDb;
    private CarNames carNames;
    private CarBest carBest;

   
   // constructor
   public CarManager (CarDB carDb, CarNames carNames, CarBest carBest){
        this.carDb=carDb;
        this.carNames=carNames;
        this.carBest=carBest;
   }

    public Car getFromDb(final String carId)
    {
       
        return carDb.getFromDb(carId);
    }

    public String getCarsNames()
    {
  
       return carNames.getCarsNames(carDb.getAllCars())
    }

    public Car getBestCar()
    {
        
        return carBest.getBestCar(carDb.getAllCars())
    }
}