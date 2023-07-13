package view.comands;

import view.Console;

public class GetHumanList extends Command{

    public GetHumanList(Console console) {
        super(console, "Получить список");
    }

    @Override
    public void execute() {
        super.getConsole().getHumanList();;
    }
}
