package com.marcus.HotelSystem;

import java.util.ArrayList;
import java.util.Random;

public class Room {
	private int roomNumber;
	private ArrayList<Integer> availableRooms;
	private int[] Number = {100, 101, 102, 103, 104, 105};



	
//	public Room(int roomNumber, boolean isOccupied, String roomType) {
//		this.roomNumber = roomNumber;
//		this.isOccupied = isOccupied;
////		this.roomType = roomType;
//	}
	
	public Room(int roomNumber) {
		this.roomNumber = roomNumber;
	}
	
	private int assignRoom() {
		roomNumber = new Random().nextInt(openRooms.length);
		return roomNumber;
	}
	
	public int getRoomAssingment() {
		return roomNumber;
	}
		
		
		
		
		
		
	
	

}
