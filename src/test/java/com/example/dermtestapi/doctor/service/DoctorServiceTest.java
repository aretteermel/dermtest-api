package com.example.dermtestapi.doctor.service;

import com.example.dermtestapi.doctor.Doctor;
import com.example.dermtestapi.doctor.repository.DoctorRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import java.util.Optional;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class DoctorServiceTest {

    @Mock
    private DoctorRepository doctorRepository;

    @InjectMocks
    private DoctorService doctorService;

    @Test
    public void testGetDoctorById() {
        // Given
        Doctor mockDoctor = new Doctor("Ann", "Domino", "Surgeon");
        mockDoctor.setId(1L);

        // When
        when(doctorRepository.findById(1L)).thenReturn(Optional.of(mockDoctor));
        Doctor retrievedDoctor = doctorService.getDoctorById(1L);

        // Then
        assertNotNull(retrievedDoctor);
        assertEquals(1L, retrievedDoctor.getId());
        assertEquals("Ann", mockDoctor.getFirstName());
        assertEquals("Domino", mockDoctor.getLastName());
        assertEquals("Surgeon", mockDoctor.getSpecialization());
    }

}
