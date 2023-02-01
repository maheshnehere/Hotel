package com.bridgelabs.hotel_reservation_system;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Hotel Reservation System program");
        HotelReservationSystem hotelReservationSystem = new HotelReservationSystem();
        String[] names = {"LakeWood", "BridgeWood", "RidgeWood"};
        int[] rates = {110, 160, 220};
        for(int i = 0; i < names.length; i++) {
            hotelReservationSystem.uc1_addHotel(names[i], rates[i]);
        }
        System.out.println(hotelReservationSystem.hotels);
    }
}