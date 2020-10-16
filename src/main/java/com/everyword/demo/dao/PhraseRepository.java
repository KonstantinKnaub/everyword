package com.everyword.demo.dao;

import com.everyword.demo.entities.Phrase;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PhraseRepository extends JpaRepository<Phrase, Integer> {

}
