package org.DoctorReservationSystem.controller;

import java.sql.Date;
import java.time.LocalDate;

public class UserController {

    public static boolean verifyName(String name){
        return name.length() > 2 && name.length() < 20;
    }

    public static boolean verifyDOB(int day, int month, int year){
        if(year > 1900 && LocalDate.now().getYear() >= year)
            if(month > 0 && month < 13)
                return day > 0 && day < 32;
        return false;
    }

    public static boolean verifyEmail(String email){
        if(email.indexOf('@') != -1) {
            String domain = email.substring(email.indexOf('@')).toLowerCase();
            return domain.equals("@yahoo.com") || domain.equals("@gmail.com") || domain.equals("@hotmail.com");
        }
        return false;
    }

    public static boolean verifyPhone(String phone){
        if(phone.length() < 11 || phone.length() > 13 || phone.indexOf('0')==-1)
            return false;
        String isp = phone.substring(phone.indexOf('0'),phone.indexOf('0')+3);
        return isp.equals("010") || isp.equals("011") || isp.equals("012") || isp.equals("015");
    }

    public static boolean verifyPassword(String password){
        return password.length() >= 8 && password.length() < 50;
    }

}
