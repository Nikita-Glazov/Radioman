package ru.netology.radioman;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class TestRadio {
    Radio YoYoFM = new Radio();
    @Test
    public void shouldSetNewStation(){
      YoYoFM.setCurrentStation(0);
      Assertions.assertEquals(0,YoYoFM.getCurrentStation());
      YoYoFM.setCurrentStation(10);
      Assertions.assertEquals(0,YoYoFM.getCurrentStation());
      YoYoFM.setCurrentStation(-1);
      Assertions.assertEquals(0,YoYoFM.getCurrentStation());

      YoYoFM.setCurrentStation(1);
      Assertions.assertEquals(1,YoYoFM.getCurrentStation());
      YoYoFM.setCurrentStation(9);
      Assertions.assertEquals(9,YoYoFM.getCurrentStation());


    }
    @Test
    public void shouldPrevStation(){
        YoYoFM.setCurrentStation(0);
        YoYoFM.prev();
        Assertions.assertEquals(9, YoYoFM.getCurrentStation());

        YoYoFM.setCurrentStation(9);
        YoYoFM.prev();
        Assertions.assertEquals(8, YoYoFM.getCurrentStation());
    }

    @Test
    public void shouldNextStation(){
        YoYoFM.setCurrentStation(0);
        YoYoFM.next();
        Assertions.assertEquals(1, YoYoFM.getCurrentStation());

        YoYoFM.setCurrentStation(9);
        YoYoFM.next();
        Assertions.assertEquals(0, YoYoFM.getCurrentStation());

    }

    @Test
    public void shouldSetNewVolume(){
        YoYoFM.setVolume(0);
        Assertions.assertEquals(YoYoFM.getMinVolume(),YoYoFM.getCurrentVolume());
        YoYoFM.setVolume(100);
        Assertions.assertEquals(YoYoFM.getMaxVolume(),YoYoFM.getCurrentVolume());
        YoYoFM.setVolume(-1);
        Assertions.assertEquals(100,YoYoFM.getCurrentVolume());
        YoYoFM.setVolume(101);
        Assertions.assertEquals(100,YoYoFM.getCurrentVolume());

        YoYoFM.setVolume(1);
        Assertions.assertEquals(1,YoYoFM.getCurrentVolume());
        YoYoFM.setVolume(99);
        Assertions.assertEquals(99,YoYoFM.getCurrentVolume());
    }

    @Test
    public void nextVolume(){
        YoYoFM.setVolume(0);
        YoYoFM.increaseTheVolumeByOne();
        Assertions.assertEquals(1, YoYoFM.getCurrentVolume());

        YoYoFM.setVolume(100);
        YoYoFM.increaseTheVolumeByOne();
        Assertions.assertEquals(YoYoFM.getMaxVolume(), YoYoFM.getCurrentVolume());
    }

    @Test
    public void prevVolume(){
        YoYoFM.setVolume(0);
        YoYoFM.loweringTheVolumeByOne();
        Assertions.assertEquals(YoYoFM.getMinVolume(), YoYoFM.getCurrentVolume());

        YoYoFM.setVolume(100);
        YoYoFM.loweringTheVolumeByOne();
        Assertions.assertEquals(99, YoYoFM.getCurrentVolume());
    }

    @Test
    public void shouldSetNewRange(){
        Radio YoYoFM1 = new Radio(15);
        Assertions.assertEquals(14,YoYoFM1.getMaxStation());
        Assertions.assertEquals(0,YoYoFM1.getMinStation());

        Radio YoYoFM2 = new Radio(1);
        Assertions.assertEquals(0,YoYoFM2.getMaxStation());
    }
}
