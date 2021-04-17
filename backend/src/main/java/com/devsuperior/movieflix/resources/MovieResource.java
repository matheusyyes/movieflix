package com.devsuperior.movieflix.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.movieflix.DTO.MovieDTO;
import com.devsuperior.movieflix.services.MovieService;

@RestController
@RequestMapping("/movie")
public class MovieResource {

	@Autowired
	private MovieService movieService;
	
	@GetMapping
	public ResponseEntity<Page<MovieDTO>> findAll(
			@RequestParam(name = "page", defaultValue = "0") Integer page,
			@RequestParam(name = "linesPerPage", defaultValue = "12") Integer linesPerPage,
			@RequestParam(value = "direction", defaultValue = "ASC") String direction,
			@RequestParam(name = "orderBy", defaultValue = "title")String orderBy
			) {
		
		PageRequest pageRequest = PageRequest.of(page, linesPerPage,Direction.valueOf(direction), orderBy);
		
		Page<MovieDTO> dto = movieService.findAll(pageRequest);
		
		return ResponseEntity.ok().body(dto);
	}
	
}
