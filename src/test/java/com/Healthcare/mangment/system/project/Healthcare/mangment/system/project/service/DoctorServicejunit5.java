package com.Healthcare.mangment.system.project.Healthcare.mangment.system.project.service;



import com.Healthcare.mangment.system.project.Healthcare.mangment.system.project.Service.DoctorService;
import com.Healthcare.mangment.system.project.Healthcare.mangment.system.project.payload.DoctorDTO;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

    class DoctorServiceTest {

        @Mock
        private DoctorService doctorService;

        private DoctorDTO doctorDTO;

        @BeforeEach
        void setUp() {
            MockitoAnnotations.openMocks(this);

            doctorDTO = new DoctorDTO();
            doctorDTO.setId(1L);
            doctorDTO.setName("Dr. John Doe");
            doctorDTO.setSpecialty("Cardiology");
        }

        @Test
        void createDoctor_ShouldReturnDoctorDTO() {
            when(doctorService.createDoctor(any(DoctorDTO.class)))
                    .thenReturn(doctorDTO);

            DoctorDTO result = doctorService.createDoctor(doctorDTO);

            assertNotNull(result);
            assertEquals(1L, result.getId());
            assertEquals("Dr. John Doe", result.getName());
            verify(doctorService, times(1)).createDoctor(doctorDTO);
        }



}
