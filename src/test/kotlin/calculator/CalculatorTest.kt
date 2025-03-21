package calculator

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions

class CalculatorTest {
    @Test
    fun `첫 번째 기능 요구 사항 테스트`() {
        val calculator = Calculator() // 인스턴스 생성

        // 빈 문자열 입력 처리
        Assertions.assertEquals(0, calculator.getSum(""))

        // 구분자로 구분하여 숫자의 합 계산
        Assertions.assertEquals(3, calculator.getSum("1,2"))

        // null 입력 시, 0을 반환하는지?
        Assertions.assertEquals(0, calculator.getSum(null))
    }
}