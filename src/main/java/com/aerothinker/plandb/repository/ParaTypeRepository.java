package com.aerothinker.plandb.repository;

import com.aerothinker.plandb.domain.ParaType;
import org.javers.spring.annotation.JaversSpringDataAuditable;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;


/**
 * Spring Data  repository for the ParaType entity.
 */
@SuppressWarnings("unused")
@Repository
@JaversSpringDataAuditable
public interface ParaTypeRepository extends JpaRepository<ParaType, Long>, JpaSpecificationExecutor<ParaType> {

}
