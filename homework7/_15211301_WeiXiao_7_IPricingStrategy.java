package homework7;

public interface  _15211301_WeiXiao_7_IPricingStrategy
{
    int FlatRate = 0;//按每本优惠x元的策略
    int Percentage = 1;//按百分比进行优惠的策略。
    int Composit = 2;//复合优惠的策略
    int NoDiscount = 3;//不进行优惠的策略

    double getSubTotal(_15211301_WeiXiao_7_SaleLineitem item);
}
