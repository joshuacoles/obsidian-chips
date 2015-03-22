package org.joshuacoles.obsidianChips.pin

/**
 * Created by joshuacoles on 21/03/15.
 */
class NullPin implements InputPin, OutputPin, DigitalPin, AnalogPin {
    @Override
    void setPower(int power) {}

    @Override
    int getPower() { return 0 }

    @Override
    boolean isState() { return state = 1 }

}
