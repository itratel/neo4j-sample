package com.whd.data.domain;

import lombok.Data;
import org.neo4j.ogm.response.model.RelationshipModel;
import org.springframework.data.neo4j.annotation.QueryResult;
/**
 * @author Relation
 * @class Hhe
 * @date 2018/6/30 18:42
 * @description Describe the function of this class in one sentence
 **/
@Data
@QueryResult
public class Relation {

    private Person p1;
    private Person p2;
    private Movie movie;
    private RelationshipModel r1;
    private RelationshipModel r2;
}
