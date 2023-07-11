package HWork3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class task3_2 {
    public static void main(String[] args) {
        List<String> planetList = new ArrayList<>();
        planetList.add("Меркурий");
        planetList.add("Венера");
        planetList.add("Земля");
        planetList.add("Марс");
        planetList.add("Земля");
        planetList.add("Юпитер");
        planetList.add("Сатурн");
        planetList.add("Уран");
        planetList.add("Нептун");
        planetList.add("Плутон");
        planetList.add("Марс");

        System.out.println("Список планет до удаления дубликатов:");
        System.out.println(planetList);

        Set<String> uniquePlanets = new HashSet<>(planetList);
        planetList.clear();
        planetList.addAll(uniquePlanets);

        System.out.println("Список планет после удаления дубликатов:");
        System.out.println(planetList);
    }
}
