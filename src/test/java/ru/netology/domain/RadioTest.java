package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void prevStationUnderMin() {
        Radio station = new Radio();

        station.setCurrentStation(0);
        station.prevStation();
        int actual = station.getCurrentStation();
        int expected = 9;
        assertEquals(expected,actual);
    }

    @Test
    public void prevStationValidValue() {
        Radio station = new Radio();

        station.setCurrentStation(9);
        station.prevStation();
        int actual = station.getCurrentStation();
        int expected = 8;
        assertEquals(expected,actual);
    }

    @Test
    public void nextStationValidValue() {
        Radio station = new Radio();

        station.setCurrentStation(0);
        station.nextStation();
        int actual = station.getCurrentStation();
        int expected = 1;
        assertEquals(expected,actual);
    }

    @Test
    public void nextStationOverMax() {
        Radio station = new Radio();

        station.setCurrentStation(9);
        station.nextStation();
        int actual = station.getCurrentStation();
        int expected = 0;
        assertEquals(expected,actual);
    }




    @Test
    public void settingValidStation() {
        Radio station = new Radio();
        station.setCurrentStation(5);
        int expected = 5;
        int actual = station.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void settingOverMaxStation() {
        Radio station = new Radio();
        station.setCurrentStation(11);
        int expected = 0;
        int actual = station.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void settingUnderMinStation() {
        Radio station = new Radio();
        station.setCurrentStation(-1);
        int expected = 0;
        int actual = station.getCurrentStation();
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
        volume.setCurrentVolume(101);
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
        volume.setCurrentVolume(100);
        volume.increaseCurrentVolume();
        int actual = volume.getCurrentVolume();
        int expected = 100;
        assertEquals(expected,actual);
    }





}
