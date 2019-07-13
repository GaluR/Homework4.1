public class TriangleCheck {
    Triangle triangle;

    TriangleCheck(Triangle t){
        triangle = t;
    }
    boolean isRightTriangle (){
        boolean isFalse = triangle.doMultiply(triangle.side1)+ triangle.doMultiply(triangle.side2) != triangle.doMultiply(triangle.side3);
        return isFalse != true;
    }
}
