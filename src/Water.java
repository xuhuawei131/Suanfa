import java.util.ArrayList;

/**
 * 装水
 */
public class Water {
    ArrayList arrayList;
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        // 目前这个区间能装的水有多少
        int ret = min(height[left], height[right]) * (right - left);
        while (left < right) {
            if (height[left] < height[right]) {
                left++; // 此时left需要右移
            } else {
                right--; // 此时right需要左移
            }
            ret = max(ret, min(height[left],height[right]) * (right - left));
        }
        return ret;
    }
    public int max(int a, int b) {
        return a > b ? a : b;
    }
    public int min(int a, int b) {
        return a < b ? a : b;
    }

    public static void main(String[] args) {
        Water water=new Water();
        int array[]={1,8,6,2,5,4,8,3,7};
        int result=water.maxArea(array);
        System.out.println("result:"+result);
    }
}
