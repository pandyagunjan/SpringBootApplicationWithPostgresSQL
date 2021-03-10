package com.different.db.demo.carRunner.controller;

import com.different.db.demo.carRunner.services.AmazonClient;
import com.different.db.demo.carRunner.services.CarServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import com.different.db.demo.carRunner.entity.Car;


@RestController
public class CarController {
    @Autowired
    private AmazonClient amazonClient;

    @Autowired
    private CarServices carServices;

    @PostMapping("/uploadVideo")  //http://localhost:8090/uploadVideo
    public ResponseEntity<Car> uploadFile(@RequestPart(value = "file") MultipartFile file) {
        Car carFile = Car.builder()
                .id(1L)
                .color("black")
                .build();
        carFile.setCarURL(this.amazonClient.uploadFile(file));
        return new ResponseEntity<>(carServices.addVideo(carFile), HttpStatus.ACCEPTED);
    }

    @DeleteMapping("/deleteVideo/{fileURL}")
    public ResponseEntity<?> deleteFile(@RequestPart(value = "nameFile")  String fileURL)
    {
       ;
        return new ResponseEntity<>(carServices.deleteFile(fileURL), HttpStatus.OK);
    }

}
