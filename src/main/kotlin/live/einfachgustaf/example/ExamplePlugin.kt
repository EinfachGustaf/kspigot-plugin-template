package live.einfachgustaf.example

import net.axay.kspigot.main.KSpigot

class ExamplePlugin: KSpigot() {

    companion object {
        lateinit var INSTANCE: ExamplePlugin; private set
    }

    override fun load() {
        // the 'onLoad' function

        INSTANCE = this
    }

    override fun startup() {
        // the 'onEnable' function
    }

    override fun shutdown() {
        // the 'onDisable' function
    }
}