# 코틀린 시작하기


>## 1. 변수 선언 키워드
`val` : 변수를 선언할 때 지정한 값에서 더 이상 변경하지 않아야 하는 경우 (Ex : final 변수)
<br>`var` : 변수의 값을 바꿔야 하는 경우

- 구조 : (변수선언키워드) (변수이름) : (데이터타입) = (값)
  - ex) `val name : String = "재영"`


* 데이터타입은 생략 가능 (Optional) : 자동으로 추론하여 데이터타입을 주입
  * ex) `val name = "재영"` 

### 출력 방법
`println("print value : $name")` : `$기호`를 사용하여 선언된 변수를 사용 가능

### 코드
```Kotlin
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

```

### 실행결과
![variable.png](snapshot/variable.png)