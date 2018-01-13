package homework7;

public class _15211301_WeiXiao_7_NoDiscountStrategy extends _15211301_WeiXiao_7_PricingStrategy
{

    public double getSubTotal(_15211301_WeiXiao_7_SaleLineitem item)
    {
        return item.getCopies() * item.getProdSpec().getPrice();
    }

    public String getType()
    {
        return "无优惠";
    }

    public String getPara()
    {
        return "null";
    }
}
