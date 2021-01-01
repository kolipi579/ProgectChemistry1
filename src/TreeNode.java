class TreeNode {
    int key;
    String name;
    String[] arr;
    int n;

    TreeNode leftChild;
    TreeNode rightChild;

    TreeNode(int key, String name, int n, String[] arr) {
        this.key = key;
        this.name = name;
        this.n = n;
        this.arr = new String[n];
        for (int i = 0;i<n;i++){
            this.arr[i] = arr[i];
        }

    }

    @Override
    public String toString() {
        return name;
    }
}
