package ru.netology.radioman;
public class Radio {
    private int currentStation;
    private int volume;

    public int getCurrentStation() {
        return currentStation;
    }

    public int getVolume() {
        return volume;
    }

    public void next (){
        if(currentStation == 9){
            currentStation = 0;
        }
        else{
            currentStation++;
        }
    }
    public void prev (){
        if(currentStation == 0){
            currentStation = 9;
        }
        else{
            currentStation--;
        }
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < 0 || newCurrentStation > 9) {
        return;
        }
        currentStation = newCurrentStation;
    }

    public void setVolume(int newVolume) {
        if ((newVolume < 0) || (newVolume > 10)){
            return;
        }
        volume = newVolume;
    }

    public void increaseTheVolumeByOne(){
        if(volume == 10){
            return;
        }
        volume++;
    }

    public void loweringTheVolumeByOne(){
        if(volume == 0){
            return;
        }
        volume--;
    }
}
