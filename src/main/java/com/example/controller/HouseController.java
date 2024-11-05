package com.example.controller;

import com.example.entity.House;
import com.example.service.HouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/house")
@CrossOrigin(origins = "http://localhost:9528", maxAge = 3600)
public class HouseController {
    private final HouseService houseService;

    @Autowired
    public HouseController(HouseService houseService) {
        this.houseService = houseService;
    }

    @GetMapping
    public List<House> getAllHouses() {
        return houseService.getAllHouses();
    }

    @GetMapping("/{hId}/{jId}")
    public House getHouseByIds(@PathVariable String hId, @PathVariable String jId) {
        return houseService.getHouseByIds(hId, jId);
    }

    @PostMapping
    public void saveHouse(@RequestBody House house) {
        houseService.saveHouse(house);
    }

    @DeleteMapping("/{hId}/{jId}")
    public void deleteHouse(@PathVariable String hId, @PathVariable String jId) {
        houseService.deleteHouse(hId, jId);
    }

}
