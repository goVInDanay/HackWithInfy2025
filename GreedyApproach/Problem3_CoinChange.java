class Solution {
    public int coinChange(int[] coins, int amount) {
        Arrays.sort(coins);
        int count = 0;
        for(int i = coins.length - 1; i >= 0; i--){
            if(amount >= coins[i]){
                count += amount / coins[i];
                amount = amount % coins[i];
            }
        }
        if(amount != 0){
            return -1;
        }
        return count;
    }
}
