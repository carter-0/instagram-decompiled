package X;

public abstract class Q06 {
    public static boolean A00(Object obj, Object obj2) {
        if (obj == null) {
            if (obj2 != null) {
                return false;
            }
            return true;
        } else if (obj.equals(obj2)) {
            return true;
        } else {
            return false;
        }
    }
}
