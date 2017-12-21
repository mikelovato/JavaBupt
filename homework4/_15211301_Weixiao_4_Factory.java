package homework4;

/*
 * Factory
 *
 *
 * Created by WeiXiao on 21/12/17
 */
import java.util.Scanner;
import java.util.HashMap;
import java.util.Random;

public class _15211301_Weixiao_4_Factory {
    private HashMap<String,_15211301_WeiXiao_4_Employee> employees;
    //employ hash map

    static private final int Salarid=0;
    static private final int Hourly=1;
    static private final int Commision=2;
    static private final int BasePlusCommision=3;

    public _15211301_Weixiao_4_Factory()
    {
        employees=new HashMap<String,_15211301_WeiXiao_4_Employee>();
    }
    public static _15211301_WeiXiao_4_Employee newgene(int choice)
    {
        try {
            String f,l,s;
            Scanner cin =new Scanner(System.in);
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
            if(s.equals("0000"))
                return null;
            switch (choice)
            {
                case Salarid:
                {
                    System.out.println("请输入周薪：");
                    double temp=cin.nextDouble();
                    return new _15211301_WeiXiao_4_SalaridEmployee(temp,f,l,s);
                }
                case Hourly:
                {
                    System.out.println("请输入工作时间：");
                    double ho=cin.nextDouble();
                    System.out.println("请输入薪水：");
                    double wa=cin.nextDouble();
                    return new _15211301_WeiXiao_4_HourlyEmployee(wa,ho,f,l,s);
                }
                case Commision:
                {
                    System.out.println("请输入销售额：");
                    double gr=cin.nextDouble();
                    System.out.println("请输入佣金率：");
                    double co=cin.nextDouble();
                    return new _15211301_WeiXiao_4_CommisionEmployee(co,gr,f,l,s);
                }
                case BasePlusCommision:
                {
                    System.out.println("请输入销售额：");
                    double gr=cin.nextDouble();
                    System.out.println("请输入佣金率：");
                    double co=cin.nextDouble();
                    System.out.println("请输入基础工资");
                    double ba=cin.nextDouble();
                    return new _15211301_WeiXiao_4_BasePlusCommisionEmployee(ba,co,gr,f,l,s);
                }
                default:{
                    throw new Exception("Error choice");
                }
            }
        }
        catch (Exception e)
        {
            System.out.println("Error proccess!");
        }
        return null;
    }

    public void initEmployees()
    {
        Random rand = new Random();
        final int Esize=3;
        for(int i=0;i<Esize;i++)
        {
            int choice = rand.nextInt(4);

            switch(choice)
            {
                case Salarid:
                    System.out.println("salaried employee");
                    break;
                case Hourly:
                    System.out.println("Hourly employee");
                    break;
                case Commision:
                    System.out.println("Commission employee");
                    break;
                case BasePlusCommision:
                    System.out.println("Base Plus Commission employee");
                    break;
            }
            _15211301_WeiXiao_4_Employee temp=newgene(choice);
            if(temp!=null)
                this.addEmployee(temp);
            else
            {
                System.out.println("End generate!");
                return;
            }
        }
    }

    public _15211301_WeiXiao_4_Employee addEmployee(_15211301_WeiXiao_4_Employee TempEmployee)
    {
        if(employees.get(TempEmployee.getSocialSecurityNumber())!=null)
        {
            return null;
        }
        else
            return employees.put(TempEmployee.getSocialSecurityNumber(),TempEmployee);
    }

    public _15211301_WeiXiao_4_Employee getEmployee(String TempSecurityNumber)
    {
        return employees.get(TempSecurityNumber);
    }

    public _15211301_WeiXiao_4_Employee deleteEmployee(String TempSecurityNumber)
    {
        return employees.remove(TempSecurityNumber);
    }

    public _15211301_WeiXiao_4_Employee updateEmployee(String TempSecurityNumber,_15211301_WeiXiao_4_Employee TempEmployee)
    {
        if(employees.get(TempSecurityNumber)!=null)
            return employees.put(TempSecurityNumber,TempEmployee);
        else
            return null;
    }

    public void printEmployees()
    {
        for(_15211301_WeiXiao_4_Employee TempEmloyee:employees.values())
            System.out.println(TempEmloyee);
    }
}
