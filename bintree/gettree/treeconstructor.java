package Coding_Caprice.bintree.gettree;

public class treeconstructor {
    public static TreeNode buildTree(int[] nodes, int index){
        if (index >= nodes.length || nodes[index] == -1) {
            return null;
        }

        // 创建一个新的节点，值为数组中的当前元素
        TreeNode node = new TreeNode(nodes[index]);

        // 递归构建左子树和右子树
        node.left = buildTree(nodes, 2 * index + 1);
        node.right = buildTree(nodes, 2 * index + 2);

        return node;
    }
}
