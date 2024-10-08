package X;

/* renamed from: X.VwM  reason: case insensitive filesystem */
public abstract class C18664VwM {
    public static final void A00(int i, int i2) {
        if (i < 0 || i >= i2) {
            throw C51969G9p.A0p("index: ", ", size: ", i, i2);
        }
    }

    public static final void A01(int i, int i2) {
        if (i < 0 || i > i2) {
            throw C51969G9p.A0p("index: ", ", size: ", i, i2);
        }
    }

    public static final void A02(int i, int i2, int i3) {
        String A00 = AnonymousClass000.A00(3164);
        if (i < 0 || i2 > i3) {
            throw new IndexOutOfBoundsException(002.A0p(A00, AnonymousClass000.A00(2049), ", size: ", i, i2, i3));
        } else if (i > i2) {
            throw C51971G9r.A0l(A00, AnonymousClass000.A00(1979), i, i2);
        }
    }
}
