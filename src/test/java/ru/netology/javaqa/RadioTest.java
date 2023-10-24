package ru.netology.javaqa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RadioTest {

    @Test
    public void shouldNext() {
        Radio radio = new Radio();
        radio.next();
        Assertions.assertEquals(1, radio.getRadioStation());
    }

    @Test
    public void shouldNextIsFirst() {
        Radio radio = new Radio();
        radio.setRadioStation(9);
        radio.next();
        Assertions.assertEquals(0, radio.getRadioStation());
    }

    @Test
    public void shouldPrev() {
        Radio radio = new Radio();
        radio.setRadioStation(5);
        radio.prev();
        Assertions.assertEquals(4, radio.getRadioStation());
    }

    @Test
    public void shouldNextIsLast() {
        Radio radio = new Radio();
        radio.prev();
        Assertions.assertEquals(9, radio.getRadioStation());
    }


    @Test
    public void shouldBeMoreOrEqualLeftBound() {
        Radio radio = new Radio();
        radio.setRadioStation(3);
        radio.setRadioStation(-10);
        Assertions.assertEquals(3, radio.getRadioStation());
    }

    @Test
    public void shouldBeLessOrEqualRightBound() {
        Radio radio = new Radio();
        radio.setRadioStation(3);
        radio.setRadioStation(500);
        Assertions.assertEquals(3, radio.getRadioStation());
    }

    @Test
    public void shouldBeMore() {
        Radio radio = new Radio(15);

        radio.setRadioStation(5);
        radio.setRadioStation(15);
        int actual = radio.getRadioStation();
        Assertions.assertEquals(5, actual);
    }
    @Test
    public void shouldBe11More() {
        Radio radio = new Radio(-15);

        radio.setRadioStation(-5);
        radio.setRadioStation(-12);
        int actual = radio.getRadioStation();
        Assertions.assertEquals(0, actual);
    }


    @Test
    public void shouldBeVolumeMinus() {
        Radio radio = new Radio();
        radio.decreaseVolume();
        Assertions.assertEquals(0, radio.getVolume());
    }

    @Test
    public void shouldBeVolumeMinus1() {
        Radio radio = new Radio();
        for (int i = 0; i <= 100; i++) {
            radio.increaseVolume();
        }
        radio.decreaseVolume();
        Assertions.assertEquals(99, radio.getVolume());
    }


    @Test
    public void shouldBeVolumePlus() {
        Radio radio = new Radio();
        radio.increaseVolume();
        Assertions.assertEquals(1, radio.getVolume());
    }
}