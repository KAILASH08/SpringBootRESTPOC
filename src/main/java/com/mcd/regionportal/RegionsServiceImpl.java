package com.mcd.regionportal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegionsServiceImpl implements RegionsService {

    @Autowired
    private RegionsRepository repository;

    @Override
    public Regions create(Regions user) {
        return repository.save(user);
    }

    @Override
    public Regions delete(int id) {
        Regions user = findById(id);
        if(user != null){
            repository.delete(user);
        }
        return user;
    }

    @Override
    public List<Regions> findAll() {
        return repository.findAll();
    }

    @Override
    public Regions findById(int id) {
        return repository.findOne(id);
    }

    @Override
    public Regions update(Regions user) {
        return null;
    }
}
