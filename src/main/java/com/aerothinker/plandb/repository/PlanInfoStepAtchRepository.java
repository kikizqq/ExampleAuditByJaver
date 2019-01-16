package com.aerothinker.plandb.repository;

import com.aerothinker.plandb.domain.PlanInfoStepAtch;
import org.javers.spring.annotation.JaversSpringDataAuditable;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;


/**
 * Spring Data  repository for the PlanInfoStepAtch entity.
 */
@SuppressWarnings("unused")
@Repository
@JaversSpringDataAuditable
public interface PlanInfoStepAtchRepository extends JpaRepository<PlanInfoStepAtch, Long>, JpaSpecificationExecutor<PlanInfoStepAtch> {

}
