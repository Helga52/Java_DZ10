package ru.netology.javaqa;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class RadioTest {

    @Test
    public void sholdSetMaxRadioStation() {
        Radio service = new Radio(24);
        int expected = 24;
        int actual = service.getMaxRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void sholdSetDefaultMaxRadioStation() {
        Radio service = new Radio();
        int expected = 10;
        int actual = service.getMaxRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void sholdSetSoundVolume() {
        Radio service = new Radio();
        service.setSoundVolume(45);
        int expected = 45;
        int actual = service.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void sholdSetSoundVolumeMinUnder() {
        Radio service = new Radio();
        service.setSoundVolume(-1);
        int expected = 0;
        int actual = service.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void sholdSetSoundVolumeMin() {
        Radio service = new Radio();
        service.setSoundVolume(0);
        int expected = 0;
        int actual = service.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void sholdSetSoundVolumeMinOver() {
        Radio service = new Radio();
        service.setSoundVolume(1);
        int expected = 1;
        int actual = service.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void sholdSetSoundVolumeMax() {
        Radio service = new Radio();
        service.setSoundVolume(100);
        int expected = 100;
        int actual = service.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void sholdSetSoundVolumeMaxOver() {
        Radio service = new Radio();
        service.setSoundVolume(101);
        int expected = 100;
        int actual = service.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void sholdSetSoundVolumeMaxUnder() {
        Radio service = new Radio();
        service.setSoundVolume(99);
        int expected = 99;
        int actual = service.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void sholdSetRadioStation() {
        Radio service = new Radio();
        service.setRadioStation(5);
        int expected = 5;
        int actual = service.getRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void sholdSetRadioStationMax() {
        Radio service = new Radio();
        service.setRadioStation(10);
        int expected = 9;
        int actual = service.getRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void sholdSetRadioStationMaxUnder() {
        Radio service = new Radio();
        service.setRadioStation(9);
        int expected = 9;
        int actual = service.getRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void sholdSetRadioStationMaxOver() {
        Radio service = new Radio();
        service.setRadioStation(11);
        int expected = 9;
        int actual = service.getRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void sholdSetRadioStationMin() {
        Radio service = new Radio();
        service.setRadioStation(0);
        int expected = 0;
        int actual = service.getRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void sholdSetRadioStationMinUnder() {
        Radio service = new Radio();
        service.setRadioStation(-1);
        int expected = 0;
        int actual = service.getRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void sholdSetRadioStationMinOver() {
        Radio service = new Radio();
        service.setRadioStation(1);
        int expected = 1;
        int actual = service.getRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void sholdIncreaseVolume() {
        Radio service = new Radio();
        service.setSoundVolume(50);
        service.increaseVolume();
        int expected = 51;
        int actual = service.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void sholdIncreaseVolumeMax() {
        Radio service = new Radio();
        service.setSoundVolume(99);
        service.increaseVolume();
        int expected = 100;
        int actual = service.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void sholdIncreaseVolumeMin() {
        Radio service = new Radio();
        service.setSoundVolume(-1);
        service.increaseVolume();
        int expected = 1;
        int actual = service.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void sholdIncreaseVolumeOver() {
        Radio service = new Radio();
        service.setSoundVolume(101);
        service.increaseVolume();
        int expected = 100;
        int actual = service.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void sholdDecreaseVolume() {
        Radio service = new Radio();
        service.setSoundVolume(50);
        service.decreaseVolume();
        int expected = 49;
        int actual = service.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void sholdDecreaseVolumeMax() {
        Radio service = new Radio();
        service.setSoundVolume(100);
        service.decreaseVolume();
        int expected = 99;
        int actual = service.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void sholdDecreaseVolumeMin() {
        Radio service = new Radio();
        service.setSoundVolume(0);
        service.decreaseVolume();
        int expected = 0;
        int actual = service.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void sholdDecreaseVolumeOver() {
        Radio service = new Radio();
        service.setSoundVolume(101);
        service.decreaseVolume();
        int expected = 99;
        int actual = service.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void sholdIncreaseRadioStation() {
        Radio service = new Radio();
        service.setRadioStation(5);
        service.increaseRadioStation();
        int expected = 6;
        int actual = service.getRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void sholdIncreaseRadioStationMin() {
        Radio service = new Radio();
        service.setRadioStation(0);
        service.increaseRadioStation();
        int expected = 1;
        int actual = service.getRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void sholdIncreaseRadioStationMax() {
        Radio service = new Radio();
        service.setRadioStation(9);
        service.increaseRadioStation();
        int expected = 0;
        int actual = service.getRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void sholdDecreaseRadioStation() {
        Radio service = new Radio();
        service.setRadioStation(7);
        service.decreaseRadioStation();
        int expected = 6;
        int actual = service.getRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void sholdDecreaseRadioStationMin() {
        Radio service = new Radio();
        service.setRadioStation(0);
        service.decreaseRadioStation();
        int expected = 9;
        int actual = service.getRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void sholdDecreaseRadioStationMax() {
        Radio service = new Radio();
        service.setRadioStation(9);
        service.decreaseRadioStation();
        int expected = 8;
        int actual = service.getRadioStation();
        Assertions.assertEquals(expected, actual);
    }
}