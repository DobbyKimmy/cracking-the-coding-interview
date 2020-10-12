package question2_CheckPermutation;

public class Method3 {
    // 使用位运算
    public boolean CheckPermutation(String s1, String s2) {
        char[] chars1 = s1.toCharArray();
        char[] chars2 = s2.toCharArray();

        if(chars1.length != chars2.length){
            return false;
        }

        // 高64位
        long high = 0;
        // 低64位
        long low = 0;

        for(int i = 0;i < chars1.length;i++){
            if(chars1[i] >= 64){
                long chars1BitIndex  = 1L << (chars1[i] - 64);
                high += chars1BitIndex;
            }else{
                long chars1BitIndex = 1L << (chars1[i]);
                low += chars1BitIndex;
            }

            if(chars2[i] >= 64){
                long chars2BitIndex  = 1L << (chars2[i] - 64);
                high -= chars2BitIndex;
            }else{
                long chars2BitIndex = 1L << (chars2[i]);
                low -= chars2BitIndex;
            }
        }
        return high == 0 && low == 0;
    }
}
