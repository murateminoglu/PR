package de.gastev.beispiel.service;

import de.gastev.beispiel.entity.ReleaseInfo;
import de.gastev.beispiel.repository.ReleaseRepository;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

@Service
public class ReleaseServiceImpl implements ReleaseService {
    private final ReleaseRepository releaseRepository;

    public ReleaseServiceImpl(ReleaseRepository releaseRepository) {
        this.releaseRepository = releaseRepository;
    }

    @Override
    public List<ReleaseInfo> getAllReleaseInfo() {
        return releaseRepository.findAll();
    }

    @Override
    public ReleaseInfo getReleaseInfoById(Long id) {
        Optional<ReleaseInfo> optionalReleaseInfo = releaseRepository.findById(id);
        return optionalReleaseInfo.orElse(null);
    }

    @Override
    public ReleaseInfo createReleaseInfo(ReleaseInfo releaseInfo) {
        return releaseRepository.save(releaseInfo);
    }

    @Override
    public ReleaseInfo updateReleaseInfo(Long id, ReleaseInfo releaseInfo) {
        if (releaseRepository.existsById(id)) {
            releaseInfo.setId(id);
            return releaseRepository.save(releaseInfo);
        }
        return null;
    }

    @Override
    public void deleteReleaseInfo(Long id) {
        releaseRepository.deleteById(id);
    }

    @Override
    public List<ReleaseInfo> getReleaseInfo(String giteaApiToken, String owner, String repo) throws IOException {
        // Gerekli implementasyon
        return null;
    }


}

