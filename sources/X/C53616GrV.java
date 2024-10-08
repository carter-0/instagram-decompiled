package X;

import java.util.BitSet;

/* renamed from: X.GrV  reason: case insensitive filesystem */
public final class C53616GrV extends C244113af {
    public 2V1 A00;
    public C54000Gxi A01;
    public final BitSet A02;
    public final String[] A03 = {"color"};

    public C53616GrV(2V1 r3, C54000Gxi gxi) {
        super(gxi, r3, 0);
        BitSet A0w = DbS.A0w(1);
        this.A02 = A0w;
        this.A01 = gxi;
        this.A00 = r3;
        A0w.clear();
    }

    public final C54000Gxi A0A() {
        C244113af.A00(this.A02, this.A03, 1);
        A02();
        return this.A01;
    }

    public final void A0B(int i) {
        this.A01.A00 = i;
        this.A02.set(0);
    }
}
