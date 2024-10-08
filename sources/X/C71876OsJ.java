package X;

/* renamed from: X.OsJ  reason: case insensitive filesystem */
public final class C71876OsJ implements C360008dq {
    public final int A00;
    public final Object A01;

    public C71876OsJ(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x010e, code lost:
        X.C59689JTv.A00(r2, r1, r0, r4);
        r1 = ((X.C385519j4) r8).A00.getCause();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0119, code lost:
        if (r1 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x011b, code lost:
        r0 = r3.A0F;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x013f, code lost:
        X.11Z.A03(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0142, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0033, code lost:
        X.0wb.A07(r0.getModuleName(), r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DfA(X.C360018dr r8) {
        /*
            r7 = this;
            int r0 = r7.A00
            switch(r0) {
                case 0: goto L_0x00ef;
                case 1: goto L_0x00ae;
                case 2: goto L_0x005d;
                default: goto L_0x0005;
            }
        L_0x0005:
            r4 = 0
            X.0qQ.A0B(r8, r4)
            boolean r0 = r8 instanceof X.C385519j4
            if (r0 == 0) goto L_0x003b
            java.lang.Object r3 = r7.A01
            X.GCg r3 = (X.C52034GCg) r3
            X.4DH r0 = r3.A05
            android.content.Context r2 = r0.requireContext()
            android.content.Context r1 = r0.requireContext()
            r0 = 2131968258(0x7f134102, float:1.9573406E38)
            java.lang.String r1 = r1.getString(r0)
            java.lang.String r0 = "bloks_feed_injection_network_error"
            X.C59689JTv.A00(r2, r1, r0, r4)
            X.9j4 r8 = (X.C385519j4) r8
            java.lang.Throwable r0 = r8.A00
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x003a
            X.4DU r0 = r3.A0C
        L_0x0033:
            java.lang.String r0 = r0.getModuleName()
            X.0wb.A07(r0, r1)
        L_0x003a:
            return
        L_0x003b:
            boolean r0 = r8 instanceof X.C361128fi
            if (r0 == 0) goto L_0x003a
            X.8fi r8 = (X.C361128fi) r8
            X.68u r0 = r8.A00
            X.Di0 r4 = X.C46620Di0.A00(r0)
            java.lang.Object r0 = r7.A01
            X.GCg r0 = (X.C52034GCg) r0
            com.instagram.common.session.UserSession r3 = r0.A0B
            X.4DH r2 = r0.A05
            X.4DU r1 = r0.A0C
            r0 = 0
            X.2nI r0 = X.C229382nI.A02(r2, r1, r3, r0)
            X.PZv r1 = new X.PZv
            r1.<init>(r0, r4)
            goto L_0x013f
        L_0x005d:
            r1 = 0
            X.0qQ.A0B(r8, r1)
            boolean r0 = r8 instanceof X.C361128fi
            if (r0 == 0) goto L_0x0143
            r0 = r8
            X.8fi r0 = (X.C361128fi) r0
            X.68u r0 = r0.A00
            X.Di0 r4 = X.C46620Di0.A00(r0)
            java.lang.Object r6 = r7.A01
            X.Mqm r6 = (X.C67614Mqm) r6
            X.XFn r0 = X.C21123XFn.FETCHING_DONE
            X.C67614Mqm.A00(r0, r6)
            X.F3r r5 = r6.A08
            X.8fh r0 = r8.A00
            int r0 = r0.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r5.A04(r0)
            r0 = 1
            r6.A01 = r0
            r6.A02 = r1
            X.7Pu r3 = r6.A00
            if (r3 == 0) goto L_0x003a
            com.instagram.common.session.UserSession r2 = r6.A06
            androidx.fragment.app.FragmentActivity r1 = r6.A03
            X.0iw r0 = r6.A05
            X.2nI r2 = X.C229382nI.A04(r1, r0, r2)
            r0 = 2131428979(0x7f0b0673, float:1.8479618E38)
            android.util.SparseArray r1 = r2.A01
            r1.put(r0, r3)
            r0 = 2131435100(0x7f0b1e5c, float:1.8492033E38)
            r1.put(r0, r5)
            X.PZt r0 = new X.PZt
            r0.<init>(r2, r4)
            X.11Z.A02(r0)
            return
        L_0x00ae:
            r4 = 0
            X.0qQ.A0B(r8, r4)
            boolean r0 = r8 instanceof X.C385519j4
            if (r0 == 0) goto L_0x00ce
            java.lang.Object r3 = r7.A01
            X.IHg r3 = (X.C56911IHg) r3
            androidx.fragment.app.Fragment r0 = r3.A04
            android.content.Context r2 = r0.requireContext()
            android.content.Context r1 = r0.requireContext()
            r0 = 2131968258(0x7f134102, float:1.9573406E38)
            java.lang.String r1 = r1.getString(r0)
            java.lang.String r0 = "bloks_feed_injection_network_error"
            goto L_0x010e
        L_0x00ce:
            boolean r0 = r8 instanceof X.C361128fi
            if (r0 == 0) goto L_0x003a
            X.8fi r8 = (X.C361128fi) r8
            X.68u r0 = r8.A00
            X.Di0 r4 = X.C46620Di0.A00(r0)
            java.lang.Object r0 = r7.A01
            X.IHg r0 = (X.C56911IHg) r0
            com.instagram.common.session.UserSession r3 = r0.A0A
            androidx.fragment.app.Fragment r2 = r0.A04
            X.4DU r1 = r0.A0F
            r0 = 0
            X.2nI r0 = X.C229382nI.A02(r2, r1, r3, r0)
            X.PZP r1 = new X.PZP
            r1.<init>(r0, r4)
            goto L_0x013f
        L_0x00ef:
            r4 = 0
            X.0qQ.A0B(r8, r4)
            boolean r0 = r8 instanceof X.C385519j4
            if (r0 == 0) goto L_0x011f
            java.lang.Object r3 = r7.A01
            X.IHg r3 = (X.C56911IHg) r3
            androidx.fragment.app.Fragment r0 = r3.A04
            android.content.Context r2 = r0.requireContext()
            android.content.Context r1 = r0.requireContext()
            r0 = 2131968258(0x7f134102, float:1.9573406E38)
            java.lang.String r1 = r1.getString(r0)
            java.lang.String r0 = "bloks_suggested_comments_network_error"
        L_0x010e:
            X.C59689JTv.A00(r2, r1, r0, r4)
            X.9j4 r8 = (X.C385519j4) r8
            java.lang.Throwable r0 = r8.A00
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x003a
            X.4DU r0 = r3.A0F
            goto L_0x0033
        L_0x011f:
            boolean r0 = r8 instanceof X.C361128fi
            if (r0 == 0) goto L_0x003a
            X.8fi r8 = (X.C361128fi) r8
            X.68u r0 = r8.A00
            X.Di0 r4 = X.C46620Di0.A00(r0)
            java.lang.Object r0 = r7.A01
            X.IHg r0 = (X.C56911IHg) r0
            com.instagram.common.session.UserSession r3 = r0.A0A
            androidx.fragment.app.Fragment r2 = r0.A04
            X.4DU r1 = r0.A0F
            r0 = 0
            X.2nI r0 = X.C229382nI.A02(r2, r1, r3, r0)
            X.PZO r1 = new X.PZO
            r1.<init>(r0, r4)
        L_0x013f:
            X.11Z.A03(r1)
            return
        L_0x0143:
            java.lang.Object r3 = r7.A01
            X.Mqm r3 = (X.C67614Mqm) r3
            com.instagram.common.session.UserSession r2 = r3.A06
            java.lang.String r1 = r3.A0A
            java.util.Map r0 = r3.A0C
            X.8ey r2 = X.C359988do.A05(r2, r1, r0)
            r1 = 25
            X.E84 r0 = new X.E84
            r0.<init>(r3, r1)
            r2.A00(r0)
            X.1ES.A03(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71876OsJ.DfA(X.8dr):void");
    }
}
