package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void prevStationUnderMinWithEnterCountStation() {
        Radio station = new Radio(100);

        station.setCurrentStation(0);
        station.prevStation();
        int actual = station.getCurrentStation();
        int expected = 100;
        assertEquals(expected,actual);
    }

    @Test
    public void prevStationValidValueWithEnterCountStation() {
        Radio station = new Radio(100);

        station.setCurrentStation(0);
        station.prevStation();
        int actual = station.getCurrentStation();
        int expected = 100;
        assertEquals(expected,actual);
    }

    @Test
    public void nextStationValidValueWithEnterCountStation() {
        Radio station = new Radio(100);

        station.setCurrentStation(87);
        station.nextStation();
        int actual = station.getCurrentStation();
        int expected = 88;
        assertEquals(expected,actual);
    }

    @Test
    public void nextStationOverMaxWithEnterCountStation() {
        Radio station = new Radio(100);

        station.setCurrentStation(100);
        station.nextStation();
        int actual = station.getCurrentStation();
        int expected = 0;
        assertEquals(expected,actual);
    }

    @Test
    public void settingValidStationWithEnterCountStation() {
        Radio station = new Radio(99);
        station.setCurrentStation(99);
        int expected = 99;
        int actual = station.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void settingOverMaxStationWithEnterCountStation() {
        Radio station = new Radio(100);
        station.setCurrentStation(101);
        int expected = 0;
        int actual = station.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void settingUnderMinStationWithEnterCountStation() {
        Radio station = new Radio(100);
        station.setCurrentStation(-1);
        int expected = 0;
        int actual = station.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void prevStationUnderMin() {
        Radio station = new Radio();

        station.setCurrentStation(0);
        station.prevStation();
        int actual = station.getCurrentStation();
        int expected = 10;
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

        station.setCurrentStation(10);
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
        volume.setCurrentVolume(100);
        int expected = 100;
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
        volume.setCurrentVolume(99);
        volume.decreaseCurrentVolume();
        int actual = volume.getCurrentVolume();
        int expected = 98;
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
        volume.setCurrentVolume(50);
        volume.increaseCurrentVolume();
        int actual = volume.getCurrentVolume();
        int expected = 51;
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
