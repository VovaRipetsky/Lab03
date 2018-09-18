package vova;

/**
 * Created by Vova on 16.09.2018.
 */
public class Plants {

    protected int size;
    protected enum Color{
             GREEN{
                 @Override
                 public String toString(){
                     return "The color is Green";
                 }
          },
             RED{
                 @Override
                 public String toString(){
                     return "The color is Red";
                 }
          },
             BLUE{
                 @Override
                 public String toString(){
                     return "The color is Blue";
                 }
             }
    }
    protected enum Type{
        LIVERWORTS{
            @Override
            public String toString(){
                return "The type is Liverworts";
            }
        },
        MOSSES{
            @Override
            public String toString(){
                return "The type is Mosses";
            }
        },
        FERNS{
            @Override
            public String toString(){
                return "The type is Ferns";
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
