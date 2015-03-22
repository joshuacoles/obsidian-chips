package org.joshuacoles.groovySponge

import org.spongepowered.api.Game
import org.spongepowered.api.GameRegistry
import org.spongepowered.api.event.state.ServerStartedEvent
import org.spongepowered.api.plugin.Plugin
import org.spongepowered.api.util.event.Subscribe

/**
 * Created by joshuacoles on 18/03/15.
 */
@Plugin(name = "Groovy Sponge", id = "groovy-sponge")
class GroovySponge {
    static GroovySponge INSTANCE
    static GameRegistry REGISTRY

    @Subscribe
    void onServerStart(ServerStartedEvent event) {
        INSTANCE = this
        REGISTRY = event.registry
    }
}
