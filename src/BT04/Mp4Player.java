package BT04;

class Mp4Player implements AdvancedMediaPlayer {
    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file: " + fileName);
    }

    @Override
    public void playVlc(String fileName) {
    }
}