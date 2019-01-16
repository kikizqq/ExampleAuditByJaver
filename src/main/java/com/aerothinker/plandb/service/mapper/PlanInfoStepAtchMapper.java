package com.aerothinker.plandb.service.mapper;

import com.aerothinker.plandb.domain.*;
import com.aerothinker.plandb.service.dto.PlanInfoStepAtchDTO;

import org.mapstruct.*;

/**
 * Mapper for the entity PlanInfoStepAtch and its DTO PlanInfoStepAtchDTO.
 */
@Mapper(componentModel = "spring", uses = {RmsUserMapper.class, PlanInfoStepMapper.class})
public interface PlanInfoStepAtchMapper extends EntityMapper<PlanInfoStepAtchDTO, PlanInfoStepAtch> {

    @Mapping(source = "creator.id", target = "creatorId")
    @Mapping(source = "creator.userName", target = "creatorUserName")
    @Mapping(source = "modifiedBy.id", target = "modifiedById")
    @Mapping(source = "modifiedBy.userName", target = "modifiedByUserName")
    @Mapping(source = "planInfoStep.id", target = "planInfoStepId")
    @Mapping(source = "planInfoStep.name", target = "planInfoStepName")
    PlanInfoStepAtchDTO toDto(PlanInfoStepAtch planInfoStepAtch);

    @Mapping(source = "creatorId", target = "creator")
    @Mapping(source = "modifiedById", target = "modifiedBy")
    @Mapping(source = "planInfoStepId", target = "planInfoStep")
    PlanInfoStepAtch toEntity(PlanInfoStepAtchDTO planInfoStepAtchDTO);

    default PlanInfoStepAtch fromId(Long id) {
        if (id == null) {
            return null;
        }
        PlanInfoStepAtch planInfoStepAtch = new PlanInfoStepAtch();
        planInfoStepAtch.setId(id);
        return planInfoStepAtch;
    }
}
