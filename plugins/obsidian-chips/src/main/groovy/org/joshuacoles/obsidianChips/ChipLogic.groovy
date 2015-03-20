package org.joshuacoles.obsidianChips

/**
 * Created by joshuacoles on 16/03/15.
 */
abstract class ChipLogic {
    Chip chip
    boolean analog

    ChipLogic(Chip chip, boolean analog, List<String> info) {
        this.chip = chip
        this.analog = analog
        this.validate()
    }

    abstract boolean validate()
    abstract void onInputChange(InputPin inputPin, int oldPower, int newPower)
}
