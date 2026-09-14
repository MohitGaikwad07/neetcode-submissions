class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length()!=t.length()) return false;

        char[]arr1=s.toCharArray();
        char[]arr2=s.toCharArray();

        for(int i=0;i<arr1.length;i++){
            if(arr[i]!=arr2[i]) return false
        }
        return true;
    }
}
