package ru.netology.javaqa;

public class Radio {
    private int radioStation; // номер радиостанции
    private int soundVolume; // уровень громкости звука
    private int maxRadioStation; // максимальное кол-во радиостанций
    private int maxSoundVolume = 100; // максимальное значение звука

    public Radio(int maxRadioStation) {
        this.maxRadioStation = maxRadioStation;
    }

    public Radio() {
        this.maxRadioStation = 10;
    }

    public int getRadioStation() {
        return radioStation;
    }

    public int getSoundVolume() {
        return soundVolume;
    }

    public int getMaxRadioStation() {
        return maxRadioStation;
    }

    public void setSoundVolume(int newSoundVolume) {
        if (newSoundVolume < 0) {
            return;
        }
        if (newSoundVolume > maxSoundVolume) {
            soundVolume = maxSoundVolume;
            return;
        }
        soundVolume = newSoundVolume;
    }

    public void setRadioStation(int newRadioStation) {
        if (newRadioStation < 0) {
            return;
        }
        if (newRadioStation >= maxRadioStation) {
            radioStation = maxRadioStation - 1;
            return;
        }
        radioStation = newRadioStation;
    }

    public void increaseVolume() {
        if (soundVolume >= maxSoundVolume) {
            return;
        }
        soundVolume++;
    }

    public void decreaseVolume() {
        if (soundVolume <= 0) {
            return;
        }
        soundVolume--;
    }

    public void increaseRadioStation() {
        if (radioStation == (maxRadioStation - 1)) {
            radioStation = 0;
            return;
        }
        radioStation++;
    }

    public void decreaseRadioStation() {
        if (radioStation == 0) {
            radioStation = maxRadioStation - 1;
            return;
        }
        radioStation--;
    }

}