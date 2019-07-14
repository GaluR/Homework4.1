public class TriangleCheck {

    boolean isRightTriangle (Triangle triangle){

            boolean isRectangular1 = !(doMultiply(triangle.side1) + doMultiply(triangle.side2) != doMultiply(triangle.side3));
            boolean isRectangular2 = !(doMultiply(triangle.side3) + doMultiply(triangle.side2) != doMultiply(triangle.side1));
            boolean isRectangular3 = !(doMultiply(triangle.side1) + doMultiply(triangle.side3) != doMultiply(triangle.side2));
            return isRectangular1 || isRectangular2 || isRectangular3;
    }

    double doMultiply(double a){
        return a*a;
    }

}
