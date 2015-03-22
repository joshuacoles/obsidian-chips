package org.joshuacoles.obsidianChips.pin

/**
 * Created by joshuacoles on 21/03/15.
 */
trait AnalogPin extends DigitalPin {
    int power = 0

    boolean getState() { return power != 0 }

    void setState(boolean state) { power = (state ? 15 : 0) }

}