package ru.netology.radioman;

public class Radio {
    private int currentStation  = 0;
    private int currentVolume = 0;
    private int maxStation = 9;
    private int minStation = 0;
    private int minVolume = 0;
    private int maxVolume = 100;

    public Radio(){
        this.currentStation = 9;
    }

    public Radio(int numberOfStations){
        this.maxStation = numberOfStations - 1;
    }

    public int getCurrentStation() {
        return currentStation;
    }
    public int getMaxStation() {
        return maxStation;
    }

    public int getMinStation() {
        return minStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public void next() {
        if (currentStation == maxStation) {
            this.currentStation = minStation;
        } else {
            this.currentStation++;
        }
    }

    public void prev() {
        if (currentStation == minStation) {
            this.currentStation = maxStation;
        } else {
            this.currentStation--;
        }
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < minStation || newCurrentStation > maxStation) {
            return;
        }
        this.currentStation = newCurrentStation;
    }

    public void setVolume(int newVolume) {
        if ((newVolume < minVolume) || (newVolume > maxVolume)) {
            return;
        }
        this.currentVolume = newVolume;
    }

    public void increaseTheVolumeByOne() {
        if (currentVolume == maxVolume) {
            return;
        }
        this.currentVolume++;
    }

    public void loweringTheVolumeByOne() {
        if (currentVolume == minVolume) {
            return;
        }
        this.currentVolume--;
    }
}
