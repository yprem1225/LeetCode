class Solution {
    public boolean isPalindrome(int x) {
        int n = x;
        int reverse =0;
        boolean isPalindrome= false;
        if( x>=0){
            while(n!=0){
                int rem = n % 10;
                reverse = (reverse * 10)+ rem;
                n = n/10; 
            }

            if(reverse == x){
                isPalindrome = true;
            }
        }
        
        return isPalindrome;
    }
}