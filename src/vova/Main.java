package vova;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //First task
        Rectangle rectangle = new Rectangle();
        try {
            rectangle.squareRectangle();
        } catch (Exception e){
            System.out.println("Error: 'a' and 'b' should be > 0");
        }


        //Second task
        Plants[] arrayOfPlants = new Plants[5];
        for(int i=0; i<5; i++){
            arrayOfPlants[i] = new Plants(5, Plants.Color.Green, Plants.Type.Mosses );
        }
        for(Plants plant :arrayOfPlants){
        System.out.println(plant.type + "  " + plant.color);
        }


    }
}
