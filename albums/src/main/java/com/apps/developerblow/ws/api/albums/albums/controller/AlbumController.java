package com.apps.developerblow.ws.api.albums.albums.controller;

import com.apps.developerblow.ws.api.albums.albums.models.AlbumRest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/albums")
public class AlbumController {

  @GetMapping
  public List<AlbumRest> getAlbums() {
    AlbumRest album1 = new AlbumRest();
    album1.setAlbumId("album id here");
    album1.setUserId("1");
    album1.setAlbumDescription("album 1 description here");
    album1.setAlbumUrl("album 1 URl");

    AlbumRest album2 = new AlbumRest();
    album2.setAlbumId("album 2 id here");
    album2.setUserId("2");
    album2.setAlbumDescription("album 2 description here");
    album2.setAlbumUrl("album 2 URl");

    return Arrays.asList(album1, album2);
  }
}
