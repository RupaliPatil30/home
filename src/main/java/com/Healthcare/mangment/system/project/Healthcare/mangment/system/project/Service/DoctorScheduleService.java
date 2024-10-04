package com.Healthcare.mangment.system.project.Healthcare.mangment.system.project.Service;


import com.Healthcare.mangment.system.project.Healthcare.mangment.system.project.payload.DoctorScheduleDTO;
import com.Healthcare.mangment.system.project.Healthcare.mangment.system.project.payload.DoctorScheduleRequest;

import java.util.List;

public interface DoctorScheduleService {

    DoctorScheduleDTO createSchedule(DoctorScheduleRequest doctorScheduleDTO);

    List<DoctorScheduleDTO> getAllSchedules();

    DoctorScheduleDTO getScheduleById(Long id);

    DoctorScheduleDTO updateSchedule(Long id, DoctorScheduleDTO doctorScheduleDTO);

    boolean deleteSchedule(Long id);
}


