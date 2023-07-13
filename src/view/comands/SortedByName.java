package view.comands;

import view.Console;

public class SortedByName extends Command{
    public SortedByName(Console console) {
        super(console, "Отсортировать по имени");
    }

    @Override
    public void execute() {
        super.getConsole().sortedByName();
    }
}
