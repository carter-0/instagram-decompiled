package X;

/* renamed from: X.9MQ  reason: invalid class name */
public final class AnonymousClass9MQ extends 0Yg implements 0sP {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass9MQ(int i, Object obj, Object obj2, Object obj3, Object obj4) {
        super(1);
        this.A00 = i;
        this.A01 = obj;
        this.A04 = obj2;
        this.A03 = obj3;
        this.A02 = obj4;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v22, resolved type: X.62f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v26, resolved type: X.5b4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v30, resolved type: X.62f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v31, resolved type: X.62f} */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x01da  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r34) {
        /*
            r33 = this;
            r0 = r33
            r2 = r34
            int r1 = r0.A00
            switch(r1) {
                case 0: goto L_0x0094;
                case 1: goto L_0x00d9;
                case 2: goto L_0x02c7;
                case 3: goto L_0x01df;
                case 4: goto L_0x0300;
                case 5: goto L_0x053d;
                case 6: goto L_0x0328;
                case 7: goto L_0x03a9;
                case 8: goto L_0x03d1;
                case 9: goto L_0x0209;
                case 10: goto L_0x0404;
                case 11: goto L_0x0495;
                case 12: goto L_0x0224;
                case 13: goto L_0x0254;
                case 14: goto L_0x029e;
                case 15: goto L_0x05e5;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.util.List r2 = (java.util.List) r2
            r1 = 0
            X.0qQ.A0B(r2, r1)
            X.90V r13 = X.AnonymousClass90V.A00
            java.lang.Object r14 = r0.A01
            androidx.core.app.ComponentActivity r14 = (androidx.core.app.ComponentActivity) r14
            java.lang.Object r3 = r0.A03
            X.07Z r3 = (X.AnonymousClass07Z) r3
            java.lang.Object r12 = r0.A04
            com.instagram.common.session.UserSession r12 = (com.instagram.common.session.UserSession) r12
            java.lang.Object r6 = r0.A02
            X.72N r6 = (X.AnonymousClass72N) r6
            if (r14 == 0) goto L_0x0091
            if (r3 == 0) goto L_0x0091
            java.util.Iterator r10 = r2.iterator()
        L_0x0029:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x008c
            java.lang.Object r11 = r10.next()
            X.8vc r11 = (X.C369968vc) r11
            boolean r0 = r11.A00()
            if (r0 == 0) goto L_0x0029
            java.lang.Object r0 = X.00k.A0I(r2)
            X.8vc r0 = (X.C369968vc) r0
            long r4 = r0.A02
            java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.SECONDS
            long r0 = java.lang.System.currentTimeMillis()
            r7 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 / r7
            long r8 = r9.toHours(r0)
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r0 = r0.toHours(r4)
            long r8 = r8 - r0
            X.0Tu r7 = X.0Tu.A05
            r0 = 36597261710461710(0x82050400010b0e, double:3.207593898815972E-306)
            long r4 = X.182.A01(r7, r12, r0)
            int r0 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r0 < 0) goto L_0x0029
            r0 = 36597261710658319(0x82050400040b0f, double:3.2075938989403085E-306)
            long r4 = X.182.A01(r7, r12, r0)
            int r0 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r0 > 0) goto L_0x0029
            android.content.Context r1 = r14.getBaseContext()
            X.0qQ.A07(r1)
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            com.instagram.clips.drafts.model.validation.ClipsDraftValidator r1 = X.HWL.A00(r1, r12, r0)
            java.lang.String r0 = r11.A09
            r10 = 31
            X.IxF r9 = new X.IxF
            r9.<init>(r10, r11, r12, r13, r14)
            r1.A02(r3, r0, r9)
        L_0x008c:
            X.2Fk r0 = r6.A01
            r0.A05(r14)
        L_0x0091:
            X.0gF r12 = X.C60340gF.A00
            return r12
        L_0x0094:
            X.64v r2 = (X.C3026764v) r2
            java.lang.Object r4 = r0.A04
            X.5b4 r4 = (X.AnonymousClass5b4) r4
            X.5b5 r6 = r4.A04
            androidx.compose.animation.core.SuspendAnimationKt.A06(r2, r6)
            X.5Oz r5 = r2.A06
            java.lang.Object r1 = r5.getValue()
            java.lang.Object r3 = X.AnonymousClass5b4.A00(r4, r1)
            java.lang.Object r1 = r5.getValue()
            boolean r1 = X.0qQ.A0K(r3, r1)
            if (r1 != 0) goto L_0x00d5
            X.5Oz r1 = r6.A05
            r1.Epw(r3)
            java.lang.Object r1 = r0.A03
            X.5b5 r1 = (X.C287955b5) r1
            X.5Oz r1 = r1.A05
            r1.Epw(r3)
            java.lang.Object r1 = r0.A01
            X.0sP r1 = (X.0sP) r1
            if (r1 == 0) goto L_0x00ca
            r1.invoke(r4)
        L_0x00ca:
            r2.A00()
            java.lang.Object r1 = r0.A02
            X.0r1 r1 = (X.0r1) r1
            r0 = 1
            r1.A00 = r0
            goto L_0x0091
        L_0x00d5:
            java.lang.Object r0 = r0.A01
            goto L_0x01d6
        L_0x00d9:
            r4 = r2
            X.62f r4 = (X.C3022462f) r4
            r11 = 0
            X.0qQ.A0B(r4, r11)
            java.lang.Object r2 = r0.A01
            X.5Oz r2 = (X.C284945Oz) r2
            X.62d r8 = r4.A03
            int r7 = r8.A02
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)
            r2.Epw(r1)
            java.lang.Object r5 = r0.A04
            X.6Cq r5 = (X.C304226Cq) r5
            boolean r1 = r4.A0A()
            if (r1 == 0) goto L_0x01d4
            X.62Y r1 = r4.A04
            int r1 = r1.A01
            r3 = 1
            if (r1 != r3) goto L_0x01d4
            X.5Oz r6 = r5.A04
            java.lang.Object r2 = r6.getValue()
            X.5vR r1 = X.C299585vR.None
            if (r2 != r1) goto L_0x01d4
            int r1 = r5.A01
            int r1 = r1 - r3
            int r7 = r7 - r3
            if (r1 <= r7) goto L_0x0111
            r1 = r7
        L_0x0111:
            int r2 = r4.A03(r1)
            int r10 = r8.A07(r1, r3)
            java.lang.String r8 = r5.A07
            int r1 = r8.length()
            int r1 = r1 + 4
            int r10 = r10 - r1
            if (r10 >= r2) goto L_0x0125
            r10 = r2
        L_0x0125:
            X.5Tq r9 = r5.A05
            java.util.List r1 = r9.A03(r2, r10)
            java.util.Iterator r7 = r1.iterator()
        L_0x012f:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L_0x014c
            java.lang.Object r3 = r7.next()
            X.62b r3 = (X.C3022062b) r3
            int r1 = r3.A00
            if (r1 <= r10) goto L_0x012f
            java.util.List r2 = X.AnonymousClass6E4.A00
            java.lang.String r1 = r3.A03
            boolean r1 = r2.contains(r1)
            if (r1 == 0) goto L_0x012f
            int r10 = r3.A01
            goto L_0x012f
        L_0x014c:
            X.5Tq r3 = r9.subSequence(r11, r10)
            r1 = 16
            X.6Bd r7 = new X.6Bd
            r7.<init>(r1)
            r7.A09(r8)
            X.11S r1 = X.AnonymousClass6E4.A01
            X.2Ya r1 = r1.A04(r8)
            java.util.Iterator r10 = r1.iterator()
        L_0x0164:
            boolean r1 = r10.hasNext()
            if (r1 == 0) goto L_0x01b1
            java.lang.Object r8 = r10.next()
            X.5gs r8 = (X.C291265gs) r8
            long r1 = r5.A02
            r20 = 0
            r12 = 0
            r17 = 65534(0xfffe, float:9.1833E-41)
            X.5ZB r11 = new X.5ZB
            r13 = r12
            r14 = r12
            r15 = r12
            r16 = r12
            r18 = r1
            r22 = r20
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r20, r22)
            X.2HY r1 = r8.A01()
            int r2 = r1.A00
            X.2HY r1 = r8.A01()
            int r1 = r1.A01
            int r1 = r1 + 1
            r7.A06(r11, r2, r1)
            X.2HY r1 = r8.A01()
            int r9 = r1.A00
            X.2HY r1 = r8.A01()
            int r1 = r1.A01
            int r8 = r1 + 1
            r1 = 2329(0x919, float:3.264E-42)
            java.lang.String r2 = X.C273654mx.A00(r1)
            java.lang.String r1 = ""
            r7.A0A(r2, r1, r9, r8)
            goto L_0x0164
        L_0x01b1:
            X.5Tq r1 = r7.A02()
            X.5Tq r1 = r3.A01(r1)
            r5.A00 = r1
            X.5vR r3 = X.C299585vR.Collapsed
            r6.Epw(r3)
            X.5Tq r2 = r5.A00
            if (r2 == 0) goto L_0x01cb
            X.5Oz r1 = r5.A03
            if (r1 == 0) goto L_0x01cb
            r1.Epw(r2)
        L_0x01cb:
            java.lang.Object r1 = r0.A03
            X.0sP r1 = (X.0sP) r1
            if (r1 == 0) goto L_0x01d4
            r1.invoke(r3)
        L_0x01d4:
            java.lang.Object r0 = r0.A02
        L_0x01d6:
            X.0sP r0 = (X.0sP) r0
            if (r0 == 0) goto L_0x0091
            r0.invoke(r4)
            goto L_0x0091
        L_0x01df:
            X.0sa r2 = (X.C62320sa) r2
            r1 = 0
            X.0qQ.A0B(r2, r1)
            java.lang.Object r1 = r0.A04
            X.3Yc r1 = (X.C243273Yc) r1
            X.3Yb r1 = r1.A01
            X.JOB r3 = r1.BRC()
            java.lang.Object r4 = r0.A01
            X.1Xj r4 = (X.1Xj) r4
            java.lang.Object r5 = r0.A02
            X.3W1 r5 = (X.AnonymousClass3W1) r5
            int r8 = r5.getPosition()
            java.lang.Object r0 = r0.A03
            X.0iw r0 = (X.AnonymousClass0iw) r0
            java.lang.String r6 = r0.getModuleName()
            r7 = r2
            r3.DNR(r4, r5, r6, r7, r8)
            goto L_0x0091
        L_0x0209:
            X.1Xj r2 = (X.1Xj) r2
            r1 = 0
            X.0qQ.A0B(r2, r1)
            java.lang.Object r4 = r0.A01
            X.3fJ r4 = (X.C246833fJ) r4
            java.lang.Object r3 = r0.A03
            X.1Xj r3 = (X.1Xj) r3
            java.lang.Object r1 = r0.A04
            X.3W1 r1 = (X.AnonymousClass3W1) r1
            java.lang.Object r0 = r0.A02
            X.0iw r0 = (X.AnonymousClass0iw) r0
            r4.DN5(r0, r3, r2, r1)
            goto L_0x0091
        L_0x0224:
            java.lang.Object r1 = r0.A02
            X.3ZE r1 = (X.AnonymousClass3ZE) r1
            X.3ZD r1 = (X.AnonymousClass3ZD) r1
            X.9J2 r3 = r1.A00
            java.lang.Object r1 = r0.A01
            com.instagram.user.model.User r1 = (com.instagram.user.model.User) r1
            boolean r2 = r1.A2Q()
            java.lang.Object r1 = r0.A04
            X.3Zn r1 = (X.C243613Zn) r1
            X.0eM r1 = r1.A08
            java.lang.Object r1 = r1.getValue()
            X.3aX r1 = (X.C244033aX) r1
            java.lang.Object r0 = r0.A03
            X.3W1 r0 = (X.AnonymousClass3W1) r0
            int r0 = r0.getPosition()
            if (r2 == 0) goto L_0x024f
            r1.A01(r3, r0)
            goto L_0x0091
        L_0x024f:
            r1.A02(r3, r0)
            goto L_0x0091
        L_0x0254:
            X.2Uo r2 = (X.C70722Uo) r2
            r1 = 0
            X.0qQ.A0B(r2, r1)
            java.lang.Object r1 = r0.A04
            X.3Zf r1 = (X.C243553Zf) r1
            X.3Wa r5 = r1.A02
            java.lang.Object r4 = r0.A03
            X.3Za r4 = (X.C243503Za) r4
            X.3ZH r3 = r4.A09
            X.3W1 r1 = r4.A0D
            r5.Cy5(r3, r1)
            java.lang.Object r2 = r2.A00
            boolean r1 = r2 instanceof android.view.View
            r3 = 0
            if (r1 == 0) goto L_0x0281
            android.view.View r2 = (android.view.View) r2
            if (r2 == 0) goto L_0x0281
            r1 = 2131435958(0x7f0b21b6, float:1.8493773E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            android.view.View r3 = r2.findViewWithTag(r1)
        L_0x0281:
            java.lang.Object r2 = r0.A01
            X.3ap r1 = X.C244213ap.NoNux
            if (r2 == r1) goto L_0x0091
            X.9IT r1 = r4.A02
            java.lang.Object r1 = r1.A0B
            X.0sK r1 = (X.0sK) r1
            java.lang.Object r0 = r0.A02
            X.3Y5 r0 = (X.AnonymousClass3Y5) r0
            android.content.Context r0 = X.C243803a8.A00(r0)
            android.app.Activity r0 = X.C61270mF.A00(r0)
            r1.invoke(r2, r0, r3)
            goto L_0x0091
        L_0x029e:
            android.view.View r2 = (android.view.View) r2
            r1 = 0
            X.0qQ.A0B(r2, r1)
            android.content.Context r5 = r2.getContext()
            X.0qQ.A07(r5)
            java.lang.Object r1 = r0.A04
            X.3dW r1 = (X.C245813dW) r1
            com.instagram.common.session.UserSession r4 = r1.A00
            java.lang.Object r3 = r0.A02
            X.1Xj r3 = (X.1Xj) r3
            java.lang.Object r1 = r0.A03
            X.3W1 r1 = (X.AnonymousClass3W1) r1
            java.lang.Object r0 = r0.A01
            X.4DU r0 = (X.AnonymousClass4DU) r0
            r6 = r2
            r7 = r4
            r8 = r3
            r9 = r0
            r10 = r1
            X.AnonymousClass4HG.A00(r5, r6, r7, r8, r9, r10)
            goto L_0x0091
        L_0x02c7:
            r1 = 0
            X.0qQ.A0B(r2, r1)
            java.lang.Object r5 = r0.A04
            X.4Gz r5 = (X.C263044Gz) r5
            java.lang.Object r4 = r0.A01
            java.lang.Object r8 = r0.A02
            java.lang.Object r0 = r0.A03
            X.4DU r0 = (X.AnonymousClass4DU) r0
            boolean r3 = r0.isOrganicEligible()
            boolean r1 = r0.isSponsoredEligible()
            r0 = 1438(0x59e, float:2.015E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.2kQ r10 = X.C227942kP.A01(r0, r3, r1)
            com.instagram.common.session.UserSession r0 = r5.A00
            r7 = 17
            X.Ixb r6 = new X.Ixb
            r9 = r2
            r11 = r4
            r12 = r5
            r6.<init>(r7, r8, r9, r10, r11, r12)
            r4 = 0
            r7 = 1
            X.3aW r12 = new X.3aW
            r5 = r4
            r2 = r12
            r3 = r0
            r2.<init>(r3, r4, r5, r6, r7)
            return r12
        L_0x0300:
            X.2xS r2 = (X.AnonymousClass2xS) r2
            r1 = 0
            X.0qQ.A0B(r2, r1)
            java.lang.Object r1 = r0.A03
            X.33Z r1 = (X.AnonymousClass33Z) r1
            X.0eM r1 = r1.A0K
            java.lang.Object r3 = r1.getValue()
            X.4U7 r3 = (X.AnonymousClass4U7) r3
            java.lang.Object r5 = r0.A01
            X.1Xj r5 = (X.1Xj) r5
            java.lang.Object r7 = r0.A02
            X.3W1 r7 = (X.AnonymousClass3W1) r7
            java.lang.Object r0 = r0.A04
            X.33W r0 = (X.AnonymousClass33W) r0
            android.content.Context r4 = r0.A00
            X.4DU r6 = r0.A08
            r8 = r2
            X.4WX r12 = r3.A01(r4, r5, r6, r7, r8)
            return r12
        L_0x0328:
            X.2s5 r2 = (X.C231672s5) r2
            r3 = 0
            X.0qQ.A0B(r2, r3)
            java.lang.Object r1 = r0.A03
            X.33Z r1 = (X.AnonymousClass33Z) r1
            X.0eM r1 = r1.A0U
            java.lang.Object r8 = r1.getValue()
            java.lang.Object r1 = r0.A01
            X.1Xj r1 = (X.1Xj) r1
            java.lang.Object r5 = r0.A02
            X.3W1 r5 = (X.AnonymousClass3W1) r5
            java.lang.Object r0 = r0.A04
            X.33W r0 = (X.AnonymousClass33W) r0
            X.4DU r6 = r0.A08
            X.0qQ.A0B(r1, r3)
            r0 = 1
            X.0qQ.A0B(r5, r0)
            X.3ZT r4 = new X.3ZT
            r4.<init>(r1)
            float r19 = r1.A0l()
            X.1Xy r0 = r1.A0C
            X.DUp r15 = r0.BAG()
            int r20 = r5.getPosition()
            int r28 = r5.getPosition()
            r0 = 20
            X.JGn r7 = new X.JGn
            r7.<init>(r0, r5, r8, r1)
            r29 = 11
            X.J6a r27 = new X.J6a
            r30 = r1
            r31 = r5
            r32 = r8
            r27.<init>((int) r28, (int) r29, (java.lang.Object) r30, (java.lang.Object) r31, (java.lang.Object) r32)
            r0 = 31
            X.J6S r9 = new X.J6S
            r9.<init>(r0, r1, r8)
            X.PqU r3 = new X.PqU
            r3.<init>((int) r0, (java.lang.Object) r5, (java.lang.Object) r1, (java.lang.Object) r8)
            r1 = 30
            X.J6K r0 = new X.J6K
            r0.<init>(r8, r1)
            r22 = 6
            X.GnX r13 = new X.GnX
            r21 = r13
            r23 = r7
            r24 = r0
            r25 = r3
            r26 = r9
            r21.<init>(r22, r23, r24, r25, r26, r27)
            X.GmW r12 = new X.GmW
            r14 = r2
            r16 = r6
            r17 = r5
            r18 = r4
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20)
            return r12
        L_0x03a9:
            X.3YB r2 = (X.AnonymousClass3YB) r2
            r1 = 0
            X.0qQ.A0B(r2, r1)
            java.lang.Object r1 = r0.A03
            X.33Z r1 = (X.AnonymousClass33Z) r1
            X.3Ws r3 = r1.A01()
            java.lang.Object r5 = r0.A01
            X.1Xj r5 = (X.1Xj) r5
            java.lang.Object r1 = r0.A02
            X.3W1 r1 = (X.AnonymousClass3W1) r1
            java.lang.Object r0 = r0.A04
            X.33W r0 = (X.AnonymousClass33W) r0
            android.content.Context r4 = r0.A00
            X.4DU r6 = r0.A08
            java.lang.String r0 = r0.A0F
            r7 = r2
            r8 = r1
            r9 = r0
            X.3Zb r12 = r3.A04(r4, r5, r6, r7, r8, r9)
            return r12
        L_0x03d1:
            android.app.Activity r2 = (android.app.Activity) r2
            java.lang.Object r1 = r0.A03
            X.33Z r1 = (X.AnonymousClass33Z) r1
            X.0eM r1 = r1.A0B
            java.lang.Object r3 = r1.getValue()
            X.4Fq r3 = (X.C262714Fq) r3
            java.lang.Object r5 = r0.A01
            X.1Xj r5 = (X.1Xj) r5
            java.lang.Object r7 = r0.A02
            X.3W1 r7 = (X.AnonymousClass3W1) r7
            int r8 = r7.getPosition()
            java.lang.Object r0 = r0.A04
            X.33W r0 = (X.AnonymousClass33W) r0
            android.content.Context r4 = r0.A00
            X.4DU r6 = r0.A08
            X.2dZ r0 = X.2dY.A00(r2)
            if (r0 == 0) goto L_0x0402
            int r9 = r0.AYI()
        L_0x03fd:
            X.4Fw r12 = r3.A01(r4, r5, r6, r7, r8, r9)
            return r12
        L_0x0402:
            r9 = 0
            goto L_0x03fd
        L_0x0404:
            r5 = 0
            X.0qQ.A0B(r2, r5)
            java.lang.Object r1 = r0.A04
            X.3Xr r1 = (X.C243173Xr) r1
            X.0eM r1 = r1.A02
            r1.getValue()
            java.lang.Object r1 = r0.A02
            X.1Xj r1 = (X.1Xj) r1
            java.lang.Object r3 = r0.A03
            java.lang.Object r4 = r0.A01
            X.4DU r4 = (X.AnonymousClass4DU) r4
            X.0qQ.A0B(r1, r5)
            r0 = 1
            X.0qQ.A0B(r3, r0)
            r0 = 3
            X.0qQ.A0B(r4, r0)
            X.2kQ r12 = X.C227942kP.A00(r4)
            boolean r20 = r1.CcK()
            boolean r21 = r1.A5G()
            boolean r22 = r1.A5I()
            X.1Xy r0 = r1.A0C
            com.instagram.user.model.User r0 = r0.CCd()
            if (r0 == 0) goto L_0x0444
            java.lang.String r19 = X.AnonymousClass3ZA.A00(r0)
            if (r19 != 0) goto L_0x0446
        L_0x0444:
            java.lang.String r19 = ""
        L_0x0446:
            r0 = 24
            X.9Ls r4 = new X.9Ls
            r4.<init>(r0, r2, r1)
            r8 = 9
            X.9MQ r7 = new X.9MQ
            r9 = r2
            r10 = r3
            r11 = r1
            r7.<init>(r8, r9, r10, r11, r12)
            r0 = 17
            X.9ME r5 = new X.9ME
            r5.<init>(r0, r2, r3, r1)
            r10 = 10
            X.9MT r8 = new X.9MT
            r9 = r8
            r11 = r3
            r13 = r2
            r14 = r1
            r9.<init>(r10, r11, r12, r13, r14)
            r10 = 11
            X.9MT r9 = new X.9MT
            r9.<init>(r10, r11, r12, r13, r14)
            r14 = 12
            X.9MT r10 = new X.9MT
            r13 = r10
            r15 = r3
            r17 = r2
            r18 = r1
            r16 = r12
            r13.<init>(r14, r15, r16, r17, r18)
            r0 = 25
            X.9Ls r6 = new X.9Ls
            r6.<init>(r0, r2, r1)
            X.9Il r3 = new X.9Il
            r3.<init>((X.C62320sa) r4, (X.C62320sa) r5, (X.C62320sa) r6, (X.0sP) r7, (X.0sL) r8, (X.0sL) r9, (X.0sL) r10)
            X.4K4 r12 = new X.4K4
            r17 = r12
            r18 = r3
            r17.<init>(r18, r19, r20, r21, r22)
            return r12
        L_0x0495:
            r4 = 0
            X.0qQ.A0B(r2, r4)
            java.lang.Object r1 = r0.A04
            X.3Xr r1 = (X.C243173Xr) r1
            X.0eM r1 = r1.A01
            java.lang.Object r1 = r1.getValue()
            X.4Jx r1 = (X.C263254Jx) r1
            java.lang.Object r3 = r0.A02
            X.1Xj r3 = (X.1Xj) r3
            java.lang.Object r7 = r0.A03
            java.lang.Object r5 = r0.A01
            X.0iw r5 = (X.AnonymousClass0iw) r5
            X.0qQ.A0B(r3, r4)
            r0 = 1
            X.0qQ.A0B(r7, r0)
            r0 = 3
            X.0qQ.A0B(r5, r0)
            java.lang.String r15 = r3.getId()
            if (r15 == 0) goto L_0x0535
            com.instagram.common.session.UserSession r6 = r1.A00
            java.lang.String r16 = X.C231122qu.A07(r6, r3)
            X.1Xy r0 = r3.A0C
            java.lang.String r17 = r0.BMq()
            X.1Xy r0 = r3.A0C
            X.3xo r14 = r0.B5E()
            double r0 = r3.A0k()
            long r10 = (long) r0
            X.0rQ r0 = X.C231512rn.A00(r6)
            com.instagram.common.session.UserSession r9 = r0.A00
            X.0Tu r8 = X.0Tu.A05
            r0 = 36329333061337145(0x811156000c4039, double:3.038154742247523E-306)
            boolean r22 = X.182.A06(r8, r9, r0)
            X.0rQ r0 = X.C231512rn.A00(r6)
            com.instagram.common.session.UserSession r9 = r0.A00
            r0 = 37173757991518819(0x841156000d0263, double:3.5721724683206856E-306)
            double r18 = X.182.A00(r8, r9, r0)
            java.lang.String r0 = r5.getModuleName()
            X.4Jz r1 = X.C263264Jy.A00(r6, r3, r0, r4)
            X.4Jz r0 = X.C263274Jz.TAP_TO_SOUND
            r23 = 0
            if (r1 == r0) goto L_0x0507
            r23 = 1
        L_0x0507:
            r0 = 23
            X.9Ls r4 = new X.9Ls
            r4.<init>(r0, r2, r3)
            r0 = 16
            X.9ME r1 = new X.9ME
            r1.<init>(r0, r2, r7, r3)
            r25 = 29
            X.9MR r0 = new X.9MR
            r24 = r0
            r26 = r3
            r27 = r7
            r28 = r5
            r29 = r2
            r24.<init>(r25, r26, r27, r28, r29)
            r2 = 12
            X.9Ib r13 = new X.9Ib
            r13.<init>((int) r2, (java.lang.Object) r0, (java.lang.Object) r4, (java.lang.Object) r1)
            X.4K0 r12 = new X.4K0
            r20 = r10
            r12.<init>(r13, r14, r15, r16, r17, r18, r20, r22, r23)
            return r12
        L_0x0535:
            java.lang.String r0 = "Required value was null."
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        L_0x053d:
            X.2rv r2 = (X.C231592rv) r2
            r1 = 0
            X.0qQ.A0B(r2, r1)
            java.lang.Object r1 = r0.A03
            X.33Z r1 = (X.AnonymousClass33Z) r1
            X.0eM r1 = r1.A0R
            java.lang.Object r5 = r1.getValue()
            X.5Es r5 = (X.C282785Es) r5
            java.lang.Object r4 = r0.A01
            X.1Xj r4 = (X.1Xj) r4
            java.lang.Object r3 = r0.A02
            X.3W1 r3 = (X.AnonymousClass3W1) r3
            java.lang.Object r6 = r0.A04
            X.33W r6 = (X.AnonymousClass33W) r6
            int r0 = r2.ordinal()
            switch(r0) {
                case 1: goto L_0x0579;
                case 2: goto L_0x057f;
                case 3: goto L_0x05d7;
                case 10: goto L_0x0585;
                case 27: goto L_0x058b;
                case 31: goto L_0x05c9;
                case 40: goto L_0x05a3;
                case 41: goto L_0x05a3;
                case 56: goto L_0x05c1;
                case 57: goto L_0x05cf;
                case 66: goto L_0x0593;
                case 69: goto L_0x059b;
                case 77: goto L_0x05a9;
                case 78: goto L_0x05b5;
                default: goto L_0x0562;
            }
        L_0x0562:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "No CTA provider for itemType "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = r1.toString()
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>(r0)
            throw r1
        L_0x0579:
            X.3yy r1 = new X.3yy
            r1.<init>()
            goto L_0x05dc
        L_0x057f:
            X.IS3 r1 = new X.IS3
            r1.<init>()
            goto L_0x05dc
        L_0x0585:
            X.LrF r1 = new X.LrF
            r1.<init>()
            goto L_0x05dc
        L_0x058b:
            com.instagram.common.session.UserSession r0 = r6.A02
            X.AdJ r1 = new X.AdJ
            r1.<init>(r0)
            goto L_0x05dc
        L_0x0593:
            com.instagram.common.session.UserSession r0 = r6.A02
            X.IS6 r1 = new X.IS6
            r1.<init>(r0)
            goto L_0x05dc
        L_0x059b:
            com.instagram.common.session.UserSession r0 = r6.A02
            X.IS7 r1 = new X.IS7
            r1.<init>(r0)
            goto L_0x05dc
        L_0x05a3:
            X.IS4 r1 = new X.IS4
            r1.<init>()
            goto L_0x05dc
        L_0x05a9:
            X.310 r0 = r6.A03
            X.DQu r0 = r0.CC3()
            X.AdK r1 = new X.AdK
            r1.<init>(r0)
            goto L_0x05dc
        L_0x05b5:
            X.310 r0 = r6.A03
            X.DQv r0 = r0.CC5()
            X.AdL r1 = new X.AdL
            r1.<init>(r0)
            goto L_0x05dc
        L_0x05c1:
            com.instagram.common.session.UserSession r0 = r6.A02
            X.IS5 r1 = new X.IS5
            r1.<init>(r0)
            goto L_0x05dc
        L_0x05c9:
            X.IS2 r1 = new X.IS2
            r1.<init>()
            goto L_0x05dc
        L_0x05cf:
            com.instagram.common.session.UserSession r0 = r6.A02
            X.3YS r1 = new X.3YS
            r1.<init>(r0)
            goto L_0x05dc
        L_0x05d7:
            X.AdI r1 = new X.AdI
            r1.<init>()
        L_0x05dc:
            X.3YT r1 = (X.AnonymousClass3YT) r1
            X.4DU r0 = r6.A08
            X.5Ev r12 = r5.A00(r1, r4, r0, r3)
            return r12
        L_0x05e5:
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r8 = r2.booleanValue()
            java.lang.Object r2 = r0.A01
            android.content.Context r2 = (android.content.Context) r2
            java.lang.Object r1 = r0.A04
            X.3dW r1 = (X.C245813dW) r1
            com.instagram.common.session.UserSession r5 = r1.A00
            java.lang.Object r6 = r0.A03
            X.1Xj r6 = (X.1Xj) r6
            android.content.res.Resources r3 = r2.getResources()
            X.0qQ.A07(r3)
            X.0Pl r7 = r1.A02
            java.lang.Object r4 = r0.A02
            X.0iw r4 = (X.AnonymousClass0iw) r4
            java.lang.StringBuilder r12 = X.C246673ez.A01(r2, r3, r4, r5, r6, r7, r8)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9MQ.invoke(java.lang.Object):java.lang.Object");
    }
}
