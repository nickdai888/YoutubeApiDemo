package com.zezooz.demouseyoutubeapi;


import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayer.PlayerStateChangeListener;

/**
 * Created by nick on 16/8/5.
 */

public class VideoPlayerStateChangeListener implements PlayerStateChangeListener {
    @Override
    public void onLoading() {
        // Called when the player is loading a video
        // At this point, it's not ready to accept commands affecting playback such as play() or pause()
    }

    @Override
    public void onLoaded(String s) {
        // Called when a video is done loading.
        // Playback methods such as play(), pause() or seekToMillis(int) may be called after this callback.
    }

    @Override
    public void onAdStarted() {
        // Called when playback of an advertisement starts.
    }

    @Override
    public void onVideoStarted() {
        // Called when playback of the video starts.
    }

    @Override
    public void onVideoEnded() {
        // Called when the video reaches its end.
    }

    @Override
    public void onError(YouTubePlayer.ErrorReason errorReason) {
        // Called when an error occurs.
    }
}
