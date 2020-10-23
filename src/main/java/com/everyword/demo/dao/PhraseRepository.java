package com.everyword.demo.dao;

import com.everyword.demo.entities.Phrase;
import com.everyword.demo.entities.VocabularySet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;
import java.util.Optional;

@CrossOrigin("http://localhost:4200")
public interface PhraseRepository extends JpaRepository<Phrase, Integer> {


    Optional <Phrase> getAllByVocId(VocabularySet id);

}
