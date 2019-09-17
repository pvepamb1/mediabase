package com.example.mediabase.podcasts;

import java.util.Arrays;
import java.util.List;

public class PodcastInitialList {

    public List<Podcast> asList() {
        return Arrays.asList(new Podcast("Wedding Crashers", "David Dobkin", "Comedy"),
                new Podcast("Starsky & Hutch", "Todd Phillips", "Action"),
                new Podcast("Shanghai Knights", "David Dobkin", "Action"),
                new Podcast("I-Spy", "Betty Thomas", "Adventure"),
                new Podcast("The Royal Tenenbaums", "Wes Anderson", "Comedy"),
                new Podcast("Zoolander", "Ben Stiller", "Comedy"),
                new Podcast("Shanghai Noon", "Tom Dey", "Comedy")
        );
    }
}
