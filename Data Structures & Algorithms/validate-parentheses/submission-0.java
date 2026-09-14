class Solution {
    public boolean isValid(String s) {
        Stack<Character>Stack = new Stack<>();

        for(int i=0;i<s.length;i++){
            char ch = s.charAt(i);  

            if(ch == '(' || ch='{' ||ch ='['){
                Stack.push(ch);
            }
            else{
                if(Stack.isEmpty()){
                    return false;
                }

                char top = Stack.peek();

                if ((ch == ')' && top == '(') ||
                    (ch == '}' && top == '{') ||
                    (ch == ']' && top == '[')){

                        Stack.pop();
                    }else{
                        return false;
                    }
            }
        }
        return Stack.isEmpty();
    }
}
