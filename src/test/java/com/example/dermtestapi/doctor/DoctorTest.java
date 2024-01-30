package com.example.dermtestapi.doctor;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class DoctorTest {

    @Test
    public void testDoctorGetterSetter() {
        Doctor doctor = new Doctor();
        doctor.setFirstName("John");
        doctor.setLastName("Doe");
        doctor.setSpecialization("Cardiologist");

        assertEquals("John", doctor.getFirstName());
        assertEquals("Doe", doctor.getLastName());
        assertEquals("Cardiologist", doctor.getSpecialization());
    }

}
