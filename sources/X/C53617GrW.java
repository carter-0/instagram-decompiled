package X;

import java.util.BitSet;

/* renamed from: X.GrW  reason: case insensitive filesystem */
public final class C53617GrW extends C244113af {
    public 2V1 A00;
    public GY5 A01;
    public final BitSet A02;
    public final String[] A03 = {"host", "parseResult"};

    public C53617GrW(2V1 r4, GY5 gy5) {
        super(gy5, r4, 0);
        BitSet A0w = DbS.A0w(2);
        this.A02 = A0w;
        this.A01 = gy5;
        this.A00 = r4;
        A0w.clear();
    }

    public final GY5 A0A() {
        C244113af.A00(this.A02, this.A03, 2);
        A02();
        return this.A01;
    }

    public final void A0B(C3034368u r3) {
        this.A01.A01 = r3;
        this.A02.set(1);
    }

    public final void A0C(C229392nJ r3) {
        this.A01.A02 = r3;
        this.A02.set(0);
    }
}
