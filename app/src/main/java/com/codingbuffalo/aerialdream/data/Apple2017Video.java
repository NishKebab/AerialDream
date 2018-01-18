package com.codingbuffalo.aerialdream.data;

import android.net.Uri;

import com.google.gson.annotations.SerializedName;

public class Apple2017Video extends Video {
    @SerializedName("url-1080-SDR")
    private String url_1080_SDR;
    @SerializedName("url-1080-HDR")
    private String url_1080_HDR;
    @SerializedName("url-4K-SDR")
    private String url_4K_SDR;
    @SerializedName("url-4K-HDR")
    private String url_4K_HDR;

    public enum Quality {
        SDR_1080,
        HDR_1080,
        SDR_4K,
        HDR_4K,
    }

    public String getUrl(Quality quality) {
        switch (quality) {
            case SDR_1080:
                return url_1080_SDR;
            case HDR_1080:
                return url_1080_HDR;
            case SDR_4K:
                return url_4K_SDR;
            default:
                return url_4K_HDR;
        }
    }

    public Uri getUri(Quality quality) {
        return Uri.parse(getUrl(quality));
    }

    @Override
    public Uri getUri() {
        return getUri(Quality.SDR_1080);
    }

    @Override
    public Type getType() {
        return Type.APPLE_2017;
    }
}
