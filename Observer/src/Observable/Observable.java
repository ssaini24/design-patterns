package Observable;

import Observer.Display;

public interface Observable {
    void add(Display displayObj);
    void remove(Display displayObj);
    void notifyClients();
    int getData();
    void setData(int i);
}
