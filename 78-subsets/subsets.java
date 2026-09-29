class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Calculate(result, new ArrayList<>(), nums, 0);
        return result;
    }

    public void Calculate(List<List<Integer>> result, List<Integer> temp,int[] nums, int start)
    {
        result.add(new ArrayList<>(temp));
        int n = nums.length;
        for(int i = start; i < n; i++)
        {
            temp.add(nums[i]);
            Calculate(result, temp, nums, i + 1);
            temp.remove(temp.size() - 1);
            

        }
    }
}