package test_1;
import java.util.HashSet;
import java.util.Set;

public class JewelsAndStones {

    public static void main(String[] args) {
        String jewels = "aA", stones = "aAAabbb";
        System.out.println(solve(jewels, stones));
    }

    public static int solve(String jew, String stones) {
        //1 ds
        Set<Character> set = new HashSet<>();

        //2 for while
        char[] charArr = jew.toCharArray();
        for(int i=0; i<charArr.length; i++) {
            set.add(charArr[i]); //a, A
        }

        int count = 0;
        char[] stoneArr = stones.toCharArray();
        for(int i=0; i<stoneArr.length; i++) {
            if(set.contains(stoneArr[i])) {
                count++;
            }
        }
        return count;
    }
}
