package com.devsuperior.movieflix.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.ReadOnlyProperty;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.devsuperior.movieflix.DTO.GenreDTO;
import com.devsuperior.movieflix.entities.Genre;
import com.devsuperior.movieflix.repositories.GenreRepository;

@Service
public class GerenService {

	
	@Autowired
	private GenreRepository genreRepository;
	
	@ReadOnlyProperty
	public GenreDTO findById(Long id) {
		
		Optional<Genre> obj = genreRepository.findById(id);
		Genre gen = obj.get();
		
		
		return new GenreDTO(gen);
	}
	
	@ReadOnlyProperty
	public Page<GenreDTO> findAll(PageRequest pageRequest){
		
		Page<Genre> list = genreRepository.findAll(pageRequest);
		
		return list.map(x -> new GenreDTO(x));
	}

	
}
