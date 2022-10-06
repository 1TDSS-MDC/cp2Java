package br.com.fiap.cp.model;

public class MovieModel {
	
	private String name;
	private String genre;
	private String director;
	private String description;
	private int duration;
	private int code;
	private int rating;
	
	public MovieModel(){}
	
	public MovieModel(String name, int code) {
		this.name = name;
		this.code = code;
	}
	
	public MovieModel(String name, String genre, String director, String description, int duration,int code, int rating) {
		this.name = name;
		this.genre = genre;
		this.director = director;
		this.description = description;
		this.duration = duration;
		this.code = code;
		this.rating = rating;
	}
	
	

	@Override
	public String toString() {
		return "\n-----------------------------------------------------------\n\nFilme: " + name
				+"\nGênero: " + genre
				+"\nDescrição: " + description
				+"\nDuração: " + duration
				+"\nCódigo: " + code
				+"\nAvaliação: " + rating;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}
	
	public int getCode() {
		return code;
	}
	
	public void setCode(int code) {
		this.code = code;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

}
