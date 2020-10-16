package com.everyword.demo.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="vocabulary_sets")
@Data
public class VocabularySet {

    @Id
    @GeneratedValue
    @Column(name="id")
    private int id;

    @Column(name="name")
    private String name;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name= "phrase_id", nullable = false)
    private List<Phrase> phraseId;


}
