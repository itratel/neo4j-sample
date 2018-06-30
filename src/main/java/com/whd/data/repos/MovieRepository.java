package com.whd.data.repos;

import com.whd.data.domain.Movie;
import com.whd.data.domain.Person;
import com.whd.data.domain.Relation;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;

import java.util.List;
import java.util.Set;


/**
 * @author MovieRepository
 * @class Hhe
 * @date 2018/6/30 18:42
 * @description Describe the function of this class in one sentence
 **/
public interface MovieRepository extends Neo4jRepository<Movie, Long> {

    Movie findByTitle(String title);


//    @Query("MATCH (m:Movie)<-[rating:RATED]-(user) WHERE id(movie) = {movie} return rating")
//    List<Rating> getRatings(@Param("movie") Movie movie);

    // Co-Actors
//    Set<Person> findByActorsMoviesActorName(String name);

    @Query("MATCH (movie:Movie)<-[:ACTED_IN]-(actor:Person) WHERE id(movie) = {0} RETURN actor")
    Set<Person> findActors(Movie movie);


    @Query("MATCH (p1:Person { name: {0} })-[r1]->(m:Movie)<-[r2]-(p2:Person {name: {1}}) WHERE id(p1) < id(p2) RETURN p1,p2,r1,r2, m AS movie")
    List<Relation> findRelation(String p1, String p2);

}
