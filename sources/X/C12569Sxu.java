package X;

/* renamed from: X.Sxu  reason: case insensitive filesystem */
public final class C12569Sxu implements C13640Te7 {
    public static final C13640Te7 A02 = C12570Sxv.A00;
    public Object A00;
    public volatile C13640Te7 A01;

    public final Object FP1() {
        C13640Te7 te7 = this.A01;
        C13640Te7 te72 = A02;
        if (te7 != te72) {
            synchronized (this) {
                if (this.A01 != te72) {
                    Object FP1 = this.A01.FP1();
                    this.A00 = FP1;
                    this.A01 = te72;
                    return FP1;
                }
            }
        }
        return this.A00;
    }

    public final String toString() {
        Object obj = this.A01;
        if (obj == A02) {
            obj = 002.A0g("<supplier that returned ", String.valueOf(this.A00), ">");
        }
        return 002.A0g("Suppliers.memoize(", String.valueOf(obj), ")");
    }
}
