package br.com.fiap.cp.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;

import br.com.fiap.cp.model.MovieModel;

/*
 * Class responsible for registering, searching, editing and removing a movie.
 * @author Ruan S. Dias.
 */

public class MovieDao {
	Scanner sc = new Scanner(System.in);
	
	private List<MovieModel> movies = new ArrayList<>();
	private String proceed;
	
	MovieModel movie = new MovieModel();
	
	/*
	 * Return the intire list of movies
	 */
	public List<MovieModel> getFullList(){
		return movies;
	}
	
	/*
	 * Displays the movie list.
	 */
	public void displayMoviesList() {
		for(MovieModel movie : movies) {
			System.out.println(movie);
		}
	}
	
	/*
	 * Register a movie into the list.
	 */
	public void register() {
		do {

			String name = JOptionPane.showInputDialog("Digite o nome do filme que deseja adicionar: ");
			int code = Integer.parseInt(JOptionPane.showInputDialog("Digite o código do filme: "));
			System.out.println("Digite o gênero do filme: ");
			String genre = sc.next() + sc.nextLine();
			System.out.println("Digite o nome do diretor: ");
			String director = sc.next() + sc.nextLine();
			System.out.println("Adicione uma descrição do filme: ");
			String description = sc.next() + sc.nextLine();
			System.out.println("Digite a duração do filme em minutos: ");
			int duration = sc.nextInt();
			System.out.println("Digite a avaliação do filme (Entre 0 e 5): ");
			int rating = sc.nextInt();
			 
			
			movies.add(new MovieModel(name, genre, director, description, duration, code, rating));
//			movies.add(new MovieModel(name, code));
						
			proceed = JOptionPane.showInputDialog("Deseja cadastrar mais um filme? (Y/N)");
		} while(proceed.equalsIgnoreCase("Y"));
	}
	
	/*
	 * Remove a movie of the list by it's name
	 */
	public void removeByName() {
		
		do {
			String name = JOptionPane.showInputDialog("Digite o nome do filme que deseja excluir: ");
			
			for(int i = 0; i < movies.size(); i++) {
				if(movies.get(i).getName().equalsIgnoreCase(name)) {
					movies.remove(i);
				}
			}
						
			proceed = JOptionPane.showInputDialog("Deseja excluir algum filme do catálogo? (Y/N)");
		} while(proceed.equalsIgnoreCase("Y"));
	}
	
	/*
	 * Remove a movie of the list by it's code
	 */
	public void removeByCode() {
		
		do {
			int code = Integer.parseInt(JOptionPane.showInputDialog("Digite o código do filme que deseja excluir: "));
			
			for(int i = 0; i < movies.size(); i++) {
				if(movies.get(i).getCode() == code) {
					movies.remove(i);
				}
			}
						
			proceed = JOptionPane.showInputDialog("Deseja excluir mais algum filme do catálogo? (Y/N)");
		} while(proceed.equalsIgnoreCase("Y"));
		
		
	}
	
	/*
	 * Search a movie of the list by it's name
	 */
	public void getMovieByName(){
		List<MovieModel> movieByName = new ArrayList<>();
		
		String name = JOptionPane.showInputDialog("Digite o nome do filme que deseja procurar: ");
		
		for (MovieModel movie : movies) {
			if(movie.getName().equalsIgnoreCase(name)) {
				movieByName.add(movie);
			}
		}
		for(MovieModel movieName : movieByName) {
			System.out.println(movieName);
		}
	}
	
	/*
	 * Search a movie of the list by it's code
	 */
	public void getMovieByCode(){	
		List<MovieModel> movieByCode = new ArrayList<>();
		
		int code = Integer.parseInt(JOptionPane.showInputDialog("Digite o código do filme que deseja procurar: "));
		
		for(MovieModel movie : movies) {
			if(movie.getCode() == code) {
				movieByCode.add(movie);
			}
		}
		for(MovieModel movieCode : movieByCode) {
			System.out.println(movieCode);
		}
	}
	
	/*
	 * Search a movie of the list by director
	 */
	public void getMovieByDirector(){	
		List<MovieModel> movieByDirector = new ArrayList<>();
		
		String director = JOptionPane.showInputDialog("Digite o nome do filme que deseja procurar: ");
		
		for(MovieModel movie : movies) {
			if(movie.getDirector().equalsIgnoreCase(director)) {
				movieByDirector.add(movie);
			}
		}
		for(MovieModel movieDirector : movieByDirector) {
			System.out.println(movieDirector);
		}	
	}
	
	/*
	 * Search a movie of the list by genres
	 */
	public void getMovieByGenre(){	
		List<MovieModel> movieByGenre = new ArrayList<>();
		
		String genre = JOptionPane.showInputDialog("Digite o gênero do filme que deseja procurar: ");
		
		for(MovieModel movie : movies) {
			if(movie.getGenre().equalsIgnoreCase(genre)) {
				movieByGenre.add(movie);
			}
		}
		for(MovieModel movieGenre : movieByGenre) {
			System.out.println(movieGenre);
		}			
	}
	
	/*
	 * Search a movie of the list by rating
	 */
	public void getMovieByRating(){	
		List<MovieModel> movieByRating = new ArrayList<>();
		
		int rating = Integer.parseInt(JOptionPane.showInputDialog("Digite o código do filme que deseja procurar: "));
		
		for(MovieModel movie : movies) {
			if(movie.getRating() == rating) {
				movieByRating.add(movie);
			}
		}
		for(MovieModel movieRating : movieByRating) {
			System.out.println(movieRating);
		}	
	}
	
	public void editMovieName() {
		Scanner sc = new Scanner(System.in);
		
		String wrongName = JOptionPane.showInputDialog("Digite o nome do filme que deseja alterar: ");
		String rightName = JOptionPane.showInputDialog("Digite o nome para o qual você deseja alterar: ");
		
		for(int i = 0; i < movies.size(); i++) {
			if(movies.get(i).getName().equalsIgnoreCase(wrongName)) {
				movies.get(i).setName(rightName);
			}
		}
		sc.close();
	}
	
	public void editMovieDirector() {
		Scanner sc = new Scanner(System.in);
		
		String wrongName = JOptionPane.showInputDialog("Digite o nome do diretor que deseja alterar: ");
		String rightName = JOptionPane.showInputDialog("Digite o nome para o qual você deseja alterar: ");
		
		for(int i = 0; i < movies.size(); i++) {
			if(movies.get(i).getDirector().equalsIgnoreCase(wrongName)) {
				movies.get(i).setDirector(rightName);
			}
		}
		sc.close();
	}
	
	public void editMovieGenre() {
		Scanner sc = new Scanner(System.in);
		
		String wrongGenre = JOptionPane.showInputDialog("Digite o gênero que deseja alterar: ");
		String rightGenre = JOptionPane.showInputDialog("Digite o gênero para o qual você deseja alterar: ");
		
		for(int i = 0; i < movies.size(); i++) {
			if(movies.get(i).getGenre().equalsIgnoreCase(wrongGenre)) {
				movies.get(i).setGenre(rightGenre);
			}
		}
		sc.close();
	}
	
	public void editMovieDescription() {
		Scanner sc = new Scanner(System.in);
		
		String movieName = JOptionPane.showInputDialog("Digite o nome do filme que deseja alterar a descrição: ");
		String rightDescription = JOptionPane.showInputDialog("Digite a descrição para a qual você deseja alterar: ");
		
		for(int i = 0; i < movies.size(); i++) {
			if(movies.get(i).getName().equalsIgnoreCase(movieName)) {
				movies.get(i).setDescription(rightDescription);
			}
		}
		sc.close();
	}
	
	public void editMovieDuration() {
		Scanner sc = new Scanner(System.in);
		
		String movieName = JOptionPane.showInputDialog("Digite o filme do filme que deseja alterar sua duração: ");
		int rightDuration = Integer.parseInt(JOptionPane.showInputDialog("Digite a duração para a qual você deseja alterar: "));
		
		for(int i = 0; i < movies.size(); i++) {
			if(movies.get(i).getName().equalsIgnoreCase(movieName)) {
				movies.get(i).setDuration(rightDuration);
			}
		}
		sc.close();
	}
	
	public void editMovieCode() {
		Scanner sc = new Scanner(System.in);
		
		int wrongCode = Integer.parseInt(JOptionPane.showInputDialog("Digite o código do filme que deseja alterar: "));
		int rightCode = Integer.parseInt(JOptionPane.showInputDialog("Digite o código para o qual você deseja alterar: "));
		
		for(int i = 0; i < movies.size(); i++) {
			if(movies.get(i).getCode() == wrongCode) {
				movies.get(i).setCode(rightCode);
			}
		}
		sc.close();
	}
	
	public void editMovieRating() {
		Scanner sc = new Scanner(System.in);
		
		String movieName = JOptionPane.showInputDialog("Digite o nome do filme que deseja alterar: ");
		int rightRating = Integer.parseInt(JOptionPane.showInputDialog("Digite a avaliação para o qual você deseja alterar: "));
		
		for(int i = 0; i < movies.size(); i++) {
			if(movies.get(i).getName().equalsIgnoreCase(movieName)) {
				movies.get(i).setRating(rightRating);
			}
		}
		sc.close();
	}	

}
