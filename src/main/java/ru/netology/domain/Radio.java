package ru.netology.domain;

public class Radio {
    private int soundVolume;
    private int minStation = 0;
    private int maxStation = 9;
    private int numberCurrentStation;
    private int currentVolume;
    private int maxVolume = 10;
    private int minVolume = 0;

    public int getSoundVolume() {
        return soundVolume;
    }

    public void setSoundVolume(int soundVolume) {
        this.soundVolume = soundVolume;
    }

    public int getNumberCurrentStation() {
        return numberCurrentStation;
    }

    public void setNumberCurrentStation(int numberCurrentStation) {
        this.numberCurrentStation = numberCurrentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public void setMaxVolume(int maxVolume) {
        this.maxVolume = maxVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public void setMinVolume(int minVolume) {
        this.minVolume = minVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume) {
            return;
        }
        if (currentVolume < minVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void increaseCurrentVolume() {
        if ((currentVolume + 1) > maxVolume) {
            return;
        } else {
            currentVolume++;
        }
    }

    public void decreaseCurrentVolume() {
        if ((currentVolume - 1) < minVolume) {
            return;
        } else {
            currentVolume--;
        }
    }

    public void nextStation() {
        if (numberCurrentStation == maxStation) {
            numberCurrentStation = minStation;
        } else {
            numberCurrentStation++;
        }
    }

    public void prevStation() {
        if (numberCurrentStation == minStation) {
            numberCurrentStation = maxStation;
        } else {
            numberCurrentStation--;
        }
    }

   public void settingStation(int numberCurrentStation) {
        if((numberCurrentStation <= maxStation) && (numberCurrentStation >= minStation))
        {
            this.numberCurrentStation = numberCurrentStation;
         }
        else
        {
            System.out.println("Такой станции не существует");
        }
    }





}
