package Innerclass;

public class Example4{
}

abstract class Person01 {
    abstract void say();
    abstract void say2();
    void eat(){
        System.out.println("Hello eat from Person");
    };
}

abstract class Student1 extends Person01{
    abstract void m2();
    abstract void m3();
}
class Rohith extends Student1{

    @Override
    void say() {

    }

    @Override
    void say2() {

    }

    @Override
    void m2() {

    }

    @Override
    void m3() {

    }
}