package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.2wf  reason: invalid class name and case insensitive filesystem */
public final class C233902wf {
    public 1Xg A00;
    public final 0wc A01;
    public final UserSession A02;
    public final AnonymousClass4DU A03;
    public final AnonymousClass2rI A04;
    public final C228302lG A05;
    public final C227802jw A06;
    public final C228462li A07;
    public final C233912wg A08;
    public final AnonymousClass2lU A09;
    public final AnonymousClass2v8 A0A;
    public final C233312vV A0B;
    public final C229732nw A0C;
    public final AnonymousClass2lH A0D;
    public final C249763kK A0E;

    public C233902wf(UserSession userSession, AnonymousClass4DU r4, AnonymousClass2lU r5, AnonymousClass2v8 r6, C233312vV r7, AnonymousClass2rI r8, C229732nw r9, C228302lG r10, AnonymousClass2lH r11, C249763kK r12, C227802jw r13, C228462li r14) {
        this.A06 = r13;
        this.A04 = r8;
        this.A02 = userSession;
        this.A03 = r4;
        this.A05 = r10;
        this.A07 = r14;
        this.A0A = r6;
        this.A0D = r11;
        this.A0C = r9;
        this.A09 = r5;
        this.A0B = r7;
        this.A0E = r12;
        this.A08 = new C233912wg(userSession);
        AnonymousClass0kM r1 = new AnonymousClass0kM(userSession);
        r1.A01 = "feed_timeline";
        this.A01 = r1.A00();
    }

    /* JADX WARNING: type inference failed for: r9v19, types: [X.ISg, java.lang.Object, X.1Xn] */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x0d45: MOVE  (r5v103 X.3PG) = (r58v0 X.3PG)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:122)
        	at jadx.core.dex.visitors.regions.TernaryMod.visitRegion(TernaryMod.java:34)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:73)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:31)
        */
    /* JADX WARNING: Removed duplicated region for block: B:665:0x0e32  */
    /* JADX WARNING: Removed duplicated region for block: B:675:0x0e93  */
    public final boolean A00(X.C45417Cvx r60, X.AnonymousClass3UH r61, X.C67251sV r62, X.1FS r63, X.AnonymousClass3PG r64, X.C270374gd r65, java.lang.Boolean r66, java.lang.Boolean r67, java.lang.Integer r68, java.lang.Integer r69, java.lang.String r70, java.lang.String r71, java.lang.String r72, java.util.List r73, long r74, boolean r76, boolean r77) {
        /*
            r59 = this;
            r23 = r68
            r20 = r62
            r3 = 0
            r14 = 1
            r26 = 3
            r58 = r64
            r1 = r26
            r0 = r58
            X.0qQ.A0B(r0, r1)
            r17 = 0
            java.lang.String r0 = "This operation must be run on UI thread."
            X.11Z.A06(r0)
            r1 = r59
            if (r62 != 0) goto L_0x0049
            com.instagram.common.session.UserSession r2 = r1.A02
            X.0Tu r0 = X.0Tu.A05
            r4 = 36311852544164645(0x81017000080325, double:3.027099992799241E-306)
            boolean r4 = X.182.A06(r0, r2, r4)
            if (r4 != 0) goto L_0x0047
            r4 = 36330879248843584(0x8112be00014340, double:3.0391325574525923E-306)
            boolean r4 = X.182.A06(r0, r2, r4)
            if (r4 != 0) goto L_0x0047
            boolean r4 = X.C233832wY.A01(r2)
            if (r4 == 0) goto L_0x0049
            r4 = 36319772464258683(0x8108a4000e1e7b, double:3.032108582157669E-306)
            boolean r0 = X.182.A06(r0, r2, r4)
            if (r0 == 0) goto L_0x0049
        L_0x0047:
            X.1sV r20 = X.C67251sV.A03
        L_0x0049:
            X.2nw r2 = r1.A0C
            r55 = r63
            r0 = r55
            java.lang.String r0 = r0.A0C
            r22 = r0
            r2.A00 = r0
            X.2v8 r4 = r1.A0A
            if (r4 == 0) goto L_0x005d
            r18 = 1
            if (r20 != 0) goto L_0x005f
        L_0x005d:
            r18 = 0
        L_0x005f:
            X.2rI r0 = r1.A04
            r54 = r0
            java.util.List r8 = r54.A07()
            int r0 = r8.size()
        L_0x006b:
            int r0 = r0 + -1
            if (r0 < 0) goto L_0x007c
            java.lang.Object r2 = r8.get(r0)
            X.1Xg r2 = (X.1Xg) r2
            boolean r2 = X.AnonymousClass3VP.A01(r2)
            if (r2 != 0) goto L_0x007c
            goto L_0x006b
        L_0x007c:
            r9 = 0
            boolean r2 = r8.isEmpty()
            r2 = r2 ^ 1
            if (r2 == 0) goto L_0x008d
            if (r0 < 0) goto L_0x008d
            java.lang.Object r9 = r8.get(r0)
            X.1Xg r9 = (X.1Xg) r9
        L_0x008d:
            r7 = 0
            r57 = r73
            int r10 = r57.size()
        L_0x0094:
            if (r7 >= r10) goto L_0x0129
            r2 = r57
            java.lang.Object r6 = r2.get(r7)
            X.1Xg r6 = (X.1Xg) r6
            int r11 = r8.size()
            int r11 = r11 + r7
            boolean r2 = X.AnonymousClass3VP.A01(r6)
            if (r2 == 0) goto L_0x010a
            if (r9 == 0) goto L_0x0108
            int r0 = r11 - r0
            int r5 = r0 + -1
            X.1Xn r0 = r6.A05
            X.1Xj r2 = X.1Xi.A02(r0)
            boolean r0 = X.AnonymousClass3VP.A00(r6)
            if (r0 == 0) goto L_0x00c9
            if (r2 == 0) goto L_0x00c9
            boolean r0 = X.AnonymousClass3VP.A00(r9)
            if (r0 == 0) goto L_0x011c
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            r2.A0K = r0
        L_0x00c9:
            boolean r0 = X.AnonymousClass3VP.A00(r6)
            if (r0 == 0) goto L_0x010d
            boolean r0 = X.AnonymousClass3VP.A00(r9)
            if (r0 == 0) goto L_0x010d
            r0 = 2
            if (r5 >= r0) goto L_0x010d
        L_0x00d8:
            X.3VL r9 = X.AnonymousClass3VL.FEED
            java.lang.Integer r2 = X.AnonymousClass05K.A0C
            X.Hqz r0 = new X.Hqz
            r0.<init>(r9, r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r5)
            r0.A03 = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r11)
            r0.A02 = r2
            X.1Xn r2 = r6.A05
            X.1Xj r2 = X.1Xi.A02(r2)
            if (r2 == 0) goto L_0x00fb
            java.lang.String r2 = r2.getId()
            r0.A04 = r2
        L_0x00fb:
            com.instagram.common.session.UserSession r2 = r1.A02
            X.3VK r2 = X.AnonymousClass3VI.A00(r2)
            X.GXs r0 = r0.A00()
            r2.A07(r0)
        L_0x0108:
            r9 = r6
            r0 = r11
        L_0x010a:
            int r7 = r7 + 1
            goto L_0x0094
        L_0x010d:
            boolean r0 = X.AnonymousClass3VP.A00(r6)
            if (r0 == 0) goto L_0x0108
            boolean r0 = X.AnonymousClass3VP.A03(r9)
            if (r0 == 0) goto L_0x0108
            if (r5 != 0) goto L_0x0108
            goto L_0x00d8
        L_0x011c:
            boolean r0 = X.AnonymousClass3VP.A03(r9)
            if (r0 == 0) goto L_0x00c9
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            r2.A0L = r0
            goto L_0x00c9
        L_0x0129:
            r24 = r17
            java.util.ArrayList r15 = new java.util.ArrayList
            r0 = r57
            r15.<init>(r0)
            java.util.List r25 = r54.A07()
            X.2jw r0 = r1.A06
            r56 = r0
            com.instagram.common.session.UserSession r0 = r1.A02
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r6 = r15.iterator()
        L_0x0145:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L_0x015d
            java.lang.Object r2 = r6.next()
            X.1Xg r2 = (X.1Xg) r2
            X.1Xn r2 = r2.A05
            X.1Xj r2 = X.1Xi.A02(r2)
            if (r2 == 0) goto L_0x0145
            r5.add(r2)
            goto L_0x0145
        L_0x015d:
            java.util.Iterator r6 = r5.iterator()
        L_0x0161:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L_0x0173
            java.lang.Object r5 = r6.next()
            X.1Xj r5 = (X.1Xj) r5
            r2 = r58
            r5.A48(r2)
            goto L_0x0161
        L_0x0173:
            java.util.Iterator r6 = r15.iterator()
        L_0x0177:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L_0x0196
            java.lang.Object r5 = r6.next()
            X.1Xg r5 = (X.1Xg) r5
            X.1Xn r2 = r5.A05
            X.1Xj r2 = X.1Xi.A02(r2)
            if (r2 == 0) goto L_0x0177
            boolean r5 = X.AnonymousClass3VP.A01(r5)
            if (r5 == 0) goto L_0x0177
            r5 = r72
            r2.A0N = r5
            goto L_0x0177
        L_0x0196:
            r2 = r55
            X.1FI r2 = r2.A04
            r36 = r2
            java.util.Iterator r6 = r15.iterator()
        L_0x01a0:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L_0x01ba
            java.lang.Object r2 = r6.next()
            X.1Xg r2 = (X.1Xg) r2
            X.1Xn r2 = r2.A05
            X.1Xj r5 = X.1Xi.A02(r2)
            if (r5 == 0) goto L_0x01a0
            r2 = r36
            r5.A47(r2)
            goto L_0x01a0
        L_0x01ba:
            java.util.Iterator r6 = r15.iterator()
        L_0x01be:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L_0x01dc
            java.lang.Object r2 = r6.next()
            X.1Xg r2 = (X.1Xg) r2
            X.1Xn r2 = r2.A05
            X.1Xj r2 = X.1Xi.A02(r2)
            if (r2 == 0) goto L_0x01be
            X.1Xy r5 = r2.A0C
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r3)
            r5.Eqv(r2)
            goto L_0x01be
        L_0x01dc:
            int r52 = r54.B5I()
            if (r52 == 0) goto L_0x06f7
            r2 = r54
            X.1Xg r21 = r2.A03(r3)
        L_0x01e8:
            if (r66 == 0) goto L_0x01f5
            X.3VT r2 = X.AnonymousClass3VS.A00(r0)
            boolean r5 = r66.booleanValue()
            r2.A00(r5)
        L_0x01f5:
            android.content.Context r2 = r56.getContext()
            if (r2 == 0) goto L_0x0238
            android.content.Context r5 = r56.getContext()
            if (r5 == 0) goto L_0x06f4
            java.lang.String r2 = "accessibility"
            java.lang.Object r5 = r5.getSystemService(r2)
        L_0x0207:
            java.lang.String r2 = "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager"
            X.0qQ.A0C(r5, r2)
            android.view.accessibility.AccessibilityManager r5 = (android.view.accessibility.AccessibilityManager) r5
            boolean r6 = r5.isEnabled()
            boolean r2 = r5.isTouchExplorationEnabled()
            if (r6 == 0) goto L_0x0238
            if (r2 == 0) goto L_0x0238
            r2 = r56
            boolean r2 = r2.A0R
            if (r2 == 0) goto L_0x0238
            r2 = r56
            com.instagram.ui.listview.StickyHeaderListView r6 = r2.A0D
            if (r6 == 0) goto L_0x0238
            android.content.Context r2 = r56.requireContext()
            android.content.res.Resources r5 = r2.getResources()
            r2 = 2131962356(0x7f1329f4, float:1.9561435E38)
            java.lang.String r2 = r5.getString(r2)
            r6.announceForAccessibility(r2)
        L_0x0238:
            r16 = r76
            r19 = r76 ^ 1
            if (r76 == 0) goto L_0x06e7
            r2 = r55
            java.lang.String r13 = r2.A0A
            r2 = r56
            r2.A0R(r13)
            X.2vV r2 = r1.A0B
            if (r2 == 0) goto L_0x024d
            r2.A02 = r3
        L_0x024d:
            X.1FI r6 = X.1FI.A06
            r2 = r36
            if (r2 != r6) goto L_0x0265
            int r5 = r58.ordinal()
            if (r5 == r14) goto L_0x06e1
            r2 = 2
            if (r5 == r2) goto L_0x06db
            if (r5 != r3) goto L_0x0265
            X.2lG r5 = r1.A05
            java.lang.String r2 = "NETWORK_RESPONSE_LOADED"
        L_0x0262:
            r5.A00(r2)
        L_0x0265:
            boolean r2 = r55.A01()
            if (r2 == 0) goto L_0x0283
            r2 = r56
            android.view.View r2 = r2.mView
            if (r2 == 0) goto L_0x0283
            X.3Ar r2 = r56.getScrollingViewProxy()
            android.view.ViewGroup r5 = r2.CEd()
            if (r5 == 0) goto L_0x0283
            X.GVP r2 = new X.GVP
            r2.<init>(r1)
            r5.post(r2)
        L_0x0283:
            r2 = r36
            if (r2 == r6) goto L_0x0330
            X.1FI r5 = X.1FI.A0M
            if (r2 == r5) goto L_0x0330
            X.1FI r5 = X.1FI.A03
            if (r2 == r5) goto L_0x0330
            r2 = r17
        L_0x0291:
            X.2kj r5 = r56.A0A()
            X.2kv r6 = r5.A1x
            java.lang.String r5 = X.AnonymousClass1FM.A00()
            r6.A00 = r5
        L_0x029d:
            if (r2 == 0) goto L_0x02a2
            X.00k.A0U(r2)
        L_0x02a2:
            if (r4 == 0) goto L_0x02b6
            X.2ur r2 = r4.A01
            if (r2 == 0) goto L_0x02ab
            r2.Dpi()
        L_0x02ab:
            X.2v7 r2 = r4.A06
            r2.DpV(r14)
            X.2un r2 = r4.A05
            if (r2 == 0) goto L_0x02b6
            r2.A00 = r3
        L_0x02b6:
            r7 = -1
            X.C242573Va.A01 = r7
            X.2kj r2 = r56.A0A()
            X.2rI r2 = r2.A0J()
            X.C242583Vb.A00 = r17
            X.2s2 r2 = r2.A0A
            r2.A03 = r3
            r2 = r56
            X.57Q r6 = r2.A0A
            if (r6 == 0) goto L_0x02e9
            java.lang.String r2 = r6.A07
            if (r2 == 0) goto L_0x02e9
            r6.A03()
            java.lang.Integer r5 = X.AnonymousClass05K.A0j
            java.lang.String r2 = "feed_pull_to_refresh"
            X.AnonymousClass57Q.A00(r6, r5, r2)
            java.util.concurrent.ConcurrentHashMap r2 = r6.A0N
            r2.clear()
            java.util.concurrent.ConcurrentHashMap r2 = r6.A0O
            r2.clear()
            r2 = r17
            r6.A07 = r2
        L_0x02e9:
            X.C242583Vb.A00 = r17
            r2 = r54
            X.2rX r2 = r2.A00
            X.2rW r2 = (X.AnonymousClass2rW) r2
            r2.A04()
            r5 = r17
            r2 = r54
            r2.A04 = r5
            r2.A0A(r7)
        L_0x02fd:
            X.2vV r10 = r1.A0B
            if (r10 == 0) goto L_0x0860
            boolean r2 = X.C233312vV.A00(r55)
            if (r2 != r14) goto L_0x0860
            java.util.List r7 = r54.A07()
            r6 = 10
            int r2 = X.0Yv.A1E(r15, r6)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>(r2)
            java.util.Iterator r8 = r15.iterator()
        L_0x031a:
            boolean r2 = r8.hasNext()
            if (r2 == 0) goto L_0x06fb
            java.lang.Object r2 = r8.next()
            X.1Xg r2 = (X.1Xg) r2
            X.1Xn r2 = r2.A05
            X.1Xj r2 = X.1Xi.A02(r2)
            r5.add(r2)
            goto L_0x031a
        L_0x0330:
            com.google.common.collect.ImmutableList r7 = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) r15)
            X.0qQ.A07(r7)
            if (r19 == 0) goto L_0x035d
            java.util.List r6 = r54.A07()
            java.util.LinkedHashSet r5 = new java.util.LinkedHashSet
            r5.<init>()
            r5.addAll(r6)
            r2 = r55
            java.lang.String r2 = r2.A09
            com.google.common.collect.ImmutableList r6 = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) r6)
            X.0qQ.A07(r6)
            X.AnonymousClass3VW.A00(r0, r2, r6, r7, r3)
            r5.addAll(r7)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r5)
            goto L_0x0291
        L_0x035d:
            java.util.LinkedHashSet r12 = new java.util.LinkedHashSet
            r12.<init>()
            java.util.ArrayList r31 = new java.util.ArrayList
            r31.<init>()
            java.util.Iterator r9 = r7.iterator()
            r30 = 0
            r8 = 0
        L_0x036e:
            boolean r2 = r9.hasNext()
            if (r2 == 0) goto L_0x038d
            java.lang.Object r6 = r9.next()
            X.1Xg r6 = (X.1Xg) r6
            X.1UQ r5 = r6.A06
            X.1UQ r2 = X.1UQ.A0F
            if (r5 != r2) goto L_0x0387
            r8 = 1
        L_0x0381:
            r2 = r31
            r2.add(r6)
            goto L_0x036e
        L_0x0387:
            if (r8 != 0) goto L_0x0381
            r12.add(r6)
            goto L_0x036e
        L_0x038d:
            java.util.List r2 = r54.A07()
            java.util.Iterator r6 = r2.iterator()
        L_0x0395:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L_0x04ab
            java.lang.Object r2 = r6.next()
            r5 = r2
            X.1Xg r5 = (X.1Xg) r5
            X.1Xn r5 = r5.A05
            X.1Xj r5 = X.1Xi.A02(r5)
            if (r5 == 0) goto L_0x0395
        L_0x03aa:
            X.1Xg r2 = (X.1Xg) r2
            android.content.Context r8 = r56.getContext()
            if (r2 == 0) goto L_0x03e0
            X.1Xn r5 = r2.A05
            X.1Xj r5 = X.1Xi.A02(r5)
            if (r5 == 0) goto L_0x03e0
            if (r8 == 0) goto L_0x03e0
            X.1Ua r6 = X.1UX.A00(r8, r0)
            java.lang.String r5 = r2.A09
            boolean r5 = r6.A03(r5)
            if (r5 != 0) goto L_0x03e0
            X.1UQ r6 = r2.A06
            X.1UQ r5 = X.1UQ.A0H
            if (r6 == r5) goto L_0x03e0
            if (r77 != 0) goto L_0x04a7
            X.0Tu r9 = X.0Tu.A05
            r5 = 36311105220313527(0x8100c2000f01b7, double:3.0266273821865625E-306)
            boolean r5 = X.182.A06(r9, r0, r5)
            if (r5 == 0) goto L_0x04a7
            r12.add(r2)
        L_0x03e0:
            java.util.Iterator r9 = r7.iterator()
        L_0x03e4:
            boolean r5 = r9.hasNext()
            if (r5 == 0) goto L_0x04a4
            java.lang.Object r6 = r9.next()
            r5 = r6
            X.1Xg r5 = (X.1Xg) r5
            X.1Xn r5 = r5.A05
            X.1Xj r5 = X.1Xi.A02(r5)
            if (r5 == 0) goto L_0x03e4
        L_0x03f9:
            if (r2 == 0) goto L_0x0472
            X.1Xn r11 = r2.A05
            X.1Xj r5 = X.1Xi.A02(r11)
            if (r5 == 0) goto L_0x0472
            boolean r5 = X.0qQ.A0K(r6, r2)
            if (r5 != 0) goto L_0x0472
            X.1Xj r6 = X.1Xi.A02(r11)
            if (r6 == 0) goto L_0x0413
            java.lang.Integer r5 = X.AnonymousClass05K.A01
            r6.A0J = r5
        L_0x0413:
            X.2lG r6 = r1.A05
            java.lang.String r5 = "RUG_PULLED"
            r6.A00(r5)
            boolean r5 = r55.A00()
            if (r5 == 0) goto L_0x0470
            X.0wX r5 = X.C61170le.A00
            X.18g r10 = X.C638918c.A01(r5)
            X.1Xj r5 = X.1Xi.A02(r11)
            if (r5 == 0) goto L_0x0433
            boolean r5 = r5.A5z()
            r9 = 1
            if (r5 == r14) goto L_0x0434
        L_0x0433:
            r9 = 0
        L_0x0434:
            X.1Xj r5 = X.1Xi.A02(r11)
            if (r5 == 0) goto L_0x0441
            boolean r5 = r5.CcK()
            r6 = 1
            if (r5 == r14) goto L_0x0442
        L_0x0441:
            r6 = 0
        L_0x0442:
            if (r8 == 0) goto L_0x0452
            X.1Ua r8 = X.1UX.A00(r8, r0)
            java.lang.String r5 = r2.A09
            boolean r5 = r8.A03(r5)
            if (r5 == 0) goto L_0x0452
            r30 = 1
        L_0x0452:
            java.lang.String r8 = "is_rugpulled_first_media_seen_server"
            com.facebook.quicklog.LightweightQuickPerformanceLogger r5 = r10.A02
            X.18g.A06(r5, r8, r9)
            java.lang.String r8 = "is_rugpulled_first_media_is_sponsored"
            com.facebook.quicklog.LightweightQuickPerformanceLogger r5 = r10.A02
            X.18g.A06(r5, r8, r6)
            java.lang.String r8 = "is_rugpulled_first_media_seen_client"
            com.facebook.quicklog.LightweightQuickPerformanceLogger r6 = r10.A02
            r5 = r30
            X.18g.A06(r6, r8, r5)
            java.lang.String r6 = "FEED_RUG_PULLED"
            com.facebook.quicklog.LightweightQuickPerformanceLogger r5 = r10.A02
            r10.A0O(r5, r6)
        L_0x0470:
            r30 = 1
        L_0x0472:
            X.0Tu r8 = X.0Tu.A05
            r5 = 36317620686755198(0x8106af001f157e, double:3.030747789399953E-306)
            boolean r5 = X.182.A06(r8, r0, r5)
            if (r5 == 0) goto L_0x06a3
            if (r2 == 0) goto L_0x06a3
            boolean r5 = r7.isEmpty()
            r5 = r5 ^ 1
            if (r5 == 0) goto L_0x06a3
            java.lang.Object r5 = r7.get(r3)
            boolean r5 = X.0qQ.A0K(r5, r2)
            if (r5 != 0) goto L_0x06a3
            boolean r5 = r55.A00()
            if (r5 == 0) goto L_0x06a3
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            goto L_0x04ae
        L_0x04a4:
            r6 = 0
            goto L_0x03f9
        L_0x04a7:
            r1.A00 = r2
            goto L_0x03e0
        L_0x04ab:
            r2 = 0
            goto L_0x03aa
        L_0x04ae:
            r5 = r54
            X.4DV r5 = r5.A0Y     // Catch:{ all -> 0x04f5 }
            X.3Ar r5 = r5.getScrollingViewProxy()     // Catch:{ all -> 0x04f5 }
            int r6 = r5.BLQ()     // Catch:{ all -> 0x04f5 }
            if (r6 < 0) goto L_0x04fd
            java.util.List r5 = r54.A07()     // Catch:{ all -> 0x04f5 }
            java.util.List r5 = X.00k.A0d(r5, r6)     // Catch:{ all -> 0x04f5 }
            java.util.Iterator r11 = r5.iterator()     // Catch:{ all -> 0x04f5 }
        L_0x04c8:
            boolean r5 = r11.hasNext()     // Catch:{ all -> 0x04f5 }
            if (r5 == 0) goto L_0x04fd
            java.lang.Object r10 = r11.next()     // Catch:{ all -> 0x04f5 }
            X.1Xg r10 = (X.1Xg) r10     // Catch:{ all -> 0x04f5 }
            X.1UQ r6 = r10.A06     // Catch:{ all -> 0x04f5 }
            X.1UQ r5 = X.1UQ.A0Y     // Catch:{ all -> 0x04f5 }
            if (r6 != r5) goto L_0x04f0
            X.1Xn r5 = r10.A05     // Catch:{ all -> 0x04f5 }
            X.1Xj r5 = X.1Xi.A02(r5)     // Catch:{ all -> 0x04f5 }
            if (r5 == 0) goto L_0x04ec
            boolean r5 = r5.CcK()     // Catch:{ all -> 0x04f5 }
            if (r5 != r14) goto L_0x04ec
        L_0x04e8:
            r9.add(r10)     // Catch:{ all -> 0x04f5 }
            goto L_0x04c8
        L_0x04ec:
            r7.add(r10)     // Catch:{ all -> 0x04f5 }
            goto L_0x04c8
        L_0x04f0:
            X.1UQ r5 = X.1UQ.A0C     // Catch:{ all -> 0x04f5 }
            if (r6 != r5) goto L_0x04c8
            goto L_0x04e8
        L_0x04f5:
            r10 = move-exception
            java.lang.String r6 = "MainFeedAdapter"
            java.lang.String r5 = "Exception in getSeenItems"
            X.0wb.A06(r6, r5, r10)
        L_0x04fd:
            android.util.Pair r10 = new android.util.Pair
            r10.<init>(r7, r9)
            java.lang.Object r6 = r10.first
            X.0qQ.A06(r6)
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            r7 = 10
            int r5 = X.0Yv.A1E(r6, r7)
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>(r5)
            java.util.Iterator r11 = r6.iterator()
        L_0x0518:
            boolean r5 = r11.hasNext()
            java.lang.String r29 = "_"
            r27 = 0
            if (r5 == 0) goto L_0x054c
            java.lang.Object r5 = r11.next()
            X.1Xg r5 = (X.1Xg) r5
            java.lang.String r6 = r5.A09
            java.lang.String[] r5 = new java.lang.String[]{r29}
            java.util.List r5 = X.00l.A0R(r6, r5, r3)
            java.lang.Object r5 = X.00k.A0J(r5)
            java.lang.String r5 = (java.lang.String) r5
            if (r5 == 0) goto L_0x0544
            java.lang.Long r5 = X.00y.A0n(r7, r5)
            if (r5 == 0) goto L_0x0544
            long r27 = r5.longValue()
        L_0x0544:
            java.lang.Long r5 = java.lang.Long.valueOf(r27)
            r9.add(r5)
            goto L_0x0518
        L_0x054c:
            java.util.Set r11 = X.00k.A0j(r9)
            java.lang.Object r6 = r10.second
            X.0qQ.A06(r6)
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            int r5 = X.0Yv.A1E(r6, r7)
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>(r5)
            java.util.Iterator r10 = r6.iterator()
        L_0x0564:
            boolean r5 = r10.hasNext()
            if (r5 == 0) goto L_0x0597
            java.lang.Object r5 = r10.next()
            X.1Xg r5 = (X.1Xg) r5
            java.lang.String r6 = r5.A09
            java.lang.String[] r5 = new java.lang.String[]{r29}
            java.util.List r5 = X.00l.A0R(r6, r5, r3)
            java.lang.Object r5 = X.00k.A0J(r5)
            java.lang.String r5 = (java.lang.String) r5
            if (r5 == 0) goto L_0x0594
            java.lang.Long r5 = X.00y.A0n(r7, r5)
            if (r5 == 0) goto L_0x0594
            long r5 = r5.longValue()
        L_0x058c:
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            r9.add(r5)
            goto L_0x0564
        L_0x0594:
            r5 = 0
            goto L_0x058c
        L_0x0597:
            java.util.Set r9 = X.00k.A0j(r9)
            r5 = 36317620686820735(0x8106af0020157f, double:3.0307477894413986E-306)
            boolean r5 = X.182.A06(r8, r0, r5)
            if (r5 == 0) goto L_0x05dd
            X.1UQ r6 = r2.A06
            X.1UQ r5 = X.1UQ.A0Y
            if (r6 != r5) goto L_0x05dd
            X.1Xn r5 = r2.A05
            X.1Xj r5 = X.1Xi.A02(r5)
            if (r5 == 0) goto L_0x0627
            boolean r5 = r5.CcK()
            if (r5 != 0) goto L_0x0627
            java.lang.String r5 = r2.A09
            java.lang.String[] r2 = new java.lang.String[]{r29}
            java.util.List r2 = X.00l.A0R(r5, r2, r3)
            java.lang.Object r2 = X.00k.A0J(r2)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto L_0x0624
            java.lang.Long r2 = X.00y.A0n(r7, r2)
            if (r2 == 0) goto L_0x0624
            long r5 = r2.longValue()
        L_0x05d6:
            java.lang.Long r2 = java.lang.Long.valueOf(r5)
            r11.add(r2)
        L_0x05dd:
            boolean r2 = r11.isEmpty()
            r2 = r2 ^ 1
            java.lang.String r8 = "feed"
            if (r2 == 0) goto L_0x0656
            X.0wc r6 = r1.A01
            java.lang.String r5 = "ig_rug_pull_event"
            X.0kJ r2 = r6.A00
            X.0Aj r7 = r6.A00(r2, r5)
            java.lang.String r2 = "ranking_session_id"
            r7.AAJ(r2, r13)
            java.lang.String r2 = "product"
            r7.AAJ(r2, r8)
            java.lang.String r5 = "organic"
            java.lang.String r2 = "delivery_class"
            r7.AAJ(r2, r5)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r29 = r11.iterator()
        L_0x060b:
            boolean r2 = r29.hasNext()
            if (r2 == 0) goto L_0x064e
            java.lang.Object r5 = r29.next()
            r2 = r5
            java.lang.Number r2 = (java.lang.Number) r2
            long r10 = r2.longValue()
            int r2 = (r10 > r27 ? 1 : (r10 == r27 ? 0 : -1))
            if (r2 == 0) goto L_0x060b
            r6.add(r5)
            goto L_0x060b
        L_0x0624:
            r5 = 0
            goto L_0x05d6
        L_0x0627:
            java.lang.String r5 = r2.A09
            java.lang.String[] r2 = new java.lang.String[]{r29}
            java.util.List r2 = X.00l.A0R(r5, r2, r3)
            java.lang.Object r2 = X.00k.A0J(r2)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto L_0x064b
            java.lang.Long r2 = X.00y.A0n(r7, r2)
            if (r2 == 0) goto L_0x064b
            long r5 = r2.longValue()
        L_0x0643:
            java.lang.Long r2 = java.lang.Long.valueOf(r5)
            r9.add(r2)
            goto L_0x05dd
        L_0x064b:
            r5 = 0
            goto L_0x0643
        L_0x064e:
            java.lang.String r2 = "rugpulled_post_ids"
            r7.AAe(r2, r6)
            r7.Cgf()
        L_0x0656:
            boolean r2 = r9.isEmpty()
            r2 = r2 ^ 1
            if (r2 == 0) goto L_0x06a3
            X.0wc r6 = r1.A01
            java.lang.String r5 = "ig_rug_pull_event"
            X.0kJ r2 = r6.A00
            X.0Aj r5 = r6.A00(r2, r5)
            java.lang.String r2 = "ranking_session_id"
            r5.AAJ(r2, r13)
            java.lang.String r2 = "product"
            r5.AAJ(r2, r8)
            java.lang.String r6 = "ads"
            java.lang.String r2 = "delivery_class"
            r5.AAJ(r2, r6)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r10 = r9.iterator()
        L_0x0682:
            boolean r2 = r10.hasNext()
            if (r2 == 0) goto L_0x069b
            java.lang.Object r7 = r10.next()
            r2 = r7
            java.lang.Number r2 = (java.lang.Number) r2
            long r8 = r2.longValue()
            int r2 = (r8 > r27 ? 1 : (r8 == r27 ? 0 : -1))
            if (r2 == 0) goto L_0x0682
            r6.add(r7)
            goto L_0x0682
        L_0x069b:
            java.lang.String r2 = "rugpulled_post_ids"
            r5.AAe(r2, r6)
            r5.Cgf()
        L_0x06a3:
            r2 = r55
            java.lang.String r6 = r2.A09
            com.google.common.collect.ImmutableList r5 = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) r12)
            X.0qQ.A07(r5)
            com.google.common.collect.ImmutableList r2 = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) r31)
            X.0qQ.A07(r2)
            X.AnonymousClass3VW.A00(r0, r6, r5, r2, r14)
            r2 = r31
            r12.addAll(r2)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r12)
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r30)
            X.0eP r5 = new X.0eP
            r5.<init>(r2, r6)
            java.lang.Object r2 = r5.A00
            java.util.Collection r2 = (java.util.Collection) r2
            java.lang.Object r5 = r5.A01
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 != 0) goto L_0x029d
            goto L_0x0291
        L_0x06db:
            X.2lG r5 = r1.A05
            java.lang.String r2 = "UNSEEN_CACHE_LOADED"
            goto L_0x0262
        L_0x06e1:
            X.2lG r5 = r1.A05
            java.lang.String r2 = "PREVIOUS_HEAD_LOAD_LOADED"
            goto L_0x0262
        L_0x06e7:
            X.1Xg r2 = r1.A00
            if (r2 == 0) goto L_0x02fd
            r15.add(r2)
            r2 = r17
            r1.A00 = r2
            goto L_0x02fd
        L_0x06f4:
            r5 = 0
            goto L_0x0207
        L_0x06f7:
            r21 = r17
            goto L_0x01e8
        L_0x06fb:
            java.util.List r5 = X.00k.A0a(r5)
            r2 = r17
            java.lang.String r7 = r10.A02(r2, r7, r5)
            java.lang.Integer r5 = r10.A05
            java.lang.Integer r2 = X.AnonymousClass05K.A0C
            if (r5 == r2) goto L_0x0852
            if (r7 != 0) goto L_0x0852
            int r2 = X.0Yv.A1E(r15, r6)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>(r2)
            java.util.Iterator r6 = r15.iterator()
        L_0x071a:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L_0x0730
            java.lang.Object r2 = r6.next()
            X.1Xg r2 = (X.1Xg) r2
            X.1Xn r2 = r2.A05
            X.1Xj r2 = X.1Xi.A02(r2)
            r5.add(r2)
            goto L_0x071a
        L_0x0730:
            java.util.List r28 = X.00k.A0a(r5)
            X.2wV r2 = r10.A04
            if (r2 == 0) goto L_0x082e
            java.util.ArrayList r27 = new java.util.ArrayList
            r27.<init>()
            int r2 = r10.A00
            int r9 = r2 + 1
            boolean r2 = r10.A09
            if (r2 == 0) goto L_0x0747
            int r9 = r9 + 1
        L_0x0747:
            X.2rI r8 = r10.A0B
            int r7 = r8.B5I()
            int r7 = r7 - r14
            if (r9 > r7) goto L_0x07b8
        L_0x0750:
            X.1Xg r2 = r8.A04(r7)
            if (r2 == 0) goto L_0x075f
            java.lang.String r5 = r2.A09
            if (r5 == 0) goto L_0x075f
            r2 = r27
            r2.add(r5)
        L_0x075f:
            X.1Xg r2 = r8.A04(r7)
            if (r2 == 0) goto L_0x07b4
            X.1Xn r2 = r2.A05
            X.1Xj r2 = X.1Xi.A02(r2)
            if (r2 == 0) goto L_0x07b4
            boolean r2 = r2.CcK()
            if (r2 != r14) goto L_0x07b4
            X.2wV r6 = r10.A04
            if (r6 == 0) goto L_0x079c
            java.lang.Integer r2 = X.AnonymousClass05K.A0u
            X.1PW r5 = new X.1PW
            r5.<init>(r2)
            r5.A03 = r7
            X.2vf r11 = r6.A0U
            java.lang.Object r2 = r11.BTe(r7)
            if (r2 == 0) goto L_0x07a1
            java.lang.String r13 = "STALE_WILL_EAGER_REFRESH"
            java.util.HashMap r12 = new java.util.HashMap
            r12.<init>()
            boolean r11 = r11.FIZ(r2, r13, r12)
            if (r11 == 0) goto L_0x07a1
            X.2wO r11 = r6.A0W
            X.HKr r6 = X.C54608HKr.A0H
            r11.AWG(r6, r5, r2)
        L_0x079c:
            if (r7 == r9) goto L_0x07b8
            int r7 = r7 + -1
            goto L_0x0750
        L_0x07a1:
            com.instagram.common.session.UserSession r2 = r6.A0L
            if (r2 == 0) goto L_0x079c
            X.0wj r6 = X.0wj.A01
            r5 = 817903741(0x30c0387d, float:1.3985894E-9)
            java.lang.String r2 = "SponsoredContentController_removeAdFromAcp"
            X.0f9 r2 = r6.AEf(r2, r5)
            r2.report()
            goto L_0x079c
        L_0x07b4:
            r8.EDl(r7)
            goto L_0x079c
        L_0x07b8:
            X.3W1 r2 = r10.A03
            if (r2 == 0) goto L_0x07be
            r2.A2M = r14
        L_0x07be:
            com.instagram.common.session.UserSession r2 = r10.A0A
            X.2ln r9 = X.C228502lm.A00(r2)
            java.util.List r2 = X.00k.A0Y(r27)
            java.lang.String r8 = r2.toString()
            java.util.Iterator r12 = r28.iterator()
            r7 = -1
            r6 = -1
            r11 = 0
        L_0x07d3:
            boolean r2 = r12.hasNext()
            if (r2 == 0) goto L_0x07f6
            java.lang.Object r2 = r12.next()
            int r5 = r11 + 1
            if (r11 >= 0) goto L_0x07e9
            X.0sr.A1T()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x07e9:
            X.1Xj r2 = (X.1Xj) r2
            if (r2 == 0) goto L_0x07f4
            boolean r2 = r2.CcK()
            if (r2 != r14) goto L_0x07f4
            r6 = r11
        L_0x07f4:
            r11 = r5
            goto L_0x07d3
        L_0x07f6:
            if (r6 == r7) goto L_0x07fe
            int r5 = r10.A00
            int r2 = r10.A01
            int r5 = r5 - r2
            int r6 = r6 + r5
        L_0x07fe:
            r2 = 976041859(0x3a2d3783, float:6.607698E-4)
            X.02m r5 = r9.A00
            com.facebook.quicklog.MarkerEditor r5 = r5.withMarker(r2)
            java.lang.String r2 = "replacement_success"
            com.facebook.quicklog.PointEditor r5 = r5.pointEditor(r2)
            java.lang.String r2 = "evicted_items_ids"
            com.facebook.quicklog.PointEditor r5 = r5.addPointData(r2, r8)
            java.lang.String r2 = "first_ad_gap_to_previous_ad"
            com.facebook.quicklog.PointEditor r2 = r5.addPointData(r2, r6)
            r2.markerEditingCompleted()
            r10.A00 = r7
            r2 = r17
            r10.A03 = r2
            r10.A07 = r2
            r10.A01 = r7
            r10.A09 = r3
            int r2 = r10.A02
            int r2 = r2 + 1
            r10.A02 = r2
        L_0x082e:
            java.util.Iterator r6 = r15.iterator()
        L_0x0832:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L_0x084d
            java.lang.Object r2 = r6.next()
            X.1Xg r2 = (X.1Xg) r2
            X.1Xn r2 = r2.A05
            X.1Xj r5 = X.1Xi.A02(r2)
            if (r5 == 0) goto L_0x0832
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r14)
            r5.A0G = r2
            goto L_0x0832
        L_0x084d:
            java.lang.Integer r2 = X.AnonymousClass05K.A01
            r10.A05 = r2
            goto L_0x0860
        L_0x0852:
            X.0wj r6 = X.0wj.A01
            r5 = 817901067(0x30c02e0b, float:1.3982925E-9)
            java.lang.String r2 = "FeedLoader: feed eager refresh eligible, but failed. Feed response should have been dropped."
            X.0f9 r2 = r6.AEf(r2, r5)
            r2.report()
        L_0x0860:
            if (r18 != 0) goto L_0x0911
            java.util.List r5 = r54.A07()
        L_0x0866:
            r2 = r55
            java.lang.String r7 = r2.A09
            com.google.common.collect.ImmutableList r6 = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) r5)
            X.0qQ.A07(r6)
            com.google.common.collect.ImmutableList r2 = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) r15)
            X.0qQ.A07(r2)
            X.AnonymousClass3VW.A00(r0, r7, r6, r2, r3)
            int r12 = r5.size()
            r6 = 0
        L_0x0880:
            if (r6 >= r12) goto L_0x0937
            int r11 = r15.size()
            r2 = 0
        L_0x0887:
            if (r2 >= r11) goto L_0x090d
            java.lang.Object r9 = r5.get(r6)
            X.1Xg r9 = (X.1Xg) r9
            java.lang.Object r7 = r15.get(r2)
            boolean r7 = X.0qQ.A0K(r9, r7)
            if (r7 == 0) goto L_0x0907
            X.9J8 r8 = X.C241323Ot.A00(r55)
            int r7 = r5.size()
            int r7 = r7 + r2
            X.C241323Ot.A04(r8, r0, r9, r7)
            X.1Xn r7 = r9.A05
            X.1Xj r7 = X.1Xi.A02(r7)
            if (r7 == 0) goto L_0x0907
            boolean r8 = r7.CcK()
            if (r8 == 0) goto L_0x0907
            boolean r8 = X.C271854jh.A00(r0, r7)
            if (r8 != 0) goto L_0x0907
            X.1Av r8 = X.1Au.A00(r0)
            boolean r8 = X.C228342lQ.A08(r0, r8)
            if (r8 != 0) goto L_0x0907
            if (r22 == 0) goto L_0x090b
            java.lang.String r9 = r9.A09
            r8 = r22
            boolean r13 = X.00l.A0d(r8, r9, r3)
        L_0x08cd:
            X.4jb r9 = new X.4jb
            r9.<init>(r0, r7)
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.lang.String r10 = "duplicate_ad_inserted"
            r8.add(r10)
            if (r13 == 0) goto L_0x08e3
            java.lang.String r10 = "duplicate_ad_in_view_state"
            r8.add(r10)
        L_0x08e3:
            X.4DU r10 = r1.A03
            java.lang.String r32 = "duplicate_ad_received"
            java.util.List r35 = java.util.Collections.singletonList(r32)
            X.0qQ.A07(r35)
            int r13 = r7.A0m()
            java.lang.Integer r31 = java.lang.Integer.valueOf(r13)
            java.lang.String r33 = r7.A2p()
            r27 = r0
            r28 = r9
            r29 = r7
            r30 = r10
            r34 = r8
            X.C233822wX.A0O(r27, r28, r29, r30, r31, r32, r33, r34, r35)
        L_0x0907:
            int r2 = r2 + 1
            goto L_0x0887
        L_0x090b:
            r13 = 0
            goto L_0x08cd
        L_0x090d:
            int r6 = r6 + 1
            goto L_0x0880
        L_0x0911:
            java.util.List r2 = r54.A07()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r7 = r2.iterator()
        L_0x091e:
            boolean r2 = r7.hasNext()
            if (r2 == 0) goto L_0x0866
            java.lang.Object r6 = r7.next()
            r2 = r6
            X.1Xg r2 = (X.1Xg) r2
            boolean r2 = X.AnonymousClass3VP.A01(r2)
            r2 = r2 ^ 1
            if (r2 == 0) goto L_0x091e
            r5.add(r6)
            goto L_0x091e
        L_0x0937:
            r15.removeAll(r5)
            X.0Tu r2 = X.0Tu.A05
            r6 = 2342172389519147086(0x208111610004404e, double:4.073539583552657E-152)
            boolean r6 = X.182.A06(r2, r0, r6)
            if (r6 == 0) goto L_0x0968
            java.util.Iterator r8 = r5.iterator()
        L_0x094b:
            boolean r6 = r8.hasNext()
            if (r6 == 0) goto L_0x0968
            java.lang.Object r6 = r8.next()
            X.1Xg r6 = (X.1Xg) r6
            X.1UQ r7 = r6.A06
            X.1UQ r6 = X.1UQ.A0F
            if (r7 != r6) goto L_0x094b
            X.5Bn r6 = X.AnonymousClass5Bn.A00
            X.018.A1A(r15, r6)
            X.5Bo r6 = X.AnonymousClass5Bo.A00
            X.018.A1A(r15, r6)
            goto L_0x094b
        L_0x0968:
            if (r20 == 0) goto L_0x09a3
            if (r18 != 0) goto L_0x09a3
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>(r15)
            r9 = r19 ^ 1
            r12 = r10
            X.0xi r6 = X.0tS.A4E
            X.0tS r8 = r6.A00()
            X.0s0 r7 = r8.A1D
            X.0YZ[] r11 = X.0tS.A4G
            r6 = 203(0xcb, float:2.84E-43)
            r6 = r11[r6]
            java.lang.Object r6 = r7.CDM(r8, r6)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 != 0) goto L_0x0998
            java.util.List r7 = r54.A07()
            r6 = r20
            java.util.ArrayList r12 = X.I5U.A00(r0, r6, r10, r7, r9)
        L_0x0998:
            java.util.ArrayList r15 = X.00k.A0U(r12)
            X.9J8 r6 = X.C241323Ot.A00(r55)
            X.C241323Ot.A07(r6, r0, r10, r15)
        L_0x09a3:
            boolean r6 = X.1Uh.A03(r0)
            if (r6 == 0) goto L_0x0c77
            r6 = 36328517017157001(0x81109800063d89, double:3.037638672622054E-306)
            boolean r6 = X.182.A06(r2, r0, r6)
            if (r6 == 0) goto L_0x0c77
            if (r76 != 0) goto L_0x0c77
            java.lang.Object r6 = X.00k.A0L(r5)
            X.1Xg r6 = (X.1Xg) r6
            if (r6 == 0) goto L_0x0c71
            boolean r7 = X.AnonymousClass3VP.A02(r6)
            if (r7 == 0) goto L_0x0c6b
            X.1Xn r6 = r6.A05
            X.1Xj r6 = X.1Xi.A02(r6)
            if (r6 == 0) goto L_0x0c6b
            java.util.List r7 = r6.A0e
            X.3PG r6 = X.AnonymousClass3PG.LOCAL
            boolean r6 = r7.contains(r6)
            if (r6 != r14) goto L_0x0c6b
            java.util.Iterator r7 = r15.iterator()
            r8 = 0
        L_0x09db:
            boolean r6 = r7.hasNext()
            r9 = -1
            if (r6 == 0) goto L_0x0c6b
            java.lang.Object r6 = r7.next()
            X.1Xg r6 = (X.1Xg) r6
            boolean r6 = X.AnonymousClass3VP.A02(r6)
            if (r6 == 0) goto L_0x0c67
            if (r8 <= r9) goto L_0x0c6b
            int r6 = r5.size()
            java.util.ListIterator r7 = r5.listIterator(r6)
        L_0x09f8:
            boolean r6 = r7.hasPrevious()
            if (r6 == 0) goto L_0x0c64
            java.lang.Object r6 = r7.previous()
            X.1Xg r6 = (X.1Xg) r6
            boolean r6 = X.AnonymousClass3VP.A02(r6)
            if (r6 == 0) goto L_0x09f8
            int r6 = r7.nextIndex()
            if (r6 <= r9) goto L_0x0c64
            int r10 = r5.size()
            int r10 = r10 - r6
            int r10 = r10 - r14
            int r10 = r10 + r8
            r6 = 36609991993595853(0x821098000217cd, double:3.21564458113074E-306)
            long r6 = X.182.A01(r2, r0, r6)
            int r11 = (int) r6
            if (r10 >= r11) goto L_0x0c64
            java.lang.Integer r17 = java.lang.Integer.valueOf(r10)
            r12 = r8
        L_0x0a28:
            int r10 = r5.size()
            int r10 = r10 + r8
            r6 = 36609991993530316(0x821098000117cc, double:3.215644581089294E-306)
            long r6 = X.182.A01(r2, r0, r6)
            int r11 = (int) r6
            if (r10 >= r11) goto L_0x0c59
            int r5 = r5.size()
            int r5 = r5 + r8
            java.lang.Integer r30 = java.lang.Integer.valueOf(r5)
        L_0x0a42:
            int r5 = r15.size()
            if (r8 >= r5) goto L_0x0c60
            r5 = 36328517017222538(0x81109800073d8a, double:3.0376386726634996E-306)
            boolean r7 = X.182.A06(r2, r0, r5)
            if (r7 == 0) goto L_0x0a56
            r15.remove(r8)
        L_0x0a56:
            boolean r5 = X.182.A06(r2, r0, r5)
            java.lang.Boolean r50 = java.lang.Boolean.valueOf(r5)
        L_0x0a5e:
            android.content.Context r22 = r56.getContext()
            if (r22 == 0) goto L_0x0a6b
            X.0xi r6 = X.0tS.A4E
            r5 = r22
            r6.A01(r5)
        L_0x0a6b:
            if (r76 == 0) goto L_0x0ac1
            boolean r5 = r15.isEmpty()
            r5 = r5 ^ 1
            if (r5 == 0) goto L_0x0ac1
            X.1FI r6 = X.1FI.A06
            r5 = r36
            if (r5 == r6) goto L_0x0ac1
            java.lang.Object r5 = r15.get(r3)
            X.1Xg r5 = (X.1Xg) r5
            X.1Xn r5 = r5.A05
            X.1Xj r5 = X.1Xi.A02(r5)
            if (r5 == 0) goto L_0x0ac1
            boolean r6 = r5.A5D()
            if (r6 == 0) goto L_0x0a9f
            r6 = r54
            X.2lb r6 = r6.A0S
            X.3W1 r6 = r6.BQr(r5)
            int r6 = r6.A03
            X.1Xj r5 = r5.A1c(r6)
            if (r5 == 0) goto L_0x0ac1
        L_0x0a9f:
            boolean r6 = r5.A6W(r0)
            if (r6 == 0) goto L_0x0ac1
            android.content.Context r8 = r56.getContext()
            if (r8 == 0) goto L_0x0ac1
            X.3WR r7 = r5.CEL()
            X.4DU r5 = r1.A03
            java.lang.String r6 = r5.getModuleName()
            X.4U8 r5 = new X.4U8
            r5.<init>(r8, r0, r7, r6)
            X.4U9 r5 = r5.A00()
            X.AnonymousClass4UA.A00(r5)
        L_0x0ac1:
            r5 = 36319278542101600(0x81083100001c60, double:3.031796223796665E-306)
            boolean r5 = X.182.A06(r2, r0, r5)
            if (r5 == 0) goto L_0x0bcf
            r5 = 5
            X.WxR r6 = new X.WxR
            r6.<init>(r0, r5)
            java.lang.Class<X.581> r5 = X.AnonymousClass581.class
            java.lang.Object r5 = r0.A01(r5, r6)
            X.581 r5 = (X.AnonymousClass581) r5
            int r5 = r5.BNY(r14)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
            r5 = r56
            r5.A0P(r6)
        L_0x0ae7:
            int r7 = r54.B5I()
            if (r67 == 0) goto L_0x0b0c
            boolean r5 = r67.booleanValue()
            if (r5 != 0) goto L_0x0b0c
            boolean r5 = X.AnonymousClass1A9.A00()
            if (r5 == 0) goto L_0x0b0c
            X.ISg r9 = new X.ISg
            r9.<init>()
            java.lang.String r8 = "invisible_end_of_scroll_content"
            X.1UQ r6 = r9.B5J()
            X.1Xg r5 = new X.1Xg
            r5.<init>(r9, r6, r8)
            r15.add(r5)
        L_0x0b0c:
            if (r76 == 0) goto L_0x0bae
            X.1FI r8 = X.1FI.A0J
            X.2lU r5 = r1.A09
            r6 = r36
            if (r8 != r6) goto L_0x0b7f
            X.1Xj r6 = X.AnonymousClass2lU.A01(r15)
            if (r6 == 0) goto L_0x0b71
            java.lang.String r8 = r6.getId()
            if (r8 == 0) goto L_0x0b71
            java.util.Set r6 = r5.A06
            boolean r6 = r6.contains(r8)
            if (r6 == 0) goto L_0x0b6e
            X.2lW r6 = r5.A04
            java.lang.String r8 = r5.A05
            java.lang.Integer r5 = X.AnonymousClass05K.A0N
            java.lang.String r13 = "ptr_seen_media"
            r9 = r6
            r10 = r24
            r11 = r5
            r12 = r8
            r9.A06(r10, r11, r12, r13, r14)
            r6.A02(r10, r5, r8)
        L_0x0b3d:
            r37 = r61
            r38 = r70
            r39 = r71
            if (r18 == 0) goto L_0x0ee5
            java.util.ArrayList r35 = new java.util.ArrayList
            r5 = r35
            r5.<init>(r15)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r9 = r15.iterator()
        L_0x0b55:
            boolean r5 = r9.hasNext()
            if (r5 == 0) goto L_0x0c7d
            java.lang.Object r8 = r9.next()
            r5 = r8
            X.1Xg r5 = (X.1Xg) r5
            boolean r5 = X.AnonymousClass3VP.A01(r5)
            r5 = r5 ^ 1
            if (r5 == 0) goto L_0x0b55
            r6.add(r8)
            goto L_0x0b55
        L_0x0b6e:
            r5.A02 = r8
            goto L_0x0b3d
        L_0x0b71:
            X.2lW r10 = r5.A04
            java.lang.String r9 = r5.A05
            java.lang.Integer r8 = X.AnonymousClass05K.A0N
            java.lang.String r6 = "null ptr load media id"
            r5 = r24
            r10.A05(r5, r8, r9, r6)
            goto L_0x0b3d
        L_0x0b7f:
            java.lang.String r10 = r58.name()
            X.0qQ.A0B(r10, r14)
            X.1Xj r6 = X.AnonymousClass2lU.A01(r15)
            if (r6 == 0) goto L_0x0ba0
            java.lang.String r6 = r6.getId()
            if (r6 == 0) goto L_0x0ba0
            r5.A01 = r6
            X.2lW r9 = r5.A04
            java.lang.String r8 = r5.A05
            java.lang.Integer r6 = X.AnonymousClass05K.A00
            java.lang.String r5 = "feed_source"
            r9.A07(r6, r8, r5, r10)
            goto L_0x0b3d
        L_0x0ba0:
            X.2lW r10 = r5.A04
            java.lang.String r9 = r5.A05
            java.lang.Integer r8 = X.AnonymousClass05K.A00
            java.lang.String r6 = "null initial media id"
            r5 = r24
            r10.A05(r5, r8, r9, r6)
            goto L_0x0b3d
        L_0x0bae:
            X.2lU r5 = r1.A09
            X.1Xj r6 = X.AnonymousClass2lU.A01(r15)
            if (r6 == 0) goto L_0x0bc0
            java.lang.String r6 = r6.getId()
            if (r6 == 0) goto L_0x0bc0
            r5.A03 = r6
            goto L_0x0b3d
        L_0x0bc0:
            X.2lW r10 = r5.A04
            java.lang.String r9 = r5.A05
            java.lang.Integer r8 = X.AnonymousClass05K.A0C
            java.lang.String r6 = "null tail load media id"
            r5 = r24
            r10.A05(r5, r8, r9, r6)
            goto L_0x0b3d
        L_0x0bcf:
            r5 = 36328873499639448(0x8110eb00093e98, double:3.037864113579393E-306)
            boolean r5 = X.182.A06(r2, r0, r5)
            if (r5 == 0) goto L_0x0c14
            r5 = 36328873499508374(0x8110eb00073e96, double:3.037864113496501E-306)
            boolean r5 = X.182.A06(r2, r0, r5)
            if (r5 == 0) goto L_0x0bf3
            long r5 = X.AnonymousClass1B0.A02
            X.1B0 r6 = X.AnonymousClass1B1.A00(r0)
            X.1B2 r5 = X.1B2.A0R
            boolean r5 = r6.A00(r5)
            if (r5 != 0) goto L_0x0c0b
        L_0x0bf3:
            X.1Av r5 = X.1Au.A00(r0)
            boolean r5 = X.A17.A00(r0, r5)
        L_0x0bfb:
            if (r5 == 0) goto L_0x0c0b
            r5 = 36610348476405751(0x8210eb000a17f7, double:3.2158700222951605E-306)
            long r5 = X.182.A01(r2, r0, r5)
            int r7 = (int) r5
            java.lang.Integer r23 = java.lang.Integer.valueOf(r7)
        L_0x0c0b:
            r6 = r56
            r5 = r23
            r6.A0P(r5)
            goto L_0x0ae7
        L_0x0c14:
            r5 = 36328873499836058(0x8110eb000c3e9a, double:3.03786411370373E-306)
            boolean r5 = X.182.A06(r2, r0, r5)
            if (r5 == 0) goto L_0x0c28
            X.1Bh r5 = X.1Bh.A00()
            boolean r5 = r5.A03()
            goto L_0x0bfb
        L_0x0c28:
            r5 = 36328873499770521(0x8110eb000b3e99, double:3.037864113662284E-306)
            boolean r5 = X.182.A06(r2, r0, r5)
            if (r5 == 0) goto L_0x0c3c
            X.1Bh r5 = X.1Bh.A00()
            boolean r5 = r5.A02()
            goto L_0x0bfb
        L_0x0c3c:
            r5 = 36328873499901595(0x8110eb000d3e9b, double:3.037864113745176E-306)
            boolean r5 = X.182.A06(r2, r0, r5)
            if (r5 == 0) goto L_0x0c50
            X.1Bh r5 = X.1Bh.A00()
            boolean r5 = r5.A04()
            goto L_0x0bfb
        L_0x0c50:
            r6 = r56
            r5 = r23
            r6.A0P(r5)
            goto L_0x0ae7
        L_0x0c59:
            r8 = r12
            r30 = 0
            if (r12 <= r9) goto L_0x0c60
            goto L_0x0a42
        L_0x0c60:
            r50 = 0
            goto L_0x0a5e
        L_0x0c64:
            r12 = -1
            goto L_0x0a28
        L_0x0c67:
            int r8 = r8 + 1
            goto L_0x09db
        L_0x0c6b:
            r50 = 0
            r30 = 0
            goto L_0x0a5e
        L_0x0c71:
            r50 = 0
            r30 = 0
            goto L_0x0a5e
        L_0x0c77:
            r30 = 0
            r50 = 0
            goto L_0x0a5e
        L_0x0c7d:
            java.util.ArrayList r15 = X.00k.A0U(r6)
            r36 = r54
            r40 = r15
            r41 = r3
            r36.A0C(r37, r38, r39, r40, r41)
            if (r4 == 0) goto L_0x0d4d
            if (r20 == 0) goto L_0x0d4d
            boolean r5 = r35.isEmpty()
            r5 = r5 ^ 1
            if (r5 == 0) goto L_0x0cb5
            r5 = r35
            java.lang.Object r6 = r5.get(r3)
            X.1Xg r6 = (X.1Xg) r6
            if (r6 == 0) goto L_0x0cb5
            X.1Xn r5 = r6.A05
            X.1Xj r5 = X.1Xi.A02(r5)
            if (r5 == 0) goto L_0x0cb5
            if (r22 == 0) goto L_0x0cb5
            r5 = r22
            X.1Ua r5 = X.1UX.A00(r5, r0)
            java.lang.String r6 = r6.A09
            r5.A03(r6)
        L_0x0cb5:
            r46 = r19 ^ 1
            X.2lH r5 = r1.A0D
            X.2rI r5 = r5.A00
            if (r5 == 0) goto L_0x0d11
            java.util.List r5 = r5.A07()
            java.lang.String r34 = X.C271054hp.A00(r5)
        L_0x0cc5:
            java.util.ArrayList r33 = new java.util.ArrayList
            r33.<init>()
            int r8 = r7 + -1
            if (r7 <= 0) goto L_0x0d14
            boolean r5 = r4.A07
            if (r5 == 0) goto L_0x0d14
            X.2rI r11 = r4.A04
            int r10 = r11.B5I()
            r42 = 0
        L_0x0cda:
            if (r8 < 0) goto L_0x0d16
            if (r8 >= r10) goto L_0x0d16
            X.1Xg r5 = r11.A03(r8)
            if (r5 == 0) goto L_0x0d16
            X.1Xn r5 = r5.A05
            X.1Xj r6 = X.1Xi.A02(r5)
            if (r6 == 0) goto L_0x0d16
            java.util.List r9 = r6.A0e
            X.3PG r5 = X.AnonymousClass3PG.LOCAL
            boolean r5 = r9.contains(r5)
            if (r5 == 0) goto L_0x0d16
            X.1FI r9 = r6.A0D
            X.1FI r5 = X.1FI.A0G
            if (r9 != r5) goto L_0x0d16
            X.1Xy r5 = r6.A0C
            java.lang.Boolean r6 = r5.CG7()
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r14)
            boolean r5 = X.0qQ.A0K(r6, r5)
            if (r5 != 0) goto L_0x0d16
            int r42 = r42 + 1
            int r8 = r8 + -1
            goto L_0x0cda
        L_0x0d11:
            r34 = 0
            goto L_0x0cc5
        L_0x0d14:
            r42 = 0
        L_0x0d16:
            if (r46 == 0) goto L_0x0d1a
            r4.A00 = r3
        L_0x0d1a:
            com.instagram.common.session.UserSession r5 = r4.A03
            r51 = r5
            X.1Av r6 = X.1Au.A00(r51)
            X.0qQ.A0B(r6, r3)
            X.0qQ.A0B(r5, r14)
            X.1Az r5 = X.C228342lQ.A01(r6)
            X.1Az r6 = X.1Az.A07
            if (r5 != r6) goto L_0x0d36
            X.1Az r5 = X.C228342lQ.A00(r51)
            if (r5 == r6) goto L_0x0d6d
        L_0x0d36:
            r5 = 36312879042725233(0x81025f001d0571, double:3.027749154622335E-306)
            r8 = r51
            boolean r5 = X.182.A06(r2, r8, r5)
            if (r5 == 0) goto L_0x0d6d
            X.3PG r6 = X.AnonymousClass3PG.CACHED
            r5 = r58
            if (r5 == r6) goto L_0x0d4d
            X.3PG r6 = X.AnonymousClass3PG.LOCAL
            if (r5 != r6) goto L_0x0d6d
        L_0x0d4d:
            r5 = r7
            if (r7 < 0) goto L_0x0d5f
            r4 = r54
            boolean r4 = r4.A0m
            if (r4 != 0) goto L_0x0d5f
            r4 = r54
            X.2rX r4 = r4.A00
            X.2rW r4 = (X.AnonymousClass2rW) r4
            r4.A07(r7)
        L_0x0d5f:
            r4 = r54
            boolean r4 = r4.A0m
            if (r4 != 0) goto L_0x0d66
            r5 = -1
        L_0x0d66:
            r4 = r54
            r4.A0A(r5)
            goto L_0x0eee
        L_0x0d6d:
            java.util.Iterator r29 = r35.iterator()
            r12 = r7
            r47 = 0
        L_0x0d74:
            boolean r5 = r29.hasNext()
            if (r5 == 0) goto L_0x0eb9
            java.lang.Object r6 = r29.next()
            X.1Xg r6 = (X.1Xg) r6
            boolean r5 = X.AnonymousClass3VP.A01(r6)
            r11 = 1
            if (r5 == 0) goto L_0x0eb6
            boolean r5 = r4.A08
            if (r5 == 0) goto L_0x0eb2
            java.lang.Integer r5 = r6.A07
            if (r5 == 0) goto L_0x0d99
            java.lang.Integer r8 = java.lang.Integer.valueOf(r3)
            boolean r5 = r5.equals(r8)
            if (r5 == 0) goto L_0x0eb2
        L_0x0d99:
            r48 = 1
        L_0x0d9b:
            X.3PG r8 = X.AnonymousClass3PG.NETWORK
            r5 = r58
            if (r5 == r8) goto L_0x0da6
            boolean r5 = r4.A09
            r10 = 1
            if (r5 == 0) goto L_0x0da7
        L_0x0da6:
            r10 = 0
        L_0x0da7:
            if (r48 == 0) goto L_0x0dd4
            if (r10 == 0) goto L_0x0dd4
            r31 = 0
            int r5 = (r74 > r31 ? 1 : (r74 == r31 ? 0 : -1))
            if (r5 <= 0) goto L_0x0dd4
            X.3Bd r5 = X.C238243Bc.A00(r51)
            com.instagram.common.session.UserSession r5 = r5.A02
            r8 = 36599095665692078(0x8206af00410dae, double:3.208753699488402E-306)
            long r27 = X.182.A01(r2, r5, r8)
            int r5 = (r27 > r31 ? 1 : (r27 == r31 ? 0 : -1))
            if (r5 <= 0) goto L_0x0dd4
            X.3Bd r5 = X.C238243Bc.A00(r51)
            com.instagram.common.session.UserSession r5 = r5.A02
            long r8 = X.182.A01(r2, r5, r8)
            int r5 = (r74 > r8 ? 1 : (r74 == r8 ? 0 : -1))
            r49 = 0
            if (r5 < 0) goto L_0x0dd6
        L_0x0dd4:
            r49 = r10
        L_0x0dd6:
            X.1Xn r5 = r6.A05
            X.1Xj r5 = X.1Xi.A02(r5)
            if (r5 == 0) goto L_0x0dfb
            X.2rI r8 = r4.A04
            X.2lb r9 = r8.A0S
            X.3W1 r10 = r9.BQr(r5)
            r8 = 0
            if (r7 != r12) goto L_0x0dea
            r8 = 1
        L_0x0dea:
            r10.A2n = r8
            X.3W1 r8 = r9.BQr(r5)
            int r5 = r35.size()
            int r5 = r5 + r7
            int r5 = r5 - r14
            if (r5 == r12) goto L_0x0df9
            r11 = 0
        L_0x0df9:
            r8.A2m = r11
        L_0x0dfb:
            X.1sS r11 = r6.A04
            r9 = 0
            if (r11 == 0) goto L_0x0eac
            java.lang.String r5 = r11.Be8()
            if (r5 == 0) goto L_0x0eac
            java.lang.Integer r23 = X.00y.A0l(r5)
        L_0x0e0a:
            java.lang.String r5 = r11.Be9()
            if (r5 == 0) goto L_0x0e14
            java.lang.Integer r9 = X.00y.A0l(r5)
        L_0x0e14:
            boolean r8 = r4.A0A
            if (r8 == 0) goto L_0x0ea6
            if (r23 == 0) goto L_0x0ea6
            if (r9 == 0) goto L_0x0ea6
            boolean r5 = X.AnonymousClass3VP.A00(r6)
            if (r5 == 0) goto L_0x0e9b
            int r10 = r9.intValue()
        L_0x0e26:
            if (r8 == 0) goto L_0x0e96
            if (r9 == 0) goto L_0x0e96
            int r13 = r9.intValue()
        L_0x0e2e:
            int r5 = r4.A00
            if (r34 != 0) goto L_0x0e93
            java.lang.String r39 = ""
        L_0x0e34:
            r45 = 12289(0x3001, float:1.722E-41)
            X.2vl r9 = new X.2vl
            r36 = r9
            r37 = r11
            r38 = r24
            r40 = r13
            r41 = r10
            r43 = r7
            r44 = r5
            r36.<init>(r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49)
            r9.A0B(r12)
            if (r8 == 0) goto L_0x0e8e
            if (r23 == 0) goto L_0x0e8e
            int r5 = r23.intValue()
        L_0x0e54:
            r9.A0A(r5)
            X.9J8 r10 = X.C241323Ot.A00(r55)
            X.4EB r8 = new X.4EB
            r5 = r58
            r8.<init>(r10, r6, r5, r9)
            r5 = r33
            r5.add(r8)
        L_0x0e67:
            int r12 = r12 + 1
            java.lang.String r5 = r6.A09
            if (r5 != 0) goto L_0x0d74
            X.0wj r10 = X.0wj.A01
            r9 = 817903741(0x30c0387d, float:1.3985894E-9)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r8 = "Received null feeditem id,  feedItemType"
            r5.append(r8)
            X.1UQ r6 = r6.A06
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            X.0f9 r5 = r10.AEf(r5, r9)
            r5.report()
            goto L_0x0d74
        L_0x0e8e:
            r5 = r20
            int r5 = r5.A00
            goto L_0x0e54
        L_0x0e93:
            r39 = r34
            goto L_0x0e34
        L_0x0e96:
            r5 = r20
            int r13 = r5.A02
            goto L_0x0e2e
        L_0x0e9b:
            boolean r5 = X.AnonymousClass3VP.A03(r6)
            if (r5 == 0) goto L_0x0ea6
            int r10 = r23.intValue()
            goto L_0x0e26
        L_0x0ea6:
            r5 = r20
            int r10 = r5.A01
            goto L_0x0e26
        L_0x0eac:
            r23 = r9
            if (r11 == 0) goto L_0x0e14
            goto L_0x0e0a
        L_0x0eb2:
            r48 = 0
            goto L_0x0d9b
        L_0x0eb6:
            r47 = 1
            goto L_0x0e67
        L_0x0eb9:
            if (r69 == 0) goto L_0x0ecb
            X.2v7 r6 = r4.A06
            int r8 = r69.intValue()
            java.lang.Integer r5 = X.AnonymousClass05K.A0C
            r6.CM3(r8, r5)
            java.lang.Integer r5 = X.AnonymousClass05K.A0N
            r6.CM3(r8, r5)
        L_0x0ecb:
            X.2uu r8 = r4.A02
            if (r8 == 0) goto L_0x0ed6
            java.lang.Integer r6 = X.AnonymousClass05K.A00
            r5 = r33
            r8.Dlz(r6, r5)
        L_0x0ed6:
            if (r46 == 0) goto L_0x0d4d
            X.2ur r5 = r4.A01
            if (r5 == 0) goto L_0x0d4d
            r4 = r55
            java.lang.String r4 = r4.A0A
            r5.Dpg(r4)
            goto L_0x0d4d
        L_0x0ee5:
            r36 = r54
            r40 = r15
            r41 = r14
            r36.A0C(r37, r38, r39, r40, r41)
        L_0x0eee:
            com.google.common.collect.ImmutableList r29 = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) r15)
            X.0qQ.A07(r29)
            java.util.List r6 = r54.A07()
            X.9J8 r8 = X.C241323Ot.A00(r55)
            r5 = r7
            java.util.Iterator r9 = r29.iterator()
        L_0x0f02:
            boolean r4 = r9.hasNext()
            if (r4 == 0) goto L_0x0f15
            java.lang.Object r4 = r9.next()
            X.1Xg r4 = (X.1Xg) r4
            int r7 = r7 + 1
            X.C241323Ot.A05(r8, r0, r4, r5)
            r5 = r7
            goto L_0x0f02
        L_0x0f15:
            int r53 = r54.B5I()
            if (r53 == 0) goto L_0x0f21
            r4 = r54
            X.1Xg r24 = r4.A03(r3)
        L_0x0f21:
            r7 = r19 ^ 1
            if (r7 == 0) goto L_0x0f2f
            if (r21 == 0) goto L_0x0f2f
            r54 = 1
            r5 = r21
            r4 = r24
            if (r4 != r5) goto L_0x0f31
        L_0x0f2f:
            r54 = 0
        L_0x0f31:
            X.2ll r47 = X.C228482lk.A00(r0)
            X.0eP r5 = new X.0eP
            r8 = r17
            r4 = r30
            r5.<init>(r8, r4)
            r48 = r55
            r49 = r58
            r51 = r5
            r55 = r7
            r47.A0B(r48, r49, r50, r51, r52, r53, r54, r55)
            X.2wg r11 = r1.A08
            X.3kK r4 = r1.A0E
            java.lang.String r10 = r4.getSessionId()
            X.0qQ.A0B(r10, r3)
            r13 = 2
            com.instagram.common.session.UserSession r9 = r11.A00
            X.37U r12 = X.AnonymousClass37T.A00(r9)
            com.instagram.common.session.UserSession r8 = r12.A04
            r4 = 36329964420743562(0x8111e90000418a, double:3.0385540164784213E-306)
            boolean r4 = X.182.A06(r2, r8, r4)
            if (r4 == 0) goto L_0x0fdd
            if (r76 == 0) goto L_0x0f78
            java.util.Map r4 = r12.A05
            r4.clear()
            java.util.Map r4 = r12.A06
            r4.clear()
            r12.A01 = r3
            r12.A00 = r3
        L_0x0f78:
            java.util.Iterator r17 = r57.iterator()
        L_0x0f7c:
            boolean r4 = r17.hasNext()
            if (r4 == 0) goto L_0x0fdd
            java.lang.Object r4 = r17.next()
            X.1Xg r4 = (X.1Xg) r4
            X.1Xn r4 = r4.A05
            X.1Xj r5 = X.1Xi.A02(r4)
            if (r5 == 0) goto L_0x0f7c
            boolean r5 = r5.CcK()
            if (r5 != 0) goto L_0x0f7c
            X.1Xj r4 = X.1Xi.A02(r4)
            if (r4 == 0) goto L_0x0f7c
            java.lang.String r15 = r4.A36(r8, r3)
            if (r15 == 0) goto L_0x0f7c
            X.0wX r4 = r8.A03
            android.content.Context r4 = r4.A06()
            X.1Ua r4 = X.1UX.A00(r4, r8)
            boolean r4 = r4.A03(r15)
            if (r4 == 0) goto L_0x0fc3
            int r4 = r58.ordinal()
            if (r4 == r3) goto L_0x0fd2
            if (r4 == r14) goto L_0x0fcd
            if (r4 != r13) goto L_0x0fd7
            java.util.Map r5 = r12.A06
            X.4zF r4 = X.C279754zF.LOCAL_STORE_SEEN_CONTENT
        L_0x0fc0:
            r5.put(r15, r4)
        L_0x0fc3:
            java.util.Map r5 = r12.A05
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r3)
            r5.put(r15, r4)
            goto L_0x0f7c
        L_0x0fcd:
            java.util.Map r5 = r12.A06
            X.4zF r4 = X.C279754zF.PHL_CACHE_SEEN_CONTENT
            goto L_0x0fc0
        L_0x0fd2:
            java.util.Map r5 = r12.A06
            X.4zF r4 = X.C279754zF.SERVER_SEEN_CONTENT
            goto L_0x0fc0
        L_0x0fd7:
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x0fdd:
            r4 = 36329509154275492(0x81117f000140a4, double:3.038266104130803E-306)
            boolean r4 = X.182.A06(r2, r9, r4)
            if (r4 == 0) goto L_0x1093
            X.0wc r8 = X.AnonymousClass0kN.A02(r9)
            java.lang.String r5 = "ig_main_feed_update"
            X.0kJ r4 = r8.A00
            X.0Aj r12 = r8.A00(r4, r5)
            boolean r4 = r12.isSampled()
            if (r4 == 0) goto L_0x1093
            java.lang.String r13 = X.C233912wg.A00(r11, r6)
            r4 = r25
            java.lang.String r8 = X.C233912wg.A00(r11, r4)
            r4 = r57
            java.lang.String r11 = X.C233912wg.A00(r11, r4)
            java.util.Iterator r15 = r57.iterator()
            r27 = 0
            r23 = 0
        L_0x1012:
            boolean r4 = r15.hasNext()
            if (r4 == 0) goto L_0x1058
            java.lang.Object r4 = r15.next()
            X.1Xg r4 = (X.1Xg) r4
            X.1Xn r4 = r4.A05
            X.1Xj r5 = X.1Xi.A02(r4)
            if (r5 == 0) goto L_0x1012
            boolean r5 = r5.CcK()
            if (r5 != 0) goto L_0x1012
            X.1Xj r6 = X.1Xi.A02(r4)
            if (r6 == 0) goto L_0x1012
            java.lang.String r5 = r6.A36(r9, r3)
            if (r5 == 0) goto L_0x1055
            X.0wX r4 = r9.A03
            android.content.Context r4 = r4.A06()
            X.1Ua r4 = X.1UX.A00(r4, r9)
            boolean r4 = r4.A03(r5)
            if (r4 == 0) goto L_0x1055
            r19 = 1
            long r23 = r23 + r19
        L_0x104c:
            boolean r4 = r6.A5d()
            if (r4 == 0) goto L_0x1012
            long r27 = r27 + r19
            goto L_0x1012
        L_0x1055:
            r19 = 1
            goto L_0x104c
        L_0x1058:
            java.lang.String r3 = "ranking_session_id"
            r12.AAJ(r3, r10)
            java.lang.String r3 = "items_updates"
            r12.AAJ(r3, r11)
            java.lang.String r3 = "feed_before_items_change"
            r12.AAJ(r3, r8)
            java.lang.String r3 = "feed_after_items_change"
            r12.AAJ(r3, r13)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r16)
            java.lang.String r3 = "is_first_page"
            r12.A7p(r3, r4)
            java.lang.Long r4 = java.lang.Long.valueOf(r27)
            java.lang.String r3 = "items_updates_liked_count"
            r12.A9F(r3, r4)
            java.lang.Long r4 = java.lang.Long.valueOf(r23)
            java.lang.String r3 = "items_updates_sub_vpvd_count"
            r12.A9F(r3, r4)
            java.lang.String r4 = r58.toString()
            java.lang.String r3 = "delivery_method"
            r12.AAJ(r3, r4)
            r12.Cgf()
        L_0x1093:
            boolean r3 = r29.isEmpty()
            r3 = r3 ^ 1
            if (r3 == 0) goto L_0x10cd
            X.3PG r4 = X.AnonymousClass3PG.CACHED
            r3 = r58
            if (r3 == r4) goto L_0x10cd
            if (r22 == 0) goto L_0x10cd
            X.0Pk r4 = X.0Pl.A0n
            r3 = r22
            X.0Pl r3 = r4.A00(r3, r0)
            X.1sy r8 = X.1sy.A0H
            X.4DU r1 = r1.A03
            java.lang.String r6 = r1.getModuleName()
            r1 = r26
            X.0qQ.A0B(r6, r1)
            X.0s8 r5 = r3.A0L
            X.3Ys r4 = new X.3Ys
            r3 = r22
            r1 = r29
            r4.<init>(r3, r8, r6, r1)
            android.os.Message r1 = r5.obtainMessage(r14, r4)
            X.0qQ.A07(r1)
            r5.A00(r1)
        L_0x10cd:
            r4 = r60
            if (r60 == 0) goto L_0x10e5
            X.2kj r1 = r56.A0A()
            X.3GD r3 = r1.A0C()
            r3.A04 = r4
            X.2kt r1 = r3.A0C
            if (r1 == 0) goto L_0x10e2
            r1.EBt(r3)
        L_0x10e2:
            X.AnonymousClass3GD.A03(r3)
        L_0x10e5:
            if (r76 == 0) goto L_0x10f8
            r3 = 36324071725805280(0x810c8d00032ee0, double:3.034827452471474E-306)
            boolean r1 = X.182.A06(r2, r0, r3)
            if (r1 != 0) goto L_0x10f8
            r2 = r65
            r1 = r56
            r1.A0C = r2
        L_0x10f8:
            if (r18 != 0) goto L_0x1144
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r29.iterator()
        L_0x1103:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L_0x111b
            java.lang.Object r1 = r2.next()
            X.1Xg r1 = (X.1Xg) r1
            X.1Xn r1 = r1.A05
            X.1Xj r1 = X.1Xi.A02(r1)
            if (r1 == 0) goto L_0x1103
            r3.add(r1)
            goto L_0x1103
        L_0x111b:
            java.util.Iterator r4 = r3.iterator()
        L_0x111f:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L_0x1144
            java.lang.Object r1 = r4.next()
            X.1Xj r1 = (X.1Xj) r1
            java.util.List r3 = X.C231122qu.A0K(r0, r1)
            boolean r1 = r1.CcK()
            if (r1 == 0) goto L_0x111f
            if (r3 == 0) goto L_0x111f
            X.4jr r2 = X.C271944jq.A00(r0)
            boolean r1 = r3.isEmpty()
            if (r1 != 0) goto L_0x111f
            r2.A00 = r3
            goto L_0x111f
        L_0x1144:
            r1 = 0
            r0 = r16
            if (r0 != r7) goto L_0x114a
            r1 = 1
        L_0x114a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C233902wf.A00(X.Cvx, X.3UH, X.1sV, X.1FS, X.3PG, X.4gd, java.lang.Boolean, java.lang.Boolean, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.util.List, long, boolean, boolean):boolean");
    }
}
