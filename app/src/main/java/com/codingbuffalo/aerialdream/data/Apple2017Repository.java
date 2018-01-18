package com.codingbuffalo.aerialdream.data;

import com.codingbuffalo.aerialdream.data.protium.RestRepository;

import java.io.IOException;
import java.util.List;

public class Apple2017Repository extends RestRepository {
    private final static String ENDPOINT = "https://sylvan.apple.com/Aerials/2x/entries.json";

    public List<Apple2017Video> fetchVideos() throws IOException {
        Wrapper wrapper = fetch(Wrapper.class, ENDPOINT);
        return wrapper.assets;
    }

    private static class Wrapper {
        private List<Apple2017Video> assets;
    }
}
