package X;

/* renamed from: X.Gfs  reason: case insensitive filesystem */
public final class C52941Gfs extends C56882IGd {
    public static C52941Gfs A01;
    public static final C52430GSi A02 = C52430GSi.Ltr;
    public static final C52430GSi A03 = C52430GSi.Rtl;
    public C3022462f A00;

    private final int A00(C52430GSi gSi, int i) {
        C3022462f r0 = this.A00;
        if (r0 != null) {
            int A032 = r0.A03(i);
            C3022462f r02 = this.A00;
            if (r02 != null) {
                C52430GSi A09 = r02.A09(A032);
                C3022462f r03 = this.A00;
                if (gSi != A09) {
                    if (r03 != null) {
                        return r03.A03(i);
                    }
                } else if (r03 != null) {
                    return r03.A03.A07(i, false) - 1;
                }
            }
        }
        0qQ.A0F("layoutResult");
        throw AnonymousClass00P.createAndThrow();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004a, code lost:
        if (A00(A03, r1) == r6) goto L_0x001c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int[] AWA(int r6) {
        /*
            r5 = this;
            int r0 = X.C56882IGd.A01(r5)
            r4 = 0
            if (r0 <= 0) goto L_0x0055
            int r0 = X.C56882IGd.A01(r5)
            if (r6 >= r0) goto L_0x0055
            java.lang.String r3 = "layoutResult"
            X.62f r0 = r5.A00
            if (r6 >= 0) goto L_0x003a
            if (r0 == 0) goto L_0x004d
            r1 = 0
            X.62d r0 = r0.A03
            int r1 = r0.A06(r1)
        L_0x001c:
            r2 = r1
        L_0x001d:
            X.62f r0 = r5.A00
            if (r0 == 0) goto L_0x004d
            X.62d r0 = r0.A03
            int r0 = r0.A02
            if (r2 >= r0) goto L_0x0055
            X.GSi r0 = A03
            int r1 = r5.A00(r0, r2)
            X.GSi r0 = A02
            int r0 = r5.A00(r0, r2)
            int r0 = r0 + 1
            int[] r0 = r5.A04(r1, r0)
            return r0
        L_0x003a:
            if (r0 == 0) goto L_0x004d
            X.62d r0 = r0.A03
            int r1 = r0.A06(r6)
            X.GSi r0 = A03
            int r0 = r5.A00(r0, r1)
            int r2 = r1 + 1
            if (r0 != r6) goto L_0x001d
            goto L_0x001c
        L_0x004d:
            X.0qQ.A0F(r3)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0055:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52941Gfs.AWA(int):int[]");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0049, code lost:
        if ((A00(A02, r1) + 1) == r5) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int[] E3T(int r5) {
        /*
            r4 = this;
            int r0 = X.C56882IGd.A01(r4)
            r3 = 0
            if (r0 <= 0) goto L_0x0054
            if (r5 <= 0) goto L_0x0054
            int r0 = X.C56882IGd.A01(r4)
            java.lang.String r1 = "layoutResult"
            if (r5 <= r0) goto L_0x0035
            X.62f r0 = r4.A00
            if (r0 == 0) goto L_0x004c
            int r1 = X.C56882IGd.A01(r4)
            X.62d r0 = r0.A03
            int r1 = r0.A06(r1)
        L_0x001f:
            r2 = r1
        L_0x0020:
            if (r2 < 0) goto L_0x0054
            X.GSi r0 = A03
            int r1 = r4.A00(r0, r2)
            X.GSi r0 = A02
            int r0 = r4.A00(r0, r2)
            int r0 = r0 + 1
            int[] r0 = r4.A04(r1, r0)
            return r0
        L_0x0035:
            X.62f r0 = r4.A00
            if (r0 == 0) goto L_0x004c
            X.62d r0 = r0.A03
            int r1 = r0.A06(r5)
            X.GSi r0 = A02
            int r0 = r4.A00(r0, r1)
            int r0 = r0 + 1
            int r2 = r1 + -1
            if (r0 != r5) goto L_0x0020
            goto L_0x001f
        L_0x004c:
            X.0qQ.A0F(r1)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0054:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52941Gfs.E3T(int):int[]");
    }
}
