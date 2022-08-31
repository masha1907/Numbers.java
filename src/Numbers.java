public class Numbers {

    public static void main(String[] args) {
        String string="1234567591010525";
        String ban="5";

        System.out.println(cutBanCharsFromString(string,ban));


    }
    public static String cutBanCharsFromString(String input, String banCharsString)    {
        String result="";
        for (int i = 0; i < input.length(); i++) {
            char ch=input.charAt(i);
            if(!isCharPresent(banCharsString,ch)) {
                result+=ch;
            }
        }
        return result;
    }



    public static boolean isCharPresent(String str, char ch) {
        for (int i = 0; i < str.length() ; i++) {
            if(str.charAt(i)==ch) {
                return true;
            }
        }
        return false;
    }
}
