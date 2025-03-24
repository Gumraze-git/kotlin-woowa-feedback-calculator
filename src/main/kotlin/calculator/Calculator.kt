package calculator

class Calculator {
    fun getSum(text: String?): Int {
        var total = 0

        if (text != null) {
            if(text.startsWith("//")) {
                val customDelimiter = text.split("\n")[0].substring(2)
                val customText = text.split("\n")[1]

                return getSum(customText.replace(customDelimiter, ","))
            }
        }

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