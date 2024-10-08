package X;

public final class LCe {
    public Integer A00 = AnonymousClass05K.A00;
    public final C66522MVa A01;

    /* JADX WARNING: Removed duplicated region for block: B:35:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00bd  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(X.MQ5 r6) {
        /*
            r5 = this;
            r4 = 0
            X.Lk0 r0 = X.C64900Lk0.A00
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x001d
            java.lang.Integer r1 = r5.A00
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            int r0 = r1.compareTo(r0)
            if (r0 > 0) goto L_0x0084
            X.MVa r0 = r5.A01
            r0.CMy()
            java.lang.Integer r0 = X.AnonymousClass05K.A01
        L_0x001a:
            r5.A00 = r0
        L_0x001c:
            return
        L_0x001d:
            r3 = 1
            boolean r1 = r6 instanceof X.C61180JyZ
            if (r1 == 0) goto L_0x003f
            r2 = r6
            X.JyZ r2 = (X.C61180JyZ) r2
            int r0 = r2.A00
            if (r0 != r3) goto L_0x003f
            java.lang.Integer r1 = r5.A00
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r1 != r0) goto L_0x001c
            java.lang.Object r0 = r2.A01
            X.04k r0 = (X.04k) r0
            int r1 = X.OOp.A00(r0)
            X.MVa r0 = r5.A01
            r0.E4J(r1)
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            goto L_0x001a
        L_0x003f:
            boolean r0 = r6 instanceof X.C61179JyY
            if (r0 == 0) goto L_0x005b
            java.lang.Integer r1 = r5.A00
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            int r0 = r1.compareTo(r0)
            if (r0 < 0) goto L_0x001c
            java.lang.Integer r0 = X.AnonymousClass05K.A0j
            if (r1 == r0) goto L_0x001c
            X.MVa r1 = r5.A01
            X.JyY r6 = (X.C61179JyY) r6
            int r0 = r6.A00
            r1.FJm(r0)
            return
        L_0x005b:
            X.Lk1 r0 = X.C64901Lk1.A00
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0071
            java.lang.Integer r1 = r5.A00
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r1 != r0) goto L_0x0084
            X.MVa r0 = r5.A01
            r0.CNa()
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            goto L_0x001a
        L_0x0071:
            if (r1 == 0) goto L_0x00cd
            r2 = r6
            X.JyZ r2 = (X.C61180JyZ) r2
            int r0 = r2.A00
            if (r0 != r4) goto L_0x00cd
            java.lang.Integer r1 = r5.A00
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            if (r1 == r0) goto L_0x00c0
            java.lang.Integer r0 = X.AnonymousClass05K.A0Y
            if (r1 == r0) goto L_0x00c0
        L_0x0084:
            X.0wj r2 = X.0wj.A01
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "ImmersiveAnimationStateMachine: Unexpected event "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = " while in state "
            r1.append(r0)
            java.lang.Integer r0 = r5.A00
            int r0 = r0.intValue()
            switch(r0) {
                case 0: goto L_0x00b1;
                case 1: goto L_0x00bd;
                case 2: goto L_0x00ba;
                case 3: goto L_0x00b7;
                case 4: goto L_0x00b4;
                default: goto L_0x00a0;
            }
        L_0x00a0:
            r0 = 2268(0x8dc, float:3.178E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
        L_0x00a6:
            java.lang.String r1 = X.AnonymousClass7TF.A0l(r0, r1)
            r0 = 817892647(0x30c00d27, float:1.3973577E-9)
            X.DbT.A1Q(r2, r1, r0)
            return
        L_0x00b1:
            java.lang.String r0 = "INITIAL"
            goto L_0x00a6
        L_0x00b4:
            java.lang.String r0 = "ANIMATING"
            goto L_0x00a6
        L_0x00b7:
            java.lang.String r0 = "STARTED"
            goto L_0x00a6
        L_0x00ba:
            java.lang.String r0 = "INSETS_APPLIED"
            goto L_0x00a6
        L_0x00bd:
            java.lang.String r0 = "PREPARED"
            goto L_0x00a6
        L_0x00c0:
            X.MVa r1 = r5.A01
            java.lang.Object r0 = r2.A01
            X.04a r0 = (X.04a) r0
            r1.ABM(r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A0Y
            goto L_0x001a
        L_0x00cd:
            X.Ljz r0 = X.C64899Ljz.A00
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x00de
            X.MVa r0 = r5.A01
            r0.ABL()
            java.lang.Integer r0 = X.AnonymousClass05K.A0j
            goto L_0x001a
        L_0x00de:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LCe.A00(X.MQ5):void");
    }

    public LCe(C66522MVa mVa) {
        this.A01 = mVa;
    }
}
