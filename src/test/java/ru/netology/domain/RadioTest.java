package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void prevStationUnderMin() {
        Radio station = new Radio();

        station.setNumberCurrentStation(0);
        station.prevStation();
        int actual = station.getNumberCurrentStation();
        int expected = 9;
        assertEquals(expected,actual);
    }

    @Test
    public void prevStationValidValue() {
        Radio station = new Radio();

        station.setNumberCurrentStation(9);
        station.prevStation();
        int actual = station.getNumberCurrentStation();
        int expected = 8;
        assertEquals(expected,actual);
    }

    @Test
    public void nextStationValidValue() {
        Radio station = new Radio();

        station.setNumberCurrentStation(0);
        station.nextStation();
        int actual = station.getNumberCurrentStation();
        int expected = 1;
        assertEquals(expected,actual);
    }

    @Test
    public void nextStationOverMax() {
        Radio station = new Radio();

        station.setNumberCurrentStation(9);
        station.nextStation();
        int actual = station.getNumberCurrentStation();
        int expected = 0;
        assertEquals(expected,actual);
    }




    @Test
    public void settingValidStation() {
        Radio station = new Radio();
        station.settingStation(5);
        int expected = 5;
        int actual = station.getNumberCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void settingOverMaxStation() {
        Radio station = new Radio();
        station.settingStation(11);
        int expected = 0;
        int actual = station.getNumberCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void settingUnderMinStation() {
        Radio station = new Radio();
        station.settingStation(-1);
        int expected = 0;
        int actual = station.getNumberCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void validCurrentVolume() {
        Radio volume = new Radio();
        volume.setCurrentVolume(5);
        int expected = 5;
        int actual = volume.getCurrentVolume();
        assertEquals(expected,actual);
    }

    @Test
    public void setCurrentVolumeOverMax() {
        Radio volume = new Radio();
        volume.setCurrentVolume(11);
        int expected = 0;
        int actual = volume.getCurrentVolume();
        assertEquals(expected,actual);
    }

    @Test
    public void setCurrentVolumeUnderMin() {
        Radio volume = new Radio();
        volume.setCurrentVolume(-1);
        int expected = 0;
        int actual = volume.getCurrentVolume();
        assertEquals(expected,actual);
    }


    @Test
    public void  decreaseValidCurrentVolume() {
        Radio volume = new Radio();
        volume.setCurrentVolume(5);
        volume.decreaseCurrentVolume();
        int actual = volume.getCurrentVolume();
        int expected = 4;
        assertEquals(expected,actual);
    }

    @Test
    public void  decreaseCurrentVolumeUnderMin() {
        Radio volume = new Radio();
        volume.setCurrentVolume(0);
        volume.decreaseCurrentVolume();
        int actual = volume.getCurrentVolume();
        int expected = 0;
        assertEquals(expected,actual);
    }

    @Test
    public void  increaseCurrentValidVolume() {
        Radio volume = new Radio();
        volume.setCurrentVolume(5);
        volume.increaseCurrentVolume();
        int actual = volume.getCurrentVolume();
        int expected = 6;
        assertEquals(expected,actual);
    }

    @Test
    public void  increaseCurrentVolumeOverMax() {
        Radio volume = new Radio();
        volume.setCurrentVolume(10);
        volume.increaseCurrentVolume();
        int actual = volume.getCurrentVolume();
        int expected = 10;
        assertEquals(expected,actual);
    }





}