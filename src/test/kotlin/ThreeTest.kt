import me.emilia.Three
import me.emilia.ThreePartTwo
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class ThreeTest {

    @Nested
    inner class PartOne {
        @Test
        fun partOneSimpleTest() {
            val input = "xmul(2,4)%&mul[3,7]!@^do_not_mul(5,5)+mul(32,64]then(mul(11,8)mul(8,5))"
            val sut = Three(input)

            assertEquals(161, sut.calculate())
        }

        @Test
        fun partOneActualTest() {
            val input = getInputData()
            val sut = Three(input)

            assertEquals(0, sut.calculate())
        }
    }

    @Nested
    inner class PartTwo {
        @Test
        fun partTwoSimpleTest() {
            val input = "xmul(2,4)&mul[3,7]!^don't()_mul(5,5)+mul(32,64](mul(11,8)undo()?mul(8,5))"
            val sut = ThreePartTwo(input)

            assertEquals(48, sut.calculate())
        }

        @Test
        fun partTwoActualTest() {
            val input = getInputData()
            val sut = ThreePartTwo(input)

            assertEquals(0, sut.calculate())
        }
    }

    private fun getInputData(): String {
        val inputFile = TwoTest::class.java.getResource("inputs/three.txt")!!.readText()

        return inputFile
    }
}