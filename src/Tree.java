import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Tree {

    TreeNode root;

    public void addNode(int key, String name, char[][] arr) {

        TreeNode newNode = new TreeNode(key, name, arr);

        if (root == null) {
            root = newNode;
        } else {
            TreeNode focusNode = root;
            TreeNode parent;
            while (true) {
                parent = focusNode;
                if (key < focusNode.key) {
                    focusNode = focusNode.leftChild;
                    if (focusNode == null) {
                        parent.leftChild = newNode;
                        return;
                    }
                } else {
                    focusNode = focusNode.rightChild;
                    if (focusNode == null) {
                        parent.rightChild = newNode;
                        return;
                    }
                }
            }
        }
    }

    public void inOrderTraverseTree(TreeNode focusNode) {
        if (focusNode != null) {
            inOrderTraverseTree(focusNode.leftChild);
            System.out.println(focusNode);
            inOrderTraverseTree(focusNode.rightChild);
            System.out.println(focusNode);
        }
    }

    public void preorderTraverseTree(TreeNode focusNode) {
        if (focusNode != null) {
            System.out.println(focusNode);
            preorderTraverseTree(focusNode.leftChild);
            preorderTraverseTree(focusNode.rightChild);
        }
    }

    public void postOrderTraverseTree(TreeNode focusNode) {
        if (focusNode != null) {
            postOrderTraverseTree(focusNode.leftChild);
            postOrderTraverseTree(focusNode.rightChild);
            System.out.println(focusNode);
        }
    }

    public TreeNode findNode(int key) {
        TreeNode focusNode = root;
        while (focusNode.key != key) {
            if (key < focusNode.key) {
                focusNode = focusNode.leftChild;
            } else {
                focusNode = focusNode.rightChild;
            }
            if (focusNode == null)
                return null;
        }
        return focusNode;
    }

    public void findNodeWithName(String name, TreeNode focusNode) throws FileNotFoundException {
        File file = new File("for2arr");
        PrintWriter fout = new PrintWriter(file);
        if (focusNode != null) {
            if (focusNode.name.equals(name)) {
                for (int i = 0; i < focusNode.arr.length; i++) {
                    fout.print(i);
                    fout.print(' ');
                    for (int j = 0; j < focusNode.arr[0].length; j++) {
                        fout.print(focusNode.arr[i][j]);
                    }
                    fout.println();
                }
            }
            //findNodeWithName(name,focusNode.leftChild);
            findNodeWithName(name, focusNode.rightChild);
        }
        fout.close();
    }

    public boolean remove(int key) {
        TreeNode focusNode = root;
        TreeNode parent = root;
        boolean isItALeftChild = true;
        while (focusNode.key != key) {
            parent = focusNode;
            if (key < focusNode.key) {
                isItALeftChild = true;
                focusNode = focusNode.leftChild;
            } else {
                isItALeftChild = false;
                focusNode = focusNode.rightChild;
            }
            if (focusNode == null) {
                return false;
            }
        }
        if (focusNode.leftChild == null && focusNode.rightChild == null) {
            if (focusNode == root) {
                root = null;
            } else {
                if (!isItALeftChild) {
                    parent.rightChild = null;
                } else {
                    parent.leftChild = null;
                }
            }
        } else {
            if (focusNode.rightChild == null) {
                if (focusNode != root) {
                    if (!isItALeftChild) {
                        parent.rightChild = focusNode.leftChild;
                    } else {
                        parent.leftChild = focusNode.leftChild;
                    }
                } else {
                    root = focusNode.leftChild;
                }
            } else {
                if (focusNode.leftChild == null) {
                    if (focusNode == root) {
                        root = focusNode.rightChild;
                    } else {
                        if (isItALeftChild) {
                            parent.leftChild = focusNode.rightChild;
                        } else {
                            parent.rightChild = focusNode.rightChild;
                        }
                    }
                } else {
                    TreeNode replacement = getReplacementNode(focusNode);
                    if (focusNode == root) {
                        root = replacement;
                    } else {
                        if (isItALeftChild) {
                            parent.leftChild = replacement;
                        } else {
                            parent.rightChild = replacement;
                            replacement.leftChild = focusNode.leftChild;
                        }
                    }
                }
            }
        }
        return true;
    }

    public TreeNode getReplacementNode(TreeNode replacedNode) {
        TreeNode replacementParent = replacedNode;
        TreeNode replacement = replacedNode;
        TreeNode focusNode = replacedNode.rightChild;
        while (focusNode != null) {
            replacementParent = replacement;
            replacement = focusNode;
            focusNode = focusNode.leftChild;
        }
        if (replacement != replacedNode.rightChild) {
            replacementParent.leftChild = replacement.rightChild;
            replacement.rightChild = replacedNode.rightChild;
        }
        return replacement;
    }

}

