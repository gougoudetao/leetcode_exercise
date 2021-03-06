package com.example.demo.exercise;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yubang
 * @date 2019/12/14 3:03 下午
 */
public class No102BinaryTreeLevelOrderTraversal {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    private void preOrderTravel(TreeNode root, int level, List<List<Integer>> results) {
        if (root == null) {
            return;
        }
        if (results.size() < (level + 1)) {
            List<Integer> newList = new ArrayList<>();
            newList.add(root.val);
            results.add(newList);
        } else {
            results.get(level).add(root.val);
        }
        if (root.left != null) {
            preOrderTravel(root.left, level + 1, results);
        }
        if (root.right != null) {
            preOrderTravel(root.right, level + 1, results);
        }
    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> results = new ArrayList<>();
        preOrderTravel(root, 0, results);
        return results;
    }
}
