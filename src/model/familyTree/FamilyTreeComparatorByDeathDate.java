package model.familyTree;

import java.util.Comparator;

public class FamilyTreeComparatorByDeathDate<T extends TreeNode> implements Comparator<T> {

    @Override
    public int compare(T o1, T o2) {
        if (o1.getDeathDate() == null && o2.getDeathDate() == null) {
            return 0;
        }
        return o1.getDeathDate().compareTo(o2.getDeathDate());
    }
}
