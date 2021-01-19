class Tree4 extends Library{
    {
        Tree tree = new Tree();
        int i = 0;
        arr = new char[3][4];
        for (int j = 0; j < 4; j++){
            arr[0][j] = ' ';
            arr[1][j] = 'C';
            arr[2][j] = ' ';
        }
        name = "Бутан";
        k = 0;
        tree.addNode(k, name, arr);
        while (f) {
            k++;
            i++;
            arr[0][i] = 'C';
            name = k + "метил" + name;
            tree.addNode(k, name, arr);
            if (i == arr[1].length - 1) {
                f = false;
            }
        }
        k = 0;
        f = true;
        name = "Бутан";
        i = 0;
        while (f) {
            k++;
            i++;
            arr[2][i] = 'C';
            name = k + "метил" + name;
            tree.addNode(k, name, arr);
            if (i == arr[1].length - 1) {
                f = false;
            }
        }
    }
}
