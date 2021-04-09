package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    Radio radio = new Radio();

    @Test
    public void shouldSetRadioStation() {
        radio.setCurrentRadioStation(6);
        assertEquals(6, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldSetRadioStationOverMax() {
        radio.setCurrentRadioStation(10);
        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldSetRadioStationUnderMin() {
        radio.setCurrentRadioStation(-1);
        assertEquals(9, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldChangeRadioStationUp() {
        radio.setCurrentRadioStation(5);
        radio.setCurrentRadioStationUp();
        assertEquals(6, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldChangeRadioStationOverMax() {
        radio.setCurrentRadioStation(9);
        radio.setCurrentRadioStationUp();
        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldChangeRadioStationDown() {
        radio.setCurrentRadioStation(5);
        radio.setCurrentRadioStationDown();
        assertEquals(4, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldChangeRadioStationUnderMin() {
        radio.setCurrentRadioStation(0);
        radio.setCurrentRadioStationDown();
        assertEquals(9, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldChangeVolumeOverMax() {
        radio.setCurrentVolume(11);
        assertEquals(10, radio.getCurrentVolume());
    }
    @Test
    public void shouldChangeVolume() {
        radio.setCurrentVolume(5);
        assertEquals(5, radio.getCurrentVolume());
    }
    @Test
    public void shouldChangeVolumeUnderMin() {
        radio.setCurrentVolume(-1);
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void setCurrentVolumeUpOverMax() {
        radio.setCurrentVolume(10);
        radio.setCurrentVolumeUp();
        assertEquals(10, radio.getCurrentVolume());
    }
    @Test
    public void setCurrentVolumeUp() {
        radio.setCurrentVolume(5);
        radio.setCurrentVolumeUp();
        assertEquals(6, radio.getCurrentVolume());
    }

    @Test
    public void setCurrentVolumeDown() {
        radio.setCurrentVolume(5);
        radio.setCurrentVolumeDown();
        assertEquals(4, radio.getCurrentVolume());
    }

    @Test
    public void setCurrentVolumeDownUnderMin() {
        radio.setCurrentVolume(0);
        radio.setCurrentVolumeDown();
        assertEquals(0, radio.getCurrentVolume());
    }
}