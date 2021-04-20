/**
 * Class representing information about a single track in a playlist
 * 
 */
package cms121_playlist_generator;

import java.util.ArrayList;
import java.util.Random;

public class TrackInfo {
	
	private String id;  // Unique id string for this track
	private String title;
	private String artist;
	private ArrayList<String> playlists;  // list of playlist ids that contain this track
	
	
	public TrackInfo(String id, String title, String artist) {
		this.id = id;
		this.title = title;
		this.artist = artist;
		
		this.playlists = new ArrayList<String>();
	}
	
	
	public String getArtist() {
	    
	}
	
	
	public String getTitle() {

	}
		
	
	public void addPlaylist(String newPlaylistId) {
        // Add a new playlist to this.playlists

	}
	
	
	public ArrayList<String> getPlaylists() {
    
	}
	
	
	/**
	 * Return the id of a randomly chosen playlist that contains the track
	 * @return
	 */
	public String randomPlaylist() {
	    
        // Choose and return a random playlist from this.playlists
        
	}
	
	
	public String toString() {
		String response = "";
		response = this.title + "\n" + this.artist + "\n";
		response += this.playlists.toString();
		return response;
	}
}