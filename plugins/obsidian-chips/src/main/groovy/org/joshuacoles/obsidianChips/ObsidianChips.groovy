package org.joshuacoles.obsidianChips

import org.spongepowered.api.block.BlockType
import org.spongepowered.api.block.BlockTypes

import static org.spongepowered.api.block.BlockTypes.*
import org.spongepowered.api.plugin.Plugin

@Plugin(name = "Obsidian Chips", id = "obsidian-chips", dependencies = "required-after:groovy-sponge")
class ObsidianChips {
    static inputBlocks = [STONE_BUTTON,
                          WOODEN_BUTTON,
                          STONE_PRESSURE_PLATE,
                          HEAVY_WEIGHTED_PRESSURE_PLATE,
                          LIGHT_WEIGHTED_PRESSURE_PLATE,
                          WOODEN_PRESSURE_PLATE,
                          LEVER]
}
