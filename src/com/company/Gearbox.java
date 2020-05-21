package com.company;

public class Gearbox {
    private boolean clutchIsIn;

    // an INTERFACE is a commitment
    // that a method's signature and variables will not change
    public void operateClutch(boolean inOrOut) {
        this.clutchIsIn = inOrOut;
    }
}
