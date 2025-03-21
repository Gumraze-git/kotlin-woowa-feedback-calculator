package calculator

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith

class CalculatorTest {
    @Test
    fun `첫 번째 기능 요구 사항 테스트`() {
        val calculator = Calculator() // 인스턴스 생성

        // 빈 문자열 입력 처리
        assertEquals(0, calculator.getSum(""))

        // 구분자로 구분하여 숫자의 합 계산
        assertEquals(3, calculator.getSum("1,2"))

        // null 입력 시, 0을 반환하는지?
        assertEquals(0, calculator.getSum(null))

        // 콜론(:) 구분자로 구분하여 숫자의 합 계산
        assertEquals(6, calculator.getSum("1,2:3"))
    }

    @Test
    fun `숫자가 아닌 문자 포함 시 예외 발생 테스트`() {
        val calculator = Calculator()
        val exception = assertFailsWith<IllegalArgumentException> {
            calculator.getSum("1,2,a")
        }
        assertEquals("Invalid number a", exception.message)
    }

    @Test
    fun `음수 입력 시 예외 발생 테스트`() {
        val calculator = Calculator()
        val exception = assertFailsWith<IllegalArgumentException> {
            calculator.getSum("1,2,-3")
        }
        assertEquals("Invalid number -3", exception.message)
    }
}