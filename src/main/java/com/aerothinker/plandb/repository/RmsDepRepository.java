package com.aerothinker.plandb.repository;

import com.aerothinker.plandb.domain.RmsDep;
import org.javers.spring.annotation.JaversSpringDataAuditable;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;


/**
 * Spring Data  repository for the RmsDep entity.
 */
@SuppressWarnings("unused")
@Repository
@JaversSpringDataAuditable
public interface RmsDepRepository extends JpaRepository<RmsDep, Long>, JpaSpecificationExecutor<RmsDep> {

}
