//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Figure figure = new Figure();
        Rectangle rectangle = new Rectangle();
        Square square = new Square(10);
        Triangle triangle = new Triangle();


        square.perimeterOfSquare(10);
        square.AreaOfSquare(10);
        triangle.perimeterOfTriangle(10,10,10);
        triangle.AreaOfTriangle(10,10,10);
    }
}