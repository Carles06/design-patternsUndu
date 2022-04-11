package com.kreitek.editor.commands;

import com.kreitek.editor.Caretaker;
import com.kreitek.editor.Command;
import com.kreitek.editor.ConsoleEditor;
import com.kreitek.editor.Memento;

import java.util.ArrayList;

public class UndoCommand implements Command {
  ConsoleEditor consoleEditor = new ConsoleEditor();
  Caretaker caretaker = new Caretaker();
    @Override
    public void execute(ArrayList<String> documentLines) {
        documentLines.clear();
        documentLines.addAll(consoleEditor.anyadirM(caretaker.get()));
       caretaker.get();
    }
}
