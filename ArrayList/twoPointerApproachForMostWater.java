import java.util.*;

public class twoPointerApproachForMostWater {

    public static int twoPointerApproachhh(ArrayList<Integer> height){
        int left = 0;
        int right = height.size()-1;
        int maxWaterr = Integer.MIN_VALUE;
        while(left < right){
            int ht = Math.min(height.get(left) , height.get(right));
            int width = right - left;
            int currWater = width * ht;
            maxWaterr = Math.max(currWater , maxWaterr);


            if(height.get(left) < height.get(right)){
                left++;
            }else{
                right--;
            }
          

        }

        return maxWaterr;
    }

    public static void main(String[] args) {
          ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

     System.out.print(twoPointerApproachhh(height));
    }



}
