class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left=1;
        int right=maxPile(piles);

        while(left<right){
            int mid=(left+right)/2;
            if(canEatAllBananas(piles,mid,h)){
                right=mid;
            }
            else{
                left=mid+1;
            }
        }
        return left;
    }
    public boolean canEatAllBananas(int piles[], int k, int h){
        int hours=0;
        for(int pile:piles){
            hours+=(pile-1)/k + 1;
            if(hours>h) return false;
        }
        return true;
    }
    public int maxPile(int piles[]){
        int max=0;
        for(int pile: piles){
            max=Math.max(max, pile);
        }
        return max;
    }
}