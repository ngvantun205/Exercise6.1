import java.util.Random;

public class ResizeableTest {
    public static void main(String[] args) {

        Shape[] shapes = {
                new Circle(5),
                new Rectangle(4, 6),
                new Square(3)
        };

        Random random = new Random();

        for (Shape shape : shapes) {

            double percent = random.nextInt(100) + 1;

            System.out.println("-------------------------");
            System.out.println(shape);

            if (shape instanceof Circle c) {

                System.out.println("Area before: " + c.getArea());

                c.resize(percent);

                System.out.println("Resize " + percent + "%");

                System.out.println("Area after : " + c.getArea());

            } else if (shape instanceof Rectangle r) {

                System.out.println("Area before: " + r.getArea());

                r.resize(percent);

                System.out.println("Resize " + percent + "%");

                System.out.println("Area after : " + r.getArea());
            }
        }
    }
}