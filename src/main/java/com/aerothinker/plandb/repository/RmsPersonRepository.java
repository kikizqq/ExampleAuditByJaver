package com.aerothinker.plandb.repository;

import com.aerothinker.plandb.domain.RmsPerson;
import org.javers.spring.annotation.JaversSpringDataAuditable;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;


/**
 * Spring Data  repository for the RmsPerson entity.
 */
@SuppressWarnings("unused")
@Repository
@JaversSpringDataAuditable
public interface RmsPersonRepository extends JpaRepository<RmsPerson, Long>, JpaSpecificationExecutor<RmsPerson> {

}
