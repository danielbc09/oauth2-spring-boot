package com.apps.developerblow.ws.api.photos.photos.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Photo {

    private String albumId;
    private String photoId;
    private String userId;
    private String photoUrl;
    private String photoDescription;
}