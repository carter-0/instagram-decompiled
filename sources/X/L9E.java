package X;

public abstract class L9E {
    public final float A00;
    public final 1Xj A01;
    public final String A02;
    public final String A03;
    public final boolean A04;

    public L9E(1Xj r2, String str, String str2) {
        1Xj r0;
        0qQ.A0B(str2, 2);
        this.A02 = str;
        this.A03 = str2;
        if (r2.A5F()) {
            r0 = r2.A1c(0);
            if (r0 == null) {
                throw AnonymousClass7TE.A0y();
            }
        } else {
            r0 = r2;
        }
        this.A01 = r0;
        this.A04 = r2.CeS();
        this.A00 = 1.0f;
    }
}
