package homework3;

/**
 * CommisionEmployee: grossSales,commissionRate
 * Employee->CommisionEmployee
 *
 * Created by WeiXiao on 06/12/17
 */

public class _15211301_WeiXiao_3_CommisionEmployee extends _15211301_WeiXiao_3_Employee
{
    private double commissionRate;
    private double grossSales;

    public _15211301_WeiXiao_3_CommisionEmployee()
    {
        commissionRate=0.0;
        grossSales=0.0;
    }

    public _15211301_WeiXiao_3_CommisionEmployee(double c,double g,String f,String l,String s)
    {
        super(f,l,s);
        commissionRate=c;
        grossSales=g;
    }
    public final double getcommissionRate()
    {
        return commissionRate;
    }

    public final double getGrossSales()
    {
        return grossSales;
    }

    public final void setCommissionRate(double c)
    {
        commissionRate=c;
    }

    public final void setGrossSales(double g)
    {
        grossSales=g;
    }

    @Override

    public int earning() {
        return (int)Math.floor(grossSales*commissionRate);//向下取整再int
    }

    public String toString()
    {
        StringBuilder commision= new StringBuilder("");
        //commision.append(super.toString());
        //commision.append("\n销售额："+getGrossSales());
        //commision.append("\n佣金率："+getcommissionRate());
        commision.append("本月工资："+earning());
        return commision.toString();
    }
}
