package homework7;

/**
 * Create by WeiXiao on 12/28/2017
 * 书本包含的信息有：书的isbn号、书名、单价、
 * 书的类型：1.非教材类计算机图书、2.教材类图书、3.连环画类图书、4.养生类图书、5.其他
 */
public class _15211301_WeiXiao_7_ProductSpecification {

    private String Title=null;
    private String Isbn=null;
    private double Price=0;
    private int Type= NoExist;
    //默认数据，如果不构造直接检测type就好

    //无参数构造函数
    public _15211301_WeiXiao_7_ProductSpecification() { }
    //带参数构造函数
    public _15211301_WeiXiao_7_ProductSpecification(String i,double p,String t,int e)
    {
        this.Title=t;
        this.Isbn=i;
        this.Price=p;
        this.Type=e;
    }

    public String getIsbn()
    {
        return Isbn;
    }

    public java.lang.String getTitle() {
        return Title;
    }

    public double getPrice() {
        return Price;
    }

    public int getType() {
        return Type;
    }

    static public final int NoExist=-1;//构造函数默认，代表不存在
    static public final int NoComputerBook=0;//非计算机类教材图书
    static public final int TextBook=1;//教材类
    static public final int ComicBook=2;//连环画
    static public final int DietBook=3;//养身图书
    static public final int Other=4;//其他
    static public final String[] toStr={"非教材类计算机图书","教材类图书","教材类图书","养生类图书","其他"};
}
