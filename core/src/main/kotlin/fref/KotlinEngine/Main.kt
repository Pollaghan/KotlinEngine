package fref.KotlinEngine

import com.badlogic.gdx.ApplicationAdapter
import ktx.app.KtxGame
import ktx.app.KtxScreen

/** [com.badlogic.gdx.ApplicationListener] implementation shared by all platforms. */
class Main : KtxGame<KtxScreen>() {
    override fun create() {
        addScreen(VeiportScreen())
        setScreen<VeiwportScreen>()
    }
}
