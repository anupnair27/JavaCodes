public class ValidateMethod {
    static boolean validate(String name){
        return name.matches("[a-zA-Z\\s]+");
    }

    static boolean validate(int age){
        if (age>=18 && age<= 50){
            return true;
        } else{
            return false;
        }
    }
    public static void main(String args[]){

        int age = 61;
        String name = "amoosoTTTTosososp";
        System.out.println(validate(name));
    }
}
