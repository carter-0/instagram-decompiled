package X;

import java.util.BitSet;

/* renamed from: X.GrU  reason: case insensitive filesystem */
public final class C53615GrU extends C244113af {
    public C53993Gxb A00;
    public 2V1 A01;
    public final BitSet A02;
    public final String[] A03 = {"color", "diameter"};

    public C53615GrU(C53993Gxb gxb, 2V1 r5) {
        super(gxb, r5, 0);
        BitSet A0w = DbS.A0w(2);
        this.A02 = A0w;
        this.A00 = gxb;
        this.A01 = r5;
        A0w.clear();
    }

    public final void A0A(float f) {
        this.A00.A01 = this.A02.A00(f);
        this.A02.set(1);
    }
}
