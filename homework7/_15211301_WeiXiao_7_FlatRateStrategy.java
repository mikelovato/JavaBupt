package homework7;

import java.util.HashSet;

public class _15211301_WeiXiao_7_FlatRateStrategy extends _15211301_WeiXiao_7_PricingStrategy
{
    private double discountPerBook;

    public _15211301_WeiXiao_7_FlatRateStrategy(double d, HashSet<Integer> b,String i,String n)
    {
        super(b,i,n);
        discountPerBook=d;
    }

    public double getSubTotal(_15211301_WeiXiao_7_SaleLineitem i)
    {
        return i.getCopies()*(i.getProdSpec().getPrice()-discountPerBook);
    }

    public String getType()
    {
        return "绝对值优惠政策";
    }

    public String getPara()
    {
        return String.valueOf(discountPerBook);
    }
}
