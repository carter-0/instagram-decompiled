package X;

import java.util.BitSet;

/* renamed from: X.GOc  reason: case insensitive filesystem */
public final class C52334GOc extends C244113af {
    public 2V1 A00;
    public C52335GOd A01;
    public final BitSet A02;
    public final String[] A03 = {"content"};

    public C52334GOc(2V1 r3, C52335GOd gOd) {
        super(gOd, r3, 0);
        BitSet A0w = DbS.A0w(1);
        this.A02 = A0w;
        this.A01 = gOd;
        this.A00 = r3;
        A0w.clear();
    }

    public static void A01(C251263mp r3, C52334GOc gOc) {
        C251263mp A0E;
        C52335GOd gOd = gOc.A01;
        if (r3 == null) {
            A0E = null;
        } else {
            A0E = r3.A0E();
        }
        gOd.A07 = A0E;
        BitSet bitSet = gOc.A02;
        bitSet.set(0);
        C244113af.A00(bitSet, gOc.A03, 1);
        gOc.A02();
    }
}
