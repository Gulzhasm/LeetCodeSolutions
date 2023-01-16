package me.decentos.leetcode.tree;

import me.decentos.leetcode.util.TreeNode;

public class E104MaxDepth {

    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        return Math.max(left, right) + 1;
    }
}
