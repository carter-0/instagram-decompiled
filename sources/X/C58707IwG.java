package X;

/* renamed from: X.IwG  reason: case insensitive filesystem */
public final class C58707IwG extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58707IwG(C53008Ggz ggz, int i) {
        super(0);
        this.A00 = i;
        this.A01 = ggz;
    }

    public static C58707IwG A00(C286575Wy r1, Object obj, int i) {
        C58707IwG iwG = new C58707IwG(obj, i);
        r1.FLL(iwG);
        return iwG;
    }

    /* JADX WARNING: type inference failed for: r2v8, types: [X.6Qm, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r3v0, types: [X.6Qp, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r9v0, types: [java.lang.Object, X.2nt] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0328, code lost:
        return java.lang.Boolean.valueOf(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:?, code lost:
        return X.C60340gF.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0072, code lost:
        X.AnonymousClass7TE.A1Z(new X.MH8((java.lang.Object) r4, r2, r1), r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00a4, code lost:
        r1.invoke(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x013b, code lost:
        if (X.C51971G9r.A1X(r1.A00) == false) goto L_0x013d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            r14 = this;
            int r0 = r14.A00
            switch(r0) {
                case 0: goto L_0x010a;
                case 1: goto L_0x0115;
                case 2: goto L_0x0120;
                case 3: goto L_0x0148;
                case 4: goto L_0x000d;
                case 5: goto L_0x0015;
                case 6: goto L_0x001f;
                case 7: goto L_0x014f;
                case 8: goto L_0x015e;
                case 9: goto L_0x0044;
                case 10: goto L_0x0005;
                case 11: goto L_0x0005;
                case 12: goto L_0x016d;
                case 13: goto L_0x0177;
                case 14: goto L_0x0181;
                case 15: goto L_0x018b;
                case 16: goto L_0x0195;
                case 17: goto L_0x01a2;
                case 18: goto L_0x0195;
                case 19: goto L_0x00ef;
                case 20: goto L_0x005d;
                case 21: goto L_0x013d;
                case 22: goto L_0x0068;
                case 23: goto L_0x0005;
                case 24: goto L_0x0005;
                case 25: goto L_0x01af;
                case 26: goto L_0x007b;
                case 27: goto L_0x0093;
                case 28: goto L_0x009c;
                case 29: goto L_0x0005;
                case 30: goto L_0x01b9;
                case 31: goto L_0x01c3;
                case 32: goto L_0x00a9;
                case 33: goto L_0x01d1;
                case 34: goto L_0x01db;
                case 35: goto L_0x01ea;
                case 36: goto L_0x01fb;
                case 37: goto L_0x0208;
                case 38: goto L_0x0215;
                case 39: goto L_0x00a9;
                case 40: goto L_0x00b3;
                case 41: goto L_0x00d7;
                case 42: goto L_0x0005;
                case 43: goto L_0x0226;
                case 44: goto L_0x02de;
                case 45: goto L_0x02e9;
                case 46: goto L_0x02fb;
                case 47: goto L_0x0305;
                case 48: goto L_0x030f;
                case 49: goto L_0x0319;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r14.A01
            X.DbS.A1U(r0)
        L_0x000a:
            X.0gF r2 = X.C60340gF.A00
        L_0x000c:
            return r2
        L_0x000d:
            java.lang.Object r0 = r14.A01
            X.6D8 r0 = (X.AnonymousClass6D8) r0
            r0.A00()
            goto L_0x000a
        L_0x0015:
            java.lang.Object r1 = r14.A01
            X.6D9 r1 = (X.AnonymousClass6D9) r1
            java.lang.String r0 = "Seek start"
            r1.A03(r0)
            goto L_0x000a
        L_0x001f:
            java.lang.Object r3 = r14.A01
            X.6D9 r3 = (X.AnonymousClass6D9) r3
            X.5Oz r0 = r3.A09
            float r1 = X.C51971G9r.A02(r0)
            X.Tol r2 = X.AnonymousClass6D9.A00(r3)
            X.Tol r0 = X.AnonymousClass6D9.A00(r3)
            X.4M3 r0 = r0.A06
            int r0 = r0.AzN()
            float r0 = (float) r0
            float r1 = r1 * r0
            int r0 = (int) r1
            r1 = 1
            r2.A05(r0, r1)
            java.lang.String r0 = "Seek end"
            r3.A05(r0, r1)
            goto L_0x000a
        L_0x0044:
            java.lang.Object r1 = r14.A01
            X.5WW r1 = (X.AnonymousClass5WW) r1
            X.4bM r0 = X.C286955Yl.A00
            java.lang.Object r0 = X.C288795cU.A00(r0, r1)
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            r1.A02 = r0
            X.4bM r0 = X.C286935Yj.A00
            java.lang.Object r0 = X.C288795cU.A00(r0, r1)
            X.4DU r0 = (X.AnonymousClass4DU) r0
            r1.A03 = r0
            goto L_0x000a
        L_0x005d:
            java.lang.Object r0 = r14.A01
            X.Ggz r0 = (X.C53008Ggz) r0
            X.HpH r4 = r0.A03
            X.4Cq r3 = r4.A0F
            r2 = 0
            r1 = 6
            goto L_0x0072
        L_0x0068:
            java.lang.Object r0 = r14.A01
            X.Ggz r0 = (X.C53008Ggz) r0
            X.HpH r4 = r0.A03
            X.4Cq r3 = r4.A0F
            r2 = 0
            r1 = 7
        L_0x0072:
            X.MH8 r0 = new X.MH8
            r0.<init>((java.lang.Object) r4, (X.AnonymousClass4D7) r2, (int) r1)
            X.AnonymousClass7TE.A1Z(r0, r3)
            goto L_0x000a
        L_0x007b:
            java.lang.Object r3 = r14.A01
            X.0lg r3 = (X.0lg) r3
            X.0Tu r2 = X.0Tu.A05
            r0 = 36883663015051792(0x83097f00070210, double:3.3887152370842274E-306)
            java.lang.String r2 = X.182.A04(r2, r3, r0)
            int r0 = r2.length()
            if (r0 != 0) goto L_0x000c
            java.lang.String r2 = "great_account_app_start_impression_count"
            return r2
        L_0x0093:
            java.lang.Object r1 = r14.A01
            X.0sP r1 = (X.0sP) r1
            if (r1 == 0) goto L_0x000a
            java.lang.String r0 = "attribution_header"
            goto L_0x00a4
        L_0x009c:
            java.lang.Object r1 = r14.A01
            X.0sP r1 = (X.0sP) r1
            if (r1 == 0) goto L_0x000a
            java.lang.String r0 = "usage_count_button"
        L_0x00a4:
            r1.invoke(r0)
            goto L_0x000a
        L_0x00a9:
            java.lang.Object r1 = r14.A01
            X.5Oz r1 = (X.C284945Oz) r1
            r0 = 0
            r1.Epw(r0)
            goto L_0x000a
        L_0x00b3:
            java.lang.Object r0 = r14.A01
            X.Ggz r0 = (X.C53008Ggz) r0
            X.05G r5 = r0.A0C
        L_0x00b9:
            java.lang.Object r4 = r5.getValue()
            r0 = r4
            X.JwF r0 = (X.C61077JwF) r0
            java.lang.Object r3 = r0.A00
            X.GmK r3 = (X.C53334GmK) r3
            java.lang.String r2 = r0.A01
            r1 = 0
            X.AnonymousClass7TF.A1B(r3, r1, r2)
            X.JwF r0 = new X.JwF
            r0.<init>((X.C53334GmK) r3, (java.lang.String) r2, (boolean) r1)
            boolean r0 = r5.AIY(r4, r0)
            if (r0 == 0) goto L_0x00b9
            goto L_0x000a
        L_0x00d7:
            java.lang.Object r0 = r14.A01
            X.Ggz r0 = (X.C53008Ggz) r0
            X.HpH r0 = r0.A03
            X.I0E r0 = r0.A05
            X.IPQ r2 = r0.A02
            X.1FE r0 = r0.A03
            long r0 = r0.now()
            r2.A02(r0)
            r2.A01()
            goto L_0x000a
        L_0x00ef:
            java.lang.Object r0 = r14.A01
            androidx.compose.foundation.lazy.LazyListState r0 = (androidx.compose.foundation.lazy.LazyListState) r0
            X.6Gl r0 = r0.A02()
            X.6Gk r0 = (X.C305076Gk) r0
            java.util.List r0 = r0.A0D
            java.lang.Object r0 = X.00k.A0L(r0)
            X.6JM r0 = (X.AnonymousClass6JM) r0
            if (r0 == 0) goto L_0x0108
            X.6JK r0 = (X.AnonymousClass6JK) r0
            java.lang.Object r2 = r0.A0B
            return r2
        L_0x0108:
            r2 = 0
            return r2
        L_0x010a:
            java.lang.Object r0 = r14.A01
            X.6D8 r0 = (X.AnonymousClass6D8) r0
            X.4gU r0 = r0.A02
            java.lang.Object r2 = r0.getValue()
            return r2
        L_0x0115:
            java.lang.Object r0 = r14.A01
            X.6D8 r0 = (X.AnonymousClass6D8) r0
            X.4gU r0 = r0.A01
            java.lang.Object r2 = r0.getValue()
            return r2
        L_0x0120:
            java.lang.Object r1 = r14.A01
            X.6D8 r1 = (X.AnonymousClass6D8) r1
            X.4gU r0 = r1.A03
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            if (r0 == 0) goto L_0x0140
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x013d
            X.4gU r0 = r1.A00
            boolean r1 = X.C51971G9r.A1X(r0)
            r0 = 1
            if (r1 != 0) goto L_0x0324
        L_0x013d:
            r0 = 0
            goto L_0x0324
        L_0x0140:
            X.4gU r0 = r1.A00
            boolean r0 = X.C51971G9r.A1X(r0)
            goto L_0x0324
        L_0x0148:
            java.lang.Object r0 = r14.A01
            java.lang.Object r2 = X.C51966G9m.A18(r0)
            return r2
        L_0x014f:
            java.lang.Object r0 = r14.A01
            X.6D9 r0 = (X.AnonymousClass6D9) r0
            X.5Oz r0 = r0.A09
            float r0 = X.C51971G9r.A02(r0)
            java.lang.Float r2 = java.lang.Float.valueOf(r0)
            return r2
        L_0x015e:
            java.lang.Object r0 = r14.A01
            X.6C3 r0 = (X.AnonymousClass6C3) r0
            X.5Oz r0 = r0.A06
            int r0 = X.C51971G9r.A0B(r0)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            return r2
        L_0x016d:
            java.lang.Object r0 = r14.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.6DR r2 = new X.6DR
            r2.<init>(r0)
            return r2
        L_0x0177:
            java.lang.Object r0 = r14.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            com.instagram.barcelona.location.api.LocationRepository r2 = new com.instagram.barcelona.location.api.LocationRepository
            r2.<init>(r0)
            return r2
        L_0x0181:
            java.lang.Object r0 = r14.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.Hzb r2 = new X.Hzb
            r2.<init>(r0)
            return r2
        L_0x018b:
            java.lang.Object r0 = r14.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.HDg r2 = new X.HDg
            r2.<init>(r0)
            return r2
        L_0x0195:
            java.lang.Object r0 = r14.A01
            androidx.compose.foundation.lazy.LazyListState r0 = (androidx.compose.foundation.lazy.LazyListState) r0
            boolean r0 = r0.CbH()
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
            return r2
        L_0x01a2:
            java.lang.Object r0 = r14.A01
            androidx.compose.foundation.lazy.LazyListState r0 = (androidx.compose.foundation.lazy.LazyListState) r0
            int r0 = r0.A00()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            return r2
        L_0x01af:
            java.lang.Object r0 = r14.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.HkL r2 = new X.HkL
            r2.<init>(r0)
            return r2
        L_0x01b9:
            java.lang.Object r0 = r14.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            com.instagram.barcelona.search.data.SearchTopicsRepository r2 = new com.instagram.barcelona.search.data.SearchTopicsRepository
            r2.<init>(r0)
            return r2
        L_0x01c3:
            java.lang.Object r0 = r14.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.1Av r0 = X.1Au.A00(r0)
            X.Hm2 r2 = new X.Hm2
            r2.<init>(r0)
            return r2
        L_0x01d1:
            java.lang.Object r0 = r14.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            com.instagram.barcelona.weblink.data.FetchLinkMetadataCache r2 = new com.instagram.barcelona.weblink.data.FetchLinkMetadataCache
            r2.<init>(r0)
            return r2
        L_0x01db:
            java.lang.Object r0 = r14.A01
            X.GzY r0 = (X.C54103GzY) r0
            androidx.fragment.app.FragmentActivity r1 = r0.requireActivity()
            X.0eM r0 = r0.A05
            X.6Yo r2 = X.DbX.A0N(r1, r0)
            return r2
        L_0x01ea:
            java.lang.Object r0 = r14.A01
            X.GzY r0 = (X.C54103GzY) r0
            X.0eM r0 = r0.A04
            java.lang.String r2 = X.DbS.A0t(r0)
            r1 = 1
            r0 = 0
            X.2kQ r2 = X.C227942kP.A01(r2, r1, r0)
            return r2
        L_0x01fb:
            X.0eE r1 = X.AnonymousClass0t1.A01
            java.lang.Object r0 = r14.A01
            X.GzY r0 = (X.C54103GzY) r0
            X.0eM r0 = r0.A05
            com.instagram.user.model.User r2 = X.DbX.A0l(r1, r0)
            return r2
        L_0x0208:
            java.lang.Object r0 = r14.A01
            android.os.Bundle r1 = X.DbS.A0B(r0)
            java.lang.String r0 = "module_name"
            java.lang.String r2 = X.C320236s2.A01(r1, r0)
            return r2
        L_0x0215:
            java.lang.Object r0 = r14.A01
            android.os.Bundle r1 = X.DbS.A0B(r0)
            r0 = 411(0x19b, float:5.76E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            java.lang.String r2 = X.C320236s2.A01(r1, r0)
            return r2
        L_0x0226:
            java.lang.Object r5 = r14.A01
            X.0lg r5 = (X.0lg) r5
            r0 = 1
            X.0qQ.A0B(r5, r0)
            X.6Qm r2 = new X.6Qm
            r2.<init>()
            X.6Qn r11 = X.C307546Qn.A01
            X.1L7 r0 = X.1L7.A01()
            r7 = 1425242459(0x54f3795b, float:8.3657045E12)
            X.1LU r4 = r0.A04(r7)
            X.6Qp r3 = new X.6Qp
            r3.<init>()
            X.0wX r0 = r5.getDeviceSession()
            android.content.Context r6 = r0.A06()
            r8 = 0
            android.content.res.AssetManager r1 = r6.getAssets()     // Catch:{ FileNotFoundException -> 0x027b }
            java.lang.String r0 = "bundles.json"
            java.io.InputStream r0 = r1.open(r0)     // Catch:{ FileNotFoundException -> 0x027b }
            X.0qQ.A07(r0)     // Catch:{ FileNotFoundException -> 0x027b }
            java.io.InputStreamReader r1 = new java.io.InputStreamReader     // Catch:{ FileNotFoundException -> 0x027b }
            r1.<init>(r0)     // Catch:{ FileNotFoundException -> 0x027b }
            java.io.BufferedReader r0 = new java.io.BufferedReader     // Catch:{ FileNotFoundException -> 0x027b }
            r0.<init>(r1)     // Catch:{ FileNotFoundException -> 0x027b }
            java.lang.String r0 = X.1r9.A00(r0)     // Catch:{ FileNotFoundException -> 0x027b }
            X.6Qq r1 = new X.6Qq     // Catch:{ FileNotFoundException -> 0x027b }
            r1.<init>(r0)     // Catch:{ FileNotFoundException -> 0x027b }
            android.content.res.AssetManager r0 = r6.getAssets()
            X.0qQ.A07(r0)
            X.6Qu r8 = new X.6Qu
            r8.<init>(r0, r1, r3)
            goto L_0x0283
        L_0x027b:
            r3 = move-exception
            java.lang.String r1 = "IgComponentQueryStoreProvider"
            java.lang.String r0 = "Could not prepackaged config files"
            X.1Kn.A00(r8, r1, r0, r3)
        L_0x0283:
            X.6Qy r3 = new X.6Qy
            r3.<init>()
            X.6R1 r1 = new X.6R1
            r1.<init>(r4)
            X.6R2 r0 = new X.6R2
            r0.<init>(r1, r11)
            X.6R6 r4 = new X.6R6
            r4.<init>(r0, r3, r11)
            X.6R6 r1 = X.AnonymousClass6R7.A00
            if (r1 != 0) goto L_0x02b9
            X.1L7 r0 = X.1L7.A01()
            X.1LU r0 = r0.A04(r7)
            X.6Qy r3 = new X.6Qy
            r3.<init>()
            X.6R1 r1 = new X.6R1
            r1.<init>(r0)
            X.6R2 r0 = new X.6R2
            r0.<init>(r1, r11)
            X.6R6 r1 = new X.6R6
            r1.<init>(r0, r3, r11)
            X.AnonymousClass6R7.A00 = r1
        L_0x02b9:
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.common.bloks.componentquery.cache.BloksComponentQueryWriteThroughCache"
            X.0qQ.A0C(r1, r0)
            X.19e r0 = X.19e.A01()
            X.6Q4 r10 = new X.6Q4
            r10.<init>(r6, r0)
            X.6R8 r12 = new X.6R8
            r12.<init>(r5)
            X.6R9 r9 = new X.6R9
            r9.<init>()
            X.6RA r13 = new X.6RA
            r13.<init>(r8, r4, r1)
            X.6RB r7 = new X.6RB
            r7.<init>(r8, r9, r10, r11, r12, r13)
            r2.A00 = r7
            return r2
        L_0x02de:
            java.lang.Object r0 = r14.A01
            X.FXh r0 = (X.C50302FXh) r0
            X.6Rm r0 = r0.A07
            androidx.fragment.app.FragmentActivity r2 = X.C308206Td.A03(r0)
            return r2
        L_0x02e9:
            java.lang.Object r0 = r14.A01
            X.FXh r0 = (X.C50302FXh) r0
            X.4tV r2 = r0.A08
            r1 = 53
            r0 = 0
            boolean r0 = r2.A0R(r1, r0)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
            return r2
        L_0x02fb:
            java.lang.Object r0 = r14.A01
            android.content.Context r0 = (android.content.Context) r0
            android.view.View r2 = new android.view.View
            r2.<init>(r0)
            return r2
        L_0x0305:
            java.lang.Object r0 = r14.A01
            android.content.Context r0 = (android.content.Context) r0
            com.instagram.common.ui.widget.imageview.IgImageView r2 = new com.instagram.common.ui.widget.imageview.IgImageView
            r2.<init>(r0)
            return r2
        L_0x030f:
            java.lang.Object r0 = r14.A01
            android.content.Context r0 = (android.content.Context) r0
            android.widget.TextView r2 = new android.widget.TextView
            r2.<init>(r0)
            return r2
        L_0x0319:
            X.0Tu r2 = X.0Tu.A05
            r0 = 2324148439002193579(0x204108b100011eab, double:2.5409001821817883E-153)
            boolean r0 = X.1AW.A06(r2, r0)
        L_0x0324:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58707IwG.invoke():java.lang.Object");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58707IwG(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }
}
