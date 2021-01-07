class TreeNode {
    int key;
    String name;
    char[][] arr;
    int n;
    int g;

    TreeNode leftChild;
    TreeNode rightChild;

    TreeNode(int key, String name, int n,int g, char arr[][]) {
        this.key = key;
        this.name = name;
        this.n = n;
        this.g = g;
        this.arr = new char[n][g];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < g; j++) {
                this.arr[i][j] = arr[i][j];
            }
        }

    }

    @Override
    public String toString() {
        return name;
    }
}
