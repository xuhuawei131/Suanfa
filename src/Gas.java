import java.util.Arrays;

public class Gas {

    public static int getMaxTime(int A[],int x,int y,int z){
        int[] leftOil={x,y,z};
        int[] cast={0,0,0};
        int K=3;
        for (int i = 0; i <A.length ; i++) {
            int startIndex=getMiniValueIndex(cast);
            int count=0;
            for (int j = 0; j < K; j++) {
                int idx=(startIndex+j)%K;
                if (A[i]<=leftOil[idx]){
                    if (i == A.length-1){
                        return cast[idx];
                    }
                    cast[idx] += A[i];
                    leftOil[idx] -= A[i];
                    break;
                }else{
                    count += 1;
                    if (count == K){
                        return -1;
                    }
                }
            }
        }
        return -1;
    }

    public static int getMiniValueIndex(int array[]){
        int miniValueIndex=0;
        for (int i = 1; i < array.length; i++) {
            if (array[miniValueIndex]>array[i]){
                miniValueIndex=i;
            }
        }
        return miniValueIndex;
    }

    public static String arrayToString(int array[]){
        StringBuffer sb=new StringBuffer();
        sb.append("[");
        for (int i = 0; i <array.length ; i++) {
            sb.append(i).append(",");
        }
        sb.append("]");
        return sb.toString();
    }
    public static void main(String[] args) {
       int value1= getMaxTime(new int[]{2,8,4,3,2}, 7, 11, 3);
        int value= getMaxTime(new int[]{2,8,3,3,2}, 7, 11, 3);
        System.out.println(value);
    }
}
