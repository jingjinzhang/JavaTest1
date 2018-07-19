package com.hand;

public class App
{
    public static void main( String[] args )
    {
        User userA = User.getInstance("userA",5000);
        calSalary(userA);
        User userB = User.getInstance("userB",10000);
        calSalary(userB);
        User userC = User.getInstance("userC",15000);
        calSalary(userC);
        User userD = User.getInstance("userD",60000);
        calSalary(userD);
    }

    public static void calSalary(User user){
        double money = user.getSalary();
        double cal = money - 0 - 3500;
        if(cal < 1500){
            money = cal * 0.03;
        } else if(cal >= 1500 && cal < 4500){
            money = (cal-1500) * 0.1 + 1500 * 0.03;
        } else if(cal >= 4500 && cal < 9500){
            money = (cal-4500) * 0.2 + 1500 * 0.03 + 3000*0.1;
        } else if(cal >= 9000 && cal < 35000){
            money = (cal-9000) * 0.25 + 1500 * 0.03 + 3000*0.1 + 4500 * 0.2;
        } else if(cal >= 35000 && cal < 55000){
            money = (cal-35000) * 0.3 + 1500 * 0.03 + 3000*0.1 + 4500 * 0.2 + 26000*0.25;
        } else if(cal >= 55000 && cal < 80000){
            money = cal * 0.35 + 1500 * 0.03 + 3000*0.1 + 4500 * 0.2 + 26000*0.25 + 20000*0.3;
        } else if(cal >= 80000){
            money = cal * 0.45 + 1500 * 0.03 + 3000*0.1 + 4500 * 0.2 + 26000*0.25 + 20000*0.3 + 25000*0.35;
        }
        System.out.println("该用户"+user.getName()+"需要缴纳"+money+"元");
    }
}
