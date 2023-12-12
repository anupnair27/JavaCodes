public class StringsInJava {
    public static void main(String args[]){

// passing a character array into a string str
//       char c []  ={'a','b','c'};
//       String str = new String(c);
//       System.out.println(str);

        String str1 = "JAVA";
        String str2 = "      java        ";
        String str3 ="K";
// some of the string methods in java

        int length = str1.length(); // length of string returns an integer datatype
        String strlower = str1.toLowerCase(); // changes the string characters to lower
        String strupper = str1.toUpperCase(); // changes the string characters to upper
        String trim = str2.trim();

//        System.out.println(length + strlower + strupper + trim);


        System.out.println(str3.matches("."));



    }
}
