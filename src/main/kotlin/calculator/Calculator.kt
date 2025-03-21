package calculator

class Calculator {
    fun getSum(text: String?): Int {
        var total = 0

        if (text.isNullOrEmpty()) return 0

        for(number in text.split(",", ":")) {
            if(number.any { !it.isDigit() }) throw IllegalArgumentException("Invalid number $number")

            val num = number.toInt()

            if (num < 0) throw IllegalArgumentException("Invalid number $number")
            total += num
        }

        return total
    }
}