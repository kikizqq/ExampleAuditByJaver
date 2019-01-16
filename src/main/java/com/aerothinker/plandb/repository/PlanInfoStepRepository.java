package com.aerothinker.plandb.repository;

import com.aerothinker.plandb.domain.PlanInfoStep;
import org.javers.spring.annotation.JaversSpringDataAuditable;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;


/**
 * Spring Data  repository for the PlanInfoStep entity.
 */
@SuppressWarnings("unused")
@Repository
@JaversSpringDataAuditable
public interface PlanInfoStepRepository extends JpaRepository<PlanInfoStep, Long>, JpaSpecificationExecutor<PlanInfoStep> {

}
