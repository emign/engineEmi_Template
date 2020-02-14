import com.soywiz.korge.tests.*
import kotlin.test.*


class ArrayTest : KorgeTest() {
    val array1 = arrayOf(4, 6, 2, 8, 29, 32, 23, 6, 345, 57, 34, 2, 7, 2, 23, 42, 324, 23, 4234, 6).toIntArray()
    val array2 =
            arrayOf(4, 6, 2, 8, -29, 32, 23, 6, 345, 57, 34, 2, 7, -2, 23, 42, -324, 23, 4234, -6, -4486).toIntArray()
    val array3 = arrayOf(0).toIntArray()
    val array4 = arrayOf(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0).toIntArray()

    @Test
    fun testArrayErstellenLange10() {
        assertEquals(IntArray(10).size, ArrayUebung.intArrayErstellen((10)).size)
    }

    @Test
    fun testArrayErstellenLange100() {
        assertEquals(IntArray(100).size, ArrayUebung.intArrayErstellen(100).size)
    }

    @Test
    fun testArrayErstellenLange0() {
        assertEquals(IntArray(0).size, ArrayUebung.intArrayErstellen(0).size)
    }

    @Test
    fun testSummeUeberArray() {
        assertEquals(5209, ArrayUebung.summeUeberArray(array1))
    }

    @Test
    fun testArrayVon0bis9() {
        assertEquals(arrayOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9).toIntArray().joinToString(), ArrayUebung.arrayVon0bis9().joinToString())
    }

    @Test
    fun testArrayVon1bis10() {
        assertEquals(arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).toIntArray().joinToString(), ArrayUebung.arrayVon1bis10().joinToString())
    }

    @Test
    fun testSummeUeberArrayNegatives() {
        assertEquals(1, ArrayUebung.summeUeberArray(array2))
    }

    @Test
    fun testSummeUeberArraySingleZero() {
        assertEquals(0, ArrayUebung.summeUeberArray(array3))
    }

    @Test
    fun testSummeUeberArrayAllZeros() {
        assertEquals(0, ArrayUebung.summeUeberArray(array4))
    }

    @Test
    fun testVertausche0Und1() {
        assertEquals(
                arrayOf(
                        6,
                        4,
                        2,
                        8,
                        29,
                        32,
                        23,
                        6,
                        345,
                        57,
                        34,
                        2,
                        7,
                        2,
                        23,
                        42,
                        324,
                        23,
                        4234,
                        6
                ).toIntArray().joinToString(), ArrayUebung.vertauscheIndizes(0, 1, array1).joinToString()
        )
    }

    @Test
    fun testVertauscheGleiche() {
        assertEquals(array2.joinToString(), ArrayUebung.vertauscheIndizes(5, 5, array2).joinToString())
    }

    @Test
    fun testInvertiereArray1() {
        assertEquals(
                "6, 4234, 23, 324, 42, 23, 2, 7, 2, 34, 57, 345, 6, 23, 32, 29, 8, 2, 6, 4",
                ArrayUebung.invertiere(array1).joinToString()
        )
    }

    @Test
    fun testInvertiereArray2() {
        assertEquals(
                "-4486, -6, 4234, 23, -324, 42, 23, -2, 7, 2, 34, 57, 345, 6, 23, 32, -29, 8, 2, 6, 4",
                ArrayUebung.invertiere(array2).joinToString()
        )
    }

    @Test
    fun testInvertiereArray3() {
        assertEquals("0", ArrayUebung.invertiere(array3).joinToString())
    }

    @Test
    fun testInvertiereArray4() {
        assertEquals(
                "0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0",
                ArrayUebung.invertiere(array4).joinToString()
        )
    }

    @Test
    fun testCharArrayMischen() {
        assertEquals(
                "hallo",
                ArrayUebung.charArrayMischenBisWortHerauskommt("hallo", arrayOf('l', 'l', 'h', 'a', 'o').toCharArray())
        )
    }

    @Test
    fun testCharArrayMischenSingleChar() {
        assertEquals("z", ArrayUebung.charArrayMischenBisWortHerauskommt("z", arrayOf('z').toCharArray()))
    }

    @Test
    fun testPersonenArray() {
        val p1 = Person("Hans")
        val p2 = Person("Peter")
        val p3 = Person("Sonja")
        assertEquals("null, eins, zwei", ArrayUebung.personenArray(arrayOf(p1, p2, p3)).map { it.wartenummer }.joinToString())

    }

    @Test
    fun testPersonenArray2() {
        val p1 = Person("Hans")
        val p2 = Person("Peter")
        val p3 = Person("Sonja")
        assertEquals("null, eins, zwei", ArrayUebung.personenArray(arrayOf(p1, p3, p2)).map { it.wartenummer }.joinToString())

    }


}