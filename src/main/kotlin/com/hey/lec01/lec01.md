### 코틀린에서 변수를 다루는 방법
#### 1. 변수 선언 키워드 - `var`와 `val`의 차이점

- Java
  - `final`로 가변인지 불변(read-only)인지 구분한다
- Kotlin
  - 모든 변수에 수정 가능 여부를 명시한다
    - `var`은 가변, `val`은 불변
    - `var`은 variable의 약자이고 `val`은 value의 약자이다
  - 타입을 명시적으로 작성하지 않아도 타입이 추론된다
    - 하지만, 초기화 하지 않은 변수의 경우 타입을 명시해주어야 한다
  - `val` 컬렉션에는 element를 추가할 수 있다
  - 모든 변수는 우선 `val`로 만들고 꼭 필요한 경우에 `var`로 변경하자
#### 2. Primitive Type

- Java
  - 원시 타입과 참조 타입을 구분한다
- Kotlin
  - 원시 타입과 참조 타입을 구분하지 않고 모든 타입을 참조 타입으로 표현한다
  - 이는 프로그래머가 boxing과 unboxing을 고려하지 않아도 되도록 도와준다
  - ex. `val number1: Long`
#### 3. nullable 변수
- Java
  - 참조 타입으로 선언하면 null을 허용한다
- Kotlin
  - `타입?`을 사용해야한다
  - ex. `var number3: Long?`
#### 4. 객체 인스턴스화

- Java
  - `new` 생성자를 사용한다
- Kotlin
  - `new`를 사용하지 않아도 된다