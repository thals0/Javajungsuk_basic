## overloading

자바에서는 한 클래스 내에 이미 사용하려는 이름과 같은 이름을 가진 메서드가 있더라도 매개변수의 개수 또는 타입이 다르면, 같은 이름을 사용해서 메서드를 정의할 수 있음

메서드 오버로딩 or 오버로딩

: 한 클래스 내에 같은 이름의 메서드를 여러 개 정의하는 것

1. 메서드 이름이 같아야 한다.
2. 매개변수의 개수 또는 타입이 달라야 한다.
3. 반환 타입은 관계없다.

대표적인 예)

`println()`

```java
void println()
void println(boolean x)
void println(char x)
void println(char[] x)
void println(double x)
void println(float x)
void println(int x)
void println(long x)
void println(Object x)
void println(String x)
```

오버로딩 아닌 예)

```java
int add(int a, int b){ return a+b; }
long add(int a, int b){ return (long)a+b; }
```