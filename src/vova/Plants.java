package vova;

/**
 * Created by Vova on 16.09.2018.
 */
public class Plants {

    protected int size;
    protected enum Color{
             Green{
                 @Override
                 public String toString(){
                     return "The color of the plant is Green";
                 }
          },
             Red{
                 @Override
                 public String toString(){
                     return "The color of the plant is Red";
                 }
          },
             Blue{
                 @Override
                 public String toString(){
                     return "The color of the plant is Blue";
                 }
             }
    }
    protected enum Type{
        Liverworts{
            @Override
            public String toString(){
                return "The type of the plant is Liverworts";
            }
        },
        Mosses{
            @Override
            public String toString(){
                return "The type of the plant is Mosses";
            }
        },
        Ferns{
            @Override
            public String toString(){
                return "The type of the plant is Ferns";
            }
        }
    }
    private Color color;
    private Type type;
    public Plants(int size, Color color, Type type){
        this.size = size;
        this.color = color;
        this.type = type;

    }
    public Plants(int size){}

    public Color getColor() {
        return color;
    }

    public Type getType() {
        return type;
    }

    public static void  testException(int size) throws MyException{

        if(size == 5){

            throw new MyException("FUUUUCK");
        }
    }
    public static void  testRuntimeException(int size){

        if(size == 5){

            throw new MyRuntimeException();
        }
    }
}
