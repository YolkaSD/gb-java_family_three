package view.comands;

import view.Console;

public class SortedByDeath extends Command{
    public SortedByDeath(Console console) {
        super(console, "Отсортировать по дате смерти");
    }

    @Override
    public void execute() {
        super.getConsole().sortedByAge();
    }
}
