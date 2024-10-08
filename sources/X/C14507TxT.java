package X;

/* renamed from: X.TxT  reason: case insensitive filesystem */
public final class C14507TxT {
    public static final C14507TxT A02 = new C14507TxT(AnonymousClass05K.A0C, 1.0E21f);
    public final float A00;
    public final Integer A01;

    public final String toString() {
        int intValue = this.A01.intValue();
        if (intValue == 0) {
            return Float.toString(this.A00);
        }
        if (intValue != 1) {
            return "auto";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.A00);
        return AnonymousClass7TF.A0l("%", sb);
    }

    public C14507TxT(Integer num, float f) {
        this.A00 = f;
        this.A01 = num;
    }
}
