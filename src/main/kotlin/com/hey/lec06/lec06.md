### 코틀린에서 반목문을 다루는 방법
#### for-each문
- 자바
  - `for(el : els)`
- 코틀린
  - `for(el in els)`
  - 타입을 생략할 수 있다
#### 전통적인 for문
- 오름차순: `for (i in 1..3) { }`으로 사용한다
- 내림차순: `for (i in 3 downTo 1) { }`으로 사용한다
- i가 1보다 큰 n씩 증가할 때
  - `for (i in 1..5 step 2) { }`으로 사용한다
#### Progression과 Range
- `..` 연산자: 범위를 의미한다
  - IntRange는 IntProgression(등차수열)을 상속받는다 -> 시작값, 끝값, 공차 값이 필요하다
#### while문
- 자바와 while과 do-while문 모두 동일하다