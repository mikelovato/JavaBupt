package homework3;

/**
 *  然后生成10个员工对象，（使用 Math.random()方法）
 *  决定生成对象的类型（可以是SalaridEmployee、HourlyEmployee、CommisionEmployee、BasePlusCommisionEmployee）
 *  对象引用保存到数组中
 *  然后依次调用对象的earning方法来输出对象的月工资
 *
 *  小记：根据要求在进行修改，最后的test
 *  Created by WeiXiao on 06/12/17
 */
import java.util.Scanner;

import java.util.Random;

import java.util.Vector;

public class _15211301_WeiXiao_3_TestEmployee {
    static final int Salarid=0;
    static final int Hourly=1;
    static final int Commision=2;
    static final int BasePlusCommision=3;
    static final int Enumber=3;

    public static void main(String[] args)
    {

        Vector Employees=new Vector();
        Random rand =new Random(25);
        String f,l,s;
        Scanner cin =new Scanner(System.in);
        try{
            for(int i=0;i<Enumber;i++)
            {
                System.out.println("请依次输入firstname，lastname，socialSecurityNumber，中间用逗号分割");
                String t=cin.next();
                String[] a=t.split("\\,");
                if(a.length!=3)
                    throw new Exception("Error Input");
                else{
                    f=a[0];
                    l=a[1];
                    s=a[2];
                }
                int choice=rand.nextInt(4);
                switch (choice)
                {
                    case Salarid:
                    {
                        System.out.println("请输入周薪：");
                        double temp=cin.nextDouble();
                        Employees.add(new _15211301_WeiXiao_3_SalaridEmployee(temp,f,l,s));
                        break;
                    }
                    case Hourly:
                    {
                        System.out.println("请输入工作时间：");
                        double ho=cin.nextDouble();
                        System.out.println("请输入薪水：");
                        double wa=cin.nextDouble();
                        Employees.add(new _15211301_WeiXiao_3_HourlyEmployee(wa,ho,f,l,s));
                        break;
                    }
                    case Commision:
                    {
                        System.out.println("请输入销售额：");
                        double gr=cin.nextDouble();
                        System.out.println("请输入佣金率：");
                        double co=cin.nextDouble();
                        Employees.add(new _15211301_WeiXiao_3_CommisionEmployee(co,gr,f,l,s));
                        break;
                    }
                    case BasePlusCommision:
                    {
                        System.out.println("请输入销售额：");
                        double gr=cin.nextDouble();
                        System.out.println("请输入佣金率：");
                        double co=cin.nextDouble();
                        System.out.println("请输入基础工资");
                        double ba=cin.nextDouble();
                        Employees.add(new _15211301_WeiXiao_3_BasePlusCommisionEmployee(ba,co,gr,f,l,s));
                        break;

                    }
                }
            }
        }
        catch(Exception e) {
            System.out.println("error");
        }
        for(int i=0;i<Enumber;i++) {
            System.out.println(Employees.get(i));
        }
    }
}
