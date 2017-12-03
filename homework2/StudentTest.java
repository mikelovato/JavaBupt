package homework2;

import java.util.Scanner;

/** homework2.StudentTest.java (UTF-8)
 * 使用String.split()来处理逗号
 *
 * Created by WeiXiao on 03/12/2017.
 */


public class StudentTest {
    static public student createStudent()
    {

        String name,id,mark;
        int math,english,science;
        Scanner cin =new Scanner(System.in);
        student testStudent;

        while(true){
            try{
                System.out.println("请输入学生学号：");
                id=cin.next();
                System.out.println("请输入学生姓名：");
                name=cin.next();
                testStudent=new student(id,name);
                break;
            }
            catch(NumberFormatException e)
            {
                System.out.println("请输入数字！");//学号
            }
            catch (StudentNumberException e)
            {
                System.out.println("学号格式不正确，请重新输入！");
            }

        }

        while(true){//实现分开输入
            try{
                System.out.println("请输入学生三门课成绩（数学，英语，科学成绩）：");
                mark=cin.next();
                String[] score=mark.split(",");
                math=Integer.parseInt(score[0]);
                english=Integer.parseInt(score[1]);
                science=Integer.parseInt(score[2]);
                testStudent.enterMarks(math,english,science);
                break;
            }
            catch (ScoreException e)
            {
                System.out.println("成绩数据有误，请重新输入！");
            }
            catch (ArrayIndexOutOfBoundsException e)
            {
                System.out.println("请输入三个数字并用两个逗号隔开！");
            }
        }
        return testStudent;
    }

    static public void main(String[] args)
    {
        student testStudent=createStudent();
        System.out.println(testStudent);
    }
}
