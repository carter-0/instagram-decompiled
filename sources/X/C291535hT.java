package X;

/* renamed from: X.5hT  reason: invalid class name and case insensitive filesystem */
public abstract class C291535hT {
    public static final void A00(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            throw new IllegalArgumentException(002.A0n("both minLines ", " and maxLines ", " must be greater than zero", i, i2));
        } else if (i > i2) {
            throw new IllegalArgumentException(002.A02(i, i2, "minLines ", " must be less than or equal to maxLines "));
        }
    }
}
