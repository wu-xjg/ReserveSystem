package com.example.service;

import com.example.entity.Hotel;
import com.example.mapper.HotelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class HotelService {
    private final HotelMapper hotelMapper;

    @Autowired
    public HotelService(HotelMapper hotelMapper) {
        this.hotelMapper = hotelMapper;
    }

    public List<Hotel> getAllHotels() {

        return hotelMapper.getAllHotels();
    }

    public Hotel getHotelByIds(String jId, String bId) {
        return hotelMapper.getHotelByIds(jId, bId);
    }

    public void saveHotel(Hotel hotel) {
        hotelMapper.insertHotel(hotel);
    }

    public void deleteHotel(String jId, String bId) {
        hotelMapper.deleteHotelByIds(jId, bId);
    }
}
