package ru.netology.javaqa;

public class Radio {
    private int radioStation; // номер радиостанции
    private int soundVolume; // уровень громкости звука
    private int quantityRadioStation; // количество радиостанций
    private int maxRadioStation; // максимальное значение радиостанции
    private int maxSoundVolume = 100; // максимальное значение звука

    public Radio(int quantityRadioStation) {

        this.quantityRadioStation = quantityRadioStation;
        this.maxRadioStation = quantityRadioStation - 1;
    }

    public Radio() {

        this.quantityRadioStation = 10;
        this.maxRadioStation = 9;
    }

    public int getRadioStation() {

        return radioStation;
    }

    public int getSoundVolume() {
        return soundVolume;
    }

    public int getQuantityRadioStation() {
        return quantityRadioStation;
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
        if (newRadioStation >= quantityRadioStation) {
            radioStation = maxRadioStation;
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
        if (radioStation == (maxRadioStation)) {
            radioStation = 0;
            return;
        }
        radioStation++;
    }

    public void decreaseRadioStation() {
        if (radioStation == 0) {
            radioStation = maxRadioStation;
            return;
        }
        radioStation--;
    }

}