package com.cjhedu.override;

/**
 * 创建两个类，Stdent类重写person类，并且在Student类中添特有属性
 * author：phil
 */
public class Student extends Person{
    private int id;
    private int score;

    public Student(String name, int age, int id, int score) {
        super(name, age);
        this.id = id;
        this.score = score;
    }
    public Student(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String say(){
        return super.say() + " id= "+ id + " score= "+score;
    }

}
