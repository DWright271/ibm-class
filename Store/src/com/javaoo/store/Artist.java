package com.javaoo.store;

import java.util.Map;
import java.util.TreeSet;
import java.util.HashMap;

public class Artist {

	private String name;
	private TreeSet<String> memberNames = new TreeSet<String>();
	private Map<String, TreeSet<String>> memberInstruments = new HashMap<String, TreeSet<String>>();
	 	
	
	/**
	 * @param name
	 * @param memberNames
	 * @param memberInstruments
	 */
	private String name2;
	
	public Artist(String name, TreeSet<String> memberNames, HashMap<String, TreeSet<String>> memberInstruments) {
		this.name = name;
		this.memberNames = memberNames;
		this.memberInstruments = memberInstruments;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	public void addMember(String name2, TreeSet<String> instruments) {
		memberNames.add(name2);
		memberInstruments.put(name2,instruments);
	}
	/**
	 * @return the memberNames
	 */
	public TreeSet<String> getMemberNames() {
		return memberNames;
	}
	
	/**
	 * @param memberNames the memberNames to set
	 */
	public void setMemberNames(TreeSet<String> memberNames) {
		this.memberNames = memberNames;
	}
	/**
	 * @return the memberInstruments
	 */
	public HashMap<String, TreeSet<String>> getMemberInstruments() {
		return (HashMap<String, TreeSet<String>>) memberInstruments;
	}
	/**
	 * @param memberInstruments the memberInstruments to set
	 */
	public void setMemberInstruments(Map<String, TreeSet<String>> memberInstruments) {
		this.memberInstruments = memberInstruments;
	}
	
	public TreeSet<String> getInstruments(String string) {
		
		return memberInstruments.get(name2);}
		
	
	
    public void printMemberInstruments(Artist artist, String string) {
    	for (String member : artist.getMemberNames()) {
    	System.out.println("HotPlate band member "+ member + " plays: ");
    	for (String instrument : artist.getInstruments(string)) {
    		System.out.println('\t' + instrument);}
    	}
    }
	
}
