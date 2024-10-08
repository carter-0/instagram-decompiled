package X;

/* renamed from: X.SPk  reason: case insensitive filesystem */
public abstract class C11367SPk {
    public static final int A00(int i, boolean z) {
        int i2 = i * 31;
        int i3 = 1237;
        if (z) {
            i3 = 1231;
        }
        return i2 + i3;
    }

    public static int A01(Object obj) {
        return A02(obj, 1);
    }

    public static final int A02(Object obj, int i) {
        return (i * 31) + C51971G9r.A0E(obj);
    }

    public static final void A03(Object obj, String str) {
        if (obj == null) {
            throw AnonymousClass7TE.A11(002.A0R(str, " is null"));
        }
    }
}
