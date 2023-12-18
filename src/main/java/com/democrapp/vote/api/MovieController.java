package com.democrapp.vote.api;

import com.democrapp.vote.core.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movies")
public class MovieController {
    @Autowired
    MovieService movieService ;
    @RequestMapping("/moviesList")
    public String findAllMovies(){
        return movieService.getMoviesList().toString();
    }
}
