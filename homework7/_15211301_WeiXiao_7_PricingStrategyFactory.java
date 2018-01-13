package homework7;

import java.util.HashSet;

public class _15211301_WeiXiao_7_PricingStrategyFactory {
    private static _15211301_WeiXiao_7_PricingStrategyFactory instrance;

    private _15211301_WeiXiao_7_StrategyCatalog catalog;

    private _15211301_WeiXiao_7_PricingStrategyFactory()
    {
        catalog = new _15211301_WeiXiao_7_StrategyCatalog();
    }

    static public _15211301_WeiXiao_7_PricingStrategyFactory getInstance()
    {
        if(null==instrance)
            instrance= new _15211301_WeiXiao_7_PricingStrategyFactory();
        return instrance;
    }

    public _15211301_WeiXiao_7_PricingStrategy getStrategyOfBook(int ty)
    {
        return catalog.getStrategyOfBook(ty);
    }

    public _15211301_WeiXiao_7_PricingStrategy getPricingStrategy(String ID)
    {
        return catalog.get(ID);
    }

    public _15211301_WeiXiao_7_PricingStrategy removePricingStrategy(String ID)
    {
        return catalog.remove(ID);
    }

    public String[][] getAllStratetiesInfo()
    {
        return catalog.getAllData();
    }

    public _15211301_WeiXiao_7_PricingStrategy createPricingStrategy(int t,Object p,HashSet<Integer> b, String I, String n)
        throws Exception
    {
        if(catalog.get(I)!=null)
            throw new Exception("一存在想通编号的策略");

        for(int j:b)
            if(!catalog.getStrategyOfBook(j).getType().equals("无优惠"))
                throw new Exception(_15211301_WeiXiao_7_ProductSpecification.toStr[j]+"已被绑定！");

        _15211301_WeiXiao_7_PricingStrategy temp=null;

        switch (t)
        {
            case _15211301_WeiXiao_7_IPricingStrategy.FlatRate:
                temp=catalog.add(new _15211301_WeiXiao_7_FlatRateStrategy(Double.parseDouble(p.toString()),b,I,n));
                break;

            case _15211301_WeiXiao_7_IPricingStrategy.Percentage:
                temp=catalog.add(new _15211301_WeiXiao_7_PercentageStrategy(Integer.parseInt(p.toString()),b,I,n));
                break;

            case _15211301_WeiXiao_7_IPricingStrategy.Composit:
                String[] list=p.toString().split("\\|");
                for(String stra:list)
                    if(catalog.get(stra)==null) throw new Exception("输入的简单策略编号无效！");
                temp=catalog.add(new _15211301_WeiXiao_7_CompositeBestForCustomer(list,b,I,n));
                break;

            case _15211301_WeiXiao_7_IPricingStrategy.NoDiscount:
                 temp=catalog.add(new _15211301_WeiXiao_7_NoDiscountStrategy());

                 default:
                     return null;
        }
        if(temp==null)
            throw new Exception("参数无效！");
        return temp;
    }

}
