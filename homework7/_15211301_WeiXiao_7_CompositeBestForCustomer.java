package homework7;

import java.util.HashSet;

public class _15211301_WeiXiao_7_CompositeBestForCustomer extends _15211301_WeiXiao_7_CompositeStrategy
{
    static final int MAX_TOTAL = 2015211301;

    /* The constructor method */
    public _15211301_WeiXiao_7_CompositeBestForCustomer(String[] list, HashSet<Integer> book, String ID, String name)
    {
        super(list, book, ID, name);
    }

    @Override
    public double getSubTotal(_15211301_WeiXiao_7_SaleLineitem item)
    {
        double best = MAX_TOTAL, temp;


        for (String name : strategies)
        {
            temp = _15211301_WeiXiao_7_PricingStrategyFactory.getInstance().getPricingStrategy(name).getSubTotal(item);
            best = best > temp ? temp: best;
        }
        return best;
    }

    @Override
    public String getType()
    {
        return "顾客最优策略";
    }

}

