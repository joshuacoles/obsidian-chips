package org.joshuacoles.obsidianChips.event

import org.joshuacoles.obsidianChips.chip.ChipEvent
import org.joshuacoles.obsidianChips.pin.Pin

/**
 * Created by joshuacoles on 19/03/2015.
 */
interface ChipPinEvent<T extends Pin> extends ChipEvent {
    T getPin()
}