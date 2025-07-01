import java.util.*;
class Solution {
    public int minRefuelStops(int target, int startFuel, int[][] stations) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int start = startFuel;
        int i = 0;
        int stops = 0;
        while(start < target){
            while(i < stations.length &&  stations[i][0] <= start){
                pq.offer(stations[i][1]);
                i++;
            }
            if(pq.isEmpty()){
                return -1;
            }
            start += pq.poll();
            stops++;
        }
        return stops;
    }
    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      int target = sc.nextInt();
      int startFuel = sc.nextInt();
      int n = sc.nextint();
      int stations[][] = new int[n][2];
      for(int i = 0; i < n; i++){
        stations[i][0] = sc.nextInt();
        stations[i][1] = sc.nextInt();
      }
      System.out.println(minRefuelStops(target, startFuel, stations));
    }
}
