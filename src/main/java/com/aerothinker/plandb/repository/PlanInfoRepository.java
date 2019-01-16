package com.aerothinker.plandb.repository;

import com.aerothinker.plandb.domain.PlanInfo;
import org.javers.spring.annotation.JaversSpringDataAuditable;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;


/**
 * Spring Data  repository for the PlanInfo entity.
 */
@SuppressWarnings("unused")
@Repository
@JaversSpringDataAuditable
public interface PlanInfoRepository extends JpaRepository<PlanInfo, Long>, JpaSpecificationExecutor<PlanInfo> {

}
