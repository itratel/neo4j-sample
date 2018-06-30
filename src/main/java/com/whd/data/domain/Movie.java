package com.whd.data.domain;

import lombok.Data;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

import java.util.Set;


/**
 * @author whd
 * @class Movie
 * @date 2018/6/30 18:42
 * @description Describe the function of this class in one sentence
 **/
@NodeEntity
@Data
public class Movie {

    @Id
    @GeneratedValue
    private Long id;

    private String title;

    @Relationship(type = "DIRECTED", direction = Relationship.INCOMING)
    private Person director;

    @Relationship(type = "ACTED_IN", direction = Relationship.INCOMING)
    private Set<Person> actors;

//    @Relationship(type = "RATED")
//    List<Rating> ratings;
}
