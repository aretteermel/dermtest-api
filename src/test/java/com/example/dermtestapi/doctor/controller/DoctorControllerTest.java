package com.example.dermtestapi.doctor.controller;

import com.example.dermtestapi.doctor.Doctor;
import com.example.dermtestapi.doctor.service.DoctorService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(DoctorController.class)
public class DoctorControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private DoctorService doctorService;

    @Test
    public void testGetDoctorById() throws Exception {
        // Given
        Doctor mockDoctor = new Doctor("Susan", "Tree", "Orthopedists");
        mockDoctor.setId(1L);
        Long doctorId = mockDoctor.getId();

        Mockito.when(doctorService.getDoctorById(doctorId)).thenReturn(mockDoctor);

        // When/Then
        mockMvc.perform(get("/doctor/{id}", doctorId)
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$.id").value(doctorId.intValue()))
                .andExpect(jsonPath("$.firstName").value("Susan"))
                .andExpect(jsonPath("$.lastName").value("Tree"))
                .andExpect(jsonPath("$.specialization").value("Orthopedists"));
    }

}
