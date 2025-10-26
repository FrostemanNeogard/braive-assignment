package com.frostemanneogard.braive.patients;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PatientsService {

    private final PatientsRepository patientsRepository;

    public List<Patient> getAllPatients() {
        return this.patientsRepository.findAll();
    }

}
