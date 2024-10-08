package X;

public final class JG2 extends 0Yg implements 0sL {
    public final int A00;
    public final Object A01;
    public final Object A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JG2(int i, Object obj, Object obj2) {
        super(2);
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    public static AnonymousClass5PJ A00(C286575Wy r1, Object obj, Object obj2, int i, int i2) {
        return AnonymousClass5PI.A01(r1, new JG2(i, obj, obj2), i2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:262:0x0891, code lost:
        r1 = new X.C58180Ink(r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:268:0x08f0, code lost:
        return X.C51965G9l.A0f(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:370:0x0c69, code lost:
        X.AnonymousClass7TE.A1Z(new X.MEW(r11, r12, r13, r14, r15), r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:614:0x13c1, code lost:
        X.0fL.A00(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:616:0x13c6, code lost:
        return X.C60340gF.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:617:0x13c7, code lost:
        r12.Evl();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r39, java.lang.Object r40) {
        /*
            r38 = this;
            r1 = r38
            r0 = r40
            r12 = r39
            int r2 = r1.A00
            switch(r2) {
                case 0: goto L_0x12e6;
                case 1: goto L_0x126e;
                case 2: goto L_0x1207;
                case 3: goto L_0x1100;
                case 4: goto L_0x10a1;
                case 5: goto L_0x1050;
                case 6: goto L_0x100b;
                case 7: goto L_0x0f61;
                case 8: goto L_0x118f;
                case 9: goto L_0x0f17;
                case 10: goto L_0x0eee;
                case 11: goto L_0x0ec5;
                case 12: goto L_0x0ea1;
                case 13: goto L_0x0e6e;
                case 14: goto L_0x0e3a;
                case 15: goto L_0x0e08;
                case 16: goto L_0x0d65;
                case 17: goto L_0x0d1f;
                case 18: goto L_0x0c9d;
                case 19: goto L_0x0c73;
                case 20: goto L_0x0c5b;
                case 21: goto L_0x0c4b;
                case 22: goto L_0x0bdb;
                case 23: goto L_0x0bad;
                case 24: goto L_0x0028;
                case 25: goto L_0x0b41;
                case 26: goto L_0x0b02;
                case 27: goto L_0x0a88;
                case 28: goto L_0x09cc;
                case 29: goto L_0x09ad;
                case 30: goto L_0x08f1;
                case 31: goto L_0x08c6;
                case 32: goto L_0x0897;
                case 33: goto L_0x07d8;
                case 34: goto L_0x0771;
                case 35: goto L_0x0736;
                case 36: goto L_0x0707;
                case 37: goto L_0x06f0;
                case 38: goto L_0x0687;
                case 39: goto L_0x062b;
                case 40: goto L_0x054f;
                case 41: goto L_0x052f;
                case 42: goto L_0x04d0;
                case 43: goto L_0x0489;
                case 44: goto L_0x047a;
                case 45: goto L_0x0455;
                case 46: goto L_0x043e;
                case 47: goto L_0x0217;
                case 48: goto L_0x00af;
                default: goto L_0x000b;
            }
        L_0x000b:
            android.view.View r12 = (android.view.View) r12
            android.view.MotionEvent r0 = (android.view.MotionEvent) r0
            java.lang.Object r2 = r1.A02
            X.UAP r2 = (X.UAP) r2
            X.X9a r2 = r2.A08
            java.lang.Object r1 = r1.A01
            com.instagram.model.shopping.productfeed.ProductFeedItem r1 = (com.instagram.model.shopping.productfeed.ProductFeedItem) r1
            r7 = 0
            r6 = 0
            r3 = r0
            r4 = r12
            r5 = r1
            r8 = r7
            r9 = r7
            r2.DZk(r3, r4, r5, r6, r7, r8, r9)
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r7)
        L_0x0027:
            return r9
        L_0x0028:
            android.content.Context r12 = (android.content.Context) r12
            java.lang.String r0 = (java.lang.String) r0
            r5 = 0
            boolean r4 = X.AnonymousClass7TF.A1U(r5, r12, r0)
            java.lang.Object r2 = r1.A02
            X.Hqr r2 = (X.C55986Hqr) r2
            X.Hid r2 = r2.A02
            java.lang.Object r10 = r1.A01
            X.DUO r10 = (X.DUO) r10
            X.0qQ.A0B(r10, r4)
            X.0Pl r7 = r2.A00
            java.lang.String r6 = r10.Bhp()
            android.util.LruCache r3 = r7.A01
            java.lang.Object r9 = r3.get(r6)
            android.graphics.drawable.Drawable r1 = r7.A00
            if (r1 != 0) goto L_0x006c
            r1 = 2131238713(0x7f081f39, float:1.8093712E38)
            android.graphics.drawable.Drawable r1 = r12.getDrawable(r1)
            if (r1 == 0) goto L_0x00ad
            android.graphics.drawable.Drawable r8 = r1.mutate()
        L_0x005b:
            r7.A00 = r8
            if (r8 == 0) goto L_0x006c
            r1 = 10
            int r2 = X.DbS.A02(r12, r1)
            int r1 = X.DbS.A02(r12, r1)
            r8.setBounds(r5, r5, r2, r1)
        L_0x006c:
            if (r9 != 0) goto L_0x0027
            java.util.List r21 = r10.B3f()
            if (r21 != 0) goto L_0x0078
            java.util.ArrayList r21 = X.AnonymousClass7TE.A1C()
        L_0x0078:
            android.content.res.Resources r2 = r12.getResources()
            r1 = 2131165285(0x7f070065, float:1.7944783E38)
            int r22 = r2.getDimensionPixelSize(r1)
            java.lang.Integer r15 = X.AnonymousClass05K.A00
            r14 = 0
            android.graphics.drawable.Drawable r13 = r7.A00
            r1 = 2130970229(0x7f040675, float:1.7549162E38)
            int r1 = X.AnonymousClass7TF.A03(r12, r1)
            java.lang.Integer r19 = java.lang.Integer.valueOf(r1)
            r16 = r14
            r17 = r14
            r18 = r14
            r20 = r0
            r23 = r4
            r24 = r4
            r25 = r4
            r26 = r4
            r27 = r5
            android.graphics.drawable.Drawable r9 = X.C244283aw.A00(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            r3.put(r6, r9)
            return r9
        L_0x00ad:
            r8 = 0
            goto L_0x005b
        L_0x00af:
            X.5Wy r12 = (X.C286575Wy) r12
            int r2 = X.C51968G9o.A0B(r0)
            r0 = 2
            if (r2 != r0) goto L_0x00be
            boolean r0 = r12.Bwn()
            if (r0 != 0) goto L_0x13c7
        L_0x00be:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x00cc
            r2 = -1635402838(0xffffffff9e85bbaa, float:-1.4159539E-20)
            java.lang.String r0 = "com.instagram.settings2.core.view.SettingsScreenFragment.onCreateView.<anonymous> (SettingsScreenFragment.kt:140)"
            X.0fL.A01(r2, r0)
        L_0x00cc:
            java.lang.Object r2 = r1.A02
            X.JaK r2 = (X.C59844JaK) r2
            com.instagram.settings2.core.viewmodel.SettingsScreenViewModel r0 = X.C59844JaK.A00(r2)
            X.0Ud r0 = r0.A0K
            r10 = 0
            r1 = 0
            r9 = 7
            java.lang.Object r13 = X.G9w.A0g(r12, r0, r1)
            X.GnT r13 = (X.C53396GnT) r13
            java.lang.Object r8 = r13.A01
            X.Jw3 r8 = (X.C61065Jw3) r8
            X.5Qk r7 = androidx.compose.ui.Modifier.A00
            r5 = 1
            r18 = 0
            androidx.compose.ui.Modifier r6 = X.C51966G9m.A0U(r7)
            X.5RD r4 = X.C51969G9p.A0Z(r12, r1)
            int r11 = X.C287425a7.A00(r12)
            r3 = r12
            X.5Wx r3 = (X.C286565Wx) r3
            X.5RM r0 = X.C286565Wx.A04(r3)
            androidx.compose.ui.Modifier r6 = X.C287435a8.A01(r12, r6)
            X.C51973G9u.A0y(r12, r3)
            X.C51971G9r.A12(r12, r4, r0)
            X.0sL r4 = X.C287485aD.A02
            boolean r0 = r3.A0K
            if (r0 != 0) goto L_0x0111
            boolean r0 = X.C51972G9s.A1Q(r12, r11)
            if (r0 != 0) goto L_0x0114
        L_0x0111:
            X.C51971G9r.A13(r12, r4, r11)
        L_0x0114:
            X.C51965G9l.A18(r12, r6)
            X.Gbq r6 = new X.Gbq
            r6.<init>(r10, r9, r1)
            android.content.Context r0 = r2.requireContext()
            java.lang.Object r4 = r13.A05
            X.JwL r4 = (X.C61083JwL) r4
            X.0qQ.A0B(r4, r5)
            android.content.res.Resources r0 = X.AnonymousClass7TF.A0A(r0)
            java.lang.String r0 = X.C59846JaM.A00(r0, r4)
            java.lang.String r17 = r0.toString()
            androidx.compose.ui.Modifier r15 = X.G9t.A0p(r12, r7)
            r0 = -196917322(0xfffffffff44347b6, float:-6.188674E31)
            r12.ExS(r0)
            if (r8 == 0) goto L_0x016e
            int r0 = r8.A01
            X.2DO r9 = X.C287975bA.A00(r12, r0, r1)
            android.content.Context r4 = r2.requireContext()
            int r0 = r8.A00
            java.lang.String r7 = r4.getString(r0)
            r0 = -196906077(0xfffffffff44373a3, float:-6.194112E31)
            boolean r4 = X.C51973G9u.A1S(r12, r2, r8, r0)
            java.lang.Object r0 = r12.ECw()
            if (r4 != 0) goto L_0x0160
            java.lang.Object r4 = X.AnonymousClass5XT.A00
            if (r0 != r4) goto L_0x016a
        L_0x0160:
            r4 = 8
            X.Wvu r0 = new X.Wvu
            r0.<init>(r4, r2, r8)
            r12.FLL(r0)
        L_0x016a:
            X.62O r18 = X.C53515Gpl.A00(r3, r9, r0, r7)
        L_0x016e:
            X.C286565Wx.A0L(r3, r1)
            r19 = 6
            r20 = 24
            r14 = r12
            r16 = r6
            X.C52739Gbr.A02(r14, r15, r16, r17, r18, r19, r20)
            r0 = -196899722(0xfffffffff4438c76, float:-6.197185E31)
            boolean r4 = X.C51967G9n.A1Z(r12, r2, r0)
            java.lang.Object r0 = r12.ECw()
            if (r4 != 0) goto L_0x018c
            java.lang.Object r4 = X.AnonymousClass5XT.A00
            if (r0 != r4) goto L_0x0193
        L_0x018c:
            X.JFy r0 = X.C59346JFy.A00(r2, r5)
            r12.FLL(r0)
        L_0x0193:
            X.0sL r20 = X.C51965G9l.A10(r3, r0)
            X.Gbs r14 = new X.Gbs
            r14.<init>(r2)
            X.Gbv r15 = new X.Gbv
            r15.<init>(r2)
            r0 = -196869256(0xfffffffff4440378, float:-6.2119174E31)
            boolean r4 = X.C51967G9n.A1Z(r12, r2, r0)
            java.lang.Object r0 = r12.ECw()
            if (r4 != 0) goto L_0x01b2
            java.lang.Object r4 = X.AnonymousClass5XT.A00
            if (r0 != r4) goto L_0x01ba
        L_0x01b2:
            r0 = 2
            X.JFy r0 = X.C59346JFy.A00(r2, r0)
            r12.FLL(r0)
        L_0x01ba:
            X.0sL r21 = X.C51965G9l.A10(r3, r0)
            r0 = -196864667(0xfffffffff4441565, float:-6.2141365E31)
            boolean r4 = X.C51967G9n.A1Z(r12, r2, r0)
            java.lang.Object r0 = r12.ECw()
            if (r4 != 0) goto L_0x01cf
            java.lang.Object r4 = X.AnonymousClass5XT.A00
            if (r0 != r4) goto L_0x01d9
        L_0x01cf:
            r4 = 27
            X.Wxc r0 = new X.Wxc
            r0.<init>(r2, r4)
            r12.FLL(r0)
        L_0x01d9:
            X.0sP r18 = X.C51965G9l.A0z(r3, r0)
            X.Gbu r5 = new X.Gbu
            r5.<init>(r2)
            r0 = -196847481(0xfffffffff4445887, float:-6.222447E31)
            boolean r4 = X.C51967G9n.A1Z(r12, r2, r0)
            java.lang.Object r0 = r12.ECw()
            if (r4 != 0) goto L_0x01f3
            java.lang.Object r4 = X.AnonymousClass5XT.A00
            if (r0 != r4) goto L_0x01fd
        L_0x01f3:
            r4 = 28
            X.Wxc r0 = new X.Wxc
            r0.<init>(r2, r4)
            r12.FLL(r0)
        L_0x01fd:
            X.0sP r19 = X.C51965G9l.A0z(r3, r0)
            com.instagram.settings2.core.viewmodel.SettingsScreenViewModel r17 = X.C59844JaK.A00(r2)
            r22 = r1
            r16 = r5
            X.C52741Gbt.A01(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            boolean r0 = X.C51967G9n.A1R(r12)
            if (r0 == 0) goto L_0x13c4
            r0 = 496205762(0x1d937fc2, float:3.9042674E-21)
            goto L_0x13c1
        L_0x0217:
            X.5Wy r12 = (X.C286575Wy) r12
            int r2 = X.C51968G9o.A0B(r0)
            r0 = 2
            if (r2 != r0) goto L_0x0226
            boolean r0 = r12.Bwn()
            if (r0 != 0) goto L_0x13c7
        L_0x0226:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0234
            r2 = 235226813(0xe0546bd, float:1.6427575E-30)
            java.lang.String r0 = "com.instagram.schools.tab.ui.SchoolTabFragment.onCreateView.<anonymous>.<anonymous> (SchoolTabFragment.kt:262)"
            X.0fL.A01(r2, r0)
        L_0x0234:
            java.lang.Object r2 = r1.A02
            X.H0z r2 = (X.C54155H0z) r2
            r0 = -1917347622(0xffffffff8db798da, float:-1.1315043E-30)
            boolean r3 = X.C51967G9n.A1Z(r12, r2, r0)
            java.lang.Object r0 = r12.ECw()
            if (r3 != 0) goto L_0x0249
            java.lang.Object r3 = X.AnonymousClass5XT.A00
            if (r0 != r3) goto L_0x024f
        L_0x0249:
            r0 = 13
            X.In7 r0 = X.G9w.A0o(r12, r2, r0)
        L_0x024f:
            X.0Ya r0 = (X.C59520Ya) r0
            r3 = r12
            X.5Wx r3 = (X.C286565Wx) r3
            r5 = 0
            X.C286565Wx.A0L(r3, r5)
            X.0sP r0 = (X.0sP) r0
            r4 = -1917345967(0xffffffff8db79f51, float:-1.13166E-30)
            boolean r4 = X.C51967G9n.A1Z(r12, r2, r4)
            java.lang.Object r6 = r12.ECw()
            if (r4 != 0) goto L_0x026b
            java.lang.Object r4 = X.AnonymousClass5XT.A00
            if (r6 != r4) goto L_0x0271
        L_0x026b:
            r4 = 14
            X.In7 r6 = X.G9w.A0o(r12, r2, r4)
        L_0x0271:
            X.0sP r25 = X.C51968G9o.A1A(r3, r6)
            r4 = -1917344492(0xffffffff8db7a514, float:-1.1317987E-30)
            boolean r4 = X.C51967G9n.A1Z(r12, r2, r4)
            java.lang.Object r6 = r12.ECw()
            if (r4 != 0) goto L_0x0286
            java.lang.Object r4 = X.AnonymousClass5XT.A00
            if (r6 != r4) goto L_0x028c
        L_0x0286:
            r4 = 15
            X.In7 r6 = X.G9w.A0o(r12, r2, r4)
        L_0x028c:
            X.0sP r26 = X.C51968G9o.A1A(r3, r6)
            r4 = -1917342891(0xffffffff8db7ab55, float:-1.1319492E-30)
            boolean r4 = X.C51967G9n.A1Z(r12, r2, r4)
            java.lang.Object r6 = r12.ECw()
            if (r4 != 0) goto L_0x02a1
            java.lang.Object r4 = X.AnonymousClass5XT.A00
            if (r6 != r4) goto L_0x02a7
        L_0x02a1:
            r4 = 16
            X.In7 r6 = X.G9w.A0o(r12, r2, r4)
        L_0x02a7:
            X.0sP r27 = X.C51968G9o.A1A(r3, r6)
            X.0eM r4 = r2.A0F
            java.lang.Object r7 = r4.getValue()
            r4 = -1917341308(0xffffffff8db7b184, float:-1.1320981E-30)
            boolean r4 = X.C51967G9n.A1Z(r12, r7, r4)
            java.lang.Object r6 = r12.ECw()
            if (r4 != 0) goto L_0x02c2
            java.lang.Object r4 = X.AnonymousClass5XT.A00
            if (r6 != r4) goto L_0x02c8
        L_0x02c2:
            r4 = 17
            X.In7 r6 = X.G9w.A0o(r12, r7, r4)
        L_0x02c8:
            X.0sP r28 = X.C51968G9o.A1A(r3, r6)
            r4 = -1917339230(0xffffffff8db7b9a2, float:-1.1322935E-30)
            boolean r6 = X.C51967G9n.A1Z(r12, r2, r4)
            java.lang.Object r4 = r12.ECw()
            if (r6 != 0) goto L_0x02dd
            java.lang.Object r6 = X.AnonymousClass5XT.A00
            if (r4 != r6) goto L_0x02e7
        L_0x02dd:
            r6 = 44
            X.PqM r4 = new X.PqM
            r4.<init>(r2, r6)
            r12.FLL(r4)
        L_0x02e7:
            X.0sP r29 = X.C51965G9l.A0z(r3, r4)
            r4 = -1917337288(0xffffffff8db7c138, float:-1.13247615E-30)
            boolean r4 = X.C51967G9n.A1Z(r12, r2, r4)
            java.lang.Object r6 = r12.ECw()
            if (r4 != 0) goto L_0x02fc
            java.lang.Object r4 = X.AnonymousClass5XT.A00
            if (r6 != r4) goto L_0x0302
        L_0x02fc:
            r4 = 21
            X.InR r6 = X.C51970G9q.A0q(r12, r2, r4)
        L_0x0302:
            X.0Ya r7 = X.C51965G9l.A12(r3, r6)
            X.0sL r7 = (X.0sL) r7
            r4 = -1917335663(0xffffffff8db7c791, float:-1.132629E-30)
            boolean r4 = X.C51967G9n.A1Z(r12, r2, r4)
            java.lang.Object r6 = r12.ECw()
            if (r4 != 0) goto L_0x0319
            java.lang.Object r4 = X.AnonymousClass5XT.A00
            if (r6 != r4) goto L_0x031f
        L_0x0319:
            r4 = 45
            X.Imz r6 = X.C51975G9x.A0u(r12, r2, r4)
        L_0x031f:
            X.0sa r17 = X.C51968G9o.A19(r3, r6)
            r4 = -1917334271(0xffffffff8db7cd01, float:-1.1327599E-30)
            boolean r6 = X.C51967G9n.A1Z(r12, r2, r4)
            java.lang.Object r4 = r12.ECw()
            if (r6 != 0) goto L_0x0334
            java.lang.Object r6 = X.AnonymousClass5XT.A00
            if (r4 != r6) goto L_0x033e
        L_0x0334:
            r6 = 9
            X.Wvp r4 = new X.Wvp
            r4.<init>(r2, r6)
            r12.FLL(r4)
        L_0x033e:
            X.0sa r18 = X.C51965G9l.A0y(r3, r4, r5)
            r4 = -1917332331(0xffffffff8db7d495, float:-1.1329423E-30)
            boolean r4 = X.C51967G9n.A1Z(r12, r2, r4)
            java.lang.Object r6 = r12.ECw()
            if (r4 != 0) goto L_0x0353
            java.lang.Object r4 = X.AnonymousClass5XT.A00
            if (r6 != r4) goto L_0x0359
        L_0x0353:
            r4 = 42
            X.Imz r6 = X.C51975G9x.A0u(r12, r2, r4)
        L_0x0359:
            X.0sa r19 = X.C51968G9o.A19(r3, r6)
            r4 = -1917330619(0xffffffff8db7db45, float:-1.1331033E-30)
            boolean r6 = X.C51967G9n.A1Z(r12, r2, r4)
            java.lang.Object r4 = r12.ECw()
            if (r6 != 0) goto L_0x036e
            java.lang.Object r6 = X.AnonymousClass5XT.A00
            if (r4 != r6) goto L_0x0377
        L_0x036e:
            r6 = 7
            X.Wvp r4 = new X.Wvp
            r4.<init>(r2, r6)
            r12.FLL(r4)
        L_0x0377:
            X.0sa r20 = X.C51965G9l.A0y(r3, r4, r5)
            r4 = -1917328246(0xffffffff8db7e48a, float:-1.1333265E-30)
            boolean r6 = X.C51967G9n.A1Z(r12, r2, r4)
            java.lang.Object r4 = r12.ECw()
            if (r6 != 0) goto L_0x038c
            java.lang.Object r6 = X.AnonymousClass5XT.A00
            if (r4 != r6) goto L_0x0396
        L_0x038c:
            r6 = 8
            X.Wvp r4 = new X.Wvp
            r4.<init>(r2, r6)
            r12.FLL(r4)
        L_0x0396:
            X.0sa r21 = X.C51965G9l.A0y(r3, r4, r5)
            r4 = -1917325732(0xffffffff8db7ee5c, float:-1.1335629E-30)
            boolean r6 = X.C51967G9n.A1Z(r12, r2, r4)
            java.lang.Object r4 = r12.ECw()
            if (r6 != 0) goto L_0x03ab
            java.lang.Object r6 = X.AnonymousClass5XT.A00
            if (r4 != r6) goto L_0x03b5
        L_0x03ab:
            r6 = 43
            X.Imz r4 = new X.Imz
            r4.<init>(r2, r6)
            r12.FLL(r4)
        L_0x03b5:
            X.0sa r22 = X.C51968G9o.A19(r3, r4)
            r4 = -1917323619(0xffffffff8db7f69d, float:-1.1337616E-30)
            boolean r6 = X.C51967G9n.A1Z(r12, r2, r4)
            java.lang.Object r4 = r12.ECw()
            if (r6 != 0) goto L_0x03ca
            java.lang.Object r6 = X.AnonymousClass5XT.A00
            if (r4 != r6) goto L_0x03d0
        L_0x03ca:
            r4 = 44
            X.Imz r4 = X.C51975G9x.A0u(r12, r2, r4)
        L_0x03d0:
            X.0Ya r4 = X.C51965G9l.A12(r3, r4)
            X.0sa r4 = (X.C62320sa) r4
            java.lang.Object r3 = r1.A01
            X.4gU r3 = (X.C270284gU) r3
            java.lang.Object r1 = r3.getValue()
            X.GnT r1 = (X.C53396GnT) r1
            boolean r8 = r1.A07
            X.0eM r1 = r2.A06
            boolean r36 = X.AnonymousClass7TF.A1Z(r1)
            X.0eM r1 = r2.A0C
            boolean r37 = X.AnonymousClass7TF.A1Z(r1)
            java.lang.Object r1 = r3.getValue()
            X.GnT r1 = (X.C53396GnT) r1
            java.lang.String r6 = r1.A06
            java.lang.Object r1 = r3.getValue()
            X.GnT r1 = (X.C53396GnT) r1
            java.lang.Object r2 = r1.A05
            X.62P r2 = (X.AnonymousClass62P) r2
            java.lang.Object r1 = r3.getValue()
            X.GnT r1 = (X.C53396GnT) r1
            java.lang.Object r13 = r1.A03
            X.JwE r13 = (X.C61076JwE) r13
            java.lang.Object r1 = r3.getValue()
            X.GnT r1 = (X.C53396GnT) r1
            java.lang.Object r14 = r1.A01
            X.ULg r14 = (X.C15050ULg) r14
            java.lang.Object r1 = r3.getValue()
            X.GnT r1 = (X.C53396GnT) r1
            java.lang.Object r15 = r1.A02
            X.HLt r15 = (X.C54636HLt) r15
            r23 = r4
            r24 = r0
            r30 = r7
            r31 = r2
            r32 = r5
            r33 = r5
            r34 = r5
            r35 = r8
            r16 = r6
            X.I7T.A05(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x13c4
            r0 = -1126385697(0xffffffffbcdcb7df, float:-0.026943145)
            goto L_0x13c1
        L_0x043e:
            X.Gly r12 = (X.C53312Gly) r12
            X.AnonymousClass7TG.A1N(r12, r0)
            java.lang.Object r3 = r1.A02
            X.5Oz r3 = (X.C284945Oz) r3
            java.lang.String r2 = r12.A04
            r3.Epw(r2)
            java.lang.Object r1 = r1.A01
            X.0sL r1 = (X.0sL) r1
            r1.invoke(r12, r0)
            goto L_0x13c4
        L_0x0455:
            com.instagram.common.session.UserSession r12 = (com.instagram.common.session.UserSession) r12
            X.0sa r0 = (X.C62320sa) r0
            X.AnonymousClass7TG.A1N(r12, r0)
            java.lang.Object r2 = r1.A02
            com.instagram.rtc.signaling.notifications.service.RtcCallActionIntentHandlerService r2 = (com.instagram.rtc.signaling.notifications.service.RtcCallActionIntentHandlerService) r2
            X.1X9 r3 = r2.A00
            android.content.Context r2 = X.DbT.A05(r2)
            X.38Y r2 = r3.A00(r2, r12)
            java.lang.Object r1 = r1.A01
            com.instagram.rtc.signaling.models.RtcConnectionEntity r1 = (com.instagram.rtc.signaling.models.RtcConnectionEntity) r1
            java.lang.String r1 = X.C70907OQz.A00(r1)
            r2.A09(r1)
            r0.invoke()
            goto L_0x13c4
        L_0x047a:
            java.lang.Object r0 = r1.A02
            X.5qj r0 = (X.C296845qj) r0
            X.2xS r2 = r0.A04
            java.lang.Object r0 = r1.A01
            X.1Xj r0 = (X.1Xj) r0
            r2.A06(r0)
            goto L_0x13c4
        L_0x0489:
            X.5Wy r12 = (X.C286575Wy) r12
            int r2 = X.C51968G9o.A0C(r0)
            r0 = 2
            if (r2 != r0) goto L_0x0498
            boolean r0 = r12.Bwn()
            if (r0 != 0) goto L_0x13c7
        L_0x0498:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x04a6
            r2 = 1327248603(0x4f1c34db, float:2.62070963E9)
            java.lang.String r0 = "com.instagram.profile.fragment.ProfileReelTrayController.maybeShowHighlightCardNux.<anonymous>.<anonymous> (ProfileReelTrayController.kt:593)"
            X.0fL.A01(r2, r0)
        L_0x04a6:
            java.lang.Object r2 = r1.A02
            X.6we r2 = (X.C322936we) r2
            X.0iw r0 = r2.A09
            java.lang.String r5 = r0.getModuleName()
            com.instagram.common.session.UserSession r4 = r2.A0A
            r3 = 1758953487(0x68d7800f, float:8.1413685E24)
            java.lang.Object r2 = r1.A01
            r1 = 8
            X.JFv r0 = new X.JFv
            r0.<init>(r2, r1)
            X.5PJ r0 = X.AnonymousClass5PI.A01(r12, r0, r3)
            X.C286885Ye.A00(r12, r4, r5, r0)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x13c4
            r0 = 1113272622(0x425b312e, float:54.798027)
            goto L_0x13c1
        L_0x04d0:
            boolean r0 = X.AnonymousClass7TE.A1a(r12)
            java.lang.Object r2 = r1.A02
            X.FgX r2 = (X.C50672FgX) r2
            if (r0 == 0) goto L_0x051e
            java.lang.Object r0 = r1.A01
            android.view.View r4 = X.C51969G9p.A0O(r0)
            com.instagram.profile.fragment.UserDetailFragment r2 = r2.A04
            X.5Gv r1 = r2.A0R
            if (r1 != 0) goto L_0x050f
            androidx.fragment.app.FragmentActivity r3 = r2.requireActivity()
            r0 = 2131953790(0x7f13087e, float:1.954406E38)
            java.lang.String r6 = r2.getString(r0)
            X.2fy r5 = X.C226262fy.BELOW_ANCHOR
            android.content.res.Resources r1 = X.DbV.A05(r2)
            r0 = 2131165213(0x7f07001d, float:1.7944637E38)
            int r7 = r1.getDimensionPixelSize(r0)
            android.content.res.Resources r1 = X.DbV.A05(r2)
            r0 = 2131165235(0x7f070033, float:1.7944681E38)
            int r8 = r1.getDimensionPixelSize(r0)
            X.5Gv r1 = X.C319536ql.A01(r3, r4, r5, r6, r7, r8)
            r2.A0R = r1
        L_0x050f:
            boolean r0 = com.instagram.profile.fragment.UserDetailFragment.A0i(r2)
            if (r0 != 0) goto L_0x13c4
            if (r1 == 0) goto L_0x13c4
            com.instagram.common.session.UserSession r0 = r2.A0I
            r1.A07(r0)
            goto L_0x13c4
        L_0x051e:
            com.instagram.profile.fragment.UserDetailFragment r0 = r2.A04
            android.content.Context r1 = r0.getContext()
            r0 = 3915(0xf4b, float:5.486E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.C59689JTv.A0B(r1, r0)
            goto L_0x13c4
        L_0x052f:
            android.view.View r12 = (android.view.View) r12
            android.view.MotionEvent r0 = (android.view.MotionEvent) r0
            X.AnonymousClass7TG.A1N(r12, r0)
            int r0 = r0.getAction()
            if (r0 != 0) goto L_0x13c4
            java.lang.Object r0 = r1.A01
            androidx.recyclerview.widget.RecyclerView r0 = (androidx.recyclerview.widget.RecyclerView) r0
            X.3kE r2 = r0.A0Z(r12)
            java.lang.Object r0 = r1.A02
            X.E35 r0 = (X.E35) r0
            X.8Qm r0 = r0.A07
            r0.A07(r2)
            goto L_0x13c4
        L_0x054f:
            X.5Wy r12 = (X.C286575Wy) r12
            int r2 = X.C51968G9o.A0B(r0)
            r0 = 2
            if (r2 != r0) goto L_0x055e
            boolean r0 = r12.Bwn()
            if (r0 != 0) goto L_0x13c7
        L_0x055e:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x056c
            r2 = -460241529(0xffffffffe4914587, float:-2.1438303E22)
            java.lang.String r0 = "com.instagram.opal.impl.ui.OpalAudienceSelectorFragment.onCreateView.<anonymous>.<anonymous> (OpalAudienceSelectorFragment.kt:113)"
            X.0fL.A01(r2, r0)
        L_0x056c:
            java.lang.Object r6 = r1.A02
            r0 = -2090870983(0xffffffff835fd739, float:-6.5780874E-37)
            boolean r0 = X.C51967G9n.A1Z(r12, r6, r0)
            java.lang.Object r3 = r12.ECw()
            if (r0 != 0) goto L_0x057f
            java.lang.Object r0 = X.AnonymousClass5XT.A00
            if (r3 != r0) goto L_0x0585
        L_0x057f:
            r0 = 8
            X.In7 r3 = X.G9w.A0o(r12, r6, r0)
        L_0x0585:
            X.0Ya r3 = (X.C59520Ya) r3
            r5 = r12
            X.5Wx r5 = (X.C286565Wx) r5
            r2 = 0
            X.C286565Wx.A0L(r5, r2)
            X.0sP r3 = (X.0sP) r3
            r0 = -2090869283(0xffffffff835fdddd, float:-6.5788497E-37)
            boolean r0 = X.C51967G9n.A1Z(r12, r6, r0)
            java.lang.Object r4 = r12.ECw()
            if (r0 != 0) goto L_0x05a1
            java.lang.Object r0 = X.AnonymousClass5XT.A00
            if (r4 != r0) goto L_0x05a7
        L_0x05a1:
            r0 = 9
            X.In7 r4 = X.G9w.A0o(r12, r6, r0)
        L_0x05a7:
            X.0sP r19 = X.C51968G9o.A1A(r5, r4)
            r0 = -2090867360(0xffffffff835fe560, float:-6.579712E-37)
            boolean r0 = X.C51967G9n.A1Z(r12, r6, r0)
            java.lang.Object r4 = r12.ECw()
            if (r0 != 0) goto L_0x05bc
            java.lang.Object r0 = X.AnonymousClass5XT.A00
            if (r4 != r0) goto L_0x05c2
        L_0x05bc:
            r0 = 10
            X.In7 r4 = X.G9w.A0o(r12, r6, r0)
        L_0x05c2:
            X.0sP r20 = X.C51968G9o.A1A(r5, r4)
            r0 = -2090865509(0xffffffff835fec9b, float:-6.580542E-37)
            boolean r0 = X.C51967G9n.A1Z(r12, r6, r0)
            java.lang.Object r4 = r12.ECw()
            if (r0 != 0) goto L_0x05d7
            java.lang.Object r0 = X.AnonymousClass5XT.A00
            if (r4 != r0) goto L_0x05dd
        L_0x05d7:
            r0 = 20
            X.Imz r4 = X.C51975G9x.A0u(r12, r6, r0)
        L_0x05dd:
            X.0sa r17 = X.C51968G9o.A19(r5, r4)
            java.lang.Object r4 = r1.A01
            X.4gU r4 = (X.C270284gU) r4
            X.Gn8 r0 = X.G9w.A0Q(r4)
            java.lang.Object r13 = r0.A02
            X.KhB r13 = (X.C62520KhB) r13
            X.Gn8 r0 = X.G9w.A0Q(r4)
            java.lang.Object r14 = r0.A04
            X.KhB r14 = (X.C62520KhB) r14
            X.Gn8 r0 = X.G9w.A0Q(r4)
            java.lang.String r15 = r0.A07
            X.Gn8 r0 = X.G9w.A0Q(r4)
            java.lang.Object r0 = r0.A06
            java.lang.Number r0 = (java.lang.Number) r0
            int r21 = X.DbX.A01(r0)
            X.Gn8 r0 = X.G9w.A0Q(r4)
            boolean r1 = r0.A08
            X.Gn8 r0 = X.G9w.A0Q(r4)
            java.lang.Object r0 = r0.A03
            java.util.List r0 = (java.util.List) r0
            r18 = r3
            r22 = r2
            r23 = r1
            r16 = r0
            X.C56328Hwf.A01(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x13c4
            r0 = 80969944(0x4d380d8, float:4.9724186E-36)
            goto L_0x13c1
        L_0x062b:
            X.5Wy r12 = (X.C286575Wy) r12
            int r2 = X.C51968G9o.A0B(r0)
            r0 = 2
            if (r2 != r0) goto L_0x063a
            boolean r0 = r12.Bwn()
            if (r0 != 0) goto L_0x13c7
        L_0x063a:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0648
            r2 = -1308521509(0xffffffffb2018bdb, float:-7.540588E-9)
            java.lang.String r0 = "com.instagram.newsfeed.followrequests.ui.compose.FollowRequestItemContent.<anonymous> (FollowRequestsCompose.kt:107)"
            X.0fL.A01(r2, r0)
        L_0x0648:
            java.lang.Object r3 = r1.A02
            X.GmF r3 = (X.C53329GmF) r3
            java.lang.Integer r0 = r3.A05
            X.DgM r14 = X.I7A.A00(r0)
            r13 = 0
            r0 = 1794064329(0x6aef3fc9, float:1.4461724E26)
            r12.ExS(r0)
            java.lang.Object r2 = r1.A01
            java.lang.Object r1 = r12.ECw()
            java.lang.Object r0 = X.AnonymousClass5XT.A00
            if (r1 != r0) goto L_0x066d
            r0 = 16
            X.MJ7 r1 = new X.MJ7
            r1.<init>(r0, r2, r3)
            r12.FLL(r1)
        L_0x066d:
            X.0sa r1 = (X.C62320sa) r1
            X.C51965G9l.A1V(r12)
            r17 = 3072(0xc00, float:4.305E-42)
            r18 = 6
            r15 = r13
            r16 = r1
            X.GR2.A00(r12, r13, r14, r15, r16, r17, r18)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x13c4
            r0 = 252394816(0xf0b3d40, float:6.8650254E-30)
            goto L_0x13c1
        L_0x0687:
            X.5Wy r12 = (X.C286575Wy) r12
            int r2 = X.C51968G9o.A0B(r0)
            r0 = 2
            if (r2 != r0) goto L_0x0696
            boolean r0 = r12.Bwn()
            if (r0 != 0) goto L_0x13c7
        L_0x0696:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x06a4
            r2 = -2132618050(0xffffffff80e2d4be, float:-2.083114E-38)
            java.lang.String r0 = "com.instagram.newsfeed.compose.ui.StartAvatar.<anonymous>.<anonymous> (NewsfeedStoryRow.kt:214)"
            X.0fL.A01(r2, r0)
        L_0x06a4:
            java.lang.Object r6 = r1.A02
            X.JRl r6 = (X.C59643JRl) r6
            X.GQz r6 = (X.C52400GQz) r6
            com.instagram.common.typedurl.ImageUrl r15 = r6.A03
            com.instagram.common.typedurl.ImageUrl r5 = r6.A02
            java.lang.Integer r2 = r6.A04
            r0 = -2093118438(0xffffffff833d8c1a, float:-5.5702937E-37)
            r12.ExS(r0)
            if (r2 != 0) goto L_0x06e3
            r13 = 0
        L_0x06b9:
            boolean r18 = X.C51968G9o.A1Y(r12)
            boolean r4 = r6.A05
            boolean r3 = r6.A07
            boolean r2 = r6.A06
            java.lang.Object r0 = r1.A01
            X.0sP r0 = (X.0sP) r0
            X.9J6 r14 = r6.A00
            r17 = r0
            r19 = r18
            r20 = r4
            r21 = r3
            r22 = r2
            r16 = r5
            X.GQY.A0B(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x13c4
            r0 = -2114586664(0xffffffff81f5f7d8, float:-9.0354425E-38)
            goto L_0x13c1
        L_0x06e3:
            int r0 = r2.intValue()
            long r2 = X.C289505di.A00(r12, r0)
            X.5bV r13 = X.C51968G9o.A0R(r2)
            goto L_0x06b9
        L_0x06f0:
            android.view.View r0 = X.C51969G9p.A0P(r0)
            java.lang.Object r2 = r1.A02
            X.3bF r2 = (X.C244473bF) r2
            java.lang.Integer r2 = r2.A08
            if (r2 == 0) goto L_0x0703
            java.lang.Object r1 = r1.A01
            android.graphics.drawable.Drawable r1 = (android.graphics.drawable.Drawable) r1
            r0.setBackground(r1)
        L_0x0703:
            r2 = 28
            goto L_0x0891
        L_0x0707:
            X.7ek r0 = (X.C336517ek) r0
            r2 = 1
            X.0qQ.A0B(r0, r2)
            java.lang.Object r2 = r1.A01
            X.2Wa r2 = (X.2Wa) r2
            java.lang.Object r4 = r2.A03
            com.facebook.litho.ComponentTree r4 = (com.facebook.litho.ComponentTree) r4
            r2 = 0
            X.0qQ.A0B(r4, r2)
            X.0eM r2 = r0.A00
            java.lang.Object r3 = r2.getValue()
            com.facebook.litho.LithoView r3 = (com.facebook.litho.LithoView) r3
            com.facebook.litho.ComponentTree r2 = r3.A00
            if (r2 == r4) goto L_0x0729
            r2 = 1
            r3.A0k(r4, r2)
        L_0x0729:
            java.lang.Object r1 = r1.A02
            X.7dx r1 = (X.C336037dx) r1
            X.3O5 r1 = r1.A00
            r0.A04(r1)
            r2 = 24
            goto L_0x0891
        L_0x0736:
            android.view.ViewGroup r7 = X.C51969G9p.A0Q(r0)
            java.lang.Object r6 = r1.A02
            X.GxX r6 = (X.C53989GxX) r6
            r0 = 2131440757(0x7f0b3475, float:1.8503506E38)
            android.view.View r0 = X.AnonymousClass7TF.A0F(r7, r0)
            android.widget.SeekBar r0 = (android.widget.SeekBar) r0
            r5 = 0
            int r2 = r0.getProgress()
            boolean r2 = X.AnonymousClass7TF.A1T(r2, r5)
            r0.setProgress(r5, r2)
            int r4 = r6.A00
            r0.setMax(r4)
            java.lang.Object r1 = r1.A01
            android.graphics.drawable.Drawable r1 = (android.graphics.drawable.Drawable) r1
            r0.setThumb(r1)
            android.widget.SeekBar$OnSeekBarChangeListener r3 = r6.A01
            r2 = 2
            X.WD8 r1 = new X.WD8
            r1.<init>(r2, r3, r6, r0)
            r0.setOnSeekBarChangeListener(r1)
            X.C53989GxX.A00(r7, r4, r5)
            r2 = 22
            goto L_0x0891
        L_0x0771:
            android.view.View r3 = X.C51969G9p.A0P(r0)
            r0 = 2131428571(0x7f0b04db, float:1.847879E38)
            android.widget.TextView r0 = X.AnonymousClass7TG.A0R(r3, r0)
            r2 = 2131428569(0x7f0b04d9, float:1.8478786E38)
            android.widget.ImageView r5 = X.DbX.A0J(r3, r2)
            java.lang.Object r8 = r1.A02
            X.GxF r8 = (X.C53971GxF) r8
            X.3NV r7 = r8.A00
            X.3NV r2 = X.AnonymousClass3NV.A05
            r6 = 0
            if (r7 == r2) goto L_0x0796
            X.3NV r2 = X.AnonymousClass3NV.A04
            if (r7 != r2) goto L_0x07d6
            boolean r2 = r8.A01
            if (r2 == 0) goto L_0x07d6
        L_0x0796:
            r4 = 1
        L_0x0797:
            X.3NV r2 = X.AnonymousClass3NV.A0A
            if (r7 != r2) goto L_0x07cb
            r3 = 2131239726(0x7f08232e, float:1.8095767E38)
        L_0x079e:
            r0.setBackgroundResource(r3)
            boolean r3 = r8.A02
            r2 = 2131971663(0x7f134e4f, float:1.9580312E38)
            if (r3 == 0) goto L_0x07ab
            r2 = 2131971665(0x7f134e51, float:1.9580316E38)
        L_0x07ab:
            r0.setText(r2)
            if (r4 == 0) goto L_0x07c5
            r5.setVisibility(r6)
            java.lang.Object r1 = r1.A01
            X.3Y5 r1 = (X.AnonymousClass3Y5) r1
            X.2V1 r1 = r1.A05
            android.content.Context r2 = r1.A0C
            r1 = 2131238512(0x7f081e70, float:1.8093305E38)
            X.DbU.A13(r2, r5, r1)
        L_0x07c1:
            r2 = 18
            goto L_0x0891
        L_0x07c5:
            r1 = 8
            r5.setVisibility(r1)
            goto L_0x07c1
        L_0x07cb:
            X.3NV r2 = X.AnonymousClass3NV.A04
            r3 = 2131239722(0x7f08232a, float:1.8095759E38)
            if (r7 != r2) goto L_0x079e
            r3 = 2131239724(0x7f08232c, float:1.8095763E38)
            goto L_0x079e
        L_0x07d6:
            r4 = 0
            goto L_0x0797
        L_0x07d8:
            com.instagram.user.follow.FollowButton r0 = (com.instagram.user.follow.FollowButton) r0
            r9 = 0
            X.AnonymousClass7TF.A1H(r12, r0)
            java.lang.Object r10 = r1.A02
            X.3aP r10 = (X.C243953aP) r10
            com.instagram.common.session.UserSession r8 = r10.A08
            boolean r2 = r10.A0S
            r23 = r2
            java.lang.Integer r2 = r10.A0I
            r18 = r2
            boolean r13 = r10.A0N
            boolean r12 = r10.A0U
            boolean r11 = r10.A0T
            boolean r7 = r10.A0R
            X.3aK r2 = r10.A0B
            r34 = r2
            float r14 = r10.A01
            int r6 = r10.A03
            float r5 = r10.A00
            int r4 = r10.A02
            X.0Tu r15 = X.0Tu.A05
            r2 = 36329852751593828(0x8111cf00004164, double:3.038483396458474E-306)
            boolean r28 = X.182.A06(r15, r8, r2)
            r15 = r8
            r16 = r34
            r17 = r0
            r19 = r14
            r20 = r5
            r21 = r6
            r22 = r4
            r24 = r13
            r25 = r12
            r26 = r11
            r27 = r7
            X.AnonymousClass52M.A01(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            X.4at r13 = r0.A0J
            java.lang.String r2 = r10.A0L
            r16 = r2
            X.3aO r2 = r10.A0G
            r24 = r2
            X.1Xj r12 = r10.A09
            X.0xF r2 = r10.A07
            r33 = r2
            com.instagram.search.common.analytics.SearchContext r2 = r10.A0A
            r18 = r2
            X.3aD r15 = r10.A0D
            X.3aF r11 = r10.A0C
            X.3aH r7 = r10.A0F
            X.3aJ r6 = r10.A0E
            X.3aT r5 = r10.A05
            java.lang.Object r1 = r1.A01
            boolean r29 = X.C51972G9s.A1a(r1)
            boolean r14 = r10.A0O
            boolean r4 = r10.A0Q
            boolean r3 = r10.A0P
            java.lang.Long r2 = r10.A0J
            java.lang.String r1 = r10.A0K
            r25 = r13
            r26 = r2
            r27 = r16
            r28 = r1
            r30 = r14
            r31 = r4
            r32 = r3
            r16 = r8
            r17 = r12
            r19 = r34
            r20 = r11
            r21 = r15
            r22 = r6
            r23 = r7
            r14 = r5
            r15 = r33
            X.AnonymousClass52M.A00(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            com.instagram.user.model.User r1 = r10.A0H
            X.0iw r2 = r10.A06
            r13.A03(r2, r8, r1)
            X.0sa r1 = r10.A0M
            r13.A0L = r1
            boolean r1 = X.AnonymousClass3GL.A01(r8)
            if (r1 == 0) goto L_0x088f
            if (r12 == 0) goto L_0x088f
            boolean r1 = r2 instanceof X.AnonymousClass4DU
            if (r1 == 0) goto L_0x088f
            X.4DU r2 = (X.AnonymousClass4DU) r2
            X.C267154b3.A01(r0, r8, r12, r2, r9)
        L_0x088f:
            r2 = 17
        L_0x0891:
            X.Ink r1 = new X.Ink
            r1.<init>(r0, r2)
            goto L_0x08ec
        L_0x0897:
            java.lang.String r12 = (java.lang.String) r12
            X.WWP r0 = (X.WWP) r0
            r18 = 0
            X.AnonymousClass7TF.A1H(r12, r0)
            java.lang.Object r9 = r1.A01
            X.1Xj r9 = (X.1Xj) r9
            if (r9 == 0) goto L_0x13c4
            java.lang.Object r1 = r1.A02
            X.I4I r1 = (X.I4I) r1
            X.33h r7 = r1.A01
            java.lang.String r10 = r0.getId()
            java.lang.String r11 = r0.C9L()
            r16 = -1
            r13 = 0
            X.1UQ r8 = X.1UQ.A0K
            r14 = r13
            r15 = r13
            r17 = r16
            r19 = r18
            r20 = r18
            r7.Ds5(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            goto L_0x13c4
        L_0x08c6:
            com.instagram.ui.widget.slideouticon.SlideInAndOutIconView r0 = (com.instagram.ui.widget.slideouticon.SlideInAndOutIconView) r0
            r2 = 1
            X.0qQ.A0B(r0, r2)
            java.lang.Object r7 = r1.A01
            android.graphics.drawable.Drawable r7 = (android.graphics.drawable.Drawable) r7
            java.lang.Object r1 = r1.A02
            X.GxP r1 = (X.C53981GxP) r1
            java.lang.String r6 = r1.A04
            float r5 = r1.A01
            X.0sP r4 = r1.A06
            X.0sP r3 = r1.A05
            int r2 = r1.A02
            float r1 = r1.A00
            r8 = r0
            r9 = r6
            r10 = r4
            r11 = r3
            r12 = r5
            r13 = r1
            r14 = r2
            X.C63264Ku9.A00(r7, r8, r9, r10, r11, r12, r13, r14)
            X.Irq r1 = X.C58433Irq.A00
        L_0x08ec:
            X.3eI r9 = X.C51965G9l.A0f(r1)
            return r9
        L_0x08f1:
            X.5Wy r12 = (X.C286575Wy) r12
            int r2 = X.C51968G9o.A0B(r0)
            r0 = 2
            if (r2 != r0) goto L_0x0900
            boolean r0 = r12.Bwn()
            if (r0 != 0) goto L_0x13c7
        L_0x0900:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x090e
            r2 = 1714315353(0x662e6059, float:2.0586727E23)
            java.lang.String r0 = "com.instagram.feed.tifu.ui.TifuHScrollUnit.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TifuHScrollUnit.kt:262)"
            X.0fL.A01(r2, r0)
        L_0x090e:
            androidx.compose.ui.Modifier r5 = X.C51969G9p.A0U()
            X.5Zr r2 = X.C287215Zl.A00
            r0 = 1098907648(0x41800000, float:16.0)
            X.6Fc r0 = X.C287275Zs.A01(r0)
            java.lang.Object r7 = r1.A02
            X.5vX r7 = (X.AnonymousClass5vX) r7
            java.lang.Object r1 = r1.A01
            X.0sa r1 = (X.C62320sa) r1
            X.5RD r2 = X.C291495hO.A01(r0, r12, r2)
            r4 = 0
            int r6 = X.C287425a7.A00(r12)
            r3 = r12
            X.5Wx r3 = (X.C286565Wx) r3
            X.5RM r0 = X.C286565Wx.A04(r3)
            androidx.compose.ui.Modifier r5 = X.C287435a8.A01(r12, r5)
            X.C51973G9u.A0y(r12, r3)
            X.C51971G9r.A12(r12, r2, r0)
            X.0sL r2 = X.C287485aD.A02
            boolean r0 = r3.A0K
            if (r0 != 0) goto L_0x0948
            boolean r0 = X.C51972G9s.A1Q(r12, r6)
            if (r0 != 0) goto L_0x094b
        L_0x0948:
            X.C51971G9r.A13(r12, r2, r6)
        L_0x094b:
            X.C51965G9l.A18(r12, r5)
            r0 = -1152577506(0xffffffffbb4d101e, float:-0.0031290124)
            r12.ExS(r0)
            boolean r0 = r7.A09
            if (r0 != 0) goto L_0x0966
            X.62P r14 = r7.A05
            r13 = 0
            r15 = 1107296256(0x42000000, float:32.0)
            r18 = 0
            r16 = 384(0x180, float:5.38E-43)
            r17 = 10
            X.C56224Hur.A00(r12, r13, r14, r15, r16, r17, r18)
        L_0x0966:
            X.C286565Wx.A0L(r3, r4)
            if (r0 == 0) goto L_0x09a3
            r0 = -1152565844(0xffffffffbb4d3dac, float:-0.0031317277)
            r12.ExS(r0)
            r0 = 2131975410(0x7f135cf2, float:1.9587912E38)
        L_0x0974:
            java.lang.String r2 = X.C288035bG.A00(r12, r0)
            X.C286565Wx.A0L(r3, r4)
            X.5Z4 r0 = X.C51966G9m.A0c(r12)
            X.C51975G9x.A14(r12, r0, r2)
            r0 = 2131975374(0x7f135cce, float:1.9587838E38)
            java.lang.String r5 = X.C288035bG.A00(r12, r0)
            X.6CB r4 = X.AnonymousClass6CA.A01(r12)
            X.6CD r3 = X.AnonymousClass6CD.SMALL
            r7 = 1572864(0x180000, float:2.204052E-39)
            r8 = 412(0x19c, float:5.77E-43)
            r2 = r12
            r6 = r1
            X.AnonymousClass6CE.A08(r2, r3, r4, r5, r6, r7, r8)
            boolean r0 = X.C51967G9n.A1R(r12)
            if (r0 == 0) goto L_0x13c4
            r0 = -376543347(0xffffffffe98e678d, float:-2.151956E25)
            goto L_0x13c1
        L_0x09a3:
            r0 = -1152563094(0xffffffffbb4d486a, float:-0.003132368)
            r12.ExS(r0)
            r0 = 2131975375(0x7f135ccf, float:1.958784E38)
            goto L_0x0974
        L_0x09ad:
            java.lang.Number r0 = (java.lang.Number) r0
            r0.floatValue()
            java.lang.Object r0 = r1.A02
            X.5vX r0 = (X.AnonymousClass5vX) r0
            X.62P r2 = r0.A06
            r0 = 0
            java.lang.Object r0 = X.00k.A0O(r2, r0)
            X.9J3 r0 = (X.AnonymousClass9J3) r0
            if (r0 == 0) goto L_0x13c4
            java.lang.Object r1 = r1.A01
            X.0sP r1 = (X.0sP) r1
            java.lang.String r0 = r0.A03
            r1.invoke(r0)
            goto L_0x13c4
        L_0x09cc:
            X.5Wy r12 = (X.C286575Wy) r12
            int r2 = X.C51968G9o.A0B(r0)
            r0 = 2
            if (r2 != r0) goto L_0x09db
            boolean r0 = r12.Bwn()
            if (r0 != 0) goto L_0x13c7
        L_0x09db:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x09e9
            r2 = -1871313751(0xffffffff907604a9, float:-4.8518536E-29)
            java.lang.String r0 = "com.instagram.feed.tifu.ui.TifuHScrollPagerUnit.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TifuHScrollPagerUnit.kt:173)"
            X.0fL.A01(r2, r0)
        L_0x09e9:
            androidx.compose.ui.Modifier r5 = X.C51969G9p.A0U()
            X.5Zr r2 = X.C287215Zl.A00
            r0 = 1098907648(0x41800000, float:16.0)
            X.6Fc r0 = X.C287275Zs.A01(r0)
            java.lang.Object r7 = r1.A02
            X.5vX r7 = (X.AnonymousClass5vX) r7
            java.lang.Object r1 = r1.A01
            X.0sa r1 = (X.C62320sa) r1
            X.5RD r2 = X.C291495hO.A01(r0, r12, r2)
            r4 = 0
            int r6 = X.C287425a7.A00(r12)
            r3 = r12
            X.5Wx r3 = (X.C286565Wx) r3
            X.5RM r0 = X.C286565Wx.A04(r3)
            androidx.compose.ui.Modifier r5 = X.C287435a8.A01(r12, r5)
            X.C51973G9u.A0y(r12, r3)
            X.C51971G9r.A12(r12, r2, r0)
            X.0sL r2 = X.C287485aD.A02
            boolean r0 = r3.A0K
            if (r0 != 0) goto L_0x0a23
            boolean r0 = X.C51972G9s.A1Q(r12, r6)
            if (r0 != 0) goto L_0x0a26
        L_0x0a23:
            X.C51971G9r.A13(r12, r2, r6)
        L_0x0a26:
            X.C51965G9l.A18(r12, r5)
            r0 = -549860359(0xffffffffdf39cbf9, float:-1.3388068E19)
            r12.ExS(r0)
            boolean r0 = r7.A09
            if (r0 != 0) goto L_0x0a41
            X.62P r14 = r7.A05
            r13 = 0
            r15 = 1107296256(0x42000000, float:32.0)
            r18 = 0
            r16 = 384(0x180, float:5.38E-43)
            r17 = 10
            X.C56224Hur.A00(r12, r13, r14, r15, r16, r17, r18)
        L_0x0a41:
            X.C286565Wx.A0L(r3, r4)
            if (r0 == 0) goto L_0x0a7e
            r0 = -549848131(0xffffffffdf39fbbd, float:-1.3401513E19)
            r12.ExS(r0)
            r0 = 2131975410(0x7f135cf2, float:1.9587912E38)
        L_0x0a4f:
            java.lang.String r2 = X.C288035bG.A00(r12, r0)
            X.C286565Wx.A0L(r3, r4)
            X.5Z4 r0 = X.C51966G9m.A0c(r12)
            X.C51975G9x.A14(r12, r0, r2)
            r0 = 2131975374(0x7f135cce, float:1.9587838E38)
            java.lang.String r5 = X.C288035bG.A00(r12, r0)
            X.6CB r4 = X.AnonymousClass6CA.A01(r12)
            X.6CD r3 = X.AnonymousClass6CD.SMALL
            r7 = 1572864(0x180000, float:2.204052E-39)
            r8 = 412(0x19c, float:5.77E-43)
            r2 = r12
            r6 = r1
            X.AnonymousClass6CE.A08(r2, r3, r4, r5, r6, r7, r8)
            boolean r0 = X.C51967G9n.A1R(r12)
            if (r0 == 0) goto L_0x13c4
            r0 = 1983286718(0x76368dbe, float:9.256571E32)
            goto L_0x13c1
        L_0x0a7e:
            r0 = -549845317(0xffffffffdf3a06bb, float:-1.3404607E19)
            r12.ExS(r0)
            r0 = 2131975375(0x7f135ccf, float:1.958784E38)
            goto L_0x0a4f
        L_0x0a88:
            X.5Wy r12 = (X.C286575Wy) r12
            int r2 = X.C51968G9o.A0B(r0)
            r0 = 2
            if (r2 != r0) goto L_0x0a97
            boolean r0 = r12.Bwn()
            if (r0 != 0) goto L_0x13c7
        L_0x0a97:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0aa5
            r2 = -845327013(0xffffffffcd9d555b, float:-3.29952096E8)
            java.lang.String r0 = "com.instagram.feed.opencarousel.reviewpage.fragment.OpenCarouselReviewPageHeaderFragment.onCreateView.<anonymous>.<anonymous> (OpenCarouselReviewPageHeaderFragment.kt:80)"
            X.0fL.A01(r2, r0)
        L_0x0aa5:
            X.5Zr r3 = X.C287215Zl.A02
            java.lang.Object r6 = r1.A02
            X.H19 r6 = (X.H19) r6
            java.lang.Object r7 = r1.A01
            X.4gU r7 = (X.C270284gU) r7
            X.5Qk r2 = androidx.compose.ui.Modifier.A00
            X.5Zx r0 = X.C287275Zs.A07
            X.5RD r1 = X.C291495hO.A00(r0, r12, r3)
            r5 = 0
            int r4 = X.C287425a7.A00(r12)
            r3 = r12
            X.5Wx r3 = (X.C286565Wx) r3
            X.5RM r0 = X.C286565Wx.A04(r3)
            androidx.compose.ui.Modifier r2 = X.C287435a8.A01(r12, r2)
            X.C51973G9u.A0y(r12, r3)
            X.C51971G9r.A12(r12, r1, r0)
            X.0sL r1 = X.C287485aD.A02
            boolean r0 = r3.A0K
            if (r0 != 0) goto L_0x0ad9
            boolean r0 = X.C51972G9s.A1Q(r12, r4)
            if (r0 != 0) goto L_0x0adc
        L_0x0ad9:
            X.C51971G9r.A13(r12, r1, r4)
        L_0x0adc:
            X.C51965G9l.A18(r12, r2)
            java.lang.Object r0 = r7.getValue()
            X.GMQ r0 = (X.GMQ) r0
            X.H19.A01(r12, r0, r6, r5)
            java.lang.Object r0 = r7.getValue()
            X.GMQ r0 = (X.GMQ) r0
            X.H19.A00(r12, r0, r6, r5)
            X.H19.A04(r12, r6, r5)
            X.H19.A03(r12, r6, r5)
            boolean r0 = X.C51967G9n.A1R(r12)
            if (r0 == 0) goto L_0x13c4
            r0 = 1838577902(0x6d9678ee, float:5.8211183E27)
            goto L_0x13c1
        L_0x0b02:
            android.content.Context r12 = (android.content.Context) r12
            X.0iw r0 = (X.AnonymousClass0iw) r0
            X.AnonymousClass7TG.A1N(r12, r0)
            java.lang.Object r2 = r1.A02
            X.A8f r2 = (X.C39765A8f) r2
            com.instagram.common.session.UserSession r5 = r2.A00
            X.Hs7 r4 = new X.Hs7
            r4.<init>(r0, r5)
            X.HMr r10 = X.C54660HMr.COMMENT_OFF
            java.lang.String r3 = "comment_off"
            java.lang.String r2 = "upsell_permanent_entrypoint"
            r8 = 0
            java.lang.String r0 = "perm_entry_point_tap"
            r4.A02(r2, r8, r3, r0)
            X.AnonymousClass1pc.A00()
            java.lang.Object r7 = r1.A01
            X.1Xj r7 = (X.1Xj) r7
            X.UsH r6 = new X.UsH
            r9 = r8
            r11 = r8
            r6.<init>(r7, r8, r9, r10, r11)
            X.7Pr r1 = X.DbS.A0W(r5)
            r0 = 2131976116(0x7f135fb4, float:1.9589343E38)
            X.DbZ.A0z(r12, r1, r0)
            X.7Pu r0 = r1.A00()
            r0.A03(r12, r6)
            goto L_0x13c4
        L_0x0b41:
            X.4bN r12 = (X.C267324bN) r12
            X.GDe r0 = (X.C52058GDe) r0
            boolean r3 = X.AnonymousClass7TG.A1Z(r12, r0)
            X.1Xj r5 = r12.A02
            java.lang.String r2 = "Required value was null."
            if (r5 == 0) goto L_0x0ba8
            X.3W1 r6 = r0.A0E
            if (r6 == 0) goto L_0x0ba3
            java.lang.Object r7 = r1.A01
            com.instagram.common.session.UserSession r7 = (com.instagram.common.session.UserSession) r7
            boolean r0 = X.AnonymousClass3ZJ.A0D(r7, r5)
            if (r0 == 0) goto L_0x0b68
            java.lang.Object r0 = r1.A02
            X.Hou r0 = (X.C55873Hou) r0
            X.3Wa r0 = r0.A06
            r0.D3d(r5, r3)
            goto L_0x13c4
        L_0x0b68:
            com.instagram.api.schemas.OriginalSoundDataIntf r0 = r5.A1J()
            boolean r4 = X.AnonymousClass7TF.A1V(r0)
            java.lang.Object r0 = r1.A02
            X.Hou r0 = (X.C55873Hou) r0
            X.3Wa r3 = r0.A06
            X.8ZN r2 = X.AnonymousClass8ZN.MUSIC_IN_FEED
            if (r4 == 0) goto L_0x0b92
            X.1sP r0 = X.DA2.A00()
            X.5nz r1 = new X.5nz
            r1.<init>(r0)
            com.instagram.api.schemas.OriginalSoundDataIntf r0 = r5.A1J()
            r1.A09 = r0
            X.1sP r0 = r1.A00()
        L_0x0b8d:
            r3.D3b(r2, r0, r5, r6)
            goto L_0x13c4
        L_0x0b92:
            X.3ZH r0 = r5.A1Y()
            com.instagram.api.schemas.MusicInfo r1 = X.C51976G9y.A0F(r0)
            X.1E5 r0 = X.1E4.A00(r7)
            X.1sP r0 = X.HWN.A00(r0, r1)
            goto L_0x0b8d
        L_0x0ba3:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r2)
            throw r0
        L_0x0ba8:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r2)
            throw r0
        L_0x0bad:
            int r4 = X.AnonymousClass7TE.A0M(r12)
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
            r2 = 1
            X.0qQ.A0B(r0, r2)
            java.lang.Object r3 = r1.A02
            X.2Wa r3 = (X.2Wa) r3
            java.lang.Object r2 = r3.A03
            java.util.Collection r2 = (java.util.Collection) r2
            java.util.ArrayList r2 = X.00k.A0U(r2)
            r2.remove(r0)
            com.google.common.collect.ImmutableList r2 = X.DbU.A0K(r2)
            r3.A01(r2)
            java.lang.Object r1 = r1.A01
            X.6s0 r1 = (X.C320216s0) r1
            if (r1 == 0) goto L_0x0bd9
            r1.A08(r0, r4)
            X.0gF r9 = X.C60340gF.A00
            return r9
        L_0x0bd9:
            r9 = 0
            return r9
        L_0x0bdb:
            X.5Wy r12 = (X.C286575Wy) r12
            int r2 = X.C51968G9o.A0B(r0)
            r0 = 2
            if (r2 != r0) goto L_0x0bea
            boolean r0 = r12.Bwn()
            if (r0 != 0) goto L_0x13c7
        L_0x0bea:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0bf8
            r2 = -1080857132(0xffffffffbf936dd4, float:-1.1517892)
            java.lang.String r0 = "com.instagram.fanclub.settings.adapter.FanClubMainRecommendationViewHolder.bind.<anonymous>.<anonymous> (FanClubMainRecommendationViewHolder.kt:43)"
            X.0fL.A01(r2, r0)
        L_0x0bf8:
            java.lang.Object r3 = r1.A01
            X.GqK r3 = (X.C53549GqK) r3
            java.lang.String r0 = r3.A07
            java.lang.String r14 = java.lang.String.valueOf(r0)
            java.lang.String r0 = r3.A04
            java.lang.String r15 = java.lang.String.valueOf(r0)
            java.lang.String r0 = r3.A05
            com.instagram.common.typedurl.SimpleImageUrl r13 = X.DbS.A0V(r0)
            java.lang.Boolean r0 = r3.A01
            boolean r18 = X.DbX.A1a(r0)
            r0 = 1049203520(0x3e899340, float:0.26870155)
            boolean r0 = X.C51967G9n.A1Z(r12, r3, r0)
            java.lang.Object r2 = r1.A02
            boolean r1 = X.C51966G9m.A1U(r12, r2, r0)
            java.lang.Object r0 = r12.ECw()
            if (r1 != 0) goto L_0x0c2b
            java.lang.Object r1 = X.AnonymousClass5XT.A00
            if (r0 != r1) goto L_0x0c35
        L_0x0c2b:
            r1 = 19
            X.Inr r0 = new X.Inr
            r0.<init>(r1, r2, r3)
            r12.FLL(r0)
        L_0x0c35:
            X.0sa r0 = (X.C62320sa) r0
            boolean r17 = X.C51968G9o.A1Y(r12)
            r16 = r0
            X.C54976Ha9.A00(r12, r13, r14, r15, r16, r17, r18)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x13c4
            r0 = 2043132104(0x79c7b8c8, float:1.2962686E35)
            goto L_0x13c1
        L_0x0c4b:
            java.lang.String r12 = (java.lang.String) r12
            boolean r15 = X.C51975G9x.A1X(r0, r12)
            java.lang.Object r0 = r1.A01
            X.4Cq r0 = (X.C262224Cq) r0
            java.lang.Object r11 = r1.A02
            r13 = 0
            r14 = 8
            goto L_0x0c69
        L_0x0c5b:
            java.lang.String r12 = (java.lang.String) r12
            boolean r15 = X.C51975G9x.A1X(r0, r12)
            java.lang.Object r0 = r1.A01
            X.4Cq r0 = (X.C262224Cq) r0
            java.lang.Object r11 = r1.A02
            r13 = 0
            r14 = 7
        L_0x0c69:
            X.MEW r10 = new X.MEW
            r10.<init>(r11, r12, r13, r14, r15)
            X.AnonymousClass7TE.A1Z(r10, r0)
            goto L_0x13c4
        L_0x0c73:
            java.lang.Object r2 = r1.A02
            X.HqW r2 = (X.C55965HqW) r2
            java.util.concurrent.atomic.AtomicBoolean r0 = r2.A02
            boolean r0 = r0.get()
            if (r0 != 0) goto L_0x0c8e
            android.os.Handler r2 = r2.A00
            r0 = 0
            r2.removeCallbacksAndMessages(r0)
            java.lang.Object r0 = r1.A01
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            r0.run()
            goto L_0x13c4
        L_0x0c8e:
            r3 = 0
            java.lang.String r2 = "MsysMailboxSessionManagerImpl: Timeout waiting for pending messages queue drained"
            r1 = 20134884(0x1333be4, float:3.2920077E-38)
            X.0sm r0 = X.0Yt.A0E()
            X.0kD.A0J(r2, r3, r0, r1)
            goto L_0x13c4
        L_0x0c9d:
            X.5Wy r12 = (X.C286575Wy) r12
            int r2 = X.C51968G9o.A0B(r0)
            r0 = 2
            if (r2 != r0) goto L_0x0cac
            boolean r0 = r12.Bwn()
            if (r0 != 0) goto L_0x13c7
        L_0x0cac:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0cba
            r2 = -1777524152(0xffffffff960d2248, float:-1.1400707E-25)
            java.lang.String r0 = "com.instagram.direct.messagethread.compose.DecoratedMessage.<anonymous>.<anonymous>.<anonymous> (DecoratedMessage.kt:52)"
            X.0fL.A01(r2, r0)
        L_0x0cba:
            androidx.compose.ui.Modifier r4 = X.C51969G9p.A0U()
            r0 = -1351386207(0xffffffffaf737ba1, float:-2.2144643E-10)
            r12.ExS(r0)
            java.lang.Object r3 = r1.A01
            java.lang.Object r2 = r12.ECw()
            java.lang.Object r0 = X.AnonymousClass5XT.A00
            if (r2 != r0) goto L_0x0cd8
            r0 = 31
            X.PqN r2 = new X.PqN
            r2.<init>(r3, r0)
            r12.FLL(r2)
        L_0x0cd8:
            X.0sP r2 = (X.0sP) r2
            r6 = r12
            X.5Wx r6 = (X.C286565Wx) r6
            r5 = 0
            X.C286565Wx.A0L(r6, r5)
            androidx.compose.ui.Modifier r2 = X.C56164Htt.A01(r4, r2)
            java.lang.Object r4 = r1.A02
            X.0sL r4 = (X.0sL) r4
            X.5RD r1 = X.C51968G9o.A0V(r12)
            int r3 = X.C287425a7.A00(r12)
            X.5RM r0 = X.C286565Wx.A04(r6)
            androidx.compose.ui.Modifier r2 = X.C287435a8.A01(r12, r2)
            X.C51973G9u.A0y(r12, r6)
            X.C51971G9r.A12(r12, r1, r0)
            X.0sL r1 = X.C287485aD.A02
            boolean r0 = r6.A0K
            if (r0 != 0) goto L_0x0d0b
            boolean r0 = X.C51972G9s.A1Q(r12, r3)
            if (r0 != 0) goto L_0x0d0e
        L_0x0d0b:
            X.C51971G9r.A13(r12, r1, r3)
        L_0x0d0e:
            X.C51965G9l.A18(r12, r2)
            X.C51967G9n.A1P(r12, r4, r5)
            boolean r0 = X.C51967G9n.A1R(r12)
            if (r0 == 0) goto L_0x13c4
            r0 = -1885081092(0xffffffff8fa3f1fc, float:-1.616625E-29)
            goto L_0x13c1
        L_0x0d1f:
            X.5Wy r12 = (X.C286575Wy) r12
            int r2 = X.C51968G9o.A0B(r0)
            r0 = 2
            if (r2 != r0) goto L_0x0d2e
            boolean r0 = r12.Bwn()
            if (r0 != 0) goto L_0x13c7
        L_0x0d2e:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0d3c
            r2 = 2748135(0x29eee7, float:3.850957E-39)
            java.lang.String r0 = "com.instagram.direct.messagethread.MessageComposableHolder.onBindData.<anonymous> (MessageComposableHolder.kt:49)"
            X.0fL.A01(r2, r0)
        L_0x0d3c:
            java.lang.Object r5 = r1.A02
            X.HAG r5 = (X.HAG) r5
            int r0 = X.C249703kE.FLAG_ADAPTER_FULLUPDATE
            X.7LG r2 = r5.A02
            X.0iw r0 = r2.A03
            java.lang.String r4 = r0.getModuleName()
            com.instagram.common.session.UserSession r3 = r2.A04
            r2 = 1137840773(0x43d21285, float:420.14468)
            java.lang.Object r1 = r1.A01
            r0 = 16
            X.5PJ r0 = A00(r12, r1, r5, r0, r2)
            X.C286885Ye.A01(r12, r3, r4, r0)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x13c4
            r0 = 683359294(0x28bb3c3e, float:2.0787296E-14)
            goto L_0x13c1
        L_0x0d65:
            X.5Wy r12 = (X.C286575Wy) r12
            int r2 = X.C51968G9o.A0B(r0)
            r0 = 2
            if (r2 != r0) goto L_0x0d74
            boolean r0 = r12.Bwn()
            if (r0 != 0) goto L_0x13c7
        L_0x0d74:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0d82
            r2 = -597093484(0xffffffffdc691394, float:-2.62420784E17)
            java.lang.String r0 = "com.instagram.direct.messagethread.MessageComposableHolder.onBindData.<anonymous>.<anonymous> (MessageComposableHolder.kt:50)"
            X.0fL.A01(r2, r0)
        L_0x0d82:
            r4 = 0
            X.4bM r2 = X.C55419HhP.A05
            java.lang.Object r5 = r1.A02
            X.HAG r5 = (X.HAG) r5
            int r0 = X.C249703kE.FLAG_ADAPTER_FULLUPDATE
            X.7LG r3 = r5.A02
            X.9HC r0 = r3.A07
            X.5Xl r13 = r2.A02(r0)
            X.4bM r2 = X.C55419HhP.A04
            X.5Oz r0 = r3.A01
            java.lang.Object r0 = r0.getValue()
            X.5Xl r14 = r2.A02(r0)
            X.4bM r2 = X.C55419HhP.A00
            X.7Wl r0 = r3.A06
            X.5Xl r15 = r2.A02(r0)
            X.4bM r2 = X.C55419HhP.A03
            X.2cp r0 = r3.A02
            X.5Xl r16 = r2.A02(r0)
            X.4bM r2 = X.C55419HhP.A02
            X.IR5 r0 = r5.A03
            X.5Xl r17 = r2.A02(r0)
            X.4bM r3 = X.C55419HhP.A01
            r0 = -458237250(0xffffffffe4afdabe, float:-2.5951538E22)
            boolean r2 = X.C51967G9n.A1Z(r12, r5, r0)
            java.lang.Object r0 = r12.ECw()
            if (r2 != 0) goto L_0x0dca
            java.lang.Object r2 = X.AnonymousClass5XT.A00
            if (r0 != r2) goto L_0x0dd2
        L_0x0dca:
            X.HiJ r0 = new X.HiJ
            r0.<init>(r5)
            r12.FLL(r0)
        L_0x0dd2:
            X.C51965G9l.A1X(r12, r4)
            X.5Xl r18 = r3.A02(r0)
            X.4bM r3 = X.AnonymousClass5YA.A0D
            java.lang.Object r2 = r12.AJO(r3)
            X.5RG r2 = (X.AnonymousClass5RG) r2
            X.0qQ.A0B(r2, r4)
            X.IGg r0 = new X.IGg
            r0.<init>(r2)
            X.5Xl r19 = r3.A02(r0)
            X.5Xl[] r4 = new X.C286705Xl[]{r13, r14, r15, r16, r17, r18, r19}
            r3 = -568768699(0xffffffffde194745, float:-2.76121812E18)
            java.lang.Object r2 = r1.A01
            r1 = 15
            X.JG2 r0 = new X.JG2
            r0.<init>(r1, r2, r5)
            boolean r0 = X.C51973G9u.A1U(r12, r0, r4, r3)
            if (r0 == 0) goto L_0x13c4
            r0 = -1095282105(0xffffffffbeb75247, float:-0.3580496)
            goto L_0x13c1
        L_0x0e08:
            X.5Wy r12 = (X.C286575Wy) r12
            int r2 = X.C51968G9o.A0B(r0)
            r0 = 2
            if (r2 != r0) goto L_0x0e17
            boolean r0 = r12.Bwn()
            if (r0 != 0) goto L_0x13c7
        L_0x0e17:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0e25
            r2 = 593764544(0x236420c0, float:1.236684E-17)
            java.lang.String r0 = "com.instagram.direct.messagethread.MessageComposableHolder.onBindData.<anonymous>.<anonymous>.<anonymous> (MessageComposableHolder.kt:59)"
            X.0fL.A01(r2, r0)
        L_0x0e25:
            java.lang.Object r2 = r1.A02
            X.HAG r2 = (X.HAG) r2
            java.lang.Object r1 = r1.A01
            r0 = 0
            X.HAG.A00(r12, r2, r1, r0)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x13c4
            r0 = 2014425929(0x7811b349, float:1.1820615E34)
            goto L_0x13c1
        L_0x0e3a:
            X.5Wy r12 = (X.C286575Wy) r12
            int r2 = X.C51968G9o.A0B(r0)
            r0 = 2
            if (r2 != r0) goto L_0x0e49
            boolean r0 = r12.Bwn()
            if (r0 != 0) goto L_0x13c7
        L_0x0e49:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0e57
            r2 = -2129178703(0xffffffff81174fb1, float:-2.7791496E-38)
            java.lang.String r0 = "com.instagram.direct.messagethread.MessageComposableHolder.DecoratedItem.<anonymous> (MessageComposableHolder.kt:68)"
            X.0fL.A01(r2, r0)
        L_0x0e57:
            java.lang.Object r2 = r1.A02
            X.HAG r2 = (X.HAG) r2
            java.lang.Object r1 = r1.A01
            r0 = 0
            X.748 r1 = (X.AnonymousClass748) r1
            r2.A04(r12, r1, r0)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x13c4
            r0 = 1687728867(0x6498b2e3, float:2.2534362E22)
            goto L_0x13c1
        L_0x0e6e:
            X.SFs r0 = (X.C11218SFs) r0
            r2 = 1
            X.0qQ.A0B(r0, r2)
            java.lang.Object r2 = r1.A01
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r4 = r1.A02
            com.instagram.direct.locationsharing.service.DirectLiveLocationService r4 = (com.instagram.direct.locationsharing.service.DirectLiveLocationService) r4
            java.util.Iterator r3 = r2.iterator()
        L_0x0e80:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x0e92
            java.lang.Object r1 = r3.next()
            long r1 = X.AnonymousClass7TE.A0R(r1)
            com.instagram.direct.locationsharing.service.DirectLiveLocationService.A02(r4, r0, r1)
            goto L_0x0e80
        L_0x0e92:
            X.Rps r2 = r0.A00
            X.Rps r1 = r4.A05
            boolean r1 = X.0qQ.A0K(r2, r1)
            if (r1 == 0) goto L_0x13c4
            r1 = 0
            r0.A00 = r1
            goto L_0x13c4
        L_0x0ea1:
            X.SFs r0 = (X.C11218SFs) r0
            r2 = 1
            X.0qQ.A0B(r0, r2)
            java.lang.Object r2 = r1.A01
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r4 = r1.A02
            com.instagram.direct.locationsharing.service.DirectLiveLocationService r4 = (com.instagram.direct.locationsharing.service.DirectLiveLocationService) r4
            java.util.Iterator r3 = r2.iterator()
        L_0x0eb3:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x13c4
            java.lang.Object r1 = r3.next()
            long r1 = X.AnonymousClass7TE.A0R(r1)
            com.instagram.direct.locationsharing.service.DirectLiveLocationService.A02(r4, r0, r1)
            goto L_0x0eb3
        L_0x0ec5:
            java.lang.String r0 = (java.lang.String) r0
            java.lang.StringBuilder r3 = X.C51975G9x.A0l(r12)
            java.lang.String r2 = "metadata: "
            r3.append(r2)
            r3.append(r12)
            java.lang.String r2 = ", errorMsg: "
            r3.append(r2)
            java.lang.String r2 = X.AnonymousClass7TF.A0l(r0, r3)
            java.lang.String r0 = "NoteQuickReplySheetFragment:setNoteVideoPogSimpleVideoLayout"
            X.0wb.A03(r0, r2)
            java.lang.Object r2 = r1.A02
            X.NJf r2 = (X.C68467NJf) r2
            java.lang.Object r0 = r1.A01
            X.NWf r0 = (X.C68770NWf) r0
            X.C68467NJf.A04(r2, r0)
            goto L_0x13c4
        L_0x0eee:
            java.lang.String r0 = (java.lang.String) r0
            java.lang.StringBuilder r3 = X.C51975G9x.A0l(r12)
            java.lang.String r2 = "metadata: "
            r3.append(r2)
            r3.append(r12)
            java.lang.String r2 = ", errorMsg: "
            r3.append(r2)
            java.lang.String r2 = X.AnonymousClass7TF.A0l(r0, r3)
            java.lang.String r0 = "SelfNoteBottomSheetFragment:setNoteVideoPogSimpleVideoLayout"
            X.0wb.A03(r0, r2)
            java.lang.Object r2 = r1.A02
            X.NKL r2 = (X.NKL) r2
            java.lang.Object r0 = r1.A01
            X.NWb r0 = (X.C68766NWb) r0
            X.NKL.A04(r2, r0)
            goto L_0x13c4
        L_0x0f17:
            java.io.File r12 = (java.io.File) r12
            com.instagram.common.gallery.Medium r0 = (com.instagram.common.gallery.Medium) r0
            X.AnonymousClass7TG.A1N(r12, r0)
            java.lang.Object r3 = r1.A02
            X.OVN r3 = (X.OVN) r3
            java.lang.Object r2 = r1.A01
            X.8Vp r2 = (X.C356888Vp) r2
            java.lang.Integer r1 = r2.A02
            java.lang.String r4 = X.LKT.A01(r1)
            java.lang.String r2 = r2.A07
            r6 = 0
            r1 = 12
            X.9JH r5 = new X.9JH
            r5.<init>((java.lang.String) r4, (java.lang.String) r2, (java.lang.String) r6, (int) r1)
            java.lang.String r11 = r0.A0a
            if (r11 == 0) goto L_0x13c4
            int r0 = r0.A03
            long r0 = (long) r0
            com.instagram.common.session.UserSession r2 = r3.A01
            com.instagram.pendingmedia.model.ClipInfo r10 = X.Q0X.A02(r2, r12, r0)
            X.3sy r9 = r3.A02
            X.7Zi r4 = X.C333527Zh.A00(r2)
            java.util.List r2 = r3.A03
            boolean r1 = r3.A04
            r0 = 1120(0x460, float:1.57E-42)
            java.lang.String r12 = X.C66579MXk.A00(r0)
            r7 = r6
            r8 = r6
            r13 = r6
            r14 = r6
            r15 = r6
            r16 = r2
            r17 = r1
            r4.EMz(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            goto L_0x13c4
        L_0x0f61:
            X.5Wy r12 = (X.C286575Wy) r12
            int r2 = X.C51968G9o.A0B(r0)
            r0 = 2
            if (r2 != r0) goto L_0x0f70
            boolean r0 = r12.Bwn()
            if (r0 != 0) goto L_0x13c7
        L_0x0f70:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0f7e
            r2 = -41951683(0xfffffffffd7fde3d, float:-2.1256692E37)
            java.lang.String r0 = "com.instagram.direct.fragment.thread.keymanagement.mvvm.ui.EncryptedDeviceList.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (EncryptedDeviceList.kt:73)"
            X.0fL.A01(r2, r0)
        L_0x0f7e:
            java.lang.Object r4 = r1.A02
            java.lang.Object r5 = r1.A01
            X.5Qk r6 = androidx.compose.ui.Modifier.A00
            X.5Zx r2 = X.C287275Zs.A07
            X.5Zr r1 = X.C287215Zl.A02
            r0 = 0
            X.5RD r1 = X.C291495hO.A02(r2, r12, r1, r0)
            int r7 = X.C287425a7.A00(r12)
            r3 = r12
            X.5Wx r3 = (X.C286565Wx) r3
            X.5RM r0 = X.C286565Wx.A04(r3)
            androidx.compose.ui.Modifier r2 = X.C287435a8.A01(r12, r6)
            X.C51973G9u.A0y(r12, r3)
            X.C51971G9r.A12(r12, r1, r0)
            X.0sL r1 = X.C287485aD.A02
            boolean r0 = r3.A0K
            if (r0 != 0) goto L_0x0fae
            boolean r0 = X.C51972G9s.A1Q(r12, r7)
            if (r0 != 0) goto L_0x0fb1
        L_0x0fae:
            X.C51971G9r.A13(r12, r1, r7)
        L_0x0fb1:
            X.C51965G9l.A18(r12, r2)
            r0 = 2131958977(0x7f131cc1, float:1.9554581E38)
            java.lang.String r15 = X.C304346Dc.A00(r12, r0)
            X.5Z4 r14 = X.C51966G9m.A0c(r12)
            long r16 = X.C51966G9m.A0M(r12)
            androidx.compose.ui.Alignment r0 = X.C287215Zl.A09
            androidx.compose.ui.Modifier r6 = X.C287205Zk.A02(r0, r6)
            X.5Yw r0 = X.AnonymousClass5aQ.A00(r12)
            long r0 = r0.A0i
            r2 = 1092616192(0x41200000, float:10.0)
            androidx.compose.ui.Modifier r1 = X.C51969G9p.A0X(r6, r2, r0)
            X.6Fj r0 = new X.6Fj
            r0.<init>(r2, r2, r2, r2)
            androidx.compose.ui.Modifier r2 = X.C287195Zj.A00(r0, r1)
            r0 = 581810092(0x22adb7ac, float:4.7086214E-18)
            boolean r1 = X.C51973G9u.A1S(r12, r4, r5, r0)
            java.lang.Object r0 = r12.ECw()
            if (r1 != 0) goto L_0x0fef
            java.lang.Object r1 = X.AnonymousClass5XT.A00
            if (r0 != r1) goto L_0x0ff9
        L_0x0fef:
            r1 = 12
            X.Phe r0 = new X.Phe
            r0.<init>(r1, r4, r5)
            r12.FLL(r0)
        L_0x0ff9:
            androidx.compose.ui.Modifier r13 = X.C51969G9p.A0V(r3, r2, r0)
            X.AnonymousClass5ZZ.A0Q(r12, r13, r14, r15, r16)
            boolean r0 = X.C51967G9n.A1R(r12)
            if (r0 == 0) goto L_0x13c4
            r0 = 1921102077(0x7281b0fd, float:5.137604E30)
            goto L_0x13c1
        L_0x100b:
            X.5Wy r12 = (X.C286575Wy) r12
            int r2 = X.C51968G9o.A0C(r0)
            r0 = 2
            if (r2 != r0) goto L_0x101a
            boolean r0 = r12.Bwn()
            if (r0 != 0) goto L_0x13c7
        L_0x101a:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x1028
            r2 = 1018089274(0x3caecf3a, float:0.021339048)
            java.lang.String r0 = "com.instagram.direct.fragment.stickertray.aisticker.DirectAiStickerTrayFragment.onViewCreated.<anonymous> (DirectAiStickerTrayFragment.kt:200)"
            X.0fL.A01(r2, r0)
        L_0x1028:
            java.lang.Object r5 = r1.A02
            X.NJZ r5 = (X.NJZ) r5
            r0 = 217(0xd9, float:3.04E-43)
            java.lang.String r4 = X.C66579MXk.A00(r0)
            X.0eM r0 = r5.A0L
            X.0lg r3 = X.DbT.A0X(r0)
            r2 = 1844624898(0x6df2be02, float:9.390635E27)
            java.lang.Object r1 = r1.A01
            r0 = 5
            X.5PJ r0 = A00(r12, r1, r5, r0, r2)
            X.C286885Ye.A00(r12, r3, r4, r0)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x13c4
            r0 = -1794603315(0xffffffff950886cd, float:-2.757132E-26)
            goto L_0x13c1
        L_0x1050:
            X.5Wy r12 = (X.C286575Wy) r12
            int r2 = X.C51968G9o.A0C(r0)
            r0 = 2
            if (r2 != r0) goto L_0x105f
            boolean r0 = r12.Bwn()
            if (r0 != 0) goto L_0x13c7
        L_0x105f:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x106d
            r2 = 891202221(0x351eaaad, float:5.910795E-7)
            java.lang.String r0 = "com.instagram.direct.fragment.stickertray.aisticker.DirectAiStickerTrayFragment.onViewCreated.<anonymous>.<anonymous> (DirectAiStickerTrayFragment.kt:201)"
            X.0fL.A01(r2, r0)
        L_0x106d:
            java.lang.Object r3 = r1.A02
            X.NJZ r3 = (X.NJZ) r3
            X.0eM r0 = r3.A0J
            java.lang.Object r13 = r0.getValue()
            X.Mtu r13 = (X.C67741Mtu) r13
            r0 = 18
            X.Pm3 r14 = new X.Pm3
            r14.<init>(r3, r0)
            r0 = 19
            X.Pm3 r15 = new X.Pm3
            r15.<init>(r3, r0)
            java.lang.Object r2 = r1.A01
            r1 = 3
            X.PqR r0 = new X.PqR
            r0.<init>((int) r1, (java.lang.Object) r2, (java.lang.Object) r3)
            r17 = 8
            r16 = r0
            X.C56621I4x.A01(r12, r13, r14, r15, r16, r17)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x13c4
            r0 = 782199031(0x2e9f68f7, float:7.2491284E-11)
            goto L_0x13c1
        L_0x10a1:
            X.5Wy r12 = (X.C286575Wy) r12
            int r2 = X.C51968G9o.A0B(r0)
            r0 = 2
            if (r2 != r0) goto L_0x10b0
            boolean r0 = r12.Bwn()
            if (r0 != 0) goto L_0x13c7
        L_0x10b0:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x10be
            r2 = 1817657390(0x6c57402e, float:1.0408885E27)
            java.lang.String r0 = "com.instagram.direct.fragment.recipientpicker.aistudio.AiStudioRecipientPickerFragment.onCreateView.<anonymous>.<anonymous> (AiStudioRecipientPickerFragment.kt:44)"
            X.0fL.A01(r2, r0)
        L_0x10be:
            java.lang.Object r0 = r1.A01
            java.lang.Object r3 = X.C51966G9m.A18(r0)
            X.N4R r3 = (X.N4R) r3
            java.lang.Object r0 = r1.A02
            X.NIy r0 = (X.C68460NIy) r0
            X.0eM r0 = r0.A01
            java.lang.Object r2 = r0.getValue()
            r0 = 1391398426(0x52ef0e1a, float:5.13366884E11)
            boolean r0 = X.C51967G9n.A1Z(r12, r2, r0)
            java.lang.Object r1 = r12.ECw()
            if (r0 != 0) goto L_0x10e1
            java.lang.Object r0 = X.AnonymousClass5XT.A00
            if (r1 != r0) goto L_0x10ea
        L_0x10e1:
            r0 = 6
            X.PgU r1 = new X.PgU
            r1.<init>(r2, r0)
            r12.FLL(r1)
        L_0x10ea:
            X.0Ya r1 = (X.C59520Ya) r1
            boolean r0 = X.C51968G9o.A1Y(r12)
            X.0sP r1 = (X.0sP) r1
            X.C56652I6h.A04(r12, r3, r1, r0)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x13c4
            r0 = 1448333094(0x5653cf26, float:5.8221662E13)
            goto L_0x13c1
        L_0x1100:
            X.5Wy r12 = (X.C286575Wy) r12
            int r2 = X.C51968G9o.A0C(r0)
            r0 = 2
            if (r2 != r0) goto L_0x110f
            boolean r0 = r12.Bwn()
            if (r0 != 0) goto L_0x13c7
        L_0x110f:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x111d
            r2 = 137561514(0x83305aa, float:5.387251E-34)
            java.lang.String r0 = "com.instagram.creator.commentsinsights.impl.CommentsInsightsOptInFragment.onCreateView.<anonymous>.<anonymous> (CommentsInsightsOptInFragment.kt:75)"
            X.0fL.A01(r2, r0)
        L_0x111d:
            java.lang.Object r0 = r1.A01
            java.lang.Object r2 = X.C51966G9m.A18(r0)
            X.HPX r2 = (X.HPX) r2
            boolean r0 = r2 instanceof X.C54358H9l
            r6 = 0
            if (r0 == 0) goto L_0x1150
            r0 = -1732396238(0xffffffff98bdbb32, float:-4.9044374E-24)
            r12.ExS(r0)
            X.H9l r2 = (X.C54358H9l) r2
            X.Hkh r4 = r2.A00
            java.lang.Object r3 = r1.A02
            r0 = 5
            X.FyD r2 = new X.FyD
            r2.<init>(r3, r0)
            r1 = 6
            X.FyD r0 = new X.FyD
            r0.<init>(r3, r1)
            X.HZP.A00(r12, r4, r2, r0, r6)
        L_0x1145:
            boolean r0 = X.C51970G9q.A1a(r12, r6)
            if (r0 == 0) goto L_0x13c4
            r0 = -513375583(0xffffffffe16682a1, float:-2.6576025E20)
            goto L_0x13c1
        L_0x1150:
            boolean r0 = r2 instanceof X.C54359H9m
            if (r0 == 0) goto L_0x1187
            r0 = -1732142596(0xffffffff98c199fc, float:-5.0044815E-24)
            X.5Qk r5 = X.C51965G9l.A0K(r12, r0)
            X.5RD r1 = X.C51966G9m.A0a(r6)
            int r4 = X.C287425a7.A00(r12)
            r3 = r12
            X.5Wx r3 = (X.C286565Wx) r3
            X.5RM r0 = X.C286565Wx.A04(r3)
            androidx.compose.ui.Modifier r2 = X.C287435a8.A01(r12, r5)
            X.C51973G9u.A0y(r12, r3)
            X.C51971G9r.A12(r12, r1, r0)
            X.0sL r1 = X.C287485aD.A02
            boolean r0 = r3.A0K
            if (r0 != 0) goto L_0x1180
            boolean r0 = X.C51972G9s.A1Q(r12, r4)
            if (r0 != 0) goto L_0x1183
        L_0x1180:
            X.C51971G9r.A13(r12, r1, r4)
        L_0x1183:
            X.GQD.A03(r12, r5, r2)
            goto L_0x1145
        L_0x1187:
            r0 = 1745229280(0x680615e0, float:2.5328025E24)
            X.Wub r0 = X.C51973G9u.A0n(r12, r0)
            throw r0
        L_0x118f:
            X.5Wy r12 = (X.C286575Wy) r12
            int r2 = X.C51968G9o.A0C(r0)
            r0 = 2
            if (r2 != r0) goto L_0x119e
            boolean r0 = r12.Bwn()
            if (r0 != 0) goto L_0x13c7
        L_0x119e:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x11ac
            r2 = 1135433219(0x43ad5603, float:346.67197)
            java.lang.String r0 = "com.instagram.direct.fragment.thread.threaddetail.metaai.MetaAiVoiceSettingsFragment.onCreateView.<anonymous> (MetaAiVoiceSettingsFragment.kt:44)"
            X.0fL.A01(r2, r0)
        L_0x11ac:
            java.lang.Object r4 = r1.A02
            X.NKJ r4 = (X.NKJ) r4
            X.0eM r0 = r4.A02
            java.lang.Object r0 = r0.getValue()
            X.JgH r0 = (X.C60136JgH) r0
            X.0Ud r0 = r0.A02
            r3 = 8
            X.4gU r2 = X.AnonymousClass6FW.A02(r12, r0, r3)
            r0 = -1695984548(0xffffffff9ae9545c, float:-9.650283E-23)
            r12.ExS(r0)
            X.IEj r0 = r4.A00
            if (r0 != 0) goto L_0x11d0
            X.IEj r0 = X.I28.A00(r12)
            r4.A00 = r0
        L_0x11d0:
            X.C51965G9l.A1V(r12)
            java.lang.Object r13 = r2.getValue()
            X.JwM r13 = (X.C61084JwM) r13
            r0 = 22
            X.PmE r14 = new X.PmE
            r14.<init>(r4, r0)
            X.IEj r11 = r4.A00
            if (r11 != 0) goto L_0x11ee
            java.lang.String r0 = "scrollState"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x11ee:
            java.lang.Object r1 = r1.A01
            r0 = 23
            X.PmE r15 = new X.PmE
            r15.<init>(r1, r0)
            r16 = r3
            X.C56291Hw4.A01(r11, r12, r13, r14, r15, r16)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x13c4
            r0 = 781215066(0x2e90655a, float:6.5663655E-11)
            goto L_0x13c1
        L_0x1207:
            X.5Wy r12 = (X.C286575Wy) r12
            int r2 = X.C51968G9o.A0B(r0)
            r0 = 2
            if (r2 != r0) goto L_0x1216
            boolean r0 = r12.Bwn()
            if (r0 != 0) goto L_0x13c7
        L_0x1216:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x1224
            r2 = -1193008416(0xffffffffb8e422e0, float:-1.0878383E-4)
            java.lang.String r0 = "com.instagram.creator.agent.settings.keyword.KeywordLinkRow.<anonymous> (KeywordResponsesListFragment.kt:239)"
            X.0fL.A01(r2, r0)
        L_0x1224:
            java.lang.Object r8 = r1.A01
            X.QP8 r8 = (X.QP8) r8
            java.lang.String r5 = r8.A03
            java.lang.String r4 = r8.A01
            X.5Qk r0 = androidx.compose.ui.Modifier.A00
            r7 = 0
            long r2 = X.C51966G9m.A0A(r12)
            r6 = 0
            androidx.compose.ui.Modifier r3 = X.C51966G9m.A0X(r0, r2)
            r0 = 1828820300(0x6d01954c, float:2.5065034E27)
            r12.ExS(r0)
            java.lang.Object r2 = r1.A02
            boolean r0 = X.C51971G9r.A1U(r12, r2, r8)
            java.lang.Object r1 = r12.ECw()
            if (r0 != 0) goto L_0x124e
            java.lang.Object r0 = X.AnonymousClass5XT.A00
            if (r1 != r0) goto L_0x1254
        L_0x124e:
            r0 = 49
            X.Ivy r1 = X.C58689Ivy.A00(r12, r2, r8, r0)
        L_0x1254:
            X.0sa r1 = (X.C62320sa) r1
            X.C51965G9l.A1X(r12, r7)
            r0 = 1
            androidx.compose.ui.Modifier r1 = X.C287635aW.A05(r3, r6, r6, r1, r0)
            X.IPn r0 = X.C57124IPn.A00
            X.C52636GaA.A0J(r12, r1, r0, r5, r4)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x13c4
            r0 = 111877976(0x6ab1f58, float:6.4369106E-35)
            goto L_0x13c1
        L_0x126e:
            X.5Wy r12 = (X.C286575Wy) r12
            int r2 = X.C51968G9o.A0B(r0)
            r0 = 2
            if (r2 != r0) goto L_0x127d
            boolean r0 = r12.Bwn()
            if (r0 != 0) goto L_0x13c7
        L_0x127d:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x128b
            r2 = 483908779(0x1cd7dcab, float:1.4284548E-21)
            java.lang.String r0 = "com.instagram.creator.agent.settings.keyword.KeywordLinkRow.<anonymous> (KeywordResponsesListFragment.kt:225)"
            X.0fL.A01(r2, r0)
        L_0x128b:
            X.5Qk r0 = androidx.compose.ui.Modifier.A00
            r6 = 0
            long r2 = X.C51966G9m.A09(r12)
            r5 = 0
            androidx.compose.ui.Modifier r2 = X.C51966G9m.A0X(r0, r2)
            r0 = 1096810496(0x41600000, float:14.0)
            androidx.compose.ui.Modifier r4 = X.C287195Zj.A08(r2, r0)
            r0 = 1828804174(0x6d01564e, float:2.501744E27)
            r12.ExS(r0)
            java.lang.Object r3 = r1.A02
            boolean r0 = r12.AGu(r3)
            java.lang.Object r2 = r1.A01
            boolean r0 = X.C51965G9l.A1Z(r12, r2, r0)
            java.lang.Object r1 = r12.ECw()
            if (r0 != 0) goto L_0x12b9
            java.lang.Object r0 = X.AnonymousClass5XT.A00
            if (r1 != r0) goto L_0x12bf
        L_0x12b9:
            r0 = 48
            X.Ivy r1 = X.C58689Ivy.A00(r12, r3, r2, r0)
        L_0x12bf:
            X.0sa r1 = (X.C62320sa) r1
            X.C51965G9l.A1X(r12, r6)
            r0 = 1
            androidx.compose.ui.Modifier r13 = X.C287635aW.A05(r4, r5, r5, r1, r0)
            r0 = 2131957531(0x7f13171b, float:1.9551649E38)
            java.lang.String r15 = X.C288035bG.A00(r12, r0)
            X.5Z4 r14 = X.C51966G9m.A0g(r12)
            long r16 = X.C51966G9m.A0I(r12)
            X.AnonymousClass5ZZ.A0U(r12, r13, r14, r15, r16)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x13c4
            r0 = 1199496535(0x477edd57, float:65245.34)
            goto L_0x13c1
        L_0x12e6:
            X.5Wy r12 = (X.C286575Wy) r12
            int r2 = X.C51968G9o.A0B(r0)
            r0 = 2
            if (r2 != r0) goto L_0x12f5
            boolean r0 = r12.Bwn()
            if (r0 != 0) goto L_0x13c7
        L_0x12f5:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x1303
            r2 = -589246758(0xffffffffdce0ceda, float:-5.06222644E17)
            java.lang.String r0 = "com.instagram.creator.agent.settings.keyword.AddKeywordFragment.onCreateView.<anonymous>.<anonymous> (AddKeywordFragment.kt:112)"
            X.0fL.A01(r2, r0)
        L_0x1303:
            java.lang.Object r0 = r1.A01
            java.lang.Object r13 = X.C51966G9m.A18(r0)
            X.GnP r13 = (X.C53392GnP) r13
            java.lang.Object r3 = r1.A02
            X.Gzn r3 = (X.C54118Gzn) r3
            X.0eM r2 = r3.A05
            java.lang.Object r1 = r2.getValue()
            r0 = -1421894499(0xffffffffab3f9c9d, float:-6.8074176E-13)
            boolean r0 = X.C51967G9n.A1Z(r12, r1, r0)
            java.lang.Object r15 = r12.ECw()
            if (r0 != 0) goto L_0x1326
            java.lang.Object r0 = X.AnonymousClass5XT.A00
            if (r15 != r0) goto L_0x132c
        L_0x1326:
            r0 = 57
            X.In8 r15 = X.C51970G9q.A0s(r12, r1, r0)
        L_0x132c:
            X.0Ya r15 = (X.C59520Ya) r15
            r5 = r12
            X.5Wx r5 = (X.C286565Wx) r5
            r4 = 0
            X.C286565Wx.A0L(r5, r4)
            X.0sP r15 = (X.0sP) r15
            java.lang.Object r6 = r2.getValue()
            r0 = -1421892038(0xffffffffab3fa63a, float:-6.8087517E-13)
            boolean r0 = X.C51967G9n.A1Z(r12, r6, r0)
            java.lang.Object r1 = r12.ECw()
            if (r0 != 0) goto L_0x134c
            java.lang.Object r0 = X.AnonymousClass5XT.A00
            if (r1 != r0) goto L_0x1352
        L_0x134c:
            r0 = 58
            X.In8 r1 = X.C51970G9q.A0s(r12, r6, r0)
        L_0x1352:
            X.0sP r16 = X.C51968G9o.A1A(r5, r1)
            java.lang.Object r6 = r2.getValue()
            r0 = -1421889770(0xffffffffab3faf16, float:-6.809981E-13)
            boolean r0 = X.C51967G9n.A1Z(r12, r6, r0)
            java.lang.Object r1 = r12.ECw()
            if (r0 != 0) goto L_0x136b
            java.lang.Object r0 = X.AnonymousClass5XT.A00
            if (r1 != r0) goto L_0x1371
        L_0x136b:
            r0 = 59
            X.In8 r1 = X.C51970G9q.A0s(r12, r6, r0)
        L_0x1371:
            X.0sP r17 = X.C51968G9o.A1A(r5, r1)
            r0 = -1421887535(0xffffffffab3fb7d1, float:-6.811193E-13)
            boolean r0 = X.C51967G9n.A1Z(r12, r3, r0)
            java.lang.Object r1 = r12.ECw()
            if (r0 != 0) goto L_0x1386
            java.lang.Object r0 = X.AnonymousClass5XT.A00
            if (r1 != r0) goto L_0x138c
        L_0x1386:
            r0 = 16
            X.InR r1 = X.C51970G9q.A0q(r12, r3, r0)
        L_0x138c:
            X.0Ya r3 = X.C51965G9l.A12(r5, r1)
            X.0sL r3 = (X.0sL) r3
            java.lang.Object r2 = r2.getValue()
            r0 = -1421885778(0xffffffffab3fbeae, float:-6.812145E-13)
            boolean r0 = X.C51967G9n.A1Z(r12, r2, r0)
            java.lang.Object r1 = r12.ECw()
            if (r0 != 0) goto L_0x13a7
            java.lang.Object r0 = X.AnonymousClass5XT.A00
            if (r1 != r0) goto L_0x13ad
        L_0x13a7:
            r0 = 8
            X.Imz r1 = X.C51975G9x.A0u(r12, r2, r0)
        L_0x13ad:
            X.0sa r14 = X.C51968G9o.A19(r5, r1)
            r18 = r3
            r19 = r4
            X.C56285Hvt.A01(r12, r13, r14, r15, r16, r17, r18, r19)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x13c4
            r0 = -1728783935(0xffffffff98f4d9c1, float:-6.3292397E-24)
        L_0x13c1:
            X.0fL.A00(r0)
        L_0x13c4:
            X.0gF r9 = X.C60340gF.A00
            return r9
        L_0x13c7:
            r12.Evl()
            goto L_0x13c4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.JG2.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
