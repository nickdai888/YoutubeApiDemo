package com.zezooz.demouseyoutubeapi;




import android.util.Log;

import com.google.android.youtube.player.YouTubePlayer.PlaybackEventListener;

/**
 * Created by nick on 16/8/5.
 */

public class VideoPlaybackEventListener implements PlaybackEventListener {


    private void showMessage(String message) {
        Log.d("VideoPlay",message);
    }

    @Override
    public void onPlaying() {
        // Called when playback starts, either due to user action or call to play().
        showMessage("Playing");
    }

    @Override
    public void onPaused() {
        // Called when playback is paused, either due to user action or call to pause().
        showMessage("Paused");
    }

    @Override
    public void onStopped() {
        // Called when playback stops for a reason other than being paused.
        showMessage("Stopped");
    }

    @Override
    public void onBuffering(boolean b) {
        // Called when buffering starts or ends.
    }

    @Override
    public void onSeekTo(int i) {
        // Called when a jump in playback position occurs, either
        // due to user scrubbing or call to seekRelativeMillis() or seekToMillis()
    }
}
