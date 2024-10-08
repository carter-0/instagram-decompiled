package X;

public abstract class Q0A {
    public static Number A00(double d) {
        int i = (int) d;
        if (((double) i) == d) {
            return Integer.valueOf(i);
        }
        return Double.valueOf(d);
    }

    public static boolean A01(Object obj) {
        String obj2;
        if (obj instanceof Number) {
            if (((Number) obj).intValue() != 0) {
                return true;
            }
            return false;
        } else if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        } else {
            if (obj == null) {
                obj2 = "null";
            } else {
                obj2 = obj.toString();
            }
            throw new IllegalArgumentException(002.A0R("Expected Number or Boolean: ", obj2));
        }
    }
}
