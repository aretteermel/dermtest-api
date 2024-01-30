package com.example.dermtestapi.doctor.repository;

import com.example.dermtestapi.doctor.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepository extends JpaRepository<Doctor, Long> {
    Doctor getDoctorById(long id);

}
