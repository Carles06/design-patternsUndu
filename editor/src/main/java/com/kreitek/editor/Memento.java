package com.kreitek.editor;

import java.util.List;

public class Memento {
 private List <String> state;

    public Memento() {
    }

    public Memento(List<String> state) {
        this.state = state;
    }


    public List<String> getUndo(){
        return state;
    }
}
