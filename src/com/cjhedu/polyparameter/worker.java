package com.cjhedu.polyparameter;

public class worker extends Employee{
    public worker(String name, double salary) {
        super(name, salary);
    }

    public void work(){
        System.out.println(" 开始上工！！！！");
    }

    @Override
    public double getAnnual() {
        return super.getAnnual();
    }
}
