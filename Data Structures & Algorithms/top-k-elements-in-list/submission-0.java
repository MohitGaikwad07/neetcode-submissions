class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        HashSet<Integer> used = new HashSet<>();
        int[] ans = new int [k];
        for(int i=0;i<k;i++){
            int maxFreq = 0;
            int maxNum = 0;
            for(int num:map.keySet()){
                if(!used.contains(num) && maxFreq>map.get(num)){
                    maxFreq = map.get(num);
                    maxNum = num;
                }

            }
            ans[i]=maxNum;
            used.add(maxNum);
        }
        return ans;
    }
}
