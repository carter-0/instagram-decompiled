package X;

public abstract class SA1 {
    public static boolean A00(Object obj, Object obj2) {
        return A01(obj, obj2);
    }

    public static boolean A01(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }
}
