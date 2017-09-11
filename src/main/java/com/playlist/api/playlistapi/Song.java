package com.playlist.api.playlistapi;

import java.util.UUID;

public class Song {

	private String id;
	private String title;
	private String artist;
	private String album;
	private String year;
	private String genre;
	
	public Song() {
	}
	
	public Song(String title, String artist, String album, String year, String genre) {
		this.id = UUID.randomUUID().toString();
		this.title = title;
		this.artist = artist;
		this.album = album;
		this.year = year;
		this.genre = genre;
	}

	public String getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getAlbum() {
		return album;
	}

	public void setAlbum(String album) {
		this.album = album;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}
	
}
