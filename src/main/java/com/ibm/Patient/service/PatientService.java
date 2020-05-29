package com.ibm.Patient.service;

import java.util.Optional;

import com.ibm.Patient.model.GetPatientResponse;
import com.ibm.Patient.model.Patient;

public interface PatientService {
	
	public void createPatient(Patient patient);
	
	public GetPatientResponse getAllPatient();
	
	public Optional<Patient> findPatientById(String id);
	
	public void update(Patient patient, String name);
	
	public void deletePatientById(String id);
	
}

