package X;

import java.util.BitSet;

/* renamed from: X.Gac  reason: case insensitive filesystem */
public final class C52664Gac extends C244113af {
    public 2V1 A00;
    public C52665Gad A01;
    public final BitSet A02;
    public final String[] A03 = {"section"};

    public C52664Gac(2V1 r3, C52665Gad gad) {
        super(gad, r3, 0);
        BitSet A0w = DbS.A0w(1);
        this.A02 = A0w;
        this.A01 = gad;
        this.A00 = r3;
        A0w.clear();
    }
}
