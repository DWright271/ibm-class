package com.javaoo.store;

import java.util.Date;

public class ClassicalCD extends Item{
	
	private String composer;
	private String[] performers = new String[5];
	private String recordingLocation;
	private Date releaseDate;
	/**
	 * @return the composer
	 */
	public String getComposer() {
		return composer;
	}
	/**
	 * @param composer the composer to set
	 */
	public void setComposer(String composer) {
		this.composer = composer;
	}
	/**
	 * @return the recordingLocation
	 */
	public String getRecordingLocation() {
		return recordingLocation;
	}
	/**
	 * @param recordingLocation the recordingLocation to set
	 */
	public void setRecordingLocation(String recordingLocation) {
		this.recordingLocation = recordingLocation;
	}
	/**
	 * @return the releaseDate
	 */
	public Date getReleaseDate() {
		return releaseDate;
	}
	/**
	 * @param releaseDate the releaseDate to set
	 */
	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}

	private int performerCount = 0;
	
	public void addPerformer(String p) {
		if (performerCount < performers.length) {
			performers[performerCount] = p;
			performerCount++;
		}
		else {
			System.out.println("No roomleft in performers array.");
		}
		
	}
	
	public void showPerformers(){
		
		for (int i = 0; i < performerCount; i++) {
			System.out.println(performers[i]);
		}
	}
	
	
	
}
