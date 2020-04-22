package ru.netology.domain;

public class Conditioner {
    private int maxTemperature;
    private int minTemperature;
    private int currentTemperature;
    private boolean on;

    public int getMaxTemperature() {
        return maxTemperature;
    }

    public void setMaxTemperature(int maxTemperature) {
        this.maxTemperature = maxTemperature;
    }

    public int getMinTemperature() {
        return minTemperature;
    }

    public void setMinTemperature(int minTemperature) {
        this.minTemperature = minTemperature;
    }

    public int getCurrentTemperature() {
        return currentTemperature;
    }

    public void setCurrentTemperature(int currentTemperature) {
        if (currentTemperature > maxTemperature && currentTemperature < minTemperature) {
            return;
        }
        this.currentTemperature = currentTemperature;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void increaseCurrentTemperature() {
        if (currentTemperature == maxTemperature) {
            return;
        }
        currentTemperature++;
    }

    public void decreaseCurrentTemperature() {
        if (currentTemperature == minTemperature) {
            return;
        }
        currentTemperature--;
    }
}
