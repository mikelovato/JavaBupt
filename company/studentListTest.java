package com.company;
import java.util.Scanner;

public class studentListTest {

    private studentlist totalstudent=new studentlist(20);

    public int test(){

        System.out.println("请输入1-8来选择:");
        System.out.println("1:添加一个学生       2:根据学号删除学生   3：根据位置删除学生");
        System.out.println("4：判断是否为空      5：根据位置返回学生   6：根据学号返回学生");
        System.out.println("7：输出全部学生信息   8：退出程序");

        while(true){
            System.out.println("请输入你的选择:");
            int choice=-1;
            Scanner cin =new Scanner(System.in);
            choice = cin.nextInt();

            switch(choice){
                case 1:
                    System.out.println("请输入学生学号：");
                    String number, name;

                    number = cin.next();
                    System.out.println("请输入学生姓名：");

                    name = cin.next();
                    student s1 = new student(number, name);
                    int math = 0, english = 0, science = 0;
                    String grade;

                    System.out.println("请输入学生成绩 以，[半角字符]分割：");
                    grade = cin.next();

                    String a[] = grade.split("\\,");
                    math = Integer.valueOf(a[0]);
                    english = Integer.valueOf(a[1]);
                    science = Integer.valueOf(a[2]);
                    s1.enterMarks(math, english, science);

                    totalstudent.add(s1);
                    System.out.println("目前有"+(totalstudent.getTotal())+"个学生");
                    break;

                case 2:
                    System.out.println("请输入学生的学号：");
                    String tem=cin.next();
                    if(totalstudent.remove(tem))
                        System.out.println("删除成功");
                    else
                        System.out.println("对不起，没有对应的学生");
                    break;

                case 3:
                    System.out.println("请输入学生的位置：");
                    int cho=cin.nextInt();
                    if(totalstudent.remove(cho))
                        System.out.println("删除成功");
                    else
                        System.out.println("对不起，没有对应的学生");
                    break;

                case 4:
                    if(totalstudent.isEmpty())
                        System.out.println("当前为空！");
                    else
                        System.out.println("当前为不空");
                    break;

                case 5:
                    System.out.println("请输入学生的位置：");
                    int cho5=cin.nextInt();
                    student te=totalstudent.getItem(cho5);
                    te.toString();
                    break;

                case 6:
                    System.out.println("请输入学生学号：");
                    String num6=cin.next();
                    student t6=totalstudent.getItem(num6);
                    t6.toString();
                    break;

                case 7:
                    for(int i=0;i<totalstudent.getTotal();i++)
                        totalstudent.getItem(i+1).toString();
                    break;

                case 8:
                    System.out.println("已退出");
                    return 0;

            }
        }
    }
}
