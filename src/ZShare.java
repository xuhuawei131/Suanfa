public class ZShare {
    static final String contet="ABCDEFGHIJKLMNOPQRSTUVWXYZ123456789";
    public String convert(String s, int numRows) {
        if (numRows == 1) { // numRows为1时需要特判
            return s;
        }
        String res = "";
        int step = numRows - 1;
        for (int i = 0; i < numRows; i++) {
            int j = i;
            while (j < s.length()) {
                res += s.charAt(j);
                if (i == 0 || i == numRows - 1) { // 第一行和最后一行
                    j += 2 * step;
                } else { // 其它行
                    j += 2 * (step - j % step);
                    System.out.println("i="+i+" j="+j);
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        ZShare sharp=new ZShare();
        String content=sharp.convert(contet,4);
        System.out.println("content="+content);
    }
}
