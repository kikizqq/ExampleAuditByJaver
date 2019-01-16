package com.aerothinker.plandb.repository;

import com.aerothinker.plandb.domain.PlanInfoData;
import org.javers.spring.annotation.JaversSpringDataAuditable;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;


/**
 * Spring Data  repository for the PlanInfoData entity.
 */
@SuppressWarnings("unused")
@Repository
@JaversSpringDataAuditable
public interface PlanInfoDataRepository extends JpaRepository<PlanInfoData, Long>, JpaSpecificationExecutor<PlanInfoData> {

}
