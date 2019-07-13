public class TriangleTest {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(4, 6, 7);
        TriangleCheck triangleCheck = new TriangleCheck(triangle);
        System.out.println(triangleCheck.isRightTriangle());
    }
}