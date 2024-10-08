package X;

import java.util.Map;

public final class IRD implements C59621JQp {
    public final /* synthetic */ C52469GTv A00;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: X.1Xl} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v12, resolved type: X.3mI} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v14, resolved type: X.GV9} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v15, resolved type: X.3mI} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v23, resolved type: X.GV9} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v24, resolved type: X.GV9} */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x03b0, code lost:
        if (r17.CcK() != false) goto L_0x02c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x013a, code lost:
        if (r5.CcK() != false) goto L_0x013c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x017a, code lost:
        if (r2 != false) goto L_0x017c;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x020d  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x0214  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x021e  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x024f  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0259  */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x02f9  */
    /* JADX WARNING: Removed duplicated region for block: B:241:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Dow(X.C67251sV r32, java.lang.String r33, java.lang.String r34, java.lang.String r35, java.util.List r36) {
        /*
            r31 = this;
            r1 = 0
            r4 = r36
            X.0qQ.A0B(r4, r1)
            r0 = r31
            X.GTv r3 = r0.A00
            int r0 = X.C249383je.DEFAULT_FIRST_VISIBLE_ITEM_POSITION
            X.Hq1 r12 = r3.A0J
            X.GUf r0 = r12.A01
            boolean r2 = r0.A0N
            if (r2 == 0) goto L_0x0017
            X.C52477GUf.A01(r0)
        L_0x0017:
            boolean r2 = r3.A0Q
            if (r2 == 0) goto L_0x00c4
            X.GUc r2 = r3.A00()
            X.2rX r2 = r2.A00
            X.IWI r2 = (X.IWI) r2
            java.util.List r2 = r2.A01
            java.util.List r8 = X.C51966G9m.A1J(r2)
            int r10 = r8.size()
        L_0x002d:
            int r10 = r10 + -1
            if (r10 < 0) goto L_0x00bd
            java.lang.Object r5 = r8.get(r10)
            boolean r2 = r5 instanceof X.AnonymousClass3OA
            if (r2 != 0) goto L_0x0043
            boolean r2 = r5 instanceof X.1Xj
            if (r2 == 0) goto L_0x002d
            boolean r2 = X.C51966G9m.A1Y(r5)
            if (r2 == 0) goto L_0x002d
        L_0x0043:
            java.lang.Object r11 = r8.get(r10)
        L_0x0047:
            com.instagram.common.session.UserSession r2 = r3.A0H
            X.3VK r7 = X.AnonymousClass3VI.A00(r2)
            r6 = 0
            int r5 = r4.size()
        L_0x0052:
            if (r6 >= r5) goto L_0x00c4
            java.lang.Object r2 = r4.get(r6)
            int r13 = r8.size()
            int r13 = r13 + r6
            boolean r9 = r2 instanceof X.AnonymousClass3OA
            if (r9 != 0) goto L_0x006b
            boolean r9 = r2 instanceof X.1Xj
            if (r9 == 0) goto L_0x00b1
            boolean r9 = X.C51966G9m.A1Y(r2)
            if (r9 == 0) goto L_0x00b1
        L_0x006b:
            if (r11 == 0) goto L_0x00af
            int r9 = r13 - r10
            int r10 = r9 + -1
            boolean r9 = r2 instanceof X.AnonymousClass3OA
            if (r9 != 0) goto L_0x007f
            boolean r9 = r2 instanceof X.1Xj
            if (r9 == 0) goto L_0x00bf
            boolean r9 = X.C51966G9m.A1Y(r2)
            if (r9 == 0) goto L_0x00bf
        L_0x007f:
            boolean r9 = r2 instanceof X.AnonymousClass3OA
            if (r9 == 0) goto L_0x00b4
            r9 = r2
            X.3OA r9 = (X.AnonymousClass3OA) r9
            X.1Xj r9 = r9.A0K
        L_0x0088:
            java.lang.Integer r11 = java.lang.Integer.valueOf(r10)
            r9.A0K = r11
            r11 = 2
            if (r10 >= r11) goto L_0x00af
            X.3VL r15 = X.AnonymousClass3VL.EXPLORE
            java.lang.Integer r16 = X.AnonymousClass05K.A0C
            r18 = 0
            java.lang.Integer r19 = java.lang.Integer.valueOf(r10)
            java.lang.Integer r17 = java.lang.Integer.valueOf(r13)
            java.lang.String r22 = r9.getId()
            X.GXs r14 = new X.GXs
            r20 = r18
            r21 = r18
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22)
            r7.A07(r14)
        L_0x00af:
            r11 = r2
            r10 = r13
        L_0x00b1:
            int r6 = r6 + 1
            goto L_0x0052
        L_0x00b4:
            java.lang.String r9 = "null cannot be cast to non-null type com.instagram.feed.media.Media"
            X.0qQ.A0C(r2, r9)
            r9 = r2
            X.1Xj r9 = (X.1Xj) r9
            goto L_0x0088
        L_0x00bd:
            r11 = 0
            goto L_0x0047
        L_0x00bf:
            java.lang.IllegalStateException r0 = X.DbT.A0m()
            throw r0
        L_0x00c4:
            com.instagram.common.session.UserSession r10 = r3.A0H
            X.0Tu r9 = X.0Tu.A05
            r5 = 36315700834340335(0x8104f000000def, double:3.029533667002168E-306)
            boolean r13 = X.182.A06(r9, r10, r5)
            java.util.ArrayList r6 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r7 = r4.iterator()
        L_0x00d9:
            boolean r2 = r7.hasNext()
            if (r2 == 0) goto L_0x00f7
            java.lang.Object r5 = r7.next()
            if (r5 == 0) goto L_0x00d9
            boolean r2 = r5 instanceof X.AnonymousClass3OA
            if (r2 != 0) goto L_0x00d9
            boolean r2 = r5 instanceof X.1Xj
            if (r2 == 0) goto L_0x00f3
            boolean r2 = X.C51966G9m.A1Y(r5)
            if (r2 != 0) goto L_0x00d9
        L_0x00f3:
            r6.add(r5)
            goto L_0x00d9
        L_0x00f7:
            r11 = r32
            if (r32 != 0) goto L_0x010d
            if (r13 == 0) goto L_0x010d
            X.0wj r8 = X.0wj.A01
            r7 = 817903268(0x30c036a4, float:1.3985368E-9)
            java.lang.String r5 = "Received null or empty gap rule values from MediaFeedResponse payload,  userSessionId = "
            java.lang.String r2 = r10.A05
            java.lang.String r2 = X.002.A0R(r5, r2)
            X.DbT.A1Q(r8, r2, r7)
        L_0x010d:
            X.GUc r2 = r3.A00()
            int r24 = r2.B5I()
            X.GUc r2 = r3.A00()
            X.2rX r8 = r2.A00
            X.IWI r8 = (X.IWI) r8
            java.util.List r2 = r8.A01
            int r7 = X.C51966G9m.A06(r2)
            r5 = 0
            if (r7 < 0) goto L_0x012c
            java.util.List r2 = r8.A01
            java.lang.Object r5 = r2.get(r7)
        L_0x012c:
            boolean r2 = r5 instanceof X.1Xj
            if (r2 == 0) goto L_0x01e1
            X.1Xj r5 = (X.1Xj) r5
        L_0x0132:
            if (r5 == 0) goto L_0x013c
            boolean r2 = r5.CcK()
            r28 = 1
            if (r2 == 0) goto L_0x013e
        L_0x013c:
            r28 = 0
        L_0x013e:
            X.2uo r10 = r3.A0O
            if (r10 == 0) goto L_0x01eb
            boolean r2 = r10 instanceof X.IY2
            if (r2 == 0) goto L_0x01eb
            if (r32 == 0) goto L_0x01eb
            if (r13 == 0) goto L_0x01eb
            X.GUc r5 = r3.A00()
            X.2rX r2 = r5.A00
            X.IWI r2 = (X.IWI) r2
            r2.A03(r6)
            X.C52476GUc.A00(r5)
            X.IY2 r10 = (X.IY2) r10
            boolean r15 = r3.A07
            java.util.ArrayList r8 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r16 = r4.iterator()
            r7 = r24
        L_0x0166:
            boolean r2 = r16.hasNext()
            if (r2 == 0) goto L_0x01fa
            java.lang.Object r6 = r16.next()
            if (r6 == 0) goto L_0x01de
            boolean r5 = r6 instanceof X.1Xj
            if (r5 == 0) goto L_0x01d7
            boolean r2 = X.C51966G9m.A1Y(r6)
        L_0x017a:
            if (r2 == 0) goto L_0x01de
        L_0x017c:
            int r14 = r11.A01
            int r13 = r11.A02
            r18 = 0
            r26 = 16225(0x3f61, float:2.2736E-41)
            X.2vl r2 = new X.2vl
            r19 = r18
            r20 = r18
            r22 = r14
            r23 = r1
            r25 = r1
            r27 = r15
            r29 = r1
            r30 = r1
            r21 = r13
            r17 = r2
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            r2.A0B(r7)
            int r13 = r11.A00
            r2.A0A(r13)
            r13 = 1636(0x664, float:2.293E-42)
            java.lang.String r13 = X.AnonymousClass000.A00(r13)
            if (r5 == 0) goto L_0x01c5
            X.GV9 r5 = new X.GV9
            r5.<init>()
            X.1Xj r6 = (X.1Xj) r6
        L_0x01b4:
            r5.A0L = r6
            r5.A00 = r2
            X.GV8 r2 = r5.A01()
            X.0qQ.A0C(r2, r13)
            r8.add(r2)
        L_0x01c2:
            int r7 = r7 + 1
            goto L_0x0166
        L_0x01c5:
            boolean r5 = r6 instanceof X.AnonymousClass3OA
            if (r5 != 0) goto L_0x01cd
            boolean r5 = r6 instanceof X.GV8
            if (r5 == 0) goto L_0x01c2
        L_0x01cd:
            X.GV9 r5 = new X.GV9
            r5.<init>()
            X.3OA r6 = (X.AnonymousClass3OA) r6
            X.1Xj r6 = r6.A0K
            goto L_0x01b4
        L_0x01d7:
            boolean r2 = r6 instanceof X.AnonymousClass3OA
            if (r2 != 0) goto L_0x017c
            boolean r2 = r6 instanceof X.GV8
            goto L_0x017a
        L_0x01de:
            r28 = 1
            goto L_0x01c2
        L_0x01e1:
            boolean r2 = r5 instanceof X.AnonymousClass3OA
            if (r2 == 0) goto L_0x013c
            X.3OA r5 = (X.AnonymousClass3OA) r5
            X.1Xj r5 = r5.A0K
            goto L_0x0132
        L_0x01eb:
            X.GUc r5 = r3.A00()
            X.2rX r2 = r5.A00
            X.IWI r2 = (X.IWI) r2
            r2.A03(r4)
            X.C52476GUc.A00(r5)
            goto L_0x0209
        L_0x01fa:
            X.2uu r5 = r10.A00
            if (r5 == 0) goto L_0x0203
            java.lang.Integer r2 = X.AnonymousClass05K.A00
            r5.Dlz(r2, r8)
        L_0x0203:
            boolean r2 = r3.A07
            if (r2 == 0) goto L_0x0209
            r3.A07 = r1
        L_0x0209:
            X.36D r2 = r3.A04
            if (r2 == 0) goto L_0x0210
            r2.A00()
        L_0x0210:
            boolean r2 = r3.A06
            if (r2 != 0) goto L_0x021a
            r12.A00()
            r2 = 1
            r3.A06 = r2
        L_0x021a:
            X.3pI r2 = r3.A00
            if (r2 == 0) goto L_0x023d
            int r7 = X.C240113Jq.A01(r2)
            X.3pI r2 = r3.A00
            int r6 = X.C240113Jq.A02(r2)
            X.2xS r5 = r3.A05
            if (r5 == 0) goto L_0x0443
            int r6 = r6 - r7
            X.4DH r2 = r3.A0E
            X.4DV r2 = (X.AnonymousClass4DV) r2
            X.3Ar r2 = r2.getScrollingViewProxy()
            X.0qQ.A07(r2)
            X.2xg r2 = r5.A0I
            r2.A02(r7, r6)
        L_0x023d:
            java.util.ArrayList r5 = X.AnonymousClass7TE.A1D(r4)
            X.0eM r4 = r0.A0y
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r4)
            X.GXc r3 = X.C52550GXb.A00(r2)
            com.instagram.discovery.chaining.model.DiscoveryChainingItem r2 = r0.A09
            if (r2 != 0) goto L_0x0259
            java.lang.String r0 = "discoveryChainingItem"
        L_0x0251:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0259:
            java.lang.String r2 = r2.A0E
            r6 = r33
            r7 = r34
            r3.A01(r2, r6, r7, r5)
            X.2mA r2 = r0.A0D
            if (r2 == 0) goto L_0x0269
            r2.A02()
        L_0x0269:
            boolean r2 = X.DbT.A1b(r5)
            if (r2 == 0) goto L_0x02ad
            X.2lW r10 = r0.A0A
            if (r10 != 0) goto L_0x0276
            java.lang.String r0 = "feedMediaLoadingLogger"
            goto L_0x0251
        L_0x0276:
            java.lang.String r8 = r0.getModuleName()
            java.lang.Integer r7 = X.AnonymousClass05K.A0C
            java.lang.Integer r3 = X.AnonymousClass05K.A0j
            r2 = 0
            r10.A01(r2, r7, r3, r8)
            X.HBA r10 = r0.A07
            if (r10 != 0) goto L_0x0289
            java.lang.String r0 = "feedMediaLoadingTracker"
            goto L_0x0251
        L_0x0289:
            java.lang.Object r8 = r5.get(r1)
            boolean r2 = r8 instanceof X.1Xj
            r7 = 0
            if (r2 == 0) goto L_0x0437
            X.1Xj r8 = (X.1Xj) r8
        L_0x0294:
            if (r8 == 0) goto L_0x02aa
            java.lang.String r3 = r8.getId()
            boolean r2 = r8.A5D()
            if (r2 == 0) goto L_0x02ab
            X.1Xj r2 = r8.A1c(r1)
            if (r2 == 0) goto L_0x02aa
            java.lang.String r7 = r2.getId()
        L_0x02aa:
            r3 = r7
        L_0x02ab:
            r10.A03 = r3
        L_0x02ad:
            X.GMC r10 = r0.A0B
            boolean r2 = r0.A0S
            if (r2 != 0) goto L_0x02fd
            com.instagram.common.session.UserSession r7 = X.AnonymousClass7TE.A0l(r4)
            r2 = 36317255612502992(0x81065a000013d0, double:3.0305169149728216E-306)
            boolean r2 = X.182.A06(r9, r7, r2)
            if (r2 != 0) goto L_0x02fd
        L_0x02c2:
            if (r10 == 0) goto L_0x02cb
            boolean r1 = X.C52477GUf.A03(r0)
            r10.A03(r1)
        L_0x02cb:
            if (r33 == 0) goto L_0x02ea
            int r2 = java.lang.Integer.parseInt(r6)
            int r1 = r0.A02
            if (r2 == r1) goto L_0x02ea
            int r1 = r0.A03
            int r1 = r1 + 1
            r0.A03 = r1
            int r1 = java.lang.Integer.parseInt(r6)
            r0.A02 = r1
            int r2 = r0.A04
            int r1 = r5.size()
            int r2 = r2 + r1
            r0.A04 = r2
        L_0x02ea:
            X.Dbx r1 = r0.A05
            if (r1 == 0) goto L_0x02f5
            X.34p r1 = r1.A00
            if (r1 == 0) goto L_0x02f5
            r1.A05()
        L_0x02f5:
            X.2mA r0 = r0.A0D
            if (r0 == 0) goto L_0x02fc
            r0.A02()
        L_0x02fc:
            return
        L_0x02fd:
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r4)
            X.0xa r2 = X.AnonymousClass7TE.A0q(r2)
            java.lang.String r7 = "nux_chaining_pill_impressions"
            int r3 = r2.getInt(r7, r1)
            r2 = 5
            if (r3 >= r2) goto L_0x02c2
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r4)
            X.0xa r3 = X.AnonymousClass7TE.A0q(r2)
            java.lang.String r2 = "nux_chaining_pill_clicks"
            int r3 = r3.getInt(r2, r1)
            r2 = 2
            if (r3 >= r2) goto L_0x02c2
            com.instagram.common.ui.widget.recyclerview.LinearLayoutManagerCompat r3 = X.C52477GUf.A00(r0)
            r17 = 0
            X.GTv r2 = r0.A05()
            r2.A00()
            java.util.HashMap r14 = X.AnonymousClass7TE.A1E()
            r13 = 0
            X.GUc r12 = X.C51968G9o.A0k(r0)
            int r11 = r3.A1c()
            int r9 = r3.A1d()
            r3 = -1
            if (r11 == r3) goto L_0x0342
            if (r9 != r3) goto L_0x0367
        L_0x0342:
            X.GUc r9 = X.C51968G9o.A0k(r0)
            r8 = 1
            int r2 = r9.getItemCount()
            if (r2 <= r8) goto L_0x03b4
            X.1Xg r2 = r9.A03()
            if (r2 == 0) goto L_0x03b4
            X.1Xg r2 = r9.A03()
            if (r2 == 0) goto L_0x03b4
            X.1Xj r2 = X.C51965G9l.A0o(r2)
            if (r2 == 0) goto L_0x03b4
            boolean r2 = r2.CcK()
            if (r2 == 0) goto L_0x03b4
            goto L_0x02c2
        L_0x0367:
            if (r11 > r9) goto L_0x03aa
            int r2 = r12.getCount()
            if (r11 >= r2) goto L_0x03aa
            java.lang.Object r15 = r12.getItem(r11)
            if (r15 == 0) goto L_0x03a7
            boolean r2 = r15 instanceof X.1Xl
            if (r2 == 0) goto L_0x03a7
            r8 = r15
            X.1Xl r8 = (X.1Xl) r8
            boolean r16 = r14.containsKey(r15)
            r2 = 1
            if (r16 == 0) goto L_0x0390
            java.lang.Object r2 = r14.get(r15)
            X.0qQ.A0A(r2)
            int r2 = X.AnonymousClass7TE.A0M(r2)
            int r2 = r2 + 1
        L_0x0390:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r14.put(r8, r2)
            java.lang.Object r2 = r14.get(r8)
            X.0qQ.A0A(r2)
            int r2 = X.AnonymousClass7TE.A0M(r2)
            if (r2 <= r13) goto L_0x03a7
            r13 = r2
            r17 = r8
        L_0x03a7:
            int r11 = r11 + 1
            goto L_0x0367
        L_0x03aa:
            if (r17 == 0) goto L_0x0342
            boolean r2 = r17.CcK()
            if (r2 == 0) goto L_0x0342
            goto L_0x02c2
        L_0x03b4:
            android.view.View r2 = r0.mView
            if (r2 == 0) goto L_0x041a
            android.content.Context r10 = r0.requireContext()
            r2 = 2131973004(0x7f13538c, float:1.9583032E38)
            java.lang.String r12 = r0.getString(r2)
            r2 = 61
            X.ICx r11 = new X.ICx
            r11.<init>(r0, r2)
            X.357 r9 = new X.357
            r14 = r8
            r13 = r3
            r9.<init>(r10, r11, r12, r13, r14)
            android.view.View r3 = r0.mView
            java.lang.String r2 = "null cannot be cast to non-null type android.widget.FrameLayout"
            X.0qQ.A0C(r3, r2)
            android.widget.FrameLayout r3 = (android.widget.FrameLayout) r3
            r9.A06(r3)
            android.content.Context r3 = r0.requireContext()
            r2 = 60
            float r2 = X.0nA.A04(r3, r2)
            int r2 = java.lang.Math.round(r2)
            r9.A02(r2)
            r2 = 81
            r9.A01(r2)
            android.view.animation.AnimationSet r2 = r9.A03
            r9.A05(r2)
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r4)
            X.0wc r3 = X.AnonymousClass0kN.A02(r2)
            java.lang.String r2 = "explore_chaining_nux_seen"
            X.0Aj r3 = X.AnonymousClass7TE.A0e(r3, r2)
            boolean r2 = r3.isSampled()
            if (r2 == 0) goto L_0x041a
            java.lang.String r2 = r0.A0J
            if (r2 != 0) goto L_0x0414
            java.lang.String r0 = "discoveryChainingModuleName"
            goto L_0x0251
        L_0x0414:
            X.C51965G9l.A1M(r3, r2)
            r3.Cgf()
        L_0x041a:
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r4)
            X.1Av r3 = X.1Au.A00(r2)
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r4)
            X.0xa r2 = X.AnonymousClass7TE.A0q(r2)
            int r1 = r2.getInt(r7, r1)
            int r2 = r1 + 1
            X.0xa r1 = r3.A01
            X.AnonymousClass7TG.A1M(r1, r7, r2)
            goto L_0x02cb
        L_0x0437:
            boolean r2 = r8 instanceof X.AnonymousClass3OA
            if (r2 == 0) goto L_0x02aa
            X.3OA r8 = (X.AnonymousClass3OA) r8
            if (r8 == 0) goto L_0x02aa
            X.1Xj r8 = r8.A0K
            goto L_0x0294
        L_0x0443:
            java.lang.String r0 = "videoFeedModule"
            goto L_0x0251
        */
        throw new UnsupportedOperationException("Method not decompiled: X.IRD.Dow(X.1sV, java.lang.String, java.lang.String, java.lang.String, java.util.List):void");
    }

    public IRD(C52469GTv gTv) {
        this.A00 = gTv;
    }

    public final int Atn() {
        return this.A00.A00().getItemCount();
    }

    public final void DED() {
        C2366634p r0;
        C52469GTv gTv = this.A00;
        C52476GUc.A00(gTv.A00());
        C55937Hq1 hq1 = gTv.A0J;
        C52477GUf gUf = hq1.A01;
        C46329Dbx dbx = gUf.A05;
        if (!(dbx == null || (r0 = dbx.A00) == null)) {
            r0.A01();
        }
        AnonymousClass2mA r02 = gUf.A0D;
        if (r02 != null) {
            r02.A00();
        }
        if (!gTv.A06) {
            hq1.A00();
            gTv.A06 = true;
        }
    }

    public final void onStart() {
        C2366634p r0;
        C52469GTv gTv = this.A00;
        C52476GUc.A00(gTv.A00());
        C52477GUf gUf = gTv.A0J.A01;
        C46329Dbx dbx = gUf.A05;
        if (!(dbx == null || (r0 = dbx.A00) == null)) {
            r0.A04();
        }
        AnonymousClass2mA r02 = gUf.A0D;
        if (r02 != null) {
            r02.A01();
        }
        if (!gTv.A06) {
            if (182.A06(0Tu.A05, AnonymousClass7TE.A0l(gUf.A0y), 36314923445324701L) && gUf.A0R) {
                AnonymousClass6ST A0h = DbV.A0h(gUf.requireActivity());
                A0h.A00(gUf.getString(2131965491));
                AnonymousClass0fN.A00(A0h);
                gUf.A0G = A0h;
            }
        }
    }

    public final void CIK(Map map) {
        int i = C249383je.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
    }
}
