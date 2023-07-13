package model;

import model.familyTree.FamilyTree;
import model.human.Gender;
import model.human.Human;
import model.save.FileHandlerForFamilyTree;
import model.save.WritableForFamilyTree;

import java.time.LocalDate;
import java.util.List;

public class FamilyTreeService {
    private WritableForFamilyTree writable;
    private FamilyTree<Human> activeTree;

    public FamilyTreeService(FamilyTree<Human> activeTree) {
        this.activeTree = activeTree;
    }

    public FamilyTreeService() {
        load();
        this.setWritable(new FileHandlerForFamilyTree());
        activeTree = writable.read();
    }

    public boolean save() {
        if (writable == null) {
            return false;
        }
        return writable.save(activeTree);
    }

    public boolean load() {
        if (writable == null) {
            return false;
        }
        activeTree = writable.read();
        return true;
    }

    //TODO реализовать методы добавления нового человека
    public String addHuman(String name, String gender, String birthDate, String deathDate, String father, String mother) {
        Human humanFather = null;
        Human humanMother = null;

        List<Human> fatherList = activeTree.getByName(father);
        List<Human> motherList = activeTree.getByName(mother);

        if (!father.equals("") && !fatherList.isEmpty()) {
            humanFather = activeTree.getByName(father).get(0);
        }

        if (!mother.equals("") && !motherList.isEmpty()) {
            humanMother = activeTree.getByName(father).get(0);
        }

        //LocalDate humanBirthDate = LocalDate.parse(birthDate);
        //LocalDate humanDeathDate = LocalDate.parse(deathDate);

        Human human = new Human(name, Gender.Male, LocalDate.of(0, 1, 1));
        activeTree.add(human);

        return "Человек добавлен";
    }

    public void setWritable(WritableForFamilyTree writable) {
        this.writable = writable;
    }

    public String sortByName() {
        activeTree.sortByName();
        return "Список отсортирован по имени: " + getHumanList();
    }

    public void sortByDeathDate() {
        activeTree.sortByDeathDate();
    }

    public String getHumanList() {
        return activeTree.getInfo();
    }

    public String sortByDeath() {
        activeTree.sortByDeathDate();
        return "Список отсортирован по дате смерти: " + getHumanList();
    }
}
