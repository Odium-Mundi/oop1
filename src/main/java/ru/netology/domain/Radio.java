package ru.netology.domain;

public class Radio {
    private int minStation = 0;
    private int maxStation = 9;
    private int CurrentStation;
    private int currentVolume;
    private int maxVolume = 100;
    private int minVolume = 0;

    public int getNumberCurrentStation() {
        return CurrentStation;
    }

    public void setCurrentStation(int CurrentStation) {
        if((CurrentStation <= maxStation) && (CurrentStation >= minStation))
        {
            this.CurrentStation = CurrentStation;
        }
        return;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public int getMinVolume() {
        return minVolume;
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
        if (CurrentStation == maxStation) {
            CurrentStation = minStation;
        } else {
            CurrentStation++;
        }
    }

    public void prevStation() {
        if (CurrentStation == minStation) {
            CurrentStation = maxStation;
        } else {
            CurrentStation--;
        }
    }






}
