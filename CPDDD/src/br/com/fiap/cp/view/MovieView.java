package br.com.fiap.cp.view;

import java.util.Scanner;

import br.com.fiap.cp.dao.MovieDao;

public class MovieView {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MovieDao movieDao = new MovieDao();
		
		movieDao.register();
		movieDao.displayMoviesList();
		System.out.println("\nTotal de filmes: " + movieDao.getFullList().size());
		
		movieDao.removeByName();
		movieDao.displayMoviesList();
		System.out.println("\nTotal de filmes: " + movieDao.getFullList().size());
		
		movieDao.removeByCode();
		movieDao.displayMoviesList();
		System.out.println("\nTotal de filmes: " + movieDao.getFullList().size());
		
		movieDao.editMovieName();
		movieDao.displayMoviesList();
		System.out.println("\nTotal de filmes: " + movieDao.getFullList().size());
		
		movieDao.editMovieCode();
		movieDao.displayMoviesList();
		System.out.println("\nTotal de filmes: " + movieDao.getFullList().size());
		
		
		movieDao.editMovieDirector();
		movieDao.displayMoviesList();
		System.out.println("\nTotal de filmes: " + movieDao.getFullList().size());
		
		movieDao.editMovieGenre();
		movieDao.displayMoviesList();
		System.out.println("\nTotal de filmes: " + movieDao.getFullList().size());
		
		movieDao.editMovieRating();
		movieDao.displayMoviesList();
		System.out.println("\nTotal de filmes: " + movieDao.getFullList().size());
		
		movieDao.editMovieDescription();
		movieDao.displayMoviesList();
		System.out.println("\nTotal de filmes: " + movieDao.getFullList().size());
		
		movieDao.editMovieDuration();
		movieDao.displayMoviesList();
		System.out.println("\nTotal de filmes: " + movieDao.getFullList().size());
		
		movieDao.getMovieByName();
		movieDao.getMovieByCode();
		movieDao.getMovieByDirector();
		movieDao.getMovieByGenre();
		movieDao.getMovieByRating();	
		
		sc.close();
	}

}
