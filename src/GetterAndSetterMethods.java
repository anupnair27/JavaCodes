public class GetterAndSetterMethods {
    public static void main(String[] args) {
        RectangleR1 r = new RectangleR1();
        r.setLength(10);
        r.setBreadth(5);
        System.out.println("Length "+r.getLength());
        System.out.println("Breadth "+r.getBreadth());
        System.out.println("Area "+r.area());
    }
}
class RectangleR1{
    // the private keyword is used when we want to assign the property
    // to be not accessible outside the class.
    private int length;
    private int breadth;

    //getter method
    public int getLength(){
        return length;
    }
    public int getBreadth(){
        return breadth;
    }

    // setter method
    public void setLength(int l){
        if(l>=0){
           length = l;
        }else {
            length = 0;
        }
    }
    public void setBreadth(int b){
        if(b>=0){
            breadth = b;
        }else {
            breadth = 0;
        }
    }

    public int area(){
        return length * breadth;
    }
}