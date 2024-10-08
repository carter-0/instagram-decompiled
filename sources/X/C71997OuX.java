package X;

/* renamed from: X.OuX  reason: case insensitive filesystem */
public final /* synthetic */ class C71997OuX implements C74306Psg {
    public static final C71997OuX A00 = new C71997OuX();

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v116, resolved type: X.Mb9} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v4, resolved type: X.Mb9} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v5, resolved type: X.Mb9} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object ABl(java.lang.Object r78, java.lang.Object r79, java.lang.Object r80) {
        /*
            r77 = this;
            r5 = r80
            r8 = r79
            r7 = r78
            java.util.List r7 = (java.util.List) r7
            java.util.List r8 = (java.util.List) r8
            java.util.Map r5 = (java.util.Map) r5
            X.AnonymousClass7TG.A1T(r7, r8, r5)
            java.util.ArrayList r13 = X.AnonymousClass7TE.A1C()
            java.util.LinkedHashMap r3 = X.AnonymousClass7TE.A1H()
            java.util.Iterator r2 = X.AnonymousClass7TF.A0u(r5)
        L_0x001b:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0037
            java.util.Map$Entry r0 = X.AnonymousClass7TE.A1J(r2)
            java.lang.Object r1 = r0.getKey()
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            java.lang.Long r0 = X.C51968G9o.A0v(r0)
            r3.put(r0, r1)
            goto L_0x001b
        L_0x0037:
            java.util.Map r6 = X.0Yt.A0B(r3)
            java.util.LinkedHashMap r4 = X.AnonymousClass7TE.A1H()
            java.util.Iterator r3 = r8.iterator()
        L_0x0043:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x006c
            java.lang.Object r2 = r3.next()
            X.Mb9 r2 = (X.C66702Mb9) r2
            X.3sy r0 = r2.A0J
            long r0 = X.C66647MaG.A00(r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.Object r1 = r6.get(r0)
            if (r1 == 0) goto L_0x0068
            r0 = 0
            X.0eP r0 = X.AnonymousClass7TE.A1L(r0, r2)
            r4.put(r1, r0)
            goto L_0x0043
        L_0x0068:
            r13.add(r2)
            goto L_0x0043
        L_0x006c:
            java.util.Iterator r3 = r7.iterator()
        L_0x0070:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x00a0
            java.lang.Object r2 = r3.next()
            X.Mb9 r2 = (X.C66702Mb9) r2
            X.3sy r0 = r2.A0J
            java.lang.String r1 = X.C66647MaG.A09(r0)
            if (r1 == 0) goto L_0x009c
            boolean r0 = r5.containsKey(r1)
            if (r0 == 0) goto L_0x009c
            java.lang.Object r0 = r4.get(r1)
            X.0eP r0 = (X.0eP) r0
            if (r0 == 0) goto L_0x0070
            java.lang.Object r0 = r0.A01
            X.0eP r0 = X.AnonymousClass7TE.A1L(r2, r0)
            r4.put(r1, r0)
            goto L_0x0070
        L_0x009c:
            r13.add(r2)
            goto L_0x0070
        L_0x00a0:
            java.util.ArrayList r19 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r18 = X.AnonymousClass7TF.A0s(r4)
        L_0x00a8:
            boolean r0 = r18.hasNext()
            if (r0 == 0) goto L_0x02fb
            java.util.Map$Entry r0 = X.AnonymousClass7TE.A1J(r18)
            java.lang.Object r3 = r0.getValue()
            X.0eP r3 = (X.0eP) r3
            java.lang.Object r2 = r3.A00
            X.Mb9 r2 = (X.C66702Mb9) r2
            if (r2 == 0) goto L_0x02ee
            java.lang.Object r12 = r3.A01
            X.Mb9 r12 = (X.C66702Mb9) r12
            boolean r0 = r12.A0T
            r17 = r0
            if (r0 == 0) goto L_0x02ea
            long r0 = r12.A05
        L_0x00ca:
            r50 = r0
            boolean r0 = r2.A0j
            r16 = r0
            if (r0 == 0) goto L_0x01dd
            X.Mb1 r0 = r2.A0B
            r76 = r0
            X.DcN r0 = r2.A0G
            r30 = r0
            X.Mb0 r15 = r2.A0D
            java.lang.String r14 = r12.A0M
            java.lang.String r0 = r12.A0N
            r35 = r0
            java.lang.String r0 = r12.A0O
            r36 = r0
            boolean r0 = r12.A0e
            r63 = r0
            boolean r0 = r12.A0k
            r54 = r0
            com.instagram.model.direct.DirectThreadKey r11 = r12.A0I
            X.3sy r10 = r12.A0J
            com.instagram.model.direct.DirectShareTarget r9 = r12.A0H
            X.3tH r8 = r12.A0E
            int r0 = r12.A01
            r44 = r0
            int r0 = r12.A02
            r45 = r0
            boolean r0 = r12.A0n
            r55 = r0
            X.N5L r0 = r12.A0F
            r75 = r0
            float r0 = r12.A00
            r43 = r0
            boolean r0 = r12.A0l
            r56 = r0
            boolean r0 = r12.A0m
            r57 = r0
            X.McM r7 = r12.A0A
            X.Noi r0 = r12.A0C
            r74 = r0
            X.JwJ r6 = r12.A07
            X.Mbz r5 = r12.A09
            java.util.List r4 = r12.A0R
            int r0 = r12.A03
            r46 = r0
            boolean r0 = r12.A0c
            r58 = r0
            java.lang.String r3 = r12.A0L
            boolean r0 = r12.A0b
            r59 = r0
            java.util.List r2 = r12.A0S
            boolean r0 = r12.A0h
            r60 = r0
            long r0 = r12.A06
            r52 = r0
            X.Pwa r0 = r12.A08
            r73 = r0
            java.util.List r0 = r12.A0Q
            r42 = r0
            java.lang.String r0 = r12.A0K
            r38 = r0
            boolean r0 = r12.A0f
            r61 = r0
            boolean r0 = r12.A0g
            r62 = r0
            boolean r0 = r12.A0Y
            r29 = r0
            boolean r0 = r12.A0a
            r28 = r0
            boolean r0 = r12.A0Z
            r27 = r0
            boolean r0 = r12.A0U
            r26 = r0
            boolean r0 = r12.A0X
            r25 = r0
            boolean r0 = r12.A0V
            r24 = r0
            int r0 = r12.A04
            r23 = r0
            java.lang.String r0 = r12.A0P
            r22 = r0
            boolean r0 = r12.A0W
            r21 = r0
            boolean r0 = r12.A0d
            r20 = r0
            boolean r0 = r12.A0i
            r1 = r0
            r0 = 0
            X.0qQ.A0B(r14, r0)
            r0 = 6
            X.C51973G9u.A0s(r0, r11, r10, r9)
            r0 = 9
            X.C66581MXm.A1P(r8, r0, r7)
            r0 = 20
            X.C66583MXo.A0q(r0, r15, r6, r5, r4)
            r0 = 27
            X.0qQ.A0B(r3, r0)
            r0 = 30
            X.0qQ.A0B(r2, r0)
            X.Mb9 r0 = new X.Mb9
            r31 = r9
            r32 = r11
            r33 = r10
            r34 = r14
            r37 = r3
            r39 = r22
            r40 = r4
            r41 = r2
            r47 = r23
            r48 = r50
            r50 = r52
            r52 = r16
            r53 = r63
            r63 = r29
            r64 = r28
            r65 = r27
            r66 = r26
            r67 = r25
            r68 = r24
            r69 = r17
            r70 = r21
            r71 = r20
            r72 = r1
            r20 = r0
            r21 = r6
            r22 = r73
            r23 = r5
            r24 = r7
            r25 = r76
            r26 = r74
            r27 = r15
            r28 = r8
            r29 = r75
            r20.<init>(r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r50, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70, r71, r72)
        L_0x01d8:
            r13.add(r0)
            goto L_0x00a8
        L_0x01dd:
            java.lang.String r15 = r12.A0M
            java.lang.String r0 = r12.A0N
            r35 = r0
            java.lang.String r0 = r12.A0O
            r36 = r0
            boolean r0 = r12.A0j
            r63 = r0
            boolean r0 = r12.A0e
            r62 = r0
            boolean r0 = r12.A0k
            r54 = r0
            com.instagram.model.direct.DirectThreadKey r14 = r12.A0I
            X.3sy r11 = r12.A0J
            com.instagram.model.direct.DirectShareTarget r10 = r12.A0H
            X.3tH r9 = r12.A0E
            int r0 = r12.A01
            r44 = r0
            int r0 = r12.A02
            r45 = r0
            boolean r0 = r12.A0n
            r55 = r0
            X.DcN r0 = r12.A0G
            r30 = r0
            X.N5L r0 = r12.A0F
            r76 = r0
            float r0 = r12.A00
            r43 = r0
            boolean r0 = r12.A0l
            r56 = r0
            boolean r0 = r12.A0m
            r57 = r0
            X.Mb1 r0 = r12.A0B
            r75 = r0
            X.McM r8 = r12.A0A
            X.Mb0 r7 = r12.A0D
            X.Noi r0 = r12.A0C
            r74 = r0
            X.JwJ r6 = r12.A07
            X.Mbz r5 = r12.A09
            java.util.List r4 = r12.A0R
            int r0 = r12.A03
            r46 = r0
            boolean r0 = r12.A0c
            r58 = r0
            java.lang.String r3 = r12.A0L
            boolean r0 = r12.A0b
            r59 = r0
            java.util.List r2 = r12.A0S
            boolean r0 = r12.A0h
            r60 = r0
            long r0 = r12.A06
            r52 = r0
            X.Pwa r0 = r12.A08
            r73 = r0
            java.util.List r0 = r12.A0Q
            r42 = r0
            java.lang.String r0 = r12.A0K
            r38 = r0
            boolean r0 = r12.A0f
            r61 = r0
            boolean r0 = r12.A0g
            r29 = r0
            boolean r0 = r12.A0Y
            r28 = r0
            boolean r0 = r12.A0a
            r27 = r0
            boolean r0 = r12.A0Z
            r26 = r0
            boolean r0 = r12.A0U
            r25 = r0
            boolean r0 = r12.A0X
            r24 = r0
            boolean r0 = r12.A0V
            r23 = r0
            int r0 = r12.A04
            r22 = r0
            java.lang.String r0 = r12.A0P
            r21 = r0
            boolean r0 = r12.A0W
            r20 = r0
            boolean r0 = r12.A0d
            r16 = r0
            boolean r1 = r12.A0i
            r0 = 0
            X.0qQ.A0B(r15, r0)
            r0 = 6
            X.C51973G9u.A0s(r0, r14, r11, r10)
            r0 = 9
            X.C66581MXm.A1P(r9, r0, r8)
            r0 = 20
            X.C66583MXo.A0q(r0, r7, r6, r5, r4)
            r0 = 27
            X.0qQ.A0B(r3, r0)
            r0 = 30
            X.0qQ.A0B(r2, r0)
            X.Mb9 r0 = new X.Mb9
            r31 = r10
            r32 = r14
            r33 = r11
            r34 = r15
            r37 = r3
            r39 = r21
            r40 = r4
            r41 = r2
            r47 = r22
            r48 = r50
            r50 = r52
            r52 = r63
            r53 = r62
            r62 = r29
            r63 = r28
            r64 = r27
            r65 = r26
            r66 = r25
            r67 = r24
            r68 = r23
            r69 = r17
            r70 = r20
            r71 = r16
            r72 = r1
            r20 = r0
            r21 = r6
            r22 = r73
            r23 = r5
            r24 = r8
            r25 = r75
            r26 = r74
            r27 = r7
            r28 = r9
            r29 = r76
            r20.<init>(r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r50, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70, r71, r72)
            goto L_0x01d8
        L_0x02ea:
            long r0 = r2.A05
            goto L_0x00ca
        L_0x02ee:
            java.lang.Object r1 = r0.getKey()
            r0 = r19
            r0.add(r1)
            java.lang.Object r0 = r3.A01
            goto L_0x01d8
        L_0x02fb:
            r0 = 21
            java.util.List r1 = X.C73429PcU.A00(r13, r0)
            r0 = 22
            java.util.List r1 = X.C73429PcU.A00(r1, r0)
            r0 = r19
            X.0eP r0 = X.AnonymousClass7TE.A1L(r1, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71997OuX.ABl(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
