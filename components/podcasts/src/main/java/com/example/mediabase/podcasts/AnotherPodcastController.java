package com.example.mediabase.podcasts;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController("/podcasts")
public class AnotherPodcastController {

    private PodcastRepository podcastRepository;

    public AnotherPodcastController(PodcastRepository podcastRepository) {
        this.podcastRepository = podcastRepository;
    }

    @GetMapping
    public Iterable<Podcast> allPodcasts(Map<String, Object> model) {
        return podcastRepository.findAll();
    }

    @PostMapping
    public ResponseEntity<Podcast> save(@RequestBody Podcast podcast){
        podcastRepository.save(podcast);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

}
