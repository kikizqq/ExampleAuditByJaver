package com.aerothinker.plandb.repository;

import com.aerothinker.plandb.domain.ParaProp;
import org.javers.spring.annotation.JaversSpringDataAuditable;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;


/**
 * Spring Data  repository for the ParaProp entity.
 */
@SuppressWarnings("unused")
@Repository
@JaversSpringDataAuditable
public interface ParaPropRepository extends JpaRepository<ParaProp, Long>, JpaSpecificationExecutor<ParaProp> {

}
