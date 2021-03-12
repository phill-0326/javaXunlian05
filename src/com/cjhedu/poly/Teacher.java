package com.cjhedu.poly;

public class Teacher extends Person{
    private double aslary;

    public Teacher(String name, int age, double aslary) {
        super(name, age);
        this.aslary = aslary;
    }

    public double getAslary() {
        return aslary;
    }

    public Teacher(String name, int age) {
        super(name, age);
    }

    public void setAslary(double aslary) {
        this.aslary = aslary;
    }

    @Override
    public String say() {
        return "老师  "+ super.say() + " 薪水：" + getAslary();
    }
    public String teach(){
        return "学生 " + getName() +"正在授课。。。。";
    }
}
