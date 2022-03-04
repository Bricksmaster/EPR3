package Vorlesung;

public class GeometricFigures {
    class Figure{
        String name;

        public void draw() {
        }
    }

    class Shape extends Figure{
    }
    class Square extends Shape{
        public void draw(){
            System.out.println("lang-breit-lang-breit");
        }
    }
    class Circle extends Shape{
        public void draw() {
            System.out.println("Einmal rundherum");
        }
    }

    class Point extends Figure{
        public void draw(){
            System.out.println("Punkt");
        }
    }

    public void test(){
        Figure figure = new Point();
        figure.draw();
    }

    public static void main(String[] args) {
        new GeometricFigures().test();
    }
    }
