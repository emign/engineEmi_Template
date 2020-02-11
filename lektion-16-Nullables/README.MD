# Kino
In einem Kino sollen die besetzten Sitzplätze verarbeitet werden. Aus Gründen der Einfachheit hat unser Kino nur einen Saal
mit 200 Sitzplätzen. Die Sitzplätze sind mit Bezeichnungen für Reihen (Buchstaben) und Nummern versehen. Es existieren also zum Beispiel
die Sitze A1, B3 oder C7. Es existieren 10 Reihen mit je 20 Sitzen. Falls ein Sitzplatz leer ist, wird dieser als null-Referenz gespeichert
Betrachten Sie vorab die Datei `Kino.kt`, um sich zurecht zu finden.

Die Funktion `naechsterSitzplatz()` gibt für jeden Aufruf sukzessive alle Sitzplätze (oder eben null) zurück. Wenn man also 200 Mal aufruft, bekommt man  nacheinander alle Sitzplätze.

#### 1. Anzahl der leeren Kinositze 

Implementieren Sie die Funktion `anzahlLeereSitzplaetze()` in der Klasse `Kino` so, dass die Tests `testAnzahlLeereKinositze[...]`
korrekt ablaufen. Verwenden Sie hierfür einen Null-Check

#### 2. Sitzliste
Die Funktion `besetzteSitze() : String` soll implementiert werden. 
Diese Funktion gibt einen String zurück, der einfach alle besetzten Sitze hintereinander (ohne Trennung durch Komma o.ä.) beinhaltet.
Nicht besetzte Sitze sollen durch "nullnull" ausgegeben werden
*A1, leer, A3, A4* soll also "A1nullnullA3A4" liefern 
Verwenden Sie hierfür sichere Aufrufe.

Hinweis: Sie können einen String konkatenieren (anfügen), indem Sie dies zum Beispiel wie folgt machen:
```
var s = "Hallo "
s = s + " Du"
println(s) // Gibt Hallo Du aus. 
``` 

#### 3. Erster Sitzplatz frei
Beim Sitzplatz A1 handelt es sich um einen barrierefreien Platz.
Implementieren Sie die Funktion `ersterSitzPlatzLeer()` so, dass sie den Sitzplatz zurück gibt, falls dieser gebucht wurde (also nicht null ist)
Falls der Sitzplatz null ist, soll -1 zurück gegeben werden.
