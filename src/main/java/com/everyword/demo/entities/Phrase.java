package com.everyword.demo.entities;

import lombok.Data;
import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="phrases")
@Data
public class Phrase {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Integer id;

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

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name= "vocabulary_set_id", nullable = false)
    private VocabularySet vocId;


}
