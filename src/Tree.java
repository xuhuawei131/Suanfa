import java.util.Arrays;
import java.util.Collections;

public class Tree {

    public static void main(String[] args) {
        int x[]={1,7,4,8,5};
        Arrays.sort(x);
        int temp=0;
        for (int i = 1; i <x.length ; i++) {
            int value=x[i]-x[i-1];
            if (value>temp){
                temp=value;
            }
        }
        System.out.println(temp);

    }
}
