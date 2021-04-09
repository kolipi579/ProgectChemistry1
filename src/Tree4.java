class Tree4 extends Library{

     {
        int i = 0;
        arr = new char[5][5];
        for (int j = 0; j < 4; j++){
            arr[2][j] = 'C';
        }
        name = "Бутан";
        tree.root = new TreeNode(k, name, arr);
        int offset = 0;
        for (int k = 0; k < 2; k++){

        }







        /*while (f) {
            k++;
            i++;
            arr[0][i] = 'C';
            name = i + ((i == 1)?"":"ди") + name;
            tree.addNode(k, name, arr);
            if (i == 4) {
                f = false;
            }
        }
        k = 0;
        f = true;
        name = "Бутан";
        name = "Метил" + name;
        i = 0;
        while (f) {
            k--;
            i++;
            arr[2][i] = 'C';
            name = i + ((i == 1)?"":"ди") + name;
            tree.addNode(k, name, arr);
            if (i == arr[1].length - 2) {
                f = false;
            }
        }*/
    }
}
