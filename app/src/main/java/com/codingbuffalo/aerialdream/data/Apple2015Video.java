package com.codingbuffalo.aerialdream.data;

import android.net.Uri;

public class Apple2015Video extends Video {
    private String url;
    private String timeOfDay;

    @Override
    public Uri getUri() {
        return Uri.parse(url);
    }

    public String getTimeOfDay() {
        return timeOfDay;
    }

    @Override
    public Type getType() {
        return Type.APPLE_2015;
    }
}
