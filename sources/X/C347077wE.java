package X;

/* renamed from: X.7wE  reason: invalid class name and case insensitive filesystem */
public abstract class C347077wE {
    public static final C347087wF[] A00;
    public static final C347087wF[] A01;
    public static final C347087wF[] A02 = {C347087wF.A0B, C347087wF.A0A, C347087wF.A0C, C347087wF.A08};
    public static final C347087wF[] A03;

    public static final C347087wF[] A00(int i) {
        C347087wF[] r1;
        C347087wF r0;
        if (i == 2) {
            r1 = new C347087wF[2];
            r1[0] = C347087wF.A0F;
            r0 = C347087wF.A0E;
        } else if (i == 3) {
            r1 = new C347087wF[2];
            r1[0] = C347087wF.A09;
            r0 = C347087wF.A0D;
        } else if (i == 4) {
            r1 = new C347087wF[2];
            r1[0] = C347087wF.A0H;
            r0 = C347087wF.A0B;
        } else if (i == 5) {
            r1 = new C347087wF[2];
            r1[0] = C347087wF.A08;
            r0 = C347087wF.A0A;
        } else if (i == 6) {
            r1 = new C347087wF[2];
            r1[0] = C347087wF.A0G;
            r0 = C347087wF.A0C;
        } else {
            throw new UnsupportedOperationException(002.A0O("Unsupported number of photos: ", i));
        }
        r1[1] = r0;
        return r1;
    }

    static {
        C347087wF r4 = C347087wF.A0H;
        C347087wF r5 = C347087wF.A0E;
        C347087wF r6 = C347087wF.A0D;
        C347087wF r7 = C347087wF.A0F;
        C347087wF r8 = C347087wF.A0G;
        A01 = new C347087wF[]{r4, r5, r6, r7, r8, C347087wF.A09};
        A03 = new C347087wF[]{r7, r5, r6};
        A00 = new C347087wF[]{r4, r5, r6, r7, r8};
    }
}
