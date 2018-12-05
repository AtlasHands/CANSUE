import java.util.ArrayList;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        int hint = 5;
        int possibleNumbers[] = new int[]{1,2,3,4,5,7,9};
        int variables = 5;
        int permutationSet[] = new int[variables*possibleNumbers.length];
        int count = 0;
        for(int y = 0;y<possibleNumbers.length;y++){
            for(int x = 0;x<variables;x++){
                permutationSet[count] = possibleNumbers[y];
                count++;
            }
        }
        PermutationMaker permutationMaker = new PermutationMaker();
        permutationMaker.heapPermutation(permutationSet,permutationSet.length,variables);
        HashSet<Integer[]> permutations = permutationMaker.getPermutations();
        count = 0;
        for (Integer[] permutation : permutations) {
            count++;
           for(Integer index: permutation){

           }
        }
        System.out.println(count);
    }
}
