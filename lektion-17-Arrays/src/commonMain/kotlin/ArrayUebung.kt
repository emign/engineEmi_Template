object ArrayUebung {

    /**
     * Soll einfach ein IntArray mit der gegebenen Länge erstellen und zurück geben
     * @param laenge Int
     * @return IntArray
     */
    fun intArrayErstellen(laenge: Int): IntArray {
        TODO()
    }

    /**
     * Soll die Summe aller Zahlen der einzelnen Indexpositionen berechnen und zurück geben
     * Verwenden Sie hierfür eine Schleife. Kotlin liefert für IntArrays die Funktion .sum() mit,
     * welche Sie zum Testen verwenden können. Ihre Implementierung soll aber selbst erzeugt sein
     * und nicht auf die Funktion sum() zurück greifen.
     * @param array IntArray
     * @return Int
     */
    fun summeUeberArray(array: IntArray): Int {
        TODO()
    }

    /**
     * Gibt ein 10-stelliges Array zurück, welches an den Indexpositionen die Werte 0 bis 9 enthält
     * @return IntArray
     */
    fun arrayVon0bis9(): IntArray {
        TODO()
    }

    /**
     * Gibt ein 10-stelliges Array zurück, welches an den Indexpositionen die Werte 1 bis 10 enthält
     * @return IntArray
     */
    fun arrayVon1bis10(): IntArray {
        TODO()
    }

    /**
     * Vertauscht die Werte an den Index-Positionen i und j miteinander und gibt das Array zurück
     * @param i IndexPositon 1
     * @param j IndexPositon 2
     * @param array IntArray
     * @return IntArray
     */
    fun vertauscheIndizes(i: Int, j: Int, array: IntArray): IntArray {
        TODO()
    }

    /**
     * Invertieret das Array. Aus [1,2,3] wird also [3,2,1]
     * Zum Testen können Sie auf die funktion .reversedArray() zurück greifen. Ihre Implementierung soll
     * aber auf diese (oder ähnliche von Kotlin mitgelieferte Funktionen) verzichten und selbst erstellt sein.
     * @param array IntArray
     * @return IntArray
     */
    fun invertiere(array: IntArray): IntArray {
        TODO()
    }

    /**
     * Mischt das Array (diesmal ein CharArray) so lange, bis das gesuchte Wort zufällig zusammen gesetzt wird.
     * Sie können aus einem CharArray einfach einen String machen, indem Sie den Konstruktor von String mit dem
     * CharArray "füttern": Zum Beispiel String(meinCharArray)
     * @param wort Das gesuchte Wort. Zum Beispiel "eis"
     * @param array Das (vermischte) CharArray. Zum Beispiel [s,e,i]
     * @return Das entsprechende Wort.
     */
    fun charArrayMischenBisWortHerauskommt(wort: String, array: CharArray): String {
        TODO()
    }

    /**
     * Erhält ein Personen Array und soll das Array so anpassen, dass die Wartenummer der Personen
     * den String enthält, der ihrer Array-Position entspricht
     * Das Array [Person, Person, Person] soll also Personen mit den Wartenummern "eins", "zwei", "drei" usw. tragen
     * Es sollen nur Array-Längen unter 10 Indexpositionen verarbeitet werden.
     * @param laenge Int
     * @return Array<Person>
     */
    fun personenArray(pArray: Array<Person>): Array<Person> {
        TODO()
    }
}