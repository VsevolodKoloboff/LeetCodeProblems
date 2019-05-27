package ToLowerCase_709;
/*
* leetCode
* Implement function ToLowerCase() that has a string parameter str, and returns the same string in lowercase.
 */

public class Solution {
    public String toLowerCase(String str){
        StringBuilder strB =new StringBuilder(str);
        for (int i=0;i<strB.length();i++) {
            if (strB.charAt(i)>64&&strB.charAt(i)<92)
                strB.setCharAt(i, (char) (strB.charAt(i)+32));

        }
        return strB.toString();
    }

}
