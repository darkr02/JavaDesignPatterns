package org.buildphone;

public class CustomPhoneBuilder {
    private String os;
    private int ram;
    private String processor;
    private double screenSize;
    private int battery;

    public CustomPhoneBuilder setOs(String os) {
        this.os = os;
        return this;
    }

    public CustomPhoneBuilder setRam(int ram) {
        this.ram = ram;
        return this;
    }

    public CustomPhoneBuilder setProcessor(String processor) {
        this.processor = processor;
        return this;
    }

    public CustomPhoneBuilder setScreenSize(double screenSize) {
        this.screenSize = screenSize;
        return this;
    }

    public CustomPhoneBuilder setBattery(int battery) {
        this.battery = battery;
        return this;
    }

    public CustomPhone getPhone()
    {
        return new CustomPhone(os,ram,processor,screenSize,battery);
    }
}
