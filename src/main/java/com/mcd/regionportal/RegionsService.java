package com.mcd.regionportal;

import java.util.List;

public interface RegionsService {

    Regions create(Regions user);

    Regions delete(int id);

    List<Regions> findAll();

    Regions findById(int id);

    Regions update(Regions user);
}
