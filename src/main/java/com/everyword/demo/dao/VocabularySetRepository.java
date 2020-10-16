package com.everyword.demo.dao;

import com.everyword.demo.entities.VocabularySet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "VocabularySet", path = "vocabulary_sets")
public interface VocabularySetRepository extends JpaRepository<VocabularySet, Integer> {
}
