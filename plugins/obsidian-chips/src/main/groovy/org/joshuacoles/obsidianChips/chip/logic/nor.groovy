package org.joshuacoles.obsidianChips.chip.logic

import org.joshuacoles.obsidianChips.chip.Chip
import org.joshuacoles.obsidianChips.chip.ChipLogic
import org.joshuacoles.obsidianChips.InputPin

/**
 * Created by joshuacoles on 19/03/2015.
 * todo implement analog
 */
class nor extends ChipLogic {
    nor(Chip chip, boolean analog, List<String> info) {
        super(chip, analog, info)
    }

    @Override
    boolean validate() {
        return chip.pinSet.inputs.size() >= 2 && !chip.pinSet.outputs.empty
    }

    @Override
    void onInputChange(InputPin inputPin, int oldPower, int newPower) {
        chip.pinSet.outputs*.state =
                !chip.pinSet.inputs*.power.any()
    }
}
