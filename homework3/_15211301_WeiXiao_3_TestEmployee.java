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
    static private int Salarid=0;
    static private int Hourly=1;
    static private int Commision=2;
    static private int BasePlusCommision=3;

    public static void main(String[] args)
    {
        _15211301_WeiXiao_3_HourlyEmployee em=new _15211301_WeiXiao_3_HourlyEmployee();
        try{
            System.out.println("Hello world!");
            //修改！注意内存问题
        }
        catch(Exception e) {
            System.out.println("error");
        }
    }
}
