package view.comands;

import view.Console;

public class AddHuman extends Command {
    public AddHuman(Console console) {
        super(console, "Добавить человека");
    }

    @Override
    public void execute() {
        super.getConsole().addHuman();
    }
}
