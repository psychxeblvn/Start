public class Triangle extends Figure {

    private int sideA;
    private int sideB;
    private int sideC;

    private int perimetrTr;

    private int areaTr;

    public void perimeterOfTriangle(int sideA, int sideB, int sideC) {
        perimetrTr = sideA + sideB + sideC;
        System.out.printf("Периметр треугольника со сторонами %s,%s,%s равен %s", sideA, sideB, sideC, + perimetrTr);
    }

    public void AreaOfTriangle(int sideA, int sideB, int sideC) {
        areaTr = sideA * sideB / sideC; // чисто для примера формула, неправильная
        System.out.printf("Площадь треугольника со сторонами %s,%s,%s равна %s", sideA, sideB, sideC, + areaTr);
    }

}
