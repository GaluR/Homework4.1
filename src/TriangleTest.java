public class TriangleTest {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(4, 7, 5);
        TriangleCheck triangleCheck = new TriangleCheck();
        System.out.println(triangleCheck.isRightTriangle(triangle));
    }
}