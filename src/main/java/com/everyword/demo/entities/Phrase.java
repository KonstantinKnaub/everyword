package com.everyword.demo.entities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name="phrases")
@Data
public class Phrase {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "original_language")
    private String originalLanguage;

    @Column(name = "translation_language")
    private String translationLanguage;

    @Column(name = "body")
    private String body;

    @Column(name = "translation")
    private String translation;


}
