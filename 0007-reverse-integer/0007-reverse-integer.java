class Solution {
    public int reverse(int x) {

        int reverse = 0;
        int n = x;

        while(n!=0){
            int rem = n %10;

            if (reverse > Integer.MAX_VALUE / 10 ||
            (reverse == Integer.MAX_VALUE / 10 && rem > 7)) {
            return 0;            }

            // Check underflow
            if (reverse < Integer.MIN_VALUE / 10 ||
                (reverse == Integer.MIN_VALUE / 10 && rem < -8)) {
                return 0;
            }
            
            reverse = (reverse*10)+rem;
            n = n/10;

            
        }
        

        return reverse;

        
    }
}