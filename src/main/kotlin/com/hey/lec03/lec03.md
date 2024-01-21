### 코틀린에서 Type을 다루는 방법
#### 기본 타입
- 자바와 동일하게 [Byte, Short, Int, Long, Float, Double, 부호 없는 정수들] 을 사용한다
- 코틀린에서는 선언된 기본값을 보고 타입을 추론한다
  - `val number1 = 3` (int) vs `val number2 = 3L` (long)
  - `val number1 = 3.0f` (float) vs `val number2 = 3.0` (double)
- Java
  - 기본 타입간의 변환은 암시적으로 이루어질 수 있다
- Kotlin
  - 기본 타입간의 변환은 작은 타입에서 더 큰 타입으로 캐스팅한다고 하더라도 명시적으로 이루어져야 한다
  - `toLong()`, `toDouble()`, `toString()` 과 같은 함수를 사용한다
#### 타입 캐스팅
- 자바에서 `instanceof`로 사용하던 것을 코틀린에서는 `is`로 사용한다
- 자바에서 `(type) variable` 로 사용하던 것을 코틀린에서는 `as type`으로 사용한다
- `as type`은 생략이 가능한데 그 이유는 `is` 로 한번 타입을 캐스팅해주면 코틀린이 알아서 인지해준다. 이를 스마트 캐스트라고 부른다
- `!is`는 is not이라는 반대의 의미를 가진다
- null을 처리하는 법
  - `as?`를 사용한다 -> 호출할 때도 `variable?.property` 로 호출한다
#### 코틀린의 3가지 특이한 타입
- Any
  - Java의 Object 역할, 모든 객체의 최상위 타입
  - 모든 Primitive Type의 최상의 타입도 Any이다
  - Any 자체로는 null을 포함할 수 없어 null을 포함하고 싶다면 `Any?`로 표현한다
  - Any에는 `equals()` `hashCode()` `toString()`이 존재한다
- Unit
  - Java의 void와 동일한 역할
  - void와 다르게 Unit은 그 자체로 타입 인자로 사용가능하다
  - 함수형 프로그래밍에서 Unit은 단 하나의 인스턴스만 갖는 타입을 의미한다. 즉, 코틀린의 Unit은 실제 존재하는 타입이라는 것을 표현한다
- Nothing
  - 함수가 정상적으로 끝나지 않았다는 사실을 표현하는 역할
  - 무조건 예외를 반환하는 함수나 무한 로프 함수 등이 있다
#### String Interpolation, String Indexing
- Java
  - `String.format` 혹은 `StringBuilder`를 사용한다
  - `charAt()`으로 특정 인덱스의 문자열을 가져온다
- Kotlin
  - `${}` 템플릿 리터럴 형식으로 사용한다. 중괄호를 생략하고 `$변수`로 사용할 수도 있다
  - `val string = "사람의 이름은 ${person.name}이고 나이는 ${person.age}세 이다"`
  - 문자열을 이어 붙일 때 큰 따옴표 3개를 사용한다 `""" """.trimIndent()`
  - 배열처럼 `str[1]`로 특정 인덱스의 문자열을 가져온다