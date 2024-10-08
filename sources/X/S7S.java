package X;

import java.util.Random;

public final class S7S {
    public final int A00 = new Random().nextInt();
    public final 02m A01;
    public final 1Ln A02;

    public final void A00() {
        this.A01.markerEnd(533737437, this.A00, 3);
    }

    public final void A01() {
        this.A01.markerEnd(533737437, this.A00, 2);
    }

    public final void A02() {
        this.A01.markerPoint(533737437, this.A00, "validate_end");
    }

    public final void A03() {
        this.A01.markerPoint(533737437, this.A00, "validate_start");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0018, code lost:
        if (r5.length() == 0) goto L_0x001a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A04(java.lang.String r5) {
        /*
            r4 = this;
            X.02m r3 = r4.A01
            int r2 = r4.A00
            r1 = 533737437(0x1fd02fdd, float:8.817061E-20)
            java.lang.String r0 = "nonce_end"
            r3.markerPoint(r1, r2, r0)
            X.1Ln r2 = r4.A02
            if (r2 == 0) goto L_0x0026
            if (r5 == 0) goto L_0x001a
            int r1 = r5.length()
            r0 = 0
            if (r1 != 0) goto L_0x001b
        L_0x001a:
            r0 = 1
        L_0x001b:
            r0 = r0 ^ 1
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "has_challenge_nonce"
            r2.A0O(r0, r1)
        L_0x0026:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.S7S.A04(java.lang.String):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0017, code lost:
        if (r5.length() == 0) goto L_0x0019;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A05(java.lang.String r5) {
        /*
            r4 = this;
            X.02m r3 = r4.A01
            int r2 = r4.A00
            r1 = 533737437(0x1fd02fdd, float:8.817061E-20)
            java.lang.String r0 = "google_end"
            r3.markerPoint(r1, r2, r0)
            X.1Ln r2 = r4.A02
            if (r2 == 0) goto L_0x0025
            if (r5 == 0) goto L_0x0019
            int r1 = r5.length()
            r0 = 0
            if (r1 != 0) goto L_0x001a
        L_0x0019:
            r0 = 1
        L_0x001a:
            r0 = r0 ^ 1
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "has_integrity_token"
            r2.A0O(r0, r1)
        L_0x0025:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.S7S.A05(java.lang.String):void");
    }

    public S7S(1Ln r2, 02m r3) {
        this.A01 = r3;
        this.A02 = r2;
    }
}
