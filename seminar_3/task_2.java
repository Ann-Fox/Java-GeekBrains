package seminar_3;

/* Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями.
Вывести название каждой планеты и количество его повторений в списке. */
import java.util.ArrayList;
import java.util.List;

public class task_2 {

    public static List<String> planets = new ArrayList<>();
    public static List<String> AllInfo = new ArrayList<>();

    public static void main(String[] args) {
        FillPlanets();
    }

    public static void FillPlanets() {
        String[] fullPlanets = new String[] { "Earth", "Mars", "Mercury", "Venus", "Uranus", "Saturn", "Jupiter",
                "Neptun" };

        for (int i = 0; i < 15; i++) {
            planets.add(fullPlanets[(int) (Math.random() * fullPlanets.length)]);
        }

        for (var el : planets) {
            System.out.print(el + " ");
        }

        System.out.println("");

        // List<String> names = new ArrayList<>();
        for (int i = 0; i < fullPlanets.length; i++) {
            String onePlanet = fullPlanets[i];
            int count = 0;
            for (int k = 0; k < planets.size(); k++) {
                if (onePlanet.equals(planets.get(k))) {
                    count += 1;
                }
            }
            System.out.println(onePlanet + "\t " + count);
        }

        // Вывести название каждой планеты и количество его повторений в списке.
        // for (int i = 0; i < planets.size() - 1; i++) {
        //     // for (int j = 0; j < planets.size(); j++) {
        //     if (planets.get(i).equals(planets.get(i + 1))) {
        //         planets.remove(i + 1);
        //     }
        // }
        // }

        List<String> UniquePlanets = new ArrayList<>();

        for (int i = 0; i < planets.size(); i++) {
            if (UniquePlanets.indexOf(planets.get(i)) == -1) {
                UniquePlanets.add(planets.get(i));
            }
        }

        for (var el : UniquePlanets) {
            System.out.print(el + " ");
        }
    }
}
