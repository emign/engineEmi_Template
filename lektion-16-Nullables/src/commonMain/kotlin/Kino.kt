class Kino {
    var sitzplaetze = mutableListOf<Sitzplatz?>()
    val reihen = listOf('A'..'J').flatten()
    val sitze = listOf(1..20).flatten()

    fun stringToSitzPlaetze(s: String) {
        s.split(',').forEach {
            if (it == "leer") {
                sitzplaetze.add(null)
            } else {
                sitzplaetze.add(Sitzplatz(it.elementAt(0), it.subSequence(1, it.length).toString().toByte()))
            }
        }
    }

    fun naechsterSitzplatz(): Sitzplatz? = sitzplaetze.removeAt(0)

    fun anzahlLeereSitzplaetze() = 100

    fun besetzteSitze() = 100

    fun ersterSitzPlatzLeer() = null


}

class Sitzplatz(var reihe: Char = 'A', var nummer: Byte = 1) {
}