package com.bridgelabs.hotel_reservation_system;

import java.util.ArrayList;
import java.util.List;

public class HotelReservationSystem {
    List<Hotel> hotels = new ArrayList<>();
    public void uc1_addHotel(String name, int rate) {
        Hotel hotel = new Hotel(name, rate);
        hotels.add(hotel);
    }
}
