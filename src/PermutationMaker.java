import java.util.ArrayList;
import java.util.HashSet;

public class PermutationMaker {
    //Generating permutation using Heap Algorithm
    private HashSet<Integer[]> permutation = new HashSet<>();
    void heapPermutation(int a[], int size, int n)
    {
        // if size becomes 1 then prints the obtained
        // permutation
        if (size == 1) {
            Integer actualPermuation[] = new Integer[n];
            for (int x = 0; x < n; x++) {
                actualPermuation[x] = a[x];
            }
            if(!permutation.contains(actualPermuation)){
                permutation.add(actualPermuation);
            }

        }
        for (int i=0; i<size; i++)
        {
            heapPermutation(a, size-1, n);

            // if size is odd, swap first and last
            // element
            if (size % 2 == 1)
            {
                int temp = a[0];
                a[0] = a[size-1];
                a[size-1] = temp;
            }

            // If size is even, swap ith and last
            // element
            else
            {
                int temp = a[i];
                a[i] = a[size-1];
                a[size-1] = temp;
            }
        }
    }
    public HashSet<Integer[]> getPermutations(){
        return permutation;
    }
}
