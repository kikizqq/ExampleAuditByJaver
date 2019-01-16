package com.aerothinker.plandb.repository;

import com.aerothinker.plandb.domain.PlanInfoStepDataAtch;
import org.javers.spring.annotation.JaversSpringDataAuditable;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;


/**
 * Spring Data  repository for the PlanInfoStepDataAtch entity.
 */
@SuppressWarnings("unused")
@Repository
@JaversSpringDataAuditable
public interface PlanInfoStepDataAtchRepository extends JpaRepository<PlanInfoStepDataAtch, Long>, JpaSpecificationExecutor<PlanInfoStepDataAtch> {

}
