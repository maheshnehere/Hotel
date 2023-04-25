package com.bridgelabs.hotel_reservation_system;

import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*; 
class HotelReservationSystemTest {

    @org.junit.jupiter.api.Test
    void uc1_addHotel() {
        String expected = "Name: LakeWood Rate: 110";
        HotelReservationSystem hotelReservationSystem = new HotelReservationSystem();
        hotelReservationSystem.uc1_addHotel("LakeWood", 110);
        String actual = hotelReservationSystem.hotels.get(0).toString();
        Assertions.assertEquals(expected, actual);
    }
}
