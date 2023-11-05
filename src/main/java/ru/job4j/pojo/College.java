package ru.job4j.pojo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class College {
    public static void main(String[] args) throws ParseException {
        Student student = new Student();
        student.setFullName("Ivanov Ivan Jovanovich");
        student.setGroup(12);
        SimpleDateFormat sdf = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
        String dateInString = "31-08-1982 10:20:56";
        Date date = sdf.parse(dateInString);
        student.setDateOfAdmission(date);
        System.out.println(student.getFullName() + " " + student.getGroup() + " " + student.getDateOfAdmission());
    }
}
