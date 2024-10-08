package X;

public final class JGF extends 0Yg implements 0sL {
    public final int A00;
    public final Object A01;
    public final Object A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JGF(int i, Object obj, Object obj2) {
        super(2);
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    public static C337927h8 A00(2Wh r32, JGF jgf) {
        JGF jgf2 = jgf;
        C337927h8 r10 = (C337927h8) jgf2.A02;
        boolean z = r10.A0E;
        boolean z2 = r10.A0H;
        int i = r10.A01;
        int i2 = r10.A06;
        int i3 = r10.A05;
        boolean z3 = r10.A0G;
        boolean z4 = r10.A0K;
        boolean z5 = r10.A0I;
        boolean z6 = r10.A0O;
        boolean z7 = r10.A0J;
        boolean z8 = r10.A0M;
        boolean z9 = r10.A0N;
        boolean z10 = r10.A0F;
        int i4 = r10.A00;
        int i5 = r10.A03;
        int i6 = r10.A02;
        int i7 = i3;
        int i8 = i4;
        int i9 = i5;
        int i10 = i6;
        int i11 = r10.A04;
        AnonymousClass3AS r14 = r10.A07;
        AnonymousClass3Y5 r15 = (AnonymousClass3Y5) jgf2.A01;
        C337407gI.A01(r14, r15, r32, i, i2, i7, i8, i9, i10, i11, z, z2, z3, z4, z5, z6, z7, z8, z9, z10);
        return r10;
    }

    public static void A01(2WE r1, Object obj, Object obj2, Object[] objArr, int i) {
        r1.A02(new JGF(i, obj, obj2), objArr);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0049, code lost:
        X.0fL.A00(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x0411, code lost:
        if (r4 != null) goto L_0x0413;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:276:0x0755, code lost:
        r8.Evl();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:284:0x07c6, code lost:
        r1 = new X.C308276Tl();
        r1.A01(java.lang.Long.valueOf(r5));
        r1.A03(r10, r4);
        r1 = r1.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:285:0x07d9, code lost:
        X.C299275ur.A00((X.C307896Rx) r2.A01, r1, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:286:0x07e1, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:479:0x0c4a, code lost:
        return X.C51965G9l.A0f(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:486:?, code lost:
        return X.C60340gF.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x01a2, code lost:
        r3.A00 = r1 + r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x022d, code lost:
        if (r4 != null) goto L_0x022f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x044d  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x028e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r24, java.lang.Object r25) {
        /*
            r23 = this;
            r2 = r23
            r10 = r25
            r8 = r24
            int r0 = r2.A00
            switch(r0) {
                case 0: goto L_0x0128;
                case 1: goto L_0x0147;
                case 2: goto L_0x015b;
                case 3: goto L_0x075a;
                case 4: goto L_0x0783;
                case 5: goto L_0x018d;
                case 6: goto L_0x01a7;
                case 7: goto L_0x01dd;
                case 8: goto L_0x0297;
                case 9: goto L_0x033d;
                case 10: goto L_0x07a0;
                case 11: goto L_0x07b3;
                case 12: goto L_0x07ba;
                case 13: goto L_0x07e2;
                case 14: goto L_0x0360;
                case 15: goto L_0x038a;
                case 16: goto L_0x03c1;
                case 17: goto L_0x0811;
                case 18: goto L_0x0822;
                case 19: goto L_0x0861;
                case 20: goto L_0x087c;
                case 21: goto L_0x08bb;
                case 22: goto L_0x08cc;
                case 23: goto L_0x08f0;
                case 24: goto L_0x0917;
                case 25: goto L_0x0957;
                case 26: goto L_0x0997;
                case 27: goto L_0x09c2;
                case 28: goto L_0x0a06;
                case 29: goto L_0x0a45;
                case 30: goto L_0x0456;
                case 31: goto L_0x0a6c;
                case 32: goto L_0x0aa1;
                case 33: goto L_0x0ac2;
                case 34: goto L_0x0ae4;
                case 35: goto L_0x0b0e;
                case 36: goto L_0x0b28;
                case 37: goto L_0x0b4f;
                case 38: goto L_0x0b79;
                case 39: goto L_0x0ba1;
                case 40: goto L_0x0bcd;
                case 41: goto L_0x0be3;
                case 42: goto L_0x0bf7;
                case 43: goto L_0x0c33;
                case 44: goto L_0x0485;
                case 45: goto L_0x049f;
                case 46: goto L_0x04f8;
                case 47: goto L_0x0527;
                case 48: goto L_0x0679;
                default: goto L_0x000b;
            }
        L_0x000b:
            X.5Wy r8 = (X.C286575Wy) r8
            int r1 = X.C51968G9o.A0B(r10)
            r0 = 2
            if (r1 != r0) goto L_0x001a
            boolean r0 = r8.Bwn()
            if (r0 != 0) goto L_0x0755
        L_0x001a:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0028
            r1 = -1291012527(0xffffffffb30cb651, float:-3.2762106E-8)
            java.lang.String r0 = "com.instagram.aistudio.yourais.YourAIsFragment.onCreateView.<anonymous>.<anonymous> (YourAIsFragment.kt:106)"
            X.0fL.A01(r1, r0)
        L_0x0028:
            java.lang.Object r3 = r2.A01
            X.4gU r3 = (X.C270284gU) r3
            java.lang.Object r0 = r3.getValue()
            X.Jw4 r0 = (X.C61066Jw4) r0
            boolean r0 = r0.A02
            if (r0 == 0) goto L_0x004f
            r0 = -59753507(0xfffffffffc703bdd, float:-4.9894617E36)
            r8.ExS(r0)
            r0 = 0
            X.I2H.A00(r8, r0)
        L_0x0040:
            boolean r0 = X.C51970G9q.A1Z(r8)
            if (r0 == 0) goto L_0x004c
            r0 = 1705684133(0x65aaaca5, float:1.0074838E23)
        L_0x0049:
            X.0fL.A00(r0)
        L_0x004c:
            X.0gF r0 = X.C60340gF.A00
        L_0x004e:
            return r0
        L_0x004f:
            java.lang.Object r0 = r3.getValue()
            X.Jw4 r0 = (X.C61066Jw4) r0
            boolean r0 = r0.A01
            if (r0 != 0) goto L_0x00aa
            java.lang.Object r0 = r3.getValue()
            X.Jw4 r0 = (X.C61066Jw4) r0
            java.lang.Object r0 = r0.A00
            java.util.List r0 = (java.util.List) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x00aa
            r0 = -59653036(0xfffffffffc71c454, float:-5.0213022E36)
            r8.ExS(r0)
            java.lang.Object r4 = r2.A02
            X.K60 r4 = (X.K60) r4
            X.0eM r0 = r4.A01
            java.lang.Object r3 = r0.getValue()
            X.7I6 r3 = (X.AnonymousClass7I6) r3
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            short r2 = X.JVT.A00(r0)
            r1 = 895690123(0x3563258b, float:8.461872E-7)
            X.02m r0 = r3.A06
            r0.markerEnd(r1, r2)
            r0 = 1660648335(0x62fb7b8f, float:2.319518E21)
            boolean r0 = X.C51967G9n.A1Z(r8, r4, r0)
            java.lang.Object r1 = r8.ECw()
            if (r0 != 0) goto L_0x009a
            java.lang.Object r0 = X.AnonymousClass5XT.A00
            if (r1 != r0) goto L_0x00a0
        L_0x009a:
            r0 = 8
            X.MP6 r1 = X.C51975G9x.A0w(r8, r4, r0)
        L_0x00a0:
            X.0sP r1 = (X.0sP) r1
            boolean r0 = X.C51968G9o.A1Y(r8)
            X.I2H.A02(r8, r1, r0)
            goto L_0x0040
        L_0x00aa:
            r0 = -59310734(0xfffffffffc76fd72, float:-5.129782E36)
            r8.ExS(r0)
            java.lang.Object r10 = r2.A02
            X.K60 r10 = (X.K60) r10
            X.0eM r0 = r10.A01
            java.lang.Object r4 = r0.getValue()
            X.7I6 r4 = (X.AnonymousClass7I6) r4
            java.lang.Object r0 = r3.getValue()
            X.Jw4 r0 = (X.C61066Jw4) r0
            boolean r0 = r0.A01
            java.lang.Integer r0 = X.C51967G9n.A0l(r0)
            short r2 = X.JVT.A00(r0)
            r1 = 895690123(0x3563258b, float:8.461872E-7)
            X.02m r0 = r4.A06
            r0.markerEnd(r1, r2)
            r0 = 1660661269(0x62fbae15, float:2.3213383E21)
            boolean r0 = X.C51967G9n.A1Z(r8, r10, r0)
            java.lang.Object r13 = r8.ECw()
            if (r0 != 0) goto L_0x00e5
            java.lang.Object r0 = X.AnonymousClass5XT.A00
            if (r13 != r0) goto L_0x00ea
        L_0x00e5:
            r0 = 3
            X.In8 r13 = X.C51970G9q.A0s(r8, r10, r0)
        L_0x00ea:
            X.0Ya r13 = (X.C59520Ya) r13
            r1 = r8
            X.5Wx r1 = (X.C286565Wx) r1
            r15 = 0
            X.C286565Wx.A0L(r1, r15)
            X.0sP r13 = (X.0sP) r13
            r0 = 1660663191(0x62fbb597, float:2.3216088E21)
            boolean r0 = X.C51967G9n.A1Z(r8, r10, r0)
            java.lang.Object r14 = r8.ECw()
            if (r0 != 0) goto L_0x0106
            java.lang.Object r0 = X.AnonymousClass5XT.A00
            if (r14 != r0) goto L_0x010c
        L_0x0106:
            r0 = 9
            X.MP6 r14 = X.C51975G9x.A0w(r8, r10, r0)
        L_0x010c:
            X.0sP r14 = (X.0sP) r14
            java.lang.Object r0 = X.C51967G9n.A0o(r1, r3, r15)
            X.Jw4 r0 = (X.C61066Jw4) r0
            java.lang.Object r12 = r0.A00
            java.util.List r12 = (java.util.List) r12
            X.0eM r0 = r10.A00
            java.lang.Object r9 = r0.getValue()
            X.LRW r9 = (X.LRW) r9
            r11 = 0
            r16 = 32
            X.I2H.A01(r8, r9, r10, r11, r12, r13, r14, r15, r16)
            goto L_0x0040
        L_0x0128:
            X.GPU r8 = (X.GPU) r8
            X.5dM r10 = (X.C289295dM) r10
            long r3 = r10.A00
            java.lang.Object r0 = r2.A01
            X.GQN r0 = (X.GQN) r0
            X.GQL.A00(r8, r0)
            java.lang.Object r0 = r2.A02
            androidx.compose.foundation.gestures.DragGestureNode r0 = (androidx.compose.foundation.gestures.DragGestureNode) r0
            X.3ju r1 = r0.A02
            if (r1 == 0) goto L_0x004c
            X.GQP r0 = new X.GQP
            r0.<init>(r3)
            r1.FIG(r0)
            goto L_0x004c
        L_0x0147:
            float r4 = X.C51975G9x.A02(r8, r10)
            java.lang.Object r3 = r2.A02
            X.0rh r3 = (X.0rh) r3
            float r1 = r3.A00
            java.lang.Object r0 = r2.A01
            X.6H1 r0 = (X.AnonymousClass6H1) r0
            float r4 = r4 - r1
            float r0 = r0.EKW(r4)
            goto L_0x01a2
        L_0x015b:
            X.5Wy r8 = (X.C286575Wy) r8
            int r1 = X.C51968G9o.A0B(r10)
            r0 = 2
            if (r1 != r0) goto L_0x016a
            boolean r0 = r8.Bwn()
            if (r0 != 0) goto L_0x0755
        L_0x016a:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0178
            r1 = -641298820(0xffffffffd9c68e7c, float:-6.9860886E15)
            java.lang.String r0 = "androidx.compose.foundation.layout.BoxWithConstraints.<anonymous>.<anonymous>.<anonymous> (BoxWithConstraints.kt:68)"
            X.0fL.A01(r1, r0)
        L_0x0178:
            java.lang.Object r3 = r2.A01
            X.0sK r3 = (X.0sK) r3
            java.lang.Object r1 = r2.A02
            r0 = 0
            X.C51967G9n.A1M(r1, r8, r3, r0)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x004c
            r0 = -1839404450(0xffffffff925cea5e, float:-6.970864E-28)
            goto L_0x0049
        L_0x018d:
            float r1 = X.C51975G9x.A02(r8, r10)
            java.lang.Object r3 = r2.A02
            X.0rh r3 = (X.0rh) r3
            float r0 = r3.A00
            float r1 = r1 - r0
            java.lang.Object r0 = r2.A01
            X.6H1 r0 = (X.AnonymousClass6H1) r0
            float r0 = r0.EKW(r1)
            float r1 = r3.A00
        L_0x01a2:
            float r1 = r1 + r0
            r3.A00 = r1
            goto L_0x004c
        L_0x01a7:
            X.5Wy r8 = (X.C286575Wy) r8
            int r1 = X.C51968G9o.A0B(r10)
            r0 = 2
            if (r1 != r0) goto L_0x01b6
            boolean r0 = r8.Bwn()
            if (r0 != 0) goto L_0x0755
        L_0x01b6:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x01c4
            r1 = 570562742(0x220218b6, float:1.7631367E-18)
            java.lang.String r0 = "androidx.compose.ui.platform.WrappedComposition.setContent.<anonymous>.<anonymous>.<anonymous> (Wrapper.android.kt:154)"
            X.0fL.A01(r1, r0)
        L_0x01c4:
            java.lang.Object r0 = r2.A02
            X.5XC r0 = (X.AnonymousClass5XC) r0
            androidx.compose.ui.platform.AndroidComposeView r3 = r0.A04
            java.lang.Object r1 = r2.A01
            X.0sL r1 = (X.0sL) r1
            r0 = 0
            androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.A00(r8, r3, r1, r0)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x004c
            r0 = 161407240(0x99ee108, float:3.8248735E-33)
            goto L_0x0049
        L_0x01dd:
            X.5Wy r8 = (X.C286575Wy) r8
            int r1 = X.C51968G9o.A0B(r10)
            r0 = 2
            if (r1 != r0) goto L_0x01ec
            boolean r0 = r8.Bwn()
            if (r0 != 0) goto L_0x0755
        L_0x01ec:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x01fa
            r1 = -1604935358(0xffffffffa056a142, float:-1.8179861E-19)
            java.lang.String r0 = "androidx.compose.ui.platform.WrappedComposition.setContent.<anonymous>.<anonymous> (Wrapper.android.kt:134)"
            X.0fL.A01(r1, r0)
        L_0x01fa:
            java.lang.Object r5 = r2.A02
            X.5XC r5 = (X.AnonymousClass5XC) r5
            androidx.compose.ui.platform.AndroidComposeView r6 = r5.A04
            r0 = 2131434782(0x7f0b1d1e, float:1.8491388E38)
            r7 = 2131434782(0x7f0b1d1e, float:1.8491388E38)
            java.lang.Object r4 = r6.getTag(r0)
            boolean r0 = X.0u4.A09(r4)
            r3 = 0
            if (r0 == 0) goto L_0x0215
            java.util.Set r4 = (java.util.Set) r4
            if (r4 != 0) goto L_0x022f
        L_0x0215:
            android.view.ViewParent r1 = r6.getParent()
            boolean r0 = r1 instanceof android.view.View
            if (r0 == 0) goto L_0x0295
            android.view.View r1 = (android.view.View) r1
            if (r1 == 0) goto L_0x0295
            java.lang.Object r4 = r1.getTag(r7)
        L_0x0225:
            boolean r0 = X.0u4.A09(r4)
            if (r0 == 0) goto L_0x0293
            java.util.Set r4 = (java.util.Set) r4
            if (r4 == 0) goto L_0x023a
        L_0x022f:
            r0 = r8
            X.5Wx r0 = (X.C286565Wx) r0
            X.5Wq r0 = r0.A0Y
            r4.add(r0)
            r8.AII()
        L_0x023a:
            boolean r1 = r8.AGw(r5)
            java.lang.Object r0 = r8.ECw()
            if (r1 != 0) goto L_0x0248
            java.lang.Object r1 = X.AnonymousClass5XT.A00
            if (r0 != r1) goto L_0x0252
        L_0x0248:
            r1 = 18
            X.JTh r0 = new X.JTh
            r0.<init>((java.lang.Object) r5, (X.AnonymousClass4D7) r3, (int) r1)
            r8.FLL(r0)
        L_0x0252:
            X.0sL r0 = (X.0sL) r0
            X.C286645Xf.A04(r8, r6, r0)
            boolean r1 = r8.AGw(r5)
            java.lang.Object r0 = r8.ECw()
            if (r1 != 0) goto L_0x0265
            java.lang.Object r1 = X.AnonymousClass5XT.A00
            if (r0 != r1) goto L_0x026f
        L_0x0265:
            r1 = 19
            X.JTh r0 = new X.JTh
            r0.<init>((java.lang.Object) r5, (X.AnonymousClass4D7) r3, (int) r1)
            r8.FLL(r0)
        L_0x026f:
            X.0sL r0 = (X.0sL) r0
            X.C286645Xf.A04(r8, r6, r0)
            X.4bM r0 = X.AnonymousClass5XX.A00
            X.5Xl r4 = r0.A02(r4)
            r3 = -1193460702(0xffffffffb8dd3c22, float:-1.0549302E-4)
            java.lang.Object r2 = r2.A01
            r1 = 6
            X.JGF r0 = new X.JGF
            r0.<init>(r1, r2, r5)
            X.C51971G9r.A11(r8, r4, r0, r3)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x004c
            r0 = -1102884965(0xffffffffbe434f9b, float:-0.19073336)
            goto L_0x0049
        L_0x0293:
            r4 = r3
            goto L_0x023a
        L_0x0295:
            r4 = r3
            goto L_0x0225
        L_0x0297:
            X.5Wy r8 = (X.C286575Wy) r8
            int r1 = X.C51968G9o.A0B(r10)
            r0 = 2
            if (r1 != r0) goto L_0x02a6
            boolean r0 = r8.Bwn()
            if (r0 != 0) goto L_0x0755
        L_0x02a6:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x02b4
            r1 = 1020725388(0x3cd7088c, float:0.026249193)
            java.lang.String r0 = "androidx.compose.ui.window.Popup.<anonymous>.<anonymous>.<anonymous> (AndroidPopup.android.kt:321)"
            X.0fL.A01(r1, r0)
        L_0x02b4:
            X.5Qk r3 = androidx.compose.ui.Modifier.A00
            X.Izh r1 = X.C58918Izh.A00
            r0 = 0
            androidx.compose.ui.Modifier r4 = X.AnonymousClass5R5.A00(r3, r1, r0)
            java.lang.Object r3 = r2.A02
            androidx.compose.ui.window.PopupLayout r3 = (androidx.compose.ui.window.PopupLayout) r3
            boolean r0 = r8.AGw(r3)
            java.lang.Object r1 = r8.ECw()
            if (r0 != 0) goto L_0x02cf
            java.lang.Object r0 = X.AnonymousClass5XT.A00
            if (r1 != r0) goto L_0x02d8
        L_0x02cf:
            r0 = 44
            X.J6M r1 = X.J6M.A00(r3, r0)
            r8.FLL(r1)
        L_0x02d8:
            X.0sP r1 = (X.0sP) r1
            androidx.compose.ui.layout.OnSizeChangedModifier r0 = new androidx.compose.ui.layout.OnSizeChangedModifier
            r0.<init>(r1)
            androidx.compose.ui.Modifier r1 = r4.Ezh(r0)
            X.4gU r0 = r3.A0F
            boolean r0 = X.C51971G9r.A1X(r0)
            float r0 = X.C51971G9r.A00(r0)
            androidx.compose.ui.Modifier r6 = X.HRF.A00(r1, r0)
            r3 = 606497925(0x24266c85, float:3.6087432E-17)
            java.lang.Object r2 = r2.A01
            r1 = 15
            X.JFw r0 = new X.JFw
            r0.<init>(r2, r1)
            X.5PJ r5 = X.AnonymousClass5PI.A01(r8, r0, r3)
            X.IGP r1 = X.IGP.A00
            int r4 = X.C287425a7.A00(r8)
            r3 = r8
            X.5Wx r3 = (X.C286565Wx) r3
            X.5RM r0 = X.C286565Wx.A04(r3)
            androidx.compose.ui.Modifier r2 = X.C287435a8.A01(r8, r6)
            X.C51973G9u.A0y(r8, r3)
            X.C51971G9r.A12(r8, r1, r0)
            X.0sL r1 = X.C287485aD.A02
            boolean r0 = r3.A0K
            if (r0 != 0) goto L_0x0324
            boolean r0 = X.C51972G9s.A1Q(r8, r4)
            if (r0 != 0) goto L_0x0327
        L_0x0324:
            X.C51971G9r.A13(r8, r1, r4)
        L_0x0327:
            X.C51965G9l.A18(r8, r2)
            r0 = 6
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r5.invoke(r8, r0)
            boolean r0 = X.C51967G9n.A1R(r8)
            if (r0 == 0) goto L_0x004c
            r0 = 158221045(0x96e42f5, float:2.8679691E-33)
            goto L_0x0049
        L_0x033d:
            X.L5j r8 = (X.C63751L5j) r8
            X.L5j r10 = (X.C63751L5j) r10
            X.AnonymousClass7TG.A1N(r8, r10)
            java.lang.Object r3 = r2.A01
            X.Kfy r0 = X.C62448Kfy.PREPEND
            java.lang.Object r1 = r2.A02
            X.LOv r1 = (X.C64124LOv) r1
            if (r3 != r0) goto L_0x0359
            r8.A00 = r1
            if (r1 == 0) goto L_0x004c
            X.0V2 r0 = r8.A01
        L_0x0354:
            r0.FIA(r1)
            goto L_0x004c
        L_0x0359:
            r10.A00 = r1
            if (r1 == 0) goto L_0x004c
            X.0V2 r0 = r10.A01
            goto L_0x0354
        L_0x0360:
            r0 = 1
            X.0qQ.A0B(r10, r0)
            if (r24 == 0) goto L_0x0376
            java.lang.Object r1 = r2.A01
            X.6Rm r1 = (X.C307786Rm) r1
            r0 = 2131428762(0x7f0b059a, float:1.8479178E38)
            java.lang.Object r0 = r1.A00(r0)
            java.util.AbstractMap r0 = (java.util.AbstractMap) r0
            r0.remove(r8)
        L_0x0376:
            java.lang.Object r3 = r2.A01
            X.6Rm r3 = (X.C307786Rm) r3
            java.lang.Object r1 = r2.A02
            r0 = 2131428762(0x7f0b059a, float:1.8479178E38)
            java.lang.Object r0 = r3.A00(r0)
            java.util.AbstractMap r0 = (java.util.AbstractMap) r0
            r0.put(r10, r1)
            goto L_0x004c
        L_0x038a:
            X.5Wy r8 = (X.C286575Wy) r8
            int r1 = X.C51968G9o.A0C(r10)
            r0 = 2
            if (r1 != r0) goto L_0x0399
            boolean r0 = r8.Bwn()
            if (r0 != 0) goto L_0x0755
        L_0x0399:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x03a7
            r1 = 1550912903(0x5c710d87, float:2.71401371E17)
            java.lang.String r0 = "com.facebook.compose.view.WrappedComposition.setContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MetaComposeViewWrapper_1_7.kt:160)"
            X.0fL.A01(r1, r0)
        L_0x03a7:
            java.lang.Object r0 = r2.A02
            X.Q1z r0 = (X.C7275Q1z) r0
            androidx.compose.ui.platform.AndroidComposeView r3 = r0.A04
            java.lang.Object r1 = r2.A01
            X.0sL r1 = (X.0sL) r1
            r0 = 8
            androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.A00(r8, r3, r1, r0)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x004c
            r0 = -727362023(0xffffffffd4a55619, float:-5.6809127E12)
            goto L_0x0049
        L_0x03c1:
            X.5Wy r8 = (X.C286575Wy) r8
            int r1 = X.C51968G9o.A0C(r10)
            r0 = 2
            if (r1 != r0) goto L_0x03d0
            boolean r0 = r8.Bwn()
            if (r0 != 0) goto L_0x0755
        L_0x03d0:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x03de
            r1 = 992016489(0x3b20f869, float:0.0024562126)
            java.lang.String r0 = "com.facebook.compose.view.WrappedComposition.setContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MetaComposeViewWrapper_1_7.kt:145)"
            X.0fL.A01(r1, r0)
        L_0x03de:
            java.lang.Object r5 = r2.A02
            X.Q1z r5 = (X.C7275Q1z) r5
            androidx.compose.ui.platform.AndroidComposeView r6 = r5.A04
            r0 = 2131434782(0x7f0b1d1e, float:1.8491388E38)
            r7 = 2131434782(0x7f0b1d1e, float:1.8491388E38)
            java.lang.Object r4 = r6.getTag(r0)
            boolean r0 = X.0u4.A09(r4)
            r3 = 0
            if (r0 == 0) goto L_0x03f9
            java.util.Set r4 = (java.util.Set) r4
            if (r4 != 0) goto L_0x0413
        L_0x03f9:
            android.view.ViewParent r1 = r6.getParent()
            boolean r0 = r1 instanceof android.view.View
            if (r0 == 0) goto L_0x0454
            android.view.View r1 = (android.view.View) r1
            if (r1 == 0) goto L_0x0454
            java.lang.Object r4 = r1.getTag(r7)
        L_0x0409:
            boolean r0 = X.0u4.A09(r4)
            if (r0 == 0) goto L_0x0452
            java.util.Set r4 = (java.util.Set) r4
            if (r4 == 0) goto L_0x041e
        L_0x0413:
            r0 = r8
            X.5Wx r0 = (X.C286565Wx) r0
            X.5Wq r0 = r0.A0Y
            r4.add(r0)
            r8.AII()
        L_0x041e:
            r1 = 28
            X.JTh r0 = new X.JTh
            r0.<init>((java.lang.Object) r5, (X.AnonymousClass4D7) r3, (int) r1)
            X.C286645Xf.A04(r8, r6, r0)
            r1 = 29
            X.JTh r0 = new X.JTh
            r0.<init>((java.lang.Object) r5, (X.AnonymousClass4D7) r3, (int) r1)
            X.C286645Xf.A04(r8, r6, r0)
            X.4bM r0 = X.AnonymousClass5XX.A00
            X.5Xl r4 = r0.A02(r4)
            r3 = 1729898241(0x671c2701, float:7.374087E23)
            java.lang.Object r2 = r2.A01
            r1 = 15
            X.JGF r0 = new X.JGF
            r0.<init>(r1, r2, r5)
            X.C51971G9r.A11(r8, r4, r0, r3)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x004c
            r0 = -2076592684(0xffffffff8439b5d4, float:-2.1830137E-36)
            goto L_0x0049
        L_0x0452:
            r4 = r3
            goto L_0x041e
        L_0x0454:
            r4 = r3
            goto L_0x0409
        L_0x0456:
            int r5 = X.AnonymousClass7TE.A0M(r8)
            int r3 = X.AnonymousClass7TE.A0M(r10)
            java.lang.Object r4 = r2.A02
            android.widget.EditText r4 = (android.widget.EditText) r4
            int r1 = r4.getMaxLines()
            r0 = -1
            if (r1 == r0) goto L_0x046d
            if (r3 <= r1) goto L_0x046d
            if (r5 >= r1) goto L_0x004c
        L_0x046d:
            android.text.Editable r3 = r4.getText()
            r1 = 0
            android.text.Editable r0 = r4.getText()
            int r0 = r0.length()
            java.lang.CharSequence r1 = r3.subSequence(r1, r0)
            java.lang.Object r0 = r2.A01
            X.C51965G9l.A1W(r0, r1)
            goto L_0x004c
        L_0x0485:
            com.instagram.common.session.UserSession r8 = (com.instagram.common.session.UserSession) r8
            X.0sa r10 = (X.C62320sa) r10
            X.AnonymousClass7TG.A1N(r8, r10)
            java.lang.Object r0 = r2.A02
            com.facebook.rtc.notification.instagram.IgRtcNotificationBroadcastReceiver r0 = (com.facebook.rtc.notification.instagram.IgRtcNotificationBroadcastReceiver) r0
            X.1X9 r1 = r0.A00
            java.lang.Object r0 = r2.A01
            android.content.Context r0 = (android.content.Context) r0
            X.38Y r0 = r1.A00(r0, r8)
            r0.A0A(r10)
            goto L_0x004c
        L_0x049f:
            int r6 = X.AnonymousClass7TE.A0M(r8)
            int r5 = X.AnonymousClass7TE.A0M(r10)
            java.lang.Object r1 = r2.A01
            X.6Rm r1 = (X.C307786Rm) r1
            java.lang.Object r4 = r2.A02
            X.4uI r4 = (X.C277014uI) r4
            r0 = 0
            X.6Rx r3 = X.C307896Rx.A01(r1, r4, r0)
            X.6Tl r2 = new X.6Tl
            r2.<init>()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)
            r2.A01(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            r2.A02(r1)
            X.6Tm r1 = r2.A00()
            java.lang.Object r4 = X.C299275ur.A00(r3, r1, r4)
            if (r4 == 0) goto L_0x004e
            boolean r1 = r4 instanceof X.C276544tV
            if (r1 == 0) goto L_0x004e
            X.4tV r4 = (X.C276544tV) r4
            r0 = 0
            X.0qQ.A0B(r4, r0)
            r0 = 141(0x8d, float:1.98E-43)
            X.GyB r3 = X.C54768HSa.A00(r4, r0)
            r0 = 35
            X.GyB r2 = X.C54768HSa.A00(r4, r0)
            r0 = 36
            X.GyB r0 = X.C54768HSa.A00(r4, r0)
            X.GyA r1 = new X.GyA
            r1.<init>(r2, r0)
            X.UL3 r0 = new X.UL3
            r0.<init>(r3, r1)
            return r0
        L_0x04f8:
            java.lang.String r8 = (java.lang.String) r8
            java.lang.String r10 = (java.lang.String) r10
            X.AnonymousClass7TG.A1N(r8, r10)
            java.lang.Object r3 = r2.A02
            X.QhN r3 = (X.C8129QhN) r3
            com.facebookpay.logging.LoggingContext r1 = r3.A06
            if (r1 != 0) goto L_0x0511
            java.lang.String r0 = "loggingContext"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0511:
            java.lang.String r0 = "product_upsell"
            X.C8129QhN.A02(r1, r3, r0, r10)
            X.RRM r1 = X.AnonymousClass2E0.A07()
            java.lang.Object r0 = r2.A01
            android.view.View r0 = (android.view.View) r0
            android.content.Context r0 = X.AnonymousClass7TE.A0S(r0)
            r1.A00(r0, r8)
            goto L_0x004c
        L_0x0527:
            X.5Wy r8 = (X.C286575Wy) r8
            int r1 = X.C51968G9o.A0B(r10)
            r0 = 2
            if (r1 != r0) goto L_0x0536
            boolean r0 = r8.Bwn()
            if (r0 != 0) goto L_0x0755
        L_0x0536:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0544
            r1 = -1510565385(0xffffffffa5f699f7, float:-4.2778528E-16)
            java.lang.String r0 = "com.instagram.aistudio.home.view.AiAgentsHomeFragment.onCreateView.<anonymous>.<anonymous> (AiAgentsHomeFragment.kt:133)"
            X.0fL.A01(r1, r0)
        L_0x0544:
            java.lang.Object r6 = r2.A01
            X.4gU r6 = (X.C270284gU) r6
            java.lang.Object r9 = r6.getValue()
            X.GnE r9 = (X.C53382GnE) r9
            java.lang.Object r5 = r2.A02
            X.K56 r5 = (X.K56) r5
            X.0eM r0 = r5.A00
            java.lang.Object r10 = r0.getValue()
            X.LRW r10 = (X.LRW) r10
            X.0eM r0 = r5.A01
            java.lang.Object r11 = r0.getValue()
            X.7I6 r11 = (X.AnonymousClass7I6) r11
            r0 = -17586075(0xfffffffffef3a865, float:-1.6193838E38)
            boolean r0 = X.C51967G9n.A1Z(r8, r5, r0)
            java.lang.Object r4 = r8.ECw()
            if (r0 != 0) goto L_0x0573
            java.lang.Object r0 = X.AnonymousClass5XT.A00
            if (r4 != r0) goto L_0x057c
        L_0x0573:
            r0 = 19
            X.JJQ r4 = X.JJQ.A00(r5, r0)
            r8.FLL(r4)
        L_0x057c:
            X.0sK r4 = (X.0sK) r4
            r3 = r8
            X.5Wx r3 = (X.C286565Wx) r3
            r2 = 0
            X.C286565Wx.A0L(r3, r2)
            r0 = -17581089(0xfffffffffef3bbdf, float:-1.6198894E38)
            boolean r0 = X.C51967G9n.A1Z(r8, r5, r0)
            java.lang.Object r1 = r8.ECw()
            if (r0 != 0) goto L_0x0596
            java.lang.Object r0 = X.AnonymousClass5XT.A00
            if (r1 != r0) goto L_0x059b
        L_0x0596:
            r0 = 2
            X.MP6 r1 = X.C51975G9x.A0w(r8, r5, r0)
        L_0x059b:
            X.0sP r17 = X.C51965G9l.A0z(r3, r1)
            r0 = -17578213(0xfffffffffef3c71b, float:-1.6201811E38)
            boolean r0 = X.G9t.A1X(r8, r5, r6, r0)
            java.lang.Object r1 = r8.ECw()
            if (r0 != 0) goto L_0x05b0
            java.lang.Object r0 = X.AnonymousClass5XT.A00
            if (r1 != r0) goto L_0x05b5
        L_0x05b0:
            r0 = 4
            X.MMZ r1 = X.G9w.A0v(r8, r6, r5, r0)
        L_0x05b5:
            X.0sa r12 = X.C51965G9l.A0y(r3, r1, r2)
            r0 = -17575756(0xfffffffffef3d0b4, float:-1.6204303E38)
            boolean r0 = X.C51967G9n.A1Z(r8, r5, r0)
            java.lang.Object r1 = r8.ECw()
            if (r0 != 0) goto L_0x05ca
            java.lang.Object r0 = X.AnonymousClass5XT.A00
            if (r1 != r0) goto L_0x05d0
        L_0x05ca:
            r0 = 51
            X.MIW r1 = X.G9w.A0p(r8, r5, r0)
        L_0x05d0:
            X.0sa r13 = X.C51968G9o.A19(r3, r1)
            r0 = -17574242(0xfffffffffef3d69e, float:-1.6205838E38)
            boolean r0 = X.C51967G9n.A1Z(r8, r5, r0)
            java.lang.Object r1 = r8.ECw()
            if (r0 != 0) goto L_0x05e5
            java.lang.Object r0 = X.AnonymousClass5XT.A00
            if (r1 != r0) goto L_0x05ea
        L_0x05e5:
            r0 = 1
            X.Imy r1 = X.C51970G9q.A0r(r8, r5, r0)
        L_0x05ea:
            X.0sa r14 = X.C51968G9o.A19(r3, r1)
            r0 = -17572391(0xfffffffffef3ddd9, float:-1.6207715E38)
            boolean r0 = X.C51967G9n.A1Z(r8, r5, r0)
            java.lang.Object r1 = r8.ECw()
            if (r0 != 0) goto L_0x05ff
            java.lang.Object r0 = X.AnonymousClass5XT.A00
            if (r1 != r0) goto L_0x0605
        L_0x05ff:
            r0 = 52
            X.MIW r1 = X.G9w.A0p(r8, r5, r0)
        L_0x0605:
            X.0sa r15 = X.C51968G9o.A19(r3, r1)
            r0 = -17570728(0xfffffffffef3e458, float:-1.6209402E38)
            boolean r1 = X.C51967G9n.A1Z(r8, r5, r0)
            java.lang.Object r0 = r8.ECw()
            if (r1 != 0) goto L_0x061a
            java.lang.Object r1 = X.AnonymousClass5XT.A00
            if (r0 != r1) goto L_0x0624
        L_0x061a:
            r1 = 12
            X.MIh r0 = new X.MIh
            r0.<init>(r5, r1)
            r8.FLL(r0)
        L_0x0624:
            X.0Ya r1 = X.C51965G9l.A12(r3, r0)
            X.0sL r1 = (X.0sL) r1
            r0 = -17569373(0xfffffffffef3e9a3, float:-1.6210776E38)
            boolean r6 = X.C51967G9n.A1Z(r8, r5, r0)
            java.lang.Object r0 = r8.ECw()
            if (r6 != 0) goto L_0x063b
            java.lang.Object r6 = X.AnonymousClass5XT.A00
            if (r0 != r6) goto L_0x0645
        L_0x063b:
            r6 = 14
            X.MM7 r0 = new X.MM7
            r0.<init>(r5, r6)
            r8.FLL(r0)
        L_0x0645:
            X.0sa r16 = X.C51965G9l.A0y(r3, r0, r2)
            r0 = -17567289(0xfffffffffef3f1c7, float:-1.6212889E38)
            boolean r6 = X.C51967G9n.A1Z(r8, r5, r0)
            java.lang.Object r0 = r8.ECw()
            if (r6 != 0) goto L_0x065a
            java.lang.Object r6 = X.AnonymousClass5XT.A00
            if (r0 != r6) goto L_0x065f
        L_0x065a:
            r0 = 3
            X.MP6 r0 = X.C51975G9x.A0w(r8, r5, r0)
        L_0x065f:
            X.0sP r18 = X.C51965G9l.A0z(r3, r0)
            r19 = r1
            r20 = r4
            r21 = r2
            r22 = r2
            X.HT1.A00(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x004c
            r0 = 1267728619(0x4b9000eb, float:1.8874838E7)
            goto L_0x0049
        L_0x0679:
            X.5Wy r8 = (X.C286575Wy) r8
            int r1 = X.C51968G9o.A0B(r10)
            r0 = 2
            if (r1 != r0) goto L_0x0688
            boolean r0 = r8.Bwn()
            if (r0 != 0) goto L_0x0755
        L_0x0688:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0696
            r1 = -1476017327(0xffffffffa805c351, float:-7.425336E-15)
            java.lang.String r0 = "com.instagram.aistudio.home.view.AiSearchFragment.onCreateView.<anonymous>.<anonymous> (AiSearchFragment.kt:101)"
            X.0fL.A01(r1, r0)
        L_0x0696:
            java.lang.Object r0 = r2.A01
            java.lang.Object r9 = X.C51966G9m.A18(r0)
            X.Jve r9 = (X.C61040Jve) r9
            java.lang.Object r5 = r2.A02
            X.K4M r5 = (X.K4M) r5
            X.0eM r0 = r5.A03
            java.lang.String r11 = X.DbS.A0t(r0)
            X.0eM r0 = r5.A00
            java.lang.Object r10 = r0.getValue()
            X.LRW r10 = (X.LRW) r10
            r0 = -171369856(0xfffffffff5c91a80, float:-5.09858E32)
            boolean r0 = X.C51967G9n.A1Z(r8, r5, r0)
            java.lang.Object r14 = r8.ECw()
            if (r0 != 0) goto L_0x06c1
            java.lang.Object r0 = X.AnonymousClass5XT.A00
            if (r14 != r0) goto L_0x06c7
        L_0x06c1:
            r0 = 13
            X.MId r14 = X.C51975G9x.A0v(r8, r5, r0)
        L_0x06c7:
            X.0Ya r14 = (X.C59520Ya) r14
            r4 = r8
            X.5Wx r4 = (X.C286565Wx) r4
            r3 = 0
            X.C286565Wx.A0L(r4, r3)
            X.0sP r14 = (X.0sP) r14
            r0 = -171368800(0xfffffffff5c91ea0, float:-5.0989884E32)
            boolean r0 = X.C51967G9n.A1Z(r8, r5, r0)
            java.lang.Object r1 = r8.ECw()
            if (r0 != 0) goto L_0x06e3
            java.lang.Object r0 = X.AnonymousClass5XT.A00
            if (r1 != r0) goto L_0x06e9
        L_0x06e3:
            r0 = 14
            X.MId r1 = X.C51975G9x.A0v(r8, r5, r0)
        L_0x06e9:
            X.0sP r15 = X.C51968G9o.A1A(r4, r1)
            r0 = -171367748(0xfffffffff5c922bc, float:-5.0993953E32)
            boolean r0 = X.C51967G9n.A1Z(r8, r5, r0)
            java.lang.Object r1 = r8.ECw()
            if (r0 != 0) goto L_0x06fe
            java.lang.Object r0 = X.AnonymousClass5XT.A00
            if (r1 != r0) goto L_0x0704
        L_0x06fe:
            r0 = 53
            X.MIW r1 = X.G9w.A0p(r8, r5, r0)
        L_0x0704:
            X.0sa r12 = X.C51968G9o.A19(r4, r1)
            r0 = -171366819(0xfffffffff5c9265d, float:-5.0997547E32)
            boolean r1 = X.C51967G9n.A1Z(r8, r5, r0)
            java.lang.Object r0 = r8.ECw()
            if (r1 != 0) goto L_0x0719
            java.lang.Object r1 = X.AnonymousClass5XT.A00
            if (r0 != r1) goto L_0x0723
        L_0x0719:
            r1 = 13
            X.MIh r0 = new X.MIh
            r0.<init>(r5, r1)
            r8.FLL(r0)
        L_0x0723:
            X.0Ya r2 = X.C51965G9l.A12(r4, r0)
            X.0sL r2 = (X.0sL) r2
            r0 = -171365853(0xfffffffff5c92a23, float:-5.1001284E32)
            boolean r0 = X.C51967G9n.A1Z(r8, r5, r0)
            java.lang.Object r1 = r8.ECw()
            if (r0 != 0) goto L_0x073a
            java.lang.Object r0 = X.AnonymousClass5XT.A00
            if (r1 != r0) goto L_0x073f
        L_0x073a:
            r0 = 2
            X.Imy r1 = X.C51970G9q.A0r(r8, r5, r0)
        L_0x073f:
            X.0sa r13 = X.C51968G9o.A19(r4, r1)
            r17 = r3
            r16 = r2
            X.C56647I6c.A02(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x004c
            r0 = -80004980(0xfffffffffb3b388c, float:-9.721064E35)
            goto L_0x0049
        L_0x0755:
            r8.Evl()
            goto L_0x004c
        L_0x075a:
            X.6IL r8 = (X.AnonymousClass6IL) r8
            androidx.compose.ui.unit.Constraints r10 = (androidx.compose.ui.unit.Constraints) r10
            long r3 = r10.A00
            X.IEv r7 = new X.IEv
            r7.<init>(r8, r3)
            X.0gF r6 = X.C60340gF.A00
            java.lang.Object r5 = r2.A01
            r0 = 2
            X.JGF r1 = new X.JGF
            r1.<init>(r0, r5, r7)
            r0 = -1945019079(0xffffffff8c115d39, float:-1.1198447E-31)
            X.5PJ r0 = X.AnonymousClass5PI.A03(r1, r0)
            java.util.List r1 = r8.Eyi(r6, r0)
            java.lang.Object r0 = r2.A02
            X.5RD r0 = (X.AnonymousClass5RD) r0
            X.5d6 r0 = r0.Cnx(r8, r1, r3)
            return r0
        L_0x0783:
            X.6IL r8 = (X.AnonymousClass6IL) r8
            androidx.compose.ui.unit.Constraints r10 = (androidx.compose.ui.unit.Constraints) r10
            long r3 = r10.A00
            java.lang.Object r0 = r2.A01
            X.6I5 r0 = (X.AnonymousClass6I5) r0
            X.6Ip r5 = new X.6Ip
            r5.<init>(r0, r8)
            java.lang.Object r1 = r2.A02
            X.0sL r1 = (X.0sL) r1
            androidx.compose.ui.unit.Constraints r0 = new androidx.compose.ui.unit.Constraints
            r0.<init>(r3)
            java.lang.Object r0 = r1.invoke(r5, r0)
            return r0
        L_0x07a0:
            long r5 = X.AnonymousClass7TE.A0R(r8)
            r4 = 1
            X.0qQ.A0B(r10, r4)
            java.lang.Object r1 = r2.A02
            X.4tV r1 = (X.C276544tV) r1
            r0 = 38
            X.4uI r3 = r1.A0A(r0)
            goto L_0x07c6
        L_0x07b3:
            java.lang.Object r3 = r2.A02
            X.4uI r3 = (X.C277014uI) r3
            X.6Tm r1 = X.AnonymousClass6Tm.A01
            goto L_0x07d9
        L_0x07ba:
            long r5 = X.AnonymousClass7TE.A0R(r8)
            r4 = 1
            X.0qQ.A0B(r10, r4)
            java.lang.Object r3 = r2.A02
            X.4uI r3 = (X.C277014uI) r3
        L_0x07c6:
            X.6Tl r1 = new X.6Tl
            r1.<init>()
            java.lang.Long r0 = java.lang.Long.valueOf(r5)
            r1.A01(r0)
            r1.A03(r10, r4)
            X.6Tm r1 = r1.A00()
        L_0x07d9:
            java.lang.Object r0 = r2.A01
            X.6Rx r0 = (X.C307896Rx) r0
            X.C299275ur.A00(r0, r1, r3)
            r0 = 0
            return r0
        L_0x07e2:
            r3 = 0
            boolean r1 = X.AnonymousClass7TF.A1U(r3, r8, r10)
            X.6Tl r0 = new X.6Tl
            r0.<init>()
            r0.A03(r8, r3)
            r0.A03(r10, r1)
            X.6Tm r4 = r0.A00()
            java.lang.Object r3 = r2.A02
            X.4tV r3 = (X.C276544tV) r3
            r0 = 62
            X.4uI r1 = r3.A0A(r0)
            java.lang.Object r0 = r2.A01
            X.6Rm r0 = (X.C307786Rm) r0
            java.lang.Object r0 = X.C307886Rw.A03(r0, r3, r4, r1)
            boolean r0 = X.Q0A.A01(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L_0x0811:
            r0 = 1
            X.0qQ.A0B(r10, r0)
            java.lang.Object r3 = r2.A02
            java.lang.Object r1 = r2.A01
            r0 = 10
            X.Iw5 r7 = new X.Iw5
            r7.<init>(r0, r10, r1, r3)
            goto L_0x0c46
        L_0x0822:
            X.2Wh r10 = (X.2Wh) r10
            r0 = 1
            X.0qQ.A0B(r10, r0)
            X.7gG r6 = X.C337407gI.A00(r10)
            java.lang.Object r5 = r2.A02
            X.7h8 r5 = (X.C337927h8) r5
            java.util.List r0 = r5.A0C
            if (r0 == 0) goto L_0x0859
            java.lang.Object r4 = r2.A01
            X.0sP r4 = (X.0sP) r4
            java.util.Iterator r3 = r0.iterator()
        L_0x083c:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0859
            java.lang.Object r2 = r3.next()
            X.3B3 r2 = (X.AnonymousClass3B3) r2
            boolean r0 = r2 instanceof X.QEf
            if (r0 == 0) goto L_0x0855
            r1 = r2
            X.QEf r1 = (X.QEf) r1
            r0 = 0
            X.C245983dn.A02(r0)
            r1.A00 = r4
        L_0x0855:
            r6.A11(r2)
            goto L_0x083c
        L_0x0859:
            r0 = 2
            X.TTP r7 = new X.TTP
            r7.<init>(r0, r6, r5)
            goto L_0x0c46
        L_0x0861:
            X.2Wh r10 = (X.2Wh) r10
            X.AnonymousClass7TG.A1N(r8, r10)
            X.7gG r3 = X.C337407gI.A00(r10)
            X.7h8 r1 = A00(r10, r2)
            X.2Wg r0 = r1.A0A
            r0.Cob(r3)
            r0 = 12
            X.Iw5 r7 = new X.Iw5
            r7.<init>(r0, r3, r10, r1)
            goto L_0x0c46
        L_0x087c:
            X.2Wh r10 = (X.2Wh) r10
            r0 = 1
            X.0qQ.A0B(r10, r0)
            X.7gG r6 = X.C337407gI.A00(r10)
            java.lang.Object r5 = r2.A02
            X.7h8 r5 = (X.C337927h8) r5
            java.util.List r0 = r5.A0C
            if (r0 == 0) goto L_0x08b3
            java.lang.Object r4 = r2.A01
            X.0sP r4 = (X.0sP) r4
            java.util.Iterator r3 = r0.iterator()
        L_0x0896:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x08b3
            java.lang.Object r2 = r3.next()
            X.3B3 r2 = (X.AnonymousClass3B3) r2
            boolean r0 = r2 instanceof X.QEf
            if (r0 == 0) goto L_0x08af
            r1 = r2
            X.QEf r1 = (X.QEf) r1
            r0 = 0
            X.C245983dn.A02(r0)
            r1.A00 = r4
        L_0x08af:
            r6.A11(r2)
            goto L_0x0896
        L_0x08b3:
            r0 = 3
            X.TTP r7 = new X.TTP
            r7.<init>(r0, r6, r5)
            goto L_0x0c46
        L_0x08bb:
            X.2Wh r10 = (X.2Wh) r10
            X.AnonymousClass7TG.A1N(r8, r10)
            X.7h8 r1 = A00(r10, r2)
            r0 = 4
            X.TTP r7 = new X.TTP
            r7.<init>(r0, r10, r1)
            goto L_0x0c46
        L_0x08cc:
            X.U4O r10 = (X.U4O) r10
            r0 = 1
            X.0qQ.A0B(r10, r0)
            java.lang.Object r3 = r2.A01
            X.WJn r3 = (X.WJn) r3
            r3.A0I = r10
            java.lang.Object r2 = r2.A02
            X.TpD r2 = (X.C14065TpD) r2
            X.VLa r1 = r3.A0S
            r0 = 0
            X.0qQ.A0B(r1, r0)
            java.util.List r0 = r2.A00
            r0.add(r1)
            r0 = 8
            X.TTP r7 = new X.TTP
            r7.<init>(r0, r3, r2)
            goto L_0x0c46
        L_0x08f0:
            android.widget.TextView r1 = X.G9w.A0A(r10)
            java.lang.Object r0 = r2.A02
            X.GbF r0 = (X.C52703GbF) r0
            java.lang.Float r0 = r0.A0C
            if (r0 == 0) goto L_0x0907
            float r0 = r0.floatValue()
        L_0x0900:
            r1.setLetterSpacing(r0)
            X.Gbb r7 = X.C52724Gbb.A00
            goto L_0x0c46
        L_0x0907:
            java.lang.Object r0 = r2.A01
            X.GbJ r0 = (X.C52706GbJ) r0
            X.GbO r0 = r0.A03
            if (r0 == 0) goto L_0x0912
            float r0 = r0.A00
            goto L_0x0900
        L_0x0912:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0917:
            android.widget.TextView r5 = X.G9w.A0A(r10)
            java.lang.Object r0 = r2.A01
            X.GbJ r0 = (X.C52706GbJ) r0
            X.GbO r3 = r0.A03
            if (r3 == 0) goto L_0x0952
            java.lang.Object r1 = r2.A02
            X.GbF r1 = (X.C52703GbF) r1
            java.lang.Float r0 = r1.A0B
            java.lang.Float r4 = r1.A0A
            float r2 = r3.A01
            float r3 = r3.A02
            if (r0 == 0) goto L_0x0943
            float r2 = r0.floatValue()
            android.text.TextPaint r1 = r5.getPaint()
            r0 = 0
            float r1 = r1.getFontMetrics(r0)
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0950
            r2 = 0
        L_0x0943:
            if (r4 == 0) goto L_0x0949
            float r3 = r4.floatValue()
        L_0x0949:
            r5.setLineSpacing(r2, r3)
            X.Gbc r7 = X.C52725Gbc.A00
            goto L_0x0c46
        L_0x0950:
            float r2 = r2 - r1
            goto L_0x0943
        L_0x0952:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0957:
            android.widget.TextView r4 = X.G9w.A0A(r10)
            boolean r0 = X.C52700GbC.A01()
            if (r0 == 0) goto L_0x098e
            java.lang.Object r0 = r2.A01
            X.GbJ r0 = (X.C52706GbJ) r0
            X.GbO r0 = r0.A03
            if (r0 == 0) goto L_0x0992
            android.graphics.drawable.Drawable r3 = r0.A0E
            java.lang.Object r0 = r2.A02
            X.GbF r0 = (X.C52703GbF) r0
            java.lang.Integer r1 = r0.A0E
            if (r1 == 0) goto L_0x098b
            if (r3 == 0) goto L_0x098b
            android.graphics.drawable.Drawable$ConstantState r0 = r3.getConstantState()
            if (r0 == 0) goto L_0x098b
            android.graphics.drawable.Drawable r3 = r0.newDrawable()
            X.0qQ.A07(r3)
            int r1 = r1.intValue()
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.SRC_OVER
            X.C51969G9p.A12(r0, r3, r1)
        L_0x098b:
            X.C52714GbR.A00(r3, r4)
        L_0x098e:
            X.Gbe r7 = X.C52727Gbe.A00
            goto L_0x0c46
        L_0x0992:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0997:
            android.view.View r1 = X.C51969G9p.A0P(r10)
            java.lang.Object r0 = r2.A02
            X.GbF r0 = (X.C52703GbF) r0
            java.lang.Integer r0 = r0.A0D
            if (r0 == 0) goto L_0x09b2
            int r0 = r0.intValue()
            android.graphics.drawable.ColorDrawable r0 = X.C51965G9l.A0D(r0)
        L_0x09ab:
            r1.setBackgroundDrawable(r0)
            X.Gbd r7 = X.C52726Gbd.A00
            goto L_0x0c46
        L_0x09b2:
            java.lang.Object r0 = r2.A01
            X.GbJ r0 = (X.C52706GbJ) r0
            X.GbO r0 = r0.A03
            if (r0 == 0) goto L_0x09bd
            android.graphics.drawable.Drawable r0 = r0.A0D
            goto L_0x09ab
        L_0x09bd:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x09c2:
            android.widget.TextView r10 = (android.widget.TextView) r10
            r6 = 1
            X.0qQ.A0B(r10, r6)
            java.lang.Object r0 = r2.A02
            X.GbF r0 = (X.C52703GbF) r0
            X.Gbl r0 = r0.A05
            if (r0 == 0) goto L_0x09f1
            int r5 = r0.ordinal()
            r4 = 0
            r3 = 5
            r2 = 4
            r1 = 3
            r0 = 2
            if (r5 == r4) goto L_0x09ef
            if (r5 == r6) goto L_0x09ed
            if (r5 == r0) goto L_0x09e4
            if (r5 == r1) goto L_0x09eb
            if (r5 != r2) goto L_0x09fc
            r3 = 4
        L_0x09e4:
            r10.setImeOptions(r3)
            X.Gbf r7 = X.C52728Gbf.A00
            goto L_0x0c46
        L_0x09eb:
            r3 = 3
            goto L_0x09e4
        L_0x09ed:
            r3 = 2
            goto L_0x09e4
        L_0x09ef:
            r3 = 6
            goto L_0x09e4
        L_0x09f1:
            java.lang.Object r0 = r2.A01
            X.GbJ r0 = (X.C52706GbJ) r0
            X.GbO r0 = r0.A03
            if (r0 == 0) goto L_0x0a01
            int r3 = r0.A06
            goto L_0x09e4
        L_0x09fc:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0a01:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0a06:
            com.facebook.primitive.textinput.TextInputView r10 = (com.facebook.primitive.textinput.TextInputView) r10
            r0 = 1
            X.0qQ.A0B(r10, r0)
            java.lang.Object r9 = r2.A01
            X.GbJ r9 = (X.C52706GbJ) r9
            X.GbO r0 = X.C52709GbM.A00(r10)
            r9.A03 = r0
            r9.A02 = r10
            java.lang.CharSequence r0 = r9.A05
            if (r0 != 0) goto L_0x0a22
            java.lang.Object r0 = r2.A02
            X.GbF r0 = (X.C52703GbF) r0
            java.lang.CharSequence r0 = r0.A09
        L_0x0a22:
            r10.setText(r0)
            X.GbP r12 = new X.GbP
            r12.<init>()
            r0 = 0
            X.ID5 r11 = new X.ID5
            r11.<init>(r9, r0)
            java.util.List r0 = r12.A00
            r0.add(r11)
            r10.setOnFocusChangeListener(r12)
            X.GbK r0 = r9.A01
            r10.addTextChangedListener(r0)
            r8 = 7
            X.IoC r7 = new X.IoC
            r7.<init>(r8, r9, r10, r11, r12)
            goto L_0x0c46
        L_0x0a45:
            android.widget.TextView r1 = X.G9w.A0A(r10)
            java.lang.Object r0 = r2.A02
            X.GbF r0 = (X.C52703GbF) r0
            java.lang.Integer r0 = r0.A0H
            if (r0 == 0) goto L_0x0a5c
            int r0 = r0.intValue()
        L_0x0a55:
            r1.setMaxLines(r0)
            X.Gbh r7 = X.C52730Gbh.A00
            goto L_0x0c46
        L_0x0a5c:
            java.lang.Object r0 = r2.A01
            X.GbJ r0 = (X.C52706GbJ) r0
            X.GbO r0 = r0.A03
            if (r0 == 0) goto L_0x0a67
            int r0 = r0.A08
            goto L_0x0a55
        L_0x0a67:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0a6c:
            android.widget.EditText r10 = (android.widget.EditText) r10
            r0 = 1
            X.0qQ.A0B(r10, r0)
            X.0rm r4 = X.C51965G9l.A11()
            java.lang.Object r0 = r2.A02
            X.GbF r0 = (X.C52703GbF) r0
            java.lang.String r3 = r0.A0L
            if (r3 == 0) goto L_0x0a96
            int r0 = r3.length()
            if (r0 == 0) goto L_0x0a96
            X.I9l r1 = new X.I9l
            r1.<init>(r10, r3)
            r4.A00 = r1
            java.lang.Object r0 = r2.A01
            X.GbJ r0 = (X.C52706GbJ) r0
            X.GbK r0 = r0.A01
            java.util.List r0 = r0.A02
            r0.add(r1)
        L_0x0a96:
            java.lang.Object r1 = r2.A01
            r0 = 9
            X.TVw r7 = new X.TVw
            r7.<init>(r0, r1, r4)
            goto L_0x0c46
        L_0x0aa1:
            java.lang.Object r0 = r2.A02
            X.GbF r0 = (X.C52703GbF) r0
            X.0sa r4 = r0.A0O
            if (r4 == 0) goto L_0x0ab7
            java.lang.Object r3 = r2.A01
            X.GbJ r3 = (X.C52706GbJ) r3
            r0 = 0
            X.I9i r1 = new X.I9i
            r1.<init>(r4, r0)
            X.GbK r0 = r3.A01
            r0.A00 = r1
        L_0x0ab7:
            java.lang.Object r1 = r2.A01
            r0 = 30
            X.TVv r7 = new X.TVv
            r7.<init>(r1, r0)
            goto L_0x0c46
        L_0x0ac2:
            android.widget.TextView r1 = X.G9w.A0A(r10)
            java.lang.Object r0 = r2.A02
            X.GbF r0 = (X.C52703GbF) r0
            java.lang.CharSequence r0 = r0.A08
            if (r0 != 0) goto L_0x0ad8
            java.lang.Object r0 = r2.A01
            X.GbJ r0 = (X.C52706GbJ) r0
            X.GbO r0 = r0.A03
            if (r0 == 0) goto L_0x0adf
            java.lang.CharSequence r0 = r0.A0J
        L_0x0ad8:
            r1.setHint(r0)
            X.GbU r7 = X.C52717GbU.A00
            goto L_0x0c46
        L_0x0adf:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0ae4:
            android.widget.TextView r1 = X.G9w.A0A(r10)
            java.lang.Object r0 = r2.A02
            X.GbF r0 = (X.C52703GbF) r0
            java.lang.Integer r0 = r0.A0G
            if (r0 == 0) goto L_0x0afb
            int r0 = r0.intValue()
            r1.setHintTextColor(r0)
        L_0x0af7:
            X.GbT r7 = X.C52716GbT.A00
            goto L_0x0c46
        L_0x0afb:
            java.lang.Object r0 = r2.A01
            X.GbJ r0 = (X.C52706GbJ) r0
            X.GbO r0 = r0.A03
            if (r0 == 0) goto L_0x0b09
            android.content.res.ColorStateList r0 = r0.A09
            r1.setHintTextColor(r0)
            goto L_0x0af7
        L_0x0b09:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0b0e:
            android.widget.TextView r1 = X.G9w.A0A(r10)
            java.lang.Object r0 = r2.A01
            X.GbJ r0 = (X.C52706GbJ) r0
            X.GbO r0 = r0.A03
            if (r0 == 0) goto L_0x0b23
            int r0 = r0.A05
            r1.setHighlightColor(r0)
            X.GbV r7 = X.C52718GbV.A00
            goto L_0x0c46
        L_0x0b23:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0b28:
            android.widget.TextView r1 = X.G9w.A0A(r10)
            java.lang.Object r0 = r2.A02
            X.GbF r0 = (X.C52703GbF) r0
            java.lang.Integer r0 = r0.A0F
            if (r0 == 0) goto L_0x0b3f
            int r0 = r0.intValue()
        L_0x0b38:
            r1.setGravity(r0)
            X.GbW r7 = X.C52719GbW.A00
            goto L_0x0c46
        L_0x0b3f:
            java.lang.Object r0 = r2.A01
            X.GbJ r0 = (X.C52706GbJ) r0
            X.GbO r0 = r0.A03
            if (r0 == 0) goto L_0x0b4a
            int r0 = r0.A04
            goto L_0x0b38
        L_0x0b4a:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0b4f:
            android.view.View r4 = X.C51969G9p.A0P(r10)
            java.lang.Object r0 = r2.A02
            X.GbF r0 = (X.C52703GbF) r0
            android.graphics.Rect r0 = r0.A00
            if (r0 != 0) goto L_0x0b65
            java.lang.Object r0 = r2.A01
            X.GbJ r0 = (X.C52706GbJ) r0
            X.GbO r0 = r0.A03
            if (r0 == 0) goto L_0x0b74
            android.graphics.Rect r0 = r0.A0B
        L_0x0b65:
            int r3 = r0.left
            int r2 = r0.top
            int r1 = r0.right
            int r0 = r0.bottom
            r4.setPadding(r3, r2, r1, r0)
            X.GbX r7 = X.C52720GbX.A00
            goto L_0x0c46
        L_0x0b74:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0b79:
            android.widget.TextView r3 = X.G9w.A0A(r10)
            java.lang.Object r0 = r2.A02
            X.GbF r0 = (X.C52703GbF) r0
            X.GbH r0 = r0.A07
            if (r0 == 0) goto L_0x0b90
            int r1 = r0.A01
            float r0 = r0.A00
        L_0x0b89:
            r3.setTextSize(r1, r0)
            X.Gba r7 = X.C52723Gba.A00
            goto L_0x0c46
        L_0x0b90:
            r1 = 0
            java.lang.Object r0 = r2.A01
            X.GbJ r0 = (X.C52706GbJ) r0
            X.GbO r0 = r0.A03
            if (r0 == 0) goto L_0x0b9c
            float r0 = r0.A03
            goto L_0x0b89
        L_0x0b9c:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0ba1:
            android.widget.TextView r1 = X.G9w.A0A(r10)
            java.lang.Object r0 = r2.A02
            X.GbF r0 = (X.C52703GbF) r0
            java.lang.Integer r0 = r0.A0I
            if (r0 == 0) goto L_0x0bb8
            int r0 = r0.intValue()
            r1.setTextColor(r0)
        L_0x0bb4:
            X.GbZ r7 = X.C52722GbZ.A00
            goto L_0x0c46
        L_0x0bb8:
            java.lang.Object r0 = r2.A01
            X.GbJ r0 = (X.C52706GbJ) r0
            X.GbO r0 = r0.A03
            if (r0 == 0) goto L_0x0bc8
            android.content.res.ColorStateList r0 = r0.A0A
            if (r0 == 0) goto L_0x0bb4
            r1.setTextColor(r0)
            goto L_0x0bb4
        L_0x0bc8:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0bcd:
            java.lang.Object r3 = r2.A01
            X.WKW r3 = (X.WKW) r3
            java.lang.Object r0 = r2.A02
            X.Hp5 r0 = (X.C55884Hp5) r0
            boolean r1 = r0.A0A
            X.4Ms r0 = r3.A03
            if (r0 == 0) goto L_0x0be0
            X.4Mt r0 = r0.A0I
            r0.A0H(r1)
        L_0x0be0:
            X.Ip7 r7 = X.C58264Ip7.A00
            goto L_0x0c46
        L_0x0be3:
            java.lang.Object r1 = r2.A01
            X.WKW r1 = (X.WKW) r1
            java.lang.Object r0 = r2.A02
            X.Hp5 r0 = (X.C55884Hp5) r0
            X.VUQ r0 = r0.A01
            r1.A01 = r0
            r0 = 34
            X.TVv r7 = new X.TVv
            r7.<init>(r1, r0)
            goto L_0x0c46
        L_0x0bf7:
            java.lang.Object r3 = r2.A01
            X.WKW r3 = (X.WKW) r3
            java.lang.Object r0 = r2.A02
            X.Hp5 r0 = (X.C55884Hp5) r0
            X.0sP r0 = r0.A09
            r3.A07 = r0
            if (r0 == 0) goto L_0x0c2d
            X.4Ms r0 = r3.A03
            r1 = 1
            if (r0 == 0) goto L_0x0c21
            X.4Mt r0 = r0.A0I
            boolean r0 = r0.A0J()
            if (r0 != r1) goto L_0x0c21
            X.HqT r2 = r3.A0L
            boolean r0 = r2.A00
            if (r0 != 0) goto L_0x0c21
            r2.A00 = r1
            android.os.Handler r1 = r2.A01
            X.If9 r0 = r2.A02
            r1.post(r0)
        L_0x0c21:
            r1 = 35
            X.TVv r0 = new X.TVv
            r0.<init>(r3, r1)
            X.3eI r0 = X.C51965G9l.A0f(r0)
            return r0
        L_0x0c2d:
            X.HqT r0 = r3.A0L
            r0.A00()
            goto L_0x0c21
        L_0x0c33:
            java.lang.Object r1 = r2.A01
            X.WKW r1 = (X.WKW) r1
            java.lang.Object r0 = r2.A02
            X.Hp5 r0 = (X.C55884Hp5) r0
            X.0sP r0 = r0.A08
            r1.A06 = r0
            r0 = 36
            X.TVv r7 = new X.TVv
            r7.<init>(r1, r0)
        L_0x0c46:
            X.3eI r0 = X.C51965G9l.A0f(r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.JGF.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
