package com.entertainment;

public class Television {
    private String brand;
    private int volume;

    private final Tuner tuner = new Tuner();

    public Television() {
    }

    public Television(String brand, int volume){
        setBrand(brand);
        setVolume(volume);

    }
    // business ("action") methods
    public  int getCurrentChannel() {
        return tuner.getChannel(); // delegate to contained Tuner object

    }
    public  void changeChannel(int channel) {
        tuner. setChannel(channel); // delegate to contained Tuner object
    }

    // accessor methods
    public  String getBrand() {
        return brand;

    }
    public void setBrand(String brand) {
        this.brand = brand;

    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
    @Override
    public String toString() {
        return String.format("%s {brand=%s, volume=%s, currentChannel=%s]",
                getClass().getSimpleName().getBrand(), getVolume(), getCurrentChannel());

    }


}

