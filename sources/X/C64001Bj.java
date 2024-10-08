package X;

/* renamed from: X.1Bj  reason: invalid class name and case insensitive filesystem */
public final class C64001Bj {
    public final AnonymousClass1Bf A00;

    public final Integer A00(double d) {
        double d2 = (d * 8.0d) / 1000.0d;
        if (d2 < 0.0d) {
            return AnonymousClass05K.A00;
        }
        if (d2 < 3.0d) {
            return AnonymousClass05K.A01;
        }
        if (d2 < 8.0d) {
            return AnonymousClass05K.A0C;
        }
        if (d2 < 20.0d) {
            return AnonymousClass05K.A0N;
        }
        return AnonymousClass05K.A0Y;
    }

    public C64001Bj(AnonymousClass1Bf r1) {
        this.A00 = r1;
    }
}
