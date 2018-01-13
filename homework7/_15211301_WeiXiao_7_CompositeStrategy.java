package homework7;

import java.util.HashSet;
import java.util.ArrayList;

abstract public class _15211301_WeiXiao_7_CompositeStrategy extends _15211301_WeiXiao_7_PricingStrategy
{
    /* The data field */
    protected ArrayList<String> strategies = new ArrayList<String>();

    /* The constructor method */
    public _15211301_WeiXiao_7_CompositeStrategy() {}
    public _15211301_WeiXiao_7_CompositeStrategy(String[] list, HashSet<Integer> book, String ID, String name)
    {
        super(book, ID, name);
        for (String stra : list)
            strategies.add(stra);
    }

    /* The controller method */
    public void add(String name) { strategies.add(name); }

    @Override
    public String getPara() { return String.join(",", strategies); }
}
