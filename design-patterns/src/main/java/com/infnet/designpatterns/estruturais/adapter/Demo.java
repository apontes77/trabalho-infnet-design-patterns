package com.infnet.designpatterns.estruturais.adapter;

public class Demo {
    public static void main(String[] args) {
        MediaPlayer player = new MP3Player();
        player.play("musicOne.mp3");
        player = new MediaPlayerAdapter(new MP4Player());
        player.play("musicTwo.mp4");
    }
}
