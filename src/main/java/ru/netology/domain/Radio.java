package ru.netology.domain;

public class Radio {
    private int minStation = 0;
    private int maxStation = 10;
    private int currentStation;
    private int currentVolume;
    private int maxVolume = 100;
    private int minVolume = 0;
    private int countStation = 10;

    public Radio() {
        this.minStation = minStation;
        this.maxStation = maxStation;
        this.currentStation = currentStation;
        this.currentVolume = currentVolume;
        this.maxVolume = maxVolume;
        this.minVolume = minVolume;
        this.countStation = countStation;
    }

    public Radio(int countStation) {
        this.countStation = countStation;
        this.maxStation = countStation;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if ((currentStation <= maxStation) && (currentStation >= minStation)) {
            this.currentStation = currentStation;
        }
        return;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume || currentVolume < minVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void increaseCurrentVolume() {
        if (currentVolume == maxVolume) {
            return;
        } else {
            currentVolume++;
        }
    }

    public void decreaseCurrentVolume() {
        if (currentVolume == minVolume) {
            return;
        } else {
            currentVolume--;
        }
    }

    public void nextStation() {
        if (currentStation == maxStation) {
            currentStation = minStation;
        } else {
            currentStation++;
        }
    }

    public void prevStation() {
        if (currentStation == minStation) {
            currentStation = maxStation;
        } else {
            currentStation--;
        }
    }
}
