package Vorlesung;

public class AbstractGeometricFigures {
    abstract class Figure {
        public void draw() {
        }
    }

    abstract class Shape extends Figure {
    }

    class Square extends Shape {
        public void draw() {
            System.out.println("lang-breit-lang-breit");
        }
    }

    class Circle extends Shape {
        public void draw() {
            System.out.println("Einmal rundherum");
        }
    }

    class Point extends Figure {
        public void draw() {
            System.out.println("Punkt");
        }
    }

    public void test() {
        Figure figure = new Point();
        figure.draw();

        Figure figure1 = new Square();
        figure1.draw();

        Figure figure2 = new Circle();
        figure2.draw();
    }

    public static void main(String[] args) {
        new AbstractGeometricFigures().test();
    }
}
