package X;

/* renamed from: X.HcK  reason: case insensitive filesystem */
public abstract class C55111HcK {
    public static void A00(16F r2, C54073Gyx gyx, String str) {
        String A1P;
        if ("more_available".equals(str)) {
            r2.A0d();
        } else if ("next_max_id".equals(str)) {
            if (r2.A11() == 16L.A0G) {
                A1P = null;
            } else {
                A1P = r2.A1P();
            }
            0qQ.A0B(A1P, 0);
            gyx.A01 = A1P;
        } else {
            1XY.A01(r2, gyx, str);
        }
    }
}
