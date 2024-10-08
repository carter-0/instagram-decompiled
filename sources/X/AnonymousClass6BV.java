package X;

/* renamed from: X.6BV  reason: invalid class name */
public abstract class AnonymousClass6BV {
    public static final void A00(int i, int i2) {
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(002.A02(i, i2, "index: ", ", size: "));
        }
    }

    public static final void A01(int i, int i2) {
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(002.A02(i, i2, "index: ", ", size: "));
        }
    }

    public static final void A02(int i, int i2, int i3) {
        String A00 = AnonymousClass000.A00(3164);
        if (i < 0 || i2 > i3) {
            throw new IndexOutOfBoundsException(002.A0p(A00, AnonymousClass000.A00(2049), ", size: ", i, i2, i3));
        } else if (i > i2) {
            throw new IllegalArgumentException(002.A02(i, i2, A00, AnonymousClass000.A00(1979)));
        }
    }
}
