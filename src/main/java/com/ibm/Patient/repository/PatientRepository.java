package com.ibm.Patient.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.ibm.Patient.model.Patient;

@Repository
public interface PatientRepository extends MongoRepository<Patient, String> {
}

