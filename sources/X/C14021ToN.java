package X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X.ToN  reason: case insensitive filesystem */
public final class C14021ToN {
    public static C14021ToN A01;
    public static final VFT A02 = new Object();
    public final Map A00 = new HashMap();

    public static final synchronized C14021ToN A00() {
        C14021ToN toN;
        synchronized (C14021ToN.class) {
            synchronized (A02) {
                toN = A01;
                if (toN == null) {
                    toN = new C14021ToN();
                    A01 = toN;
                }
            }
        }
        return toN;
    }
}
