package de.gastev.beispiel.repository;


import de.gastev.beispiel.entity.PullRequest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PullRequestRepository extends JpaRepository<PullRequest, Long> {
}
