package com.aerothinker.plandb.repository;

import com.aerothinker.plandb.domain.ParaAttr;
import org.javers.spring.annotation.JaversSpringDataAuditable;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;


/**
 * Spring Data  repository for the ParaAttr entity.
 */
@SuppressWarnings("unused")
@Repository
@JaversSpringDataAuditable
public interface ParaAttrRepository extends JpaRepository<ParaAttr, Long>, JpaSpecificationExecutor<ParaAttr> {

}
