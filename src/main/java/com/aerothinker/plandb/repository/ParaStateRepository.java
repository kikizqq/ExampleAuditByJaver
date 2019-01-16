package com.aerothinker.plandb.repository;

import com.aerothinker.plandb.domain.ParaState;
import org.javers.spring.annotation.JaversSpringDataAuditable;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;


/**
 * Spring Data  repository for the ParaState entity.
 */
@SuppressWarnings("unused")
@Repository
@JaversSpringDataAuditable
public interface ParaStateRepository extends JpaRepository<ParaState, Long>, JpaSpecificationExecutor<ParaState> {

}
