package toy.project.sample

class ConditionalSample {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {

            /* if-else 문 */
            val a = 10
            val b = 20
            val max = if (a > b) a else b
            println("(if-else) 결과 : $max")

            /* when 문 */
            val score = 85
            val grade = when (score / 10) {
                9 -> "A"
                8 -> "B"
                7 -> "C"
                else -> "D"
            }
            println("(when) 결과: $grade")

            /* in 연산자 */
            val num = 97
            print("(in) 결과 : ")
            if (num in 90..100) {
                println("A")
            } else if (num in 80..89) {
                println("B")
            } else {
                println("C")
            }

        }
    }

}