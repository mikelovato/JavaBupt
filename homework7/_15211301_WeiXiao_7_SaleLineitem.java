package homework7;

/**
 * Create by WeiXiao on 12/28/2017
 *
 *
 */

public class _15211301_WeiXiao_7_SaleLineitem {
    private int copies=0;
    private _15211301_WeiXiao_7_ProductSpecification prodSpec =null;
    private _15211301_WeiXiao_7_PricingStrategy strategy =null;

    public _15211301_WeiXiao_7_SaleLineitem(int c,_15211301_WeiXiao_7_ProductSpecification p,_15211301_WeiXiao_7_PricingStrategy s)
    {
        this.copies=c;
        this.prodSpec=p;
        this.strategy=s;
    }

    public int getCopies()
    {
        return copies;
    }

    public _15211301_WeiXiao_7_ProductSpecification getProdSpec()
    {
        return prodSpec;
    }

    public double getSubTotal()
    {
        return strategy.getSubTotal(this);
    }
}
