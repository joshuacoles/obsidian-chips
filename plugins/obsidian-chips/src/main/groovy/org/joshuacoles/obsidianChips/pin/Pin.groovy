package org.joshuacoles.obsidianChips.pin

import org.joshuacoles.obsidianChips.chip.PinSet

trait Pin {
    protected PinSet pinSet
    protected long index

    PinSet getPinSet() { pinSet }

    long getIndex() { index }
}
