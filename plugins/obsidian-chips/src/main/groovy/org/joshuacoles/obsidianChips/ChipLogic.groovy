package org.joshuacoles.obsidianChips

/**
 * Created by joshuacoles on 16/03/15.
 */
abstract class ChipLogic {
    Chip chip

    ChipLogic(Chip chip) {
        this.chip = chip
        this.validate()
    }

    abstract boolean validate()
    abstract void onChangeState()
}
