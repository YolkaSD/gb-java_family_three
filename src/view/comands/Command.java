package view.comands;

import view.Console;

public abstract class Command {
    private Console console;
    private String description;

    public Command(Console console, String description) {
        this.console = console;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public Console getConsole() {
        return console;
    }

    public abstract void execute();
}
