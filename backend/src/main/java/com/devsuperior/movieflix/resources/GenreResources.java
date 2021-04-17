package com.devsuperior.movieflix.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.movieflix.DTO.GenreDTO;
import com.devsuperior.movieflix.services.GerenService;

@RestController
@RequestMapping(value = "/genre")
public class GenreResources {

	@Autowired
	private GerenService genreService;
	
	@GetMapping(value = "/{id}")
	public GenreDTO findById(@PathVariable Long id) {
		
		return genreService.findById(id);
	}
	
	@GetMapping()
	public ResponseEntity<Page<GenreDTO>> findAll(
			@RequestParam(value = "page", defaultValue = "0") Integer page,
			@RequestParam(value = "linesPerPage", defaultValue = "30") Integer linesPerPage,
			@RequestParam(value = "direction", defaultValue = "ASC") String direction,
			@RequestParam(value = "orderBy", defaultValue = "name") String orderBy
			) {
		
		PageRequest pageRequest = PageRequest.of(page, linesPerPage,Direction.valueOf(direction), orderBy);
		
		Page<GenreDTO> list = genreService.findAll(pageRequest);
		
		return ResponseEntity.ok().body(list);
	}	
	
}
