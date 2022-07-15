package cats;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {

        System.out.println("Cast members for the role:" + "\n" + getListOfCat() + "\n");

        System.out.println("""
                List of cats after selection for the role:
                - "black cats", going to filming "Black cat" to Odessa
                - "red cats", go to the shooting of the cartoon "Garfield" to Holliwood
                - who did not pass "by color", going home""");
        List<Cat> list = newCity();
        System.out.println(list);
    }

    // здесь создаем объекты "коты" и сразу добавляем их в общий для всех котов список
    public static List<Cat> getListOfCat() {
        List<Cat> catList = new ArrayList<>();
        catList.add(new Cat("Dnepr", "Yellow", "Tomas"));
        catList.add(new Cat("Harkiv", "Black", "Bobby"));
        catList.add(new Cat("Poltava", "White", "Dusya"));
        catList.add(new Cat("Lviv", "Yellow", "Murzik"));
        catList.add(new Cat("Uzgorod", "Black", "Phillip"));
        catList.add(new Cat("Poltava", "Gray", "Kitty"));
        return catList;
    }

    // в этом методе у котов меняется город, в зависимости от их цвета
    public static List<Cat> newCity() {
        List<Cat> newCity = getListOfCat();
        for (Cat cat : newCity) {
            if (Objects.equals(cat.getColour(), "Black")) {
                cat.setCity("Odessa");
            } else if (Objects.equals(cat.getColour(), "Yellow")) {
                cat.setCity("New York");
            }
        }
        return newCity;
    }
}