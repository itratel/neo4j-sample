package com.whd.data.domain;


import lombok.Data;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;


/**
 * @author whd
 * @class Person
 * @date 2018/6/30 18:42
 * @description Describe the function of this class in one sentence
 **/
@NodeEntity
@Data
public class Person {


    @Id
    @GeneratedValue
    private Long id;

    private String name;
}
