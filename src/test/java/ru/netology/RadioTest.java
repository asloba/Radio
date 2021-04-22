package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void shouldSetRadioStationDefault() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(6);
        assertEquals(6, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldSetRadioStationConstructor() {
        Radio radio = new Radio(35);
        radio.setCurrentRadioStation(25);
        assertEquals(25, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldSetRadioStationOverMaxDefault() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(11);
        assertEquals(0, radio.getCurrentRadioStation());
    }
    @Test
    public void shouldSetRadioStationOverMaxConstructor() {
        Radio radio = new Radio(35);
        radio.setCurrentRadioStation(36);
        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldSetRadioStationUnderMinDefault() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(-1);
        assertEquals(10, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldSetRadioStationUnderMinConstructor() {
        Radio radio = new Radio(35);
        radio.setCurrentRadioStation(-1);
        assertEquals(35, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldChangeRadioStationUpDefault() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(5);
        radio.setCurrentRadioStationUp();
        assertEquals(6, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldChangeRadioStationUpConstructor() {
        Radio radio = new Radio(35);
        radio.setCurrentRadioStation(21);
        radio.setCurrentRadioStationUp();
        assertEquals(22, radio.getCurrentRadioStation());
    }
    @Test
    public void shouldChangeRadioStationOverMaxDefault() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(10);
        radio.setCurrentRadioStationUp();
        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldChangeRadioStationOverMaxConstructor() {
        Radio radio = new Radio(35);
        radio.setCurrentRadioStation(35);
        radio.setCurrentRadioStationUp();
        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldChangeRadioStationDownDefault() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(5);
        radio.setCurrentRadioStationDown();
        assertEquals(4, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldChangeRadioStationDownConstructor() {
        Radio radio = new Radio(35);
        radio.setCurrentRadioStation(28);
        radio.setCurrentRadioStationDown();
        assertEquals(27, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldChangeRadioStationUnderMinDefault() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(0);
        radio.setCurrentRadioStationDown();
        assertEquals(10, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldChangeRadioStationUnderMinConstructor() {
        Radio radio = new Radio(35);
        radio.setCurrentRadioStation(0);
        radio.setCurrentRadioStationDown();
        assertEquals(35, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldChangeVolumeOverMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(101);
        assertEquals(100, radio.getCurrentVolume());
    }
    @Test
    public void shouldChangeVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(5);
        assertEquals(5, radio.getCurrentVolume());
    }
    @Test
    public void shouldChangeVolumeUnderMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void setCurrentVolumeUpOverMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.setCurrentVolumeUp();
        assertEquals(100, radio.getCurrentVolume());
    }
    @Test
    public void setCurrentVolumeUp() {
        Radio radio = new Radio();
        radio.setCurrentVolume(15);
        radio.setCurrentVolumeUp();
        assertEquals(16, radio.getCurrentVolume());
    }

    @Test
    public void setCurrentVolumeDown() {
        Radio radio = new Radio();
        radio.setCurrentVolume(5);
        radio.setCurrentVolumeDown();
        assertEquals(4, radio.getCurrentVolume());
    }

    @Test
    public void setCurrentVolumeDownUnderMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.setCurrentVolumeDown();
        assertEquals(0, radio.getCurrentVolume());
    }
}