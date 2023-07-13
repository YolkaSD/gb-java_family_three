package view.comands;

import view.Console;

public class Finish extends Command{
    public Finish(Console console) {
        super(console, "Завершить программу");
    }

    @Override
    public void execute() {
        super.getConsole().finish();
    }
}
