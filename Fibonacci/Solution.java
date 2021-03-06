class Solution {
    /**
     * @param n: an integer
     * @return an integer f(n)
     */
    public int fibonacci(int n) {
        // write your code here
        if(n == 1) return 0;
        int f = 0, g = 1;
        for(int i=3; i<=n; i++) {
            g = g + f;
            f = g - f;
        }
        
        return g;
    }
}

