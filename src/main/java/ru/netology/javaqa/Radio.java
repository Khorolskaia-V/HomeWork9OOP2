package ru.netology.javaqa;

public class Radio {

    private int radioStation;
    private int volume;
    private int stationCount;

    public Radio(int stationCount) {
        this.stationCount = stationCount;
    }
    public Radio() {
        this.stationCount = 10;
    }

    public void next() {
        if (radioStation == stationCount - 1) {
            radioStation = 0;
            return;
        }
        radioStation++;
    }

    public void prev() {
        if (radioStation == 0) {
            radioStation = stationCount - 1;
            return;
        }
        radioStation--;
    }

    public int getRadioStation() {
        return radioStation;
    }

    public void setRadioStation(int newRadioStation) {
        if (newRadioStation >= 0 && newRadioStation <= stationCount - 1) {
            radioStation = newRadioStation;
        }
    }

    public void decreaseVolume() {
        if (volume > 0) {
            volume--;
        }
    }

    public void increaseVolume() {
        if (volume < 100) {
            volume++;
        }
    }


    public int getVolume() {
        return volume;
    }
}

