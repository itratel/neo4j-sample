package com.whd.data.controller;

import com.whd.data.domain.Movie;
import com.whd.data.domain.Person;
import com.whd.data.domain.Relation;
import com.whd.data.service.MovieService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Set;

/**
 * @author whd
 * @class MovieController
 * @date 2018/6/30 18:42
 * @description Describe the function of this class in one sentence
 **/
@RestController
public class MovieController {

    private final MovieService movieService;

    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping("/movie")
    public Movie findByTitle(@RequestParam String title) {
        return this.movieService.findByTitle(title);
    }

    @GetMapping("/movie/actors")
    public Set<Person> findMovieActors(@RequestParam String title) {
        return this.movieService.findMovieActors(title);
    }

    @GetMapping("/relation")
    public List<Relation> findRelation(@RequestParam String p1, @RequestParam String p2) {
        return this.movieService.findRelation(p1, p2);
    }
}
