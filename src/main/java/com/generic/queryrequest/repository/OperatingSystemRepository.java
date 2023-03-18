package com.generic.queryrequest.repository;

import com.generic.queryrequest.domain.model.OperatingSystem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface OperatingSystemRepository extends JpaRepository<OperatingSystem, Long>,
        JpaSpecificationExecutor<OperatingSystem> {
}
