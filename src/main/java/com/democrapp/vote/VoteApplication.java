package com.democrapp.vote;

import com.democrapp.vote.persistence.interfaces.MovieRepository;
import com.democrapp.vote.persistence.models.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class VoteApplication implements CommandLineRunner {
	// bogus comment
	@Autowired
	MovieRepository movieRepository;
	public static void main(String[] args) {
		SpringApplication.run(VoteApplication.class, args);
		System.out.println("running");
	}
	@Override
	public void run(String... args){
		//insertData();
		movieRepository.findAll().forEach(movie -> System.out.println(movie.toString()));
	}
	public void insertData ()
	{
		movieRepository.save(new Movie("Hadi Loves Black Cock" , 5.0 ,"porn-suspense"));
	}
}
