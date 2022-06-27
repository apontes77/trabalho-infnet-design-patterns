package com.infnet.designpatterns.estruturais.adapter;

public class MP4Player implements AdvancedMediaPlayer{
    @Override
    public void playFile(String filename) {
        System.out.println("playing MP4 file: "+ filename);
    }
}
