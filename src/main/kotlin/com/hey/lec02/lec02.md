### 코틀린에서 null을 다루는 방법
#### 코틀린에서의 null 체크
- 파라미터 값과 반환 값 모두 `nullable`일 경우 타입 뒤에 `?`를 붙여줘야한다
#### Safe Call과 Elvis 연산자
- 코틀린에서는 null이 가능한 타입을 완전히 다르게 취급한다
- null이 가능한 타입만을 위한 기능
  - Safe Call
    - `str?.length`
    - null이 아니면 실행하고 null이면 실행하지 않는다(그대로 null값 유지)
  - Elvis 연산자
    - `str?.length ?: 0`
    - 앞의 연산 결과가 null이면 뒤의 값을 사용한다 
#### null이 아님을 단언할 때
- nullable 타입이지만 아무리 생각해도 null이 될 수 없는 경우
- `!!`로 사용한다
- ex. `str!!.startsWith("A")`
#### 플랫폼 타입
- 코틀린과 자바는 100% 호환이 가능하다 보니 코틀린에서 자바 코드를 가져다 사용하는 경우가 있다
- 코틀린이 null 관련 정보를 알 수 없는 타입 Runtime 시 Exception이 발생할 수 있다
  - ex.`@NotNull` 어노테이션을 사용한다
  - 자바 코드를 읽으며 null 가능성을 확인하거나 코틀린으로 래핑해주자