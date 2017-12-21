package homework4;

/**
 * BasePlusCommisionEmployee: baseSalary
 * Employee->CommisionEmployee->BasePlusCommisionEmployee
 *
 * Created by WeiXiao on 06/12/17
 */

public class _15211301_WeiXiao_4_BasePlusCommisionEmployee extends _15211301_WeiXiao_4_CommisionEmployee
{
    private double baseSalary;

    public _15211301_WeiXiao_4_BasePlusCommisionEmployee()
    {
        baseSalary=0.0;
    }

    public _15211301_WeiXiao_4_BasePlusCommisionEmployee(double b,double c,double g,String f,String l,String s)
    {
        super(c,g,f,l,s);
        baseSalary=b;
    }
    public final double getBaseSalary()
    {
        return baseSalary;
    }

    public final void setBaseSalary(double c)
    {
        baseSalary=c;
    }

    @Override

    public int earning() {
        return super.earning()+(int)Math.floor(baseSalary);//向下取整再int
    }

    public String toString()
    {
        StringBuilder base= new StringBuilder("");
        //base.append(super.toString());
        //base.append("\n基本工资："+getBaseSalary());
        base.append("本月工资："+earning());
        return base.toString();
    }
}
