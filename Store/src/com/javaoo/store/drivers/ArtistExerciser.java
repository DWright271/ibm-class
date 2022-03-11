package com.javaoo.store.drivers;

import java.util.HashMap;
import java.util.TreeSet;

import com.javaoo.store.*;

public class ArtistExerciser {

	public static void main(String[] args) {
		
		
		TreeSet<String> memberNames = new TreeSet<String>();
		HashMap<String, TreeSet<String>> memberInstruments = new HashMap<String,TreeSet<String>>();
		
		Artist hotPlate = new Artist("Hot Plate", memberNames, memberInstruments);
		
		
        TreeSet<String> instruments1 = new TreeSet<String>();
        instruments1.add("Piano");
        instruments1.add("Clarinet");
        instruments1.add("Hurdy Gurdy");
        instruments1.add("Tuba");

        hotPlate.addMember("Tom", instruments1);
		
        TreeSet<String> instruments2 = new TreeSet<String>();
        instruments2.add("Guitar");
        instruments2.add("Bass");
        instruments2.add("Drums");

        hotPlate.addMember("Steve", instruments2);
        
        hotPlate.printMemberInstruments(hotPlate, "Tom");
        hotPlate.printMemberInstruments(hotPlate, "Steve");
        
		
	}

}
