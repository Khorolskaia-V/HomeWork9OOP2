package ru.netology.javaqa;

public class Radio {

    private int radioStation;
    private int volume;

    public void next() {
        if (radioStation == 9) {
            radioStation = 0;
            return;
        }
        radioStation++;
    }

    public void prev() {
        if (radioStation == 0) {
            radioStation = 9;
            return;
        }
        radioStation--;
    }

    public int getRadioStation() {
        return radioStation;
    }

    public void setRadioStation(int newRadioStation) {
        if (newRadioStation >= 0 && newRadioStation <= 9) {
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

