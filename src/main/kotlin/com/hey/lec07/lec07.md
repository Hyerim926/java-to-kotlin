### 코틀린에서 예외를 다루는 방법
#### try catch finally 구문
- 문법 자체는 자바와 동일하다
- catch 구문에서 에러를 던질 때 `new`를 사용하지 않는다
- if-else 구문처럼 expression으로 간주되어 return문에 한 번에 처리할 수 있다
#### checked Exception과 Unchecked Exception
- 코틀린에서는 이 둘을 구분하지 않고 모두 Unchecked Exception으로 간주한다. 즉, `throw`를 통해서 예외가 나는 함수라는 것을 메서드 시그니처에 명시하지 않아도 된다
#### try with resources
- try with resources는 자바에서 try() 안에 외부 자원을 만들어주고 try가 끝나면 자동으로 외부 자원을 닫아줄 때 사용하는 구문이다
- 코틀린에서는 try with resources를 사용하지 않는다 대신 `use` 구문을 사용한다
- ex. `BufferedReader(FileReader(path)).use { reader -> println(reader.readLine())}` 형식으로 표현한다