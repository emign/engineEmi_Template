package UebungArraySortieren


import me.emig.engineEmi.screenElements.canvasElements.*

/**
 * Thanks to Vamsi Tallapudi for saving me so much time with his code
 * https://www.coderefer.com/quick-sort-kotlin/
 */
object QuickSort : Sortieralgorithmus() {
    override suspend fun sortieren(array: Array<Rechteck>) {
        quickSort(array, 0, array.lastIndex)
    }

    suspend fun quickSort(array: Array<Rechteck>, left: Int, right: Int) {
        val index = partition(array, left, right)
        if (left < index - 1) { // 2) Sorting left half
            quickSort(array, left, index - 1)
        }
        if (index < right) { // 3) Sorting right half
            quickSort(array, index, right)
        }
    }

    suspend fun partition(array: Array<Rechteck>, l: Int, r: Int): Int {
        var left = l
        var right = r
        val pivot = array[(left + right) / 2].hoehe.toInt() // 4) Pivot Point
        while (left <= right) {
            ArrayController.positionenAktualisieren()
            while (array[left].hoehe.toInt() < pivot) left++ // 5) Find the elements on left that should be on right

            while (array[right].hoehe.toInt() > pivot) right-- // 6) Find the elements on right that should be on left

            // 7) Swap elements, and move left and right indices
            if (left <= right) {
                array.tauscheIndexPositionen(left, right)
                ArrayController.playSound(array[left])
                left++
                right--
            }
        }
        return left
    }
}