package X;

public final class WW0 implements JO7 {
    public final /* synthetic */ C15381Ube A00;

    public WW0(C15381Ube ube) {
        this.A00 = ube;
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DqJ(X.C16672Uz8 r11) {
        /*
            r10 = this;
            r2 = 0
            X.0qQ.A0B(r11, r2)
            X.Ube r4 = r10.A00
            X.VuR r5 = r4.A0I
            if (r5 != 0) goto L_0x0014
            java.lang.String r0 = "feedRequestController"
        L_0x000c:
            X.0qQ.A0F(r0)
        L_0x000f:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0014:
            java.util.Map r0 = r5.A06
            boolean r3 = r0.containsKey(r11)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Invalid requestType: "
            java.lang.String r0 = X.AnonymousClass7TG.A0m(r11, r0, r1)
            X.17k.A0H(r3, r0)
            r5.A00 = r11
            X.Vzq r0 = r4.A0E
            if (r0 != 0) goto L_0x0031
            java.lang.String r0 = "useHashtagController"
            goto L_0x000c
        L_0x0031:
            r0.A01(r11)
            X.HAI r0 = r4.A08
            java.lang.String r5 = "dataSource"
            if (r0 == 0) goto L_0x00e2
            boolean r0 = X.C13991Tnr.A1Z(r11, r0)
            if (r0 == 0) goto L_0x005f
            X.W2y r1 = r4.A0c
            java.lang.String r0 = r11.toString()
            X.0qQ.A0B(r0, r2)
            r3 = 20643841(0x13b0001, float:3.4346478E-38)
            X.C18806W2y.A03(r1, r0, r3)
            r1 = 1
            java.lang.String r0 = r4.A0O
            X.C15381Ube.A08(r4, r0, r3, r1, r2)
            X.TsA r0 = r4.A06
            if (r0 != 0) goto L_0x005c
            java.lang.String r0 = "adapter"
            goto L_0x000c
        L_0x005c:
            X.C14227TsA.A00(r0)
        L_0x005f:
            X.Vt4 r0 = X.C15381Ube.A01(r4)
            com.instagram.model.hashtag.Hashtag r7 = r0.A01
            X.HAI r0 = r4.A08
            if (r0 == 0) goto L_0x00e2
            X.VgA r0 = r0.A01
            int r6 = r0.A00(r11)
            java.lang.String r5 = r4.A0g
            X.0eM r0 = r4.A0i
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r0)
            r0 = 1481(0x5c9, float:2.075E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.3sc r8 = new X.3sc
            r8.<init>(r4, r0)
            java.lang.String r0 = r7.getId()
            if (r0 == 0) goto L_0x0096
            java.lang.Long r0 = X.DbV.A0q(r0)     // Catch:{ NumberFormatException -> 0x008d }
            goto L_0x0097
        L_0x008d:
            X.0kg r9 = X.0kg.A09
            java.lang.String r1 = "hashtag"
            java.lang.String r0 = "unable to convert id to long"
            X.0wb.A01(r9, r1, r0)
        L_0x0096:
            r0 = 0
        L_0x0097:
            r8.A3Z = r0
            java.lang.String r0 = r7.getName()
            r8.A4H = r0
            java.lang.String r0 = X.C281965Ag.A02(r7)
            r8.A5T = r0
            java.lang.String r0 = r11.toString()
            r8.A5P = r0
            r8.A6t = r5
            long r0 = (long) r6
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r8.A4D = r0
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            boolean r0 = X.C271764jY.A00(r3, r8, r4, r0)
            if (r0 != 0) goto L_0x00d8
            java.lang.String r1 = r4.A0f
            r0 = 3239(0xca7, float:4.539E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.0xI r1 = X.0xI.A01(r0, r1)
            java.lang.String r0 = X.C46326Dbu.A00()
            r1.A0C(r0, r5)
            X.W0l.A03(r1, r7)
            X.C18766W0k.A02(r1, r11, r6)
            X.DbU.A1R(r1, r3)
        L_0x00d8:
            X.Uz8 r0 = X.C16672Uz8.RECENT
            if (r11 != r0) goto L_0x00f8
            X.TpO r0 = r4.A07
            if (r0 != 0) goto L_0x00e7
            java.lang.String r5 = "grid"
        L_0x00e2:
            X.0qQ.A0F(r5)
            goto L_0x000f
        L_0x00e7:
            X.JQy r0 = r0.A0D
            r0.AGS()
            X.X9Q r1 = r4.A0A
            if (r1 != 0) goto L_0x00f3
            java.lang.String r5 = "videoPlayerManager"
            goto L_0x00e2
        L_0x00f3:
            java.lang.String r0 = "context_switch"
            r1.Ey8(r0, r2)
        L_0x00f8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WW0.DqJ(X.Uz8):void");
    }
}
