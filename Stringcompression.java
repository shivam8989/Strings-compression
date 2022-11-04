package String;

public class Stringcompression {
    public static String compresson(String a){
        String n = " ";
        for(int i =0; i<a.length(); i++){
            Integer count = 1;
            while(i<a.length()-1 && a.charAt(i)==a.charAt(i+1)){
                count ++;
                i++;

            }
            n = n+a.charAt(i);
            if(count > 1){
                n = n + count.toString();
            }
        }
        return n;
    }
    public static void main(String [] args){
        String a = "aaabbcccdd";
        String b = "abcd";
        System.out.println(compresson(a));
        System.out.println(compresson(b));
    }
}
