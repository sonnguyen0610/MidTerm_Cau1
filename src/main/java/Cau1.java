public class Cau1 {
    
    public String printUppercaseString(String s){

        String res = "";
        for (int i = 0; i < s.length(); i++) {
            res=res+Character.toUpperCase(s.charAt(i));
        }
        return res;
    }
    public int countUpperString(String s){
        int count=0;
        for (int i = 0; i < s.length(); i++) {
            if(Character.isUpperCase(s.charAt(i))){
              count++;
            }
        }
        return count;
    }
//    public String formatString(String s){
//        String res="";
//        String cau="";
//        String [] tachCau=s.split(".");
//        for (int i = 0; i < tachCau.length; i++) {
//            for (int j = 0; j < tachCau[i].length(); j++) {
//                cau+=Character.toUpperCase(tachCau[i].charAt(0));
//            }
//            res+=cau;
//        }
//        return res;
//    }
}
