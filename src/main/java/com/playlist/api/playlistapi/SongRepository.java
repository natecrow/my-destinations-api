package com.playlist.api.playlistapi;

import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface SongRepository extends CrudRepository<Song, Long> {
    List<Song> findAll();
}
