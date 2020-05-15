import me.emig.engineEmi.*
import me.emig.engineEmi.graphics.bilder.*


val engineConfig = EngineConfig(width = 600, height = 600)

suspend fun main() = Engine(engineConfig) {
	val hut = Bild(120,120,"hut.png")
	addChild(hut)
}

