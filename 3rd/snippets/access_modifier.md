# 접근 한정자 (Access modifier)

* `public`: 다른 클래스 아무 클래스나 다 접근 가능한 애.

```java
class A {
    public String name;
    //
}

class B {
    //
    public void doSomething() {
        A myA = new A();
        System.out.println(myA.name);
    }
}
```

* `default`: 실제로 `default`라고 쓰진 않고, 아무 것도 안 쓰는 경우. (접근
  한정자가 없는 경우) 같은 패키지 안에 있는 클래스에서는 접근 가능. 다른 패키지
  안에 있는 클래스에서는 접근 불가능.
* `protected`: 자기 자신 혹은 자식/후손 클래스에서만 접근 가능.
* `private`: 자기 자신 안에서만 가능.
