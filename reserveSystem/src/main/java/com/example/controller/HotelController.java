package com.example.controller;

import com.example.entity.Hotel;
import com.example.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/hotel")
@CrossOrigin(origins = "http://localhost:9528", maxAge = 3600)
public class HotelController {
    private final HotelService hotelService;

    @Autowired
    public HotelController(HotelService hotelService) {
        this.hotelService = hotelService;
    }

    @GetMapping
    public List<Hotel> getAllHotels() {
        return hotelService.getAllHotels();
    }

    @GetMapping("/{jId}/{bId}")
    public Hotel getHotelByIds(@PathVariable String jId, @PathVariable String bId) {
        return hotelService.getHotelByIds(jId, bId);
    }

    @PostMapping
    public void saveHotel(@RequestBody Hotel hotel) {
        hotelService.saveHotel(hotel);
    }

    @DeleteMapping("/{jId}/{bId}")
    public void deleteHotel(@PathVariable String jId, @PathVariable String bId) {
        hotelService.deleteHotel(jId, bId);
    }
}
