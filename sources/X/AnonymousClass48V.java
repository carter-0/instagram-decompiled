package X;

import java.math.BigInteger;
import java.util.Comparator;

/* renamed from: X.48V  reason: invalid class name */
public final class AnonymousClass48V extends 2Ed {
    public static final AnonymousClass48V A00 = new AnonymousClass48V();
    @Deprecated
    public static final Comparator A01 = AnonymousClass48W.A00;

    public AnonymousClass48V() {
        super("MINCURSOR", "MAXCURSOR", A01);
    }

    public static String A00(String str, boolean z) {
        if (str == null || !z || "MAXCURSOR".equals(str) || "MINCURSOR".equals(str)) {
            return (String) A00.A00;
        }
        return new BigInteger(str).add(BigInteger.ONE).toString();
    }

    public static String A01(String str, boolean z, boolean z2) {
        Object obj;
        if (str != null) {
            if (z && !"MAXCURSOR".equals(str) && !"MINCURSOR".equals(str)) {
                return new BigInteger(str).subtract(BigInteger.ONE).toString();
            }
            obj = A00.A01;
        } else {
            if (!z2) {
                obj = A00.A00;
            }
            obj = A00.A01;
        }
        return (String) obj;
    }
}
