import java.util.ArrayList;
import java.util.List;

public class IncludeSign {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        singleStr(result,"",0,0,n);
        return result;
    }

    private void singleStr(List<String> result, String str,int left, int right, int n){
        if (left == n && right == n) {
            result.add(str);
            System.out.println("@@@ left="+left+" right="+right+" str="+str);
        }

        if (left < n) {
            System.out.println("*** left="+left+" right="+right+" str="+str);
            singleStr(result,str + "(", left + 1,right,n);
        }
        if (right < left) {
            System.out.println("### left="+left+" right="+right+" str="+str);
            singleStr(result, str + ")", left, right+1,n);
        }
    }

    public static void main(String[] args) {
        IncludeSign includeSign=new IncludeSign();
        List<String> result=includeSign.generateParenthesis(3);
    }
}
