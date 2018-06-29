package com.lwl.data.domain;

import lombok.Data;
import org.neo4j.ogm.response.model.RelationshipModel;
import org.springframework.data.neo4j.annotation.QueryResult;

@Data
@QueryResult
public class Relation {

    private Person p1;
    private Person p2;
    private Movie movie;
    private RelationshipModel r1;
    private RelationshipModel r2;
}
