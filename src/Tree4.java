public class Tree4 extends Library {

    {
        int i = 0;
        arr = new char[5][5];
        for (int j = 0; j < 4; j++) {
            arr[2][j] = 'C';
        }
        name = "Бутан";
        tree.addNode(0, name, arr);
        int offset = 0;
        for (int k = 0; k < 2; k++) {
            AddRadicals radicals = new AddRadicals();
            arr = radicals.AddRadUp(arr, 1, k + 1);
            name = radicals.AddName(name, 0);
            tree.addNode(k + 2, name, arr);
        }

    }

    public char[][] findWithName(String name) {
        char[][] arr = new char[tree.findNodeWithName(name, tree.root).length][tree.findNodeWithName(name, tree.root)[0].length];
        for (int i = 0; i < tree.findNodeWithName(name, tree.root).length; i++) {
            for (int j = 0; j < tree.findNodeWithName(name, tree.root)[0].length; j++) {
                arr[i][j] = tree.findNodeWithName(name, tree.root)[i][j];
            }
        }
        return arr;
    }
}
