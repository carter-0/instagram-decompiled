package X;

/* renamed from: X.GsQ  reason: case insensitive filesystem */
public final class C53673GsQ extends C251343mx {
    public final Integer A00;
    public final C62320sa A01;

    public final C251263mp A0X(AnonymousClass3Y5 r5) {
        boolean z;
        0qQ.A0B(r5, 0);
        int intValue = this.A00.intValue();
        if (intValue == 0) {
            z = true;
        } else if (intValue == 1) {
            z = false;
        } else if (intValue == 2) {
            z = AnonymousClass3HA.A00(C243803a8.A00(r5));
        } else {
            throw AnonymousClass7TE.A1K();
        }
        return new C382079d7((C251263mp) this.A01.invoke(), DbW.A1b(C59535JNh.class, AnonymousClass3Zw.A00(r5, new GKL(0, r5, z), C51968G9o.A1b(z))), (0eP[]) null);
    }

    public C53673GsQ(Integer num, C62320sa r2) {
        this.A00 = num;
        this.A01 = r2;
    }
}
