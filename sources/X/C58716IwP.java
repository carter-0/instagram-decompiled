package X;

/* renamed from: X.IwP  reason: case insensitive filesystem */
public final class C58716IwP extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;
    public final Object A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58716IwP(C307896Rx r2, C277014uI r3, int i) {
        super(0);
        this.A00 = i;
        switch (i) {
            case 31:
            case 33:
                this.A01 = r2;
                this.A02 = r3;
                break;
            default:
                this.A02 = r2;
                this.A01 = r3;
                break;
        }
    }

    public static C58716IwP A00(C286575Wy r1, Object obj, Object obj2, int i) {
        C58716IwP iwP = new C58716IwP(i, obj, obj2);
        r1.FLL(iwP);
        return iwP;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00ae, code lost:
        X.C51967G9n.A16(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0128, code lost:
        X.DbS.A1U(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0140, code lost:
        if (X.C51971G9r.A1b((X.C62320sa) r5.A02) != false) goto L_0x0142;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x014e, code lost:
        r1.invoke(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0235, code lost:
        if (r0 != null) goto L_0x0241;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0237, code lost:
        r0 = "quickPromotionDelegate";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0239, code lost:
        X.0qQ.A0F(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0240, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0241, code lost:
        r0.DbJ(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x025d, code lost:
        return X.C60340gF.A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            r5 = this;
            int r0 = r5.A00
            switch(r0) {
                case 0: goto L_0x0039;
                case 1: goto L_0x0039;
                case 2: goto L_0x0049;
                case 3: goto L_0x0059;
                case 4: goto L_0x0069;
                case 5: goto L_0x007b;
                case 6: goto L_0x007b;
                case 7: goto L_0x007b;
                case 8: goto L_0x008b;
                case 9: goto L_0x0098;
                case 10: goto L_0x00a4;
                case 11: goto L_0x0098;
                case 12: goto L_0x00b3;
                case 13: goto L_0x00d0;
                case 14: goto L_0x00e1;
                case 15: goto L_0x00ee;
                case 16: goto L_0x00ee;
                case 17: goto L_0x00fb;
                case 18: goto L_0x0108;
                case 19: goto L_0x0115;
                case 20: goto L_0x0115;
                case 21: goto L_0x0115;
                case 22: goto L_0x0115;
                case 23: goto L_0x0115;
                case 24: goto L_0x011c;
                case 25: goto L_0x012d;
                case 26: goto L_0x0148;
                case 27: goto L_0x025b;
                case 28: goto L_0x0153;
                case 29: goto L_0x0115;
                case 30: goto L_0x0192;
                case 31: goto L_0x01ae;
                case 32: goto L_0x01cc;
                case 33: goto L_0x01e3;
                case 34: goto L_0x0027;
                case 35: goto L_0x0005;
                case 36: goto L_0x01f2;
                case 37: goto L_0x01fd;
                case 38: goto L_0x0005;
                case 39: goto L_0x0208;
                case 40: goto L_0x0245;
                case 41: goto L_0x0220;
                case 42: goto L_0x0005;
                case 43: goto L_0x022b;
                case 44: goto L_0x0005;
                case 45: goto L_0x0005;
                case 46: goto L_0x0005;
                case 47: goto L_0x0005;
                case 48: goto L_0x025e;
                case 49: goto L_0x026c;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r5.A01
            X.0sa r0 = (X.C62320sa) r0
            if (r0 == 0) goto L_0x0011
            java.lang.Object r2 = r0.invoke()
            if (r2 != 0) goto L_0x0023
        L_0x0011:
            java.lang.Object r0 = r5.A02
            X.07g r1 = X.C51969G9p.A0c(r0)
            boolean r0 = r1 instanceof X.AnonymousClass07P
            if (r0 == 0) goto L_0x0024
            X.07P r1 = (X.AnonymousClass07P) r1
            if (r1 == 0) goto L_0x0024
            X.2YQ r2 = r1.getDefaultViewModelCreationExtras()
        L_0x0023:
            return r2
        L_0x0024:
            X.2YP r2 = X.AnonymousClass2YP.A00
            return r2
        L_0x0027:
            java.lang.Object r2 = r5.A02
            X.6Rx r2 = (X.C307896Rx) r2
            java.lang.Object r1 = r5.A01
            X.4uI r1 = (X.C277014uI) r1
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.Object r2 = X.C308206Td.A0E(r2, r1, r0)
            return r2
        L_0x0039:
            java.lang.Object r1 = r5.A01
            X.0sP r1 = (X.0sP) r1
            java.lang.Object r0 = r5.A02
            X.Hnf r0 = (X.C55799Hnf) r0
            java.lang.Object r0 = r0.A02
            X.9JJ r0 = (X.AnonymousClass9JJ) r0
            java.lang.String r0 = r0.A08
            goto L_0x014e
        L_0x0049:
            java.lang.Object r1 = r5.A01
            X.0sP r1 = (X.0sP) r1
            java.lang.Object r0 = r5.A02
            X.Hnf r0 = (X.C55799Hnf) r0
            java.lang.Object r0 = r0.A02
            X.6D4 r0 = (X.AnonymousClass6D4) r0
            java.lang.String r0 = r0.A01
            goto L_0x014e
        L_0x0059:
            java.lang.Object r1 = r5.A01
            X.0sP r1 = (X.0sP) r1
            java.lang.Object r0 = r5.A02
            X.Hnf r0 = (X.C55799Hnf) r0
            java.lang.Object r0 = r0.A02
            X.6D2 r0 = (X.AnonymousClass6D2) r0
            java.lang.String r0 = r0.A03
            goto L_0x014e
        L_0x0069:
            java.lang.Object r0 = r5.A01
            X.5V6 r0 = (X.AnonymousClass5V6) r0
            X.5V5 r0 = (X.AnonymousClass5V5) r0
            r1 = 0
            android.view.View r0 = r0.A00
            r0.performHapticFeedback(r1)
            java.lang.Object r1 = r5.A02
            X.5Oz r1 = (X.C284945Oz) r1
            r0 = 1
            goto L_0x00ae
        L_0x007b:
            java.lang.Object r0 = r5.A01
            X.5V6 r0 = (X.AnonymousClass5V6) r0
            X.5V5 r0 = (X.AnonymousClass5V5) r0
            r1 = 0
            android.view.View r0 = r0.A00
            r0.performHapticFeedback(r1)
            java.lang.Object r0 = r5.A02
            goto L_0x0128
        L_0x008b:
            java.lang.Object r0 = r5.A01
            X.GmJ r0 = (X.C53333GmJ) r0
            com.instagram.api.schemas.MetaPlaceDict r0 = r0.A02
            if (r0 == 0) goto L_0x025b
            java.lang.Object r3 = r5.A02
            X.0sL r3 = (X.0sL) r3
            goto L_0x00bb
        L_0x0098:
            java.lang.Object r1 = r5.A02
            X.0sP r1 = (X.0sP) r1
            java.lang.Object r0 = r5.A01
            X.GmJ r0 = (X.C53333GmJ) r0
            java.lang.String r0 = r0.A0F
            goto L_0x014e
        L_0x00a4:
            java.lang.Object r0 = r5.A02
            X.DbS.A1U(r0)
            java.lang.Object r1 = r5.A01
            X.5Oz r1 = (X.C284945Oz) r1
            r0 = 0
        L_0x00ae:
            X.C51967G9n.A16(r1, r0)
            goto L_0x025b
        L_0x00b3:
            java.lang.Object r3 = r5.A02
            X.0sL r3 = (X.0sL) r3
            java.lang.Object r0 = r5.A01
            com.instagram.api.schemas.MetaPlaceDict r0 = (com.instagram.api.schemas.MetaPlaceDict) r0
        L_0x00bb:
            java.lang.String r2 = r0.getId()
            java.lang.String r1 = ""
            if (r2 != 0) goto L_0x00c4
            r2 = r1
        L_0x00c4:
            java.lang.String r0 = r0.getName()
            if (r0 == 0) goto L_0x00cb
            r1 = r0
        L_0x00cb:
            r3.invoke(r2, r1)
            goto L_0x025b
        L_0x00d0:
            java.lang.Object r1 = r5.A02
            X.0sP r1 = (X.0sP) r1
            java.lang.Object r0 = r5.A01
            X.5vK r0 = (X.C299515vK) r0
            java.lang.String r0 = r0.getId()
            r1.invoke(r0)
            goto L_0x025b
        L_0x00e1:
            java.lang.Object r1 = r5.A02
            X.0sP r1 = (X.0sP) r1
            java.lang.Object r0 = r5.A01
            X.5vK r0 = (X.C299515vK) r0
            X.9JJ r0 = (X.AnonymousClass9JJ) r0
            java.lang.String r0 = r0.A08
            goto L_0x014e
        L_0x00ee:
            java.lang.Object r1 = r5.A02
            X.0sP r1 = (X.0sP) r1
            java.lang.Object r0 = r5.A01
            X.5vK r0 = (X.C299515vK) r0
            X.6D3 r0 = (X.AnonymousClass6D3) r0
            java.lang.String r0 = r0.A05
            goto L_0x014e
        L_0x00fb:
            java.lang.Object r1 = r5.A02
            X.0sP r1 = (X.0sP) r1
            java.lang.Object r0 = r5.A01
            X.5vK r0 = (X.C299515vK) r0
            X.GpL r0 = (X.C53489GpL) r0
            java.lang.String r0 = r0.A02
            goto L_0x014e
        L_0x0108:
            java.lang.Object r1 = r5.A02
            X.0sP r1 = (X.0sP) r1
            java.lang.Object r0 = r5.A01
            X.5vK r0 = (X.C299515vK) r0
            X.6D5 r0 = (X.AnonymousClass6D5) r0
            java.lang.String r0 = r0.A03
            goto L_0x014e
        L_0x0115:
            java.lang.Object r1 = r5.A01
            X.0sP r1 = (X.0sP) r1
            java.lang.Object r0 = r5.A02
            goto L_0x014e
        L_0x011c:
            java.lang.Object r0 = r5.A02
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            boolean r0 = X.1CI.A00(r0)
            if (r0 == 0) goto L_0x025b
            java.lang.Object r0 = r5.A01
        L_0x0128:
            X.DbS.A1U(r0)
            goto L_0x025b
        L_0x012d:
            java.lang.Object r0 = r5.A01
            X.0sa r0 = (X.C62320sa) r0
            boolean r0 = X.C51971G9r.A1b(r0)
            if (r0 == 0) goto L_0x0142
            java.lang.Object r0 = r5.A02
            X.0sa r0 = (X.C62320sa) r0
            boolean r1 = X.C51971G9r.A1b(r0)
            r0 = 1
            if (r1 == 0) goto L_0x0143
        L_0x0142:
            r0 = 0
        L_0x0143:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
            return r2
        L_0x0148:
            java.lang.Object r1 = r5.A02
            X.0sP r1 = (X.0sP) r1
            java.lang.Object r0 = r5.A01
        L_0x014e:
            r1.invoke(r0)
            goto L_0x025b
        L_0x0153:
            java.lang.Object r1 = r5.A02
            X.0lg r1 = (X.0lg) r1
            java.lang.String r0 = "WebLinkHandler"
            X.0xG r0 = X.DbS.A0O(r0)
            java.lang.Object r4 = r5.A01
            X.HOZ r4 = (X.HOZ) r4
            X.HO6 r3 = X.HO6.THREADS_TEXT_POST_APP_POST_TEXT
            X.0wc r1 = X.DbX.A0O(r0, r1)
            java.lang.String r0 = "barcelona_link_protection"
            X.0Aj r2 = X.AnonymousClass7TE.A0e(r1, r0)
            boolean r0 = r2.isSampled()
            if (r0 == 0) goto L_0x025b
            X.HOO r0 = X.HOO.CANCEL_CLICK
            X.C51965G9l.A19(r0, r2)
            java.lang.String r0 = "callsite"
            r2.A8M(r3, r0)
            r0 = 230(0xe6, float:3.22E-43)
            java.lang.String r0 = X.Pxd.A00(r0)
            r2.A8M(r4, r0)
            X.HO7 r1 = X.HO7.A02
            java.lang.String r0 = "component"
            r2.A8M(r1, r0)
            r2.Cgf()
            goto L_0x025b
        L_0x0192:
            java.lang.Object r0 = r5.A02
            X.FGx r0 = (X.C49964FGx) r0
            X.02m r3 = r0.A01
            if (r3 != 0) goto L_0x019e
            java.lang.String r0 = "qplLogger"
            goto L_0x0239
        L_0x019e:
            r2 = 896612552(0x357138c8, float:8.9862124E-7)
            java.lang.Object r0 = r5.A01
            int r1 = X.DbS.A05(r0)
            java.lang.String r0 = "count_of_openid_tokens"
            r3.markerAnnotate(r2, r0, r1)
            goto L_0x025b
        L_0x01ae:
            java.lang.Object r3 = r5.A01
            X.6Rx r3 = (X.C307896Rx) r3
            java.lang.Object r2 = r5.A02
            X.4uI r2 = (X.C277014uI) r2
            X.6Tl r1 = new X.6Tl
            r1.<init>()
            r0 = 3
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A01(r0)
            X.6Tm r0 = r1.A00()
            X.C299275ur.A00(r3, r0, r2)
            goto L_0x025b
        L_0x01cc:
            java.lang.Object r1 = r5.A01
            X.6Tm r1 = (X.AnonymousClass6Tm) r1
            r0 = 3
            java.lang.Object r0 = r1.A03(r0)
            X.4zw r0 = (X.C280064zw) r0
            X.4uI r2 = r0.A00
            X.6Tm r1 = X.AnonymousClass6Tm.A01
            java.lang.Object r0 = r5.A02
            X.6Rx r0 = (X.C307896Rx) r0
            X.C299275ur.A00(r0, r1, r2)
            goto L_0x025b
        L_0x01e3:
            java.lang.Object r2 = r5.A01
            X.6Rx r2 = (X.C307896Rx) r2
            java.lang.Object r1 = r5.A02
            X.4uI r1 = (X.C277014uI) r1
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            X.C308206Td.A0E(r2, r1, r0)
            goto L_0x025b
        L_0x01f2:
            java.lang.Object r0 = r5.A02
            X.K8a r0 = (X.C61446K8a) r0
            java.lang.Object r1 = r5.A01
            X.4UE r1 = (X.AnonymousClass4UE) r1
            X.2qi r0 = r0.A02
            goto L_0x0235
        L_0x01fd:
            java.lang.Object r0 = r5.A02
            X.K8Z r0 = (X.K8Z) r0
            java.lang.Object r1 = r5.A01
            X.4UE r1 = (X.AnonymousClass4UE) r1
            X.2qi r0 = r0.A00
            goto L_0x0235
        L_0x0208:
            java.lang.Object r0 = r5.A01
            X.Kzk r0 = (X.C63597Kzk) r0
            if (r0 == 0) goto L_0x0217
            X.K88 r0 = r0.A00
            X.0hq r0 = r0.getParentFragmentManager()
            r0.A13()
        L_0x0217:
            java.lang.Object r1 = r5.A02
            X.JjM r1 = (X.C60318JjM) r1
            r0 = 0
            X.C60318JjM.A01(r0, r1)
            goto L_0x025b
        L_0x0220:
            java.lang.Object r0 = r5.A02
            X.K8W r0 = (X.K8W) r0
            java.lang.Object r1 = r5.A01
            X.4UE r1 = (X.AnonymousClass4UE) r1
            X.2qi r0 = r0.A00
            goto L_0x0235
        L_0x022b:
            java.lang.Object r0 = r5.A02
            X.K8V r0 = (X.K8V) r0
            java.lang.Object r1 = r5.A01
            X.4UE r1 = (X.AnonymousClass4UE) r1
            X.2qi r0 = r0.A00
        L_0x0235:
            if (r0 != 0) goto L_0x0241
            java.lang.String r0 = "quickPromotionDelegate"
        L_0x0239:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0241:
            r0.DbJ(r1)
            goto L_0x025b
        L_0x0245:
            java.lang.Object r3 = r5.A02
            X.JjM r3 = (X.C60318JjM) r3
            com.instagram.common.session.UserSession r2 = r3.A04
            java.lang.Object r0 = r5.A01
            java.lang.String r1 = X.DbS.A0q(r0)
            X.0iw r0 = r3.A03
            X.C64186LSt.A03(r0, r2, r1)
            java.lang.String r0 = "cancel"
            X.C60318JjM.A03(r3, r0)
        L_0x025b:
            X.0gF r2 = X.C60340gF.A00
            return r2
        L_0x025e:
            java.lang.Object r1 = r5.A01
            android.content.Context r1 = (android.content.Context) r1
            java.lang.Object r0 = r5.A02
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.28Z r2 = new X.28Z
            r2.<init>(r1, r0)
            return r2
        L_0x026c:
            java.lang.Object r1 = r5.A02
            X.28l r1 = (X.AnonymousClass28l) r1
            java.lang.Object r0 = r5.A01
            android.content.Context r0 = (android.content.Context) r0
            java.lang.String r2 = r1.getContentInBackground(r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58716IwP.invoke():java.lang.Object");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58716IwP(int i, Object obj, Object obj2) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }
}
