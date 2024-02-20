public class Square extends Rectangle {

    public Square(int side) {
        this.side = side;
        AreaSq = side * side;
        System.out.println("Площать квадрата со сторонами " + side + " равна: " + AreaSq);
        perimetrSq = (side + side) * 2;
        System.out.println("Периметр квадрата со сторонами " + side + " квадрата равна: " + perimetrSq);
    }

    private int side;

    private int perimetrSq;

    private int AreaSq;

    public void AreaOfSquare(int side) {
        AreaSq = side * side;
        System.out.println("Площать квадрата со сторонами " + side + " равна: " + AreaSq);
    }

    public void perimeterOfSquare(int side) {
        perimetrSq = (side + side) * 2;
        System.out.println("Периметр квадрата со сторонами" + side + "квадрата равна: " + perimetrSq);

    }

}
