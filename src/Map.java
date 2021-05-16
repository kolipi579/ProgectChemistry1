import java.util.HashMap;

public class Map {

    HashMap<String, char[][]> map;
    String name;

    {
        map = new HashMap<>(8);
        char[][] chars = new char[5][5];
        for (int j = 0; j < 5; j++) {
            for (int l = 0; l < 5; l++) {
               chars[j][l] = ' ';
            }
        }
        for (int j = 0; j < 3; j++) {
            chars[2][j] = 'C';
        }
        name = "Пропан";
        map.put(name, chars);
        for (int g = 0; g < 1; g++) {
            AddRadicals radicals = new AddRadicals();
            char[][] arr = radicals.AddRadUp(chars, 1, 1);
            name = radicals.AddName(name, 0);
            map.put(name, arr);
        }
        char[][] chars1 = new char[5][5];
        for (int j = 0; j < 5; j++) {
            for (int l = 0; l < 5; l++) {
                chars1[j][l] = ' ';
            }
        }
        for (int j = 0; j < 4; j++) {
            chars1[2][j] = 'C';
        }
        name = "Бутан";
        map.put(name, chars1);
        int offset = 0;
        for (int g = 0; g < 2; g++) {
            AddRadicals radicals = new AddRadicals();
            char[][] arr1 = new char[5][5];
            if (offset < g) {
                arr1 = radicals.AddRadUp(chars1, 1, offset + 1);
            }
            name = radicals.AddName(name, 0);
            map.put(name, arr1);
        }
        char[][] chars2 = new char[5][5];
        for (int j = 0; j < 5; j++) {
            for (int l = 0; l < 5; l++) {
                chars2[j][l] = ' ';
            }
        }
        for (int j = 0; j < 5; j++) {
            chars2[2][j] = 'C';
        }
        name = "Пентан";
        map.put(name, chars);
        offset = 0;
        for (int g = 0; g < 3; g++) {
            char[][] arr3 = new char[5][5];
            AddRadicals radicals = new AddRadicals();
            if (offset < g) {
                arr3 = radicals.AddRadUp(chars2, 1, offset + 1);
            }
            name = radicals.AddName(name, 0);
            map.put(name, arr3);
        }
    }

}
