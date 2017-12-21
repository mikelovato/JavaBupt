package homework4;

/**
 * SalaridEmployee: weeklySalary
 * Employee->SalaridEmployee
 *
 * Created by WeiXiao on 06/12/17
 */

public class _15211301_WeiXiao_4_SalaridEmployee extends _15211301_WeiXiao_4_Employee
{
    private double weeklySalary;

    public _15211301_WeiXiao_4_SalaridEmployee()
    {
        weeklySalary=0.0;
    }

    public _15211301_WeiXiao_4_SalaridEmployee(double w,String f,String l,String s)
    {
        super(f,l,s);
        weeklySalary=w;
    }
    public final double getWeeklySalary() { return weeklySalary; }

    public final void setWeeklySalary(double w)
    {
        weeklySalary=w;
    }

    @Override

    public int earning() {
        return (int)Math.floor(4.0*weeklySalary);//向下取整再int
    }

    public String toString()
    {
        StringBuilder commision= new StringBuilder("");
        //commision.append(super.toString());
        //commision.append("\n周薪："+getWeeklySalary());
        commision.append("本月工资："+earning());
        return commision.toString();
    }
}
