package homework4;
/*
 *  1.输入要查询的员工社会保险号
 *  2.输出员工信息
 *  3.对于已经存在于员工列表中的一个员工,输入更新信息来更新列表中的员工对象
 *  4.对于已经存在于员工列表中的一个员工,将其从HashMap中删除
 *  5.打印全部员工的信息
 *  Created by WeiXiao on 06/12/17
 */

import java.util.Scanner;

public class _15211301_Weixiao_4_TestFactory {
    private _15211301_Weixiao_4_Factory TempFactory;

    Scanner cin =new Scanner(System.in);

    public _15211301_Weixiao_4_TestFactory()
    {
        TempFactory= new _15211301_Weixiao_4_Factory();
    }

    private void findSocailNumber()
    {


        String TempNumber=cin.next();
        _15211301_WeiXiao_4_Employee TempEmployee=TempFactory.getEmployee(TempNumber);

        if(TempEmployee!=null)
            System.out.println(TempEmployee);
        else
            System.out.println("Without this Employer");
    }

    private void updateFactoryEmployee()
    {
        System.out.println("Please input employer Social Security Number:");
        String TempNumber=cin.next();

        if(TempFactory.getEmployee(TempNumber)==null)
        {
            System.out.println("invalid Number");
            return ;
        }

        int choice;
        System.out.println("0->salaried 1->hourly 2->commission 3->base plus commission");
        choice=cin.nextInt();
        if(choice<0||choice>3)
        {
            System.out.println("invalid Choice!");
            return ;
        }
        _15211301_WeiXiao_4_Employee TempEmp= _15211301_Weixiao_4_Factory.newgene(choice);
        TempFactory.updateEmployee(TempNumber,TempEmp);
        System.out.println("updated Successfully");
    }

    private void deleteFactoryEmployee()
    {
        System.out.println("Please input the Social number!");

        String TempNumber=cin.next();

        _15211301_WeiXiao_4_Employee TempEmployee=TempFactory.deleteEmployee(TempNumber);

        if(TempEmployee==null)
            System.out.println("Error,without this employee!");
        else
            System.out.println("Success!");
    }

    private void printFactory()
    {
        TempFactory.printEmployees();
    }

    private void RunFactory()
    {
        TempFactory.initEmployees();

        System.out.println("welcome Factory");

        while(true)
        {
            System.out.println("1->find 2->update 3->delete 4->print 5->quit");
            int choice=cin.nextInt();

            boolean qu=false;

            switch(choice)
            {
                case 1:
                    findSocailNumber();
                    break;
                case 2:
                    updateFactoryEmployee();
                    break;
                case 3:
                    deleteFactoryEmployee();
                    break;
                case 4:
                    printFactory();
                    break;
                case 5:
                    qu=true;
                    break;
                default:
                    break;
            }
            if(qu)
                break;
        }
        System.out.println("Bye!");
    }

    static public void main(String[] args)
    {
        _15211301_Weixiao_4_TestFactory testtemp= new _15211301_Weixiao_4_TestFactory();
        testtemp.RunFactory();
    }
}
