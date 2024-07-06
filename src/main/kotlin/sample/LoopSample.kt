package toy.project.sample

class LoopSample {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            /* 범위 반복 */
            print("범위반복 : ")
            for (i in 1..5) {
                print("$i, ")
            }
            println()

            /* 컬렉션 반복 */
            print("컬렉션 반복 : ")
            val fruits = listOf("apple", "banana", "cherry")
            for (fruit in fruits) {
                print("$fruit, ")
            }
            println()

            /* 역순 반복 */
            print("역순 반복 : ")
            for (i in 5 downTo 1) {
                print("$i, ")
            }
            println()

            /* 증감 단계 지정 */
            print("증감 단계 지정 : ")
            for (i in 0..10 step 2) {
                print("$i, ")
            }
        }
    }
}