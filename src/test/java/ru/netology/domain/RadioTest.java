package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void setTheNumberOfRadioStations () {
        Radio radio = new Radio(10,100);
        assertEquals(10, 10);
    }

    @Test
    public void test1SwitchingTheRadioStationToTheNext(){ //Переключение радиостанции на следующую и проверка границы
        Radio radio = new Radio();
        radio.setCurrentRadioStation(8);
        radio.switchingTheRadioStationToTheNext();
        radio.switchingTheRadioStationToTheNext();
        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected,actual);
    }
    @Test
    public void testSwitchingTheRadioStationToTheNext(){ //Переключение радиостанции на следующую и проверка границы
        Radio radio = new Radio(10,100);
        radio.setCurrentRadioStation(9);
        radio.switchingTheRadioStationToTheNext();
        radio.switchingTheRadioStationToTheNext();
        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected,actual);
    }

    @Test
    public void test1SwitchingTheRadioStationToThePreviousOne(){ //Переключение радиостанции на предыдущую и проверка границы
        Radio radio = new Radio();
        radio.setCurrentRadioStation(1);
        radio.switchingTheRadioStationToThePreviousOne();
        radio.switchingTheRadioStationToThePreviousOne();
        int expected = 9;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected,actual);
    }

    @Test
    public void testSwitchingTheRadioStationToThePreviousOne(){ //Переключение радиостанции на предыдущую и проверка границы
        Radio radio = new Radio(10,100);
        radio.setCurrentRadioStation(1);
        radio.switchingTheRadioStationToThePreviousOne();
        radio.switchingTheRadioStationToThePreviousOne();
        int expected = 10;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected,actual);
    }

    @Test
    public void radioStationSelection(){ // Выбор радиостанции
        Radio radio = new Radio(10,100);
        radio.setCurrentRadioStation(7);
        radio.setCurrentRadioStation(11);
        int expected = 7;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected,actual);
    }

    @Test
    public void radioStationSelection2() {// Выбор радиостанции
        Radio radio = new Radio(10,100);
        radio.setCurrentRadioStation(0);
        radio.setCurrentRadioStation(-1);
        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void increaseSoundVolume() { // Увеличение громкости
        Radio radio = new Radio(10,100);
        radio.setCurrentSoundVolume(99);
        radio.increaseSoundVolume();
        radio.increaseSoundVolume();
        int expected = 100;
        int actual = radio.getCurrentSoundVolume();
        assertEquals(expected,actual);
    }

    @Test
    public void decreaseSoundVolume(){ // Уменьшение громкости
        Radio radio = new Radio(10,100);
        radio.setCurrentSoundVolume(1)    ;
        radio.decreaseSoundVolume();
        radio.decreaseSoundVolume();
        int expected = 0;
        int actual = radio.getCurrentSoundVolume();
        assertEquals(expected,actual);
    }

    @Test
    public void soundVolumeSelection() { // Выбор громкости звука
        Radio radio = new Radio(10,100);
        radio.setCurrentSoundVolume(98);
        radio.setCurrentSoundVolume(110);
        int expected = 98;
        int actual = radio.getCurrentSoundVolume();
        assertEquals(expected,actual);
    }

    @Test
    public void soundVolumeSelection2() { // Выбор громкости звука
        Radio radio = new Radio(10,100);
        radio.setCurrentSoundVolume(4);
        radio.setCurrentSoundVolume(-12);
        int expected = 4;
        int actual = radio.getCurrentSoundVolume();
        assertEquals(expected,actual);
    }


}