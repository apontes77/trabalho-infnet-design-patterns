package com.infnet.designpatterns.estruturais.adapter;

public class MP3Player implements MediaPlayer{
    @Override
    public void play(String filename) {
        System.out.println("playing  MP3 file: "+ filename);
    }
}
