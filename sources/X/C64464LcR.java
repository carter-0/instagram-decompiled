package X;

/* renamed from: X.LcR  reason: case insensitive filesystem */
public final class C64464LcR implements AnonymousClass4DS {
    public final int A00;
    public final Object A01;

    public C64464LcR(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x009c, code lost:
        if (X.182.A06(X.DbS.A0J(r4, 0), r4, 36321769625691887L) == false) goto L_0x009e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void configureActionBar(X.2da r23) {
        /*
            r22 = this;
            r1 = r22
            r2 = r23
            int r0 = r1.A00
            switch(r0) {
                case 0: goto L_0x00ff;
                case 1: goto L_0x00e2;
                case 2: goto L_0x00be;
                case 3: goto L_0x0050;
                case 4: goto L_0x0172;
                case 5: goto L_0x0156;
                case 6: goto L_0x002f;
                case 7: goto L_0x0144;
                case 8: goto L_0x0121;
                default: goto L_0x0009;
            }
        L_0x0009:
            r0 = 0
            X.0qQ.A0B(r2, r0)
            java.lang.Object r4 = r1.A01
            r0 = 0
            r2.ENd(r0)
            X.3JR r3 = X.DbV.A0K()
            r1 = 20
            X.LY3 r0 = new X.LY3
            r0.<init>((java.lang.Object) r4, (int) r1)
            X.DbX.A1A(r0, r3, r2)
            r5 = 2131238069(0x7f081cb5, float:1.8092406E38)
            r0 = 21
            X.LY3 r1 = new X.LY3
            r1.<init>((java.lang.Object) r4, (int) r0)
        L_0x002b:
            r2.ErD(r1, r5)
        L_0x002e:
            return
        L_0x002f:
            r0 = 0
            X.0qQ.A0B(r2, r0)
            java.lang.Object r4 = r1.A01
            r0 = 0
            r2.ENd(r0)
            X.3JR r3 = X.DbV.A0K()
            r1 = 3
            X.LXz r0 = new X.LXz
            r0.<init>(r4, r1)
            X.DbX.A1A(r0, r3, r2)
            r5 = 2131238069(0x7f081cb5, float:1.8092406E38)
            r0 = 4
            X.LXz r1 = new X.LXz
            r1.<init>(r4, r0)
            goto L_0x002b
        L_0x0050:
            r7 = 0
            X.0qQ.A0B(r2, r7)
            java.lang.Object r6 = r1.A01
            X.NIn r6 = (X.C68449NIn) r6
            boolean r0 = r6.A0t
            r1 = 1
            r0 = r0 ^ 1
            r2.Etr(r0)
            boolean r0 = r6.A0t
            if (r0 != 0) goto L_0x002e
            r2.Eu4(r1)
            X.3JR r3 = X.DbX.A0M()
            r1 = 2
            X.Ojw r0 = new X.Ojw
            r0.<init>(r6, r1)
            X.DbX.A1A(r0, r3, r2)
            boolean r0 = X.C68449NIn.A0e(r6)
            if (r0 != 0) goto L_0x002e
            X.3JR r5 = X.DbS.A0K()
            android.content.res.Resources r8 = X.DbV.A05(r6)
            boolean r0 = X.C68449NIn.A0g(r6)
            if (r0 == 0) goto L_0x009e
            com.instagram.common.session.UserSession r4 = r6.A0i()
            X.0Tu r3 = X.DbS.A0J(r4, r7)
            r0 = 36321769625691887(0x810a75002726ef, double:3.033371595089951E-306)
            boolean r1 = X.182.A06(r3, r4, r0)
            r0 = 2131968361(0x7f134169, float:1.9573614E38)
            if (r1 != 0) goto L_0x00a1
        L_0x009e:
            r0 = 2131968573(0x7f13423d, float:1.9574044E38)
        L_0x00a1:
            java.lang.String r0 = r8.getString(r0)
            r5.A0K = r0
            android.content.Context r0 = r6.getContext()
            int r0 = X.2Yu.A0D(r0)
            r5.A03 = r0
            r1 = 3
            X.Ojw r0 = new X.Ojw
            r0.<init>(r6, r1)
            X.DbX.A19(r0, r5, r2)
            r2.ARb(r7, r7)
            return
        L_0x00be:
            r0 = 0
            X.0qQ.A0B(r2, r0)
            java.lang.Object r4 = r1.A01
            r0 = 0
            r2.ENd(r0)
            X.3JR r3 = X.DbV.A0K()
            r1 = 12
            X.LYE r0 = new X.LYE
            r0.<init>((java.lang.Object) r4, (int) r1)
            X.DbX.A1A(r0, r3, r2)
            r5 = 2131238069(0x7f081cb5, float:1.8092406E38)
            r0 = 13
            X.LYE r1 = new X.LYE
            r1.<init>((java.lang.Object) r4, (int) r0)
            goto L_0x002b
        L_0x00e2:
            r0 = 0
            X.0qQ.A0B(r2, r0)
            java.lang.Object r3 = r1.A01
            r0 = 13
            X.LYF r1 = new X.LYF
            r1.<init>((java.lang.Object) r3, (int) r0)
            r0 = 1
            r2.Eu5(r1, r0)
            r0 = 2131952314(0x7f1302ba, float:1.9541067E38)
            r2.Eom(r0)
            r5 = 2131238067(0x7f081cb3, float:1.8092402E38)
            r0 = 14
            goto L_0x011a
        L_0x00ff:
            r0 = 0
            X.0qQ.A0B(r2, r0)
            java.lang.Object r3 = r1.A01
            r0 = 7
            X.LYF r1 = new X.LYF
            r1.<init>((java.lang.Object) r3, (int) r0)
            r0 = 1
            r2.Eu5(r1, r0)
            r0 = 2131952314(0x7f1302ba, float:1.9541067E38)
            r2.Eom(r0)
            r5 = 2131238067(0x7f081cb3, float:1.8092402E38)
            r0 = 8
        L_0x011a:
            X.LYF r1 = new X.LYF
            r1.<init>((java.lang.Object) r3, (int) r0)
            goto L_0x002b
        L_0x0121:
            X.Dbb.A1I(r2)
            r0 = 2131965346(0x7f1335a2, float:1.95675E38)
            r2.Eom(r0)
            X.3JR r3 = X.DbS.A0K()
            r0 = 2131952258(0x7f130282, float:1.9540954E38)
            r3.A0C = r0
            r0 = 2131965347(0x7f1335a3, float:1.9567501E38)
            r3.A05 = r0
            java.lang.Object r1 = r1.A01
            r0 = 65
            X.LY5 r0 = X.LY5.A00(r1, r0)
            X.DbX.A19(r0, r3, r2)
            return
        L_0x0144:
            java.lang.Object r0 = r1.A01
            X.Ual r0 = (X.C15336Ual) r0
            androidx.fragment.app.Fragment r0 = r0.A02
            r0.getClass()
            X.4DS r0 = (X.AnonymousClass4DS) r0
            r0.configureActionBar(r2)
            X.Dbc.A0k(r2)
            return
        L_0x0156:
            r0 = 0
            X.0qQ.A0B(r2, r0)
            java.lang.Object r0 = r1.A01
            X.K77 r0 = (X.K77) r0
            com.instagram.mediakit.config.MediaKitInfoSheetConfig r0 = r0.A00()
            java.lang.Integer r0 = r0.A0B
            if (r0 == 0) goto L_0x016d
            int r0 = r0.intValue()
            r2.Eom(r0)
        L_0x016d:
            r0 = 1
            r2.Eu4(r0)
            return
        L_0x0172:
            r0 = 0
            X.0qQ.A0B(r2, r0)
            r0 = 2131966607(0x7f133a8f, float:1.9570057E38)
            r2.Eom(r0)
            java.lang.Integer r13 = X.AnonymousClass05K.A00
            r7 = 0
            r4 = 1
            java.lang.Object r1 = r1.A01
            X.K76 r1 = (X.K76) r1
            android.content.Context r0 = r1.requireContext()
            r15 = 2131100175(0x7f06020f, float:1.7812724E38)
            int r0 = r0.getColor(r15)
            android.graphics.drawable.ColorDrawable r10 = new android.graphics.drawable.ColorDrawable
            r10.<init>(r0)
            android.content.Context r6 = r1.requireContext()
            r5 = 2131239025(0x7f082071, float:1.8094345E38)
            android.content.Context r0 = r1.getContext()
            int r3 = X.2Yu.A0A(r0)
            android.content.Context r0 = r1.getContext()
            int r0 = X.2Yu.A0A(r0)
            android.graphics.drawable.StateListDrawable r11 = X.AnonymousClass3JT.A08(r6, r5, r3, r5, r0)
            r17 = 2131953555(0x7f130793, float:1.9543584E38)
            r0 = 57
            X.LY6 r12 = X.LY6.A00(r1, r0)
            r14 = -2
            X.57Z r6 = new X.57Z
            r8 = r7
            r9 = r7
            r16 = r14
            r18 = r14
            r19 = r14
            r20 = r14
            r21 = r4
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            r2.ErJ(r6)
            r2.Eu4(r4)
            X.3JR r5 = X.DbS.A0K()
            r0 = 2131238465(0x7f081e41, float:1.809321E38)
            r5.A06 = r0
            r0 = 2131964339(0x7f1331b3, float:1.9565457E38)
            r5.A05 = r0
            android.content.Context r4 = r1.requireContext()
            android.content.Context r3 = r1.getContext()
            r0 = 2130970272(0x7f0406a0, float:1.754925E38)
            int r0 = X.JTP.A02(r3, r4, r0)
            r5.A02 = r0
            r0 = 58
            X.LY6 r0 = X.LY6.A00(r1, r0)
            X.DbX.A19(r0, r5, r2)
            X.2dZ r2 = (X.2dZ) r2
            android.view.View r0 = r2.A0L
            r1.A01 = r0
            android.view.View r1 = r1.A02
            if (r1 != 0) goto L_0x020c
            java.lang.String r0 = "statusBarLayout"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x020c:
            r0 = 0
            r1.setAlpha(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64464LcR.configureActionBar(X.2da):void");
    }
}
