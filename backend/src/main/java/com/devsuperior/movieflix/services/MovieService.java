package com.devsuperior.movieflix.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.ReadOnlyProperty;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.devsuperior.movieflix.DTO.MovieDTO;
import com.devsuperior.movieflix.entities.Movie;
import com.devsuperior.movieflix.repositories.MovieRepository;

@Service
public class MovieService {

	@Autowired
	private MovieRepository movieRepository;
	
	@ReadOnlyProperty
	public Page<MovieDTO> findAll(PageRequest pageRequest){
		
		Page<Movie> list = movieRepository.findAll(pageRequest);
		
		
		return list.map(x -> new MovieDTO(x));
	}
	
	
}
