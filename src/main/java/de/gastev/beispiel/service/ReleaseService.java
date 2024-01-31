package de.gastev.beispiel.service;

import de.gastev.beispiel.entity.ReleaseInfo;
import java.io.IOException;
import java.util.List;

public interface ReleaseService {
    List<ReleaseInfo> getAllReleaseInfo();
    ReleaseInfo getReleaseInfoById(Long id);
    ReleaseInfo createReleaseInfo(ReleaseInfo releaseInfo);
    ReleaseInfo updateReleaseInfo(Long id, ReleaseInfo releaseInfo);
    void deleteReleaseInfo(Long id);
    List<ReleaseInfo> getReleaseInfo(String giteaApiToken, String owner, String repo) throws IOException;


}

