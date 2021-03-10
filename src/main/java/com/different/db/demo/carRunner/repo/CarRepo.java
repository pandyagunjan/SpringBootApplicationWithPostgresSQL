package com.different.db.demo.carRunner.repo;

import org.springframework.data.repository.CrudRepository;
import com.different.db.demo.carRunner.entity.Car;

import org.springframework.stereotype.Repository;

@Repository
public interface CarRepo extends CrudRepository<Car ,Long > {

    Car findCarByCarURL(String url);
}
