package com.example.songservice.POJO;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Data
@Document("Song")
public class Song implements Serializable {
    @Id
    private String _id;
    private String title;
    private String lyrics;
    private String artist;
    private String email;
    private String dataAudio;
    private String image;
    private String date;
    private String album;
    private double like;
    private double dislike;
    private double view;

    public Song() {
    }


    public Song(String title, String lyrics, String artist,String email, String dataAudio, String image, String date, String album, double like, double dislike, double view) {
        this.title = title;
        this.lyrics = lyrics;
        this.artist = artist;
        this.email = email;
        this.dataAudio = dataAudio;
        this.image = image;
        this.date = date;
        this.album = album;
        this.like = like;
        this.dislike = dislike;
        this.view = view;
    }

}
