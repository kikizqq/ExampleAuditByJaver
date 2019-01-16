package com.aerothinker.plandb.repository;

import com.aerothinker.plandb.domain.ParaSource;
import org.javers.spring.annotation.JaversSpringDataAuditable;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;


/**
 * Spring Data  repository for the ParaSource entity.
 */
@SuppressWarnings("unused")
@Repository
@JaversSpringDataAuditable
public interface ParaSourceRepository extends JpaRepository<ParaSource, Long>, JpaSpecificationExecutor<ParaSource> {

}
