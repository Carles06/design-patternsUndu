package com.kreitek.editor;

import java.util.ArrayList;
import java.util.List;


public class Caretaker {

    static List <Memento> mementoList = new ArrayList<Memento>();

    public void add(Memento state){

        mementoList.add(state);
    }
   //recuperar estado
    public Memento get(){
        if (mementoList.size() > 0) {
            mementoList.remove(mementoList.size() - 1);
            if (mementoList.size() > 0) {
                Memento memento = mementoList.get(mementoList.size() - 1);

                return memento;
            }
        }
        return null;
    }
}
