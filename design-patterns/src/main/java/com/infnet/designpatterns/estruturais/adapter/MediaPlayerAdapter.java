package com.infnet.designpatterns.estruturais.adapter;

public class MediaPlayerAdapter implements MediaPlayer{

    private AdvancedMediaPlayer advancedMediaPlayer;

    public MediaPlayerAdapter(AdvancedMediaPlayer advancedMediaPlayer) {
        this.advancedMediaPlayer = advancedMediaPlayer;
    }

    @Override
    public void play(String filename) {
        System.out.println("using MediaPlayerAdapter - ");
        advancedMediaPlayer.playFile(filename);
    }
}
