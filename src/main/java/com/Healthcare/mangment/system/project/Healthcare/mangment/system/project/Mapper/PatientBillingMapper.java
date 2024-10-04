package com.Healthcare.mangment.system.project.Healthcare.mangment.system.project.Mapper;



;
import com.Healthcare.mangment.system.project.Healthcare.mangment.system.project.Entity.PatientBilling;
import com.Healthcare.mangment.system.project.Healthcare.mangment.system.project.payload.PatientBillingDTO;
import org.springframework.stereotype.Component;

@Component
public class PatientBillingMapper {

    public PatientBillingDTO toDto(PatientBilling billing) {
        if (billing == null) {
            return null;
        }

        PatientBillingDTO dto = new PatientBillingDTO();
        dto.setId(billing.getId());
        dto.setPatientId(billing.getPatientId());
        dto.setAmount(billing.getAmount());
        dto.setBillingDate(billing.getBillingDate());
        dto.setDescription(billing.getDescription());
        return dto;
    }

    public PatientBilling toEntity(PatientBillingDTO dto) {
        if (dto == null) {
            return null;
        }

        PatientBilling billing = new PatientBilling();
        billing.setId(dto.getId());
        billing.setPatientId(dto.getPatientId());
        billing.setAmount(dto.getAmount());
        billing.setBillingDate(dto.getBillingDate());
        billing.setDescription(dto.getDescription());
        return billing;
    }
}


