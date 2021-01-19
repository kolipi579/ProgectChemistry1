class TreeNode {
    int key;
    String name;
    char[][] arr;

    TreeNode leftChild;
    TreeNode rightChild;

    TreeNode(int key, String name, char[][] arr) {
        this.key = key;
        this.name = name;
        this.arr = new char[arr.length][arr[0].length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                this.arr[i][j] = arr[i][j];
            }
        }

    }

    @Override
    public String toString() {
        return name;
    }
}
