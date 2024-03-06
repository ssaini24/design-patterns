package Observer;

import Observable.Observable;

public class TV implements Display {

    Observable obj;

    public TV(Observable toBeObserved){
        this.obj = toBeObserved;
    }

    @Override
    public void update(){
        System.out.println("TV getting update for: ");
        this.obj.getData();
    }
}
