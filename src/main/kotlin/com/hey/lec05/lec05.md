### 코틀린에서 조건문을 다루는 방법
#### if문
- 자바와 동일하다
#### Expression과 Statement
- Expression: 하나의 값으로 도출되는 문장
- Statement: 프로그램의 문장, 하나의 값으로 도출되지 않는다
- 포함관계: Statement > Expression
- 자바에서 if-else는 Statement이지만, 코틀린에서는 Expression이다. 
- 즉, if-else 구문을 하나의 값으로 취급할 수 있다. 이를 통해 중복된 return문을 줄일 수 있고, 코틀린에서는 삼항 연산자가 없다
- if-else if-else도 마찬가지
- [참고] 특정 범위에 있는지 검증할 때 자바에서는 대소 비교로 구현했던 것을 코틀린에서는 `in`을 사용해 표현할 수 있다
  - ex. `if(0 <= score && score <= 100)` => `if(score in 0..100)`
#### switch와 when
- 자바에서 switch를 사용했던 것을 when으로 사용한다
- `when(변수) {... 조건에 대한 값 ...}`
- 조건에 들어갈 수 있는 연산자들
  - 범위: `in ..`
  - istanceof: `is`
- early-return 시에도 사용 가능하다
  - 이때는 when() 괄호에 변수를 넣지않고 곧바로 조건과 결과값을 작성해준다
- Enum Class 혹은 Sealed Class와 함께 사용할 경우 더 효율적인 코드를 짤 수 있다
- 