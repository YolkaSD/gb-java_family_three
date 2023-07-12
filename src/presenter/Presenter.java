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


//    public void addHuman(String name) {
//        String answer = service.addHuman(name);
//        view.print(answer);
//    }

    public void getHumanList() {
        String answer = service.getHumanList();
        view.print(answer);
    }
}
