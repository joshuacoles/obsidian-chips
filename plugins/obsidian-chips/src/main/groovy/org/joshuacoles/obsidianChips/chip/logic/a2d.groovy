package org.joshuacoles.obsidianChips.chip.logic

import org.joshuacoles.obsidianChips.chip.Chip
import org.joshuacoles.obsidianChips.chip.ChipLogic
import org.joshuacoles.obsidianChips.pin.InputPin

/**
 * Created by joshuacoles on 19/03/2015.
 * todo implement analog
 */
class a2d extends ChipLogic {
    a2d(Chip chip, boolean analog, List<String> info) {
        super(chip, analog, info)
    }

    @Override
    boolean validate() {
        return chip.pinSet.inputs.size() == chip.pinSet.outputs.size()
    }

    @SuppressWarnings("GroovyAssignabilityCheck")
    @Override
    void onInputChange(InputPin inputPin, int oldPower, int newPower) {
        chip.pinSet.inputs*.power.eachWithIndex{ int v, int i ->
            chip.pinSet.outputs[i].state = (v == 15)
        }
    }
}
