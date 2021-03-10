package com.different.db.demo.carRunner.services;

import com.different.db.demo.carRunner.entity.Car;
import com.different.db.demo.carRunner.repo.CarRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class CarServices {

    @Autowired
    private CarRepo carRepo;

    public Car addVideo(Car carFile) {
        return carRepo.save(carFile);
    }

    public Boolean deleteFile(String fileURL) {
        Car car = carRepo.findCarByCarURL(fileURL);
        carRepo.delete(car);
        return true;

    }
}
