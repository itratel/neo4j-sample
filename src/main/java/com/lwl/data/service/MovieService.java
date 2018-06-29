package com.lwl.data.service;

import com.lwl.data.domain.Movie;
import com.lwl.data.domain.Person;
import com.lwl.data.domain.Relation;
import com.lwl.data.repos.MovieRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collections;
import java.util.List;
import java.util.Set;

@Service
public class MovieService {

    private final MovieRepository movieRepository;
    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    @Transactional(readOnly = true)
    public Movie findByTitle(String title) {
        return movieRepository.findByTitle(title);
    }

    @Transactional(readOnly = true)
    public Set<Person> findMovieActors(String title) {
        Movie movie = this.findByTitle(title);
        if (movie != null) {
            return movieRepository.findActors(movie);
        }

        return Collections.emptySet();
    }

    @Transactional(readOnly = true)
    public List<Relation> findRelation(String p1, String p2) {
        return movieRepository.findRelation(p1, p2);
    }

}
