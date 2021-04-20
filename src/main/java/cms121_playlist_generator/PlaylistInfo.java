/**
 * Class representing information about a playlist
 * 
 */
 
 package cms121_playlist_generator;

import java.util.ArrayList;
import java.util.Random;

public class PlaylistInfo {
	
	private String id;  // Unique id string for this playlist (this will be the same as the filename)
	private ArrayList<String> tracks;  // List of track IDs for this playlist
	
	
	public PlaylistInfo(String id, String title) {
		this.id = id;

		this.tracks = new ArrayList<String>();
	}
	
	
	public String getTitle() {
	    
	}
		
	
	public void addTrack(String newTrackId) {

	}
	
	
	public ArrayList<String> getTracks() {
	    
	}
	
	
	/**
	 * Return the id of a randomly chosen track
	 * @return
	 */
	public String randomTrack() {

	}
	
	
	public String toString() {
		return this.tracks.toString();
	}
}