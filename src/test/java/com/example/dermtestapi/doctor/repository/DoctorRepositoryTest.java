package com.example.dermtestapi.doctor.repository;

import com.example.dermtestapi.doctor.Doctor;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
public class DoctorRepositoryTest {

    @Autowired
    private TestEntityManager entityManager;
    @Autowired
    private DoctorRepository doctorRepository;

    @Test
    public void testSaveDoctor() {
        // Given
        Doctor doctor = new Doctor("John", "Doe", "Dermatologist");
        entityManager.persist(doctor);

        // When
        Doctor savedDoctor = doctorRepository.save(doctor);

        // Then
        assertNotNull(savedDoctor.getId());
        assertEquals("John", savedDoctor.getFirstName());
        assertEquals("Doe", savedDoctor.getLastName());
        assertEquals("Dermatologist", savedDoctor.getSpecialization());
    }

}
