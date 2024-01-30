package com.example.dermtestapi.doctor.controller;

import com.example.dermtestapi.doctor.Doctor;
import com.example.dermtestapi.doctor.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class DoctorController {

    @Autowired
    private DoctorService doctorService;

    @GetMapping("/doctor/{id}")
    public ResponseEntity<Doctor> getDoctorById(@PathVariable("id") Long id) {
        Doctor doctor = doctorService.getDoctorById(id);

        return doctor != null ? ResponseEntity.ok(doctor) : ResponseEntity.notFound().build();
    }

    @PostMapping("/add-doctor")
    public ResponseEntity<String> addDoctor(@RequestBody Doctor doctor) {
        Doctor savedDoctor = doctorService.addDoctor(doctor);

        return savedDoctor != null ?
                ResponseEntity.ok("Doctor saved successfully with id: " + doctor.getId()) :
                ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Failed to save doctor");
    }

    @PutMapping("/edit-doctor/{id}")
    public ResponseEntity<String> editDoctorById(@PathVariable("id") Long id, @RequestBody Doctor doctor) {
        Doctor editedDoctor = doctorService.editDoctorById(id, doctor);

        return editedDoctor != null ?
                ResponseEntity.ok("Doctor edited successfully with id: " + id) :
                ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Failed to edit doctor");
    }

    @DeleteMapping("/delete-doctor/{id}")
    public ResponseEntity<String> editDoctorById(@PathVariable("id") Long id) {
        doctorService.deleteDoctor(id);

        return ResponseEntity.ok("Doctor deleted successfully with id: " + id);
    }

}
