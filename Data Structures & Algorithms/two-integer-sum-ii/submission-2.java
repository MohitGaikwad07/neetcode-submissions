class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n = numbers.length;
        int i=0;
        int j=n-1;
        
        //Brute force
        // for(int i=0;i<n-1;i++){
        //     for(int j=i+1;j<n;j++){
        //         if((numbers[i]+numbers[j]==target)){
        //             return new int[] {i+1,j+1}; 
        //         } 
        //     }
        // }
        // return new int[] {}; 
        while(i<j){
            sum=numbers[i]+numbers[j];
            if(target==sum) return new int[]{i+1,j+1};
            else if(sum>target) j--;
            else i++;
        }
        return new int[]{};

    }
}
