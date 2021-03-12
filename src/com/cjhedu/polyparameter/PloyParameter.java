package com.cjhedu.polyparameter;

/**
 * 多态以及java的动态绑定机制
 * author：phil
 */
public class PloyParameter {
    public static void main(String[] args) {
        Manager manager = new Manager("jack", 20000, 500000);
        worker worker = new worker("tom", 50000);
        PloyParameter ployParameter = new PloyParameter();
        ployParameter.shownEmpAnnual(manager);
        ployParameter.shownEmpAnnual(worker);
        System.out.println("=======================");
        ployParameter.testWork(manager);
        ployParameter.testWork(worker);


    }
    //实现获取任何员工的年工资，并且在main方法中调用该方法
    public void shownEmpAnnual(Employee e){
        System.out.println(e.getAnnual());//动态绑定机制
    }
    //添加一个方法，testWork，如果是普通员工，则调用work方法，如果是经理，则调用manage方法
    public void testWork(Employee e){
        if (e instanceof worker){
            ((worker) e).work();
        }else if (e instanceof Manager){
            ((Manager) e).manage();
        }else{
            System.out.println("啥也不是！！！ ");
        }
    }
}

