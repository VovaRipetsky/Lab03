package vova;

import java.awt.*;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //First task
   /*     Rectangle rectangle = new Rectangle();
        try {
            rectangle.squareRectangle();
        } catch (Exception e){
            System.out.println("Error: 'a' and 'b' should be > 0");
        }


        //Second task     */
        Plants[] arrayOfPlants = new Plants[5];
        for(int i=0; i<5; i++){
            arrayOfPlants[i] = new Plants(5, Plants.Color.valueOf("RED"), Plants.Type.MOSSES);
            System.out.println(arrayOfPlants[i].getColor());
        }
        try {
            Plants.testException(5);
        } catch (MyException e1){System.out.println(e1);}

        Plants.Color[] color = Plants.Color.values();
        for (Plants.Color s : color) { System.out.println(s); }

       // Plants.testRuntimeException(5);

        Plants.Type[] type = Plants.Type.values();
        for (Plants.Type s : type) { System.out.println(s); }



    }
}
