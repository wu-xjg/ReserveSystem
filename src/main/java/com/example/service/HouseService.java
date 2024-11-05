package com.example.service;

import com.example.entity.House;
import com.example.mapper.HouseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HouseService {
    private final HouseMapper houseMapper;

    @Autowired
    public HouseService(HouseMapper houseMapper) {
        this.houseMapper = houseMapper;
    }

    public List<House> getAllHouses() {
        return houseMapper.getAllHouses();
    }

    public House getHouseByIds(String hId, String jId) {
        return houseMapper.getHouseByIds(hId, jId);
    }

    public void saveHouse(House house) {
        houseMapper.insertHouse(house);
    }

    public void deleteHouse(String hId, String jId) {
        houseMapper.deleteHouseByIds(hId, jId);
    }
}
