public class ReverseString {
    static String reverse (String name){
        String temp ="";
        for (int i = name.length() -1; i >=0 ; i--) {
            temp = temp+name.charAt(i);
        }
        return temp;
    }
    public static void main(String args[]){
        String name ="anup";
        System.out.println(name+" "+reverse(name));
    }
}
