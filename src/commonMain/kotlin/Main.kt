import com.soywiz.korge.*
import com.soywiz.korge.font.*
import com.soywiz.korge.html.*
import com.soywiz.korge.ui.*
import com.soywiz.korim.color.*
import com.soywiz.korim.font.*
import com.soywiz.korio.file.std.*
import me.emig.libEmi.graphics.bilder.*


suspend fun main() = Korge(width = 600, height = 600, bgcolor = Colors.WHITE) {
	val hut = Bild(120,120,"hut.png")
	addChild(hut)
}

