package com.apps.developerblow.ws.api.photos.photos.controllers;

import com.apps.developerblow.ws.api.photos.photos.models.Photo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/photos")
public class PhotoController {

  @GetMapping
  public List<Photo> getPhotos() {
    Photo photo1 = new Photo();
    photo1.setPhotoId("1");
    photo1.setAlbumId("1");
    photo1.setUserId("1");
    photo1.setPhotoDescription("Photo 1 description");
    photo1.setPhotoUrl("Photo 1 URL");

    Photo photo2 = new Photo();
    photo2.setPhotoId("2");
    photo2.setAlbumId("2");
    photo2.setUserId("2");
    photo2.setPhotoDescription("Photo 2 description");
    photo2.setPhotoUrl("Photo 2 URL");
    return Arrays.asList(photo1, photo2);
  }
}
