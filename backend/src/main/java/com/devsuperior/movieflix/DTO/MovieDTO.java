package com.devsuperior.movieflix.DTO;

import java.io.Serializable;

import com.devsuperior.movieflix.entities.Genre;
import com.devsuperior.movieflix.entities.Movie;
import com.fasterxml.jackson.annotation.JsonBackReference;

public class MovieDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String title;
	private String subTitle;
	private Integer ano;
	private String imgUrl;
	

	//private List<Review> reviews = new ArrayList<>();
	
	private String synopsis;
	
	@JsonBackReference
	private Genre genre;
	
	public MovieDTO () {
		
	}

	public MovieDTO(Long id, String title, String subTitle, Integer ano, String imgUrl,
			String synopsis, Genre genre) {
		this.id = id;
		this.title = title;
		this.subTitle = subTitle;
		this.ano = ano;
		this.imgUrl = imgUrl;
		this.synopsis = synopsis;
		this.genre = genre;
	}
	
	public MovieDTO(Movie entity) {
		id =entity.getId();
		title =entity.getSubTitle();
		subTitle =entity.getSubTitle();
		ano = entity.getAno();
		imgUrl = entity.getImgUrl();
		synopsis = entity.getImgUrl();
		genre = entity.getGenre();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSubTitle() {
		return subTitle;
	}

	public void setSubTitle(String subTitle) {
		this.subTitle = subTitle;
	}

	public Integer getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

//	public List<Review> getReviews() {
//		return reviews;
//	}

	public String getSynopsis() {
		return synopsis;
	}

	public void setSynopsis(String synopsis) {
		this.synopsis = synopsis;
	}

	public Genre getGenre() {
		return genre;
	}

	public void setGenre(Genre genre) {
		this.genre = genre;
	}
	
	
	
	
}
