package calculator

class Calculator {
    fun getSum(text: String?): Int {
        var total = 0

        if (text.isNullOrEmpty()) return 0

        for(number in text.split(",", ":")) {
            total += number.toInt()
        }

        return total
    }
}