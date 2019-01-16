package com.aerothinker.plandb.repository;

import com.aerothinker.plandb.domain.PlanInfoDataHis;
import org.javers.spring.annotation.JaversSpringDataAuditable;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;


/**
 * Spring Data  repository for the PlanInfoDataHis entity.
 */
@SuppressWarnings("unused")
@Repository
@JaversSpringDataAuditable
public interface PlanInfoDataHisRepository extends JpaRepository<PlanInfoDataHis, Long>, JpaSpecificationExecutor<PlanInfoDataHis> {

}
