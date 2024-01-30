package com.example.dermtestapi.doctor.service;

import com.example.dermtestapi.doctor.Doctor;
import com.example.dermtestapi.doctor.repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DoctorService {

    @Autowired
    private DoctorRepository doctorRepository;

    public Doctor getDoctorById(Long id){
        return doctorRepository.findById(id).orElse(null);
    }

    public Doctor addDoctor(Doctor doctor) {
        return doctorRepository.save(doctor);
    }

    public Doctor editDoctorById(Long id, Doctor doctor) {
        Doctor doctorToUpdate = doctorRepository.getReferenceById(id);
        doctorToUpdate.setFirstName(doctor.getFirstName());
        doctorToUpdate.setLastName(doctor.getLastName());
        doctorToUpdate.setSpecialization(doctor.getSpecialization());

        return doctorRepository.save(doctorToUpdate);
    }

    public void deleteDoctor(Long id) {
        doctorRepository.deleteById(id);
    }
}
