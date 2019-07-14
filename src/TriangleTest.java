public class TriangleTest {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(4, 5, 3);
        TriangleCheck triangleCheck = new TriangleCheck();
        System.out.println(triangleCheck.isRightTriangle(triangle));
    }
}