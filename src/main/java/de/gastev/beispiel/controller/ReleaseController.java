package de.gastev.beispiel.controller;

import de.gastev.beispiel.entity.ReleaseInfo;
import de.gastev.beispiel.service.ReleaseService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/releases")
public class ReleaseController {

    private final ReleaseService releaseService;

    public ReleaseController(ReleaseService releaseService) {
        this.releaseService = releaseService;
    }

    @GetMapping
    public List<ReleaseInfo> getAllReleases() {
        return releaseService.getAllReleaseInfo();
    }

    @GetMapping("/{id}")
    public ReleaseInfo getReleaseById(@PathVariable Long id) {
        return releaseService.getReleaseInfoById(id);
    }

    @PostMapping
    public ReleaseInfo createRelease(@RequestBody ReleaseInfo releaseInfo) {
        return releaseService.createReleaseInfo(releaseInfo);
    }

    @PutMapping("/{id}")
    public ReleaseInfo updateRelease(@PathVariable Long id, @RequestBody ReleaseInfo releaseInfo) {
        return releaseService.updateReleaseInfo(id, releaseInfo);
    }

    @DeleteMapping("/{id}")
    public void deleteRelease(@PathVariable Long id) {
        releaseService.deleteReleaseInfo(id);
    }


}

