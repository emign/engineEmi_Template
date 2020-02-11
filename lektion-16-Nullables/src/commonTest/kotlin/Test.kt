import com.soywiz.korge.tests.*
import kotlin.test.*

class KinoTest : KorgeTest() {

    var kino1 = "leer,A2,A3,A4,leer,leer,A7,A8,A9,A10,A11,A12,A13,A14,leer,A16,A17,leer,leer,A20,B1,B2,leer,B4,B5,B6,leer,B8,leer,leer,B11,leer,B13,leer,B15,B16,B17,B18,B19,B20,C1,leer,C3,leer,C5,leer,C7,leer,C9,C10,C11,C12,C13,C14,C15,C16,leer,C18,leer,C20,leer,D2,leer,leer,D5,D6,leer,D8,leer,D10,leer,D12,D13,D14,D15,D16,leer,leer,D19,D20,E1,E2,E3,leer,E5,E6,E7,E8,E9,leer,leer,E12,E13,E14,E15,E16,E17,E18,E19,E20,leer,F2,F3,leer,F5,F6,F7,F8,F9,F10,F11,F12,leer,F14,F15,F16,F17,F18,leer,F20,leer,G2,G3,G4,G5,leer,G7,leer,G9,G10,G11,leer,G13,G14,G15,leer,leer,G18,leer,G20,H1,leer,H3,H4,H5,leer,H7,leer,H9,leer,H11,leer,H13,H14,H15,leer,H17,H18,H19,H20,leer,leer,I3,leer,I5,I6,I7,I8,I9,I10,leer,I12,I13,I14,I15,leer,I17,I18,I19,I20,J1,leer,J3,J4,J5,leer,leer,leer,J9,leer,leer,J12,J13,leer,J15,J16,J17,J18,leer,J20"
    var kino2 = "A1,A2,A3,A4,A5,A6,leer,A8,A9,A10,A11,A12,A13,A14,leer,A16,A17,A18,A19,leer,B1,B2,leer,leer,leer,B6,B7,B8,leer,B10,B11,B12,B13,B14,B15,B16,B17,B18,B19,B20,C1,leer,C3,C4,C5,C6,C7,C8,C9,C10,C11,C12,C13,C14,C15,C16,leer,leer,C19,C20,leer,D2,D3,leer,D5,leer,D7,leer,D9,leer,leer,D12,D13,D14,D15,leer,leer,D18,D19,D20,leer,E2,E3,leer,E5,E6,E7,E8,E9,E10,E11,E12,E13,E14,leer,leer,E17,E18,E19,E20,F1,F2,leer,F4,F5,leer,F7,leer,F9,F10,F11,F12,F13,F14,F15,F16,F17,F18,F19,F20,G1,leer,G3,G4,G5,leer,G7,G8,G9,leer,leer,leer,G13,leer,G15,G16,leer,leer,leer,leer,H1,H2,H3,leer,H5,H6,H7,H8,leer,H10,H11,leer,leer,H14,leer,leer,H17,leer,H19,H20,I1,I2,I3,I4,leer,I6,I7,I8,I9,I10,leer,I12,I13,leer,I15,I16,I17,I18,I19,I20,leer,leer,J3,J4,J5,J6,J7,leer,leer,leer,J11,J12,J13,J14,J15,J16,J17,J18,J19,J20"
    var kino3 = "A1,A2,A3,A4,A5,A6,A7,A8,A9,A10,A11,A12,A13,A14,A15,A16,A17,A18,A19,A20,B1,B2,B3,B4,B5,B6,B7,B8,B9,B10,B11,B12,B13,B14,B15,B16,B17,B18,B19,B20,C1,C2,C3,C4,C5,C6,C7,C8,C9,C10,C11,C12,C13,C14,C15,C16,C17,C18,C19,C20,D1,D2,D3,D4,D5,D6,D7,D8,D9,D10,D11,D12,D13,D14,D15,D16,D17,D18,D19,D20,E1,E2,E3,E4,E5,E6,E7,E8,E9,E10,E11,E12,E13,E14,E15,E16,E17,E18,E19,E20,F1,F2,F3,F4,F5,F6,F7,F8,F9,F10,F11,F12,F13,F14,F15,F16,F17,F18,F19,F20,G1,G2,G3,G4,G5,G6,G7,G8,G9,G10,G11,G12,G13,G14,G15,G16,G17,G18,G19,G20,H1,H2,H3,H4,H5,H6,H7,H8,H9,H10,H11,H12,H13,H14,H15,H16,H17,H18,H19,H20,I1,I2,I3,I4,I5,I6,I7,I8,I9,I10,I11,I12,I13,I14,I15,I16,I17,I18,I19,I20,J1,J2,J3,J4,J5,J6,J7,J8,J9,J10,J11,J12,J13,J14,J15,J16,J17,J18,J19,J20"
    var kino4 = "leer,leer,leer,leer,leer,leer,leer,leer,leer,leer,leer,leer,leer,leer,leer,leer,leer,leer,leer,leer,leer,leer,leer,leer,leer,leer,leer,leer,leer,leer,leer,leer,leer,leer,leer,leer,leer,leer,leer,leer,leer,leer,leer,leer,leer,leer,leer,leer,leer,leer,leer,leer,leer,leer,leer,leer,leer,leer,leer,leer,leer,leer,leer,leer,leer,leer,leer,leer,leer,leer,leer,leer,leer,leer,leer,leer,leer,leer,leer,leer,leer,leer,leer,leer,leer,leer,leer,leer,leer,leer,leer,leer,leer,leer,leer,leer,leer,leer,leer,leer,leer,leer,leer,leer,leer,leer,leer,leer,leer,leer,leer,leer,leer,leer,leer,leer,leer,leer,leer,leer,leer,leer,leer,leer,leer,leer,leer,leer,leer,leer,leer,leer,leer,leer,leer,leer,leer,leer,leer,leer,leer,leer,leer,leer,leer,leer,leer,leer,leer,leer,leer,leer,leer,leer,leer,leer,leer,leer,leer,leer,leer,leer,leer,leer,leer,leer,leer,leer,leer,leer,leer,leer,leer,leer,leer,leer,leer,leer,leer,leer,leer,leer,leer,leer,leer,leer,leer,leer,leer,leer,leer,leer,leer,leer,leer,leer,leer,leer,leer,leer"
    var kino5 = "A1,leer,A3,A4,A5,A6,leer,A8,A9,A10,A11,A12,A13,A14,A15,A16,A17,A18,leer,A20,B1,B2,B3,leer,B5,B6,B7,B8,B9,B10,B11,B12,B13,B14,B15,B16,B17,leer,B19,B20,C1,C2,C3,C4,C5,leer,C7,C8,C9,leer,C11,C12,leer,C14,C15,C16,C17,leer,C19,leer,D1,D2,leer,D4,D5,D6,D7,D8,D9,D10,D11,D12,D13,leer,D15,D16,D17,D18,D19,D20,E1,E2,E3,E4,E5,E6,leer,leer,E9,E10,E11,E12,leer,E14,E15,leer,E17,E18,E19,E20,F1,F2,leer,F4,F5,F6,leer,F8,F9,F10,F11,F12,F13,F14,F15,F16,F17,F18,F19,F20,G1,G2,G3,leer,G5,leer,G7,G8,G9,G10,G11,G12,G13,G14,leer,G16,G17,G18,leer,G20,H1,H2,H3,leer,leer,H6,H7,leer,H9,H10,H11,H12,leer,H14,H15,H16,H17,H18,H19,leer,I1,I2,I3,I4,I5,I6,I7,I8,leer,I10,I11,I12,I13,I14,I15,I16,I17,I18,I19,I20,J1,leer,J3,leer,leer,J6,J7,J8,J9,J10,J11,J12,J13,leer,J15,J16,leer,J18,J19,J20"

    @Test
    // Wieviele leere Kinositze sind vorhanden
    fun testAnzahlLeereKinositze1() {
        val kino = Kino()
        kino.stringToSitzPlaetze(kino1)
        assertEquals(59, kino.anzahlLeereSitzplaetze())
    }

    @Test
    // Wieviele leere Kinositze sind vorhanden
    fun testAnzahlLeereKinositze2() {
        val kino = Kino()
        kino.stringToSitzPlaetze(kino2)
        assertEquals(50, kino.anzahlLeereSitzplaetze())
    }

    @Test
    // Wieviele leere Kinositze sind vorhanden
    fun testAnzahlLeereKinositzeAlleVoll() {
        val kino = Kino()
        kino.stringToSitzPlaetze(kino3)
        assertEquals(0, kino.anzahlLeereSitzplaetze())
    }

    @Test
    // Wieviele leere Kinositze sind vorhanden
    fun testAnzahlLeereKinositzeAlleLeer() {
        val kino = Kino()
        kino.stringToSitzPlaetze(kino4)
        assertEquals(200, kino.anzahlLeereSitzplaetze())
    }

    @Test
    // Wieviele leere Kinositze sind vorhanden
    fun testAnzahlLeereKinositze5() {
        val kino = Kino()
        kino.stringToSitzPlaetze(kino5)
        assertEquals(33, kino.anzahlLeereSitzplaetze())
    }

    @Test
    fun testBesetzteSitze1() {
        val kino = Kino()
        kino.stringToSitzPlaetze(kino1)
        assertEquals(kino1.replace("leer", "nullnull").replace(",", "").toInt(), kino.besetzteSitze())
    }

    @Test
    fun testBesetzteSitze2() {
        val kino = Kino()
        kino.stringToSitzPlaetze(kino2)
        assertEquals(kino2.replace("leer", "nullnull").replace(",", "").toInt(), kino.besetzteSitze())
    }

    @Test
    fun testBesetzteSitzeAlleBesetzt() {
        val kino = Kino()
        kino.stringToSitzPlaetze(kino3)
        assertEquals(kino3.replace("leer", "nullnull").replace(",", "").toInt(), kino.besetzteSitze())
    }

    @Test
    fun testBesetzteSitzeAlleLeer() {
        val kino = Kino()
        kino.stringToSitzPlaetze(kino4)
        assertEquals(kino4.replace("leer", "nullnull").replace(",", "").toInt(), kino.besetzteSitze())
    }

    @Test
    fun testBesetzteSitze5() {
        val kino = Kino()
        kino.stringToSitzPlaetze(kino5)
        assertEquals(kino5.replace("leer", "nullnull").replace(",", "").toInt(), kino.besetzteSitze())
    }

    @Test
    fun ersterSitzplatzFrei1() {
        val kino = Kino()
        kino.stringToSitzPlaetze(kino1)
        val ersterSitzPlatz = kino.ersterSitzPlatzLeer()
        var s = ""
        if (ersterSitzPlatz is Sitzplatz) {
            s += ersterSitzPlatz?.reihe.toString()
            s += ersterSitzPlatz?.nummer.toString()
        } else {
            s = ersterSitzPlatz.toString()
        }
        assertEquals(-1, s.toInt())
    }

    @Test
    fun ersterSitzplatzFrei2() {
        val kino = Kino()
        kino.stringToSitzPlaetze(kino2)
        val ersterSitzPlatz = kino.ersterSitzPlatzLeer()
        var s = ""
        if (ersterSitzPlatz is Sitzplatz) {
            s += ersterSitzPlatz?.reihe.toString()
            s += ersterSitzPlatz?.nummer.toString()
        } else {
            s = ersterSitzPlatz.toString()
        }
        assertEquals("A1", s)
    }

    @Test
    fun ersterSitzplatzFrei3() {
        val kino = Kino()
        kino.stringToSitzPlaetze(kino3)
        val ersterSitzPlatz = kino.ersterSitzPlatzLeer()
        var s = ""
        if (ersterSitzPlatz is Sitzplatz) {
            s += ersterSitzPlatz?.reihe.toString()
            s += ersterSitzPlatz?.nummer.toString()
        } else {
            s = ersterSitzPlatz.toString()
        }
        assertEquals("A1", s)
    }

    @Test
    fun ersterSitzplatzFrei4() {
        val kino = Kino()
        kino.stringToSitzPlaetze(kino4)
        val ersterSitzPlatz = kino.ersterSitzPlatzLeer()
        var s = ""
        if (ersterSitzPlatz is Sitzplatz) {
            s += ersterSitzPlatz?.reihe.toString()
            s += ersterSitzPlatz?.nummer.toString()
        } else {
            s = ersterSitzPlatz.toString()
        }
        assertEquals(-1, s.toInt())
    }

    @Test
    fun ersterSitzplatzFrei5() {
        val kino = Kino()
        kino.stringToSitzPlaetze(kino5)
        val ersterSitzPlatz = kino.ersterSitzPlatzLeer()
        var s = ""
        if (ersterSitzPlatz is Sitzplatz) {
            s += ersterSitzPlatz?.reihe.toString()
            s += ersterSitzPlatz?.nummer.toString()
        } else {
            s = ersterSitzPlatz.toString()
        }
        assertEquals("A1", s)
    }
}

