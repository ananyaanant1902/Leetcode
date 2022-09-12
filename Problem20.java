class Solution {
    public boolean isValid(String exp) {
      
        Deque<Character> stack=new ArrayDeque<Character>();
        for(int i=0;i<exp.length();i++){
            char currChar=exp.charAt(i);
            if(currChar=='('||currChar=='['||currChar=='{'){
                stack.push(currChar);
                continue;
            }
            if(stack.isEmpty()){
                return false;
            }
            char check=stack.pop();
            switch(currChar){
                case ')':
                    if(check=='['||check=='{'){
                        return false;
                    }
                    break;
                case ']':
                    if(check=='{'||check=='('){
                        return false;
                    }
                    break;

                case '}':
                    if(check=='('||check=='['){
                        return false;
                    }
                    break;
            }
        }
        return stack.isEmpty();
    

   
    }
}
