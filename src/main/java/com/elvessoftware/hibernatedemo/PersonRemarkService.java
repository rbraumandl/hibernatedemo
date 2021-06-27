package com.elvessoftware.hibernatedemo;

import com.elvessoftware.hibernatedemo.model.PersonRemarks;
import com.elvessoftware.hibernatedemo.repository.PersonRemarksRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PersonRemarkService {
    private final PersonRemarksRepository personRemarksRepository;

    public PersonRemarkService(PersonRemarksRepository personRemarksRepository) {
        this.personRemarksRepository = personRemarksRepository;
    }

    public List<PersonRemarks> all(){
        List<PersonRemarks> allPersonRemarks = new ArrayList<>();
        Iterable<PersonRemarks> allPersonRemarksIterator = personRemarksRepository.findAll();
        for (PersonRemarks personRemarks : allPersonRemarksIterator) {
            allPersonRemarks.add(personRemarks);
        }
        return allPersonRemarks;
    }
}
