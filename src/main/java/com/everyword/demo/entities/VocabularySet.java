package com.everyword.demo.entities;

import lombok.Data;
import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="vocabulary_sets")
@Data
public class VocabularySet {

    @Id
    @GeneratedValue
    @Column(name="id")
    private Integer id;

    @Column(name="name")
    private String name;

    @OneToMany
    @JoinColumn(name= "phrase_id", nullable = false)
    private List<Phrase> phrases;

}
