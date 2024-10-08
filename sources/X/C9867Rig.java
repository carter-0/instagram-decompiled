package X;

/* renamed from: X.Rig  reason: case insensitive filesystem */
public abstract class C9867Rig {
    public static String A00() {
        if (!"true".equals(System.getProperty("is_e2e_testing"))) {
            return null;
        }
        return System.getProperty("fb.e2e.DOGFOOD_CARRIER_ID");
    }
}
