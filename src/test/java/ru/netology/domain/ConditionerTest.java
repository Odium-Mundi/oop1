package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConditionerTest {

    @Test
    public void settingValidTemperature() {
        Conditioner condition = new Conditioner();

        condition.setMinTemperature(0);
        condition.setMaxTemperature(30);
        condition.setCurrentTemperature(25);
        int expected = 25;
        int actual = condition.getCurrentTemperature();
        assertEquals(expected, actual);
    }

    @Test
    public void settingTemperatureOverMax() {
        Conditioner condition = new Conditioner();

        condition.setMinTemperature(0);
        condition.setMaxTemperature(30);
        condition.setCurrentTemperature(31);
        int expected = 0;
        int actual = condition.getCurrentTemperature();
        assertEquals(expected, actual);
    }

    @Test
    public void settingTemperatureUnderMin() {
        Conditioner condition = new Conditioner();

        condition.setMinTemperature(0);
        condition.setMaxTemperature(30);
        condition.setCurrentTemperature(-1);
        int expected = 0;
        int actual = condition.getCurrentTemperature();
        assertEquals(expected, actual);
    }
    @Test
    public void shouldIncreaseTemperature() {
        Conditioner condition = new Conditioner();

        condition.setMinTemperature(0);
        condition.setMaxTemperature(30);
        condition.setCurrentTemperature(25);
        condition.increaseCurrentTemperature();
        int expected = 26;
        int actual = condition.getCurrentTemperature();
        assertEquals(expected, actual);
    }
    @Test
    public void shouldDecreaseTemperature() {
        Conditioner condition = new Conditioner();

        condition.setMinTemperature(0);
        condition.setMaxTemperature(30);
        condition.setCurrentTemperature(25);
        condition.decreaseCurrentTemperature();
        int expected = 24;
        int actual = condition.getCurrentTemperature();
        assertEquals(expected, actual);
    }
    @Test
    public void increaseTemperatureOverMax() {
        Conditioner condition = new Conditioner();

        condition.setMinTemperature(0);
        condition.setMaxTemperature(30);
        condition.setCurrentTemperature(30);
        condition.increaseCurrentTemperature();
        int expected = 30;
        int actual = condition.getCurrentTemperature();
        assertEquals(expected, actual);
    }
    @Test
    public void decreaseTemperatureUnderMin() {
        Conditioner condition = new Conditioner();

        condition.setMinTemperature(0);
        condition.setMaxTemperature(30);
        condition.setCurrentTemperature(0);
        condition.decreaseCurrentTemperature();
        int expected = 0;
        int actual = condition.getCurrentTemperature();
        assertEquals(expected, actual);
    }

}