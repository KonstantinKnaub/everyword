package com.everyword.demo.controllers;

import com.everyword.demo.dao.PhraseRepository;
import com.everyword.demo.dao.VocabularySetRepository;
import com.everyword.demo.entities.Phrase;
import com.everyword.demo.entities.VocabularySet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class HomeController {

    @Autowired
    VocabularySetRepository vocabularySetRepository;

    @Autowired
    PhraseRepository phraseRepository;

    @GetMapping("/sets")
    public List<VocabularySet> getAllSets() {
        return vocabularySetRepository.findAll();
    }

    @RequestMapping("/sets/{id}")
    public Optional<Phrase> getPhrasesBySetId(@PathVariable int id){
        return phraseRepository.getAllByVocId(vocabularySetRepository.getOne(id));
    }

}
