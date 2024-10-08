package X;

/* renamed from: X.PiS  reason: case insensitive filesystem */
public final class C73705PiS extends 0Yg implements C62320sa {
    public static final C73705PiS A00 = new C73705PiS();

    public C73705PiS() {
        super(0);
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        double d;
        AnonymousClass0eM r2 = O55.A00;
        if (DbX.A07(r2) > 480) {
            d = 4.0d;
        } else if (DbX.A07(r2) > 320) {
            d = 3.0d;
        } else if (DbX.A07(r2) > 240) {
            d = 2.0d;
        } else if (DbX.A07(r2) > 160) {
            d = 1.5d;
        } else {
            d = 1.0d;
        }
        return Double.valueOf(d);
    }
}
