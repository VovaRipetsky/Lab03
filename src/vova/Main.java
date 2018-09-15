package vova;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Rectangle rectangle = new Rectangle();
        try {
            rectangle.squareRectangle();
        } catch (Exception e){
            System.out.println("Error: 'a' and 'b' should be > 0");
        }
    }
}
