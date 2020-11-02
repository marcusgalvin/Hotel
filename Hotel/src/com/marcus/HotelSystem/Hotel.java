package com.marcus.HotelSystem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Hotel {
	private String name;
	String guestId;
	private Integer guestCount = 0;
	private HashMap<Integer, Guest> guests;
	
	private int[] openRooms = {100, 101, 102, 103, 104, 105};
	private int[] reservedRooms = {};
	
	public Hotel(String name) {
		this.name = name;
		guests = new HashMap<>();		
	}
	
	
	public void addGuest(String name) {
		String guestId = (++guestCount).toString();
		for(int i = 0; i < openRooms.length; i++) {
				guests.put(openRooms[i], new Guest(name, guestId));	
				System.out.println(name + openRooms[i]);

		}
		
		
		System.out.println(guestId);
	}
	
	public void getRoomWithGues() {
		String output = "";
		for(var test : openRooms.)
	}
	
//	
//	public String toString() {
//		for(Room room : this.guests.keySet()) {
//			String key = name.toString();
//			String value = guests.get(name).toString();
//			
//		}
//		return this.name + this.guests;
//	}
//	
	
	
	@Override
	public String toString() {
		String output = "";
		for(var test : guests.keySet()) {
			output += guests.get(test);
		}
		System.out.println(output);
		return output;
	}
	
	
	
	
	
	public String getName() {
		return this.name;
	}

}
