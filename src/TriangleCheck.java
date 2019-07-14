public class TriangleCheck {

    boolean isRightTriangle (Triangle triangle){
        if(triangle.longestSide3 > triangle.side1 && triangle.longestSide3 > triangle.side2) {
            boolean isFalse = doMultiply(triangle.side1) + doMultiply(triangle.side2) != doMultiply(triangle.longestSide3);
            return isFalse!=true;
        }
        else{
            System.out.println("Złe dane. Najdłuższy bok trójkąta proszę wpisać jako ostatnią wartość!");
        }
        return false;
    }

    double doMultiply(double a){
        return a*a;
    }

}
