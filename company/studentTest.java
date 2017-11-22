package com.company;
import java.util.Scanner;
public class studentTest {
    public void test(){
        try{
            Scanner cin =new Scanner(System.in);

            System.out.println("请输入学生学号：");
            String number, name;

            number = cin.next();
            System.out.println("请输入学生姓名：");

            name = cin.next();
            student s1 = new student(number, name);
            int math = 0, english = 0, science = 0;
            String grade;
            System.out.println("请输入学生成绩 以，分割：");
            grade = cin.next();
            String a[] = grade.split("\\,");

            math = Integer.valueOf(a[0]);
            english = Integer.valueOf(a[1]);
            science = Integer.valueOf(a[2]);

            s1.enterMarks(math, english, science);

            String success = s1.toString();
        }
        catch(Exception er){
            throw er;
        }
    }
}
