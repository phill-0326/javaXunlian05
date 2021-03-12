package com.cjhedu.poly;

public class PolyArray {
    public static void main(String[] args) {
        Person[] person = new Person[5];
        person[0] = new Person("jack",20);
        person[1] = new Student("jackma",13,88);
        person[2] = new Student("jackson",13,88);
        person[3] = new Teacher("milan",34,34000);
        person[4] = new Teacher("smith",34,34000);

        for (int i = 0; i < person.length; i++) {

            if (person[i] instanceof Student){
                Student student = (Student)person[i];//向下转型
                //student.study();
                System.out.println(student.study());
            }else if (person[i] instanceof Teacher){
                System.out.println(((Teacher)person[i]).teach());//向上转型
            }else if (person[i] instanceof Person){
                //
            }else{
                System.out.println("您输入的类型有误。。。。。。");
            }
            System.out.println(person[i].say());
        }
    }
}
