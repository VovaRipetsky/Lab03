package vova;

/**
 * Created by Vova on 16.09.2018.
 */
public class Plants {

    private int size;
    private enum Color{
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
    private enum Type{
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


}
