package com.codingbuffalo.aerialdream.data;

import android.support.annotation.NonNull;

import com.codingbuffalo.aerialdream.data.protium.Interactor;
import com.codingbuffalo.aerialdream.data.protium.ValueTask;

import java.util.List;
import java.util.concurrent.Executors;

public class VideoInteractor extends Interactor {
    private Listener listener;
    private Apple2015Repository apple2015Repository;
    private Apple2017Repository apple2017Repository;

    public VideoInteractor(@NonNull Listener listener) {
        super(Executors.newCachedThreadPool());
        
        this.listener = listener;
        apple2015Repository = new Apple2015Repository();
        apple2017Repository = new Apple2017Repository();
    }

    public void fetchVideos() {
        execute(new FetchVideosTask());
    }

    private class FetchVideosTask extends ValueTask<List<? extends Video>> {
        @Override
        public List<? extends Video> onExecute() throws Exception {
            return apple2017Repository.fetchVideos();
        }

        @Override
        public void onComplete(List<? extends Video> data) {
            listener.onFetch(new VideoPlaylist(data));
        }
    }

    public interface Listener {
        void onFetch(VideoPlaylist videos);
    }
}
