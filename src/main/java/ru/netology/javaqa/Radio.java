package ru.netology.javaqa;

public class Radio {
    private int radioStation; // номер радиостанции
    private int soundVolume; // уровень громкости звука

    public int getRadioStation() {
        return radioStation;
    }

    public int getSoundVolume() {
        return soundVolume;
    }

    public void setSoundVolume(int newSoundVolume) {
        if (newSoundVolume < 0) {
            return;
        }
        if (newSoundVolume > 100) {
            soundVolume = 100;
            return;
        }
        soundVolume = newSoundVolume;
    }

    public void setRadioStation(int newRadioStation) {
        if (newRadioStation < 0) {
            return;
        }
        if (newRadioStation > 9) {
            radioStation = 9;
            return;
        }
        radioStation = newRadioStation;
    }

    public void increaseVolume() {
        if (soundVolume >= 100) {
            return;
        }
        soundVolume = soundVolume + 1;
    }

    public void decreaseVolume() {
        if (soundVolume <= 0) {
            return;
        }
        soundVolume = soundVolume - 1;
    }

    public void increaseRadioStation() {
        if (radioStation == 9) {
            radioStation = 0;
            return;
        }
        radioStation = radioStation + 1;
    }

    public void decreaseRadioStation() {
        if (radioStation == 0) {
            radioStation = 9;
            return;
        }
        radioStation = radioStation - 1;
    }

}