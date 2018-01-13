package homework7;

import java.util.HashMap;

/**
 * Create by WeiXiao.
 * 2017.12.28
 *
 */

public class _15211301_WeiXiao_7_StrategyCatalog {

    public static final String[] ToStr = {"绝对值优化策略","百分比优惠策略","顾客优化策略"};
    //

    private HashMap<String,_15211301_WeiXiao_7_PricingStrategy> strategis= new HashMap<>();

    public _15211301_WeiXiao_7_StrategyCatalog()
    {
        //构造访问
    }

    public _15211301_WeiXiao_7_PricingStrategy get(String ID)
    {
        return strategis.get(ID);
    }

    public _15211301_WeiXiao_7_PricingStrategy remove(String ID)
    {
        return strategis.remove(ID);
    }

    public int size()
    {
        return strategis.size();
    }

    public _15211301_WeiXiao_7_PricingStrategy add(_15211301_WeiXiao_7_PricingStrategy st)
    {
        strategis.put(st.getID(),st);
        return st;
    }

    public String[][] getAllData()
    {
        int i=0;
        String[][] data=new String[strategis.size()][];

        for(_15211301_WeiXiao_7_PricingStrategy stra:strategis.values())
        {
            data[i]=new String[]{
                stra.getID(),
                    stra.getName(),
                    stra.getType(),
                    stra.getBookTypes(),
                    stra.getPara()
            };

            i++;
        }

        return data;
    }

    public _15211301_WeiXiao_7_PricingStrategy getStrategyOfBook(int type)
    {
        for(_15211301_WeiXiao_7_PricingStrategy st:strategis.values())
        {
            if(st.containBook(type))
                return st;
        }

        return new _15211301_WeiXiao_7_NoDiscountStrategy();
    }
}
