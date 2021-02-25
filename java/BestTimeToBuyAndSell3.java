package java;

// Suppose we only have 0 money at first
// The max if we've just sold 2nd stock so far.
// The max if we've just buy  2nd stock so far.
// The max if we've just sold 1nd stock so far.
// The max if we've just buy  1st stock so far. 
///Since release1 is initiated as 0, so release2 will always higher than release1.
public  class BestTimeToBuyAndSell3{
    public int maxProfit(int[] prices) {
        int hold1 = Integer.MIN_VALUE, hold2 = Integer.MIN_VALUE;
        int release1 = 0, release2 = 0;
        for(int i:prices){
            release2 = Math.max(release2, hold2+i);
            hold2    = Math.max(hold2,    release1-i);
            release1 = Math.max(release1, hold1+i);
            hold1    = Math.max(hold1,    -i);
        }
        return release2;
    }
}
