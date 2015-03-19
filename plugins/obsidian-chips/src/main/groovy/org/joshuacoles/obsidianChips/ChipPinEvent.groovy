package org.joshuacoles.obsidianChips

/**
 * Created by joshuacoles on 19/03/2015.
 */
interface ChipPinEvent<T extends Pin> extends ChipEvent {
    T getPin()
}