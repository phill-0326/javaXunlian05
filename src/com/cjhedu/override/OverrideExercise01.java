package com.cjhedu.override;

public class OverrideExercise01 {
    public static void main(String[] args) {
        Person person = new Person("jack",10);
        Student student = new Student("milan",12,1,89);

        System.out.println(person.say());
        System.out.println("========================");
        System.out.println(student.say());
    }

}

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public String  name(){
      return getName();
    }

    //方法say()
    public String say() {
        return "大家好，我叫 " + getName() + " 今年 " + getAge();
    }
}