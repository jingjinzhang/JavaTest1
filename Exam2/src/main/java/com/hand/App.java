package com.hand;

public class App
{
    public static void main( String[] args )
    {
        User userA = User.getInstance("userA",5000);
        userA.calSalary();
        User userB = User.getInstance("userB",10000);
        userB.calSalary();
        User userC = User.getInstance("userC",15000);
        userC.calSalary();
        User userD = User.getInstance("userD",60000);
        userD.calSalary();
    }


}
