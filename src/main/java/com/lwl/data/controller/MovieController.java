package com.lwl.data.controller;

import com.lwl.data.domain.Movie;
import com.lwl.data.domain.Person;
import com.lwl.data.domain.Relation;
import com.lwl.data.service.MovieService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Set;

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
