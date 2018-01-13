package homework7;

import java.util.ArrayList;

public class _15211301_WeiXiao_7_Sale implements _15211301_WeiXiao_7_Subject

{
    /* The data field */
    private ArrayList<_15211301_WeiXiao_7_SaleLineitem> items = new ArrayList<>();

    /* The observer pattern */
    ArrayList<_15211301_WeiXiao_7_Observer> observers = new ArrayList<>();


    public _15211301_WeiXiao_7_Sale() {}

    /* The shopping method */
    public _15211301_WeiXiao_7_SaleLineitem add(_15211301_WeiXiao_7_SaleLineitem item)
    {
        items.add(item);
        notifyObservers();
        return item;
    }

    public double getTotal()
    {
        double temp = 0;
        for (_15211301_WeiXiao_7_SaleLineitem item : items)
            temp += item.getSubTotal();
        return temp;
    }

    public String[][] getCartInfo()
    {
        String[][] temp = new String[items.size()][];

        for (int i = 0; i < items.size(); i++)
        {
            _15211301_WeiXiao_7_SaleLineitem item = items.get(i);
            double oldPrice = item.getCopies() * item.getProdSpec().getPrice();
            double discount = oldPrice - item.getSubTotal();

            temp[i] = new String[]{
                    items.get(i).getProdSpec().getTitle(),
                    String.valueOf(items.get(i).getCopies()),
                    String.valueOf(oldPrice),
                    String.valueOf(discount)
            };
        }

        return temp;
    }

    /* The Subject method */
    @Override
    public void registerObserver(_15211301_WeiXiao_7_Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(_15211301_WeiXiao_7_Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (_15211301_WeiXiao_7_Observer observer : observers) {
            observer.update(this);
        }
    }
}
