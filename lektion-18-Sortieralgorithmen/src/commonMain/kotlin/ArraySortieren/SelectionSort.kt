package UebungArraySortieren


import me.emig.engineEmi.screenElements.canvasElements.*

object SelectionSort : Sortieralgorithmus() {
    override suspend fun sortieren(array: Array<Rechteck>) {
        for (i in array.indices) {
            var min = i
            for (j in i + 1 until array.size) {
                if (array[j].hoehe.toInt() < array[min].hoehe.toInt()) {
                    min = j
                }
            }
            array.tauscheIndexPositionen(min, i)
            ArrayController.positionenAktualisieren()

        }
    }
}