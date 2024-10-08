package X;

/* renamed from: X.IoM  reason: case insensitive filesystem */
public final class C58218IoM extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;

    /* JADX WARNING: type inference failed for: r1v190, types: [X.XUJ, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v211, types: [X.XUJ, java.lang.Object] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x057a, code lost:
        X.0sr.A1T();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x0581, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:300:0x0b75, code lost:
        if (((X.AnonymousClass3ZU) r0.A04).A03.A02 == false) goto L_0x0b82;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:302:0x0b80, code lost:
        if (((X.AnonymousClass3ZU) r0.A04).A03.A02 != false) goto L_0x0b82;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:303:0x0b82, code lost:
        X.C52086GEg.A0T((X.C267324bN) null, (X.AnonymousClass0iw) r0.A01, (com.instagram.common.session.UserSession) r0.A05, X.C51968G9o.A0s((X.AnonymousClass3W1) r0.A03), ((X.1Xj) r0.A02).A2n(), true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:390:0x0fbe, code lost:
        r0 = (java.util.List) r0.A02;
        r3 = X.AnonymousClass7TG.A0r(r0);
        r8 = r0.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:392:0x0fce, code lost:
        if (r8.hasNext() == false) goto L_0x1003;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:393:0x0fd0, code lost:
        r7 = (X.C56103Hsq) r8.next();
        r2 = r7.A02.intValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:394:0x0fde, code lost:
        if (r2 == 0) goto L_0x1001;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:395:0x0fe0, code lost:
        r12 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:396:0x0fe1, code lost:
        if (r2 == 1) goto L_0x0fe4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:397:0x0fe3, code lost:
        r12 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:399:0x0fe8, code lost:
        if (r9.intValue() == 0) goto L_0x0ffe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:400:0x0fea, code lost:
        r2 = 1.0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:401:0x0fec, code lost:
        r3.add(X.HSI.A00(new android.view.animation.AccelerateDecelerateInterpolator(), r12, (X.C59536JNi) null, r2, r7.A01));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:402:0x0ffe, code lost:
        r2 = r7.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:403:0x1001, code lost:
        r12 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:404:0x1003, code lost:
        r1 = (X.C59606JQa[]) r3.toArray(new X.C59606JQa[0]);
        r0 = (X.C59606JQa[]) java.util.Arrays.copyOf(r1, r1.length);
        X.0qQ.A0B(r0, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:405:0x101b, code lost:
        return new X.IIX(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:456:0x121d, code lost:
        return X.C60340gF.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x03be, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x03bf, code lost:
        X.1zE.A00(r13, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x03c2, code lost:
        throw r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:343:0x0cff  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            r38 = this;
            r10 = 0
            r0 = r38
            int r1 = r0.A00
            switch(r1) {
                case 0: goto L_0x0054;
                case 1: goto L_0x01b3;
                case 2: goto L_0x01dc;
                case 3: goto L_0x020f;
                case 4: goto L_0x0238;
                case 5: goto L_0x02a3;
                case 6: goto L_0x02dd;
                case 7: goto L_0x0602;
                case 8: goto L_0x0787;
                case 9: goto L_0x0008;
                case 10: goto L_0x0008;
                case 11: goto L_0x0008;
                case 12: goto L_0x0827;
                case 13: goto L_0x05ed;
                case 14: goto L_0x08cf;
                case 15: goto L_0x090f;
                case 16: goto L_0x0933;
                case 17: goto L_0x0956;
                case 18: goto L_0x098d;
                case 19: goto L_0x09b3;
                case 20: goto L_0x09ce;
                case 21: goto L_0x09f0;
                case 22: goto L_0x0a9a;
                case 23: goto L_0x0ac4;
                case 24: goto L_0x0aea;
                case 25: goto L_0x0b11;
                case 26: goto L_0x0b46;
                case 27: goto L_0x0b6d;
                case 28: goto L_0x0b78;
                case 29: goto L_0x0ba1;
                case 30: goto L_0x0bdc;
                case 31: goto L_0x0d21;
                case 32: goto L_0x0d41;
                case 33: goto L_0x0d9a;
                case 34: goto L_0x0dd1;
                case 35: goto L_0x0e0e;
                case 36: goto L_0x0f21;
                case 37: goto L_0x0fa1;
                case 38: goto L_0x0fb0;
                case 39: goto L_0x101c;
                case 40: goto L_0x103f;
                case 41: goto L_0x105a;
                case 42: goto L_0x1136;
                case 43: goto L_0x115d;
                case 44: goto L_0x1186;
                case 45: goto L_0x11af;
                case 46: goto L_0x11df;
                default: goto L_0x0008;
            }
        L_0x0008:
            java.lang.Object r2 = r0.A02
            X.0r1 r2 = (X.0r1) r2
            boolean r1 = r2.A00
            r4 = 1
            r7 = r1 ^ 1
            r2.A00 = r7
            java.lang.Object r3 = r0.A05
            X.Gwq r3 = (X.C53946Gwq) r3
            java.lang.Object r8 = r0.A03
            java.util.List r8 = (java.util.List) r8
            com.instagram.common.session.UserSession r2 = r3.A03
            java.lang.Object r1 = r0.A04
            X.4jz r1 = (X.C272034jz) r1
            int[] r6 = X.C297825sP.A04(r2, r1, r4)
            X.H3l r1 = r3.A00
            boolean r5 = r1.A01
            java.lang.Object r4 = r0.A01
            X.HpB r4 = (X.C55890HpB) r4
            r2 = 0
            int r3 = r8.size()
            if (r7 == 0) goto L_0x0044
        L_0x0034:
            if (r2 >= r3) goto L_0x1216
            java.lang.Object r1 = r8.get(r2)
            X.I5e r1 = (X.C56626I5e) r1
            r0 = r6[r2]
            r1.A04(r0)
            int r2 = r2 + 1
            goto L_0x0034
        L_0x0044:
            if (r2 >= r3) goto L_0x1216
            java.lang.Object r1 = r8.get(r2)
            X.I5e r1 = (X.C56626I5e) r1
            r0 = r6[r2]
            r1.A03(r0)
            int r2 = r2 + 1
            goto L_0x0044
        L_0x0054:
            java.lang.Object r2 = r0.A05
            X.I4c r2 = (X.C56603I4c) r2
            java.lang.Object r3 = r0.A02
            android.content.Context r3 = (android.content.Context) r3
            java.lang.Object r5 = r0.A01
            X.6Qj r5 = (X.C307506Qj) r5
            java.lang.Object r1 = r0.A03
            X.Gkx r1 = (X.C53249Gkx) r1
            java.lang.Object r0 = r0.A04
            r29 = r0
            boolean r14 = X.AnonymousClass7TG.A1Z(r3, r5)
            r4 = 2
            X.AnonymousClass7TF.A1C(r1, r4, r0)
            r2.A06 = r14
            java.lang.Boolean r0 = r2.A00
            boolean r0 = X.AnonymousClass7TG.A1X(r0)
            r1.A03 = r0
            java.lang.String r0 = r2.A04
            if (r0 != 0) goto L_0x0080
            java.lang.String r0 = "UNKNOWN"
        L_0x0080:
            r1.A02 = r0
            boolean r0 = r2.A07
            if (r0 == 0) goto L_0x01aa
            java.lang.String r6 = "continuation"
        L_0x0088:
            r0 = 0
            r1.A00 = r6
            java.lang.String r6 = r2.A05
            X.0qQ.A0B(r6, r0)
            r1.A01 = r6
            X.GkW r7 = r2.A0A
            boolean r6 = r2.A07
            if (r6 == 0) goto L_0x00a5
            com.facebook.quicklog.QuickPerformanceLogger r8 = r7.A00
            r7 = 231933580(0xdd3068c, float:1.3005455E-30)
            java.lang.String r6 = "editor_native_launch_without_prefetch_complete_start"
            r8.markerPoint(r7, r6)
            r8.markerEnd(r7, r4)
        L_0x00a5:
            X.GkV r13 = r2.A09
            java.lang.String r12 = r1.A07
            java.lang.String r9 = r1.A05
            boolean r11 = r1.A03
            java.lang.String r8 = r1.A06
            java.lang.String r7 = r1.A02
            java.lang.String r6 = r1.A00
            r15 = r13
            r16 = r12
            r17 = r9
            r18 = r8
            r19 = r7
            r20 = r6
            r21 = r14
            r22 = r11
            r15.A02(r16, r17, r18, r19, r20, r21, r22)
            boolean r6 = r2.A07
            if (r6 == 0) goto L_0x01a6
            java.lang.String r6 = "AEv2 - launch w/o prefetch complete"
        L_0x00cb:
            r2.A02(r3, r6)
            long r25 = java.lang.System.nanoTime()
            long r6 = X.AnonymousClass49C.A00
            long r25 = r25 - r6
            java.lang.String r13 = r2.A03
            java.lang.String r11 = r1.A00
            java.lang.String r6 = "null cannot be cast to non-null type java.lang.Object"
            X.0qQ.A0C(r11, r6)
            java.lang.String r7 = "cache_state"
            X.0eP r17 = X.AnonymousClass7TE.A1L(r7, r11)
            boolean r7 = r1.A03
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r7)
            r7 = 295(0x127, float:4.13E-43)
            java.lang.String r7 = X.AnonymousClass000.A00(r7)
            X.0eP r18 = X.AnonymousClass7TE.A1L(r7, r11)
            long r15 = r1.A04
            java.lang.Long r11 = java.lang.Long.valueOf(r15)
            java.lang.String r7 = "last_touch_up_event_ts"
            X.0eP r19 = X.AnonymousClass7TE.A1L(r7, r11)
            X.0qQ.A0C(r9, r6)
            java.lang.String r7 = "mechanism"
            X.0eP r20 = X.AnonymousClass7TE.A1L(r7, r9)
            java.lang.String r9 = r1.A01
            X.0qQ.A0C(r9, r6)
            java.lang.String r7 = "prefetch_session_id"
            X.0eP r21 = X.AnonymousClass7TE.A1L(r7, r9)
            X.0qQ.A0C(r8, r6)
            java.lang.String r7 = X.AnonymousClass9NF.A01()
            X.0eP r22 = X.AnonymousClass7TE.A1L(r7, r8)
            java.lang.String r7 = r1.A02
            X.0qQ.A0C(r7, r6)
            java.lang.String r8 = "style_type"
            X.0eP r23 = X.AnonymousClass7TE.A1L(r8, r7)
            X.0qQ.A0C(r12, r6)
            java.lang.String r6 = "surface"
            X.0eP r24 = X.AnonymousClass7TE.A1L(r6, r12)
            X.0eP[] r6 = new X.0eP[]{r17, r18, r19, r20, r21, r22, r23, r24}
            java.util.LinkedHashMap r9 = X.0Yt.A06(r6)
            if (r13 != 0) goto L_0x0167
            r6 = 0
        L_0x013f:
            if (r6 == 0) goto L_0x121b
            X.Io9 r6 = new X.Io9
            r23 = r6
            r24 = r14
            r27 = r2
            r28 = r1
            r23.<init>(r24, r25, r27, r28, r29)
            X.FFt r2 = new X.FFt
            r2.<init>()
            X.Di6 r1 = X.C46626Di6.FULL_SCREEN
            r2.A03 = r1
            X.Di7 r1 = X.C46627Di7.DISABLED
            r2.A02 = r1
            X.DfZ r0 = X.C49940FFt.A01(r2, r6, r0)
            X.0qQ.A0B(r0, r4)
            r10.E0s(r3, r0, r5)
            goto L_0x121b
        L_0x0167:
            java.util.LinkedHashMap r7 = X.AnonymousClass7TE.A1H()
            java.util.BitSet r8 = X.DbS.A0w(r4)
            java.lang.String r6 = "launch_data_serialized"
            r7.put(r6, r13)
            r8.set(r0)
            X.0qQ.A0B(r9, r0)
            java.lang.String r6 = "logging_parameters"
            r7.put(r6, r9)
            r8.set(r14)
            int r6 = r8.nextClearBit(r0)
            if (r6 < r4) goto L_0x01ae
            X.0sm r20 = X.0Yt.A0E()
            java.util.Map r19 = X.0Yt.A0B(r7)
            r22 = 86400(0x15180, double:4.26873E-319)
            r21 = 719983200(0x2aea1260, float:4.15795E-13)
            java.lang.String r16 = "com.bloks.www.screen_query.AEVTwoScreenQuery"
            X.ShW r15 = new X.ShW
            r17 = r10
            r18 = r10
            r24 = r14
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r24)
            r10 = r15
            r6 = 1
            goto L_0x013f
        L_0x01a6:
            java.lang.String r6 = "AEv2 - launch"
            goto L_0x00cb
        L_0x01aa:
            java.lang.String r6 = r2.A01
            goto L_0x0088
        L_0x01ae:
            java.lang.IllegalStateException r0 = X.DbT.A0n()
            throw r0
        L_0x01b3:
            X.1Tq r6 = X.C226722hk.A00()
            java.lang.Object r1 = r0.A05
            X.5uo r1 = (X.C299245uo) r1
            X.2hm r4 = r1.A03
            java.lang.Object r3 = r0.A04
            X.2hl r3 = (X.C226732hl) r3
            java.lang.Object r2 = r0.A01
            java.lang.Object r1 = r0.A02
            com.facebook.common.callercontext.ContextChain r1 = (com.facebook.common.callercontext.ContextChain) r1
            java.lang.Object r0 = r0.A03
            X.579 r0 = (X.AnonymousClass579) r0
            r7 = r10
            r8 = r1
            r9 = r10
            r11 = r4
            r12 = r3
            r13 = r10
            r14 = r0
            r15 = r2
            boolean r0 = r6.AUi(r7, r8, r9, r10, r11, r12, r13, r14, r15)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            return r1
        L_0x01dc:
            java.lang.Object r1 = r0.A02
            X.0r1 r1 = (X.0r1) r1
            boolean r1 = r1.A00
            if (r1 == 0) goto L_0x01f5
            java.lang.Object r2 = r0.A05
            android.widget.TextView r2 = (android.widget.TextView) r2
            java.lang.Object r1 = r0.A01
            X.GbJ r1 = (X.C52706GbJ) r1
            X.GbO r1 = r1.A03
            if (r1 == 0) goto L_0x020a
            android.text.method.KeyListener r1 = r1.A0H
            r2.setKeyListener(r1)
        L_0x01f5:
            java.lang.Object r1 = r0.A04
            X.0rm r1 = (X.0rm) r1
            java.lang.Object r1 = r1.A00
            if (r1 == 0) goto L_0x121b
            java.lang.Object r0 = r0.A03
            X.GbP r0 = (X.C52712GbP) r0
            if (r0 == 0) goto L_0x121b
            java.util.List r0 = r0.A00
            r0.remove(r1)
            goto L_0x121b
        L_0x020a:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x020f:
            java.lang.Object r6 = r0.A05
            X.QDN r6 = (X.QDN) r6
            java.lang.Object r5 = r0.A03
            X.SUj r5 = (X.SUj) r5
            X.0qQ.A0A(r5)
            java.lang.Object r4 = r0.A02
            androidx.fragment.app.Fragment r4 = (androidx.fragment.app.Fragment) r4
            java.lang.Object r3 = r0.A04
            android.view.ContextThemeWrapper r3 = (android.view.ContextThemeWrapper) r3
            java.lang.Object r2 = r0.A01
            android.os.Bundle r2 = (android.os.Bundle) r2
            r0 = 921(0x399, float:1.29E-42)
            java.lang.String r1 = X.Pxd.A00(r0)
            java.lang.String r0 = "edit_card_from_alert_dialog"
            X.STa.A04(r6, r1, r0)
            X.QDT r0 = r6.A1R
            r0.AGm(r2, r3, r4, r5)
            goto L_0x121b
        L_0x0238:
            java.lang.Object r1 = r0.A02
            java.lang.Object r1 = X.C51966G9m.A18(r1)
            X.Gmp r1 = (X.C53365Gmp) r1
            java.lang.String r5 = r1.A06
            if (r5 == 0) goto L_0x121b
            java.lang.Object r1 = r0.A04
            X.0lg r1 = (X.0lg) r1
            java.lang.Object r9 = r0.A01
            X.0iw r9 = (X.AnonymousClass0iw) r9
            java.lang.Object r6 = r0.A05
            X.GgM r6 = (X.C52969GgM) r6
            long r2 = r6.A02
            long r11 = java.lang.System.currentTimeMillis()
            long r7 = r6.A00
            long r11 = r11 - r7
            java.lang.String r7 = r6.A09
            X.AnonymousClass7TG.A1N(r1, r9)
            X.0wc r4 = X.AnonymousClass0kN.A01(r9, r1)
            java.lang.String r1 = "barcelona_media_viewer_ig_cta_tap"
            X.0Aj r4 = X.AnonymousClass7TE.A0e(r4, r1)
            boolean r1 = r4.isSampled()
            if (r1 == 0) goto L_0x028a
            X.DbW.A15(r4, r9)
            java.lang.String r1 = X.DbY.A0a()
            X.C51965G9l.A1K(r4, r1)
            X.C51970G9q.A18(r4, r2)
            java.lang.Long r2 = java.lang.Long.valueOf(r11)
            java.lang.String r1 = "duration_ms"
            r4.A9F(r1, r2)
            X.C51965G9l.A1O(r4, r7)
            r4.Cgf()
        L_0x028a:
            java.lang.Object r2 = r0.A03
            X.0sI r2 = (X.0sI) r2
            java.lang.String r13 = r9.getModuleName()
            X.2EG r14 = X.2EG.A2V
            long r0 = r6.A01
            java.lang.Long r15 = java.lang.Long.valueOf(r0)
            r11 = r2
            r12 = r5
            r16 = r10
            r11.invoke(r12, r13, r14, r15, r16)
            goto L_0x121b
        L_0x02a3:
            java.lang.Object r1 = r0.A05
            X.5vQ r1 = (X.C299575vQ) r1
            X.5vJ r1 = r1.Be5()
            X.5vH r1 = r1.A01
            int r2 = r1.ordinal()
            r3 = 1
            if (r2 == r3) goto L_0x02cb
            r1 = 0
            if (r2 != r1) goto L_0x02d8
            java.lang.Object r2 = r0.A01
            X.5Oz r2 = (X.C284945Oz) r2
            boolean r1 = X.C51971G9r.A1W(r2)
            if (r1 != 0) goto L_0x121b
            java.lang.Object r0 = r0.A03
        L_0x02c3:
            X.DbS.A1U(r0)
            X.C51967G9n.A16(r2, r3)
            goto L_0x121b
        L_0x02cb:
            java.lang.Object r2 = r0.A02
            X.5Oz r2 = (X.C284945Oz) r2
            boolean r1 = X.C51971G9r.A1W(r2)
            if (r1 != 0) goto L_0x121b
            java.lang.Object r0 = r0.A04
            goto L_0x02c3
        L_0x02d8:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x02dd:
            java.lang.Object r8 = r0.A02
            com.instagram.bugreporter.model.BugReport r8 = (com.instagram.bugreporter.model.BugReport) r8
            java.lang.Object r6 = r0.A01
            java.util.List r6 = (java.util.List) r6
            java.lang.Object r2 = r0.A04
            java.util.Collection r2 = (java.util.Collection) r2
            java.lang.Object r5 = r0.A03
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.lang.Object r1 = r0.A05
            r0 = 26
            X.Iwb r4 = new X.Iwb
            r4.<init>(r1, r0)
            r11 = 0
            X.0qQ.A0B(r8, r11)
            r3 = 1
            X.DbZ.A0t(r3, r6, r2, r5)
            org.json.JSONObject r1 = X.DbS.A11()
            java.util.Set r20 = X.00k.A0k(r5)
            java.util.Iterator r19 = r6.iterator()
        L_0x030a:
            boolean r5 = r19.hasNext()
            java.lang.String r18 = "media_source"
            java.lang.String r17 = "media_type"
            r0 = 646(0x286, float:9.05E-43)
            java.lang.String r16 = X.C273654mx.A00(r0)
            if (r5 == 0) goto L_0x03c3
            java.lang.Object r12 = r19.next()
            X.0eP r12 = (X.0eP) r12
            java.lang.Object r10 = r12.A00
            com.meta.flytrap.attachment.model.BugReportAttachment r10 = (com.meta.flytrap.attachment.model.BugReportAttachment) r10
            java.lang.String r13 = r10.A03
            java.io.File r0 = new java.io.File
            r0.<init>(r13)
            java.lang.String r9 = r0.getName()
            org.json.JSONObject r7 = X.DbS.A11()
            java.io.File r0 = new java.io.File
            r0.<init>(r13)
            long r5 = r0.length()
            java.lang.String r0 = "attachment_size_bytes"
            r7.put(r0, r5)
            java.lang.String r5 = "file_hash_algo"
            java.lang.String r0 = "sha256"
            r7.put(r5, r0)
            java.io.File r14 = new java.io.File
            r14.<init>(r13)
            X.2RM r15 = X.AnonymousClass2RJ.A00
            long r5 = r14.length()
            int r13 = (int) r5
            r5 = 0
            if (r13 < 0) goto L_0x0358
            r5 = 1
        L_0x0358:
            r0 = 716(0x2cc, float:1.003E-42)
            java.lang.String r0 = X.Pxd.A00(r0)
            X.17k.A0C(r0, r13, r5)
            X.2RO r15 = r15.A02()
            java.io.FileInputStream r13 = new java.io.FileInputStream
            r13.<init>(r14)
            r14 = 1024(0x400, float:1.435E-42)
            byte[] r6 = new byte[r14]     // Catch:{ all -> 0x03bc }
        L_0x036e:
            int r5 = r13.read(r6)     // Catch:{ all -> 0x03bc }
            r0 = -1
            if (r5 == r0) goto L_0x037c
            X.17k.A03(r11, r5, r14)     // Catch:{ all -> 0x03bc }
            r15.A02(r6, r11, r5)     // Catch:{ all -> 0x03bc }
            goto L_0x036e
        L_0x037c:
            r13.close()
            X.2RS r0 = r15.A03()
            java.lang.String r5 = X.DbT.A10(r0)
            java.lang.String r0 = "file_hash"
            r7.put(r0, r5)
            org.json.JSONObject r5 = X.DbS.A11()
            com.meta.flytrap.attachment.model.BugReportAttachmentMediaType r6 = r10.A01
            r0 = r17
            r5.put(r0, r6)
            com.meta.flytrap.attachment.model.BugReportAttachmentMediaSource r6 = r10.A00
            r0 = r18
            r5.put(r0, r6)
            r0 = r20
            boolean r0 = r0.contains(r12)
            if (r0 == 0) goto L_0x03ab
            java.lang.String r0 = "demoted_sync_attachment"
            r5.put(r0, r3)
        L_0x03ab:
            r0 = r16
            r7.put(r0, r5)
            java.lang.String r5 = r10.A02
            java.lang.String r0 = "client_attachment_generator_name"
            r7.put(r0, r5)
            r1.put(r9, r7)
            goto L_0x030a
        L_0x03bc:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x03be }
        L_0x03be:
            r0 = move-exception
            X.1zE.A00(r13, r1)
            throw r0
        L_0x03c3:
            java.util.List r5 = r8.A0L
            X.0sn r12 = X.0sn.A00
            r0 = r12
            java.util.Iterator r9 = r5.iterator()
        L_0x03cc:
            boolean r5 = r9.hasNext()
            r7 = 0
            if (r5 == 0) goto L_0x03f4
            java.lang.Object r5 = r9.next()
            java.util.List r5 = (java.util.List) r5
            java.lang.Object r5 = X.00k.A0O(r5, r11)
            com.meta.flytrap.attachment.model.BugReportAttachment r5 = (com.meta.flytrap.attachment.model.BugReportAttachment) r5
            if (r5 == 0) goto L_0x03f2
            com.meta.flytrap.attachment.model.BugReportAttachmentMediaType r6 = r5.A01
            com.meta.flytrap.attachment.model.BugReportAttachmentMediaSource r5 = r5.A00
            X.0eP r5 = X.AnonymousClass7TE.A1L(r6, r5)
            java.util.List r5 = X.AnonymousClass7TE.A1I(r5)
        L_0x03ed:
            java.util.ArrayList r12 = X.00k.A0S(r5, r12)
            goto L_0x03cc
        L_0x03f2:
            r5 = r0
            goto L_0x03ed
        L_0x03f4:
            java.util.List r5 = r8.A0K
            java.util.Iterator r9 = r5.iterator()
        L_0x03fa:
            boolean r5 = r9.hasNext()
            if (r5 == 0) goto L_0x0417
            java.lang.Object r5 = r9.next()
            com.meta.flytrap.attachment.model.BugReportAttachment r5 = (com.meta.flytrap.attachment.model.BugReportAttachment) r5
            com.meta.flytrap.attachment.model.BugReportAttachmentMediaType r6 = r5.A01
            com.meta.flytrap.attachment.model.BugReportAttachmentMediaSource r5 = r5.A00
            X.0eP r5 = X.AnonymousClass7TE.A1L(r6, r5)
            java.util.List r5 = X.AnonymousClass7TE.A1I(r5)
            java.util.ArrayList r12 = X.00k.A0S(r5, r12)
            goto L_0x03fa
        L_0x0417:
            java.util.ArrayList r9 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r11 = r12.iterator()
        L_0x041f:
            boolean r5 = r11.hasNext()
            if (r5 == 0) goto L_0x0436
            java.lang.Object r10 = r11.next()
            r5 = r10
            X.0eP r5 = (X.0eP) r5
            java.lang.Object r6 = r5.A00
            com.meta.flytrap.attachment.model.BugReportAttachmentMediaType r5 = com.meta.flytrap.attachment.model.BugReportAttachmentMediaType.SCREENSHOT
            if (r6 != r5) goto L_0x041f
            r9.add(r10)
            goto L_0x041f
        L_0x0436:
            java.util.ArrayList r5 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r12 = r12.iterator()
        L_0x043e:
            boolean r6 = r12.hasNext()
            if (r6 == 0) goto L_0x0455
            java.lang.Object r11 = r12.next()
            r6 = r11
            X.0eP r6 = (X.0eP) r6
            java.lang.Object r10 = r6.A00
            com.meta.flytrap.attachment.model.BugReportAttachmentMediaType r6 = com.meta.flytrap.attachment.model.BugReportAttachmentMediaType.VIDEO
            if (r10 != r6) goto L_0x043e
            r5.add(r11)
            goto L_0x043e
        L_0x0455:
            com.meta.flytrap.attachment.model.AttachmentCounter r6 = r8.A01
            java.util.ArrayList r12 = r6.A00
            int r23 = r12.size()
            com.meta.flytrap.attachment.model.AttachmentCounter r6 = r8.A02
            java.util.ArrayList r11 = r6.A00
            int r6 = r11.size()
            int r23 = r23 - r6
            int r6 = r9.size()
            int r23 = r23 - r6
            com.meta.flytrap.attachment.model.AttachmentCounter r6 = r8.A03
            java.util.ArrayList r10 = r6.A00
            int r24 = r10.size()
            com.meta.flytrap.attachment.model.AttachmentCounter r6 = r8.A04
            java.util.ArrayList r6 = r6.A00
            int r8 = r6.size()
            int r24 = r24 - r8
            int r8 = r5.size()
            int r24 = r24 - r8
            if (r24 < 0) goto L_0x0582
            if (r23 < 0) goto L_0x0582
            java.util.List r8 = X.00k.A0b(r12)
            java.util.Iterator r4 = r11.iterator()
        L_0x0491:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x049f
            java.lang.Object r0 = r4.next()
            r8.remove(r0)
            goto L_0x0491
        L_0x049f:
            java.util.ArrayList r11 = X.AnonymousClass7TF.A0p(r9)
            java.util.Iterator r4 = r9.iterator()
        L_0x04a7:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x04b9
            java.lang.Object r0 = r4.next()
            X.0eP r0 = (X.0eP) r0
            java.lang.Object r0 = r0.A01
            r11.add(r0)
            goto L_0x04a7
        L_0x04b9:
            java.util.Iterator r4 = r11.iterator()
        L_0x04bd:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x04cb
            java.lang.Object r0 = r4.next()
            r8.remove(r0)
            goto L_0x04bd
        L_0x04cb:
            java.util.List r10 = X.00k.A0b(r10)
            java.util.Iterator r4 = r6.iterator()
        L_0x04d3:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x04e1
            java.lang.Object r0 = r4.next()
            r10.remove(r0)
            goto L_0x04d3
        L_0x04e1:
            java.util.ArrayList r6 = X.AnonymousClass7TF.A0p(r5)
            java.util.Iterator r4 = r5.iterator()
        L_0x04e9:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x04fb
            java.lang.Object r0 = r4.next()
            X.0eP r0 = (X.0eP) r0
            java.lang.Object r0 = r0.A01
            r6.add(r0)
            goto L_0x04e9
        L_0x04fb:
            java.util.Iterator r4 = r6.iterator()
        L_0x04ff:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x050d
            java.lang.Object r0 = r4.next()
            r10.remove(r0)
            goto L_0x04ff
        L_0x050d:
            java.util.ArrayList r6 = X.AnonymousClass7TF.A0p(r8)
            java.util.Iterator r9 = r8.iterator()
            r4 = 0
        L_0x0516:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x0544
            java.lang.Object r8 = r9.next()
            int r5 = r4 + 1
            if (r4 < 0) goto L_0x057a
            com.meta.flytrap.attachment.model.BugReportAttachmentMediaSource r8 = (com.meta.flytrap.attachment.model.BugReportAttachmentMediaSource) r8
            X.3uA[] r0 = com.meta.flytrap.attachment.model.BugReportAttachment.A05
            java.lang.String r0 = "screenshot_missing_"
            java.lang.String r22 = X.002.A0O(r0, r4)
            com.meta.flytrap.attachment.model.BugReportAttachmentMediaType r21 = com.meta.flytrap.attachment.model.BugReportAttachmentMediaType.SCREENSHOT
            java.lang.String r23 = "missing_attachment"
            com.meta.flytrap.attachment.model.BugReportAttachment r4 = new com.meta.flytrap.attachment.model.BugReportAttachment
            r19 = r4
            r20 = r8
            r24 = r3
            r19.<init>(r20, r21, r22, r23, r24)
            X.Nj0 r0 = X.C69299Nj0.FILE_NOT_GENERATED
            X.AnonymousClass7TF.A1I(r4, r0, r6)
            r4 = r5
            goto L_0x0516
        L_0x0544:
            java.util.ArrayList r9 = X.AnonymousClass7TF.A0p(r10)
            java.util.Iterator r10 = r10.iterator()
        L_0x054c:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x059a
            java.lang.Object r8 = r10.next()
            int r5 = r7 + 1
            if (r7 < 0) goto L_0x057a
            com.meta.flytrap.attachment.model.BugReportAttachmentMediaSource r8 = (com.meta.flytrap.attachment.model.BugReportAttachmentMediaSource) r8
            X.3uA[] r0 = com.meta.flytrap.attachment.model.BugReportAttachment.A05
            java.lang.String r0 = "video_missing_"
            java.lang.String r22 = X.002.A0O(r0, r7)
            com.meta.flytrap.attachment.model.BugReportAttachmentMediaType r21 = com.meta.flytrap.attachment.model.BugReportAttachmentMediaType.VIDEO
            java.lang.String r23 = "missing_attachment"
            com.meta.flytrap.attachment.model.BugReportAttachment r4 = new com.meta.flytrap.attachment.model.BugReportAttachment
            r19 = r4
            r20 = r8
            r24 = r3
            r19.<init>(r20, r21, r22, r23, r24)
            X.Nj0 r0 = X.C69299Nj0.FILE_NOT_GENERATED
            X.AnonymousClass7TF.A1I(r4, r0, r9)
            r7 = r5
            goto L_0x054c
        L_0x057a:
            X.0sr.A1T()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0582:
            java.lang.String r19 = "Invariant violated: missingScreenshots="
            java.lang.String r20 = ", missingVideos="
            java.lang.String r21 = ", attachedScreenshots="
            int r25 = r9.size()
            java.lang.String r22 = ", attachedVideos="
            int r26 = r5.size()
            java.lang.String r3 = X.002.A10(r19, r20, r21, r22, r23, r24, r25, r26)
            r4.invoke(r3)
            goto L_0x059e
        L_0x059a:
            java.util.ArrayList r0 = X.00k.A0S(r9, r6)
        L_0x059e:
            java.util.ArrayList r0 = X.00k.A0S(r0, r2)
            java.util.Iterator r7 = r0.iterator()
        L_0x05a6:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0601
            java.lang.Object r3 = r7.next()
            X.0eP r3 = (X.0eP) r3
            java.lang.Object r6 = r3.A00
            com.meta.flytrap.attachment.model.BugReportAttachment r6 = (com.meta.flytrap.attachment.model.BugReportAttachment) r6
            java.lang.String r2 = r6.A03
            java.io.File r0 = new java.io.File
            r0.<init>(r2)
            java.lang.String r5 = r0.getName()
            org.json.JSONObject r4 = X.DbS.A11()
            java.lang.Object r0 = r3.A01
            X.Nj0 r0 = (X.C69299Nj0) r0
            java.lang.String r2 = r0.name()
            java.lang.String r0 = "missing_reason"
            r4.put(r0, r2)
            org.json.JSONObject r3 = X.DbS.A11()
            com.meta.flytrap.attachment.model.BugReportAttachmentMediaType r2 = r6.A01
            r0 = r17
            r3.put(r0, r2)
            com.meta.flytrap.attachment.model.BugReportAttachmentMediaSource r2 = r6.A00
            r0 = r18
            r3.put(r0, r2)
            r0 = r16
            r4.put(r0, r3)
            r1.put(r5, r4)
            goto L_0x05a6
        L_0x05ed:
            java.lang.Object r4 = r0.A05
            X.6Sr r4 = (X.C308096Sr) r4
            java.lang.Object r3 = r0.A02
            java.lang.Object r2 = r0.A03
            java.lang.Object r1 = r0.A01
            java.lang.Object r0 = r0.A04
            boolean r0 = r4.A01(r3, r2, r1, r0)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
        L_0x0601:
            return r1
        L_0x0602:
            r3 = 2
            java.lang.String r4 = "FACIAL_LANDMARKS"
            r2 = 0
            java.lang.String r1 = "FACIAL_LANDMARKS_SCORES"
            r10 = 1
            java.lang.String[] r1 = new java.lang.String[]{r4, r1}
            X.0sr.A1P(r1)
            java.lang.Object r1 = r0.A05
            X.H8K r1 = (X.H8K) r1
            X.0eM r1 = r1.A01
            java.lang.Object r6 = r1.getValue()
            X.Hlr r6 = (X.C55694Hlr) r6
            java.lang.Object r1 = r0.A01
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            X.XH4 r5 = new X.XH4
            r5.<init>(r1)
            java.lang.Object r4 = r0.A02
            float[] r4 = (float[]) r4
            X.GjY r1 = new X.GjY
            r1.<init>(r4)
            X.XSt[] r1 = new X.C21288XSt[]{r5, r1}
            java.util.List r4 = X.0sr.A1P(r1)
            java.lang.String r1 = r6.A00
            if (r1 == 0) goto L_0x0735
            X.7xm r7 = r6.A01
            if (r7 != 0) goto L_0x0644
            X.7xm r7 = X.C347997xi.A00(r1)     // Catch:{ Exception -> 0x0740 }
            r6.A01 = r7     // Catch:{ Exception -> 0x0740 }
        L_0x0644:
            java.util.ArrayList r6 = X.AnonymousClass7TE.A1C()
            android.graphics.Bitmap r14 = X.C51976G9y.A06(r4)
            java.lang.Object r4 = r4.get(r10)
            java.lang.String r1 = "null cannot be cast to non-null type com.aiplatform.inputs.AiInputFloatArray"
            X.0qQ.A0C(r4, r1)
            X.GjY r4 = (X.C53162GjY) r4
            float[] r8 = r4.A00
            int r1 = r14.getWidth()
            int r12 = r14.getHeight()
            int r13 = r12 * r1
            int[] r9 = new int[r13]
            r5 = 0
            r18 = r2
            r19 = r2
            r20 = r1
            r21 = r12
            r16 = r2
            r17 = r1
            r15 = r9
            r14.getPixels(r15, r16, r17, r18, r19, r20, r21)
            int r17 = r13 * 2
            int r4 = r1 * 3
            int r4 = r4 * r12
            java.nio.FloatBuffer r11 = org.pytorch.Tensor.allocateFloatBuffer(r4)
        L_0x067f:
            if (r5 >= r13) goto L_0x06a8
            r4 = r9[r5]
            int r14 = r4 >> 16
            r14 = r14 & 255(0xff, float:3.57E-43)
            float r14 = (float) r14
            r16 = 1132396544(0x437f0000, float:255.0)
            float r14 = r14 / r16
            int r15 = r4 >> 8
            r15 = r15 & 255(0xff, float:3.57E-43)
            float r15 = (float) r15
            float r15 = r15 / r16
            r4 = r4 & 255(0xff, float:3.57E-43)
            float r4 = (float) r4
            float r4 = r4 / r16
            r11.put(r5, r4)
            int r4 = r5 + r13
            r11.put(r4, r15)
            int r4 = r5 + r17
            r11.put(r4, r14)
            int r5 = r5 + 1
            goto L_0x067f
        L_0x06a8:
            r4 = 4
            long[] r9 = new long[r4]
            r4 = 1
            r9[r2] = r4
            r4 = 3
            r9[r10] = r4
            long r4 = (long) r12
            r9[r3] = r4
            long r4 = (long) r1
            r1 = 3
            r9[r1] = r4
            X.XF6 r5 = X.XF6.CONTIGUOUS
            org.pytorch.Tensor r4 = org.pytorch.Tensor.fromBlob((java.nio.FloatBuffer) r11, (long[]) r9, (X.XF6) r5)
            long[] r1 = new long[r3]
            r1 = {1, 4} // fill-array
            org.pytorch.Tensor r1 = org.pytorch.Tensor.fromBlob((float[]) r8, (long[]) r1, (X.XF6) r5)
            org.pytorch.IValue r4 = org.pytorch.IValue.from((org.pytorch.Tensor) r4)
            org.pytorch.IValue r1 = org.pytorch.IValue.from((org.pytorch.Tensor) r1)
            org.pytorch.IValue[] r4 = new org.pytorch.IValue[]{r4, r1}
            X.8EJ r1 = r7.A00
            org.pytorch.IValue r4 = r1.forward(r4)
            boolean r1 = r4.isTuple()
            if (r1 == 0) goto L_0x0717
            org.pytorch.IValue[] r11 = r4.toTuple()
            java.util.ArrayList r8 = X.DbV.A15(r11)
            int r1 = r11.length
            if (r1 <= r3) goto L_0x072c
            r9 = 0
            r1 = r11[r2]
            org.pytorch.Tensor r1 = r1.toTensor()
            float[] r7 = r1.getDataAsFloatArray()
            java.util.ArrayList r5 = X.AnonymousClass7TE.A1C()
            int r1 = r7.length
            int r1 = r1 + -1
            int r4 = X.C70002Hb.A00(r2, r1, r3)
            if (r4 < 0) goto L_0x071a
        L_0x0704:
            r3 = r7[r9]
            int r1 = r9 + 1
            r2 = r7[r1]
            android.graphics.PointF r1 = new android.graphics.PointF
            r1.<init>(r3, r2)
            r5.add(r1)
            if (r9 == r4) goto L_0x071a
            int r9 = r9 + 2
            goto L_0x0704
        L_0x0717:
            X.0sn r8 = X.0sn.A00
            goto L_0x072c
        L_0x071a:
            r1 = r11[r10]
            org.pytorch.Tensor r1 = r1.toTensor()
            float[] r2 = r1.getDataAsFloatArray()
            X.GjZ r1 = new X.GjZ
            r1.<init>(r5, r2)
            r8.add(r1)
        L_0x072c:
            r6.addAll(r8)
            X.9ZE r2 = new X.9ZE
            r2.<init>(r6)
            goto L_0x075e
        L_0x0735:
            X.XUJ r1 = new X.XUJ
            r1.<init>()
            X.XHE r2 = new X.XHE
            r2.<init>(r1)
            goto L_0x075e
        L_0x0740:
            r3 = move-exception
            java.lang.StringBuilder r2 = X.AnonymousClass7TE.A1A()
            r1 = 455(0x1c7, float:6.38E-43)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            r2.append(r1)
            r2.append(r3)
            r2.toString()
            X.XUJ r1 = new X.XUJ
            r1.<init>()
            X.XHE r2 = new X.XHE
            r2.<init>(r1)
        L_0x075e:
            boolean r1 = r2 instanceof X.AnonymousClass9ZE
            if (r1 == 0) goto L_0x077e
            java.lang.Object r3 = r0.A04
            X.0rm r3 = (X.0rm) r3
            X.9ZE r2 = (X.AnonymousClass9ZE) r2
            java.util.List r1 = r2.A00
            java.lang.Object r2 = X.00k.A0J(r1)
            boolean r1 = r2 instanceof X.C53163GjZ
            if (r1 != 0) goto L_0x0773
            r2 = 0
        L_0x0773:
            r3.A00 = r2
        L_0x0775:
            java.lang.Object r0 = r0.A03
            java.util.concurrent.CountDownLatch r0 = (java.util.concurrent.CountDownLatch) r0
            r0.countDown()
            goto L_0x121b
        L_0x077e:
            boolean r1 = r2 instanceof X.XHE
            if (r1 != 0) goto L_0x0775
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0787:
            java.lang.Object r3 = r0.A05
            X.IPS r3 = (X.IPS) r3
            com.instagram.common.session.UserSession r11 = r3.A03
            X.Mf0 r1 = X.C52319GNl.A00(r11)
            java.lang.Object r9 = r0.A04
            X.4jz r9 = (X.C272034jz) r9
            java.lang.Integer r6 = r1.A00(r9)
            if (r6 == 0) goto L_0x121b
            X.0sJ r5 = r3.A08
            java.lang.Object r2 = r0.A02
            X.7a7 r2 = (X.C333777a7) r2
            java.lang.String r1 = r2.A0I
            java.lang.Integer r4 = r2.A0B
            if (r4 == 0) goto L_0x0808
            java.lang.String r4 = X.C2606846q.A00(r4)
        L_0x07ab:
            r5.invoke(r1, r4, r9, r6)
            X.I6I r17 = X.I6I.A00
            r4 = 1
            int[] r16 = X.C297825sP.A04(r11, r9, r4)
            boolean r15 = r2.A0f
            boolean r14 = r3.A00
            X.4DU r4 = r3.A04
            java.lang.String r8 = r4.getModuleName()
            java.lang.Object r7 = r0.A01
            X.HpB r7 = (X.C55890HpB) r7
            java.lang.Object r12 = r0.A03
            java.util.List r12 = (java.util.List) r12
            r23 = 22
            X.IoC r22 = new X.IoC
            r24 = r7
            r25 = r3
            r26 = r12
            r27 = r9
            r22.<init>(r23, r24, r25, r26, r27)
            r0 = 27
            X.J6O r13 = new X.J6O
            r13.<init>(r3, r0)
            r0 = 11
            X.JG1 r6 = new X.JG1
            r6.<init>(r0, r2, r3)
            r5 = 0
            boolean r4 = X.AnonymousClass7TF.A1U(r5, r7, r1)
            X.C51974G9v.A1M(r9, r11, r12)
            r0 = 8
            X.0qQ.A0B(r8, r0)
            int r3 = r12.size()
            r2 = 0
        L_0x07f6:
            if (r2 >= r3) goto L_0x080b
            java.lang.Object r1 = X.00k.A0O(r12, r2)
            X.I5e r1 = (X.C56626I5e) r1
            if (r1 == 0) goto L_0x0805
            r0 = r16[r2]
            r1.A03(r0)
        L_0x0805:
            int r2 = r2 + 1
            goto L_0x07f6
        L_0x0808:
            java.lang.String r4 = "null"
            goto L_0x07ab
        L_0x080b:
            X.C297825sP.A04(r11, r9, r4)
            r23 = r13
            r24 = r6
            r25 = r5
            r26 = r15
            r27 = r14
            r18 = r11
            r19 = r9
            r20 = r10
            r21 = r8
            r16 = r7
            X.I6I.A01(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            goto L_0x121b
        L_0x0827:
            java.lang.Object r2 = r0.A05
            X.Gwq r2 = (X.C53946Gwq) r2
            com.instagram.common.session.UserSession r11 = r2.A03
            X.Mf0 r1 = X.C52319GNl.A00(r11)
            java.lang.Object r9 = r0.A04
            X.4jz r9 = (X.C272034jz) r9
            java.lang.Integer r7 = r1.A00(r9)
            if (r7 == 0) goto L_0x121b
            X.GgO r6 = r2.A02
            X.7a7 r5 = r2.A01
            java.lang.String r1 = r5.A0I
            java.lang.Integer r3 = r5.A0B
            if (r3 == 0) goto L_0x08b0
            java.lang.String r4 = X.C2606846q.A00(r3)
        L_0x0849:
            int r3 = r7.intValue()
            r6.A0U(r9, r1, r4, r3)
            X.I6I r17 = X.I6I.A00
            java.lang.Object r8 = r0.A01
            X.HpB r8 = (X.C55890HpB) r8
            java.lang.Object r7 = r0.A03
            java.util.List r7 = (java.util.List) r7
            r3 = 1
            int[] r16 = X.C297825sP.A04(r11, r9, r3)
            boolean r15 = r5.A0f
            java.lang.Object r3 = r0.A02
            X.0r1 r3 = (X.0r1) r3
            boolean r14 = r3.A00
            X.4DU r0 = r2.A04
            java.lang.String r12 = r0.getModuleName()
            r23 = 11
            X.IoM r22 = new X.IoM
            r24 = r8
            r25 = r3
            r26 = r2
            r27 = r9
            r28 = r7
            r22.<init>(r23, r24, r25, r26, r27, r28)
            r0 = 43
            X.J6O r13 = new X.J6O
            r13.<init>(r2, r0)
            r0 = 46
            X.J6t r6 = new X.J6t
            r6.<init>(r2, r0)
            r5 = 0
            boolean r4 = X.AnonymousClass7TF.A1U(r5, r8, r1)
            X.C51974G9v.A1M(r9, r11, r7)
            r0 = 8
            X.0qQ.A0B(r12, r0)
            int r3 = r7.size()
            r2 = 0
        L_0x089e:
            if (r2 >= r3) goto L_0x08b3
            java.lang.Object r1 = X.00k.A0O(r7, r2)
            X.I5e r1 = (X.C56626I5e) r1
            if (r1 == 0) goto L_0x08ad
            r0 = r16[r2]
            r1.A03(r0)
        L_0x08ad:
            int r2 = r2 + 1
            goto L_0x089e
        L_0x08b0:
            java.lang.String r4 = "null"
            goto L_0x0849
        L_0x08b3:
            X.C297825sP.A04(r11, r9, r4)
            r23 = r13
            r24 = r6
            r25 = r5
            r26 = r15
            r27 = r14
            r18 = r11
            r19 = r9
            r20 = r10
            r21 = r12
            r16 = r8
            X.I6I.A01(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            goto L_0x121b
        L_0x08cf:
            java.lang.Object r10 = r0.A05
            X.GMs r10 = (X.C52302GMs) r10
            java.lang.Object r8 = r0.A04
            X.3Y5 r8 = (X.AnonymousClass3Y5) r8
            java.lang.Object r6 = r0.A01
            java.lang.Object r7 = r0.A02
            java.lang.Object r9 = r0.A03
            r5 = 0
            X.MsA r4 = new X.MsA
            r4.<init>(r5, r6, r7, r8, r9, r10)
            android.content.Context r0 = X.C243803a8.A00(r8)
            X.2Vt r1 = new X.2Vt
            r1.<init>(r0, r4)
            com.instagram.contentnotes.domain.uistate.SocialContextBubbleUiState r4 = r10.A03
            com.instagram.common.session.UserSession r3 = r10.A02
            X.0iw r0 = r10.A01
            java.lang.String r2 = r0.getModuleName()
            X.C51973G9u.A1E(r4, r3, r2)
            java.lang.String r0 = "clips_viewer"
            boolean r0 = X.00p.A0k(r2, r0, r5)
            if (r0 == 0) goto L_0x0906
            r0 = 1
        L_0x0902:
            r1.setIsLongpressEnabled(r0)
            return r1
        L_0x0906:
            com.instagram.api.schemas.SocialContextType r2 = r4.A02
            com.instagram.api.schemas.SocialContextType r0 = com.instagram.api.schemas.SocialContextType.LIKED_BY
            boolean r0 = X.AnonymousClass7TF.A1W(r2, r0)
            goto L_0x0902
        L_0x090f:
            java.lang.Object r1 = r0.A04
            X.82i r1 = (X.C3498982i) r1
            X.A5F r1 = r1.A01
            java.lang.String r5 = r1.A01
            java.lang.Object r4 = r0.A05
            com.instagram.common.session.UserSession r4 = (com.instagram.common.session.UserSession) r4
            java.lang.Object r3 = r0.A01
            androidx.fragment.app.FragmentActivity r3 = (androidx.fragment.app.FragmentActivity) r3
            java.lang.Object r2 = r0.A03
            android.content.Context r2 = (android.content.Context) r2
            java.lang.Object r0 = r0.A02
            X.88D r0 = (X.AnonymousClass88D) r0
            X.Ab8 r1 = new X.Ab8
            r6 = r1
            r7 = r2
            r8 = r3
            r9 = r4
            r10 = r0
            r11 = r5
            r6.<init>(r7, r8, r9, r10, r11)
            return r1
        L_0x0933:
            java.lang.Object r5 = r0.A05
            com.instagram.common.session.UserSession r5 = (com.instagram.common.session.UserSession) r5
            java.lang.Object r4 = r0.A03
            X.4DH r4 = (X.AnonymousClass4DH) r4
            java.lang.Object r3 = r0.A04
            androidx.fragment.app.FragmentActivity r3 = (androidx.fragment.app.FragmentActivity) r3
            java.lang.Object r2 = r0.A01
            X.0iw r2 = (X.AnonymousClass0iw) r2
            java.lang.Object r0 = r0.A02
            android.content.Context r0 = (android.content.Context) r0
            android.content.Context r7 = X.DbT.A05(r0)
            X.8Za r1 = new X.8Za
            r6 = r1
            r8 = r3
            r9 = r4
            r10 = r2
            r11 = r5
            r6.<init>(r7, r8, r9, r10, r11)
            return r1
        L_0x0956:
            java.util.ArrayList r1 = X.AnonymousClass7TE.A1C()
            java.lang.Object r2 = r0.A02
            if (r2 == 0) goto L_0x0961
            r1.add(r2)
        L_0x0961:
            java.lang.Object r2 = r0.A04
            if (r2 == 0) goto L_0x0968
            r1.add(r2)
        L_0x0968:
            java.lang.Object r2 = r0.A05
            X.8ME r2 = (X.AnonymousClass8ME) r2
            com.instagram.ui.widget.interactive.InteractiveDrawableContainer r2 = r2.A1m
            r1.add(r2)
            java.lang.Object r4 = r0.A01
            X.2eb r4 = (X.C71662eb) r4
            android.view.View r3 = r4.A00
            r2 = 0
            if (r3 == 0) goto L_0x097b
            r2 = 1
        L_0x097b:
            if (r2 == 0) goto L_0x0987
            android.view.View r2 = r4.A01()
            X.0qQ.A07(r2)
            r1.add(r2)
        L_0x0987:
            java.lang.Object r0 = r0.A03
            r1.add(r0)
            return r1
        L_0x098d:
            java.lang.Object r3 = r0.A03
            X.FBq r3 = (X.C49890FBq) r3
            boolean r1 = r3.A08()
            if (r1 == 0) goto L_0x09a8
            java.lang.Object r2 = r0.A02
            X.5Oz r2 = (X.C284945Oz) r2
            java.lang.Object r1 = r0.A01
            X.5Oz r1 = (X.C284945Oz) r1
            java.lang.Object r0 = r0.A05
            X.Y43 r0 = (X.Y43) r0
            r3.A07(r2, r1, r0)
            goto L_0x121b
        L_0x09a8:
            java.lang.Object r0 = r0.A04
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L_0x121b
            r3.A06(r0)
            goto L_0x121b
        L_0x09b3:
            java.lang.Object r1 = r0.A05
            X.AcO r1 = (X.C40453AcO) r1
            X.7Wa r4 = r1.A06
            java.lang.Object r3 = r0.A04
            android.view.View r3 = (android.view.View) r3
            java.lang.Object r2 = r0.A03
            androidx.recyclerview.widget.RecyclerView r2 = (androidx.recyclerview.widget.RecyclerView) r2
            java.lang.Object r1 = r0.A02
            com.instagram.direct.messagethread.store.intf.MessageListLayoutManager r1 = (com.instagram.direct.messagethread.store.intf.MessageListLayoutManager) r1
            java.lang.Object r0 = r0.A01
            X.7Zg r0 = (X.C333517Zg) r0
            r4.Dys(r3, r2, r0, r1)
            goto L_0x121b
        L_0x09ce:
            java.lang.Object r2 = r0.A05
            X.HqG r2 = (X.C55952HqG) r2
            X.HOn r1 = X.C54682HOn.TAP_DONE
            r2.A00(r1, r10)
            java.lang.Object r3 = r0.A03
            if (r3 == 0) goto L_0x121b
            java.lang.Object r4 = r0.A02
            X.4Cq r4 = (X.C262224Cq) r4
            java.lang.Object r1 = r0.A04
            java.lang.Object r0 = r0.A01
            r11 = 19
            X.MfO r2 = new X.MfO
            r6 = r2
            r7 = r3
            r8 = r0
            r9 = r1
            r6.<init>(r7, r8, r9, r10, r11)
            goto L_0x0dcc
        L_0x09f0:
            java.util.ArrayList r2 = X.AnonymousClass7TE.A1C()
            java.lang.Object r1 = r0.A02
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r6 = r0.A01
            X.0sP r6 = (X.0sP) r6
            java.util.ArrayList r5 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r4 = r1.iterator()
        L_0x0a04:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L_0x0a18
            java.lang.Object r3 = r4.next()
            boolean r1 = X.C51971G9r.A1a(r3, r6)
            if (r1 == 0) goto L_0x0a04
            r5.add(r3)
            goto L_0x0a04
        L_0x0a18:
            java.lang.Object r1 = r0.A03
            X.0sP r1 = (X.0sP) r1
            java.lang.Object r3 = r0.A04
            java.util.Map r3 = (java.util.Map) r3
            java.util.Iterator r7 = r5.iterator()
        L_0x0a24:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x121b
            java.lang.Object r4 = r7.next()
            X.3su r4 = (X.C254703su) r4
            X.3tI r0 = r4.A0P()
            if (r0 == 0) goto L_0x0a8e
            java.lang.String r0 = r0.A0T
            if (r0 == 0) goto L_0x0a8e
            java.lang.Object r5 = r3.get(r0)
            X.3su r5 = (X.C254703su) r5
            if (r5 == 0) goto L_0x0a8e
            X.3tI r0 = r4.A0P()
            if (r0 == 0) goto L_0x0a98
            java.lang.String r13 = r0.A0S
        L_0x0a4a:
            java.lang.String r12 = r5.A0h()
            java.lang.String r14 = r5.A0f()
            if (r14 != 0) goto L_0x0a56
            java.lang.String r14 = "0"
        L_0x0a56:
            X.2FW r9 = r5.A10
            java.lang.Object r11 = X.C70058Nwa.A00(r5, r13)
            java.lang.String r15 = r5.A1u
            java.lang.String r0 = r5.A1q
            boolean r18 = r5.A1S()
            X.2FW r10 = r5.A0z
            r6 = 387(0x183, float:5.42E-43)
            java.lang.String r16 = X.C66579MXk.A00(r6)
            X.OU1 r8 = new X.OU1
            r17 = r0
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            X.UVA r0 = r5.A0l
            r8.A07 = r0
            X.3tI r0 = new X.3tI
            r0.<init>(r8)
            r4.A13(r0)
            com.google.common.collect.ImmutableList r0 = r5.A0H()
            if (r0 == 0) goto L_0x0a8e
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0a8e
            r2.add(r4)
        L_0x0a8e:
            boolean r0 = X.DbT.A1b(r2)
            if (r0 == 0) goto L_0x0a24
            r1.invoke(r2)
            goto L_0x0a24
        L_0x0a98:
            r13 = 0
            goto L_0x0a4a
        L_0x0a9a:
            java.lang.Object r4 = r0.A05
            X.Ma7 r4 = (X.C66638Ma7) r4
            X.OO1 r3 = r4.A03
            java.lang.Object r1 = r0.A03
            X.0rm r1 = (X.0rm) r1
            java.lang.Object r2 = r1.A00
            java.lang.String r2 = (java.lang.String) r2
            r1 = 7028(0x1b74, float:9.848E-42)
            r3.A03(r10, r1, r2)
            X.ONf r4 = r4.A02
            java.lang.Object r1 = r0.A02
            X.1OS r1 = (X.1OS) r1
            java.lang.String r3 = r1.A05
            X.4gN r2 = X.C270214gN.A0M
            java.lang.Object r1 = r0.A01
            X.Pwk r1 = (X.C74551Pwk) r1
            java.lang.Object r0 = r0.A04
            com.instagram.direct.armadilloexpress.transportpayload.TransportPayload r0 = (com.instagram.direct.armadilloexpress.transportpayload.TransportPayload) r0
            r4.A01(r0, r1, r2, r3)
            goto L_0x121b
        L_0x0ac4:
            java.lang.Object r3 = r0.A01
            X.4Fy r3 = (X.C262774Fy) r3
            java.lang.Object r2 = r0.A04
            X.4Fw r2 = (X.C262754Fw) r2
            java.lang.Object r1 = r0.A03
            android.content.Context r4 = X.C51969G9p.A0L(r1)
            java.lang.Object r1 = r0.A05
            X.Gve r1 = (X.C53873Gve) r1
            X.4DU r1 = r1.A05
            java.lang.Object r0 = r0.A02
            X.3W1 r0 = (X.AnonymousClass3W1) r0
            int r0 = r0.A03
            r5 = r2
            r6 = r1
            r7 = r10
            r8 = r0
            r3.A02(r4, r5, r6, r7, r8)
            X.3dj r1 = X.C58243Iom.A00()
            return r1
        L_0x0aea:
            java.lang.Object r1 = r0.A04
            X.4Fw r1 = (X.C262754Fw) r1
            X.3dW r2 = r1.A0F
            java.lang.Object r4 = r0.A01
            X.1Xj r4 = (X.1Xj) r4
            java.lang.Object r6 = r0.A02
            X.3W1 r6 = (X.AnonymousClass3W1) r6
            java.lang.Object r1 = r0.A05
            X.Gve r1 = (X.C53873Gve) r1
            X.2xS r7 = r1.A0B
            java.lang.Object r0 = r0.A03
            android.content.Context r3 = X.C51966G9m.A0Q(r0)
            X.4DU r5 = r1.A05
            X.3et r0 = r2.A00(r3, r4, r5, r6, r7)
            float r0 = r0.A00
            java.lang.Float r1 = java.lang.Float.valueOf(r0)
            return r1
        L_0x0b11:
            java.lang.Object r1 = r0.A02
            X.1Xj r1 = (X.1Xj) r1
            boolean r1 = X.1sx.A0J(r1)
            if (r1 == 0) goto L_0x0b44
            java.lang.Object r8 = r0.A04
            java.lang.Object r6 = r0.A01
            java.lang.Object r7 = r0.A05
            java.lang.Object r5 = r0.A03
            r4 = 1
            X.LgR r3 = new X.LgR
            r3.<init>(r4, r5, r6, r7, r8)
        L_0x0b29:
            java.lang.Object r0 = r0.A05
            X.0lg r0 = (X.0lg) r0
            X.1Ng r2 = X.AnonymousClass1Nd.A00(r0)
            if (r3 == 0) goto L_0x0b38
            java.lang.Class<X.INk> r0 = X.C57070INk.class
            r2.A01(r3, r0)
        L_0x0b38:
            r1 = 35
            X.Inr r0 = new X.Inr
            r0.<init>(r1, r3, r2)
            X.3dj r1 = X.C51965G9l.A0V(r0)
            return r1
        L_0x0b44:
            r3 = 0
            goto L_0x0b29
        L_0x0b46:
            java.lang.Object r1 = r0.A05
            X.3Yc r1 = (X.C243273Yc) r1
            java.lang.Object r6 = r0.A01
            X.1Xj r6 = (X.1Xj) r6
            java.lang.Object r5 = r0.A02
            X.4DU r5 = (X.AnonymousClass4DU) r5
            java.lang.Object r4 = r0.A03
            X.3Ds r4 = (X.C238863Ds) r4
            java.lang.Object r3 = r0.A04
            android.view.View r3 = (android.view.View) r3
            com.instagram.common.session.UserSession r2 = r1.A00
            X.3Dp r1 = X.C238833Dp.A00(r2)
            X.3e7 r0 = new X.3e7
            r0.<init>(r10, r2, r6, r5)
            r1.A0A(r3, r0)
            r1.A05(r3, r4)
            goto L_0x121b
        L_0x0b6d:
            java.lang.Object r1 = r0.A04
            X.3ZU r1 = (X.AnonymousClass3ZU) r1
            X.3ZS r1 = r1.A03
            boolean r1 = r1.A02
            if (r1 != 0) goto L_0x121b
            goto L_0x0b82
        L_0x0b78:
            java.lang.Object r1 = r0.A04
            X.3ZU r1 = (X.AnonymousClass3ZU) r1
            X.3ZS r1 = r1.A03
            boolean r1 = r1.A02
            if (r1 == 0) goto L_0x121b
        L_0x0b82:
            java.lang.Object r3 = r0.A05
            com.instagram.common.session.UserSession r3 = (com.instagram.common.session.UserSession) r3
            java.lang.Object r2 = r0.A01
            X.0iw r2 = (X.AnonymousClass0iw) r2
            java.lang.Object r1 = r0.A02
            X.1Xj r1 = (X.1Xj) r1
            java.lang.String r5 = r1.A2n()
            java.lang.Object r0 = r0.A03
            X.3W1 r0 = (X.AnonymousClass3W1) r0
            java.lang.Integer r4 = X.C51968G9o.A0s(r0)
            r6 = 1
            r1 = r10
            X.C52086GEg.A0T(r1, r2, r3, r4, r5, r6)
            goto L_0x121b
        L_0x0ba1:
            java.lang.Object r5 = r0.A01
            android.app.Activity r5 = (android.app.Activity) r5
            if (r5 == 0) goto L_0x0bbe
            java.lang.Object r4 = r0.A05
            com.instagram.common.session.UserSession r4 = (com.instagram.common.session.UserSession) r4
            java.lang.Object r3 = r0.A04
            com.instagram.user.model.User r3 = (com.instagram.user.model.User) r3
            java.lang.Object r1 = r0.A03
            java.lang.String r2 = X.C51966G9m.A1F(r1)
            r1 = 930(0x3a2, float:1.303E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            X.FH6.A04(r5, r4, r3, r1, r2)
        L_0x0bbe:
            java.lang.Object r1 = r0.A02
            com.instagram.profile.fragment.UserDetailFragment r1 = (com.instagram.profile.fragment.UserDetailFragment) r1
            X.Dc6 r0 = r1.A10
            com.instagram.user.model.User r3 = r0.A03
            if (r3 == 0) goto L_0x121b
            X.6x7 r0 = r1.A0x
            if (r0 == 0) goto L_0x121b
            X.710 r2 = r0.BhL()
            r1 = 0
            r0 = 930(0x3a2, float:1.303E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r2.D2b(r3, r0, r1)
            goto L_0x121b
        L_0x0bdc:
            java.lang.Object r7 = r0.A04
            X.3uh r7 = (X.C255773uh) r7
            X.LOb r1 = r7.A0E
            r1.getClass()
            X.L4p r1 = r1.A03
            X.BHe r1 = r1.A00
            java.util.List r11 = r1.A05
            r6 = 0
            r2 = 0
            if (r11 == 0) goto L_0x0c4b
            java.lang.Object r1 = X.00k.A0O(r11, r6)
            X.BHf r1 = (X.C42102BHf) r1
            if (r1 == 0) goto L_0x0c4b
            X.1Xj r1 = r1.A00
            r18 = r1
        L_0x0bfb:
            if (r11 == 0) goto L_0x0c49
            java.lang.Object r1 = X.00k.A0O(r11, r6)
            X.BHf r1 = (X.C42102BHf) r1
            if (r1 == 0) goto L_0x0c49
            X.1Xj r1 = r1.A00
            if (r1 == 0) goto L_0x0c49
            com.instagram.user.model.User r8 = X.C51966G9m.A11(r1)
        L_0x0c0d:
            java.lang.Object r5 = r0.A03
            X.6V4 r5 = (X.AnonymousClass6V4) r5
            X.0eM r12 = r5.A01
            java.lang.Object r9 = r12.getValue()
            android.widget.TextView r9 = (android.widget.TextView) r9
            java.lang.Object r1 = r0.A02
            android.content.Context r1 = (android.content.Context) r1
            X.0qQ.A0A(r1)
            X.0qq r4 = X.AnonymousClass0qo.A00(r1)
            X.0qm r3 = X.0qm.A0V
            android.graphics.Typeface r3 = r4.A02(r3)
            r9.setTypeface(r3)
            if (r11 == 0) goto L_0x0c47
            java.lang.Object r3 = X.00k.A0O(r11, r6)
            X.BHf r3 = (X.C42102BHf) r3
            if (r3 == 0) goto L_0x0c47
            java.lang.Long r13 = r3.A01
        L_0x0c39:
            r11 = 4
            if (r13 == 0) goto L_0x0ca4
            r14 = 0
            long r3 = r13.longValue()
            int r9 = (r3 > r14 ? 1 : (r3 == r14 ? 0 : -1))
            if (r9 == 0) goto L_0x0ca4
            goto L_0x0c4e
        L_0x0c47:
            r13 = 0
            goto L_0x0c39
        L_0x0c49:
            r8 = r10
            goto L_0x0c0d
        L_0x0c4b:
            r18 = r10
            goto L_0x0bfb
        L_0x0c4e:
            r9 = 220(0xdc, float:3.08E-43)
            java.lang.String r9 = X.C273654mx.A00(r9)     // Catch:{ Exception -> 0x0c81 }
            java.util.Locale r15 = java.util.Locale.ENGLISH     // Catch:{ Exception -> 0x0c81 }
            java.text.SimpleDateFormat r14 = new java.text.SimpleDateFormat     // Catch:{ Exception -> 0x0c81 }
            r14.<init>(r9, r15)     // Catch:{ Exception -> 0x0c81 }
            r15 = 1000(0x3e8, double:4.94E-321)
            long r3 = r3 * r15
            java.util.Date r9 = new java.util.Date     // Catch:{ Exception -> 0x0c81 }
            r9.<init>(r3)     // Catch:{ Exception -> 0x0c81 }
            java.lang.Object r4 = r12.getValue()     // Catch:{ Exception -> 0x0c81 }
            com.instagram.common.ui.base.IgTextView r4 = (com.instagram.common.ui.base.IgTextView) r4     // Catch:{ Exception -> 0x0c81 }
            java.lang.String r3 = r14.format(r9)     // Catch:{ Exception -> 0x0c81 }
            X.0qQ.A07(r3)     // Catch:{ Exception -> 0x0c81 }
            java.lang.String r3 = X.AnonymousClass7TF.A0k(r3)     // Catch:{ Exception -> 0x0c81 }
            r4.setText(r3)     // Catch:{ Exception -> 0x0c81 }
            java.lang.Object r3 = r12.getValue()     // Catch:{ Exception -> 0x0c81 }
            com.instagram.common.ui.base.IgTextView r3 = (com.instagram.common.ui.base.IgTextView) r3     // Catch:{ Exception -> 0x0c81 }
            r3.setVisibility(r6)     // Catch:{ Exception -> 0x0c81 }
            goto L_0x0ca7
        L_0x0c81:
            r9 = move-exception
            java.lang.StringBuilder r4 = X.AnonymousClass7TE.A1A()
            java.lang.String r3 = "Date Parsing Failed["
            r4.append(r3)
            r4.append(r13)
            java.lang.String r3 = "] - "
            r4.append(r3)
            java.lang.String r3 = r9.getMessage()
            java.lang.String r4 = X.AnonymousClass7TF.A0l(r3, r4)
            java.lang.String r3 = "Day One Card"
            X.C14164Tr2.A01(r3, r4)
            X.DbW.A1R(r12, r11)
            goto L_0x0ca7
        L_0x0ca4:
            X.DbW.A1R(r12, r11)
        L_0x0ca7:
            X.0eM r3 = r5.A04
            java.lang.Object r3 = r3.getValue()
            com.instagram.common.ui.widget.imageview.IgImageView r3 = (com.instagram.common.ui.widget.imageview.IgImageView) r3
            java.lang.Object r4 = r0.A01
            X.0iw r4 = (X.AnonymousClass0iw) r4
            r17 = 240(0xf0, float:3.36E-43)
            java.lang.String r16 = "day_one"
            X.I05 r11 = new X.I05
            r12 = r4
            r13 = r3
            r14 = r18
            r15 = r10
            r18 = r6
            r19 = r6
            r11.<init>((X.AnonymousClass0iw) r12, (com.instagram.common.ui.widget.imageview.IgImageView) r13, (X.1Xj) r14, (java.lang.Integer) r15, (java.lang.String) r16, (int) r17, (boolean) r18, (boolean) r19)
            r5.A07(r11)
            X.0eM r3 = r5.A02
            java.lang.Object r9 = r3.getValue()
            com.instagram.common.ui.widget.imageview.IgImageView r9 = (com.instagram.common.ui.widget.imageview.IgImageView) r9
            r3 = 2131237728(0x7f081b60, float:1.8091715E38)
            java.lang.Integer r15 = java.lang.Integer.valueOf(r3)
            r17 = 112(0x70, float:1.57E-43)
            X.I05 r3 = new X.I05
            r11 = r3
            r13 = r9
            r14 = r10
            r11.<init>((X.AnonymousClass0iw) r12, (com.instagram.common.ui.widget.imageview.IgImageView) r13, (X.1Xj) r14, (java.lang.Integer) r15, (java.lang.String) r16, (int) r17, (boolean) r18, (boolean) r19)
            r5.A07(r3)
            X.0eM r3 = r5.A00
            java.lang.Object r9 = r3.getValue()
            com.instagram.common.ui.widget.imageview.IgImageView r9 = (com.instagram.common.ui.widget.imageview.IgImageView) r9
            r3 = 2131237729(0x7f081b61, float:1.8091717E38)
            java.lang.Integer r15 = java.lang.Integer.valueOf(r3)
            X.I05 r3 = new X.I05
            r11 = r3
            r13 = r9
            r11.<init>((X.AnonymousClass0iw) r12, (com.instagram.common.ui.widget.imageview.IgImageView) r13, (X.1Xj) r14, (java.lang.Integer) r15, (java.lang.String) r16, (int) r17, (boolean) r18, (boolean) r19)
            r5.A07(r3)
            if (r8 == 0) goto L_0x0d13
            java.lang.Object r3 = r0.A05
            com.instagram.common.session.UserSession r3 = (com.instagram.common.session.UserSession) r3
            X.ADW r2 = X.ADW.A00
            X.0qQ.A0A(r1)
            r0 = 16
            android.graphics.drawable.Drawable r2 = r2.A00(r1, r3, r8, r0)
            X.0eM r0 = r5.A03
            X.C56816IDn.A00(r2, r5, r8, r0)
        L_0x0d13:
            android.view.ViewGroup r1 = r5.A04()
            X.M9g r0 = new X.M9g
            r0.<init>(r2, r7, r5, r8)
            r1.post(r0)
            goto L_0x121b
        L_0x0d21:
            java.lang.Object r5 = r0.A05
            com.instagram.common.session.UserSession r5 = (com.instagram.common.session.UserSession) r5
            java.lang.Object r4 = r0.A03
            X.1Xj r4 = (X.1Xj) r4
            X.HOJ r3 = X.HOJ.INFO_BOTTOM_SHEET_DISMISSED
            java.lang.Object r2 = r0.A01
            com.instagram.api.schemas.IGAdTransparencyDisclaimerPlacement r2 = (com.instagram.api.schemas.IGAdTransparencyDisclaimerPlacement) r2
            java.lang.Object r1 = r0.A04
            X.HMd r1 = (X.C54646HMd) r1
            X.I3z.A01(r3, r2, r5, r4, r1)
            java.lang.Object r0 = r0.A02
            X.0sa r0 = (X.C62320sa) r0
            if (r0 == 0) goto L_0x121b
            r0.invoke()
            goto L_0x121b
        L_0x0d41:
            java.lang.Object r5 = r0.A02
            android.content.Context r5 = (android.content.Context) r5
            java.lang.Object r6 = r0.A05
            X.Vjo r6 = (X.C18012Vjo) r6
            X.0eM r1 = r6.A02
            java.lang.Object r4 = r1.getValue()
            X.Trf r4 = (X.C14200Trf) r4
            java.lang.Object r7 = r0.A04
            com.instagram.common.session.UserSession r7 = (com.instagram.common.session.UserSession) r7
            java.lang.Object r3 = r0.A01
            X.0iw r3 = (X.AnonymousClass0iw) r3
            r2 = 1
            X.UqR r1 = new X.UqR
            r1.<init>(r6, r2)
            X.Pui r13 = X.C67445Mo0.A00
            java.lang.Object r0 = r0.A03
            java.lang.Integer r0 = (java.lang.Integer) r0
            r17 = 0
            X.VWN r8 = new X.VWN
            r12 = r7
            r14 = r1
            r15 = r0
            r16 = r10
            r18 = r17
            r19 = r2
            r9 = r5
            r11 = r3
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            X.0eM r0 = r6.A04
            java.lang.Object r3 = r0.getValue()
            X.X4Z r3 = (X.X4Z) r3
            X.0eM r0 = r6.A06
            java.lang.Object r2 = r0.getValue()
            X.X4b r2 = (X.C20910X4b) r2
            r1 = 5
            X.We9 r0 = new X.We9
            r0.<init>(r6, r1)
            X.UdQ r1 = new X.UdQ
            r9 = r1
            r10 = r5
            r11 = r4
            r12 = r3
            r13 = r2
            r14 = r8
            r15 = r0
            r9.<init>(r10, r11, r12, r13, r14, r15)
            return r1
        L_0x0d9a:
            java.lang.Object r3 = r0.A01
            X.JRO r3 = (X.JRO) r3
            java.lang.Object r2 = r0.A02
            X.4bN r2 = (X.C267324bN) r2
            X.HMA r1 = X.HMA.REMIND_ME_PENDING
            r3.EiN(r2, r1)
            java.lang.Object r5 = r0.A04
            com.instagram.user.model.UpcomingEvent r5 = (com.instagram.user.model.UpcomingEvent) r5
            com.instagram.upcomingevents.common.model.UpcomingEventReminderAction r4 = com.instagram.upcomingevents.common.model.UpcomingEventReminderAction.SET_REMINDER
            java.lang.Object r3 = r0.A03
            X.1Xj r3 = (X.1Xj) r3
            java.lang.String r2 = "clips_reminder_ad_cta_bar_set_online_reminder"
            X.L8U r1 = new X.L8U
            r1.<init>(r3, r4, r5, r2)
            java.lang.Object r0 = r0.A05
            X.ViN r0 = (X.C17932ViN) r0
            X.0xx r4 = r0.A01
            r17 = 33
            X.MHL r2 = new X.MHL
            r11 = r2
            r12 = r5
            r13 = r1
            r14 = r3
            r15 = r0
            r16 = r10
            r11.<init>(r12, r13, r14, r15, r16, r17)
        L_0x0dcc:
            X.AnonymousClass7TE.A1Z(r2, r4)
            goto L_0x121b
        L_0x0dd1:
            java.lang.Object r1 = r0.A04
            X.3Y5 r1 = (X.AnonymousClass3Y5) r1
            X.C243803a8.A00(r1)
            java.lang.Object r1 = r0.A02
            if (r1 == 0) goto L_0x0e09
            com.meta.foa.accountswitcher.UserAccountInfo r1 = (com.meta.foa.accountswitcher.UserAccountInfo) r1
            com.meta.foa.accountswitcher.UserAccountInfo[] r1 = new com.meta.foa.accountswitcher.UserAccountInfo[]{r1}
            java.util.ArrayList r6 = X.0sr.A1M(r1)
            java.lang.Object r1 = r0.A03
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            X.018.A16(r1, r6)
            java.lang.Object r5 = r0.A01
            X.F3q r5 = (X.C49726F3q) r5
            X.F3f r4 = X.C55358HgQ.A00
            java.lang.Object r0 = r0.A05
            X.Gu2 r0 = (X.C53773Gu2) r0
            com.meta.foa.session.FoaUserSession r3 = r0.A00
            java.lang.String r2 = r0.A01
            java.lang.String r0 = r0.A02
            com.meta.foa.accountswitcher.DBLSwitcherArgs r1 = new com.meta.foa.accountswitcher.DBLSwitcherArgs
            r1.<init>(r3, r2, r0, r6)
            X.J50 r0 = X.J50.A00
            r5.A02(r4, r1, r0)
            goto L_0x121b
        L_0x0e09:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0e0e:
            java.lang.Object r4 = r0.A05
            X.Gw2 r4 = (X.Gw2) r4
            java.lang.Object r1 = r0.A03
            X.2Wa r1 = (X.2Wa) r1
            java.lang.Object r8 = r1.A03
            X.HLi r8 = (X.C54625HLi) r8
            java.lang.Object r3 = r0.A02
            X.HLi r3 = (X.C54625HLi) r3
            java.lang.Object r7 = r0.A01
            X.F3q r7 = (X.C49726F3q) r7
            java.lang.Object r0 = r0.A04
            X.2Wb r0 = (X.2Wb) r0
            android.content.Context r9 = X.C243803a8.A00(r0)
            com.meta.foa.session.FoaUserSession r0 = r4.A00
            java.lang.String r2 = r4.A01
            java.lang.String r14 = r4.A02
            r10 = 0
            boolean r5 = X.AnonymousClass7TF.A1U(r10, r0, r2)
            r1 = 2
            X.C51973G9u.A0r(r1, r14, r8, r3)
            com.instagram.common.session.UserSession r6 = X.C56316HwT.A00(r0)
            java.lang.String r0 = r6.A06
            r16 = r0
            java.lang.Long r15 = X.AnonymousClass7TE.A10(r16)
            X.DeL r13 = X.C46400DeN.A00(r2)
            int r0 = r3.ordinal()
            if (r0 == r10) goto L_0x0f13
            if (r0 == r5) goto L_0x0f0f
            if (r0 != r1) goto L_0x0f1c
            X.HOQ r12 = X.HOQ.SNOOZED
        L_0x0e55:
            int r11 = r8.ordinal()
            if (r11 == r10) goto L_0x0f0b
            if (r11 == r5) goto L_0x0f07
            if (r11 != r1) goto L_0x0f17
            X.HOQ r4 = X.HOQ.SNOOZED
        L_0x0e61:
            long r2 = X.1Q0.A00()
            double r0 = (double) r2
            X.0wc r3 = X.AnonymousClass0kN.A02(r6)
            java.lang.String r2 = "notification_dot_setting_saved"
            X.0Aj r2 = X.AnonymousClass7TE.A0e(r3, r2)
            boolean r3 = r2.isSampled()
            if (r3 == 0) goto L_0x0ea8
            java.lang.String r3 = "raw_initiator_account_id"
            r2.A9F(r3, r15)
            X.DeK r15 = X.C46397DeK.INSTAGRAM
            java.lang.String r3 = "initiator_account_type"
            r2.A8M(r15, r3)
            X.DbW.A12(r2, r0)
            java.lang.String r0 = "event_session_id"
            r2.AAJ(r0, r14)
            X.DbS.A1F(r13, r2)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r5)
            java.lang.String r0 = "is_cds"
            r2.A7p(r0, r1)
            java.lang.String r0 = "manage_notification_sheet"
            X.DbS.A1H(r2, r0)
            java.lang.String r0 = "notification_setting_before"
            r2.A8M(r12, r0)
            java.lang.String r0 = "notification_setting_after"
            r2.A8M(r4, r0)
            r2.Cgf()
        L_0x0ea8:
            X.1An r0 = X.1An.A1U
            java.lang.String r0 = r0.toString()
            X.0tX r3 = X.0xn.A01(r0)
            if (r11 == r10) goto L_0x0efb
            if (r11 == r5) goto L_0x0eed
            r0 = 18583425843006435(0x42058700150be3, double:2.0049685724370253E-307)
            X.1AW.A05(r0)
            X.0Tu r2 = X.0Tu.A04
            X.0qQ.A08(r2)
            long r1 = X.1AW.A01(r2, r0)
            int r0 = (int) r1
            long r4 = (long) r0
            r0 = 1000(0x3e8, double:4.94E-321)
            long r4 = r4 * r0
            X.0xY r3 = r3.AR4()
            java.lang.String r2 = X.AnonymousClass3H8.A00(r16)
            long r0 = java.lang.System.currentTimeMillis()
            long r0 = r0 + r4
        L_0x0ed9:
            r3.E5c(r2, r0)
        L_0x0edc:
            r3.apply()
            X.DbZ.A1W(r6)
            r0 = 17
            X.Ivw r0 = X.C58687Ivw.A00(r9, r8, r0)
            r7.A03(r0)
            goto L_0x121b
        L_0x0eed:
            X.0xY r3 = r3.AR4()
            java.lang.String r2 = X.AnonymousClass3H8.A00(r16)
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            goto L_0x0ed9
        L_0x0efb:
            X.0xY r3 = r3.AR4()
            java.lang.String r0 = X.AnonymousClass3H8.A00(r16)
            r3.ED3(r0)
            goto L_0x0edc
        L_0x0f07:
            X.HOQ r4 = X.HOQ.MUTED
            goto L_0x0e61
        L_0x0f0b:
            X.HOQ r4 = X.HOQ.SHOW
            goto L_0x0e61
        L_0x0f0f:
            X.HOQ r12 = X.HOQ.MUTED
            goto L_0x0e55
        L_0x0f13:
            X.HOQ r12 = X.HOQ.SHOW
            goto L_0x0e55
        L_0x0f17:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0f1c:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0f21:
            java.lang.Object r1 = r0.A05
            X.Gsk r1 = (X.C53693Gsk) r1
            java.lang.CharSequence r5 = r1.A01
            r1 = 1097859072(0x41700000, float:15.0)
            X.GbH r4 = new X.GbH
            r4.<init>(r1)
            java.lang.Object r3 = r0.A01
            X.HtG r3 = (X.C56128HtG) r3
            int r8 = r3.A02
            java.lang.Object r2 = r0.A03
            X.JNh r2 = (X.C59535JNh) r2
            X.XRa r1 = X.C21255XRa.A1Y
            int r9 = X.C56611I4l.A01(r1, r2)
            X.XRa r1 = X.C21255XRa.A1r
            int r7 = X.C56611I4l.A01(r1, r2)
            android.graphics.Typeface r3 = r3.A03
            java.lang.Object r6 = r0.A04
            X.3Y5 r6 = (X.AnonymousClass3Y5) r6
            r1 = 1101004800(0x41a00000, float:20.0)
            long r1 = X.C51972G9s.A0G(r1)
            float r1 = X.C51969G9p.A02(r6, r1)
            r6 = 0
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>(r6, r6, r6, r6)
            java.lang.String r16 = ""
            java.lang.Integer r21 = java.lang.Integer.valueOf(r8)
            java.lang.Integer r23 = java.lang.Integer.valueOf(r9)
            java.lang.Float r19 = java.lang.Float.valueOf(r1)
            java.lang.Integer r26 = java.lang.Integer.valueOf(r7)
            java.lang.Object r0 = r0.A02
            X.0sa r0 = (X.C62320sa) r0
            X.GbS r12 = X.C52715GbS.DEFAULT
            r34 = 1
            X.GbF r1 = new X.GbF
            r7 = r1
            r8 = r2
            r9 = r3
            r11 = r10
            r13 = r10
            r14 = r10
            r15 = r4
            r17 = r5
            r18 = r10
            r20 = r10
            r22 = r10
            r24 = r10
            r25 = r10
            r27 = r10
            r28 = r10
            r29 = r10
            r30 = r10
            r31 = r10
            r32 = r0
            r33 = r10
            r35 = r34
            r36 = r6
            r37 = r6
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37)
            return r1
        L_0x0fa1:
            java.lang.Object r6 = r0.A01
            X.2V5 r6 = (X.2V5) r6
            java.lang.Object r5 = r0.A03
            X.2V5 r5 = (X.2V5) r5
            java.lang.Object r4 = r0.A04
            X.2V5 r4 = (X.2V5) r4
            java.lang.Integer r9 = X.AnonymousClass05K.A00
            goto L_0x0fbe
        L_0x0fb0:
            java.lang.Object r6 = r0.A01
            X.2V5 r6 = (X.2V5) r6
            java.lang.Object r5 = r0.A03
            X.2V5 r5 = (X.2V5) r5
            java.lang.Object r4 = r0.A04
            X.2V5 r4 = (X.2V5) r4
            java.lang.Integer r9 = X.AnonymousClass05K.A01
        L_0x0fbe:
            java.lang.Object r0 = r0.A02
            java.util.List r0 = (java.util.List) r0
            java.util.ArrayList r3 = X.AnonymousClass7TG.A0r(r0)
            java.util.Iterator r8 = r0.iterator()
        L_0x0fca:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x1003
            java.lang.Object r7 = r8.next()
            X.Hsq r7 = (X.C56103Hsq) r7
            java.lang.Integer r0 = r7.A02
            int r2 = r0.intValue()
            r0 = 1
            r1 = 0
            if (r2 == r1) goto L_0x1001
            r12 = r5
            if (r2 == r0) goto L_0x0fe4
            r12 = r4
        L_0x0fe4:
            int r0 = r9.intValue()
            if (r0 == r1) goto L_0x0ffe
            r2 = 1065353216(0x3f800000, float:1.0)
        L_0x0fec:
            long r0 = r7.A01
            android.view.animation.AccelerateDecelerateInterpolator r11 = new android.view.animation.AccelerateDecelerateInterpolator
            r11.<init>()
            r15 = r0
            r13 = r10
            r14 = r2
            X.IIW r0 = X.HSI.A00(r11, r12, r13, r14, r15)
            r3.add(r0)
            goto L_0x0fca
        L_0x0ffe:
            float r2 = r7.A00
            goto L_0x0fec
        L_0x1001:
            r12 = r6
            goto L_0x0fe4
        L_0x1003:
            r2 = 0
            X.JQa[] r0 = new X.C59606JQa[r2]
            java.lang.Object[] r1 = r3.toArray(r0)
            X.JQa[] r1 = (X.C59606JQa[]) r1
            int r0 = r1.length
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r1, r0)
            X.JQa[] r0 = (X.C59606JQa[]) r0
            X.0qQ.A0B(r0, r2)
            X.IIX r1 = new X.IIX
            r1.<init>(r0)
            return r1
        L_0x101c:
            java.lang.Object r4 = r0.A05
            java.lang.Object r2 = r0.A01
            java.lang.Object r6 = r0.A03
            java.lang.Object r5 = r0.A04
            java.lang.Object r3 = r0.A02
            r1 = 37
            X.IoM r0 = new X.IoM
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r8 = 38
            X.IoM r7 = new X.IoM
            r9 = r2
            r10 = r3
            r11 = r4
            r12 = r5
            r13 = r6
            r7.<init>(r8, r9, r10, r11, r12, r13)
            X.HlR r1 = new X.HlR
            r1.<init>(r0, r7)
            return r1
        L_0x103f:
            java.lang.Object r3 = r0.A05
            X.GCb r3 = (X.C52029GCb) r3
            java.lang.Object r1 = r0.A04
            X.4bN r1 = (X.C267324bN) r1
            java.lang.Object r2 = r0.A03
            X.GDe r2 = (X.C52058GDe) r2
            java.lang.Object r5 = r0.A02
            java.lang.Long r5 = (java.lang.Long) r5
            java.lang.Object r4 = r0.A01
            java.lang.Integer r4 = (java.lang.Integer) r4
            com.instagram.api.schemas.SocialContextType r0 = com.instagram.api.schemas.SocialContextType.LIKED_BY
            X.C52029GCb.A09(r0, r1, r2, r3, r4, r5)
            goto L_0x121b
        L_0x105a:
            java.lang.Object r7 = r0.A05
            X.GTj r7 = (X.C52457GTj) r7
            X.3OA r3 = r7.A05
            boolean r1 = r3.A07()
            if (r1 == 0) goto L_0x1123
            com.instagram.common.session.UserSession r2 = r7.A03     // Catch:{ IOException -> 0x110e }
            X.6Q9 r4 = new X.6Q9     // Catch:{ IOException -> 0x110e }
            r4.<init>(r2)     // Catch:{ IOException -> 0x110e }
            X.3xj r1 = r3.A06     // Catch:{ IOException -> 0x110e }
            if (r1 == 0) goto L_0x1109
            com.instagram.model.showreel.IgShowreelComposition r1 = r1.Bw9()     // Catch:{ IOException -> 0x110e }
            if (r1 == 0) goto L_0x1109
            java.lang.String r8 = r1.AqT()     // Catch:{ IOException -> 0x110e }
            X.6OI r6 = X.AnonymousClass6OH.A00(r2)     // Catch:{ IOException -> 0x110e }
            com.instagram.common.session.UserSession r5 = r4.A00     // Catch:{ IOException -> 0x110e }
            X.0Tu r3 = X.0Tu.A05     // Catch:{ IOException -> 0x110e }
            r1 = 36312733012460772(0x81023d000804e4, double:3.027656804495073E-306)
            boolean r1 = X.182.A06(r3, r5, r1)     // Catch:{ IOException -> 0x110e }
            if (r1 == 0) goto L_0x1097
            r1 = 0
            X.0qQ.A0B(r8, r1)     // Catch:{ IOException -> 0x110e }
            java.util.Map r1 = r6.A01     // Catch:{ IOException -> 0x110e }
            r1.remove(r8)     // Catch:{ IOException -> 0x110e }
        L_0x1097:
            r2 = 0
            X.0qQ.A0B(r8, r2)     // Catch:{ IOException -> 0x110e }
            java.util.Map r1 = r6.A01     // Catch:{ IOException -> 0x110e }
            java.lang.Object r3 = r1.get(r8)     // Catch:{ IOException -> 0x110e }
            X.68u r3 = (X.C3034368u) r3     // Catch:{ IOException -> 0x110e }
            if (r3 != 0) goto L_0x10af
            com.google.common.util.concurrent.ListenableFuture r1 = X.AnonymousClass6OL.A01(r8, r2)     // Catch:{ IOException -> 0x110e }
            java.lang.Object r3 = r1.get()     // Catch:{ IOException -> 0x110e }
            X.68u r3 = (X.C3034368u) r3     // Catch:{ IOException -> 0x110e }
        L_0x10af:
            android.util.SparseArray r2 = new android.util.SparseArray     // Catch:{ IOException -> 0x110e }
            r2.<init>()     // Catch:{ IOException -> 0x110e }
            r1 = 2131441359(0x7f0b36cf, float:1.8504727E38)
            r2.put(r1, r4)     // Catch:{ IOException -> 0x110e }
            java.lang.Object r6 = r0.A02     // Catch:{ IOException -> 0x110e }
            X.2Wa r6 = (X.2Wa) r6     // Catch:{ IOException -> 0x110e }
            java.util.concurrent.atomic.AtomicReference r1 = new java.util.concurrent.atomic.AtomicReference     // Catch:{ IOException -> 0x110e }
            r1.<init>()     // Catch:{ IOException -> 0x110e }
            r6.A01(r1)     // Catch:{ IOException -> 0x110e }
            java.lang.Object r1 = r0.A04     // Catch:{ IOException -> 0x110e }
            X.3Y5 r1 = (X.AnonymousClass3Y5) r1     // Catch:{ IOException -> 0x110e }
            X.2V1 r5 = r1.A05     // Catch:{ IOException -> 0x110e }
            X.GrW r4 = X.GY5.A00(r5)     // Catch:{ IOException -> 0x110e }
            r4.A0B(r3)     // Catch:{ IOException -> 0x110e }
            X.2nI r1 = r7.A02     // Catch:{ IOException -> 0x110e }
            r4.A0C(r1)     // Catch:{ IOException -> 0x110e }
            X.GY5 r3 = r4.A01     // Catch:{ IOException -> 0x110e }
            r3.A00 = r2     // Catch:{ IOException -> 0x110e }
            r2 = 3
            X.INH r1 = new X.INH     // Catch:{ IOException -> 0x110e }
            r1.<init>(r6, r2)     // Catch:{ IOException -> 0x110e }
            r3.A03 = r1     // Catch:{ IOException -> 0x110e }
            X.GY5 r3 = r4.A0A()     // Catch:{ IOException -> 0x110e }
            java.lang.Object r2 = r0.A01     // Catch:{ IOException -> 0x110e }
            X.2Wa r2 = (X.2Wa) r2     // Catch:{ IOException -> 0x110e }
            X.HEU r1 = new X.HEU     // Catch:{ IOException -> 0x110e }
            r1.<init>(r3)     // Catch:{ IOException -> 0x110e }
            r2.A01(r1)     // Catch:{ IOException -> 0x110e }
            X.3XA r1 = new X.3XA     // Catch:{ IOException -> 0x110e }
            r1.<init>()     // Catch:{ IOException -> 0x110e }
            X.3X6 r1 = com.facebook.litho.ComponentTree.A01(r1, r5)     // Catch:{ IOException -> 0x110e }
            com.facebook.litho.ComponentTree r2 = r1.A00()     // Catch:{ IOException -> 0x110e }
            java.lang.Object r1 = r0.A03     // Catch:{ IOException -> 0x110e }
            X.2Wa r1 = (X.2Wa) r1     // Catch:{ IOException -> 0x110e }
            r1.A01(r2)     // Catch:{ IOException -> 0x110e }
            goto L_0x1131
        L_0x1109:
            X.3dj r1 = X.C58243Iom.A00()     // Catch:{ IOException -> 0x110e }
            return r1
        L_0x110e:
            r2 = move-exception
            java.lang.Object r1 = r0.A02
            X.2Wa r1 = (X.2Wa) r1
            r1.A01(r10)
            java.lang.Object r1 = r0.A01
            X.2Wa r1 = (X.2Wa) r1
            X.HET r0 = new X.HET
            r0.<init>(r2)
            r1.A01(r0)
            goto L_0x1131
        L_0x1123:
            java.lang.Object r1 = r0.A02
            X.2Wa r1 = (X.2Wa) r1
            r1.A01(r10)
            java.lang.Object r0 = r0.A01
            X.2Wa r0 = (X.2Wa) r0
            r0.A01(r10)
        L_0x1131:
            X.3dj r1 = X.C58243Iom.A00()
            return r1
        L_0x1136:
            java.lang.Object r4 = r0.A05
            X.JTC r4 = (X.JTC) r4
            java.lang.Object r3 = r0.A02
            X.4bN r3 = (X.C267324bN) r3
            java.lang.Object r2 = r0.A03
            X.GDe r2 = (X.C52058GDe) r2
            java.lang.Object r1 = r0.A01
            X.JPD r1 = (X.JPD) r1
            java.lang.Object r0 = r0.A04
            X.2EG r0 = (X.2EG) r0
            r12 = -1082130432(0xffffffffbf800000, float:-1.0)
            r14 = 0
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r14)
            r5 = r1
            r6 = r3
            r7 = r2
            r8 = r0
            r11 = r10
            r13 = r12
            r15 = r14
            r4.D3Z(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            goto L_0x121b
        L_0x115d:
            X.GIT r3 = X.GIT.A00
            java.lang.Object r1 = r0.A04
            android.content.Context r4 = X.C51966G9m.A0Q(r1)
            java.lang.Object r8 = r0.A03
            X.1Xj r8 = (X.1Xj) r8
            java.lang.Object r5 = r0.A02
            X.4bN r5 = (X.C267324bN) r5
            java.lang.Object r2 = r0.A05
            X.GIt r2 = (X.C52202GIt) r2
            com.instagram.clips.intf.ClipsViewerConfig r1 = r2.A02
            com.instagram.music.common.model.AudioOverlayTrack r1 = r1.A0Q
            if (r1 == 0) goto L_0x1184
            com.instagram.music.common.model.MusicAssetModel r9 = r1.A08
        L_0x1179:
            java.lang.Object r6 = r0.A01
            X.1sQ r6 = (X.C67231sQ) r6
            com.instagram.common.session.UserSession r7 = r2.A03
            X.4Ke r1 = r3.A02(r4, r5, r6, r7, r8, r9)
            return r1
        L_0x1184:
            r9 = 0
            goto L_0x1179
        L_0x1186:
            X.GIT r3 = X.GIT.A00
            java.lang.Object r1 = r0.A04
            android.content.Context r4 = X.C51966G9m.A0Q(r1)
            java.lang.Object r8 = r0.A03
            X.1Xj r8 = (X.1Xj) r8
            java.lang.Object r5 = r0.A02
            X.4bN r5 = (X.C267324bN) r5
            java.lang.Object r2 = r0.A05
            X.GvC r2 = (X.C53845GvC) r2
            com.instagram.clips.intf.ClipsViewerConfig r1 = r2.A01
            com.instagram.music.common.model.AudioOverlayTrack r1 = r1.A0Q
            if (r1 == 0) goto L_0x11ad
            com.instagram.music.common.model.MusicAssetModel r9 = r1.A08
        L_0x11a2:
            java.lang.Object r6 = r0.A01
            X.1sQ r6 = (X.C67231sQ) r6
            com.instagram.common.session.UserSession r7 = r2.A02
            X.4Ke r1 = r3.A02(r4, r5, r6, r7, r8, r9)
            return r1
        L_0x11ad:
            r9 = 0
            goto L_0x11a2
        L_0x11af:
            java.lang.Object r1 = r0.A05
            X.6Z5 r1 = (X.AnonymousClass6Z5) r1
            com.instagram.common.session.UserSession r5 = r1.A09
            if (r5 != 0) goto L_0x11bf
            X.DbS.A17()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x11bf:
            java.lang.Object r4 = r0.A01
            androidx.fragment.app.FragmentActivity r4 = (androidx.fragment.app.FragmentActivity) r4
            java.lang.Object r3 = r0.A03
            X.1Xj r3 = (X.1Xj) r3
            java.lang.Object r2 = r0.A02
            android.content.Context r2 = (android.content.Context) r2
            java.lang.Object r0 = r0.A04
            X.3mM r0 = (X.C250973mM) r0
            X.AnonymousClass7TG.A1N(r2, r0)
            int r1 = X.C316216lI.A03(r2)
            int r0 = X.C316216lI.A04(r2, r0)
            int r1 = r1 + r0
            X.JZV.A08(r4, r5, r3, r1)
            goto L_0x121b
        L_0x11df:
            java.lang.Object r2 = r0.A03
            X.0r1 r2 = (X.0r1) r2
            java.lang.Object r1 = r0.A02
            X.0r1 r1 = (X.0r1) r1
            boolean r1 = r1.A00
            r1 = r1 ^ 1
            if (r1 == 0) goto L_0x121e
            r1 = 0
            r2.A00 = r1
            java.lang.Object r3 = r0.A05
            X.0rm r3 = (X.0rm) r3
            java.lang.Object r1 = r0.A01
            X.0rm r1 = (X.0rm) r1
            java.lang.Object r2 = r3.A00
            java.lang.Object r1 = r1.A00
            if (r2 != r1) goto L_0x1206
            java.util.Collection r1 = (java.util.Collection) r1
            java.util.ArrayList r2 = X.00k.A0U(r1)
            r3.A00 = r2
        L_0x1206:
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r0 = r0.A04
            int r1 = r2.indexOf(r0)
            java.lang.Object r0 = r3.A00
            java.util.List r0 = (java.util.List) r0
            r0.remove(r1)
            goto L_0x121b
        L_0x1216:
            X.I6I r0 = X.I6I.A00
            r0.A06(r4, r5, r7)
        L_0x121b:
            X.0gF r1 = X.C60340gF.A00
            return r1
        L_0x121e:
            java.lang.String r0 = "You may not unsubscribe from a store listener while the reducer\nis executing. See \nhttps://www.reduxkotlin.org/api/store#subscribelistener-storesubscriber\nfor more details."
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58218IoM.invoke():java.lang.Object");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58218IoM(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
        this.A05 = obj3;
        this.A04 = obj4;
        this.A03 = obj5;
    }
}
