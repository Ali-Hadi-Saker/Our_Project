package com.democrapp.vote.core.serviceImpl;

import com.democrapp.vote.core.service.MovieService;
import com.democrapp.vote.persistence.interfaces.MovieRepository;
import com.democrapp.vote.persistence.models.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MovieServiceImpl implements MovieService {
    @Autowired
    MovieRepository movieRepository ;
    public List<Movie> getMoviesList()
    {
        return  movieRepository.findAll();
    }
}
