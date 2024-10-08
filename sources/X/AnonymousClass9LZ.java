package X;

/* renamed from: X.9LZ  reason: invalid class name */
public final class AnonymousClass9LZ extends 0Yg implements 0sL {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass9LZ(Object obj, int i) {
        super(2);
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: type inference failed for: r0v165, types: [X.07g, X.4DH] */
    /* JADX WARNING: type inference failed for: r8v1, types: [java.lang.Object, X.2jA] */
    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x070f: MOVE  (r1v68 X.7jH) = (r1v60 X.7jH)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x075b  */
    /* JADX WARNING: Removed duplicated region for block: B:202:0x076a  */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r41, java.lang.Object r42) {
        /*
            r40 = this;
            r3 = r40
            r1 = r41
            r2 = r42
            int r0 = r3.A00
            switch(r0) {
                case 0: goto L_0x0a79;
                case 1: goto L_0x0a9f;
                case 2: goto L_0x0ab2;
                case 3: goto L_0x0021;
                case 4: goto L_0x0ac3;
                case 5: goto L_0x019e;
                case 6: goto L_0x0b04;
                case 7: goto L_0x01f6;
                case 8: goto L_0x0204;
                case 9: goto L_0x021a;
                case 10: goto L_0x024e;
                case 11: goto L_0x0276;
                case 12: goto L_0x02aa;
                case 13: goto L_0x02e2;
                case 14: goto L_0x0356;
                case 15: goto L_0x0396;
                case 16: goto L_0x03d6;
                case 17: goto L_0x03e9;
                case 18: goto L_0x0b33;
                case 19: goto L_0x08ba;
                case 20: goto L_0x08d0;
                case 21: goto L_0x08ee;
                case 22: goto L_0x0913;
                case 23: goto L_0x0b55;
                case 24: goto L_0x00b0;
                case 25: goto L_0x0b66;
                case 26: goto L_0x096f;
                case 27: goto L_0x09a4;
                case 28: goto L_0x0b86;
                case 29: goto L_0x0bac;
                case 30: goto L_0x09e0;
                case 31: goto L_0x0a01;
                case 32: goto L_0x000b;
                case 33: goto L_0x000b;
                case 34: goto L_0x0a24;
                case 35: goto L_0x0bc3;
                case 36: goto L_0x0bd8;
                case 37: goto L_0x0bf1;
                case 38: goto L_0x0a39;
                case 39: goto L_0x0a53;
                case 40: goto L_0x0a17;
                case 41: goto L_0x0a64;
                default: goto L_0x000b;
            }
        L_0x000b:
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            r0 = 0
            X.0qQ.A0B(r1, r0)
            if (r2 == 0) goto L_0x001e
            java.lang.Object r0 = r3.A01
            X.0sP r0 = (X.0sP) r0
            r0.invoke(r1)
        L_0x001e:
            X.0gF r0 = X.C60340gF.A00
            return r0
        L_0x0021:
            java.util.Set r1 = (java.util.Set) r1
            boolean r0 = r1 instanceof X.C285135Pw
            if (r0 == 0) goto L_0x0086
            r0 = r1
            X.5Pw r0 = (X.C285135Pw) r0
            X.01p r0 = r0.A00
            java.lang.Object[] r10 = r0.A03
            long[] r9 = r0.A02
            int r0 = r9.length
            int r8 = r0 + -2
            if (r8 < 0) goto L_0x001e
            r7 = 0
        L_0x0036:
            r15 = r9[r7]
            r11 = -1
            long r11 = r11 ^ r15
            r0 = 7
            long r11 = r11 << r0
            long r11 = r11 & r15
            r4 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r11 = r11 & r4
            int r0 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x0081
            int r0 = r7 - r8
            r0 = r0 ^ -1
            int r0 = r0 >>> 31
            r6 = 8
            int r5 = 8 - r0
            r4 = 0
        L_0x0053:
            if (r4 >= r5) goto L_0x007f
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r15
            r11 = 128(0x80, double:6.32E-322)
            int r0 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r0 >= 0) goto L_0x007b
            int r0 = r7 << 3
            int r0 = r0 + r4
            r2 = r10[r0]
            boolean r0 = r2 instanceof X.AnonymousClass5Ow
            if (r0 == 0) goto L_0x0073
            X.5Ow r2 = (X.AnonymousClass5Ow) r2
            X.4dV r0 = r2.A00
            int r0 = r0.get()
            r0 = r0 & 4
            if (r0 == 0) goto L_0x007b
        L_0x0073:
            java.lang.Object r0 = r3.A01
            X.3jv r0 = (X.C249523jv) r0
            r0.FIG(r1)
            goto L_0x001e
        L_0x007b:
            long r15 = r15 >> r6
            int r4 = r4 + 1
            goto L_0x0053
        L_0x007f:
            if (r5 != r6) goto L_0x001e
        L_0x0081:
            if (r7 == r8) goto L_0x001e
            int r7 = r7 + 1
            goto L_0x0036
        L_0x0086:
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L_0x0091
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x0091
            goto L_0x001e
        L_0x0091:
            java.util.Iterator r4 = r1.iterator()
        L_0x0095:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x001e
            java.lang.Object r2 = r4.next()
            boolean r0 = r2 instanceof X.AnonymousClass5Ow
            if (r0 == 0) goto L_0x0073
            X.5Ow r2 = (X.AnonymousClass5Ow) r2
            X.4dV r0 = r2.A00
            int r0 = r0.get()
            r0 = r0 & 4
            if (r0 == 0) goto L_0x0095
            goto L_0x0073
        L_0x00b0:
            X.5u2 r1 = (X.C298795u2) r1
            java.lang.Number r2 = (java.lang.Number) r2
            r4 = 0
            X.0qQ.A0B(r1, r4)
            java.lang.Object r11 = r3.A01
            X.32L r11 = (X.AnonymousClass32L) r11
            com.instagram.common.session.UserSession r0 = r11.getSession()
            X.A8d r0 = X.A07.A00(r0)
            java.lang.String r6 = r1.A03
            X.5qm r5 = r1.A00
            X.0qQ.A0B(r6, r4)
            r3 = 1
            X.0qQ.A0B(r5, r3)
            java.util.Map r0 = r0.A00
            r0.put(r6, r5)
            X.GWY r0 = r11.A0J
            if (r0 != 0) goto L_0x00dc
            java.lang.String r0 = "viewController"
            goto L_0x0a0f
        L_0x00dc:
            java.lang.String r10 = r1.A03
            X.0qQ.A0B(r10, r4)
            X.GT0 r0 = r0.A09
            X.GWW r9 = r0.A0F
            X.GWV r8 = r9.A01
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.List r0 = r8.A03
            java.util.Iterator r6 = r0.iterator()
        L_0x00f2:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0114
            java.lang.Object r5 = r6.next()
            X.5r0 r5 = (X.C297005r0) r5
            X.5ov r0 = r5.A01
            if (r0 == 0) goto L_0x0112
            X.5u2 r0 = r0.A06
            if (r0 == 0) goto L_0x0112
            java.lang.String r0 = r0.A03
        L_0x0108:
            boolean r0 = X.0qQ.A0K(r0, r10)
            if (r0 != 0) goto L_0x00f2
            r7.add(r5)
            goto L_0x00f2
        L_0x0112:
            r0 = 0
            goto L_0x0108
        L_0x0114:
            r8.A03 = r7
            X.GWV.A00(r8)
            r9.A04()
            com.instagram.common.session.UserSession r12 = r11.getSession()
            java.lang.String r19 = r11.getSessionId()
            java.lang.String r18 = "sfplt_in_breather_header"
            X.0qQ.A0B(r12, r4)
            java.lang.String r23 = "this_topic_doesnt_interest_me"
            if (r2 == 0) goto L_0x019b
            int r39 = r2.intValue()
        L_0x0131:
            r13 = 0
            java.lang.String r16 = ""
            r24 = r11
            r25 = r13
            r26 = r12
            r27 = r1
            r28 = r13
            r29 = r16
            r30 = r13
            r31 = r18
            r32 = r19
            r33 = r13
            r34 = r13
            r35 = r13
            r36 = r13
            r37 = r23
            r38 = r13
            X.I7O.A02(r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39)
            java.lang.String r7 = "topic_id:"
            java.lang.String r6 = r1.A03
            java.lang.String r5 = ",status:"
            X.5qm r0 = r1.A00
            int r1 = r0.ordinal()
            r0 = 3
            if (r1 == r0) goto L_0x0198
            if (r1 == r3) goto L_0x0195
            r0 = 1619(0x653, float:2.269E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
        L_0x016c:
            java.lang.String r24 = X.002.A0u(r7, r6, r5, r0)
            if (r2 == 0) goto L_0x0192
            int r29 = r2.intValue()
        L_0x0176:
            r0 = 4755(0x1293, float:6.663E-42)
            java.lang.String r15 = X.AnonymousClass000.A00(r0)
            r14 = r13
            r17 = r13
            r20 = r13
            r21 = r13
            r22 = r13
            r26 = r13
            r27 = r13
            r30 = r3
            r31 = r4
            X.I7O.A09(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            goto L_0x001e
        L_0x0192:
            r29 = -1
            goto L_0x0176
        L_0x0195:
            java.lang.String r0 = "not_a_topic"
            goto L_0x016c
        L_0x0198:
            java.lang.String r0 = "interested"
            goto L_0x016c
        L_0x019b:
            r39 = -1
            goto L_0x0131
        L_0x019e:
            java.lang.Object r4 = r3.A01
            X.5TE r4 = (X.AnonymousClass5TE) r4
        L_0x01a2:
            java.util.concurrent.atomic.AtomicReference r5 = r4.A06
            java.lang.Object r3 = r5.get()
            if (r3 != 0) goto L_0x01c5
            r0 = r1
        L_0x01ab:
            boolean r0 = X.1FH.A00(r3, r0, r5)
            if (r0 == 0) goto L_0x01a2
            boolean r0 = X.AnonymousClass5TE.A00(r4)
            if (r0 == 0) goto L_0x001e
            X.0sP r2 = r4.A07
            r1 = 20
            X.9L8 r0 = new X.9L8
            r0.<init>(r4, r1)
            r2.invoke(r0)
            goto L_0x001e
        L_0x01c5:
            boolean r0 = r3 instanceof java.util.Set
            if (r0 == 0) goto L_0x01d8
            r2 = r3
            java.util.Set r2 = (java.util.Set) r2
            r0 = r1
            java.util.Set r0 = (java.util.Set) r0
            java.util.Set[] r0 = new java.util.Set[]{r2, r0}
            java.util.List r0 = X.0sr.A1P(r0)
            goto L_0x01ab
        L_0x01d8:
            boolean r0 = r3 instanceof java.util.List
            if (r0 == 0) goto L_0x01eb
            r2 = r3
            java.util.Collection r2 = (java.util.Collection) r2
            java.util.List r0 = java.util.Collections.singletonList(r1)
            X.0qQ.A07(r0)
            java.util.ArrayList r0 = X.00k.A0S(r0, r2)
            goto L_0x01ab
        L_0x01eb:
            r0 = 1407(0x57f, float:1.972E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)
            X.AnonymousClass5XN.A04(r0)
            goto L_0x0a12
        L_0x01f6:
            X.5PL r2 = (X.AnonymousClass5PL) r2
            java.lang.Object r0 = r3.A01
            X.6I8 r0 = (X.AnonymousClass6I8) r0
            X.6IJ r0 = X.AnonymousClass6I8.A00(r0)
            r0.A04 = r2
            goto L_0x001e
        L_0x0204:
            X.5R6 r1 = (X.AnonymousClass5R6) r1
            X.0sL r2 = (X.0sL) r2
            java.lang.Object r0 = r3.A01
            X.6I8 r0 = (X.AnonymousClass6I8) r0
            X.6IJ r3 = X.AnonymousClass6I8.A00(r0)
            X.6IO r0 = new X.6IO
            r0.<init>(r3, r2)
            r1.Ecq(r0)
            goto L_0x001e
        L_0x021a:
            X.5R6 r1 = (X.AnonymousClass5R6) r1
            java.lang.Object r4 = r3.A01
            X.6I8 r4 = (X.AnonymousClass6I8) r4
            X.6IJ r2 = r1.A06
            if (r2 != 0) goto L_0x022d
            androidx.compose.ui.layout.SubcomposeSlotReusePolicy r0 = r4.A01
            X.6IJ r2 = new X.6IJ
            r2.<init>(r0, r1)
            r1.A06 = r2
        L_0x022d:
            r4.A00 = r2
            X.6IJ r0 = X.AnonymousClass6I8.A00(r4)
            r0.A05()
            X.6IJ r3 = X.AnonymousClass6I8.A00(r4)
            androidx.compose.ui.layout.SubcomposeSlotReusePolicy r1 = r4.A01
            androidx.compose.ui.layout.SubcomposeSlotReusePolicy r0 = r3.A05
            if (r0 == r1) goto L_0x001e
            r3.A05 = r1
            r2 = 0
            X.AnonymousClass6IJ.A03(r3, r2)
            X.5R6 r1 = r3.A09
            r0 = 1
            r1.A0a(r2, r0, r0)
            goto L_0x001e
        L_0x024e:
            java.lang.Object r6 = r3.A01
            X.4cg r6 = (X.C268054cg) r6
            X.5R6 r3 = r6.A0H
            X.5SI r0 = r3.A0U
            X.5SJ r0 = r0.A0J
            boolean r0 = r0.A0E
            if (r0 == 0) goto L_0x0274
            X.4co r0 = X.AnonymousClass5RJ.A00(r3)
            androidx.compose.ui.platform.AndroidComposeView r0 = (androidx.compose.ui.platform.AndroidComposeView) r0
            X.5TD r5 = r0.A0b
            X.0sP r4 = X.C268054cg.A0O
            r3 = 5
            X.Iw5 r0 = new X.Iw5
            r0.<init>(r3, r1, r2, r6)
            r5.A00(r6, r0, r4)
            r0 = 0
        L_0x0270:
            r6.A0B = r0
            goto L_0x001e
        L_0x0274:
            r0 = 1
            goto L_0x0270
        L_0x0276:
            X.5Wy r1 = (X.C286575Wy) r1
            java.lang.Number r2 = (java.lang.Number) r2
            int r0 = r2.intValue()
            r2 = r0 & 3
            r0 = 2
            if (r2 != r0) goto L_0x0289
            boolean r0 = r1.Bwn()
            if (r0 != 0) goto L_0x03d1
        L_0x0289:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0297
            r2 = -172315664(0xfffffffff5baabf0, float:-4.732688E32)
            java.lang.String r0 = "androidx.compose.ui.platform.AbstractComposeView.ensureCompositionCreated.<anonymous> (ComposeView.android.kt:258)"
            X.0fL.A01(r2, r0)
        L_0x0297:
            java.lang.Object r2 = r3.A01
            X.54O r2 = (X.AnonymousClass54O) r2
            r0 = 0
            r2.A06(r1, r0)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x001e
            r0 = 1286599732(0x4caff434, float:9.2250528E7)
            goto L_0x03cc
        L_0x02aa:
            X.5Wy r1 = (X.C286575Wy) r1
            java.lang.Number r2 = (java.lang.Number) r2
            int r0 = r2.intValue()
            r2 = r0 & 3
            r0 = 2
            if (r2 != r0) goto L_0x02bd
            boolean r0 = r1.Bwn()
            if (r0 != 0) goto L_0x03d1
        L_0x02bd:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x02cb
            r2 = 1983605566(0x763b6b3e, float:9.503268E32)
            java.lang.String r0 = "com.instagram.barcelona.bds.components.navigation.navigationbar.BdsNavigationBar.<anonymous>.<anonymous>.<anonymous> (BdsNavigationBar.kt:98)"
            X.0fL.A01(r2, r0)
        L_0x02cb:
            java.lang.Object r2 = r3.A01
            X.0sL r2 = (X.0sL) r2
            r0 = 0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.invoke(r1, r0)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x001e
            r0 = -793262361(0xffffffffd0b7c6e7, float:-2.46661263E10)
            goto L_0x03cc
        L_0x02e2:
            java.util.List r1 = (java.util.List) r1
            java.util.List r2 = (java.util.List) r2
            r0 = 0
            X.0qQ.A0B(r1, r0)
            r7 = 1
            X.0qQ.A0B(r2, r7)
            java.lang.Object r0 = r3.A01
            X.72N r0 = (X.AnonymousClass72N) r0
            com.instagram.common.session.UserSession r0 = r0.A07
            X.27r r6 = X.27p.A01(r0)
            X.0wc r4 = r6.A01
            java.lang.String r3 = "ig_camera_see_all_drafts_in_database"
            X.0kJ r0 = r4.A00
            X.0Aj r5 = r4.A00(r0, r3)
            boolean r0 = r5.isSampled()
            if (r0 == 0) goto L_0x001e
            java.lang.String r3 = "event_type"
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)
            r5.A8k(r3, r0)
            X.0iw r0 = X.27x.A08
            java.lang.String r3 = r0.getModuleName()
            java.lang.String r0 = "module"
            r5.AAJ(r0, r3)
            X.4yP r3 = r6.A0J()
            java.lang.String r0 = "camera_destination"
            r5.A8M(r3, r0)
            X.283 r4 = r6.A04
            java.lang.String r3 = r4.A0L
            java.lang.String r0 = "camera_session_id"
            r5.AAJ(r0, r3)
            java.lang.String r0 = "composition_str_id_list"
            r5.AAe(r0, r1)
            java.lang.String r0 = "draft_content_list"
            r5.AAe(r0, r2)
            X.28D r1 = r4.A09
            java.lang.String r0 = "entry_point"
            r5.A8M(r1, r0)
            X.1QJ r0 = X.AnonymousClass1QI.A00
            X.1QM r0 = r0.A02
            java.lang.String r1 = r0.A00
            java.lang.String r0 = "nav_chain"
            r5.AAJ(r0, r1)
            X.JVj r1 = r4.A0C
            java.lang.String r0 = "surface"
            r5.A8M(r1, r0)
            r5.Cgf()
            goto L_0x001e
        L_0x0356:
            X.5Wy r1 = (X.C286575Wy) r1
            java.lang.Number r2 = (java.lang.Number) r2
            int r0 = r2.intValue()
            r2 = r0 & 3
            r0 = 2
            if (r2 != r0) goto L_0x0369
            boolean r0 = r1.Bwn()
            if (r0 != 0) goto L_0x03d1
        L_0x0369:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0377
            r2 = 450545727(0x1adac83f, float:9.04862E-23)
            java.lang.String r0 = "com.instagram.compose.igds.components.button.IgdsButton.<anonymous> (IgdsButton.kt:90)"
            X.0fL.A01(r2, r0)
        L_0x0377:
            r4 = 0
            X.GSc r5 = X.C52423GSb.A01(r1)
            java.lang.Object r2 = r3.A01
            X.6CC r2 = (X.AnonymousClass6CC) r2
            r0 = 1
            long r8 = r2.AJf(r0)
            r6 = 64
            r3 = r1
            r7 = r0
            X.GQD.A02(r3, r4, r5, r6, r7, r8)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x001e
            r0 = -1455249661(0xffffffffa942a703, float:-4.3221513E-14)
            goto L_0x03cc
        L_0x0396:
            X.5Wy r1 = (X.C286575Wy) r1
            java.lang.Number r2 = (java.lang.Number) r2
            int r0 = r2.intValue()
            r2 = r0 & 3
            r0 = 2
            if (r2 != r0) goto L_0x03a9
            boolean r0 = r1.Bwn()
            if (r0 != 0) goto L_0x03d1
        L_0x03a9:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x03b7
            r2 = -753992684(0xffffffffd30efc14, float:-6.1411453E11)
            java.lang.String r0 = "com.instagram.compose.igds.theme.IgdsTheme.<anonymous> (IgdsTheme.kt:47)"
            X.0fL.A01(r2, r0)
        L_0x03b7:
            X.5ZE r0 = X.AnonymousClass5Z0.A00
            X.5Z4 r4 = r0.A00
            java.lang.Object r2 = r3.A01
            X.0sL r2 = (X.0sL) r2
            r0 = 0
            X.AnonymousClass5ZZ.A0w(r1, r4, r2, r0)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x001e
            r0 = 431250349(0x19b45bad, float:1.8648591E-23)
        L_0x03cc:
            X.0fL.A00(r0)
            goto L_0x001e
        L_0x03d1:
            r1.Evl()
            goto L_0x001e
        L_0x03d6:
            com.instagram.common.gallery.model.GalleryItem r1 = (com.instagram.common.gallery.model.GalleryItem) r1
            android.graphics.Bitmap r2 = (android.graphics.Bitmap) r2
            r0 = 0
            X.0qQ.A0B(r1, r0)
            java.lang.Object r0 = r3.A01
            X.8hG r0 = (X.C362048hG) r0
            X.8hz r0 = r0.A0m
            r0.A01(r1, r2)
            goto L_0x001e
        L_0x03e9:
            X.7j2 r1 = (X.C339087j2) r1
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r7 = r2.booleanValue()
            r4 = 0
            X.0qQ.A0B(r1, r4)
            java.lang.Object r5 = r3.A01
            X.8hW r5 = (X.C362208hW) r5
            X.8XA r2 = r5.A0A
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsCreationDraftViewModel r0 = r2.A0e
            r0.A0C()
            X.7iz r6 = r1.A00
            X.7iz r0 = X.C339057iz.MUSIC
            if (r6 == r0) goto L_0x040d
            X.80U r1 = r2.A0Z
            X.8Uw r0 = X.C356698Uw.A00
            r1.E3H(r0)
        L_0x040d:
            int r0 = r6.ordinal()
            r3 = 46
            r8 = 0
            switch(r0) {
                case 0: goto L_0x06ec;
                case 1: goto L_0x086a;
                case 2: goto L_0x0867;
                case 3: goto L_0x0817;
                case 4: goto L_0x07d5;
                case 5: goto L_0x07aa;
                case 6: goto L_0x0627;
                case 7: goto L_0x061a;
                case 8: goto L_0x0591;
                case 9: goto L_0x0873;
                case 10: goto L_0x0871;
                case 11: goto L_0x0641;
                case 12: goto L_0x06ba;
                case 13: goto L_0x054b;
                case 14: goto L_0x060a;
                case 15: goto L_0x0777;
                case 16: goto L_0x0707;
                default: goto L_0x0417;
            }
        L_0x0417:
            X.0eM r1 = r2.A0l
            java.lang.Object r0 = r1.getValue()
            X.AbY r0 = (X.C40401AbY) r0
            X.0eM r0 = r0.A07
            java.lang.Object r0 = r0.getValue()
            X.89Z r0 = (X.AnonymousClass89Z) r0
            com.instagram.music.common.model.AudioOverlayTrack r0 = r0.A01()
            if (r0 == 0) goto L_0x04e8
            java.lang.Object r1 = r1.getValue()
            X.AbY r1 = (X.C40401AbY) r1
            com.instagram.music.common.model.AudioOverlayTrack r0 = r1.A01
            if (r0 == 0) goto L_0x043a
            X.C40401AbY.A00(r1, r0, r4)
        L_0x043a:
            com.instagram.common.session.UserSession r3 = r5.A05
            X.27r r0 = X.27p.A01(r3)
            X.29Z r6 = r0.A0F
            X.0wc r2 = r6.A01
            java.lang.String r1 = "ig_camera_ui_tool_click"
            X.0kJ r0 = r2.A00
            X.0Aj r2 = r2.A00(r0, r1)
            boolean r0 = r6.A0P()
            if (r0 == 0) goto L_0x04d0
            boolean r0 = r2.isSampled()
            if (r0 == 0) goto L_0x04d0
            X.80P r1 = X.AnonymousClass80P.SAVED_AUDIO_IN_CLIPS_GALLERY
            java.lang.String r0 = "tool_type"
            r2.A8M(r1, r0)
            X.283 r4 = r6.A04
            java.lang.String r1 = r4.A0L
            if (r1 != 0) goto L_0x0467
            java.lang.String r1 = ""
        L_0x0467:
            java.lang.String r0 = "camera_session_id"
            r2.AAJ(r0, r1)
            X.4yP r1 = r6.A0J()
            java.lang.String r0 = "camera_destination"
            r2.A8M(r1, r0)
            int r1 = r4.A01
            r0 = 2
            if (r1 == r0) goto L_0x047b
            r0 = 1
        L_0x047b:
            java.lang.String r1 = "camera_position"
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A8k(r1, r0)
            r0 = 0
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "capture_format_index"
            r2.A9F(r0, r1)
            X.8fP r1 = r6.A0I()
            java.lang.String r0 = "capture_type"
            r2.A8M(r1, r0)
            X.28D r1 = r4.A09
            java.lang.String r0 = "entry_point"
            r2.A8M(r1, r0)
            r0 = 2
            java.lang.String r1 = "event_type"
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A8k(r1, r0)
            X.28t r1 = r4.A0A
            java.lang.String r0 = "media_type"
            r2.A8M(r1, r0)
            X.0iw r0 = X.27x.A08
            java.lang.String r1 = r0.getModuleName()
            java.lang.String r0 = "module"
            r2.AAJ(r0, r1)
            X.JVj r1 = X.C59725JVj.PRE_CAPTURE
            java.lang.String r0 = "surface"
            r2.A8M(r1, r0)
            X.1QJ r0 = X.AnonymousClass1QI.A00
            X.1QM r0 = r0.A02
            java.lang.String r1 = r0.A00
            java.lang.String r0 = "nav_chain"
            r2.AAJ(r0, r1)
            r2.Cgf()
        L_0x04d0:
            X.1Av r0 = X.1Au.A00(r3)
            X.0xa r0 = r0.A01
            X.0xY r2 = r0.AR4()
            java.lang.String r1 = "clips_has_dismissed_destination_toolbar_saved_audio_gallery_new_badge"
            r0 = 1
            r2.E5T(r1, r0)
            r2.apply()
            r5.A03()
            goto L_0x001e
        L_0x04e8:
            X.4DH r0 = r2.A0B
            android.content.Context r1 = r0.requireContext()
            com.instagram.common.session.UserSession r0 = r2.A0F
            X.A6e r8 = new X.A6e
            r8.<init>(r1, r0)
            X.AeP r9 = new X.AeP
            r9.<init>(r8, r2)
            X.AgN r7 = new X.AgN
            r7.<init>(r2, r4)
            r6 = 1
            com.instagram.common.session.UserSession r1 = r8.A03
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            X.AnonymousClass0Dg.A00(r0, r1)
            X.K7X r3 = new X.K7X
            r3.<init>()
            r3.setArguments(r0)
            r3.A02 = r9
            X.7Pr r2 = new X.7Pr
            r2.<init>(r1)
            r2.A0k = r4
            r2.A0q = r4
            r0 = 1065353216(0x3f800000, float:1.0)
            r2.A03 = r0
            r2.A04 = r0
            r2.A0x = r4
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r6)
            r2.A0a = r0
            android.content.Context r1 = r8.A02
            r0 = 2131972594(0x7f1351f2, float:1.95822E38)
            java.lang.String r0 = r1.getString(r0)
            r2.A0d = r0
            r2.A1C = r4
            r2.A1O = r4
            r2.A0T = r3
            r2.A0U = r7
            r8.A01 = r2
            X.7Pu r0 = r2.A00()
            r8.A00 = r0
            r0.A03(r1, r3)
            goto L_0x043a
        L_0x054b:
            com.instagram.common.session.UserSession r7 = r2.A0F
            com.instagram.bloks.hosting.IgBloksScreenConfig r6 = new com.instagram.bloks.hosting.IgBloksScreenConfig
            r6.<init>((X.0lg) r7)
            java.lang.String r5 = "com.bloks.www.ig.ig_genai_prototypes.showcase"
            r6.A0R = r5
            java.lang.String r0 = "AI Demos [Internal]"
            r6.A0U = r0
            r1 = 21
            X.MMs r0 = new X.MMs
            r0.<init>(r2, r1)
            X.Q3B r4 = new X.Q3B
            r4.<init>(r0)
            java.lang.Class<com.instagram.modal.ModalActivity> r8 = com.instagram.modal.ModalActivity.class
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            java.lang.String r1 = "output_media"
            X.0eP r0 = new X.0eP
            r0.<init>(r1, r4)
            java.util.Map r0 = X.0se.A0M(r0)
            X.DiU r0 = X.C46649DiU.A06(r5, r3, r0)
            android.os.Bundle r6 = X.C49891FBs.A00(r6, r0)
            android.app.Activity r5 = r2.A08
            java.lang.String r9 = "bloks"
            X.6W8 r4 = new X.6W8
            r4.<init>(r5, r6, r7, r8, r9)
            r4.A07()
            r4.A0C(r5)
            goto L_0x001e
        L_0x0591:
            com.instagram.common.session.UserSession r0 = r2.A0F
            X.27r r0 = X.27p.A01(r0)
            X.29R r1 = r0.A09
            X.283 r4 = r1.A04
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r0 = r0.toString()
            r4.A0Q = r0
            X.0wc r0 = r1.A01
            X.1Ln r3 = X.1Ln.A08(r0)
            X.0Aj r0 = r3.A00
            boolean r0 = r0.isSampled()
            if (r0 == 0) goto L_0x05f8
            java.lang.String r0 = "IG_CAMERA_ENTITY_TAP"
            r3.A0t(r0)
            java.lang.String r0 = "THIRD_PARTY_MEDIA_GALLERY_ENTRY_POINT_TAP"
            r3.A0r(r0)
            X.29R.A00(r3, r1)
            X.4yP r0 = r1.A0J()
            r3.A0a(r0)
            X.28D r0 = r4.A09
            r3.A0b(r0)
            r3.A0T()
            X.JVj r0 = X.C59725JVj.GALLERY
            r3.A0d(r0)
            java.lang.String r0 = "giphy_clips_grid"
            r3.A0n(r0)
            X.28t r0 = X.28t.A06
            r3.A0c(r0)
            java.lang.String r1 = r4.A0Q
            java.lang.String r0 = "third_party_session_id"
            r3.A0R(r0, r1)
            java.lang.String r1 = r4.A0M
            java.lang.String r0 = "composition_str_id"
            r3.A0R(r0, r1)
            X.1QJ r0 = X.AnonymousClass1QI.A00
            X.1QM r0 = r0.A02
            java.lang.String r0 = r0.A00
            r3.A0u(r0)
            r3.Cgf()
        L_0x05f8:
            X.8RD r5 = r2.A0f
            com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider r7 = r2.A0I
            X.JVj r6 = X.C59725JVj.GALLERY
            r10 = 1
            r9 = r8
            r5.A00(r6, r7, r8, r9, r10)
            X.8Hx r0 = r2.A0a
            r0.DHT()
            goto L_0x001e
        L_0x060a:
            X.AnonymousClass8XA.A03(r2)
            com.instagram.common.session.UserSession r0 = r5.A05
            X.27r r1 = X.27p.A01(r0)
            X.8xY r0 = X.C371088xY.GALLERY_TOOLBAR
            r1.A1C(r0)
            goto L_0x001e
        L_0x061a:
            X.0eM r0 = r2.A0n
            java.lang.Object r0 = r0.getValue()
            X.LnR r0 = (X.C65104LnR) r0
            r0.A01()
            goto L_0x001e
        L_0x0627:
            com.instagram.common.session.UserSession r0 = r2.A0F
            X.27r r0 = X.27p.A01(r0)
            X.29H r1 = r0.A03
            java.lang.String r0 = "clips_gallery_destination_bar"
            r1.A07(r0)
            X.0eM r0 = r2.A0l
            java.lang.Object r0 = r0.getValue()
            X.AbY r0 = (X.C40401AbY) r0
            r0.A01()
            goto L_0x001e
        L_0x0641:
            com.instagram.common.session.UserSession r0 = r2.A0F
            X.27r r0 = X.27p.A01(r0)
            X.29Z r5 = r0.A0F
            X.0wc r3 = r5.A01
            java.lang.String r1 = "ig_camera_ui_tool_click"
            X.0kJ r0 = r3.A00
            X.0Aj r3 = r3.A00(r0, r1)
            boolean r0 = r3.isSampled()
            if (r0 == 0) goto L_0x06b5
            X.80P r1 = X.AnonymousClass80P.IMAGINE_BUNDLE_WITH_META_AI_INTENT
            java.lang.String r0 = "tool_type"
            r3.A8M(r1, r0)
            X.283 r4 = r5.A04
            java.lang.String r1 = r4.A0L
            if (r1 != 0) goto L_0x0668
            java.lang.String r1 = ""
        L_0x0668:
            java.lang.String r0 = "camera_session_id"
            r3.AAJ(r0, r1)
            r0 = 2
            java.lang.String r1 = "event_type"
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.A8k(r1, r0)
            X.28D r1 = r4.A09
            java.lang.String r0 = "entry_point"
            r3.A8M(r1, r0)
            X.0iw r0 = X.27x.A08
            java.lang.String r1 = r0.getModuleName()
            java.lang.String r0 = "module"
            r3.AAJ(r0, r1)
            X.JVj r1 = r4.A0C
            java.lang.String r0 = "surface"
            r3.A8M(r1, r0)
            X.4yP r1 = r5.A0J()
            java.lang.String r0 = "camera_destination"
            r3.A8M(r1, r0)
            java.lang.String r1 = r4.A0M
            java.lang.String r0 = "composition_str_id"
            r3.AAJ(r0, r1)
            X.28t r1 = r4.A0A
            java.lang.String r0 = "composition_media_type"
            r3.A8M(r1, r0)
            X.1QJ r0 = X.AnonymousClass1QI.A00
            X.1QM r0 = r0.A02
            java.lang.String r1 = r0.A00
            java.lang.String r0 = "nav_chain"
            r3.AAJ(r0, r1)
            r3.Cgf()
        L_0x06b5:
            X.AnonymousClass8XA.A06(r2, r8)
            goto L_0x001e
        L_0x06ba:
            com.instagram.common.session.UserSession r0 = r2.A0F
            com.instagram.bloks.hosting.IgBloksScreenConfig r5 = new com.instagram.bloks.hosting.IgBloksScreenConfig
            r5.<init>((X.0lg) r0)
            r0 = 58
            java.lang.String r0 = X.C66579MXk.A00(r0)
            r5.A0R = r0
            X.4DH r0 = r2.A0B
            android.content.Context r0 = r0.requireContext()
            X.A9R r4 = new X.A9R
            r4.<init>(r0)
            java.lang.String r3 = "ig_stories_gallery_destination_bar"
            java.util.Map r1 = r4.A02
            java.lang.String r0 = "entrypoint"
            r1.put(r0, r3)
            r1 = 42
            X.JJQ r0 = new X.JJQ
            r0.<init>(r2, r1)
            r4.A01(r0)
            r4.A00(r5)
            goto L_0x001e
        L_0x06ec:
            r0 = 1
            r2.A0N(r0)
            com.instagram.common.session.UserSession r0 = r2.A0F
            X.27r r3 = X.27p.A01(r0)
            X.8Yz r0 = r2.A0G
            X.80m r0 = r0.A08
            java.lang.Object r0 = r0.A00
            X.4yO r0 = (X.C279284yO) r0
            X.4yP r1 = r0.A00
            X.8xY r0 = X.C371088xY.GALLERY_DESTINATION_BAR
            r3.A10(r1, r0)
            goto L_0x001e
        L_0x0707:
            androidx.recyclerview.widget.RecyclerView r7 = r5.A00
            X.2Rw r1 = r7.A0A
            boolean r0 = r1 instanceof X.C339237jH
            if (r0 == 0) goto L_0x072f
            X.7jH r1 = (X.C339237jH) r1
            if (r1 == 0) goto L_0x072f
            X.7iz r6 = X.C339057iz.MEMORIES
            java.util.List r0 = r1.A00
            java.util.Iterator r3 = r0.iterator()
            r1 = 0
        L_0x071c:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x072f
            java.lang.Object r0 = r3.next()
            X.7j2 r0 = (X.C339087j2) r0
            X.7iz r0 = r0.A00
            if (r0 == r6) goto L_0x0730
            int r1 = r1 + 1
            goto L_0x071c
        L_0x072f:
            r1 = -1
        L_0x0730:
            X.3kE r1 = r7.A0W(r1)
            boolean r0 = r1 instanceof X.C339807kC
            if (r0 == 0) goto L_0x001e
            X.7kC r1 = (X.C339807kC) r1
            if (r1 == 0) goto L_0x001e
            X.Af3 r6 = new X.Af3
            r6.<init>(r1)
            com.instagram.creation.capture.quickcapture.gallery.gallerygrid.viewmodel.GalleryMemoriesViewModel r0 = r5.A0B
            X.0Ud r0 = r0.A06
            java.lang.Object r0 = r0.getValue()
            X.9IV r0 = (X.AnonymousClass9IV) r0
            java.lang.Object r0 = r0.A00
            X.8WV r0 = (X.AnonymousClass8WV) r0
            java.lang.Integer r0 = r0.A01
            r1 = 1
            X.0qQ.A0B(r0, r1)
            int r0 = r0.intValue()
            if (r0 == r4) goto L_0x076a
            if (r0 != r1) goto L_0x0c0a
            com.instagram.common.session.UserSession r4 = r2.A0F
            android.app.Activity r3 = r2.A08
            r1 = -1
            X.UwM r0 = X.C16517UwM.GRID
            X.JZV.A06(r3, r0, r4, r1)
            goto L_0x001e
        L_0x076a:
            com.instagram.common.session.UserSession r4 = r2.A0F
            android.app.Activity r3 = r2.A08
            X.4DH r1 = r2.A0B
            X.0iw r0 = r2.A0E
            X.A0Y.A00(r3, r1, r0, r4, r6)
            goto L_0x001e
        L_0x0777:
            X.8Yz r0 = r5.A06
            X.80m r0 = r0.A08
            java.lang.Object r1 = r0.A00
            X.4yO r1 = (X.C279284yO) r1
            boolean r0 = r1 instanceof X.AnonymousClass9QA
            if (r0 == 0) goto L_0x07a0
            if (r7 == 0) goto L_0x079b
            com.instagram.common.session.UserSession r0 = r5.A05
            X.1Av r5 = X.1Au.A00(r0)
            r4 = 1
            X.0s0 r3 = r5.A1q
            X.0YZ[] r1 = X.1Av.A8a
            r0 = 514(0x202, float:7.2E-43)
            r1 = r1[r0]
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            r3.Epx(r5, r0, r1)
        L_0x079b:
            r2.A0B()
            goto L_0x001e
        L_0x07a0:
            java.lang.String r4 = "GalleryGridDestinationBarController"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = "Gallery Destination Item - Cannot open Music Selector for unrecognized camera destination: "
            goto L_0x080e
        L_0x07aa:
            X.EZl r5 = X.C48143EZl.ACR_BROWSER_ENTRY_POINT_DESTINATION_PICKER
            com.instagram.common.session.UserSession r7 = r2.A0F
            X.27r r3 = X.27p.A01(r7)
            X.283 r0 = r3.A04
            X.JVj r1 = r0.A0C
            java.lang.String r0 = "ACR_BROWSER_GALLERY_ENTRYPOINT"
            r3.A1Q(r1, r0)
            X.4DH r0 = r2.A0B
            androidx.fragment.app.FragmentActivity r3 = r0.requireActivity()
            android.content.Context r4 = r0.requireContext()
            X.81e r0 = r2.A0P
            X.80R r0 = r0.A00
            X.28D r6 = r0.A01
            X.2jA r8 = new X.2jA
            r8.<init>()
            X.C63142KsA.A00(r3, r4, r5, r6, r7, r8)
            goto L_0x001e
        L_0x07d5:
            X.8Yz r0 = r5.A06
            X.80m r0 = r0.A08
            java.lang.Object r1 = r0.A00
            X.4yO r1 = (X.C279284yO) r1
            boolean r0 = r1 instanceof X.AnonymousClass80O
            if (r0 == 0) goto L_0x07fc
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>()
            X.293 r1 = X.293.A04
            java.lang.String r0 = "entry_point"
            r4.putSerializable(r0, r1)
            com.instagram.common.session.UserSession r3 = r2.A0F
            X.4DH r0 = r2.A0B
            android.content.Context r1 = r0.requireContext()
            android.app.Activity r0 = r2.A08
            X.C55253Hei.A00(r0, r1, r4, r3)
            goto L_0x001e
        L_0x07fc:
            boolean r0 = r1 instanceof X.AnonymousClass9QA
            if (r0 == 0) goto L_0x0805
            r2.A0C()
            goto L_0x001e
        L_0x0805:
            java.lang.String r4 = "GalleryGridDestinationBarController"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = "Gallery Destination Item - Cannot open templates browser for unrecognized camera destination: "
        L_0x080e:
            r2.append(r0)
            java.lang.String r0 = r1.A02
            r2.append(r0)
            goto L_0x085b
        L_0x0817:
            X.8Yz r0 = r5.A06
            X.80m r0 = r0.A08
            java.lang.Object r1 = r0.A00
            boolean r0 = r1 instanceof X.AnonymousClass80O
            if (r0 == 0) goto L_0x0828
            X.8Hx r0 = r2.A0a
            r0.DHR()
            goto L_0x001e
        L_0x0828:
            boolean r0 = r1 instanceof X.AnonymousClass9QA
            if (r0 == 0) goto L_0x084c
            X.4DH r0 = r2.A0B
            X.2YN r1 = new X.2YN
            r1.<init>(r0)
            java.lang.Class<X.8Vz> r0 = X.C356988Vz.class
            X.2YL r0 = r1.A00(r0)
            X.8Vz r0 = (X.C356988Vz) r0
            X.K6C r2 = new X.K6C
            r2.<init>()
            X.2Fj r1 = r0.A01
            X.88W r0 = new X.88W
            r0.<init>(r2)
            r1.A0B(r0)
            goto L_0x001e
        L_0x084c:
            java.lang.String r4 = "GalleryGridDestinationBarController"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = "Gallery Destination Item - Drafts cannot be created for unrecognized media type: "
            r2.append(r0)
            r2.append(r6)
        L_0x085b:
            r2.append(r3)
            java.lang.String r0 = r2.toString()
            X.0kD.A07(r4, r0, r8)
            goto L_0x001e
        L_0x0867:
            X.8aL r0 = X.C358088aL.A0T
            goto L_0x086c
        L_0x086a:
            X.8aL r0 = X.C358088aL.A0C
        L_0x086c:
            r2.A0G(r0)
            goto L_0x001e
        L_0x0871:
            r3 = -3
            goto L_0x0874
        L_0x0873:
            r3 = -2
        L_0x0874:
            X.0eM r0 = r5.A0D
            java.lang.Object r0 = r0.getValue()
            X.8iK r0 = (X.C362688iK) r0
            java.util.List r0 = r0.getFolders()
            java.util.Iterator r2 = r0.iterator()
        L_0x0884:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x08b8
            java.lang.Object r1 = r2.next()
            r0 = r1
            com.instagram.ui.widget.mediapicker.Folder r0 = (com.instagram.ui.widget.mediapicker.Folder) r0
            int r0 = r0.A02
            if (r0 != r3) goto L_0x0884
        L_0x0895:
            com.instagram.ui.widget.mediapicker.Folder r1 = (com.instagram.ui.widget.mediapicker.Folder) r1
            X.8ZY r2 = r5.A07
            if (r1 != 0) goto L_0x08af
            android.content.Context r1 = r5.A04
            switch(r3) {
                case -3: goto L_0x08b4;
                default: goto L_0x08a0;
            }
        L_0x08a0:
            r0 = 2131962527(0x7f132a9f, float:1.9561782E38)
        L_0x08a3:
            java.lang.String r0 = r1.getString(r0)
            X.0qQ.A07(r0)
            com.instagram.ui.widget.mediapicker.Folder r1 = new com.instagram.ui.widget.mediapicker.Folder
            r1.<init>(r0, r8, r3, r4)
        L_0x08af:
            r2.DSA(r1)
            goto L_0x001e
        L_0x08b4:
            r0 = 2131962529(0x7f132aa1, float:1.9561786E38)
            goto L_0x08a3
        L_0x08b8:
            r1 = 0
            goto L_0x0895
        L_0x08ba:
            java.lang.Number r1 = (java.lang.Number) r1
            int r4 = r1.intValue()
            java.lang.Number r2 = (java.lang.Number) r2
            int r1 = r2.intValue()
            java.lang.Object r0 = r3.A01
            X.7H6 r0 = (X.AnonymousClass7H6) r0
            r0.A04 = r4
            r0.A02 = r1
            goto L_0x001e
        L_0x08d0:
            java.lang.Number r1 = (java.lang.Number) r1
            int r5 = r1.intValue()
            java.lang.Number r2 = (java.lang.Number) r2
            int r4 = r2.intValue()
            java.lang.Object r2 = r3.A01
            X.7H6 r2 = (X.AnonymousClass7H6) r2
            android.view.ViewGroup r1 = r2.A08
            if (r1 == 0) goto L_0x001e
            X.PcI r0 = new X.PcI
            r0.<init>(r1, r2, r5, r4)
            X.0nA.A0r(r1, r0)
            goto L_0x001e
        L_0x08ee:
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r4 = r1.booleanValue()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r1 = r2.booleanValue()
            java.lang.Object r0 = r3.A01
            X.7Tw r0 = (X.C332157Tw) r0
            X.0eM r0 = r0.A0Q
            java.lang.Object r0 = r0.getValue()
            X.7Ue r0 = (X.C332237Ue) r0
            X.0eM r0 = r0.A0j
            java.lang.Object r0 = r0.getValue()
            X.7Vj r0 = (X.C332527Vj) r0
            r0.A02(r4, r1)
            goto L_0x001e
        L_0x0913:
            X.4AT r1 = (X.AnonymousClass4AT) r1
            java.lang.Number r2 = (java.lang.Number) r2
            long r9 = r2.longValue()
            r0 = 0
            X.0qQ.A0B(r1, r0)
            java.lang.Object r0 = r3.A01
            X.4AG r0 = (X.AnonymousClass4AG) r0
            com.instagram.common.session.UserSession r0 = r0.A01
            X.60k r6 = X.C3018660j.A01(r0)
            java.util.Map r2 = r6.A03
            java.lang.Object r0 = r2.get(r1)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x096c
            long r7 = r0.longValue()
        L_0x0937:
            long r7 = r7 + r9
            java.lang.Long r0 = java.lang.Long.valueOf(r7)
            r2.put(r1, r0)
            java.util.HashSet r0 = r6.A0A
            java.lang.String r5 = r1.A0A
            boolean r0 = r0.contains(r5)
            if (r0 != 0) goto L_0x001e
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.SECONDS
            com.instagram.common.session.UserSession r3 = r6.A06
            X.0Tu r2 = X.0Tu.A05
            r0 = 37166980532404669(0x840b2c000201bd, double:3.56788637588626E-306)
            double r2 = X.182.A00(r2, r3, r0)
            long r0 = (long) r2
            long r1 = r4.toMillis(r0)
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x001e
            java.lang.Long r1 = java.lang.Long.valueOf(r9)
            java.util.HashMap r0 = r6.A09
            r0.put(r5, r1)
            goto L_0x001e
        L_0x096c:
            r7 = 0
            goto L_0x0937
        L_0x096f:
            android.app.Activity r1 = (android.app.Activity) r1
            X.5Gr r2 = (X.C283245Gr) r2
            r0 = 0
            X.0qQ.A0B(r1, r0)
            r0 = 1
            X.0qQ.A0B(r2, r0)
            java.lang.Object r5 = r3.A01
            X.3Yc r5 = (X.C243273Yc) r5
            com.instagram.common.session.UserSession r0 = r5.A00
            X.3gF r0 = X.C247323g9.A00(r0)
            X.3gC r0 = r0.A06
            X.0eM r0 = r0.A07
            java.lang.Object r0 = r0.getValue()
            X.1Av r0 = (X.1Av) r0
            X.0xa r4 = r0.A01
            java.lang.String r3 = "content_note_recycle_ufi_tooltip_shown"
            r0 = 0
            boolean r0 = r4.getBoolean(r3, r0)
            if (r0 != 0) goto L_0x001e
            android.view.View r4 = r2.Acv()
            X.ApY r3 = new X.ApY
            r3.<init>(r1, r5, r2)
            goto L_0x09d9
        L_0x09a4:
            android.app.Activity r1 = (android.app.Activity) r1
            X.5Gr r2 = (X.C283245Gr) r2
            java.lang.Object r5 = r3.A01
            X.3Yc r5 = (X.C243273Yc) r5
            com.instagram.common.session.UserSession r0 = r5.A00
            X.1Av r6 = X.1Au.A00(r0)
            X.0xa r4 = r6.A01
            java.lang.String r3 = "carousel_scrubbing_tooltip_shown"
            r0 = 0
            boolean r0 = r4.getBoolean(r3, r0)
            if (r0 != 0) goto L_0x001e
            X.2ib r0 = r5.A02
            com.instagram.common.session.UserSession r5 = r0.A00
            X.0Tu r0 = X.0Tu.A05
            r3 = 36328302269054167(0x811066000a3cd7, double:3.0375028650571E-306)
            boolean r0 = X.182.A06(r0, r5, r3)
            if (r0 == 0) goto L_0x001e
            if (r2 == 0) goto L_0x001e
            android.view.View r4 = r2.Acv()
            X.ApZ r3 = new X.ApZ
            r3.<init>(r1, r2, r6)
        L_0x09d9:
            r0 = 500(0x1f4, double:2.47E-321)
            r4.postDelayed(r3, r0)
            goto L_0x001e
        L_0x09e0:
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r4 = r2.booleanValue()
            r0 = 0
            X.0qQ.A0B(r1, r0)
            java.lang.Object r0 = r3.A01
            com.instagram.feed.tifu.TifuViewModel r0 = (com.instagram.feed.tifu.TifuViewModel) r0
            X.5vC r2 = r0.A08
            X.0Ud r0 = r0.A0G
            java.lang.Object r0 = r0.getValue()
            X.5vX r0 = (X.AnonymousClass5vX) r0
            X.62P r0 = r0.A06
            r2.A00(r1, r0, r4)
            goto L_0x001e
        L_0x0a01:
            r0 = 0
            X.0qQ.A0B(r1, r0)
            java.lang.Object r0 = r3.A01
            X.5vY r0 = (X.AnonymousClass5vY) r0
            X.0sL r0 = r0.A01
            if (r0 != 0) goto L_0x0a1f
            java.lang.String r0 = "onHideOrUnhidePost"
        L_0x0a0f:
            X.0qQ.A0F(r0)
        L_0x0a12:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0a17:
            r0 = 0
            X.0qQ.A0B(r1, r0)
            java.lang.Object r0 = r3.A01
            X.0sL r0 = (X.0sL) r0
        L_0x0a1f:
            r0.invoke(r1, r2)
            goto L_0x001e
        L_0x0a24:
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r0 = 1
            X.0qQ.A0B(r2, r0)
            java.lang.Object r0 = r3.A01
            X.339 r0 = (X.AnonymousClass339) r0
            r0.EXc(r1, r2)
            goto L_0x001e
        L_0x0a39:
            com.instagram.common.typedurl.SimpleImageUrl r1 = (com.instagram.common.typedurl.SimpleImageUrl) r1
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            r0 = 0
            X.0qQ.A0B(r1, r0)
            java.lang.Object r0 = r3.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            com.instagram.friendmap.data.FriendMapRepository r0 = X.AnonymousClass4A3.A00(r0)
            r0.A01 = r1
            r0.A04 = r2
            goto L_0x001e
        L_0x0a53:
            r0 = 0
            X.0qQ.A0B(r1, r0)
            r0 = 1
            X.0qQ.A0B(r2, r0)
            java.lang.Object r0 = r3.A01
            com.google.common.collect.ImmutableMap$Builder r0 = (com.google.common.collect.ImmutableMap.Builder) r0
            r0.put(r1, r2)
            goto L_0x001e
        L_0x0a64:
            android.view.View r1 = (android.view.View) r1
            X.4Gh r2 = (X.C262864Gh) r2
            r0 = 0
            X.0qQ.A0B(r1, r0)
            r0 = 1
            X.0qQ.A0B(r2, r0)
            java.lang.Object r0 = r3.A01
            X.1Xj r0 = (X.1Xj) r0
            r2.EBm(r1, r0)
            goto L_0x001e
        L_0x0a79:
            java.lang.Number r1 = (java.lang.Number) r1
            float r5 = r1.floatValue()
            java.lang.Number r2 = (java.lang.Number) r2
            float r6 = r2.floatValue()
            java.lang.Object r3 = r3.A01
            X.4cD r3 = (X.C267794cD) r3
            X.4Cq r1 = r3.A05()
            r4 = 0
            r7 = 0
            X.Ila r2 = new X.Ila
            r2.<init>(r3, r4, r5, r6, r7)
            X.19B r0 = X.19B.A00
            X.1Eo.A05(r0, r2, r1)
            r0 = 1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L_0x0a9f:
            java.lang.Number r1 = (java.lang.Number) r1
            int r4 = r1.intValue()
            X.5Q8 r2 = (X.AnonymousClass5Q8) r2
            java.lang.Object r1 = r3.A01
            X.5Zr r1 = (X.C287265Zr) r1
            r0 = 0
            int r0 = r1.AB2(r2, r0, r4)
            goto L_0x0bec
        L_0x0ab2:
            java.lang.Number r1 = (java.lang.Number) r1
            int r2 = r1.intValue()
            java.lang.Object r1 = r3.A01
            X.5Zp r1 = (X.C287245Zp) r1
            r0 = 0
            int r0 = r1.AAy(r0, r2)
            goto L_0x0bec
        L_0x0ac3:
            X.6HK r1 = (X.AnonymousClass6HK) r1
            java.lang.Object r0 = r3.A01
            X.0sL r0 = (X.0sL) r0
            java.lang.Object r5 = r0.invoke(r1, r2)
            java.util.List r5 = (java.util.List) r5
            int r4 = r5.size()
            r3 = 0
        L_0x0ad4:
            if (r3 >= r4) goto L_0x0af4
            java.lang.Object r2 = r5.get(r3)
            if (r2 == 0) goto L_0x0af1
            r0 = r1
            X.6HJ r0 = (X.AnonymousClass6HJ) r0
            X.5Y2 r0 = r0.A01
            if (r0 == 0) goto L_0x0af1
            boolean r0 = r0.AFI(r2)
            if (r0 != 0) goto L_0x0af1
            java.lang.String r1 = "item can't be saved"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x0af1:
            int r3 = r3 + 1
            goto L_0x0ad4
        L_0x0af4:
            boolean r0 = r5.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0b02
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r5)
            return r0
        L_0x0b02:
            r0 = 0
            return r0
        L_0x0b04:
            androidx.compose.ui.Modifier r1 = (androidx.compose.ui.Modifier) r1
            X.5QQ r2 = (X.AnonymousClass5QQ) r2
            boolean r0 = r2 instanceof X.C287465aB
            if (r0 == 0) goto L_0x0b2e
            X.5aB r2 = (X.C287465aB) r2
            X.0sK r5 = r2.A00
            java.lang.String r0 = "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function3<androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, kotlin.Int, androidx.compose.ui.Modifier>"
            X.0qQ.A0C(r5, r0)
            r0 = 3
            X.0u4.A05(r5, r0)
            X.5Qk r4 = androidx.compose.ui.Modifier.A00
            java.lang.Object r2 = r3.A01
            X.5Wy r2 = (X.C286575Wy) r2
            r0 = 0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object r0 = r5.invoke(r4, r2, r0)
            androidx.compose.ui.Modifier r0 = (androidx.compose.ui.Modifier) r0
            androidx.compose.ui.Modifier r2 = X.C287435a8.A00(r2, r0)
        L_0x0b2e:
            androidx.compose.ui.Modifier r0 = r1.Ezh(r2)
            return r0
        L_0x0b33:
            X.A9g r1 = (X.C39786A9g) r1
            X.A9g r2 = (X.C39786A9g) r2
            java.lang.Object r0 = r3.A01
            X.8A0 r0 = (X.AnonymousClass8A0) r0
            com.instagram.common.session.UserSession r0 = r0.A01
            int r3 = r1.A00(r0)
            int r0 = r2.A00(r0)
            if (r3 != r0) goto L_0x0b4f
            int r3 = r1.hashCode()
            int r0 = r2.hashCode()
        L_0x0b4f:
            int r3 = r3 - r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            return r0
        L_0x0b55:
            java.lang.String r1 = (java.lang.String) r1
            r0 = 0
            X.0qQ.A0B(r1, r0)
            java.lang.Object r0 = r3.A01
            X.43f r0 = (X.C2598243f) r0
            X.2Dm r0 = r0.A04
            X.3U9 r0 = r0.C60(r1)
            return r0
        L_0x0b66:
            android.content.Context r1 = (android.content.Context) r1
            java.lang.Number r2 = (java.lang.Number) r2
            int r4 = r2.intValue()
            r0 = 0
            X.0qQ.A0B(r1, r0)
            r0 = 2131099701(0x7f060035, float:1.7811763E38)
            int r2 = r1.getColor(r0)
            java.lang.Object r1 = r3.A01
            X.1Xj r1 = (X.1Xj) r1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            int r0 = X.C258443z1.A00(r1, r0, r2)
            goto L_0x0bec
        L_0x0b86:
            X.1Xj r1 = (X.1Xj) r1
            X.3W1 r2 = (X.AnonymousClass3W1) r2
            r0 = 0
            X.0qQ.A0B(r1, r0)
            r0 = 1
            X.0qQ.A0B(r2, r0)
            java.lang.Object r3 = r3.A01
            X.2s3 r3 = (X.AnonymousClass2s3) r3
            X.0eM r0 = r3.A0L
            java.lang.Object r5 = r0.getValue()
            X.33W r5 = (X.AnonymousClass33W) r5
            java.lang.String r4 = r3.A0J
            java.lang.String r3 = r3.A0K
            com.instagram.common.typedurl.SimpleImageUrl r0 = new com.instagram.common.typedurl.SimpleImageUrl
            r0.<init>(r3)
            X.3YB r0 = r5.A02(r0, r1, r2, r4)
            return r0
        L_0x0bac:
            X.1Xj r1 = (X.1Xj) r1
            X.3W1 r2 = (X.AnonymousClass3W1) r2
            r0 = 0
            X.0qQ.A0B(r1, r0)
            r0 = 1
            X.0qQ.A0B(r2, r0)
            java.lang.Object r3 = r3.A01
            X.2ry r3 = (X.C231622ry) r3
            boolean r0 = r3.A0F
            X.3YB r0 = X.C231622ry.A00(r3, r1, r2, r0)
            return r0
        L_0x0bc3:
            android.view.View r1 = (android.view.View) r1
            X.3Aq r2 = (X.C238123Aq) r2
            r0 = 0
            X.0qQ.A0B(r1, r0)
            r0 = 1
            X.0qQ.A0B(r2, r0)
            java.lang.Object r0 = r3.A01
            X.339 r0 = (X.AnonymousClass339) r0
            int r0 = r0.APq(r1, r2)
            goto L_0x0bec
        L_0x0bd8:
            java.lang.Number r1 = (java.lang.Number) r1
            int r4 = r1.intValue()
            java.lang.Number r2 = (java.lang.Number) r2
            int r1 = r2.intValue()
            java.lang.Object r0 = r3.A01
            X.339 r0 = (X.AnonymousClass339) r0
            int r0 = r0.AEx(r4, r1)
        L_0x0bec:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
        L_0x0bf1:
            android.view.View r1 = (android.view.View) r1
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            r0 = 0
            X.0qQ.A0B(r1, r0)
            java.lang.Object r0 = r3.A01
            X.339 r0 = (X.AnonymousClass339) r0
            boolean r0 = r0.Evt(r1, r2)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L_0x0c0a:
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9LZ.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
