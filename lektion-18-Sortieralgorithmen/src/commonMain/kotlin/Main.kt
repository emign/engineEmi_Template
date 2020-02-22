import UebungArraySortieren.*
import me.emig.engineEmi.*


/**
 * Startpunkt für alle Programme.
 * Hier werden u.a. [Ebody] und [CanvasElement] Objekte bei der [Engine] registriert.
 * Es gibt drei Bereiche:
 * init : Dieser Code-Block wird zur Konfiguration der Engine verwendet. Hier kann man z.B. die Höhe und Breite des Fensters festlegen.
 * Wenn man diesen Block leer lässt, werden Standard-Werte geladen
 * viewWillLoad: Dieser Code-Block wird NACH der Konfiguration aber VOR dem Aufbau des Views (der Anzeige) ausgeführt. Hier sollte man
 * seine Objekte bei der Engine registrieren
 * viewDidLoad: Dieser Code-Block wird NACH dem der View komplett aufgebaut wurde ausgeführt. Hier sollte man Code platzieren, der darauf
 * angewiesen ist, dass Objekte bereits fertig erstellt und registriert wurden. Dies trifft vor allem auf [Ebody] Objekte zu.
 */


suspend fun main() {
    engine.run {

        /**
         * Code um die Engine zu konfigurieren.
         */
        init {
            view.width = 510
            view.height = 250
            ArrayController.arrayErzeugen(100)
            ArrayController.wartezeit = 120
            ArrayController.sortieralgorithmus = QuickSort
            ArrayController.sortieren()
        }

        /**
         * Code der VOR dem Aufbau des Views ausgeführt wird
         */
        viewWillLoad {

        }

        /**
         * Code, der NACH dem Aufbau des Views ausgeführt wird
         */
        viewDidLoad {

        }

        start()
    }
}

