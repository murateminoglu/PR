package de.gastev.beispiel.service;

import de.gastev.beispiel.entity.PullRequest;
import java.io.IOException;
import java.util.List;
public interface PullRequestService {
    List<PullRequest> getAllPullRequest();
    PullRequest getPullRequestById(Long id);
    PullRequest createPullRequest(PullRequest pullRequest);
    PullRequest updatePullRequest(Long id, PullRequest pullRequest);
    void deletePullRequest(Long id);


    List<PullRequest> getPullRequests(String giteaApiToken, String owner, String repo, String startVersion, String endVersion) throws IOException;


}
