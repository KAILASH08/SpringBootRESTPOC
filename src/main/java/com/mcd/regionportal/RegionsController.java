package com.mcd.regionportal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/*@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)*/
@RestController
@RequestMapping({"/api"})
public class RegionsController {

    @Autowired
    private RegionsService regionService;

    @PostMapping
    public Regions create(@RequestBody Regions user){
        return regionService.create(user);
    }

    @GetMapping(path = {"/{id}"})
    public Regions findOne(@PathVariable("id") int id){
        return regionService.findById(id);
    }

    @PutMapping
    public Regions update(@RequestBody Regions user){
        return regionService.update(user);
    }

    @DeleteMapping(path ={"/{id}"})
    public Regions delete(@PathVariable("id") int id) {
        return regionService.delete(id);
    }

    @GetMapping
    public List<Regions> findAll(){
        return regionService.findAll();
    }
}
