### 코틀린에서 클래스를 다루는 방법
#### 클래스와 프로퍼티
- `constructor`는 클래스를 정의할 때 같이 기입한다

```kotlin
class Person constructor(name: String, age: Int) {
    val name = name
    var age = age
}
```
- 필드를 만들면 자동으로 `getter/setter`를 만들어준다
- `constructor` 지시어는 생략 가능하다
- 클래스의 필드 선언과 생성자를 동시에 선언할 수 있다
- 최종적으로 아래와 같은 코드가 완성된다

```kotlin
class Person(
    val name: String,
    var age: Int
)
```
- `.필드`를 통해 `getter/setter`를 사용한다 (코틀린에서 자바 클래스에 접근할 때도 가능)
#### 생성자와 init
- `init{}`은 클래스가 초기화되는 시점에 한 번 호출되는 블록으로 값을 적절히 만들어주거나, validation 하는 로직을 넣는 용도로 사용된다
- 부 생성자
  - 기존 클래스 안에 `constructor(파라미터)`로 생성자를 추가한다
```kotlin
  constructor(name: String) : this(name, age = 1) // 나이를 한 살로 초기화
```
- 주생성자
  - primary constructor 
  - 꼭 필요하며 파라미터가 없을 때는 생략하기도 한다
- 부생성자
  - secondary constructor
  - 옵셔널하다
  - 최종적으로 주생성자를 this로 호출해야한다
  - body를 가질 수 있다
- 부생성자보다는 default parameter를 권장한다
- Converting과 같은 경우 부생성자를 사용할 수 있지만, 그보다는 정적 팩토리 메소드를 추천한다
#### 커스텀 getter, setter
- getter를 직접 정의해서 프로퍼티처럼 사용할 수 있다
- 자기 자신을 변형해줄 수 있다
```kotlin
    val isAdult: Boolean
        get() = this.age >= 20
```
#### backing field
- 무한루프를 막기 위한 예약어, 자기 자신을 가리킨다
```kotlin
    // 대문자로 변경해주는 get()
    val name: String = name
        get() = field.uppercase()
```