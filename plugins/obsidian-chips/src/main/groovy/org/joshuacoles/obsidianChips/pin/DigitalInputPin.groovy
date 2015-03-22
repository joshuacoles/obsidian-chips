package org.joshuacoles.obsidianChips.pin

import org.joshuacoles.obsidianChips.event.ChipOutputUpdateEvent
import org.spongepowered.api.event.block.BlockRedstoneUpdateEvent
import org.spongepowered.api.util.event.Event

/**
 * Created by joshuacoles on 16/03/15.
 */
class DigitalInputPin implements DigitalPin, InputPin {
    private int power = 0

    void onRelevantUpdate(Event event) {
        if (event instanceof BlockRedstoneUpdateEvent) {
            pinSet.onInputUpdate(this, event.oldSignalStrength, event.newSignalStrength)
            this.power = event.newSignalStrength
        }

        if (event instanceof ChipOutputUpdateEvent) {
            pinSet.onInputUpdate(this, event.oldPower, event.newPower)
            this.power = event.newPower
        }
    }

    int getPower() { return power }
    boolean getState() { return power != 0 }
}
