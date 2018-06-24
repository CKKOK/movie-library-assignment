package app;

import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/movies")
public class MoviesController {
    private final MovieDatabase movieDatabase;
    
    @Autowired
    public MoviesController(MovieDatabase movieDatabase) {
        this.movieDatabase = movieDatabase;
        System.out.println(this.movieDatabase.getAll().size());
    }

    @RequestMapping(value="", method=RequestMethod.GET)
    List<Movie> getAll(@RequestParam Map<String, String> queryParameters) {
        List<Movie> result = this.movieDatabase.getAll();
        System.out.println(queryParameters);
        return result;
    }

    @RequestMapping(value="/{index}", method=RequestMethod.GET)
    Movie get(@PathVariable("index") int index) {
        return this.movieDatabase.get(index);
    }

    @RequestMapping(value="/", method=RequestMethod.POST)
    ResponseEntity<?> add(@ModelAttribute Movie movie) {
        // must validate user input
        this.movieDatabase.add(movie);
        return ResponseEntity.ok(HttpStatus.CREATED);
    }

    @RequestMapping(value="/{index}", method=RequestMethod.PUT)
    ResponseEntity<?> update(@PathVariable("index") int index, @ModelAttribute Movie movie) {
        // must validate user input
        this.movieDatabase.update(index, movie);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @RequestMapping(value="/{index}", method=RequestMethod.DELETE)
    ResponseEntity<?> delete(@PathVariable("index") int index) {
        this.movieDatabase.delete(index);
        return ResponseEntity.ok(HttpStatus.OK);
    }
}