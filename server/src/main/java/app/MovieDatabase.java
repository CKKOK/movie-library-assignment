package app;

import java.util.List;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import com.fasterxml.jackson.core.type.TypeReference;

class Movie {
    private int id;
    private String title = null;
    private String director = null;
    private String releaseDate = null;
    private String type = null;
    private static int count = 0;

    public Movie() {
        this.id = Movie.count++;
    }

    public Movie(final String title, final String director, final String releaseDate, final String type) {
        this.id = ++Movie.count;
        this.title = title;
        this.director = director;
        this.releaseDate = releaseDate;
        this.type = type;
    }

    public int getId()              {return this.id;}
    public String getTitle()        {return this.title;}
    public String getDirector()     {return this.director;}
    public String getReleaseDate()  {return this.releaseDate;}
    public String getType()         {return this.type;}

    public void setTitle(String title)              {this.title = title;}
    public void setDirector(String director)        {this.director = director;}
    public void setReleaseDate(String releaseDate)  {this.releaseDate = releaseDate;}
    public void setType(String type)                {this.type = type;}
}


public class MovieDatabase {
    private List<Movie> movies;
    private ObjectMapper objectMapper = new ObjectMapper();
    private String jsonFile;
    
    public MovieDatabase(String dataFile) throws IOException {
        this.objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
        this.jsonFile = dataFile;
        this.movies = this.objectMapper.readValue(new File(this.jsonFile), new TypeReference<List<Movie>>(){});
    }
    
    public List<Movie> getAll() {
        return this.movies;
    }

    public Movie get(int index) {
        return this.movies.get(index);
    }

    public void create(String title, String director, String releaseDate, String type) throws IOException {
        Movie movie = new Movie(title, director, releaseDate, type);
        this.movies.add(movie);
        // Need to write file here
        this.objectMapper.writeValue(new FileOutputStream(this.jsonFile), this.movies);
    }

    public void add(Movie movie) {
        this.movies.add(movie);
    }

    public void update(int index, Movie updatedMovie) {
        Movie currentMovie = this.movies.get(index);
        currentMovie.setTitle(updatedMovie.getTitle());
        currentMovie.setDirector(updatedMovie.getDirector());
        currentMovie.setReleaseDate(updatedMovie.getReleaseDate());
        currentMovie.setType(updatedMovie.getType());
    }

    public void delete(int index) {
        this.movies.remove(index);
    }
}