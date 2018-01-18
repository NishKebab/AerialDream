package com.codingbuffalo.aerialdream.data;

import java.util.Collections;
import java.util.List;

public class VideoPlaylist {
    public enum TYPE {
        DAY, NIGHT, ALL
    }

    private List<? extends Video> videos;

    private int position = 0;

    public VideoPlaylist(List<? extends Video> videos) {
        this.videos = videos;
        Collections.shuffle(this.videos);
        
//        dayVideos = new ArrayList<>();
//        nightVideos = new ArrayList<>();
//        for (Apple2015Video video : this.videos) {
//            if (video.getTimeOfDay().equals("day")) {
//                dayVideos.add(video);
//            } else {
//                nightVideos.add(video);
//            }
//        }
    }

    public Video getVideo(TYPE type) {
//        List<Apple2015Video> list;
//        switch (type) {
//            case DAY:
//                list = dayVideos;
//                break;
//            case NIGHT:
//                list = nightVideos;
//                break;
//            default:
//                list = videos;
//        }

        // Make sure we're not requesting a position
//        position = position % list.size();
        Video video = videos.get(position % videos.size());
        position++;
        return video;
//        return new Video("http://www.sample-videos.com/video/mp4/240/big_buck_bunny_240p_1mb.mp4", "Test", "day");
    }
}
