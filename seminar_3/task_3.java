package seminar_3;

import java.util.ArrayList;
import java.util.List;

// Создать список типа ArrayList<String>.
// Поместить в него как строки, так и целые числа.
// Пройти по списку, найти и удалить целые числа.

public class task_3 {
    public static ArrayList<String> AllInfo = new ArrayList<>();

    public static void main(String[] args) {
        FillListInfo();
    }

    public static void FillListInfo() {
        String[] fullPlanets = new String[] { "Earth", "Mars", "Mercury", "Venus", "Uranus", "Saturn", "Jupiter",
                "Neptun" };
        for (int i = 0; i < 15; i++) {
            if (i % 2 == 0)
                AllInfo.add(fullPlanets[(int) (Math.random() * fullPlanets.length)]);
            else
                AllInfo.add(Integer.toString((int) (Math.random() * 20)));
        }

        for (var el : AllInfo) {
            System.out.print(el + " ");
        }
        // Integer.parseInt(String item);

        List<String> ListWithoutNumber = new ArrayList<>();

        for (int i = 0; i < AllInfo.size(); i++) {
            try {
                Integer.parseInt((AllInfo.get(i)));
            } catch (NumberFormatException ex) {
                ListWithoutNumber.add(AllInfo.get(i));
            }
        }
        for (var el : ListWithoutNumber) {
            System.out.print(el+" ");
        }
    }
}
