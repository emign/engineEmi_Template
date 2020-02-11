package UebungArraySortieren

import me.emig.engineEmi.screenElements.canvasElements.*


object KotlinSortierer : Sortieralgorithmus() {
    override suspend fun sortieren(array: Array<Rechteck>) {
        array.sortBy { it.hoehe.toInt() }
    }
}
