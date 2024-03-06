package Observer;

import Observable.Observable;

public class Phone implements Display {

    Observable obj;

    public Phone(Observable toBeObserved){
        this.obj = toBeObserved;
    }
    @Override
    public void update(){
        System.out.println("cellphone getting update for :");
        obj.getData();
    }
}

