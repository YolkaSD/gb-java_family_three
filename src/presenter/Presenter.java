package presenter;

import model.FamilyTreeService;
import view.View;

public class Presenter {
    private View view;
    private FamilyTreeService service;

    public Presenter(View view) {
        service = new FamilyTreeService();
        this.view = view;
    }


    public void addHuman(String name, String gender, String dateBirth, String deathDate, String father, String mother) {
        String answer = service.addHuman(name, gender, dateBirth, deathDate, father, mother);
        view.print(answer);
    }

    public void getHumanList() {
        String answer = service.getHumanList();
        view.print(answer);
    }

    public void sortedByName() {
        String answer = service.sortByName();
        view.print(answer);
    }

    public void sortedByAge() {
        String answer = service.sortByDeath();
        view.print(answer);
    }
}
