package com.movieapp.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MovieDetails {
	
	public List<String> showMovies(String language){
//		List<Movies> movies= new ArrayList<>(); 
		
		List<String> movies = null;
			if(language.equals("kannada")) {
//				return  Arrays.asList("SSE","KGF","Kantara");
				movies =  Arrays.asList("SSE","KGF","Kantara");
			}
			if(language.equals("english"))
			{
//				return  Arrays.asList("avatar","ironman","marvel");
				movies =  Arrays.asList("avatar","ironman","marvel");
			}
			 if(language.equals("hindi")) {
//				return  Arrays.asList("zero","yjyd","3 idiots");
				movies =  Arrays.asList("zero","yjyd","3 idiots");
			}
		
			return movies;
	}

}
