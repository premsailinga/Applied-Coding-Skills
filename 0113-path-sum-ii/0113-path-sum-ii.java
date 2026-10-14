class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> result = new ArrayList<>();
        findPath(root, targetSum, new ArrayList<>(), result);
        return result;
    }

    public void findPath(TreeNode root, int sum, List<Integer> path,
                         List<List<Integer>> result) {
        if (root == null) {
            return;
        }

        path.add(root.val);
        sum = sum - root.val;

        if (root.left == null && root.right == null && sum == 0) {
            result.add(new ArrayList<>(path));
        } else {
            findPath(root.left, sum, path, result);
            findPath(root.right, sum, path, result);
        }

        path.remove(path.size() - 1);
    }
}