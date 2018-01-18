package com.codingbuffalo.aerialdream.data;

import android.net.Uri;

public abstract class Video {
    public enum Type {
        APPLE_2015,
        APPLE_2017
    }
    
    private String accessibilityLabel;

    public String getLocation() {
        return accessibilityLabel;
    }
    
    public abstract Uri getUri();

    public abstract Type getType();
}
