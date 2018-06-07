package com.mcd.regionportal;

import org.springframework.data.repository.Repository;

import java.util.List;

public interface RegionsRepository extends Repository<Regions, Integer> {

    void delete(Regions user);

    List<Regions> findAll();

    Regions findOne(int id);

    Regions save(Regions user);
}
