package model;

import model.familyTree.FamilyTree;
import model.human.Human;
import model.save.WritableForFamilyTree;
import model.save.base.Writable;

public class FamilyTreeService {
    private WritableForFamilyTree writable;
    private FamilyTree<Human> activeTree;

    public FamilyTreeService(FamilyTree<Human> activeTree) {
        this.activeTree = activeTree;
    }

    public FamilyTreeService(){
        activeTree = new FamilyTree<>();
    }

    public boolean save(){
        if (writable == null){
            return false;
        }
        return writable.save(activeTree);
    }

    public boolean load(){
        if (writable == null){
            return false;
        }
        activeTree = writable.read();
        return true;
    }

    //TODO реализовать методы добавления нового человека
    public String addHuman(String name, String gender, String birthDate, String deathDate, String father, String mother){
        Human humanFather = null;
        if (!father.equals("")){
//            humanFather = activeTree.getByName(father);
        }
        if (humanFather == null){
            return "отец не найден";
        }
//        LocalDate humanBirthDate = LocalDate.parse(birthDate);
//        Human human = new Human();
//        activeTree.add(human);
        return "Человек успешно добавлен в дерево";
    }

    public void setWritable(WritableForFamilyTree writable) {
        this.writable = writable;
    }

    public void sortByName(){
        activeTree.sortByName();
    }

    public void sortByDeathDate(){
        activeTree.sortByDeathDate();
    }

    public String getHumanList() {
        return activeTree.getInfo();
    }
}
