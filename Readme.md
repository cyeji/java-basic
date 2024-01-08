# 클래스, 객체, 인스턴스 정리

- 클래스 Class

```
클래스는 객체를 생성하기 위한 '틀' 또는 '설계도'이다. 클래스는 객체가 가져야 할 속성(변수)과 기능(메서드)를 정의한다.
```

- 객체 Object

```
객체는 클래스에서 정의한 속성과 기능을 가진 실체이다. 객체는 서로 독립적인 상태를 가진다.
```

- 인스턴스 Instance

```
인스턴스는 특정 클래스로부터 생성된 객체를 의미한다. 그래서 객체와 인스턴스라는 용어는 자주 혼용된다. 인스턴스는 주로 객체가
어떤 클래스에 속해 있는지 강조할 때 사용된다.
```

- 객체 VS 인스턴스

```
둘 다 클래스에서 나온 실체라는 의미에서 비슷하게 사용되지만 용어상 인스턴스는 객체보다 좀 더 관계에 초점을 맞춘 단어이다.
보통 student1은 Student의 객체이다. 라고 말하는 대신 student1은 Student의 인스턴스이다.라고 특정 클래스와의 관계를
명확히 할 때 인스턴스라는 용어를 주로 사용한다.
 좀 더 쉽게 풀어자면, 모든 인스턴스는 객체이지만, 우리가 인스턴스라고 부르는 순간은 특정 클래스로부터 그 객체가 생성되었음을
 강조하고 싶을 때이다. 예를 들어 student1은 객체이지만 이 객체가 Student 클래스로부터 생성된다는 점을 명확하게 하기 위해
 student1을 Student의 인스턴스라고 부른다.
```

# 배열 도입 - 시작

## 기본형 vs 참조형 - 메서드 호출

**대원칙 자바는 항상 변수의 값을 복사해서 대입한다.**

### 기본형과 참조형의 메서드 호출

자바에서 메서드의 매개변수(파라미터)는 항상 값에 의해 전달됩니다. 그러나 이 값이 실제 값이냐 참조값이냐에 따라 동작이 달라진다.

- 기본형 : 메서드로 기본형 데이터를 전달하면 해당 값이 복사되어 전달. 이경우, 메서드 내부에서 매개변수(파라미터)의 값을 변경해도, 호출자의 변수 값에는 영향이 없다.
- 참조형 : 메서드로 참조형 데이터를 전달하면, 참조값이 복사되어 전달된다. 이경우, 메서드 내부에서 매개변수(파라미터)로 전달된 객체의 멤버 변수를 변경하면, 호출자의 객체도
  변경된다.