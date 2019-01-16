package com.aerothinker.plandb.repository;

import com.aerothinker.plandb.domain.PlanInfoStepData;
import org.javers.spring.annotation.JaversSpringDataAuditable;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;


/**
 * Spring Data  repository for the PlanInfoStepData entity.
 */
@SuppressWarnings("unused")
@Repository
@JaversSpringDataAuditable
public interface PlanInfoStepDataRepository extends JpaRepository<PlanInfoStepData, Long>, JpaSpecificationExecutor<PlanInfoStepData> {

}
