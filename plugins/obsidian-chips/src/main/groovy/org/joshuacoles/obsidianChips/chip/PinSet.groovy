package org.joshuacoles.obsidianChips.chip

import org.joshuacoles.obsidianChips.pin.InputPin
import org.joshuacoles.obsidianChips.pin.OutputPin
import org.joshuacoles.obsidianChips.pin.Pin

/**
 * Created by joshuacoles on 16/03/15.
 */
class PinSet {
    private Chip chip

    List<OutputPin> outputs
    List<InputPin> inputs
    List<Pin> pins

    PinSet(Chip chip, List<OutputPin> outputs, List<InputPin> inputs, List<Pin> pins) {
        this.chip = chip
        this.outputs = outputs
        this.inputs = inputs
        this.pins = pins
    }

    void onInputUpdate(InputPin inputPin, int old, int current) {
        chip.logic.onChangeState()
    }


}
