package X;

import java.util.BitSet;

/* renamed from: X.GrR  reason: case insensitive filesystem */
public final class C53612GrR extends C244113af {
    public C53997Gxf A00;
    public 2V1 A01;
    public final BitSet A02;
    public final String[] A03 = {"fadeTransitionMs", "photoTransitionMs"};

    public C53612GrR(C53997Gxf gxf, 2V1 r5) {
        super(gxf, r5, 0);
        BitSet A0w = DbS.A0w(2);
        this.A02 = A0w;
        this.A00 = gxf;
        this.A01 = r5;
        A0w.clear();
    }
}
