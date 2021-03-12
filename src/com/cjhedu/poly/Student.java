package com.cjhedu.poly;

public class Student extends Person{
    private double score;

    public Student(String name, int age, double score) {
        super(name, age);
        this.score = score;
    }



    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
    //say() 方法

    @Override
    public String say() {
        return "学生  "+super.say() + " 成绩：" + getScore();
    }
    public String  study(){
        return "学生 " + getName() +"正在学java。。。。。";
    }
}
