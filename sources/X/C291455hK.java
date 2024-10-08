package X;

/* renamed from: X.5hK  reason: invalid class name and case insensitive filesystem */
public abstract class C291455hK {
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0018, code lost:
        if (r5.isEmpty() == false) goto L_0x001c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A00(X.C257013wi r66, com.facebook.exoplayer.monitor.VpsEventCallback r67, X.C256683wB r68, java.lang.String r69, int r70, long r71, boolean r73, boolean r74, boolean r75, boolean r76) {
        /*
            r7 = r66
            r2 = r68
            r7.A01 = r2
            r0 = r2
            if (r68 != 0) goto L_0x000b
            X.3wB r0 = r7.A0D
        L_0x000b:
            if (r0 == 0) goto L_0x011a
            X.3wA r0 = r0.A0N
            java.lang.String r5 = r0.A07
            r1 = r5
            if (r5 == 0) goto L_0x001a
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L_0x001c
        L_0x001a:
            java.lang.String r1 = "default"
        L_0x001c:
            java.util.Map r4 = r7.A07
            boolean r0 = r4.containsKey(r1)
            if (r0 == 0) goto L_0x0117
            java.lang.Object r3 = r4.get(r1)
            X.3wj r3 = (X.C257023wj) r3
        L_0x002a:
            if (r5 == 0) goto L_0x0032
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L_0x0034
        L_0x0032:
            java.lang.String r5 = "default"
        L_0x0034:
            java.util.Map r1 = r7.A06
            boolean r0 = r1.containsKey(r5)
            if (r0 == 0) goto L_0x003f
            r1.get(r5)
        L_0x003f:
            if (r3 == 0) goto L_0x0111
            long r0 = r3.A01
            r19 = r0
            long r0 = r3.A02
        L_0x0047:
            X.3wB r5 = r7.A01
            if (r5 == 0) goto L_0x010b
            int r3 = r5.A05
            r21 = r3
            X.3wA r5 = r5.A0N
            java.lang.String r3 = r5.A07
            r4.get(r3)
            java.lang.String r3 = r5.A07
            r18 = r3
        L_0x005a:
            long r47 = java.lang.System.currentTimeMillis()
            long r5 = r7.A0A
            r53 = r5
            long r5 = r7.A09
            r55 = r5
            long r5 = r7.A0C
            r57 = r5
            long r5 = r7.A0B
            r59 = r5
            X.3wB r5 = r7.A0D
            if (r5 != 0) goto L_0x0103
            r11 = 0
            r10 = 0
        L_0x0074:
            X.3wB r3 = r7.A0E
            if (r3 != 0) goto L_0x00fd
            r14 = 0
        L_0x0079:
            X.3wB r8 = r7.A0F
            if (r8 != 0) goto L_0x00f4
            r16 = 0
            r15 = 0
        L_0x0080:
            X.3wB[] r12 = r7.A0K
            int r9 = r12.length
            X.4Yf[] r3 = new X.AnonymousClass4Yf[r9]
            r17 = r3
            r6 = 0
        L_0x0088:
            if (r6 >= r9) goto L_0x011d
            r13 = r12[r6]
            java.lang.String r3 = r13.A0T
            r23 = r3
            java.lang.String r3 = r13.A0S
            r24 = r3
            int r3 = r13.A0L
            r32 = r3
            int r3 = r13.A0A
            r33 = r3
            int r3 = r13.A06
            r34 = r3
            int r3 = r13.A0G
            r35 = r3
            int r3 = r13.A05
            r36 = r3
            java.lang.String r3 = r13.A0R
            r25 = r3
            X.3wA r13 = r13.A0N
            java.lang.String r3 = r13.A07
            r26 = r3
            java.lang.String r3 = r13.A05
            r27 = r3
            java.lang.String r3 = r13.A06
            r28 = r3
            java.lang.String r3 = r13.A04
            r29 = r3
            java.lang.String r3 = r13.A08
            r30 = r3
            java.lang.String r3 = r13.A02
            r31 = r3
            boolean r3 = r13.A0H
            r38 = r3
            boolean r3 = r13.A0I
            r39 = r3
            boolean r3 = r13.A0E
            r40 = r3
            boolean r3 = r13.A0D
            r41 = r3
            boolean r3 = r13.A0C
            r42 = r3
            boolean r3 = r13.A0B
            r43 = r3
            boolean r3 = r13.A0A
            r44 = r3
            boolean r3 = r13.A09
            r45 = r3
            int r3 = r13.A01
            X.4Yf r22 = new X.4Yf
            r37 = r3
            r22.<init>(r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45)
            r17[r6] = r22
            int r6 = r6 + 1
            goto L_0x0088
        L_0x00f4:
            int r3 = r8.A05
            r16 = r3
            X.3wA r3 = r8.A0N
            java.lang.String r15 = r3.A07
            goto L_0x0080
        L_0x00fd:
            X.3wA r3 = r3.A0N
            java.lang.String r14 = r3.A07
            goto L_0x0079
        L_0x0103:
            int r11 = r5.A05
            X.3wA r3 = r5.A0N
            java.lang.String r10 = r3.A07
            goto L_0x0074
        L_0x010b:
            r21 = 0
            r18 = 0
            goto L_0x005a
        L_0x0111:
            r19 = -1
            r0 = -1
            goto L_0x0047
        L_0x0117:
            r3 = 0
            goto L_0x002a
        L_0x011a:
            r5 = 0
            goto L_0x001a
        L_0x011d:
            java.lang.String r27 = r7.A02()
            java.lang.StringBuilder r3 = r7.A0H
            java.lang.String r28 = r3.toString()
            if (r8 != 0) goto L_0x0157
            r9 = 0
        L_0x012a:
            java.lang.String r29 = r7.A01()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.util.Set r3 = r4.entrySet()
            java.util.Iterator r8 = r3.iterator()
        L_0x013b:
            boolean r3 = r8.hasNext()
            if (r3 == 0) goto L_0x015a
            java.lang.Object r3 = r8.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getKey()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r3 = r3.getValue()
            X.3wj r3 = (X.C257023wj) r3
            X.C257013wi.A00(r3, r4, r6)
            goto L_0x013b
        L_0x0157:
            int r9 = r8.A0L
            goto L_0x012a
        L_0x015a:
            java.lang.String r30 = r6.toString()
            if (r5 != 0) goto L_0x01de
            r3 = 0
        L_0x0161:
            X.3wB r6 = r7.A01
            if (r6 != 0) goto L_0x01db
            r4 = 0
        L_0x0166:
            if (r5 != 0) goto L_0x01d8
            r5 = 0
        L_0x0169:
            if (r6 != 0) goto L_0x01d5
            r6 = 0
        L_0x016c:
            int r8 = r7.A08
            r12 = r76
            float r37 = com.facebook.video.heroplayer.common.MosScoreCalculation.A00(r2, r8, r12)
            java.lang.String r2 = r7.A0G
            r24 = r2
            boolean r2 = r7.A0J
            r23 = r2
            X.3wB r2 = r7.A01
            if (r2 != 0) goto L_0x01d0
            r2 = 0
        L_0x0181:
            java.lang.String r13 = r7.A05
            float r12 = r7.A00
            X.5hL r7 = new X.5hL
            r22 = r69
            r45 = r70
            r49 = r71
            r63 = r73
            r64 = r74
            r65 = r75
            r31 = r5
            r32 = r6
            r33 = r24
            r34 = r2
            r35 = r13
            r36 = r17
            r38 = r12
            r39 = r11
            r40 = r21
            r41 = r16
            r42 = r9
            r43 = r3
            r44 = r4
            r46 = r8
            r51 = r53
            r53 = r55
            r55 = r57
            r57 = r59
            r59 = r19
            r61 = r0
            r66 = r23
            r21 = r7
            r23 = r10
            r24 = r18
            r25 = r14
            r26 = r15
            r21.<init>(r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r49, r51, r53, r55, r57, r59, r61, r63, r64, r65, r66)
            r0 = r67
            r0.callback(r7)
            return
        L_0x01d0:
            X.3wA r2 = r2.A0N
            java.lang.String r2 = r2.A02
            goto L_0x0181
        L_0x01d5:
            java.lang.String r6 = r6.A0T
            goto L_0x016c
        L_0x01d8:
            java.lang.String r5 = r5.A0T
            goto L_0x0169
        L_0x01db:
            int r4 = r6.A0L
            goto L_0x0166
        L_0x01de:
            int r3 = r5.A0L
            goto L_0x0161
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C291455hK.A00(X.3wi, com.facebook.exoplayer.monitor.VpsEventCallback, X.3wB, java.lang.String, int, long, boolean, boolean, boolean, boolean):void");
    }
}
