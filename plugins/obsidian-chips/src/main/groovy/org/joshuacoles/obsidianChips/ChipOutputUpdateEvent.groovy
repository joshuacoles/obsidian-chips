package org.joshuacoles.obsidianChips

interface ChipOutputUpdateEvent extends ChipPinEvent<OutputPin> {
    boolean getOldState()
    boolean getNewState()
    int getOldPower()
    int getNewPower()
}
