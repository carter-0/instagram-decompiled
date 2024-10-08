package X;

/* renamed from: X.Iwx  reason: case insensitive filesystem */
public final class C58750Iwx extends 0Yg implements 0sP {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58750Iwx(int i, Object obj, Object obj2, Object obj3) {
        super(1);
        this.A00 = i;
        this.A02 = obj;
        this.A03 = obj2;
        this.A01 = obj3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:110:0x03a1, code lost:
        return X.C60340gF.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0038, code lost:
        return java.lang.Boolean.valueOf(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0243, code lost:
        if (r2 == false) goto L_0x0245;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r19) {
        /*
            r18 = this;
            r14 = r19
            r0 = r18
            int r1 = r0.A00
            switch(r1) {
                case 0: goto L_0x011c;
                case 1: goto L_0x0176;
                case 2: goto L_0x0039;
                case 3: goto L_0x01ab;
                case 4: goto L_0x0204;
                case 5: goto L_0x0229;
                case 6: goto L_0x009a;
                case 7: goto L_0x026f;
                case 8: goto L_0x02a1;
                case 9: goto L_0x02bc;
                case 10: goto L_0x02cf;
                case 11: goto L_0x02cf;
                case 12: goto L_0x0009;
                case 13: goto L_0x0009;
                case 14: goto L_0x0009;
                case 15: goto L_0x0305;
                case 16: goto L_0x00d1;
                case 17: goto L_0x0323;
                case 18: goto L_0x0343;
                case 19: goto L_0x036e;
                case 20: goto L_0x0355;
                case 21: goto L_0x036e;
                case 22: goto L_0x0106;
                case 23: goto L_0x0381;
                case 24: goto L_0x0392;
                case 25: goto L_0x03a2;
                default: goto L_0x0009;
            }
        L_0x0009:
            X.2W7 r14 = (X.AnonymousClass2W7) r14
            r1 = 0
            X.0qQ.A0B(r14, r1)
            java.lang.Object r1 = r0.A03
            X.GFJ r1 = (X.GFJ) r1
            java.lang.Object r3 = r0.A02
            X.3W1 r3 = (X.AnonymousClass3W1) r3
            X.4bN r1 = r1.A06
            java.lang.String r6 = X.C51966G9m.A1B(r1)
            boolean r7 = X.C51968G9o.A1V(r1)
            android.view.MotionEvent r1 = r14.A00
            X.0qQ.A06(r1)
            android.view.View r2 = r14.A01
            X.0qQ.A06(r2)
            java.lang.Object r5 = r0.A01
            X.GFx r5 = (X.C52129GFx) r5
            r4 = 0
            boolean r7 = X.GFJ.A07(r1, r2, r3, r4, r5, r6, r7)
        L_0x0034:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r7)
            return r0
        L_0x0039:
            X.2Uy r1 = X.C51968G9o.A0a(r14)
            java.lang.Object r8 = r0.A03
            X.Gvw r8 = (X.C53891Gvw) r8
            android.view.MotionEvent r3 = r1.A00
            X.0qQ.A06(r3)
            java.lang.Object r6 = r0.A02
            X.2V5 r6 = (X.2V5) r6
            java.lang.Object r2 = r0.A01
            X.3Zt r2 = (X.C243673Zt) r2
            int r1 = r3.getAction()
            r7 = 1
            if (r1 == 0) goto L_0x008e
            if (r1 == r7) goto L_0x0066
            r0 = 2
            if (r1 == r0) goto L_0x005c
            r7 = 0
            goto L_0x0034
        L_0x005c:
            float r5 = r3.getRawX()
            float r0 = X.C51972G9s.A03(r2)
            float r5 = r5 - r0
            goto L_0x0088
        L_0x0066:
            float r5 = r3.getRawX()
            float r0 = X.C51972G9s.A03(r2)
            float r5 = r5 - r0
            float r4 = java.lang.Math.abs(r5)
            com.instagram.common.session.UserSession r3 = r8.A01
            X.0Tu r2 = X.0Tu.A05
            r0 = 36612298390903103(0x8212b10000193f, double:3.2171031560749613E-306)
            long r1 = X.182.A01(r2, r3, r0)
            float r0 = (float) r1
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x008c
            r0 = 1120403456(0x42c80000, float:100.0)
            float r5 = r5 * r0
        L_0x0088:
            X.C51967G9n.A19(r6, r5)
            goto L_0x0034
        L_0x008c:
            r5 = 0
            goto L_0x0088
        L_0x008e:
            float r0 = r3.getRawX()
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r2.A00(r0)
            goto L_0x0034
        L_0x009a:
            X.2Uy r6 = X.C51968G9o.A0a(r14)
            java.lang.Object r5 = r0.A03
            X.GIt r5 = (X.C52202GIt) r5
            java.lang.Object r4 = r0.A02
            X.3Y5 r4 = (X.AnonymousClass3Y5) r4
            java.lang.Object r0 = r0.A01
            boolean r3 = X.C51972G9s.A1a(r0)
            com.instagram.clips.intf.ClipsViewerConfig r1 = r5.A02
            X.GIs r0 = r5.A05
            X.4bN r2 = r0.A00
            boolean r0 = X.AnonymousClass3ZC.A06(r1, r2)
            r7 = 0
            if (r0 == 0) goto L_0x0034
            if (r3 != 0) goto L_0x0034
            X.JTJ r1 = r5.A04
            android.content.Context r0 = X.C243803a8.A00(r4)
            android.view.View$OnTouchListener r2 = r1.AdX(r0, r2)
            if (r2 == 0) goto L_0x0034
            android.view.View r1 = r6.A01
            android.view.MotionEvent r0 = r6.A00
            boolean r7 = r2.onTouch(r1, r0)
            goto L_0x0034
        L_0x00d1:
            X.3W1 r14 = (X.AnonymousClass3W1) r14
            r1 = 0
            X.0qQ.A0B(r14, r1)
            java.lang.Object r6 = r0.A01
            X.GFS r6 = (X.GFS) r6
            java.lang.Object r5 = r0.A02
            X.3W1 r5 = (X.AnonymousClass3W1) r5
            X.0qQ.A0B(r5, r1)
            X.2V5 r2 = r6.A03
            boolean r1 = r5.A2F
            X.C51967G9n.A1B(r2, r1)
            boolean r1 = r5.A2F
            if (r1 == 0) goto L_0x00f9
            android.os.Handler r4 = r6.A01
            X.Ihu r3 = new X.Ihu
            r3.<init>(r5, r6)
            long r1 = r6.A00
            r4.postDelayed(r3, r1)
        L_0x00f9:
            java.lang.Object r0 = r0.A03
            X.GFJ r0 = (X.GFJ) r0
            X.JTB r0 = r0.A0H
            r0.DEq(r14)
            boolean r7 = r14.A2F
            goto L_0x0034
        L_0x0106:
            X.1Xj r2 = X.C51968G9o.A0m(r14)
            java.lang.Object r1 = r0.A03
            X.35W r1 = (X.AnonymousClass35W) r1
            com.instagram.common.session.UserSession r1 = r1.A0T
            java.lang.Object r0 = r0.A02
            X.36f r0 = (X.C2370736f) r0
            com.instagram.user.model.User r0 = r0.A00
            boolean r7 = X.AnonymousClass4JK.A01(r1, r2, r0)
            goto L_0x0034
        L_0x011c:
            X.2WE r14 = (X.2WE) r14
            r6 = 0
            X.0qQ.A0B(r14, r6)
            java.lang.Object r5 = r0.A02
            X.3bE r5 = (X.C244463bE) r5
            java.lang.Object r4 = r0.A03
            X.GTj r4 = (X.C52457GTj) r4
            com.instagram.common.session.UserSession r8 = r4.A03
            X.0Tu r3 = X.0Tu.A05
            r1 = 36316937784988368(0x810610000112d0, double:3.030315919572785E-306)
            boolean r1 = X.182.A06(r3, r8, r1)
            r5.A00 = r1
            r1 = 1
            r14.A01 = r1
            boolean r1 = r4.A0A
            if (r1 == 0) goto L_0x0173
            java.util.Map r5 = r4.A08
            java.lang.String r6 = r4.A07
            X.3OA r7 = r4.A05
            X.2nI r9 = r4.A02
            java.lang.Object r1 = r0.A01
            X.2Wa r1 = (X.2Wa) r1
            java.lang.Object r1 = r1.A03
            java.util.concurrent.atomic.AtomicReference r1 = (java.util.concurrent.atomic.AtomicReference) r1
            if (r1 == 0) goto L_0x0171
            java.lang.Object r10 = r1.get()
        L_0x0156:
            X.Hk9 r11 = r4.A00
            X.JQM r12 = r4.A06
            java.lang.Object[] r2 = new java.lang.Object[]{r5, r6, r7, r8, r9, r10, r11, r12}
        L_0x015e:
            int r1 = r2.length
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r2, r1)
            java.lang.Object r2 = r0.A01
            r1 = 29
            X.JJS r0 = new X.JJS
            r0.<init>(r1, r4, r2)
            r14.A03(r0, r3)
            goto L_0x039f
        L_0x0171:
            r10 = 0
            goto L_0x0156
        L_0x0173:
            java.lang.Object[] r2 = new java.lang.Object[r6]
            goto L_0x015e
        L_0x0176:
            java.lang.Throwable r14 = (java.lang.Throwable) r14
            r1 = 0
            X.0qQ.A0B(r14, r1)
            java.lang.String r3 = r14.getMessage()
            if (r3 != 0) goto L_0x0184
            java.lang.String r3 = ""
        L_0x0184:
            java.lang.String r1 = "ShowreelBloksComponent#render"
            X.0kD.A07(r1, r3, r14)
            java.lang.Object r2 = r0.A03
            X.6LP r2 = (X.AnonymousClass6LP) r2
            r2.A0E(r3)
            boolean r1 = r14 instanceof java.util.concurrent.CancellationException
            if (r1 == 0) goto L_0x01a7
            r2.A07()
        L_0x0197:
            java.lang.Object r1 = r0.A01
            X.IZD r1 = (X.IZD) r1
            r1.A01()
            java.lang.Object r0 = r0.A02
            X.2Wa r0 = (X.2Wa) r0
            r0.A01(r14)
            goto L_0x039f
        L_0x01a7:
            r2.A0F(r3)
            goto L_0x0197
        L_0x01ab:
            X.2WA r14 = (X.AnonymousClass2WA) r14
            r12 = 0
            X.0qQ.A0B(r14, r12)
            android.view.View r1 = r14.A00
            int r3 = r1.getMeasuredWidth()
            android.view.View r1 = r14.A00
            int r2 = r1.getMeasuredHeight()
            if (r3 == 0) goto L_0x0202
            java.lang.Object r1 = r0.A01
            X.0rh r1 = (X.0rh) r1
            float r10 = r1.A00
            float r1 = (float) r3
            float r10 = r10 / r1
        L_0x01c7:
            if (r2 == 0) goto L_0x0200
            java.lang.Object r1 = r0.A02
            X.0rh r1 = (X.0rh) r1
            float r11 = r1.A00
            float r1 = (float) r2
            float r11 = r11 / r1
        L_0x01d1:
            java.lang.Object r1 = r0.A03
            X.GG6 r1 = (X.GG6) r1
            X.JTB r2 = r1.A0F
            X.4bN r4 = r1.A07
            X.GDe r5 = r1.A08
            r8 = 0
            X.JPD r3 = r1.A04
            java.lang.Boolean r0 = r1.A0S
            boolean r0 = X.DbX.A1a(r0)
            if (r0 == 0) goto L_0x01fd
            X.2EG r6 = X.2EG.A0r
        L_0x01e8:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r12)
            r9 = r8
            r13 = r12
            r2.D3Z(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            X.GCs r1 = r1.A0O
            android.view.View r0 = r14.A00
            X.0qQ.A06(r0)
            r1.A05(r0, r8, r8)
            goto L_0x039f
        L_0x01fd:
            X.2EG r6 = X.2EG.A0s
            goto L_0x01e8
        L_0x0200:
            r11 = 0
            goto L_0x01d1
        L_0x0202:
            r10 = 0
            goto L_0x01c7
        L_0x0204:
            java.lang.Object r2 = r0.A03
            X.GG8 r2 = (X.GG8) r2
            X.JTB r5 = r2.A03
            java.lang.Object r1 = r0.A02
            X.3Y5 r1 = (X.AnonymousClass3Y5) r1
            X.2V1 r4 = r1.A05
            java.lang.Object r3 = r0.A01
            X.4bN r0 = r2.A00
            X.1Xj r0 = r0.A02
            if (r0 == 0) goto L_0x0227
            java.lang.String r2 = X.C51966G9m.A1D(r0)
        L_0x021c:
            r1 = 6
            X.JwH r0 = new X.JwH
            r0.<init>((java.lang.Object) r4, (java.lang.Object) r3, (java.lang.String) r2, (int) r1)
            r5.DQq(r0)
            goto L_0x039f
        L_0x0227:
            r2 = 0
            goto L_0x021c
        L_0x0229:
            java.lang.Object r6 = r0.A03
            X.GG8 r6 = (X.GG8) r6
            X.4bN r5 = r6.A00
            X.1Xj r1 = r5.A02
            if (r1 == 0) goto L_0x026d
            java.util.List r1 = X.C51965G9l.A0w(r1)
        L_0x0237:
            java.lang.Object r3 = r0.A01
            X.GJG r3 = (X.GJG) r3
            r4 = 1
            if (r1 == 0) goto L_0x0245
            boolean r2 = X.AnonymousClass7TE.A1b(r1)
            r1 = 1
            if (r2 != 0) goto L_0x0246
        L_0x0245:
            r1 = 0
        L_0x0246:
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r3.A01 = r1
            java.lang.Object r3 = r0.A02
            X.3Zt r3 = (X.C243673Zt) r3
            X.AnonymousClass2VL.A00()
            java.lang.Object r0 = r3.A00
            boolean r0 = X.AnonymousClass7TE.A1a(r0)
            if (r0 != 0) goto L_0x039f
            com.instagram.common.session.UserSession r2 = r6.A02
            X.0iw r1 = r6.A01
            X.1Xj r0 = r5.A02
            X.C52086GEg.A0X(r1, r2, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            r3.A00(r0)
            goto L_0x039f
        L_0x026d:
            r1 = 0
            goto L_0x0237
        L_0x026f:
            java.lang.Object r5 = r0.A03
            X.GvC r5 = (X.C53845GvC) r5
            com.instagram.common.session.UserSession r4 = r5.A02
            X.0Tu r3 = X.0Tu.A05
            r1 = 36328413937548627(0x81108000003d53, double:3.03757348466265E-306)
            boolean r1 = X.182.A06(r3, r4, r1)
            r3 = 0
            if (r1 == 0) goto L_0x0292
            X.JTJ r2 = r5.A04
            java.lang.Object r1 = r0.A01
            X.4bN r1 = (X.C267324bN) r1
            java.lang.Object r0 = r0.A02
            X.GDe r0 = (X.C52058GDe) r0
            r2.CIC(r1, r0, r3)
            goto L_0x039f
        L_0x0292:
            X.JTB r2 = r5.A03
            java.lang.Object r1 = r0.A01
            X.4bN r1 = (X.C267324bN) r1
            java.lang.Object r0 = r0.A02
            X.GDe r0 = (X.C52058GDe) r0
            r2.CwV(r1, r0, r3)
            goto L_0x039f
        L_0x02a1:
            java.lang.Object r1 = r0.A01
            X.0r1 r1 = (X.0r1) r1
            boolean r1 = r1.A00
            if (r1 == 0) goto L_0x039f
            java.lang.Object r1 = r0.A03
            X.GHU r1 = (X.GHU) r1
            com.instagram.common.session.UserSession r3 = r1.A04
            X.4DU r2 = r1.A06
            java.lang.Integer r1 = X.AnonymousClass05K.A00
            java.lang.Object r0 = r0.A02
            X.1Xj r0 = (X.1Xj) r0
            X.JVF.A00(r2, r3, r0, r1)
            goto L_0x039f
        L_0x02bc:
            java.lang.Object r1 = r0.A03
            X.GHU r1 = (X.GHU) r1
            X.JTB r2 = r1.A07
            java.lang.Object r1 = r0.A01
            X.4bN r1 = (X.C267324bN) r1
            java.lang.Object r0 = r0.A02
            X.GDe r0 = (X.C52058GDe) r0
            r2.Dz9(r1, r0)
            goto L_0x039f
        L_0x02cf:
            java.lang.Object r5 = r0.A01
            X.4w6 r5 = (X.C278014w6) r5
            java.lang.Object r1 = r0.A03
            X.GsV r1 = (X.C53678GsV) r1
            X.JTB r4 = r1.A00
            java.lang.Object r3 = r0.A02
            X.1Xj r3 = (X.1Xj) r3
            if (r5 == 0) goto L_0x039f
            java.lang.Integer r0 = X.I2I.A01(r5)
            r2 = -1
            if (r0 == 0) goto L_0x039f
            int r1 = r0.intValue()
            r0 = 0
            if (r1 == r0) goto L_0x039f
            r0 = 2
            if (r1 == r0) goto L_0x0300
            r0 = 3
            if (r1 == r0) goto L_0x02fb
            r0 = 4
            if (r1 != r0) goto L_0x039f
            r4.D8I(r5, r3, r2)
            goto L_0x039f
        L_0x02fb:
            r4.DVE(r5, r3, r2)
            goto L_0x039f
        L_0x0300:
            r4.D1v(r5, r3, r2)
            goto L_0x039f
        L_0x0305:
            java.util.List r14 = (java.util.List) r14
            r1 = 0
            X.0qQ.A0B(r14, r1)
            java.lang.Object r2 = r0.A03
            X.GFJ r2 = (X.GFJ) r2
            X.4bN r1 = r2.A06
            X.1Xj r1 = r1.A02
            if (r1 == 0) goto L_0x039f
            X.JTB r2 = r2.A0H
            java.lang.Object r1 = r0.A01
            X.1Xj r1 = (X.1Xj) r1
            java.lang.Object r0 = r0.A02
            X.3W1 r0 = (X.AnonymousClass3W1) r0
            r2.DSO(r1, r0, r14)
            goto L_0x039f
        L_0x0323:
            java.lang.String r14 = (java.lang.String) r14
            r2 = 0
            X.0qQ.A0B(r14, r2)
            java.lang.Object r1 = r0.A01
            X.Hlc r1 = (X.C55679Hlc) r1
            java.lang.Object r11 = r0.A02
            android.app.Activity r11 = (android.app.Activity) r11
            java.lang.Object r12 = r0.A03
            X.0iw r12 = (X.AnonymousClass0iw) r12
            X.AnonymousClass7TF.A1H(r11, r12)
            com.instagram.common.session.UserSession r13 = r1.A01
            r15 = 0
            r16 = r15
            r17 = r2
            X.C56242Hv9.A00(r11, r12, r13, r14, r15, r16, r17)
            goto L_0x039f
        L_0x0343:
            java.lang.Object r3 = r0.A03
            X.HqP r3 = (X.C55958HqP) r3
            java.lang.Object r2 = r0.A01
            X.1Xj r2 = (X.1Xj) r2
            java.lang.Object r1 = r0.A02
            X.3W1 r1 = (X.AnonymousClass3W1) r1
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            r3.A00(r2, r1, r0)
            goto L_0x039f
        L_0x0355:
            X.2WA r4 = X.G9w.A0R(r14)
            java.lang.Object r3 = r0.A03
            X.JTC r3 = (X.JTC) r3
            java.lang.Object r2 = r0.A01
            X.4bN r2 = (X.C267324bN) r2
            java.lang.Object r1 = r0.A02
            X.GDe r1 = (X.C52058GDe) r1
            android.view.View r0 = r4.A00
            X.0qQ.A06(r0)
            r3.DNc(r0, r2, r1)
            goto L_0x039f
        L_0x036e:
            java.lang.Object r1 = r0.A03
            X.JTC r1 = (X.JTC) r1
            java.lang.Object r3 = r0.A01
            X.4bN r3 = (X.C267324bN) r3
            java.lang.Object r4 = r0.A02
            X.GDe r4 = (X.C52058GDe) r4
            r2 = 0
            r6 = 0
            r5 = r2
            r1.D4h(r2, r3, r4, r5, r6)
            goto L_0x039f
        L_0x0381:
            java.lang.Object r2 = r0.A01
            X.0zk r1 = X.1HT.A04
            if (r2 == r1) goto L_0x039f
            r1 = 0
            java.lang.Object r0 = r0.A02
            X.1Wm r0 = (X.1Wm) r0
            X.4Cc r0 = r0.A04
            X.C55286HfF.A00(r2, r0, r1)
            goto L_0x039f
        L_0x0392:
            java.lang.Object r2 = r0.A03
            X.0sP r2 = (X.0sP) r2
            java.lang.Object r1 = r0.A02
            java.lang.Object r0 = r0.A01
            X.4Cc r0 = (X.C262094Cc) r0
            X.C55286HfF.A00(r1, r0, r2)
        L_0x039f:
            X.0gF r0 = X.C60340gF.A00
            return r0
        L_0x03a2:
            r1 = 0
            X.0qQ.A0B(r14, r1)
            java.lang.Object r2 = r0.A01
            X.0sK r2 = (X.0sK) r2
            java.lang.Object r1 = r0.A03
            java.lang.Object r0 = r0.A02
            java.lang.Object r0 = r2.invoke(r1, r0, r14)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58750Iwx.invoke(java.lang.Object):java.lang.Object");
    }
}
