package com.democrapp.vote.persistence.interfaces;

import com.democrapp.vote.persistence.models.Movie;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface MovieRepository extends MongoRepository<Movie ,String> {

    @Query("{title:'?0'}")
    Movie findMovieByName(String title);

    @Query(value="{category:'?0'}")
    List<Movie> findAllByCategory(String category);

}
