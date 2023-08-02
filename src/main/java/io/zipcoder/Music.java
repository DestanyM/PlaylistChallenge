package io.zipcoder;

public class Music {

    private String[] playList;
    private Integer currentIndex;

    public Music(String[] playList){
        this.playList = playList;
    }

    public Integer selection(Integer startIndex, String selection){
        int nextSong = 0;
        int previousSong = 0;
        this.currentIndex = startIndex;
        while(!playList[currentIndex].equals(selection)) {
            up();
            nextSong++;
        }
        this.currentIndex = startIndex;
        while(!playList[currentIndex].equals(selection)) {
            down();
            previousSong++;
        }
        if(previousSong<nextSong){
            return previousSong;
        }
        return nextSong;
    }

    private void up() {
        if (this.currentIndex >= playList.length) {
            this.currentIndex = 0;
        } else {
            this.currentIndex++;

        }
    }

    public void down() {
        if (this.currentIndex == 0) {
            this.currentIndex = playList.length - 1;
        } else {
            this.currentIndex--;
        }
    }
}
