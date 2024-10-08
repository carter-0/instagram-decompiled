package X;

import com.instagram.igsignalsproducts.ttnc.IgSignalsTtncEstimator;

public final class MGJ extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public Object A01;
    public final int A02 = 1;
    public final long A03;
    public final Object A04;
    public final boolean A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MGJ(C52196GIn gIn, AnonymousClass4D7 r3, long j, boolean z) {
        super(2, r3);
        this.A03 = j;
        this.A04 = gIn;
        this.A05 = z;
    }

    public static void A00(KSS kss, long j) {
        kss.A00 = new Long(j).doubleValue();
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.MGJ, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r9) {
        AnonymousClass4D7 r3 = r9;
        if (this.A02 != 0) {
            MGJ mgj = new MGJ((C52196GIn) this.A04, r3, this.A03, this.A05);
            mgj.A01 = obj;
            return mgj;
        }
        return new MGJ((IgSignalsTtncEstimator) this.A04, (Integer) this.A01, r3, this.A03, this.A05);
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [X.MGJ, X.4D7] */
    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x0066: MOVE  (r0v25 java.lang.Integer) = (r19v1 java.lang.Integer)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    public final java.lang.Object invokeSuspend(java.lang.Object r54) {
        /*
            r53 = this;
            r4 = r53
            int r0 = r4.A02
            r1 = r54
            if (r0 == 0) goto L_0x003c
            X.1Hj r3 = X.1Hj.A02
            int r0 = r4.A00
            r5 = 1
            if (r0 == 0) goto L_0x0028
            java.lang.Object r0 = r4.A01
            X.4Cq r2 = X.JTO.A1D(r0, r1)
        L_0x0015:
            boolean r0 = X.19E.A07(r2)
            if (r0 == 0) goto L_0x0025
            java.lang.Object r2 = r4.A04
            X.GIn r2 = (X.C52196GIn) r2
            boolean r1 = r4.A05
            r0 = 0
            r2.A0C(r0, r0, r1)
        L_0x0025:
            X.0gF r3 = X.C60340gF.A00
            return r3
        L_0x0028:
            X.0eS.A00(r1)
            java.lang.Object r2 = r4.A01
            X.4Cq r2 = (X.C262224Cq) r2
            long r0 = r4.A03
            r4.A01 = r2
            r4.A00 = r5
            java.lang.Object r0 = X.C241603Pv.A01(r4, r0)
            if (r0 != r3) goto L_0x0015
            return r3
        L_0x003c:
            int r0 = r4.A00
            r6 = 1
            if (r0 == 0) goto L_0x0045
            X.0eS.A00(r1)
            goto L_0x0025
        L_0x0045:
            X.0eS.A00(r1)
            java.lang.Object r1 = r4.A04
            com.instagram.igsignalsproducts.ttnc.IgSignalsTtncEstimator r1 = (com.instagram.igsignalsproducts.ttnc.IgSignalsTtncEstimator) r1
            java.lang.Object r0 = r4.A01
            r19 = r0
            r0 = r19
            java.lang.Integer r0 = (java.lang.Integer) r0
            r19 = r0
            boolean r2 = r4.A05
            long r7 = r4.A03
            r4.A00 = r6
            X.LSL r0 = r1.A01
            if (r0 != 0) goto L_0x0025
            boolean r0 = r1.A04
            if (r0 == 0) goto L_0x0070
            java.lang.Integer r3 = X.AnonymousClass05K.A00
            r0 = r19
            if (r0 == r3) goto L_0x006e
            java.lang.Integer r3 = X.AnonymousClass05K.A01
            if (r0 != r3) goto L_0x0070
        L_0x006e:
            java.lang.Integer r19 = X.AnonymousClass05K.A0C
        L_0x0070:
            java.lang.Integer r18 = X.AnonymousClass05K.A0C
            r3 = r19
            r0 = r18
            if (r3 != r0) goto L_0x007d
            boolean r0 = r1.A03
            if (r0 != 0) goto L_0x007d
            goto L_0x0025
        L_0x007d:
            X.LM4 r14 = r1.A0A
            X.0qV r20 = X.C61970qY.A04()
            r0 = r20
            java.lang.Integer r15 = r0.A01
            java.lang.Integer r3 = X.AnonymousClass05K.A00
            if (r15 == r3) goto L_0x0025
            java.lang.Integer r0 = r0.A00
            r16 = r0
            r22 = 0
            X.Jzu r21 = new X.Jzu
            r23 = r21
            r24 = r19
            r25 = r15
            r26 = r0
            r27 = r3
            r28 = r7
            r23.<init>(r24, r25, r26, r27, r28)
            X.LDD r0 = r1.A0B
            X.L6g r10 = r0.A00()
            java.util.List r0 = r10.A02
            r52 = r0
            int r3 = r52.size()
            java.lang.Integer r4 = X.AnonymousClass05K.A0N
            r0 = r19
            if (r0 == r4) goto L_0x04b9
            if (r2 == 0) goto L_0x04b9
            r0 = 10
            if (r3 < r0) goto L_0x04b9
            X.KSh r0 = r1.A02
            if (r0 != 0) goto L_0x00f8
            X.Kub r11 = X.C61932KSh.A04
            com.instagram.common.session.UserSession r4 = r1.A07
            X.KSh r0 = new X.KSh
            r0.<init>(r4)
            X.563 r9 = X.AnonymousClass562.A00(r4)
            r2 = 63
            X.MId r5 = X.JTO.A1C(r11, r2)
            r3 = 3
            X.MIq r2 = new X.MIq
            r2.<init>(r11, r3)
            X.565 r2 = r9.A00(r0, r5, r2)
            r0.A00 = r2
            X.MSQ r3 = r1.A09
            if (r3 == 0) goto L_0x00e8
            java.util.List r2 = r2.A03
            r2.add(r3)
        L_0x00e8:
            boolean r2 = r1.A0F
            if (r2 == 0) goto L_0x00f6
            X.Kov r3 = r1.A00
            if (r3 == 0) goto L_0x021c
            X.565 r2 = r0.A00
            if (r2 == 0) goto L_0x0586
            r2.A01 = r3
        L_0x00f6:
            r1.A02 = r0
        L_0x00f8:
            java.lang.String r3 = "generic_id:todo"
            X.565 r2 = r0.A00
            if (r2 == 0) goto L_0x0586
            X.0sP r0 = r2.A06
            java.lang.Object r0 = r0.invoke(r3)
            X.LT2 r0 = (X.LT2) r0
            r0.A00 = r2
            X.KSa r0 = (X.C61929KSa) r0
            if (r0 == 0) goto L_0x04b9
            X.KSS r5 = r0.A0T
            X.0qg.A01()
            android.content.Context r4 = r14.A00
            long r2 = X.0qg.A00(r4, r6)
            r11 = 1048576(0x100000, double:5.180654E-318)
            long r2 = r2 / r11
            A00(r5, r2)
            X.KSS r3 = r0.A03
            int r2 = r15.intValue()
            switch(r2) {
                case 0: goto L_0x0219;
                case 1: goto L_0x0216;
                case 2: goto L_0x0213;
                default: goto L_0x0127;
            }
        L_0x0127:
            r2 = 3
        L_0x0128:
            X.KSS.A01(r3, r2)
            X.KSS r3 = r0.A02
            int r2 = r16.intValue()
            switch(r2) {
                case 1: goto L_0x0210;
                case 2: goto L_0x020d;
                case 3: goto L_0x020a;
                case 4: goto L_0x0207;
                default: goto L_0x0134;
            }
        L_0x0134:
            r2 = 5
        L_0x0135:
            X.KSS.A01(r3, r2)
            X.KSS r3 = r0.A0p
            int r2 = X.AnonymousClass0Ke.A00(r4)
            X.KSS.A01(r3, r2)
            X.0eE r3 = X.AnonymousClass0t1.A01
            com.instagram.common.session.UserSession r2 = r1.A07
            X.4Cl r2 = X.DbS.A0h(r2, r3)
            java.lang.Integer r2 = r2.B70()
            int r3 = X.DbX.A02(r2)
            X.KSS r2 = r0.A0B
            X.KSS.A01(r2, r3)
            X.KSS r3 = r0.A0A
            int r2 = r19.intValue()
            switch(r2) {
                case 1: goto L_0x01fe;
                case 2: goto L_0x0201;
                case 3: goto L_0x0204;
                default: goto L_0x015f;
            }
        L_0x015f:
            r2 = 0
        L_0x0160:
            X.KSS.A01(r3, r2)
            java.lang.String r25 = "ttnc"
            X.Jzu r2 = r10.A00
            if (r2 == 0) goto L_0x01f9
            long r4 = r2.A04
            int r9 = r2.A00
            long r2 = (long) r9
            long r4 = r4 + r2
            long r2 = r7 - r4
            long r3 = X.AnonymousClass7TE.A0P(r2)
        L_0x0175:
            r5 = 900000(0xdbba0, double:4.44659E-318)
            long r26 = r7 - r5
            X.LFc r14 = new X.LFc
            r22 = r14
            r23 = r20
            r22.<init>(r23, r24, r25, r26)
            r5 = 3600000(0x36ee80, double:1.7786363E-317)
            long r32 = r7 - r5
            X.LFc r13 = new X.LFc
            r28 = r13
            r29 = r20
            r30 = r19
            r31 = r25
            r28.<init>(r29, r30, r31, r32)
            r5 = 86400000(0x5265c00, double:4.2687272E-316)
            long r38 = r7 - r5
            X.LFc r12 = new X.LFc
            r34 = r12
            r35 = r20
            r36 = r19
            r37 = r25
            r34.<init>(r35, r36, r37, r38)
            r5 = 172800000(0xa4cb800, double:8.53745436E-316)
            long r44 = r7 - r5
            X.LFc r11 = new X.LFc
            r40 = r11
            r41 = r20
            r42 = r19
            r43 = r25
            r40.<init>(r41, r42, r43, r44)
            r5 = 604800000(0x240c8400, double:2.988109026E-315)
            long r50 = r7 - r5
            X.LFc r10 = new X.LFc
            r46 = r10
            r47 = r20
            r48 = r19
            r49 = r25
            r46.<init>(r47, r48, r49, r50)
            X.LFc[] r2 = new X.C63956LFc[]{r14, r13, r12, r11, r10}
            java.util.List r17 = X.0sr.A1P(r2)
            java.util.Iterator r16 = r52.iterator()
        L_0x01d7:
            boolean r2 = r16.hasNext()
            if (r2 == 0) goto L_0x02b4
            java.lang.Object r6 = r16.next()
            X.Jzu r6 = (X.C61262Jzu) r6
            java.util.Iterator r15 = r17.iterator()
        L_0x01e7:
            boolean r2 = r15.hasNext()
            if (r2 == 0) goto L_0x01d7
            java.lang.Object r5 = r15.next()
            X.LFc r5 = (X.C63956LFc) r5
            r2 = r18
            r5.A01(r6, r2)
            goto L_0x01e7
        L_0x01f9:
            r3 = -1
            r9 = -1
            goto L_0x0175
        L_0x01fe:
            r2 = 1
            goto L_0x0160
        L_0x0201:
            r2 = 2
            goto L_0x0160
        L_0x0204:
            r2 = 3
            goto L_0x0160
        L_0x0207:
            r2 = 4
            goto L_0x0135
        L_0x020a:
            r2 = 3
            goto L_0x0135
        L_0x020d:
            r2 = 2
            goto L_0x0135
        L_0x0210:
            r2 = 1
            goto L_0x0135
        L_0x0213:
            r2 = 2
            goto L_0x0128
        L_0x0216:
            r2 = 1
            goto L_0x0128
        L_0x0219:
            r2 = 0
            goto L_0x0128
        L_0x021c:
            X.0Tu r5 = X.0Tu.A05
            r2 = 36884762527138377(0x830a7f000e0249, double:3.3894105729551636E-306)
            java.lang.String r9 = X.182.A04(r5, r4, r2)
            int r2 = r9.length()
            if (r2 != 0) goto L_0x028d
            r2 = 36884762526614087(0x830a7f00060247, double:3.3894105726236005E-306)
            java.lang.String r9 = X.182.A04(r5, r4, r2)
            r2 = 36884762526745160(0x830a7f00080248, double:3.3894105727064916E-306)
            java.lang.String r11 = X.182.A04(r5, r4, r2)
            r2 = 36603287549973404(0x820a7f0007139c, double:3.2114046639872756E-306)
            long r2 = X.182.A01(r5, r4, r2)
            int r5 = r9.length()
            if (r5 == 0) goto L_0x00f6
            int r5 = r11.length()
            if (r5 == 0) goto L_0x00f6
            X.0wX r5 = X.C61170le.A00
            X.18g r5 = X.C638918c.A01(r5)
            java.lang.StringBuilder r13 = X.AnonymousClass7TF.A0n(r9)
            r12 = 95
            r13.append(r12)
            r13.append(r11)
            r13.append(r12)
            r13.append(r2)
            java.lang.String r13 = r13.toString()
            java.lang.String r12 = "ttnc_estimator_model"
            com.facebook.quicklog.LightweightQuickPerformanceLogger r5 = r5.A02
            X.18g.A05(r5, r12, r13)
            X.L6f r5 = new X.L6f
            r5.<init>(r2, r9, r11)
            java.lang.Integer r2 = X.AnonymousClass05K.A01
            com.instagram.igsignals.predictors.dcp.IgSignalsDcpPredictor r3 = new com.instagram.igsignals.predictors.dcp.IgSignalsDcpPredictor
            r3.<init>(r4, r5, r2)
        L_0x0283:
            X.565 r2 = r0.A00
            if (r2 == 0) goto L_0x0586
            r2.A01 = r3
            r1.A00 = r3
            goto L_0x00f6
        L_0x028d:
            r2 = 36603287549973404(0x820a7f0007139c, double:3.2114046639872756E-306)
            long r2 = X.182.A01(r5, r4, r2)
            X.0wX r4 = X.C61170le.A00
            X.18g r4 = X.C638918c.A01(r4)
            java.lang.String r5 = "tree_model_"
            java.lang.String r5 = X.002.A0Q(r5, r2)
            java.lang.String r3 = "ttnc_estimator_model"
            com.facebook.quicklog.LightweightQuickPerformanceLogger r2 = r4.A02
            X.18g.A05(r2, r3, r5)
            X.KSi r2 = new X.KSi
            r2.<init>(r9)
            X.KSc r3 = new X.KSc
            r3.<init>(r2)
            goto L_0x0283
        L_0x02b4:
            X.L9p r14 = r14.A00()
            X.L9p r6 = r13.A00()
            X.L9p r12 = r12.A00()
            X.L9p r11 = r11.A00()
            X.L9p r5 = r10.A00()
            X.KSS r2 = r0.A0G
            A00(r2, r3)
            X.KSS r2 = r0.A0C
            X.KSS.A01(r2, r9)
            X.KSS r4 = r0.A0U
            long r2 = r14.A00
            A00(r4, r2)
            X.KSS r4 = r0.A0X
            long r2 = r6.A00
            A00(r4, r2)
            X.KSS r4 = r0.A0Y
            long r2 = r12.A00
            A00(r4, r2)
            X.KSS r4 = r0.A0Z
            long r2 = r11.A00
            A00(r4, r2)
            X.KSS r4 = r0.A0V
            long r2 = r5.A00
            A00(r4, r2)
            X.KSS r4 = r0.A0W
            long r2 = r5.A01
            A00(r4, r2)
            X.KSS r4 = r0.A0a
            long r2 = r14.A02
            A00(r4, r2)
            X.KSS r4 = r0.A0d
            long r2 = r6.A02
            A00(r4, r2)
            X.KSS r4 = r0.A0e
            long r2 = r12.A02
            A00(r4, r2)
            X.KSS r4 = r0.A0f
            long r2 = r11.A02
            A00(r4, r2)
            X.KSS r4 = r0.A0b
            long r2 = r5.A02
            A00(r4, r2)
            X.KSS r4 = r0.A0c
            long r2 = r5.A03
            A00(r4, r2)
            X.KSS r4 = r0.A0g
            long r2 = r14.A04
            A00(r4, r2)
            X.KSS r4 = r0.A0k
            long r2 = r12.A04
            A00(r4, r2)
            X.KSS r4 = r0.A0l
            long r2 = r11.A04
            A00(r4, r2)
            X.KSS r4 = r0.A0h
            long r2 = r5.A04
            A00(r4, r2)
            X.KSS r4 = r0.A0i
            long r2 = r5.A05
            A00(r4, r2)
            java.lang.Integer r6 = X.AnonymousClass05K.A01
            X.LFc r5 = new X.LFc
            r22 = r5
            r22.<init>(r23, r24, r25, r26)
            X.LFc r9 = new X.LFc
            r28 = r9
            r28.<init>(r29, r30, r31, r32)
            X.LFc r4 = new X.LFc
            r34 = r4
            r34.<init>(r35, r36, r37, r38)
            X.LFc r3 = new X.LFc
            r40 = r3
            r40.<init>(r41, r42, r43, r44)
            X.LFc r2 = new X.LFc
            r46 = r2
            r46.<init>(r47, r48, r49, r50)
            X.LFc[] r2 = new X.C63956LFc[]{r5, r9, r4, r3, r2}
            java.util.List r11 = X.0sr.A1P(r2)
            java.util.Iterator r10 = r52.iterator()
        L_0x037a:
            boolean r2 = r10.hasNext()
            if (r2 == 0) goto L_0x039a
            java.lang.Object r3 = r10.next()
            X.Jzu r3 = (X.C61262Jzu) r3
            java.util.Iterator r4 = r11.iterator()
        L_0x038a:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L_0x037a
            java.lang.Object r2 = r4.next()
            X.LFc r2 = (X.C63956LFc) r2
            r2.A01(r3, r6)
            goto L_0x038a
        L_0x039a:
            X.L9p r4 = r5.A00()
            X.L9p r5 = r9.A00()
            X.KSS r6 = r0.A04
            long r2 = r4.A01
            A00(r6, r2)
            X.KSS r6 = r0.A05
            long r2 = r5.A01
            A00(r6, r2)
            X.KSS r6 = r0.A06
            long r2 = r4.A03
            A00(r6, r2)
            X.KSS r6 = r0.A07
            long r2 = r5.A03
            A00(r6, r2)
            X.KSS r6 = r0.A08
            long r2 = r4.A05
            A00(r6, r2)
            X.KSS r4 = r0.A09
            long r2 = r5.A05
            A00(r4, r2)
            java.lang.String r25 = "server_total"
            X.LFc r5 = new X.LFc
            r22 = r5
            r22.<init>(r23, r24, r25, r26)
            X.LFc r6 = new X.LFc
            r28 = r6
            r31 = r25
            r28.<init>(r29, r30, r31, r32)
            X.LFc r9 = new X.LFc
            r34 = r9
            r37 = r25
            r34.<init>(r35, r36, r37, r38)
            X.LFc r11 = new X.LFc
            r40 = r11
            r43 = r25
            r40.<init>(r41, r42, r43, r44)
            X.LFc r10 = new X.LFc
            r46 = r10
            r49 = r25
            r46.<init>(r47, r48, r49, r50)
            X.LFc[] r2 = new X.C63956LFc[]{r5, r6, r9, r11, r10}
            java.util.List r14 = X.0sr.A1P(r2)
            java.util.Iterator r13 = r52.iterator()
        L_0x0405:
            boolean r2 = r13.hasNext()
            if (r2 == 0) goto L_0x0427
            java.lang.Object r4 = r13.next()
            X.Jzu r4 = (X.C61262Jzu) r4
            java.util.Iterator r12 = r14.iterator()
        L_0x0415:
            boolean r2 = r12.hasNext()
            if (r2 == 0) goto L_0x0405
            java.lang.Object r3 = r12.next()
            X.LFc r3 = (X.C63956LFc) r3
            r2 = r18
            r3.A01(r4, r2)
            goto L_0x0415
        L_0x0427:
            X.L9p r2 = r5.A00()
            X.L9p r5 = r6.A00()
            X.L9p r6 = r9.A00()
            X.L9p r9 = r11.A00()
            X.L9p r10 = r10.A00()
            X.KSS r4 = r0.A0M
            long r2 = r2.A00
            A00(r4, r2)
            X.KSS r4 = r0.A0O
            long r2 = r5.A00
            A00(r4, r2)
            X.KSS r4 = r0.A0P
            long r2 = r6.A00
            A00(r4, r2)
            X.KSS r4 = r0.A0Q
            long r2 = r9.A00
            A00(r4, r2)
            X.KSS r4 = r0.A0N
            long r2 = r10.A00
            A00(r4, r2)
            java.lang.String r25 = "server_ranking"
            X.LFc r2 = new X.LFc
            r22 = r2
            r22.<init>(r23, r24, r25, r26)
            X.LFc r3 = new X.LFc
            r28 = r3
            r31 = r25
            r28.<init>(r29, r30, r31, r32)
            X.LFc r5 = new X.LFc
            r34 = r5
            r37 = r25
            r34.<init>(r35, r36, r37, r38)
            X.LFc r6 = new X.LFc
            r40 = r6
            r43 = r25
            r40.<init>(r41, r42, r43, r44)
            X.LFc r10 = new X.LFc
            r46 = r10
            r49 = r25
            r46.<init>(r47, r48, r49, r50)
            X.LFc[] r4 = new X.C63956LFc[]{r2, r3, r5, r6, r10}
            java.util.List r14 = X.0sr.A1P(r4)
            java.util.Iterator r13 = r52.iterator()
        L_0x0497:
            boolean r4 = r13.hasNext()
            if (r4 == 0) goto L_0x04d2
            java.lang.Object r12 = r13.next()
            X.Jzu r12 = (X.C61262Jzu) r12
            java.util.Iterator r11 = r14.iterator()
        L_0x04a7:
            boolean r4 = r11.hasNext()
            if (r4 == 0) goto L_0x0497
            java.lang.Object r9 = r11.next()
            X.LFc r9 = (X.C63956LFc) r9
            r4 = r18
            r9.A01(r12, r4)
            goto L_0x04a7
        L_0x04b9:
            X.4Cq r6 = r1.A0E
            boolean r0 = r1.A0H
            double r4 = r1.A05
            long r2 = r1.A06
            X.LSL r8 = new X.LSL
            r23 = r6
            r24 = r4
            r26 = r2
            r28 = r0
            r20 = r8
            r20.<init>(r21, r22, r23, r24, r26, r28)
            goto L_0x0582
        L_0x04d2:
            X.L9p r2 = r2.A00()
            X.L9p r11 = r3.A00()
            X.L9p r9 = r5.A00()
            X.L9p r6 = r6.A00()
            X.L9p r5 = r10.A00()
            X.KSS r4 = r0.A0H
            long r2 = r2.A00
            A00(r4, r2)
            X.KSS r4 = r0.A0J
            long r2 = r11.A00
            A00(r4, r2)
            X.KSS r4 = r0.A0K
            long r2 = r9.A00
            A00(r4, r2)
            X.KSS r4 = r0.A0L
            long r2 = r6.A00
            A00(r4, r2)
            X.KSS r4 = r0.A0I
            long r2 = r5.A00
            A00(r4, r2)
            X.59G r4 = r1.A02(r7)
            java.lang.Object r2 = r4.A00
            int r3 = X.AnonymousClass7TE.A0M(r2)
            java.lang.Object r2 = r4.A01
            int r5 = X.AnonymousClass7TE.A0M(r2)
            java.lang.Object r2 = r4.A02
            int r4 = X.AnonymousClass7TE.A0M(r2)
            X.KSS r2 = r0.A0o
            X.KSS.A01(r2, r3)
            X.KSS r2 = r0.A0m
            X.KSS.A01(r2, r5)
            int r2 = r3 * 24
            int r3 = r2 * 60
            int r2 = r5 * 60
            int r3 = r3 + r2
            int r3 = r3 + r4
            X.KSS r2 = r0.A0n
            X.KSS.A01(r2, r3)
            java.util.TimeZone r2 = java.util.TimeZone.getDefault()
            int r2 = r2.getOffset(r7)
            long r2 = (long) r2
            long r7 = r7 + r2
            X.59G r4 = r1.A02(r7)
            java.lang.Object r2 = r4.A00
            int r3 = X.AnonymousClass7TE.A0M(r2)
            java.lang.Object r2 = r4.A01
            int r5 = X.AnonymousClass7TE.A0M(r2)
            java.lang.Object r2 = r4.A02
            int r4 = X.AnonymousClass7TE.A0M(r2)
            X.KSS r2 = r0.A0F
            X.KSS.A01(r2, r3)
            X.KSS r2 = r0.A0D
            X.KSS.A01(r2, r5)
            int r2 = r3 * 24
            int r3 = r2 * 60
            int r2 = r5 * 60
            int r3 = r3 + r2
            int r3 = r3 + r4
            X.KSS r2 = r0.A0E
            X.KSS.A01(r2, r3)
            X.4Cq r7 = r1.A0E
            boolean r6 = r1.A0H
            double r4 = r1.A05
            long r2 = r1.A06
            X.LSL r8 = new X.LSL
            r9 = r21
            r10 = r0
            r11 = r7
            r12 = r4
            r14 = r2
            r16 = r6
            r8.<init>(r9, r10, r11, r12, r14, r16)
        L_0x0582:
            r1.A01 = r8
            goto L_0x0025
        L_0x0586:
            java.lang.String r0 = "productCore"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MGJ.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((MGJ) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MGJ(IgSignalsTtncEstimator igSignalsTtncEstimator, Integer num, AnonymousClass4D7 r4, long j, boolean z) {
        super(2, r4);
        this.A04 = igSignalsTtncEstimator;
        this.A01 = num;
        this.A05 = z;
        this.A03 = j;
    }
}
