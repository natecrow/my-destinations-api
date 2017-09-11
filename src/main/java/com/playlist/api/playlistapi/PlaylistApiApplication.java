package com.playlist.api.playlistapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class PlaylistApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(PlaylistApiApplication.class, args);
	}
	
	@PostMapping("/playlist/{song}")
	public String addSongToPlaylist(@PathVariable String song) {
		String payload = song + " posted...";
		return payload;
	}
	
}
