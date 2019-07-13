public class TriangleTest {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(3, 4, 5);
        TriangleCheck triangleCheck = new TriangleCheck(triangle);
        System.out.println(triangleCheck.isRightTriangle());
    }
}