package de.gastev.beispiel.service;

import de.gastev.beispiel.entity.PullRequest;
import de.gastev.beispiel.repository.PullRequestRepository;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

@Service
public class PullRequestServiceImpl implements PullRequestService{
    private final PullRequestRepository pullRequestRepository;

    public PullRequestServiceImpl( PullRequestRepository pullRequestRepository) {
        this.pullRequestRepository=pullRequestRepository;
    }

    @Override
    public List<PullRequest> getAllPullRequest() {
        return pullRequestRepository.findAll();
    }

    @Override
    public PullRequest getPullRequestById(Long id) {
        Optional<PullRequest> optionalPullRequest = pullRequestRepository.findById(id);
        return optionalPullRequest.orElse(null);
    }

    @Override
    public PullRequest createPullRequest(PullRequest pullRequest) {
        return pullRequestRepository.save(pullRequest);
    }

    @Override
    public PullRequest updatePullRequest(Long id, PullRequest pullRequest) {
        if (pullRequestRepository.existsById(id)) {
            pullRequest.setId(id);
            return pullRequestRepository.save(pullRequest);
        }
        return null;
    }

    @Override
    public void deletePullRequest(Long id) {
        pullRequestRepository.deleteById(id);
    }


    @Override
    public List<PullRequest> getPullRequests(String giteaApiToken, String owner, String repo, String startVersion, String endVersion) throws IOException {
        // Gerekli implementasyon
        return null;
    }
}
