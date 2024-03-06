package Observable;

import Observer.Display;

import java.util.ArrayList;
import java.util.List;

public class StockObservableImp implements Observable {
    private static List<Display> observerList = new ArrayList<>();

    private static int stockPrice;

    @Override
    public void add(Display display) {
        observerList.add(display);
    }

    @Override
    public void remove(Display display) {
        observerList.remove(display);
    }
    @Override
    public void notifyClients(){
        for (Display obj : observerList){
            obj.update();
        }
    }

    @Override
    public int getData() {
        System.out.println("        stock price updated to " + stockPrice);
        return stockPrice;
    }

    @Override
    public void setData(int i) {
        stockPrice = i;
        notifyClients();
    }
}
