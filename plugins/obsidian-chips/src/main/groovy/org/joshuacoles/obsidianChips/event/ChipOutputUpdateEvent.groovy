package org.joshuacoles.obsidianChips.event

import org.joshuacoles.obsidianChips.pin.OutputPin

interface ChipOutputUpdateEvent extends ChipPinEvent<OutputPin> {
    boolean getOldState()
    boolean getNewState()
    int getOldPower()
    int getNewPower()
}
