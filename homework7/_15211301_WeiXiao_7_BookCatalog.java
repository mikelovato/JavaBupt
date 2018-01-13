package homework7;

import java.util.HashMap;

public class _15211301_WeiXiao_7_BookCatalog {
    HashMap<String,_15211301_WeiXiao_7_ProductSpecification> books= new HashMap<>();

    _15211301_WeiXiao_7_PricingStrategyFactory factory=_15211301_WeiXiao_7_PricingStrategyFactory.getInstance();

    public _15211301_WeiXiao_7_BookCatalog(){}


    public _15211301_WeiXiao_7_ProductSpecification add(_15211301_WeiXiao_7_ProductSpecification book)
    {
        books.put(book.getIsbn(),book);
        return book;
    }

    public _15211301_WeiXiao_7_ProductSpecification get(String Is)
    {
        return books.get(Is);
    }

    public String[][] getAllData()
    {
        int i=0;
        String[][] data=new String[books.size()][];

        for(_15211301_WeiXiao_7_ProductSpecification book:books.values()){
            data[i]=new String[]{
                    book.getIsbn(),
                    book.getTitle(),
                    _15211301_WeiXiao_7_ProductSpecification.toStr[book.getType()],
                    String.valueOf(book.getPrice()),
                    factory.getStrategyOfBook(book.getType()).getType()
            };
            i++;
        }

        return data;
    }
}
