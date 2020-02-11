package ArraySortieren

import UebungArraySortieren.*
import me.emig.engineEmi.screenElements.canvasElements.*

object InsertionSort : Sortieralgorithmus() {
    override suspend fun sortieren(array: Array<Rechteck>) {
        for (i in array.indices) {
            val einzusortierenderWert = array[i]
            var j = i
            while (j > 0 && array[j - 1].hoehe.toInt() > einzusortierenderWert.hoehe.toInt()) {
                array[j] = array[j - 1]
                j = j - 1
            }
            array[j] = einzusortierenderWert
            ArrayController.positionenAktualisieren()
            ArrayController.playSound(einzusortierenderWert)
        }
    }
}