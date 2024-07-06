package toy.project.sample

class VariableSample {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {

            /*
            * var : 가변 변수
            * 데이터 타입 명시 O
            */
            var nameEng: String = "jaeyoung park"
            println("name is $nameEng")

            /* 변수 변경 */
            nameEng = "park jaeyoung"
            println("여권에 쓰인 이름은 $nameEng")

            /*
            * val : 불변 변수
            * 데이터 타입 명시 X
            */
            val nameKor = "재영"
            println("한글로는 $ $nameKor")

            /*
            * var : 가변 변수
            * 데이터 타입 명시 X
            */
            var age: Int = 31
            println("나이는 $age")

            /* 변수 변경 */
            age = 92
            println("$age 년생")

        }
    }
}

