import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Tree3 extends Library {

    {
        int i = 0;
        arr = new char[5][5];
        for (int j = 0; j < 5; j++) {
            for (int l = 0; l < 5; l++) {
                arr[j][l] = ' ';
            }
        }
        for (int j = 0; j < 3; j++) {
            arr[2][j] = 'C';
        }
        name = "Пропан";
        tree.addNode(0, name, arr);
        int offset = 0;
        StringBuilder shortname = new StringBuilder();
        for (int k = 0; k < 1; k++) {
            AddRadicals radicals = new AddRadicals();
            arr = radicals.AddRadUp(arr, 1, 1);
            name = radicals.AddName(name, 0);
            tree.addNode(k + 2, name, arr);
        }

    }

    public char[][] findWithName(String name) throws FileNotFoundException {
        tree.findNodeWithName(name, tree.root);
        Scanner fout = new Scanner(new File("for2arr"));
        char[][] arr = new char[5][5];
        int i = 0;
        String s;
        while (fout.hasNext()) {
            if (fout.hasNextInt()) {
                i = fout.nextInt();
            } else {
                s = fout.nextLine();
                char[] chars = s.toCharArray();
                for (int j = 0; j < 5; j++) {
                    arr[i][j] = chars[j + 1];
                }
            }
        }

        fout.close();
        return arr;
    }
}
