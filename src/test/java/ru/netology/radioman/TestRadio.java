package ru.netology.radioman;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class TestRadio {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/setNewStationNumber.csv")
    public void setNewStationNumber(long expected) {
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        long actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/setStationUpperOfRange.csv")
    public void setStationUpperOfRange(long expected) {
        Radio radio = new Radio();
        radio.setCurrentStation(15);
        long actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/setStationLowOfRange.csv")
    public void setStationLowOfRange(long expected) {
        Radio radio = new Radio();
        radio.setCurrentStation(-2);
        long actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/checkingNextAt9.csv")
    public void checkingNextAt9(long expected) {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.next();
        long actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/checkingNextNo9.csv")
    public void checkingNextNo9(long expected) {
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        radio.next();
        long actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/checkingPrevAt0.csv")
    public void checkingPrevAt0(long expected) {
        Radio radio = new Radio();
        radio.prev();
        long actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/checkingPrevNo0.csv")
    public void checkingPrevNo0(long expected) {
        Radio radio = new Radio();
        radio.setCurrentStation(6);
        radio.prev();
        long actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/setNewVolume.csv")
    public void setNewVolume(long expected) {
        Radio radio = new Radio();
        radio.setVolume(6);
        long actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/setVolumeUpperOfRange.csv")
    public void setVolumeUpperOfRange(long expected) {
        Radio radio = new Radio();
        radio.setVolume(15);
        long actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);

    }
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/setVolumeLowOfRange.csv")
    public void setVolumeLowOfRange(long expected) {
        Radio radio = new Radio();
        radio.setVolume(-4);
        long actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/TestMaxVolume.csv")
    public void TestMaxVolume(long expected) {
        Radio radio = new Radio();
        radio.setVolume(10);
        radio.increaseTheVolumeByOne();
        long actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/TestIncreaseVolume.csv")
    public void TestIncreaseVolume(long expected) {
        Radio radio = new Radio();
        radio.setVolume(5);
        radio.increaseTheVolumeByOne();
        long actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/TestMinVolume.csv")
    public void TestMinVolume(long expected) {
        Radio radio = new Radio();
        radio.loweringTheVolumeByOne();
        long actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/TestLoweringVolume.csv")
    public void TestLoweringVolume(long expected) {
        Radio radio = new Radio();
        radio.setVolume(5);
        radio.loweringTheVolumeByOne();
        long actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }





}
