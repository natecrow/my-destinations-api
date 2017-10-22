package com.playlist.api.playlistapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class PlaylistApiApplication {

    @Autowired
    private SongRepository songRepository;

    public static void main(String[] args) {
        SpringApplication.run(PlaylistApiApplication.class, args);
    }

    @GetMapping("/songs")
    public ResponseEntity<List<Song>> getAllSongs() {

        List<Song> songs = songRepository.findAll();

        return new ResponseEntity<>(songs, HttpStatus.OK);
    }

    @PostMapping("/songs")
    public ResponseEntity<Song> createSong(@RequestBody Song body) {
        Song song = new Song(
                body.getTitle(),
                body.getArtist(),
                body.getAlbum(),
                body.getYear(),
                body.getGenre()
        );
        songRepository.save(song);

        return new ResponseEntity<>(song, HttpStatus.OK);
    }

}
