package org.joshuacoles.obsidianChips.chip

import org.joshuacoles.obsidianChips.pin.InputPin

/**
 * Represents the logic behind a specific chip.
 */
abstract class ChipLogic {
    Chip chip

    ChipLogic(Chip chip, List<String> info) {
        this.chip = chip
        this.validate()
    }

    abstract boolean validate()

    abstract void onInputChange(InputPin inputPin, int oldPower, int newPower)

    void tick() {}

    boolean needsTick() { return false }
}
