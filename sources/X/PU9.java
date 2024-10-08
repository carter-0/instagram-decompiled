package X;

public final class PU9 implements 1aV {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public PU9(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    public static void A00(1aU r1, 1a8 r2, Object obj, Object obj2, int i) {
        r2.A02(r1, new PU9(i, obj, obj2));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: X.N3J} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: X.N3J} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: X.N3J} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r37v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v116, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v117, resolved type: X.NTW} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v118, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v53, resolved type: X.N3J} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v6, resolved type: X.N3J} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v262, resolved type: X.N3h} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v263, resolved type: X.N3h} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v264, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v265, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v7, resolved type: X.N3h} */
    /* JADX WARNING: type inference failed for: r0v25, types: [X.1qK, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r3v6, types: [java.lang.String] */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x04a0, code lost:
        X.C71087ObS.A02(r3, r1, r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x04a3, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x04ba, code lost:
        r13 = (X.AnonymousClass67Z) r6.A01;
        r0 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x04dc, code lost:
        r13.A02(r0);
        r13.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x04e2, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x0644, code lost:
        if (X.C72199OyL.A01((X.C254703su) r1) == false) goto L_0x0646;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:350:0x0933, code lost:
        ((X.1a8) r6.A02).A01();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:351:0x093a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x017d, code lost:
        X.NJY.A0F(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0180, code lost:
        return;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void accept(java.lang.Object r57) {
        /*
            r56 = this;
            r6 = r56
            r3 = r57
            int r0 = r6.A00
            switch(r0) {
                case 0: goto L_0x04e3;
                case 1: goto L_0x04bf;
                case 2: goto L_0x04a4;
                case 3: goto L_0x0498;
                case 4: goto L_0x047a;
                case 5: goto L_0x0471;
                case 6: goto L_0x0181;
                case 7: goto L_0x0419;
                case 8: goto L_0x0132;
                case 9: goto L_0x00e6;
                case 10: goto L_0x03f0;
                case 11: goto L_0x03c6;
                case 12: goto L_0x03ab;
                case 13: goto L_0x00be;
                case 14: goto L_0x0090;
                case 15: goto L_0x03a2;
                case 16: goto L_0x0009;
                case 17: goto L_0x0009;
                case 18: goto L_0x0016;
                case 19: goto L_0x038b;
                case 20: goto L_0x02c7;
                case 21: goto L_0x026b;
                case 22: goto L_0x025e;
                case 23: goto L_0x022f;
                case 24: goto L_0x0211;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.lang.Object r0 = r6.A01
            X.1a8 r0 = (X.1a8) r0
            r0.A01()
            java.lang.Object r0 = r6.A02
            X.DbS.A1U(r0)
        L_0x0015:
            return
        L_0x0016:
            java.util.List r3 = (java.util.List) r3
            r2 = 0
            X.0qQ.A0B(r3, r2)
            java.lang.Object r7 = r6.A02
            X.OyU r7 = (X.C72204OyU) r7
            java.lang.Object r6 = r6.A01
            X.3t3 r6 = (X.C254793t3) r6
            com.instagram.common.session.UserSession r5 = r7.A04
            X.0Tu r4 = X.0Tu.A05
            r0 = 36326936468797527(0x810f2800003857, double:3.036639127475165E-306)
            boolean r0 = X.182.A06(r4, r5, r0)
            if (r0 == 0) goto L_0x093b
            java.util.Map r0 = r7.A0C
            java.lang.Object r5 = r0.get(r6)
            X.1aS r5 = (X.AnonymousClass1aS) r5
            if (r5 == 0) goto L_0x0015
            java.lang.Object r4 = r5.A0X()
            X.Jw4 r4 = (X.C61066Jw4) r4
            if (r4 == 0) goto L_0x0015
            java.lang.Object r0 = r4.A00
            java.util.List r0 = (java.util.List) r0
            java.util.LinkedList r0 = X.C72204OyU.A04(r7, r0, r3)
            r4.A00 = r0
            X.2Dm r1 = r7.A06
            X.3t0 r0 = X.C300965yF.A01(r6)
            com.instagram.model.direct.DirectThreadKey r0 = X.C327647Bq.A00(r0)
            r3 = 0
            java.util.ArrayList r1 = r1.Aax(r0, r2)
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L_0x0073
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x0073
        L_0x0068:
            r7.A01 = r3
            java.util.Map r0 = r7.A0B
            r0.put(r6, r4)
            r5.accept(r4)
            return
        L_0x0073:
            java.util.Iterator r2 = r1.iterator()
        L_0x0077:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0068
            X.3su r0 = X.C66580MXl.A0a(r2)
            com.google.common.collect.ImmutableList r0 = r0.A0H()
            if (r0 == 0) goto L_0x0077
            int r1 = r0.size()
            r0 = 6
            if (r1 != r0) goto L_0x0077
            r3 = 1
            goto L_0x0068
        L_0x0090:
            boolean r0 = X.AnonymousClass7TE.A1a(r3)
            if (r0 == 0) goto L_0x00b4
            java.lang.Object r5 = r6.A02
            X.61F r5 = (X.AnonymousClass61F) r5
            java.lang.Object r4 = r6.A01
            X.61G r4 = (X.AnonymousClass61G) r4
            r3 = 1
            X.1a8 r2 = r5.A00
            com.instagram.common.session.UserSession r0 = r5.A01
            X.OJr r0 = X.C70112NxS.A00(r0)
            X.1aU r1 = r0.A00()
            X.PSR r0 = new X.PSR
            r0.<init>(r4, r5, r3)
            r2.A02(r1, r0)
            return
        L_0x00b4:
            java.lang.Object r0 = r6.A01
            X.61G r0 = (X.AnonymousClass61G) r0
            if (r0 == 0) goto L_0x0015
            r0.A00()
            return
        L_0x00be:
            boolean r0 = r3 instanceof X.C72176Oxl
            if (r0 == 0) goto L_0x0015
            java.lang.Object r0 = r6.A02
            X.OHw r0 = (X.C70727OHw) r0
            X.7Sc r0 = r0.A05
            r0.AUb()
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "create "
            r1.append(r0)
            java.lang.Object r0 = r6.A01
            r1.append(r0)
            java.lang.String r0 = " thread failed"
            java.lang.String r2 = X.AnonymousClass7TF.A0l(r0, r1)
            r1 = 1
            java.lang.String r0 = "MsysThreadViewDataLoader"
            X.0wb.A04(r0, r2, r1)
            return
        L_0x00e6:
            java.util.List r7 = X.JTQ.A0i(r3)
            java.lang.Object r5 = r6.A02
            X.OHL r5 = (X.OHL) r5
            java.lang.Object r4 = r6.A01
            X.3sy r4 = (X.C254743sy) r4
            java.lang.StringBuilder r1 = X.JTQ.A0d(r4)
            java.lang.String r0 = "RESHARES"
            java.lang.String r3 = X.AnonymousClass7TF.A0l(r0, r1)
            java.util.HashMap r2 = r5.A06
            java.lang.Object r0 = r2.get(r3)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            if (r0 == 0) goto L_0x010c
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x0120
        L_0x010c:
            int r1 = r7.size()
            r0 = 1
            if (r1 >= r0) goto L_0x0120
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.put(r3, r0)
            X.NcK r1 = r5.A05
            r0 = 0
            r1.A0B(r4, r0)
        L_0x0120:
            X.O78 r0 = r5.A03
            r2 = 1
            X.NJY r1 = r0.A00
            boolean r0 = r1.A0i
            if (r0 != 0) goto L_0x0015
            boolean r0 = X.AnonymousClass7TE.A1b(r7)
            if (r0 == 0) goto L_0x0015
            r1.A0i = r2
            goto L_0x017d
        L_0x0132:
            java.util.List r7 = X.JTQ.A0i(r3)
            java.lang.Object r5 = r6.A02
            X.OHL r5 = (X.OHL) r5
            java.lang.Object r4 = r6.A01
            X.3sy r4 = (X.C254743sy) r4
            java.lang.StringBuilder r1 = X.JTQ.A0d(r4)
            java.lang.String r0 = "PERMANENT_MEDIA"
            java.lang.String r3 = X.AnonymousClass7TF.A0l(r0, r1)
            java.util.HashMap r2 = r5.A06
            java.lang.Object r0 = r2.get(r3)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            if (r0 == 0) goto L_0x0158
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x016c
        L_0x0158:
            int r1 = r7.size()
            r0 = 1
            if (r1 >= r0) goto L_0x016c
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.put(r3, r0)
            X.NcJ r1 = r5.A04
            r0 = 0
            r1.A0B(r4, r0)
        L_0x016c:
            X.O78 r0 = r5.A03
            X.NJY r1 = r0.A00
            boolean r0 = r1.A0g
            if (r0 != 0) goto L_0x0015
            boolean r0 = X.AnonymousClass7TE.A1b(r7)
            if (r0 == 0) goto L_0x0015
            r0 = 1
            r1.A0g = r0
        L_0x017d:
            X.NJY.A0F(r1)
            return
        L_0x0181:
            java.util.List r7 = X.JTQ.A0i(r3)
            java.lang.Object r6 = r6.A02
            X.Oam r6 = (X.C71067Oam) r6
            java.util.Iterator r9 = r7.iterator()
        L_0x018d:
            boolean r0 = r9.hasNext()
            r8 = 0
            if (r0 == 0) goto L_0x01bf
            java.lang.Object r8 = r9.next()
            r5 = r8
            X.N3E r5 = (X.N3E) r5
            X.3sy r0 = r6.A07
            java.lang.String r0 = X.C66647MaG.A0B(r0)
            if (r0 == 0) goto L_0x018d
            long r3 = r5.A01
            java.lang.Long r0 = X.AnonymousClass7TE.A10(r0)
            if (r0 == 0) goto L_0x018d
            long r1 = r0.longValue()
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x018d
            long r3 = r5.A00
            java.lang.String r0 = r6.A0A
            long r1 = java.lang.Long.parseLong(r0)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x018d
        L_0x01bf:
            X.N3E r8 = (X.N3E) r8
            if (r8 == 0) goto L_0x0015
            X.NHM r5 = new X.NHM
            r5.<init>()
            java.lang.String r0 = r5.A01
            r5.A01 = r0
            java.lang.String r0 = r8.A07
            r5.A02 = r0
            java.util.ArrayList r8 = X.AnonymousClass7TE.A1C()
            java.util.ArrayList r10 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r12 = r7.iterator()
        L_0x01dc:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x093f
            java.lang.Object r9 = r12.next()
            r11 = r9
            X.N3E r11 = (X.N3E) r11
            X.3sy r0 = r6.A07
            java.lang.String r0 = X.C66647MaG.A0B(r0)
            if (r0 == 0) goto L_0x01dc
            long r1 = r11.A01
            java.lang.Long r0 = X.AnonymousClass7TE.A10(r0)
            if (r0 == 0) goto L_0x01dc
            long r3 = r0.longValue()
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x01dc
            long r1 = r11.A00
            java.lang.String r0 = r6.A0A
            long r3 = java.lang.Long.parseLong(r0)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x01dc
            r10.add(r9)
            goto L_0x01dc
        L_0x0211:
            java.lang.Object r2 = r6.A01
            androidx.fragment.app.Fragment r2 = (androidx.fragment.app.Fragment) r2
            java.lang.Object r1 = r6.A02
            android.widget.TextView r1 = (android.widget.TextView) r1
            java.lang.String r3 = (java.lang.String) r3
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L_0x0228
            r0 = 2131957521(0x7f131711, float:1.9551628E38)
            r1.setText(r0)
            return
        L_0x0228:
            r0 = 2131957673(0x7f1317a9, float:1.9551937E38)
            X.DbX.A1F(r1, r2, r3, r0)
            return
        L_0x022f:
            java.lang.Object r4 = r6.A01
            android.content.Context r4 = (android.content.Context) r4
            java.lang.Object r2 = r6.A02
            java.lang.StringBuilder r2 = (java.lang.StringBuilder) r2
            X.PrM r3 = (X.C74233PrM) r3
            boolean r0 = r3 instanceof X.C72176Oxl
            if (r0 == 0) goto L_0x0252
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "Send failed: "
            r1.append(r0)
            java.lang.Object r0 = X.C66996MgU.A01(r3)
            java.lang.String r0 = X.AnonymousClass7TF.A0i(r0, r1)
        L_0x024e:
            X.C59689JTv.A09(r4, r0)
            return
        L_0x0252:
            r1 = 0
            int r0 = r2.length()
            int r0 = r0 + -2
            java.lang.String r0 = r2.substring(r1, r0)
            goto L_0x024e
        L_0x025e:
            java.lang.Object r0 = r6.A02
            X.1a8 r0 = (X.1a8) r0
            r0.A01()
            java.lang.Object r0 = r6.A01
            X.C51965G9l.A1W(r0, r3)
            return
        L_0x026b:
            X.JwJ r3 = (X.C61081JwJ) r3
            java.lang.Object r2 = r6.A02
            X.OTe r2 = (X.C70957OTe) r2
            com.instagram.common.session.UserSession r5 = r2.A03
            X.0Tu r4 = X.0Tu.A05
            r0 = 36314296380099075(0x8103a900010a03, double:3.028645484484712E-306)
            boolean r0 = X.182.A06(r4, r5, r0)
            if (r0 == 0) goto L_0x02b7
            long r7 = r2.A00
            r4 = 0
            int r0 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x02b7
            java.lang.Object r1 = r6.A01
            com.instagram.model.direct.threadkey.impl.MsysThreadId r1 = (com.instagram.model.direct.threadkey.impl.MsysThreadId) r1
            java.lang.Long r0 = r1.A02
            if (r0 == 0) goto L_0x0296
            java.lang.String r7 = r0.toString()
            if (r7 != 0) goto L_0x0298
        L_0x0296:
            java.lang.String r7 = "-1"
        L_0x0298:
            X.3tH r1 = r1.A01
            r0 = 0
            int r1 = X.DbU.A02(r1, r0)
            if (r1 == r0) goto L_0x02bf
            r0 = 1
            if (r1 == r0) goto L_0x02bf
            r0 = 3
            if (r1 == r0) goto L_0x02bf
            r0 = 2
            if (r1 != r0) goto L_0x02c2
            X.XSV r5 = X.XSV.A04
        L_0x02ac:
            X.Mcz r4 = r2.A04
            long r8 = r2.A00
            java.lang.Object r6 = r3.A00
            X.O8m r6 = (X.C70487O8m) r6
            r4.A02(r5, r6, r7, r8)
        L_0x02b7:
            X.Mcz r1 = r2.A04
            X.NmK r0 = X.C69476NmK.PROACTIVE_WARNING_BANNER_SHOWN
            X.C66813Mcz.A00(r0, r1)
            return
        L_0x02bf:
            X.XSV r5 = X.XSV.A06
            goto L_0x02ac
        L_0x02c2:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x02c7:
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r13 = r6.A01
            X.67Z r13 = (X.AnonymousClass67Z) r13
            java.lang.Object r0 = r6.A02
            X.N3h r0 = (X.C68167N3h) r0
            com.instagram.common.typedurl.SimpleImageUrl r17 = X.DbS.A0V(r3)
            java.lang.String r1 = r0.A0K
            r30 = r1
            java.lang.String r1 = r0.A0G
            r31 = r1
            java.lang.String r14 = r0.A0J
            com.instagram.user.model.User r1 = r0.A0C
            r55 = r1
            java.lang.String r12 = r0.A0M
            boolean r1 = r0.A0X
            r44 = r1
            X.1Xj r1 = r0.A0A
            r54 = r1
            java.lang.String r11 = r0.A0I
            X.1iA r10 = r0.A0B
            long r4 = r0.A03
            java.util.List r9 = r0.A0P
            boolean r1 = r0.A0Z
            r45 = r1
            boolean r1 = r0.A0S
            r46 = r1
            boolean r1 = r0.A0Q
            r47 = r1
            boolean r1 = r0.A0Y
            r48 = r1
            boolean r1 = r0.A0W
            r49 = r1
            boolean r1 = r0.A0R
            r26 = r1
            java.lang.String r1 = r0.A0H
            r25 = r1
            java.lang.String r1 = r0.A0O
            r24 = r1
            java.lang.Long r1 = r0.A0F
            r27 = r1
            java.lang.Long r1 = r0.A0D
            r28 = r1
            float r1 = r0.A01
            r23 = r1
            java.lang.String r1 = r0.A0L
            r22 = r1
            X.OGw r1 = r0.A05
            r21 = r1
            X.5Dg r1 = r0.A06
            r19 = r1
            int r1 = r0.A02
            r18 = r1
            java.lang.String r1 = r0.A0N
            r16 = r1
            X.4iq r1 = r0.A07
            r20 = r1
            com.instagram.direct.visual.model.DirectVisualMessageItemModel$MediaFields$TamMedia r15 = r0.A09
            com.instagram.direct.wellbeing.harmfulcontent.ondevicenudity.view.data.PrivacyMediaOverlayViewModel r8 = r0.A00
            com.instagram.direct.visual.model.DirectVisualMessageItemModel$MediaFields$RemixMedia r7 = r0.A08
            java.lang.Long r6 = r0.A0E
            boolean r3 = r0.A0T
            boolean r2 = r0.A0U
            boolean r1 = r0.A0V
            r0 = 2
            X.0qQ.A0B(r14, r0)
            r0 = 4
            X.C51973G9u.A0s(r0, r12, r11, r10)
            r0 = 10
            X.0qQ.A0B(r9, r0)
            X.N3h r0 = new X.N3h
            r29 = r6
            r32 = r14
            r33 = r12
            r34 = r11
            r35 = r25
            r36 = r24
            r37 = r22
            r38 = r16
            r39 = r9
            r40 = r23
            r41 = r18
            r42 = r4
            r50 = r26
            r51 = r3
            r52 = r2
            r53 = r1
            r16 = r0
            r18 = r21
            r21 = r7
            r22 = r15
            r23 = r8
            r24 = r54
            r25 = r10
            r26 = r55
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53)
            goto L_0x04dc
        L_0x038b:
            X.OCF r3 = (X.OCF) r3
            r0 = 0
            X.0qQ.A0B(r3, r0)
            java.lang.Object r5 = r6.A02
            X.OyU r5 = (X.C72204OyU) r5
            java.lang.Object r4 = r6.A01
            X.3t3 r4 = (X.C254793t3) r4
            java.util.List r2 = r3.A00
            boolean r1 = r3.A01
            r0 = 1
            X.C72204OyU.A08(r5, r4, r2, r0, r1)
            return
        L_0x03a2:
            java.lang.Object r0 = r6.A01
            X.PuO r0 = (X.C74408PuO) r0
            r0.onSuccess()
            goto L_0x0933
        L_0x03ab:
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r1 = r6.A01
            X.ODe r1 = (X.C70607ODe) r1
            X.0qQ.A0A(r3)
            X.7Hh r0 = r1.A00
            android.os.Handler r4 = r0.A00
            java.util.concurrent.atomic.AtomicBoolean r2 = r1.A02
            X.Pt4 r1 = r1.A01
            X.PaI r0 = new X.PaI
            r0.<init>(r1, r3, r2)
            r4.post(r0)
            goto L_0x0933
        L_0x03c6:
            X.PuM r3 = (X.C74406PuM) r3
            if (r3 == 0) goto L_0x0933
            java.lang.Object r4 = r6.A01
            X.P8g r4 = (X.C72497P8g) r4
            X.0eK r0 = r4.A0r
            X.7S7 r0 = X.C66582MXn.A0d(r0)
            java.lang.String r1 = r0.C6C()
            if (r1 == 0) goto L_0x03ed
            com.instagram.common.session.UserSession r0 = r4.A05
            X.3U9 r0 = X.C66582MXn.A0b(r0, r1)
            X.XSV r2 = X.OP1.A00(r0)
        L_0x03e4:
            X.OsF r1 = r4.A0q
            java.lang.String r0 = "message_menu"
            r1.A05(r2, r3, r0)
            goto L_0x0933
        L_0x03ed:
            X.XSV r2 = X.XSV.A07
            goto L_0x03e4
        L_0x03f0:
            X.MfE r3 = (X.C66920MfE) r3
            r0 = 0
            X.0qQ.A0B(r3, r0)
            java.lang.Object r5 = r6.A02
            X.Mbh r5 = (X.C66736Mbh) r5
            r5.A00 = r3
            java.lang.Object r4 = r6.A01
            X.MiT r4 = (X.C67109MiT) r4
            X.Miz r2 = r5.A0E
            boolean r0 = r3.A02
            if (r0 == 0) goto L_0x0417
            int r0 = r3.A01
            boolean r1 = X.AnonymousClass7TF.A1R(r0)
            X.NPJ r0 = new X.NPJ
            r0.<init>(r4, r1)
        L_0x0411:
            r2.A0F = r0
            X.C66736Mbh.A03(r5)
            return
        L_0x0417:
            r0 = 0
            goto L_0x0411
        L_0x0419:
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r0 = r3.booleanValue()
            java.lang.Object r2 = r6.A02
            X.P2a r2 = (X.C72335P2a) r2
            if (r0 == 0) goto L_0x043c
            X.NJm r2 = r2.A03
            androidx.recyclerview.widget.RecyclerView r1 = r2.A01
            if (r1 != 0) goto L_0x0433
            X.C66580MXl.A19()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0433:
            X.PVT r0 = new X.PVT
            r0.<init>(r2)
            r1.post(r0)
            goto L_0x0461
        L_0x043c:
            X.NJm r1 = r2.A03
            java.lang.Object r0 = r6.A01
            java.util.List r0 = (java.util.List) r0
            X.DbX.A1I(r1)
            com.instagram.common.session.UserSession r6 = r2.A02
            X.OpX r2 = X.C71713OpX.A00
            java.lang.Object r0 = X.00k.A0J(r0)
            com.instagram.model.direct.threadkey.impl.MsysPendingRecipient r0 = (com.instagram.model.direct.threadkey.impl.MsysPendingRecipient) r0
            if (r0 == 0) goto L_0x0461
            long r4 = r0.A01
            java.lang.String r0 = "createCutoverThreadOnServer"
            X.MYZ r1 = X.MYY.A01(r0)
            X.Pae r0 = new X.Pae
            r0.<init>(r2, r6, r4)
            r1.execute(r0)
        L_0x0461:
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "alreadyHasE2EE:"
            java.lang.String r1 = X.AnonymousClass7TG.A0m(r3, r0, r1)
            java.lang.String r0 = "CreateCutoverThreadSection"
            X.0KC.A0C(r0, r1)
            return
        L_0x0471:
            X.ObS r3 = (X.C71087ObS) r3
            java.lang.Object r2 = r6.A01
            java.lang.Object r1 = r6.A02
            r0 = 12
            goto L_0x04a0
        L_0x047a:
            java.lang.String r2 = "failed to create VD"
            X.NTn r0 = new X.NTn
            r0.<init>(r2)
            java.lang.Object r3 = r6.A02
            X.OO6 r3 = (X.OO6) r3
            X.NUV r1 = r3.A06
            java.util.List r1 = r1.A00
            r1.add(r2)
            android.content.Context r1 = r3.A00
            X.ObS r2 = r3.A00(r1)
            r1 = 10
            X.C71087ObS.A01(r2, r3, r1)
            goto L_0x04ba
        L_0x0498:
            X.ObS r3 = (X.C71087ObS) r3
            java.lang.Object r2 = r6.A01
            java.lang.Object r1 = r6.A02
            r0 = 11
        L_0x04a0:
            X.C71087ObS.A02(r3, r1, r2, r0)
            return
        L_0x04a4:
            java.lang.String r3 = "failed to create VD"
            r1 = 0
            X.NTW r0 = new X.NTW
            r0.<init>(r1, r3)
            java.lang.Object r1 = r6.A02
            X.OHi r1 = (X.C70713OHi) r1
            X.NUY r2 = r1.A05
            java.util.List r1 = r2.A00
            r1.add(r3)
            r2.A0H()
        L_0x04ba:
            java.lang.Object r13 = r6.A01
            X.67Z r13 = (X.AnonymousClass67Z) r13
            goto L_0x04dc
        L_0x04bf:
            java.lang.String r3 = "Invalid backup status for VD creation"
            r1 = 0
            X.NTW r0 = new X.NTW
            r0.<init>(r1, r3)
            java.lang.Object r1 = r6.A02
            X.OHi r1 = (X.C70713OHi) r1
            X.NUY r2 = r1.A05
            java.util.List r1 = r2.A00
            r1.add(r3)
            r2.A0H()
            java.lang.Object r13 = r6.A01
            X.67Z r13 = (X.AnonymousClass67Z) r13
            X.0qQ.A0A(r13)
        L_0x04dc:
            r13.A02(r0)
            r13.A00()
            return
        L_0x04e3:
            X.PrM r3 = (X.C74233PrM) r3
            r5 = 0
            X.0qQ.A0B(r3, r5)
            boolean r0 = r3 instanceof X.C66990MgO
            if (r0 == 0) goto L_0x08fe
            java.lang.Object r4 = r6.A01
            X.OTc r4 = (X.C70955OTc) r4
            java.lang.Object r0 = X.C66996MgU.A02(r3)
            X.0qQ.A07(r0)
            java.util.List r0 = (java.util.List) r0
            X.0qQ.A0B(r0, r5)
            X.C70955OTc.A00(r4)
            java.util.LinkedHashMap r24 = X.AnonymousClass7TE.A1H()
            java.util.ArrayList r23 = X.AnonymousClass7TE.A1C()
            java.util.ArrayList r14 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r16 = r0.iterator()
        L_0x0510:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x0751
            java.lang.Object r0 = r16.next()
            X.OE4 r0 = (X.OE4) r0
            java.lang.String r8 = r0.A01
            java.lang.String r9 = r0.A02
            java.lang.Integer r7 = r0.A00
            java.lang.String r1 = "ArmadilloExpressReceiverFetchRepository"
            if (r9 != 0) goto L_0x052c
            java.lang.String r0 = "Failed to fetch previewData"
            X.0KC.A0C(r1, r0)
            goto L_0x0510
        L_0x052c:
            X.OyL r3 = r4.A04
            com.instagram.common.session.UserSession r10 = r3.A00
            X.0Tu r2 = X.0Tu.A05
            r0 = 36318891997272710(0x8107d700221a86, double:3.031551771290384E-306)
            boolean r12 = X.182.A06(r2, r10, r0)
            org.json.JSONObject r1 = X.C66580MXl.A17(r9)     // Catch:{ Exception -> 0x05a2 }
            java.util.Iterator r0 = r1.keys()     // Catch:{ Exception -> 0x05a2 }
            java.lang.String r11 = X.AnonymousClass7TE.A18(r0)     // Catch:{ Exception -> 0x05a2 }
            org.json.JSONArray r1 = r1.getJSONArray(r11)     // Catch:{ Exception -> 0x05a2 }
            int r0 = r1.length()     // Catch:{ Exception -> 0x05a2 }
            X.2HY r0 = X.C229632nm.A0C(r5, r0)     // Catch:{ Exception -> 0x05a2 }
            java.util.ArrayList r10 = X.AnonymousClass7TG.A0r(r0)     // Catch:{ Exception -> 0x05a2 }
            java.util.Iterator r2 = r0.iterator()     // Catch:{ Exception -> 0x05a2 }
        L_0x055b:
            boolean r0 = r2.hasNext()     // Catch:{ Exception -> 0x05a2 }
            if (r0 == 0) goto L_0x0578
            r0 = r2
            X.0sh r0 = (X.0sh) r0     // Catch:{ Exception -> 0x05a2 }
            int r0 = r0.A00()     // Catch:{ Exception -> 0x05a2 }
            java.lang.String r0 = r1.getString(r0)     // Catch:{ Exception -> 0x05a2 }
            X.16F r0 = X.16P.A00(r0)     // Catch:{ Exception -> 0x05a2 }
            X.3tC r0 = X.C254863tB.parseFromJson(r0)     // Catch:{ Exception -> 0x05a2 }
            r10.add(r0)     // Catch:{ Exception -> 0x05a2 }
            goto L_0x055b
        L_0x0578:
            if (r12 == 0) goto L_0x0594
            boolean r0 = r10.isEmpty()     // Catch:{ Exception -> 0x05a2 }
            if (r0 != 0) goto L_0x0594
            java.lang.Object r2 = r10.get(r5)     // Catch:{ Exception -> 0x05a2 }
            X.3tC r2 = (X.C254873tC) r2     // Catch:{ Exception -> 0x05a2 }
            java.lang.String r1 = "[RF]"
            java.lang.String r0 = r2.A1N     // Catch:{ Exception -> 0x05a2 }
            if (r0 != 0) goto L_0x058e
            java.lang.String r0 = ""
        L_0x058e:
            java.lang.String r0 = X.002.A0R(r1, r0)     // Catch:{ Exception -> 0x05a2 }
            r2.A1N = r0     // Catch:{ Exception -> 0x05a2 }
        L_0x0594:
            X.2Fs r0 = X.2FW.A0A     // Catch:{ Exception -> 0x05a2 }
            X.0qQ.A0A(r11)     // Catch:{ Exception -> 0x05a2 }
            X.2FW r0 = r0.A00(r11)     // Catch:{ Exception -> 0x05a2 }
            X.0eP r10 = X.AnonymousClass7TE.A1L(r0, r10)     // Catch:{ Exception -> 0x05a2 }
            goto L_0x05a3
        L_0x05a2:
            r10 = 0
        L_0x05a3:
            r15 = 0
            if (r10 == 0) goto L_0x074e
            java.lang.Object r0 = r10.A01
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x074e
            java.lang.Object r2 = r0.get(r5)
            X.3tC r2 = (X.C254873tC) r2
            if (r2 == 0) goto L_0x05bd
            r0 = 1
            r2.A1e = r0
            long r0 = java.lang.System.currentTimeMillis()
            r2.A0C = r0
        L_0x05bd:
            r11 = 4324001(0x41faa1, float:6.059216E-39)
            if (r7 == 0) goto L_0x060b
            int r12 = r7.intValue()
            if (r12 != r11) goto L_0x060b
            java.util.List r0 = r4.A01
            java.util.Iterator r13 = r0.iterator()
        L_0x05ce:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x074b
            java.lang.Object r1 = r13.next()
            java.lang.String r0 = X.C66580MXl.A0y(r1)
            boolean r0 = X.0qQ.A0K(r0, r8)
            if (r0 == 0) goto L_0x05ce
        L_0x05e2:
            X.3su r1 = (X.C254703su) r1
            boolean r0 = X.C72199OyL.A01(r1)
            if (r0 == 0) goto L_0x060b
            r0 = r23
            r0.add(r8)
            if (r2 == 0) goto L_0x05f4
            r0 = 1
            r2.A1f = r0
        L_0x05f4:
            boolean r0 = r4.A03
            if (r0 == 0) goto L_0x060b
            X.0eM r0 = r3.A04
            java.lang.Object r0 = r0.getValue()
            X.ODQ r0 = (X.ODQ) r0
            if (r0 == 0) goto L_0x060b
            java.util.Map r1 = r0.A00
            java.lang.String r0 = java.lang.String.valueOf(r12)
            r1.put(r8, r0)
        L_0x060b:
            X.0eM r0 = r3.A04
            java.lang.Object r0 = r0.getValue()
            X.ODQ r0 = (X.ODQ) r0
            if (r0 == 0) goto L_0x061a
            java.util.Map r0 = r0.A01
            r0.put(r8, r9)
        L_0x061a:
            if (r10 == 0) goto L_0x064b
            if (r7 == 0) goto L_0x0646
            int r0 = r7.intValue()
            if (r0 != r11) goto L_0x0646
            java.util.List r0 = r4.A01
            java.util.Iterator r3 = r0.iterator()
        L_0x062a:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0748
            java.lang.Object r1 = r3.next()
            java.lang.String r0 = X.C66580MXl.A0y(r1)
            boolean r0 = X.0qQ.A0K(r0, r8)
            if (r0 == 0) goto L_0x062a
        L_0x063e:
            X.3su r1 = (X.C254703su) r1
            boolean r0 = X.C72199OyL.A01(r1)
            if (r0 != 0) goto L_0x064b
        L_0x0646:
            r0 = r24
            r0.put(r8, r10)
        L_0x064b:
            java.util.Map r1 = r4.A02
            boolean r0 = r1.containsKey(r8)
            if (r0 == 0) goto L_0x0510
            if (r2 == 0) goto L_0x0510
            java.util.List r3 = X.C66580MXl.A13(r8, r1)
            java.util.List r0 = r4.A01
            java.util.Iterator r1 = r0.iterator()
        L_0x065f:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0745
            java.lang.Object r9 = r1.next()
            java.lang.String r0 = X.C66580MXl.A0y(r9)
            boolean r0 = X.0qQ.A0K(r0, r8)
            if (r0 == 0) goto L_0x065f
        L_0x0673:
            X.3su r9 = (X.C254703su) r9
            if (r3 == 0) goto L_0x0510
            java.util.Iterator r11 = r3.iterator()
        L_0x067b:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x0510
            X.3su r10 = X.C66580MXl.A0a(r11)
            if (r9 == 0) goto L_0x0742
            X.2FW r1 = r9.A0z
        L_0x0689:
            X.2FW r0 = X.2FW.A0N
            if (r1 != r0) goto L_0x073d
            X.0qQ.A0B(r9, r5)
            X.2FW r1 = r9.A10
            X.2FW r0 = X.2FW.A0y
            if (r1 != r0) goto L_0x073a
            java.lang.Object r1 = r9.A1T
            boolean r0 = r1 instanceof java.util.List
            if (r0 == 0) goto L_0x073a
            r0 = 12
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.0qQ.A0C(r1, r0)
            java.util.Iterator r3 = X.C51966G9m.A1H(r1)
        L_0x06a9:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x073a
            java.lang.Object r1 = r3.next()
            boolean r0 = r1 instanceof X.C254873tC
            if (r0 == 0) goto L_0x06a9
            com.instagram.model.mediasize.ExtendedImageUrl r0 = r9.A16
            if (r0 == 0) goto L_0x0738
            java.lang.String r0 = r0.A0A
        L_0x06bd:
            boolean r0 = X.C66834MdS.A08(r0)
            if (r0 == 0) goto L_0x06a9
            X.3tC r1 = (X.C254873tC) r1
            java.lang.String r8 = r1.A0u
            if (r8 == 0) goto L_0x073a
            com.instagram.model.mediasize.ExtendedImageUrl r0 = r9.A16
            if (r0 == 0) goto L_0x073a
            java.lang.String r7 = r0.A0A
            r3 = 72
            r1 = 108(0x6c, float:1.51E-43)
            com.instagram.model.mediasize.ExtendedImageUrl r0 = new com.instagram.model.mediasize.ExtendedImageUrl
            r0.<init>(r7, r3, r1)
            java.lang.Boolean r29 = X.AnonymousClass7TE.A0v()
            r26 = 0
            java.lang.Boolean r30 = java.lang.Boolean.valueOf(r5)
            X.3tD r25 = X.C254883tD.SINGLE
            r27 = r0
            r28 = r26
            r31 = r26
            r32 = r26
            r33 = r26
            r34 = r26
            r35 = r26
            r36 = r26
            r37 = r26
            r38 = r26
            r39 = r26
            r40 = r26
            r41 = r26
            r42 = r26
            r43 = r26
            r44 = r26
            r45 = r26
            r46 = r26
            r47 = r8
            r48 = r26
            r49 = r26
            r50 = r26
            r51 = r26
            r52 = r5
            r53 = r5
            r54 = r5
            r55 = r5
            X.3tC r1 = X.C71152OeO.A02(r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55)
        L_0x071e:
            boolean r0 = r1 instanceof X.C254873tC
            if (r0 == 0) goto L_0x0733
            java.util.List r1 = X.AnonymousClass7TE.A1I(r1)
        L_0x0726:
            X.3tI r0 = r10.A0P()
            if (r0 == 0) goto L_0x072e
            r0.A0Y = r1
        L_0x072e:
            r14.add(r10)
            goto L_0x067b
        L_0x0733:
            java.util.List r1 = X.AnonymousClass7TE.A1I(r2)
            goto L_0x0726
        L_0x0738:
            r0 = 0
            goto L_0x06bd
        L_0x073a:
            java.lang.Object r1 = r9.A1T
            goto L_0x071e
        L_0x073d:
            java.util.List r1 = X.AnonymousClass7TE.A1I(r2)
            goto L_0x0726
        L_0x0742:
            r1 = r15
            goto L_0x0689
        L_0x0745:
            r9 = r15
            goto L_0x0673
        L_0x0748:
            r1 = r15
            goto L_0x063e
        L_0x074b:
            r1 = r15
            goto L_0x05e2
        L_0x074e:
            r2 = r15
            goto L_0x05bd
        L_0x0751:
            boolean r0 = r4.A03
            r22 = r0
            java.util.List r9 = r4.A01
            java.util.Iterator r21 = r9.iterator()
        L_0x075b:
            boolean r0 = r21.hasNext()
            if (r0 == 0) goto L_0x091b
            X.3su r8 = X.C66580MXl.A0a(r21)
            java.lang.String r1 = r8.A0g()
            if (r1 == 0) goto L_0x075b
            X.OyL r7 = r4.A04
            r0 = r24
            java.lang.Object r0 = r0.get(r1)
            X.0eP r0 = (X.0eP) r0
            if (r0 == 0) goto L_0x08f1
            java.lang.Object r13 = r0.A00
            X.2FW r13 = (X.2FW) r13
            java.lang.Object r12 = r0.A01
            java.util.List r12 = (java.util.List) r12
            X.3tC r15 = X.C3266377o.A01(r8)
            r18 = 0
            if (r15 == 0) goto L_0x07b6
            com.instagram.model.mediasize.ExtendedImageUrl r0 = r15.A0X
            if (r0 == 0) goto L_0x07b6
            com.instagram.common.typedurl.ImageLoggingData r11 = r0.A00
            if (r11 == 0) goto L_0x07b6
            r0 = r11
            com.instagram.analytics.ppr.loggingdata.PPRLoggingData r0 = (com.instagram.analytics.ppr.loggingdata.PPRLoggingData) r0
            X.4KO r0 = r0.A00
            if (r0 == 0) goto L_0x07b6
            java.util.Iterator r17 = r12.iterator()
        L_0x079a:
            boolean r0 = r17.hasNext()
            if (r0 == 0) goto L_0x07b6
            java.lang.Object r10 = r17.next()
            X.3tC r10 = (X.C254873tC) r10
            long r2 = r15.A0K
            long r0 = r10.A0K
            int r16 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r16 != 0) goto L_0x079a
            com.instagram.model.mediasize.ExtendedImageUrl r0 = r10.A0X
            if (r0 == 0) goto L_0x07b4
            r0.A00 = r11
        L_0x07b4:
            r18 = 1
        L_0x07b6:
            r8.A17(r13, r12)
            if (r18 != 0) goto L_0x07c0
            com.instagram.common.session.UserSession r0 = r7.A00
            r8.A0x(r0)
        L_0x07c0:
            X.0eM r0 = r7.A04
            java.lang.Object r11 = r0.getValue()
            X.ODQ r11 = (X.ODQ) r11
            if (r11 == 0) goto L_0x075b
            java.lang.Object r15 = r12.get(r5)
            X.3tC r15 = (X.C254873tC) r15
        L_0x07d0:
            X.N3J r10 = r8.A0o
            if (r10 == 0) goto L_0x075b
            if (r22 == 0) goto L_0x080b
            long r0 = r10.A00
            long r19 = java.lang.System.currentTimeMillis()
            long r17 = r19 - r0
            java.util.Map r2 = r11.A00
            r25 = r2
            java.util.LinkedHashMap r12 = X.AnonymousClass7TE.A1H()
            java.util.Iterator r16 = X.AnonymousClass7TF.A0u(r25)
        L_0x07ea:
            boolean r3 = r16.hasNext()
            r2 = 0
            if (r3 == 0) goto L_0x088d
            java.util.Map$Entry r3 = X.AnonymousClass7TE.A1J(r16)
            java.lang.String r13 = X.DbT.A13(r3)
            java.lang.String r2 = r8.A0g()
            if (r2 != 0) goto L_0x0801
            java.lang.String r2 = ""
        L_0x0801:
            boolean r2 = X.00l.A0d(r13, r2, r5)
            if (r2 == 0) goto L_0x07ea
            X.JTR.A1U(r12, r3)
            goto L_0x07ea
        L_0x080b:
            java.lang.Long r2 = r10.A05
            r3 = 0
            if (r2 == 0) goto L_0x08ec
            long r0 = r2.longValue()
            long r18 = java.lang.System.currentTimeMillis()
            long r16 = r18 - r0
            java.util.Map r12 = r11.A01
            java.lang.String r0 = r8.A0g()
            java.lang.Object r1 = r12.get(r0)
            java.lang.String r1 = (java.lang.String) r1
            r12.clear()
            if (r15 == 0) goto L_0x088a
            java.lang.String r0 = r15.A0u
            r20 = r0
            com.instagram.model.mediasize.ExtendedImageUrl r0 = r15.A0X
            if (r0 == 0) goto L_0x0835
            java.lang.String r3 = r0.A0A
        L_0x0835:
            java.lang.Long r29 = java.lang.Long.valueOf(r18)
            java.lang.Long r30 = java.lang.Long.valueOf(r16)
            java.lang.String r0 = r10.A0A
            r19 = r0
            long r15 = r10.A00
            java.lang.Long r0 = r10.A02
            r18 = r0
            java.lang.Long r0 = r10.A01
            r17 = r0
            java.lang.String r0 = r10.A08
            r13 = r0
            java.lang.String r12 = r10.A09
            java.lang.String r10 = r10.A06
            X.N3J r0 = new X.N3J
            r25 = r0
            r26 = r18
            r27 = r17
            r28 = r2
            r31 = r19
            r32 = r13
            r33 = r1
            r34 = r12
            r35 = r10
            r36 = r20
            r37 = r3
            r38 = r15
            r25.<init>(r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38)
        L_0x086f:
            r8.A0o = r0
            if (r0 == 0) goto L_0x0878
            X.0eM r0 = r11.A02
            r0.getValue()
        L_0x0878:
            X.0eM r0 = r7.A03
            java.lang.Object r1 = r0.getValue()
            X.1Ng r1 = (X.1Ng) r1
            X.OsV r0 = new X.OsV
            r0.<init>()
            r1.A00(r0)
            goto L_0x075b
        L_0x088a:
            r20 = r3
            goto L_0x0835
        L_0x088d:
            java.lang.String r3 = r8.A0g()
            java.lang.Object r13 = r12.get(r3)
            java.lang.String r13 = (java.lang.String) r13
            java.util.Map r3 = r11.A01
            java.lang.String r12 = r8.A0g()
            java.lang.Object r12 = r3.get(r12)
            java.lang.String r12 = (java.lang.String) r12
            r25.clear()
            r3.clear()
            if (r15 == 0) goto L_0x08ee
            java.lang.String r3 = r15.A0u
            r36 = r3
            com.instagram.model.mediasize.ExtendedImageUrl r3 = r15.A0X
            if (r3 == 0) goto L_0x08b5
            java.lang.String r2 = r3.A0A
        L_0x08b5:
            java.lang.Long r26 = java.lang.Long.valueOf(r19)
            java.lang.Long r27 = java.lang.Long.valueOf(r17)
            java.lang.String r3 = r10.A0A
            r19 = r3
            java.lang.Long r3 = r10.A05
            r18 = r3
            java.lang.Long r3 = r10.A04
            r17 = r3
            java.lang.Long r3 = r10.A03
            r16 = r3
            java.lang.String r15 = r10.A09
            java.lang.String r10 = r10.A06
            X.N3J r3 = new X.N3J
            r25 = r3
            r28 = r18
            r29 = r17
            r30 = r16
            r31 = r19
            r32 = r13
            r33 = r12
            r34 = r15
            r35 = r10
            r37 = r2
            r38 = r0
            r25.<init>(r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38)
        L_0x08ec:
            r0 = r3
            goto L_0x086f
        L_0x08ee:
            r36 = r2
            goto L_0x08b5
        L_0x08f1:
            X.0eM r0 = r7.A04
            java.lang.Object r11 = r0.getValue()
            X.ODQ r11 = (X.ODQ) r11
            if (r11 == 0) goto L_0x075b
            r15 = 0
            goto L_0x07d0
        L_0x08fe:
            java.lang.Object r0 = X.C66996MgU.A01(r3)
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            java.lang.String r1 = r0.getMessage()
            java.lang.String r0 = "Failed to fetch Receiver Fetch results: "
            java.lang.String r1 = X.002.A0R(r0, r1)
            java.lang.String r0 = "ArmadilloExpressReceiverFetchApi"
            X.0KC.A0E(r0, r1)
            java.lang.Object r0 = r6.A01
            X.OTc r0 = (X.C70955OTc) r0
            X.C70955OTc.A00(r0)
            goto L_0x0933
        L_0x091b:
            X.OyL r3 = r4.A04
            X.0eM r0 = r3.A05
            X.2Dm r1 = X.C66580MXl.A0e(r0)
            java.util.ArrayList r0 = X.00k.A0S(r14, r9)
            java.lang.String r2 = r4.A00
            r1.FKL(r0, r2)
            java.util.Map r1 = r4.A02
            r0 = r23
            X.C72199OyL.A00(r3, r2, r0, r9, r1)
        L_0x0933:
            java.lang.Object r0 = r6.A02
            X.1a8 r0 = (X.1a8) r0
            r0.A01()
            return
        L_0x093b:
            X.C72204OyU.A07(r7, r6, r3)
            return
        L_0x093f:
            r0 = 16
            java.util.List r0 = X.C73429PcU.A00(r10, r0)
            java.util.Iterator r4 = r0.iterator()
        L_0x0949:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x097a
            java.lang.Object r3 = r4.next()
            X.N3E r3 = (X.N3E) r3
            X.OHQ r2 = new X.OHQ
            r2.<init>()
            java.lang.Long r0 = r3.A04
            long r0 = X.DbY.A04(r0)
            r2.A01 = r0
            java.lang.String r0 = r3.A06
            r2.A02 = r0
            java.lang.Integer r0 = r3.A02
            int r0 = X.AnonymousClass7TG.A0A(r0)
            r2.A00 = r0
            java.lang.Long r0 = r3.A05
            boolean r0 = X.AnonymousClass7TF.A1V(r0)
            r2.A06 = r0
            r8.add(r2)
            goto L_0x0949
        L_0x097a:
            r5.A03 = r8
            X.PaP r0 = new X.PaP
            r0.<init>(r6, r5, r7)
            X.11Z.A02(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.PU9.accept(java.lang.Object):void");
    }
}
