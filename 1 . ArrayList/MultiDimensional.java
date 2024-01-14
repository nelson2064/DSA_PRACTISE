import java.util.*;

public class MultiDimensional {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(10);
        list.add(11);
        mainList.add(list);


        
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(4);
        list2.add(7);

        mainList.add(list2);

        System.out.println(mainList);


        for(int i = 0 ;i<mainList.size() ; i++){
            ArrayList<Integer> currList = mainList.get(i);
            for(int j = 0 ; j<currList.size() ; j++){
                System.out.print(currList.get(j) + " ");
            }

            System.out.println();
        }
    }
}
