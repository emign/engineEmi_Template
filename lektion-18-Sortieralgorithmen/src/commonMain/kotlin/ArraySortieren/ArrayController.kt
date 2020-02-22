package UebungArraySortieren

import com.soywiz.klock.*
import com.soywiz.korau.sound.*
import com.soywiz.korim.color.*

import kotlinx.coroutines.*
import me.emig.engineEmi.*
import me.emig.engineEmi.screenElements.canvasElements.*


object ArrayController {

    lateinit var array: Array<Rechteck>
    var sortieralgorithmus: Sortieralgorithmus = KotlinSortierer
    var wartezeit = 50L
    private val breite = 5
    private val startX = 10
    private val startY = 200
    private val abstand = 0
    private val randomSubColor: Int
        get() = (0..255).random()

    fun arrayErzeugen(laenge: Int, untereZufallsGrenze: Int = 10, obereZufallsGrenze: Int = 100) {
        array = Array<Rechteck>(laenge) { i ->
            Rechteck(
                    x = startX + (i * (breite + abstand)),
                    y = startY,
                    fuellFarbe = RGBA(randomSubColor, randomSubColor, randomSubColor),
                    breite = breite,
                    hoehe = (untereZufallsGrenze..obereZufallsGrenze).random()
            ).apply { this.rotationDegrees = 180.0 }
        }
        engine.register(array)
    }

    fun sortieren() {
        CoroutineScope(Dispatchers.Default).launch {
            sortieralgorithmus.sortieren(array)
            positionenAktualisieren()
        }
    }

    suspend fun positionenAktualisieren() {
        array.forEachIndexed { index, rechteck ->
            rechteck.x = startX + (index * (breite + abstand)).toDouble()
        }
        delay(wartezeit)
    }

    suspend fun playSound(rechteck: Rechteck) {
        AudioTone.generate(wartezeit.milliseconds, rechteck.hoehe.toDouble() * 80).toNativeSound().playAndWait()
        // Tone(rechteck.hoehe*80, wartezeit)
    }
}

fun <T> Array<T>.tauscheIndexPositionen(l: Int, r: Int) {
    val tmp = this[l]
    this[l] = this[r]
    this[r] = tmp
}



