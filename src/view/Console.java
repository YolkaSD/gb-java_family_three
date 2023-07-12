package view;

import presenter.Presenter;

import java.util.Scanner;

public class Console implements View {
    private Presenter presenter;
    private Scanner scanner;
    private Menu menu;

    public Console() {
        presenter = new Presenter(this);
        scanner = new Scanner(System.in);
        menu = new Menu(this);
    }

    @Override
    public void print(String text) {
        System.out.println(text);
    }

    @Override
    public void start() {
        while (true){
            System.out.println(menu.print());
            String choice = scanner.nextLine();
            menu.execute(choice);
        }
    }

//    public void addHuman(){
//        getHumanList();
//        System.out.println("Введите имя человека");
//        String name = scanner.nextLine();
//        presenter.addHuman(name);
//    }

    public void getHumanList(){
        presenter.getHumanList();
    }
}
