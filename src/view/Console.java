package view;

import model.human.Gender;
import presenter.Presenter;

import java.util.Scanner;

public class Console implements View {
    private Presenter presenter;
    private Scanner scanner;
    private Menu menu;

    private boolean isWork;

    public Console() {
        presenter = new Presenter(this);
        scanner = new Scanner(System.in);
        menu = new Menu(this);
        isWork = true;
    }

    @Override
    public void print(String text) {
        System.out.println(text);
    }

    @Override
    public void start() {
        while (isWork){
            System.out.println(menu.print());
            String choice = scanner.nextLine();
            menu.execute(choice);
        }
    }

    public void addHuman(){
        //getHumanList();
        System.out.println("Введите имя человека");
        String name = scanner.nextLine();
        System.out.println("Выберете пол: ");
        String gender = scanner.nextLine();
        System.out.println("Введите дату рождения: ");
        String birthDate = scanner.nextLine();
        System.out.println("Введите дату смерти: ");
        String deathDate = scanner.nextLine();
        System.out.println("Введите папу: ");
        String father = scanner.nextLine();
        System.out.println("Введите маму: ");
        String mother = scanner.nextLine();
        presenter.addHuman(name, gender, birthDate, deathDate, father, mother);

    }

    public void getHumanList(){
        presenter.getHumanList();
    }

    public void finish() {
        isWork = false;
    }

    public void sortedByName() {
        presenter.sortedByName();
    }

    public void sortedByAge() {
        presenter.sortedByAge();
    }
}
