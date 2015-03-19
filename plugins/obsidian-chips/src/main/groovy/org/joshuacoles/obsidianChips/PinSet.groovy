package org.joshuacoles.obsidianChips

/**
 * Created by joshuacoles on 16/03/15.
 */
class PinSet {
    private Chip chip

    List<OutputPin> outputs
    List<InputPin> inputs

    PinSet(Chip chip, List<OutputPin> outputs, List<InputPin> inputs) {
        this.chip = chip
        this.outputs = outputs
        this.inputs = inputs
    }

    void onInputUpdate(InputPin inputPin, int old, int current) {
        chip.logic.onChangeState()
    }
}
