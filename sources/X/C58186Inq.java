package X;

/* renamed from: X.Inq  reason: case insensitive filesystem */
public final class C58186Inq extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;
    public final Object A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58186Inq(int i, Object obj, Object obj2) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:100:?, code lost:
        return X.C60340gF.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0106, code lost:
        if (r2.A03.A02 == false) goto L_0x0113;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0111, code lost:
        if (r2.A03.A02 != false) goto L_0x0113;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0113, code lost:
        ((X.C242813Wa) r7.A01).DbT(r2.A02.A01);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0212, code lost:
        r1.invoke(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0369, code lost:
        return java.lang.Integer.valueOf(r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            r7 = this;
            int r0 = r7.A00
            switch(r0) {
                case 0: goto L_0x0018;
                case 1: goto L_0x0217;
                case 2: goto L_0x0026;
                case 3: goto L_0x0045;
                case 4: goto L_0x0026;
                case 5: goto L_0x007d;
                case 6: goto L_0x0229;
                case 7: goto L_0x0026;
                case 8: goto L_0x009a;
                case 9: goto L_0x00ad;
                case 10: goto L_0x00ad;
                case 11: goto L_0x00ad;
                case 12: goto L_0x00b9;
                case 13: goto L_0x00ca;
                case 14: goto L_0x0238;
                case 15: goto L_0x0248;
                case 16: goto L_0x026b;
                case 17: goto L_0x0286;
                case 18: goto L_0x02a3;
                case 19: goto L_0x02b8;
                case 20: goto L_0x02d5;
                case 21: goto L_0x0248;
                case 22: goto L_0x026b;
                case 23: goto L_0x0286;
                case 24: goto L_0x02a3;
                case 25: goto L_0x030a;
                case 26: goto L_0x0238;
                case 27: goto L_0x0323;
                case 28: goto L_0x00d7;
                case 29: goto L_0x0323;
                case 30: goto L_0x00f0;
                case 31: goto L_0x00fe;
                case 32: goto L_0x0109;
                case 33: goto L_0x0120;
                case 34: goto L_0x0134;
                case 35: goto L_0x0334;
                case 36: goto L_0x0147;
                case 37: goto L_0x015d;
                case 38: goto L_0x016e;
                case 39: goto L_0x0005;
                case 40: goto L_0x0005;
                case 41: goto L_0x0005;
                case 42: goto L_0x018f;
                case 43: goto L_0x01bd;
                case 44: goto L_0x01dc;
                case 45: goto L_0x01f1;
                case 46: goto L_0x0005;
                case 47: goto L_0x0206;
                case 48: goto L_0x0354;
                case 49: goto L_0x036a;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r1 = r7.A02
            android.view.View r1 = (android.view.View) r1
            r0 = 0
            r1.setOnTouchListener(r0)
            java.lang.Object r1 = r7.A01
            com.instagram.feed.widget.IgProgressImageView r1 = (com.instagram.feed.widget.IgProgressImageView) r1
            r0 = 1
            r1.A0B(r0)
        L_0x0015:
            X.0gF r4 = X.C60340gF.A00
        L_0x0017:
            return r4
        L_0x0018:
            java.lang.Object r0 = r7.A01
            java.lang.Object r0 = X.C51966G9m.A17(r0)
            if (r0 == 0) goto L_0x0015
            java.lang.Object r0 = r7.A02
            X.DbS.A1U(r0)
            goto L_0x0015
        L_0x0026:
            java.lang.Object r0 = r7.A01
            X.0sa r0 = (X.C62320sa) r0
            if (r0 == 0) goto L_0x0032
            java.lang.Object r4 = r0.invoke()
            if (r4 != 0) goto L_0x0017
        L_0x0032:
            java.lang.Object r0 = r7.A02
            X.07g r1 = X.C51969G9p.A0c(r0)
            boolean r0 = r1 instanceof X.AnonymousClass07P
            if (r0 == 0) goto L_0x0381
            X.07P r1 = (X.AnonymousClass07P) r1
            if (r1 == 0) goto L_0x0381
            X.2YQ r4 = r1.getDefaultViewModelCreationExtras()
            return r4
        L_0x0045:
            java.lang.Object r1 = r7.A02
            X.H19 r1 = (X.H19) r1
            java.lang.Object r0 = r7.A01
            X.GMQ r0 = (X.GMQ) r0
            java.lang.Object r3 = r0.A05
            X.1Xj r3 = (X.1Xj) r3
            if (r3 == 0) goto L_0x0015
            java.util.ArrayList r6 = X.AnonymousClass7TE.A1C()
            com.instagram.user.model.User r0 = X.C51966G9m.A11(r3)
            if (r0 == 0) goto L_0x0060
            r6.add(r0)
        L_0x0060:
            X.1Xy r0 = r3.A0C
            java.util.List r0 = r0.Aay()
            if (r0 == 0) goto L_0x006b
            r6.addAll(r0)
        L_0x006b:
            X.0eM r0 = r1.A01
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r0)
            r0 = 2131975422(0x7f135cfe, float:1.9587936E38)
            java.lang.String r5 = r1.getString(r0)
            r4 = r1
            X.LTZ.A0C(r1, r2, r3, r4, r5, r6)
            goto L_0x0015
        L_0x007d:
            java.lang.Object r0 = r7.A01
            X.07g r1 = X.C51969G9p.A0c(r0)
            boolean r0 = r1 instanceof X.AnonymousClass07P
            if (r0 == 0) goto L_0x0091
            X.07P r1 = (X.AnonymousClass07P) r1
            if (r1 == 0) goto L_0x0091
            X.2YM r4 = r1.getDefaultViewModelProviderFactory()
            if (r4 != 0) goto L_0x0017
        L_0x0091:
            java.lang.Object r0 = r7.A02
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            X.2YM r4 = r0.getDefaultViewModelProviderFactory()
            return r4
        L_0x009a:
            java.lang.Object r4 = r7.A01
            X.4Cq r4 = (X.C262224Cq) r4
            java.lang.Object r3 = r7.A02
            r2 = 0
            r1 = 12
            X.MG8 r0 = new X.MG8
            r0.<init>(r3, r2, r1)
            X.AnonymousClass7TE.A1Z(r0, r4)
            goto L_0x0015
        L_0x00ad:
            java.lang.Object r1 = r7.A01
            X.0sP r1 = (X.0sP) r1
            java.lang.Object r0 = r7.A02
            X.9J3 r0 = (X.AnonymousClass9J3) r0
            java.lang.String r0 = r0.A03
            goto L_0x0212
        L_0x00b9:
            java.lang.Object r0 = r7.A02
            java.lang.String r1 = X.C51966G9m.A1E(r0)
            if (r1 == 0) goto L_0x0015
            java.lang.Object r0 = r7.A01
            X.JPP r0 = (X.JPP) r0
            r0.D2A(r1)
            goto L_0x0015
        L_0x00ca:
            java.lang.Object r1 = r7.A01
            X.JPQ r1 = (X.JPQ) r1
            java.lang.Object r0 = r7.A02
            X.1Xj r0 = (X.1Xj) r0
            r1.Dit(r0)
            goto L_0x0015
        L_0x00d7:
            java.lang.Object r1 = r7.A01
            X.Him r1 = (X.C55504Him) r1
            java.lang.Object r2 = r7.A02
            X.N4R r2 = (X.N4R) r2
            r0 = 0
            X.0qQ.A0B(r2, r0)
            X.Hil r0 = r1.A00
            X.3Wa r1 = r0.A00
            java.lang.Object r0 = r2.A02
            X.1Xj r0 = (X.1Xj) r0
            r1.D44(r0)
            goto L_0x0015
        L_0x00f0:
            java.lang.Object r0 = r7.A02
            if (r0 == 0) goto L_0x0015
            java.lang.Object r1 = r7.A01
            android.view.View r1 = (android.view.View) r1
            r0 = 0
            r1.setVisibility(r0)
            goto L_0x01b7
        L_0x00fe:
            java.lang.Object r2 = r7.A02
            X.3ZU r2 = (X.AnonymousClass3ZU) r2
            X.3ZS r0 = r2.A03
            boolean r0 = r0.A02
            if (r0 != 0) goto L_0x0015
            goto L_0x0113
        L_0x0109:
            java.lang.Object r2 = r7.A02
            X.3ZU r2 = (X.AnonymousClass3ZU) r2
            X.3ZS r0 = r2.A03
            boolean r0 = r0.A02
            if (r0 == 0) goto L_0x0015
        L_0x0113:
            java.lang.Object r1 = r7.A01
            X.3Wa r1 = (X.C242813Wa) r1
            X.3ZH r0 = r2.A02
            X.1Xj r0 = r0.A01
            r1.DbT(r0)
            goto L_0x0015
        L_0x0120:
            java.lang.Object r0 = r7.A02
            X.GxJ r0 = (X.C53975GxJ) r0
            X.3ey r1 = r0.A01
            r0 = 0
            r1.A08 = r0
            java.lang.Object r1 = r7.A01
            com.instagram.ui.mediaactions.MediaActionsView r1 = (com.instagram.ui.mediaactions.MediaActionsView) r1
            X.3TO r0 = X.AnonymousClass3TO.GONE
            r1.setVideoIconState(r0)
            goto L_0x0015
        L_0x0134:
            java.lang.Object r0 = r7.A02
            X.Gtz r0 = (X.C53770Gtz) r0
            X.2uK r2 = r0.A00
            java.lang.Object r1 = r7.A01
            r0 = 0
            X.0qQ.A0B(r1, r0)
            java.util.List r0 = r2.A0Q
            r0.remove(r1)
            goto L_0x0015
        L_0x0147:
            java.lang.Object r0 = r7.A02
            X.3fQ r0 = (X.C246903fQ) r0
            X.2uK r3 = r0.A03
            X.3et r0 = r0.A01
            X.3ZH r0 = r0.A08
            X.1Xj r2 = r0.A01
            java.lang.Object r1 = r7.A01
            X.3W1 r1 = (X.AnonymousClass3W1) r1
            r0 = -3
            r3.A0S(r2, r1, r0)
            goto L_0x0015
        L_0x015d:
            java.lang.Object r0 = r7.A01
            X.3yj r0 = (X.C258263yj) r0
            X.3yk r1 = r0.A02
            java.lang.Object r0 = r7.A02
            X.5eA r0 = (X.C289765eA) r0
            X.3W1 r0 = r0.A04
            r1.A02(r0)
            goto L_0x0015
        L_0x016e:
            java.lang.Object r0 = r7.A02
            X.GxD r0 = (X.C53969GxD) r0
            X.3ey r0 = r0.A01
            r2 = 0
            r0.A04 = r2
            java.lang.Object r1 = r7.A01
            X.3yi r1 = (X.C258253yi) r1
            r0 = 0
            X.0qQ.A0B(r1, r0)
            X.0eM r0 = r1.A03
            java.lang.Object r0 = r0.getValue()
            android.widget.SeekBar r0 = (android.widget.SeekBar) r0
            r0.setOnSeekBarChangeListener(r2)
            r1.A00()
            goto L_0x0015
        L_0x018f:
            java.lang.Object r3 = r7.A01
            X.3ey r3 = (X.C246663ey) r3
            X.3TS r2 = r3.A01
            if (r2 == 0) goto L_0x038f
            java.lang.Object r0 = r7.A02
            X.3et r0 = (X.C246613et) r0
            X.3W1 r1 = r0.A0E
            r0 = 1
            X.0qQ.A0B(r1, r0)
            com.instagram.ui.widget.slideouticon.SlideInAndOutIconView r0 = r2.A01()
            r0.A01()
            com.instagram.ui.widget.slideouticon.SlideInAndOutIconView r0 = r2.A01()
            r1.A0S(r0)
            X.3TS r0 = r3.A01
            if (r0 == 0) goto L_0x0384
            android.widget.FrameLayout r1 = r0.A00()
        L_0x01b7:
            r0 = 0
            r1.setOnClickListener(r0)
            goto L_0x0015
        L_0x01bd:
            java.lang.Object r1 = r7.A01
            com.instagram.feed.widget.IgProgressImageView r1 = (com.instagram.feed.widget.IgProgressImageView) r1
            r0 = 2131435563(0x7f0b202b, float:1.8492972E38)
            r1.A06(r0)
            java.lang.Object r2 = r7.A02
            X.3V9 r2 = (X.AnonymousClass3V9) r2
            r2.A0A()
            r1 = 0
            X.3gr r0 = r2.A06
            if (r0 == 0) goto L_0x01d8
            android.view.View r0 = r0.A00
            X.AnonymousClass0fU.A00(r1, r0)
        L_0x01d8:
            r2.A05 = r1
            goto L_0x0015
        L_0x01dc:
            java.lang.Object r1 = r7.A02
            X.3et r1 = (X.C246613et) r1
            X.3es r0 = r1.A0A
            X.0sL r2 = r0.A0W
            X.3W1 r0 = r1.A0E
            java.lang.Integer r1 = X.C51968G9o.A0s(r0)
            java.lang.Object r0 = r7.A01
            r2.invoke(r1, r0)
            goto L_0x0015
        L_0x01f1:
            java.lang.Object r0 = r7.A02
            X.0rm r0 = (X.0rm) r0
            java.lang.Object r3 = r0.A00
            if (r3 == 0) goto L_0x0015
            java.lang.Object r2 = r7.A01
            X.3W1 r2 = (X.AnonymousClass3W1) r2
            X.2xU r3 = (X.AnonymousClass2xU) r3
            r1 = 0
            r0 = 0
            r2.A0M(r3, r1, r0)
            goto L_0x0015
        L_0x0206:
            java.lang.Object r0 = r7.A02
            X.3en r0 = (X.C246553en) r0
            X.9IV r0 = r0.A02
            java.lang.Object r1 = r0.A00
            X.0sP r1 = (X.0sP) r1
            java.lang.Object r0 = r7.A01
        L_0x0212:
            r1.invoke(r0)
            goto L_0x0015
        L_0x0217:
            java.lang.Object r1 = r7.A01
            X.5xz r1 = (X.C300835xz) r1
            java.lang.Object r0 = r7.A02
            java.lang.ref.WeakReference r0 = X.C51965G9l.A0v(r0)
            r1.A01(r0)
            X.3dj r4 = X.C58243Iom.A00()
            return r4
        L_0x0229:
            java.lang.Object r1 = r7.A01
            X.1Xj r1 = (X.1Xj) r1
            java.lang.Object r0 = r7.A02
            X.GTG r0 = (X.GTG) r0
            int r0 = r0.A00
            X.1Xj r4 = r1.A1c(r0)
            return r4
        L_0x0238:
            java.lang.Object r1 = r7.A01
            X.1Xj r1 = (X.1Xj) r1
            java.lang.Object r0 = r7.A02
            X.33e r0 = (X.C2362933e) r0
            com.instagram.common.session.UserSession r0 = r0.A02
            int r0 = X.C262614Ff.A00(r0, r1)
            goto L_0x0365
        L_0x0248:
            java.lang.Object r0 = r7.A02
            X.33e r0 = (X.C2362933e) r0
            X.33Z r0 = r0.A05
            X.0eM r0 = r0.A0f
            r0.getValue()
            java.lang.Object r0 = r7.A01
            X.1Xj r0 = X.C51968G9o.A0m(r0)
            java.lang.String r1 = r0.getId()
            X.3Yl r0 = r0.A1a()
            java.lang.Object[] r0 = new java.lang.Object[]{r1, r0}
            int r0 = java.util.Arrays.hashCode(r0)
            goto L_0x0365
        L_0x026b:
            java.lang.Object r0 = r7.A02
            X.33e r0 = (X.C2362933e) r0
            X.33Z r0 = r0.A05
            X.0eM r0 = r0.A0b
            r0.getValue()
            java.lang.Object r0 = r7.A01
            X.1Xj r0 = X.C51968G9o.A0m(r0)
            java.lang.Object[] r0 = X.C51969G9p.A1b(r0)
            int r0 = java.util.Arrays.hashCode(r0)
            goto L_0x0365
        L_0x0286:
            java.lang.Object r1 = r7.A02
            X.33e r1 = (X.C2362933e) r1
            X.33Z r0 = r1.A05
            X.0eM r0 = r0.A0b
            r0.getValue()
            java.lang.Object r3 = r7.A01
            X.1Xj r3 = (X.1Xj) r3
            java.lang.String r2 = r1.A0C
            com.instagram.common.session.UserSession r1 = r1.A02
            r0 = 0
            X.0qQ.A0B(r3, r0)
            X.HmL r4 = new X.HmL
            r4.<init>(r2, r1, r3)
            return r4
        L_0x02a3:
            java.lang.Object r0 = r7.A02
            X.33e r0 = (X.C2362933e) r0
            X.33Z r0 = r0.A05
            X.0eM r0 = r0.A0c
            r0.getValue()
            java.lang.Object r0 = r7.A01
            X.1Xj r0 = (X.1Xj) r0
            int r0 = X.C56531I0c.A00(r0)
            goto L_0x0365
        L_0x02b8:
            java.lang.Object r0 = r7.A02
            X.33e r0 = (X.C2362933e) r0
            X.33Z r0 = r0.A05
            X.0eM r0 = r0.A08
            r0.getValue()
            java.lang.Object r0 = r7.A01
            X.1Xj r0 = X.C51968G9o.A0m(r0)
            X.1Xy r0 = r0.A0C
            com.instagram.api.schemas.BoostUpsellBannerPayloadSchema r0 = r0.Ah4()
            int r0 = X.AnonymousClass7TG.A0C(r0)
            goto L_0x0365
        L_0x02d5:
            java.lang.Object r0 = r7.A02
            X.33e r0 = (X.C2362933e) r0
            X.33Z r0 = r0.A05
            X.0eM r0 = r0.A08
            r0.getValue()
            java.lang.Object r1 = r7.A01
            r0 = 0
            X.0qQ.A0B(r1, r0)
            r0 = 45
            X.Ing r4 = new X.Ing
            r4.<init>(r1, r0)
            r0 = 46
            X.Ing r3 = new X.Ing
            r3.<init>(r1, r0)
            r0 = 47
            X.Ing r2 = new X.Ing
            r2.<init>(r1, r0)
            r0 = 37
            X.JwM r1 = new X.JwM
            r1.<init>((X.C62320sa) r4, (X.C62320sa) r3, (X.C62320sa) r2, (int) r0)
            r0 = 16
            X.JwG r4 = new X.JwG
            r4.<init>((java.lang.Object) r1, (int) r0)
            return r4
        L_0x030a:
            java.lang.Object r3 = r7.A02
            X.33e r3 = (X.C2362933e) r3
            X.33Z r0 = r3.A05
            X.0eM r0 = r0.A0c
            java.lang.Object r2 = r0.getValue()
            X.I0c r2 = (X.C56531I0c) r2
            java.lang.Object r1 = r7.A01
            X.1Xj r1 = (X.1Xj) r1
            android.content.Context r0 = r3.A00
            X.Gli r4 = r2.A01(r0, r1)
            return r4
        L_0x0323:
            X.3Ds r2 = X.C238863Ds.SUBTITLE
            java.lang.Object r0 = r7.A02
            X.51j r0 = (X.C2803451j) r0
            boolean r1 = r0.A09
            java.lang.Object r0 = r7.A01
            X.3W1 r0 = (X.AnonymousClass3W1) r0
            X.3Dt r4 = X.C55009Hag.A00(r2, r0, r1)
            return r4
        L_0x0334:
            java.lang.Object r0 = r7.A01
            X.2Wa r0 = (X.2Wa) r0
            X.IUv r3 = new X.IUv
            r3.<init>(r0)
            java.lang.Object r2 = r7.A02
            X.Gtz r2 = (X.C53770Gtz) r2
            X.2uK r0 = r2.A00
            java.util.List r0 = r0.A0Q
            r0.add(r3)
            r1 = 34
            X.Inq r0 = new X.Inq
            r0.<init>(r1, r3, r2)
            X.3dj r4 = X.C51965G9l.A0V(r0)
            return r4
        L_0x0354:
            java.lang.Object r2 = r7.A01
            X.3Y5 r2 = (X.AnonymousClass3Y5) r2
            java.lang.Object r0 = r7.A02
            X.Gs8 r0 = (X.C53655Gs8) r0
            X.3g4 r0 = r0.A00
            int r0 = r0.A00
            double r0 = (double) r0
            int r0 = X.C51972G9s.A0B(r2, r0)
        L_0x0365:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            return r4
        L_0x036a:
            java.lang.Object r2 = r7.A01
            X.3Y5 r2 = (X.AnonymousClass3Y5) r2
            java.lang.Object r0 = r7.A02
            X.Gs8 r0 = (X.C53655Gs8) r0
            X.3g4 r0 = r0.A00
            int r0 = r0.A01
            double r0 = (double) r0
            int r0 = X.C51972G9s.A0B(r2, r0)
            X.Hq4 r4 = new X.Hq4
            r4.<init>(r0)
            return r4
        L_0x0381:
            X.2YP r4 = X.AnonymousClass2YP.A00
            return r4
        L_0x0384:
            r0 = 258(0x102, float:3.62E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        L_0x038f:
            r0 = 258(0x102, float:3.62E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58186Inq.invoke():java.lang.Object");
    }
}
