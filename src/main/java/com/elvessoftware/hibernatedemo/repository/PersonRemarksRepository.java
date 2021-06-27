package com.elvessoftware.hibernatedemo.repository;

import com.elvessoftware.hibernatedemo.model.PersonRemarks;
import org.springframework.data.repository.CrudRepository;

public interface PersonRemarksRepository extends CrudRepository<PersonRemarks, Long> {
}