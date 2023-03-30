import jdk.jshell.Snippet;

public class Main {

    public static void main(String[] args) {
        System.out.println(polindrom("Victor"));

    }
    public static boolean polindrom (String text){
        String str1 = text.toUpperCase().replaceAll("[0-9]","");
        StringBuffer str2 = new StringBuffer(str1).reverse();
        boolean prov = true;
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)){
                prov = false;
                break;
            }
        }
        return prov;
    }
}

