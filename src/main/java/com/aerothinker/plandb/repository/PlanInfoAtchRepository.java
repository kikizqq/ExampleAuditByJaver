package com.aerothinker.plandb.repository;

import com.aerothinker.plandb.domain.PlanInfoAtch;
import org.javers.spring.annotation.JaversSpringDataAuditable;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;


/**
 * Spring Data  repository for the PlanInfoAtch entity.
 */
@SuppressWarnings("unused")
@Repository
@JaversSpringDataAuditable
public interface PlanInfoAtchRepository extends JpaRepository<PlanInfoAtch, Long>, JpaSpecificationExecutor<PlanInfoAtch> {

}
