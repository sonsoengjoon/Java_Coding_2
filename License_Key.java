package test_1;

import java.util.Locale;

public class License_Key {
    public static void main(String[] args) {
        // 정수 k 값이 주어지면 첫번째 그룹은 숫자가 적어도 되지만 뒤에서부턴 k크기의 그룹으로 나눠야한다.
        // 그룹과 그룹 사이에는 '-'로 구분한다. + 대분자로 만들기

        // 문제풀이
        // 일단 '-'를 제외한 총 문자수를 구한다.
        // k로 나눈다. -- k로 문자열을 나누고 나눈 문자열 사이 대쉬를 넣는다?
        //
        //String str = "8F3Z-2e-9-w";
        String str = "8F3Z-2e-9-wabcdef";
        int k = 2;
        System.out.println(solve(str, k));
    }

    public static String solve(String str, int k) {
        //-를 지우기
        String NewStr = str.replace("-", "");

        //소문자를 대문자로 바꾸기
        NewStr = NewStr.toUpperCase();

        // k로 파싱하기, 그리고 - 넣기
        StringBuilder sb = new StringBuilder(NewStr);
        // 8F3Z2E9W
        int len = sb.length();
        for(int i=k; i<len; i=i+k) {
            sb.insert(len-i, '-');

        }
        return sb.toString();
    }
}
