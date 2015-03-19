package org.joshuacoles.obsidianChips

import com.sun.corba.se.spi.orbutil.fsm.Input

/**
 * Created by joshuacoles on 16/03/15.
 */
class PinSet {
    Chip chip

    List<OutputPin> outputs
    List<InputPin> inputs

    PinSet(Chip chip, List<OutputPin> outputs, List<InputPin> inputs) {
        this.chip = chip
        this.outputs = outputs
        this.inputs = inputs
    }

    void onInputUpdate(InputPin inputPin) {

    }
}
