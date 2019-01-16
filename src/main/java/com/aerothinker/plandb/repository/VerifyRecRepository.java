package com.aerothinker.plandb.repository;

import com.aerothinker.plandb.domain.VerifyRec;
import org.javers.spring.annotation.JaversSpringDataAuditable;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;


/**
 * Spring Data  repository for the VerifyRec entity.
 */
@SuppressWarnings("unused")
@Repository
@JaversSpringDataAuditable
public interface VerifyRecRepository extends JpaRepository<VerifyRec, Long>, JpaSpecificationExecutor<VerifyRec> {

}
