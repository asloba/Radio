package ru.netology;

public class Radio {
    private int maxRadioStation = 10;
    private int minRadioStation = 0;
    private int currentRadioStation;
    private int maxVolume = 100;
    private int minVolume = 0;
    private int currentVolume;

    public Radio(int maxRadioStation) {
        this.maxRadioStation = maxRadioStation;
    }

    public Radio() {
    }

    public int getMaxRadioStation() {
        return maxRadioStation;
    }

    public void setMaxRadioStation(int maxRadioStation) {
        this.maxRadioStation = maxRadioStation;
    }

    public int getMinRadioStation() {
        return minRadioStation;
    }

    public void setMinRadioStation(int minRadioStation) {
        this.minRadioStation = minRadioStation;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation > maxRadioStation) {
            currentRadioStation = minRadioStation;
        }
        if (currentRadioStation < minRadioStation) {
            currentRadioStation = maxRadioStation;
        }
        this.currentRadioStation = currentRadioStation;
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

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume) {
            currentVolume = maxVolume;
        }
        if (currentVolume < minVolume) {
            currentVolume = minVolume;
        }
        this.currentVolume = currentVolume;
    }

    //    public void setCurrentVolume(int currentVolume) {
//        if (currentVolume > maxVolume) {
//            return;
//        }
//        if (currentVolume < minVolume) {
//            return;
//        }
//        this.currentVolume = currentVolume;
//    }
    public void setCurrentVolumeUp() {
        if (currentVolume < maxVolume) {
                currentVolume++;
            }
    }

    public void setCurrentVolumeDown() {
        if (currentVolume > minVolume) {
            currentVolume--;
        }
    }
    public void setCurrentRadioStationUp() {
        if (currentRadioStation < maxRadioStation) {
                currentRadioStation++;
            }
        else {
            currentRadioStation = minRadioStation;
            }
    }
    public void setCurrentRadioStationDown() {
        if (currentRadioStation > minRadioStation) {
                currentRadioStation--;
            }
            else {
                currentRadioStation = maxRadioStation;
            }
    }

}
