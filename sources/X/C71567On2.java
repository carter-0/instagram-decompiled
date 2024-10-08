package X;

/* renamed from: X.On2  reason: case insensitive filesystem */
public final class C71567On2 implements 2Kw {
    public final int A00;
    public final Object A01;

    public C71567On2(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static void A00(AnonymousClass2Kv r1, 1Ef r2, 1vn r3, Object obj, int i) {
        r3.ATL(new C71567On2(obj, i), r1, r2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0062, code lost:
        r1.invoke(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0065, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0078, code lost:
        X.0qQ.A0A(r4);
        r0.invoke(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x007e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0028, code lost:
        r2.post(r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void invoke(java.lang.Throwable r4) {
        /*
            r3 = this;
            int r0 = r3.A00
            switch(r0) {
                case 0: goto L_0x00e1;
                case 1: goto L_0x00cf;
                case 2: goto L_0x00bd;
                case 3: goto L_0x00ab;
                case 4: goto L_0x0099;
                case 5: goto L_0x0087;
                case 6: goto L_0x007f;
                case 7: goto L_0x0005;
                case 8: goto L_0x0005;
                case 9: goto L_0x001b;
                case 10: goto L_0x000d;
                case 11: goto L_0x0072;
                case 12: goto L_0x006d;
                case 13: goto L_0x0066;
                case 14: goto L_0x005d;
                case 15: goto L_0x0054;
                case 16: goto L_0x0037;
                case 17: goto L_0x002c;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r3.A01
            X.2IR r0 = (X.2IR) r0
            r0.onFailure(r4)
        L_0x000c:
            return
        L_0x000d:
            java.lang.Object r0 = r3.A01
            X.NJe r0 = (X.C68466NJe) r0
            android.view.View r2 = r0.mView
            if (r2 == 0) goto L_0x000c
            X.PUz r1 = new X.PUz
            r1.<init>(r0)
            goto L_0x0028
        L_0x001b:
            java.lang.Object r0 = r3.A01
            X.NJe r0 = (X.C68466NJe) r0
            android.view.View r2 = r0.mView
            if (r2 == 0) goto L_0x000c
            X.PUy r1 = new X.PUy
            r1.<init>(r0)
        L_0x0028:
            r2.post(r1)
            return
        L_0x002c:
            java.lang.Object r0 = r3.A01
            X.PuY r0 = (X.C74418PuY) r0
            X.0qQ.A0A(r4)
            r0.D61(r4)
            return
        L_0x0037:
            java.lang.Object r1 = r3.A01
            X.OBv r1 = (X.C70573OBv) r1
            X.6ap r2 = X.DbV.A0X()
            java.lang.String r0 = "create_order_send_failure"
            r2.A0H = r0
            X.VaW r0 = r1.A00
            android.content.Context r1 = r0.A01
            r0 = 2131956878(0x7f13148e, float:1.9550324E38)
            X.DbS.A19(r1, r2, r0)
            r2.A06()
            X.DbY.A1N(r2)
            return
        L_0x0054:
            java.lang.Object r1 = r3.A01
            X.0sP r1 = (X.0sP) r1
            java.lang.Boolean r0 = X.AnonymousClass7TE.A0u()
            goto L_0x0062
        L_0x005d:
            java.lang.Object r1 = r3.A01
            X.0sP r1 = (X.0sP) r1
            r0 = 0
        L_0x0062:
            r1.invoke(r0)
            return
        L_0x0066:
            java.lang.Object r0 = r3.A01
            X.OF0 r0 = (X.OF0) r0
            X.0sP r0 = r0.A02
            goto L_0x0078
        L_0x006d:
            java.lang.Object r0 = r3.A01
            X.0sP r0 = (X.0sP) r0
            goto L_0x0078
        L_0x0072:
            java.lang.Object r0 = r3.A01
            X.OGZ r0 = (X.OGZ) r0
            X.0sP r0 = r0.A03
        L_0x0078:
            X.0qQ.A0A(r4)
            r0.invoke(r4)
            return
        L_0x007f:
            java.lang.String r1 = "TokenAcknowledger"
            java.lang.String r0 = "ackTokenWithFbid failure"
            X.0KC.A0C(r1, r0)
            return
        L_0x0087:
            java.lang.String r1 = "VestaRegisterServerProvider"
            java.lang.String r0 = "[INIT] GraphQL query failed"
            X.0KC.A0F(r1, r0, r4)
            java.lang.Object r0 = r3.A01
            X.OLk r0 = (X.C70790OLk) r0
            X.0qQ.A0A(r4)
            r0.A00(r4)
            return
        L_0x0099:
            java.lang.String r1 = "VestaRegisterServerProvider"
            java.lang.String r0 = "[FINISH] GraphQL query failed"
            X.0KC.A0F(r1, r0, r4)
            java.lang.Object r0 = r3.A01
            X.OKA r0 = (X.OKA) r0
            X.0qQ.A0A(r4)
            r0.A00(r4)
            return
        L_0x00ab:
            java.lang.String r1 = "VestaRegisterServerProvider"
            java.lang.String r0 = "[BEGIN] GraphQL query failed"
            X.0KC.A0F(r1, r0, r4)
            java.lang.Object r0 = r3.A01
            X.OLr r0 = (X.C70796OLr) r0
            X.0qQ.A0A(r4)
            r0.A00(r4)
            return
        L_0x00bd:
            java.lang.String r1 = "VestaLoginServerProvider"
            java.lang.String r0 = "[INIT] GraphQL query failed"
            X.0KC.A0F(r1, r0, r4)
            java.lang.Object r0 = r3.A01
            X.OLW r0 = (X.OLW) r0
            X.0qQ.A0A(r4)
            r0.A00(r4)
            return
        L_0x00cf:
            java.lang.String r1 = "VestaLoginServerProvider"
            java.lang.String r0 = "[FINISH] GraphQL query failed"
            X.0KC.A0F(r1, r0, r4)
            java.lang.Object r0 = r3.A01
            X.OL1 r0 = (X.OL1) r0
            X.0qQ.A0A(r4)
            r0.A00(r4)
            return
        L_0x00e1:
            java.lang.String r1 = "VestaLoginServerProvider"
            java.lang.String r0 = "[BEGIN] GraphQL query failed"
            X.0KC.A0F(r1, r0, r4)
            java.lang.Object r0 = r3.A01
            X.OLd r0 = (X.C70783OLd) r0
            X.0qQ.A0A(r4)
            r0.A00(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71567On2.invoke(java.lang.Throwable):void");
    }
}
