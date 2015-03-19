package org.joshuacoles.obsidianChips.logic

import org.joshuacoles.obsidianChips.Chip
import org.joshuacoles.obsidianChips.ChipLogic
import org.joshuacoles.obsidianChips.InputPin

/**
 * Created by joshuacoles on 19/03/2015.
 */
class Or extends ChipLogic {
    Or(Chip chip) {
        super(chip)
    }

    @Override
    boolean validate() {
        return chip.pinSet.inputs.size() >= 2 && !chip.pinSet.outputs.empty
    }

    @Override
    void onInputChange(InputPin inputPin, int oldPower, int newPower) {

    }
}
