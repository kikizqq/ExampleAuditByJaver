package com.aerothinker.plandb.repository;

import com.aerothinker.plandb.domain.ParaClass;
import org.javers.spring.annotation.JaversSpringDataAuditable;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;


/**
 * Spring Data  repository for the ParaClass entity.
 */
@SuppressWarnings("unused")
@Repository
@JaversSpringDataAuditable
public interface ParaClassRepository extends JpaRepository<ParaClass, Long>, JpaSpecificationExecutor<ParaClass> {

}
