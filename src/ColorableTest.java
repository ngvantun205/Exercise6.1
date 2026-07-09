public class ColorableTest {
    public static void main(String[] args) {

        Shape[] shapes = {
                new Circle(2),
                new Rectangle(3, 4),
                new Square(5),
                new Circle(6),
                new Square(2.5)
        };

        for (Shape shape : shapes) {

            if (shape instanceof Circle) {
                Circle c = (Circle) shape;
                System.out.println("Circle area: " + c.getArea());

            } else if (shape instanceof Rectangle) {
                Rectangle r = (Rectangle) shape;
                System.out.println("Rectangle area: " + r.getArea());
            }

            if (shape instanceof Colorable) {
                ((Colorable) shape).howToColor();
            }

            System.out.println("----------------------");
        }
    }
}