package com.democrapp.vote.persistence.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("movies")
public class Movie {
    @Id
    private String movieId;

    private String title;

    private Double rating ;

    private String category;

    public Movie() {
    }

    @Override
    public String toString() {
        return "Movie{" +
                "movieId='" + movieId + '\'' +
                ", title='" + title + '\'' +
                ", rating=" + rating +
                ", category='" + category + '\'' +
                '}';
    }

    public Movie(String movieId, String title, Double rating, String category) {
        this.movieId = movieId;
        this.title = title;
        this.rating = rating;
        this.category = category;
    }

    public Movie( String title, Double rating, String category) {
        this.title = title;
        this.rating = rating;
        this.category = category;
    }

    public String getMovieId() {
        return movieId;
    }

    public void setMovieId(String movieId) {
        this.movieId = movieId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
