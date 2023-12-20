//public class Triangle {
//
//    public enum Triangles {equilateral, isosceles, scalene, invalid}
//
//    Triangle categorise(int x, int y, int x) {
//        if (x > 0 && y > 0 && z > 0 &&
//                x + y >= z && x + z >= y && y + z >= x) {
//            if (x == y)
//                if (y == z) return equilateral;
//                else return isosceles;
//            else if (y == z) return isosceles;
//            else if (x == z) return isosceles;
//            else return scalene;
//        } else return invalid;
//    }
//
//}

public class Triangle {
    public String categorise(int x, int y, int z)
    {
        if (x > 0 && y > 0 && z > 0 && x + y >= z && x + z >= y && y + z >= x) {
            if (x == y) {
                if (y == z) {
                    return "equilateral";
                } else {
                    return "isosceles";
                }
            } else if (y == z) {
                return "isosceles";
            } else if (x == z) {
                return "isosceles";
            } else {
                return "scalene";
            }
        } else {
            return "invalid";
        }
    }


}
