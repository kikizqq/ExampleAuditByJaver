package com.aerothinker.plandb.repository;

import com.aerothinker.plandb.domain.ParaCat;
import org.javers.spring.annotation.JaversSpringDataAuditable;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;


/**
 * Spring Data  repository for the ParaCat entity.
 */
@SuppressWarnings("unused")
@Repository
@JaversSpringDataAuditable
public interface ParaCatRepository extends JpaRepository<ParaCat, Long>, JpaSpecificationExecutor<ParaCat> {

}
