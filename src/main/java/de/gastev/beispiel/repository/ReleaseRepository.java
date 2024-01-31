package de.gastev.beispiel.repository;

import de.gastev.beispiel.entity.ReleaseInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReleaseRepository extends JpaRepository<ReleaseInfo, Long> {}

