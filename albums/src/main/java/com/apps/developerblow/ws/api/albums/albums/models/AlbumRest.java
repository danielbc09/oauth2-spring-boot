package com.apps.developerblow.ws.api.albums.albums.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AlbumRest {

  private String albumId;
  private String userId;
  private String AlbumTitle;
  private String AlbumDescription;
  private String AlbumUrl;
}
