public class Cau1 {

//    public String printUppercaseString(String s) {
//
//        String res = "";
//        for (int i = 0; i < s.length(); i++) {
//            res = res + Character.toUpperCase(s.charAt(i));
//        }
//        return res;
//    }

    public int countUpperString(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isUpperCase(s.charAt(i))) {
                count++;
            }
        }
        return count;
    }

    public String upperFisrtChar(String s) {
        String[] str = s.split("\\s+");
        String res = "";
        for (int i = 0; i < str.length; i++) {
            res += str[i].substring(0, 1).toUpperCase();
            res += str[i].substring(1) + " ";
        }
        return res;
    }

    public String formatString(String s) {
        char[] chars = s.toCharArray();
        String res = "";

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '.') {
                chars[i + 2] = Character.toUpperCase(chars[i + 2]);
            }
            res += chars[i];
        }
        return res;
    }
}
