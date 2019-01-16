package com.aerothinker.plandb.repository;

import com.aerothinker.plandb.domain.RmsNode;
import org.javers.spring.annotation.JaversSpringDataAuditable;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;


/**
 * Spring Data  repository for the RmsNode entity.
 */
@SuppressWarnings("unused")
@Repository
@JaversSpringDataAuditable
public interface RmsNodeRepository extends JpaRepository<RmsNode, Long>, JpaSpecificationExecutor<RmsNode> {

}
