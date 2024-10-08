package X;

/* renamed from: X.Ngs  reason: case insensitive filesystem */
public final class C69194Ngs extends AnonymousClass7AK {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C69194Ngs(C67178Mja mja, int i) {
        super(Integer.valueOf(i));
        this.A00 = 4;
        this.A01 = mja;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x004c, code lost:
        r2 = r4.getSession();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0052, code lost:
        if ((r2 instanceof com.instagram.common.session.UserSession) == false) goto L_0x0068;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0054, code lost:
        r1 = X.Dba.A0J(r4.requireActivity(), r2, X.2EG.A0k, r3);
        r1.A0S = "gdpr_consent_for_rageshake";
        r1.A0A();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0067, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0068, code lost:
        r2 = new android.content.Intent("android.intent.action.VIEW", X.0cp.A03(r3)).addCategory(X.Pxd.A00(6));
        X.0qQ.A07(r2);
        X.0b6.A00().A04().A0G(r4.getContext(), r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x008e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x008f, code lost:
        X.0qQ.A0F("bugReportLogger");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0098, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r6) {
        /*
            r5 = this;
            int r0 = r5.A00
            switch(r0) {
                case 1: goto L_0x003d;
                case 2: goto L_0x002d;
                case 3: goto L_0x0017;
                case 4: goto L_0x000b;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r5.A01
            X.DbS.A1U(r0)
            return
        L_0x000b:
            java.lang.Object r0 = r5.A01
            X.Mja r0 = (X.C67178Mja) r0
            X.MjK r0 = r0.A01
            X.Ma2 r0 = r0.A00
            r0.A11()
            return
        L_0x0017:
            java.lang.Object r0 = r5.A01
            X.NIk r0 = (X.C68447NIk) r0
            android.content.Context r3 = r0.requireContext()
            X.0eM r0 = r0.A0M
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r0)
            X.2EG r1 = X.2EG.A1V
            java.lang.String r0 = "https://m.facebook.com/policies/other-policies/ais-terms"
            X.Dbb.A0k(r3, r2, r1, r0)
            return
        L_0x002d:
            java.lang.Object r4 = r5.A01
            X.NJ2 r4 = (X.NJ2) r4
            X.F1f r1 = r4.A01
            if (r1 == 0) goto L_0x008f
            java.lang.Integer r0 = X.AnonymousClass05K.A0u
            r1.A00(r0)
            java.lang.String r3 = "https://help.instagram.com/192435014247952?ref=igapp"
            goto L_0x004c
        L_0x003d:
            java.lang.Object r4 = r5.A01
            X.NJ2 r4 = (X.NJ2) r4
            X.F1f r1 = r4.A01
            if (r1 == 0) goto L_0x008f
            java.lang.Integer r0 = X.AnonymousClass05K.A15
            r1.A00(r0)
            java.lang.String r3 = "https://i.instagram.com/legal/privacy/"
        L_0x004c:
            X.0wW r2 = r4.getSession()
            boolean r0 = r2 instanceof com.instagram.common.session.UserSession
            if (r0 == 0) goto L_0x0068
            androidx.fragment.app.FragmentActivity r1 = r4.requireActivity()
            com.instagram.common.session.UserSession r2 = (com.instagram.common.session.UserSession) r2
            X.2EG r0 = X.2EG.A0k
            X.SUL r1 = X.Dba.A0J(r1, r2, r0, r3)
            java.lang.String r0 = "gdpr_consent_for_rageshake"
            r1.A0S = r0
            r1.A0A()
            return
        L_0x0068:
            android.net.Uri r2 = X.0cp.A03(r3)
            java.lang.String r0 = "android.intent.action.VIEW"
            android.content.Intent r1 = new android.content.Intent
            r1.<init>(r0, r2)
            r0 = 6
            java.lang.String r0 = X.Pxd.A00(r0)
            android.content.Intent r2 = r1.addCategory(r0)
            X.0qQ.A07(r2)
            X.0b6 r0 = X.0b6.A00()
            X.0R8 r1 = r0.A04()
            android.content.Context r0 = r4.getContext()
            r1.A0G(r0, r2)
            return
        L_0x008f:
            java.lang.String r0 = "bugReportLogger"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C69194Ngs.onClick(android.view.View):void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C69194Ngs(NJ2 nj2, int i, int i2) {
        super(Integer.valueOf(i));
        this.A00 = i2;
        this.A01 = nj2;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C69194Ngs(C62320sa r2, int i, int i2) {
        super(Integer.valueOf(i));
        this.A00 = i2;
        this.A01 = r2;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C69194Ngs(C68447NIk nIk, int i) {
        super(Integer.valueOf(i));
        this.A00 = 3;
        this.A01 = nIk;
    }
}
