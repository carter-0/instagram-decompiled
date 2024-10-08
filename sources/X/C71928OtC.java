package X;

/* renamed from: X.OtC  reason: case insensitive filesystem */
public final /* synthetic */ class C71928OtC implements 1wn {
    public final /* synthetic */ 2Er A00;
    public final /* synthetic */ C329067Hl A01;

    public /* synthetic */ C71928OtC(2Er r1, C329067Hl r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onEvent(java.lang.Object r16) {
        /*
            r15 = this;
            r0 = r16
            X.7Hl r1 = r15.A01
            X.2Er r10 = r15.A00
            X.Osi r0 = (X.C71900Osi) r0
            X.OTl r8 = r1.A0M
            if (r8 == 0) goto L_0x0050
            boolean r0 = r0.A00
            if (r0 == 0) goto L_0x0102
            boolean r0 = r1.A17
            if (r0 != 0) goto L_0x0102
            java.lang.String r2 = r10.C6C()
            r9 = 0
            if (r2 == 0) goto L_0x00ff
            com.instagram.common.session.UserSession r0 = r8.A05
            X.0xa r1 = X.AnonymousClass7TE.A0q(r0)
            java.lang.String r0 = "broadcast_channel_daily_prompt_fab"
            boolean r3 = X.C66581MXm.A1Y(r1, r0, r2)
        L_0x0027:
            java.lang.String r2 = r10.C6C()
            if (r2 == 0) goto L_0x00fc
            com.instagram.common.session.UserSession r0 = r8.A05
            X.0xa r1 = X.AnonymousClass7TE.A0q(r0)
            r0 = 2112(0x840, float:2.96E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)
            boolean r1 = X.C66581MXm.A1Y(r1, r0, r2)
        L_0x003d:
            java.lang.Boolean r0 = r10.Amk()
            boolean r0 = X.AnonymousClass7TF.A1Y(r0, r9)
            if (r3 != 0) goto L_0x004b
            if (r1 != 0) goto L_0x0051
            if (r0 == 0) goto L_0x0051
        L_0x004b:
            X.3oV r0 = r8.A06
            X.C66582MXn.A1G(r0)
        L_0x0050:
            return
        L_0x0051:
            X.3oV r7 = r8.A06
            boolean r0 = r7.CVM()
            if (r0 == 0) goto L_0x0064
            android.view.View r0 = r7.getView()
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x0064
            return
        L_0x0064:
            com.instagram.common.session.UserSession r6 = r8.A05
            X.0Tu r5 = X.DbS.A0J(r6, r9)
            r1 = 36328164829772840(0x81104600053c28, double:3.0374159479021655E-306)
            boolean r0 = X.182.A06(r5, r6, r1)
            if (r0 == 0) goto L_0x00ae
            boolean r0 = X.C3269478t.A01(r10)
            if (r0 == 0) goto L_0x00e1
        L_0x007b:
            r0 = 37
        L_0x007d:
            X.Ok4 r1 = new X.Ok4
            r1.<init>(r0, r10, r8)
            X.C66580MXl.A1Q(r7, r9)
            android.view.View r0 = r7.getView()
            X.AnonymousClass0fU.A00(r1, r0)
            com.instagram.common.ui.base.IgSimpleImageView r1 = r8.A01
            if (r1 == 0) goto L_0x0095
            r0 = 36
            X.C71405Ok4.A01(r1, r0, r10, r8)
        L_0x0095:
            X.7L0 r2 = r8.A03
            if (r2 == 0) goto L_0x0050
            r8.A03 = r2
            android.view.View r1 = r8.A00
            if (r1 == 0) goto L_0x00a4
            int r0 = r2.A02
            r1.setBackgroundColor(r0)
        L_0x00a4:
            com.instagram.common.ui.base.IgTextView r1 = r8.A02
            if (r1 == 0) goto L_0x0050
            int r0 = r2.A0C
            r1.setTextColor(r0)
            return
        L_0x00ae:
            X.914 r3 = r10.Amp()
            if (r3 == 0) goto L_0x007b
            boolean r0 = r3.A00()
            if (r0 != 0) goto L_0x00e1
            boolean r0 = r3.A06
            if (r0 == 0) goto L_0x007b
            boolean r0 = r3.A05
            if (r0 != 0) goto L_0x007b
            java.lang.Long r0 = r3.A00
            long r11 = X.DbY.A04(r0)
            r3 = 1000(0x3e8, double:4.94E-321)
            long r11 = r11 * r3
            long r13 = X.C51966G9m.A07(r11)
            r3 = 36600882375168042(0x82084f0070102a, double:3.209883621755503E-306)
            long r11 = X.182.A01(r5, r6, r3)
            r3 = 86400000(0x5265c00, double:4.2687272E-316)
            long r11 = r11 * r3
            int r0 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r0 <= 0) goto L_0x00e1
            goto L_0x007b
        L_0x00e1:
            X.914 r0 = r10.Amp()
            if (r0 == 0) goto L_0x00ed
            boolean r0 = r0.A00()
            if (r0 != 0) goto L_0x0095
        L_0x00ed:
            boolean r0 = X.C3269478t.A01(r10)
            if (r0 != 0) goto L_0x0095
            boolean r0 = X.182.A06(r5, r6, r1)
            if (r0 == 0) goto L_0x0095
            r0 = 38
            goto L_0x007d
        L_0x00fc:
            r1 = 0
            goto L_0x003d
        L_0x00ff:
            r3 = 0
            goto L_0x0027
        L_0x0102:
            X.3oV r0 = r8.A06
            X.C66582MXn.A1G(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71928OtC.onEvent(java.lang.Object):void");
    }
}
