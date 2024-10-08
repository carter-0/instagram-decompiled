package X;

/* renamed from: X.Ivz  reason: case insensitive filesystem */
public final class C58690Ivz extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;
    public final Object A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58690Ivz(int i, Object obj, Object obj2) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    public static C58690Ivz A00(Object obj, Object obj2, int i) {
        return new C58690Ivz(i, obj, obj2);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0088, code lost:
        r2.Epw(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00d6, code lost:
        if (r1 == null) goto L_0x00d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x018a, code lost:
        X.DbS.A1U(r9.A01);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x01be, code lost:
        r1.invoke(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01d8, code lost:
        if (r1 != 0) goto L_0x01da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0212, code lost:
        if (r0 != null) goto L_0x0214;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0219, code lost:
        return X.C60340gF.A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            r9 = this;
            int r0 = r9.A00
            switch(r0) {
                case 0: goto L_0x005b;
                case 1: goto L_0x0005;
                case 2: goto L_0x006c;
                case 3: goto L_0x007a;
                case 4: goto L_0x0096;
                case 5: goto L_0x0005;
                case 6: goto L_0x0005;
                case 7: goto L_0x0024;
                case 8: goto L_0x0005;
                case 9: goto L_0x0005;
                case 10: goto L_0x0041;
                case 11: goto L_0x0005;
                case 12: goto L_0x0005;
                case 13: goto L_0x0005;
                case 14: goto L_0x00c7;
                case 15: goto L_0x0041;
                case 16: goto L_0x0041;
                case 17: goto L_0x0041;
                case 18: goto L_0x0005;
                case 19: goto L_0x0005;
                case 20: goto L_0x00de;
                case 21: goto L_0x00ec;
                case 22: goto L_0x00fa;
                case 23: goto L_0x0041;
                case 24: goto L_0x0041;
                case 25: goto L_0x0005;
                case 26: goto L_0x0024;
                case 27: goto L_0x0005;
                case 28: goto L_0x0024;
                case 29: goto L_0x0005;
                case 30: goto L_0x0024;
                case 31: goto L_0x0041;
                case 32: goto L_0x0041;
                case 33: goto L_0x0005;
                case 34: goto L_0x0136;
                case 35: goto L_0x0147;
                case 36: goto L_0x0152;
                case 37: goto L_0x0041;
                case 38: goto L_0x0159;
                case 39: goto L_0x0172;
                case 40: goto L_0x0191;
                case 41: goto L_0x01a8;
                case 42: goto L_0x0005;
                case 43: goto L_0x0005;
                case 44: goto L_0x01c2;
                case 45: goto L_0x0005;
                case 46: goto L_0x0005;
                case 47: goto L_0x0005;
                case 48: goto L_0x0024;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r9.A01
            X.0sa r0 = (X.C62320sa) r0
            if (r0 == 0) goto L_0x0011
            java.lang.Object r5 = r0.invoke()
            if (r5 != 0) goto L_0x0023
        L_0x0011:
            java.lang.Object r0 = r9.A02
            X.07g r1 = X.C51969G9p.A0c(r0)
            boolean r0 = r1 instanceof X.AnonymousClass07P
            if (r0 == 0) goto L_0x0058
            X.07P r1 = (X.AnonymousClass07P) r1
            if (r1 == 0) goto L_0x0058
            X.2YQ r5 = r1.getDefaultViewModelCreationExtras()
        L_0x0023:
            return r5
        L_0x0024:
            java.lang.Object r0 = r9.A01
            X.07g r1 = X.C51969G9p.A0c(r0)
            boolean r0 = r1 instanceof X.AnonymousClass07P
            if (r0 == 0) goto L_0x0038
            X.07P r1 = (X.AnonymousClass07P) r1
            if (r1 == 0) goto L_0x0038
            X.2YM r5 = r1.getDefaultViewModelProviderFactory()
            if (r5 != 0) goto L_0x0023
        L_0x0038:
            java.lang.Object r0 = r9.A02
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            X.2YM r5 = r0.getDefaultViewModelProviderFactory()
            return r5
        L_0x0041:
            java.lang.Object r0 = r9.A01
            X.0sa r0 = (X.C62320sa) r0
            if (r0 == 0) goto L_0x004d
            java.lang.Object r5 = r0.invoke()
            if (r5 != 0) goto L_0x0023
        L_0x004d:
            java.lang.Object r0 = r9.A02
            androidx.fragment.app.FragmentActivity r0 = X.DbT.A0E(r0)
            X.2YQ r5 = r0.getDefaultViewModelCreationExtras()
            return r5
        L_0x0058:
            X.2YP r5 = X.AnonymousClass2YP.A00
            return r5
        L_0x005b:
            java.lang.Object r3 = r9.A02
            X.2YL r3 = (X.2YL) r3
            X.6oS r2 = X.C318116oQ.A00(r3)
            java.lang.Object r1 = r9.A01
            r0 = 9
            X.C58105ImR.A01(r3, r1, r2, r0)
            goto L_0x0217
        L_0x006c:
            java.lang.Object r0 = r9.A02
            X.DbS.A1U(r0)
            java.lang.Object r2 = r9.A01
            X.5Oz r2 = (X.C284945Oz) r2
            java.lang.Boolean r0 = X.AnonymousClass7TE.A0v()
            goto L_0x0088
        L_0x007a:
            java.lang.Object r2 = r9.A01
            X.5Oz r2 = (X.C284945Oz) r2
            java.lang.Object r1 = r2.getValue()
            X.HLR r0 = X.HLR.SUGGESTED_FOR
            if (r1 != r0) goto L_0x008d
            X.HLR r0 = X.HLR.MESSAGE_BAR
        L_0x0088:
            r2.Epw(r0)
            goto L_0x0217
        L_0x008d:
            java.lang.Object r0 = r9.A02
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            X.Dbb.A0z(r0)
            goto L_0x0217
        L_0x0096:
            java.lang.Object r2 = r9.A02
            X.Hmp r2 = (X.C55754Hmp) r2
            java.lang.Object r1 = r9.A01
            r0 = 0
            X.0qQ.A0B(r1, r0)
            X.HJR r0 = X.HJR.A00
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00b1
            X.3ju r1 = r2.A00
            X.IdW r0 = X.C57605IdW.A00
            r1.FIG(r0)
            goto L_0x0217
        L_0x00b1:
            X.HJQ r0 = X.HJQ.A00
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00c2
            X.05G r1 = r2.A01
            X.HLx r0 = X.C54640HLx.HOW_IT_WORKS
            r1.FIA(r0)
            goto L_0x0217
        L_0x00c2:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x00c7:
            java.lang.Object r0 = r9.A01
            X.1Xj r0 = (X.1Xj) r0
            X.1s9 r0 = r0.A1N()
            if (r0 == 0) goto L_0x00d8
            X.4bJ r1 = r0.BZ6()
            r0 = 1
            if (r1 != 0) goto L_0x00d9
        L_0x00d8:
            r0 = 0
        L_0x00d9:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r0)
            return r5
        L_0x00de:
            java.lang.Object r1 = r9.A01
            android.content.Context r1 = (android.content.Context) r1
            java.lang.Object r0 = r9.A02
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.2No r5 = new X.2No
            r5.<init>(r1, r0)
            return r5
        L_0x00ec:
            java.lang.Object r1 = r9.A01
            android.content.Context r1 = (android.content.Context) r1
            java.lang.Object r0 = r9.A02
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.2MR r5 = new X.2MR
            r5.<init>(r1, r0)
            return r5
        L_0x00fa:
            X.12T r1 = X.AnonymousClass12T.A00
            java.lang.Object r4 = r9.A02
            com.instagram.common.session.UserSession r4 = (com.instagram.common.session.UserSession) r4
            r0 = 789373697(0x2f0ce301, float:1.2813574E-10)
            X.19S r3 = X.DbY.A0r(r1, r0)
            r0 = 0
            X.0qQ.A0B(r4, r0)
            r0 = 16
            X.MMH r1 = new X.MMH
            r1.<init>(r4, r0)
            java.lang.Class<X.2N1> r0 = X.AnonymousClass2N1.class
            java.lang.Object r2 = r4.A01(r0, r1)
            X.2N1 r2 = (X.AnonymousClass2N1) r2
            java.lang.Object r0 = r9.A01
            android.content.Context r0 = (android.content.Context) r0
            android.content.Context r1 = X.DbT.A05(r0)
            r0 = 20
            X.Ivz r1 = A00(r1, r4, r0)
            java.lang.Class<X.2No> r0 = X.2No.class
            java.lang.Object r0 = r4.A01(r0, r1)
            X.2No r0 = (X.2No) r0
            X.2Mq r5 = new X.2Mq
            r5.<init>(r4, r0, r2, r3)
            return r5
        L_0x0136:
            r0 = 1
            X.C55366HgY.A00 = r0
            java.lang.Object r0 = r9.A02
            X.DbS.A1U(r0)
            java.lang.Object r0 = r9.A01
            X.7Pu r0 = (X.C331157Pu) r0
            r0.A07()
            goto L_0x0217
        L_0x0147:
            java.lang.Object r1 = r9.A02
            if (r1 == 0) goto L_0x0217
            java.lang.Object r0 = r9.A01
            X.C51965G9l.A1W(r0, r1)
            goto L_0x0217
        L_0x0152:
            java.lang.Object r1 = r9.A02
            X.0sP r1 = (X.0sP) r1
            java.lang.Object r0 = r9.A01
            goto L_0x01be
        L_0x0159:
            java.lang.Object r0 = r9.A02
            X.HDc r0 = (X.C54430HDc) r0
            X.05G r3 = r0.A01
        L_0x015f:
            java.lang.Object r2 = r3.getValue()
            r0 = r2
            X.MfE r0 = (X.C66920MfE) r0
            int r0 = r0.A01
            int r1 = r0 + -1
            r0 = 0
            boolean r0 = X.C51975G9x.A1a(r2, r3, r1, r0)
            if (r0 == 0) goto L_0x015f
            goto L_0x018a
        L_0x0172:
            java.lang.Object r0 = r9.A02
            X.HDc r0 = (X.C54430HDc) r0
            X.05G r3 = r0.A01
        L_0x0178:
            java.lang.Object r2 = r3.getValue()
            r0 = r2
            X.MfE r0 = (X.C66920MfE) r0
            int r0 = r0.A01
            int r1 = r0 + 1
            r0 = 1
            boolean r0 = X.C51975G9x.A1a(r2, r3, r1, r0)
            if (r0 == 0) goto L_0x0178
        L_0x018a:
            java.lang.Object r0 = r9.A01
            X.DbS.A1U(r0)
            goto L_0x0217
        L_0x0191:
            java.lang.Object r0 = r9.A02
            X.8ZA r0 = (X.AnonymousClass8ZA) r0
            java.lang.Object r3 = r9.A01
            X.8Z1 r2 = X.C51966G9m.A0y(r0)
            java.lang.Class<X.HDc> r1 = X.C54430HDc.class
            r0 = 20
            X.IwL r0 = X.C58712IwL.A01(r3, r0)
            X.3pa r5 = r2.A00(r1, r0)
            return r5
        L_0x01a8:
            java.lang.Object r0 = r9.A02
            X.H1Z r0 = (X.H1Z) r0
            X.0sP r1 = r0.A01
            if (r1 == 0) goto L_0x0217
            java.lang.Object r0 = r9.A01
            java.lang.Object r0 = X.C51966G9m.A18(r0)
            X.Gmv r0 = (X.C53371Gmv) r0
            boolean r0 = r0.A06
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
        L_0x01be:
            r1.invoke(r0)
            goto L_0x0217
        L_0x01c2:
            java.lang.Object r5 = r9.A02
            X.H1I r5 = (X.H1I) r5
            java.util.Map r1 = r5.A0A
            java.lang.String r0 = "saved"
            java.lang.Object r0 = r1.get(r0)
            X.2Rw r0 = (X.2Rw) r0
            r3 = 0
            if (r0 == 0) goto L_0x01da
            int r1 = r0.getItemCount()
            r0 = 1
            if (r1 == 0) goto L_0x01db
        L_0x01da:
            r0 = 0
        L_0x01db:
            r4 = 8
            java.lang.Object r6 = r9.A01
            X.HJb r6 = (X.C54566HJb) r6
            androidx.recyclerview.widget.RecyclerView r2 = r6.A02
            if (r0 == 0) goto L_0x022c
            X.2Rw r0 = r2.A0A
            if (r0 == 0) goto L_0x01ec
            r0.notifyDataSetChanged()
        L_0x01ec:
            X.0eM r8 = r6.A06
            android.view.View r7 = X.AnonymousClass7TH.A06(r8)
            boolean r0 = r7.isLaidOut()
            if (r0 == 0) goto L_0x0222
            boolean r0 = r7.isLayoutRequested()
            if (r0 != 0) goto L_0x0222
            r6.A00()
        L_0x0201:
            X.GhE r0 = X.C51969G9p.A0o(r5)
            boolean r0 = r0.A02
            if (r0 == 0) goto L_0x021a
            androidx.recyclerview.widget.RecyclerView r0 = r5.A01
            if (r0 == 0) goto L_0x0210
            r0.setVisibility(r4)
        L_0x0210:
            android.view.View r0 = r5.A00
            if (r0 == 0) goto L_0x0217
        L_0x0214:
            r0.setVisibility(r3)
        L_0x0217:
            X.0gF r5 = X.C60340gF.A00
            return r5
        L_0x021a:
            r2.setVisibility(r4)
            android.view.View r0 = X.AnonymousClass7TH.A06(r8)
            goto L_0x0214
        L_0x0222:
            r1 = 4
            X.ID7 r0 = new X.ID7
            r0.<init>(r6, r1)
            r7.addOnLayoutChangeListener(r0)
            goto L_0x0201
        L_0x022c:
            boolean r0 = r2.isLaidOut()
            if (r0 == 0) goto L_0x025c
            boolean r0 = r2.isLayoutRequested()
            if (r0 != 0) goto L_0x025c
            r6.A00()
        L_0x023b:
            X.GhE r0 = X.C51969G9p.A0o(r5)
            boolean r0 = r0.A02
            if (r0 == 0) goto L_0x0251
            androidx.recyclerview.widget.RecyclerView r0 = r5.A01
            if (r0 == 0) goto L_0x024a
            r0.setVisibility(r3)
        L_0x024a:
            android.view.View r0 = r5.A00
            if (r0 == 0) goto L_0x0251
            r0.setVisibility(r4)
        L_0x0251:
            r2.setVisibility(r3)
            X.0eM r0 = r6.A06
            android.view.View r0 = X.AnonymousClass7TH.A06(r0)
            r3 = 4
            goto L_0x0214
        L_0x025c:
            r1 = 5
            X.ID7 r0 = new X.ID7
            r0.<init>(r6, r1)
            r2.addOnLayoutChangeListener(r0)
            goto L_0x023b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58690Ivz.invoke():java.lang.Object");
    }
}
