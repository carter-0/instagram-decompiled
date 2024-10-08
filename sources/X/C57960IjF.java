package X;

import java.util.List;

/* renamed from: X.IjF  reason: case insensitive filesystem */
public final class C57960IjF implements Runnable {
    public final /* synthetic */ C228472lj A00;
    public final /* synthetic */ Integer A01;
    public final /* synthetic */ List A02;
    public final /* synthetic */ List A03;

    public C57960IjF(C228472lj r1, Integer num, List list, List list2) {
        this.A03 = list;
        this.A02 = list2;
        this.A01 = num;
        this.A00 = r1;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v0, resolved type: java.lang.Long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v1, resolved type: java.lang.Long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r37v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r38v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v2, resolved type: java.lang.Long} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r40 = this;
            r8 = r40
            java.util.List r0 = r8.A03
            r39 = r0
            int r16 = r39.size()
            r7 = 0
        L_0x000b:
            r15 = 4
            r10 = 1
            r0 = r16
            if (r7 >= r0) goto L_0x01a0
            r0 = r39
            java.lang.Object r0 = r0.get(r7)
            X.1XM r0 = (X.1XM) r0
            java.util.List r1 = r8.A02
            java.lang.Object r6 = r1.get(r7)
            X.1GU r6 = (X.AnonymousClass1GU) r6
            if (r0 == 0) goto L_0x013d
            if (r6 == 0) goto L_0x013d
            if (r7 != 0) goto L_0x00ee
            java.lang.Integer r2 = r8.A01
            java.lang.Integer r1 = X.AnonymousClass05K.A15
            if (r2 == r1) goto L_0x00ee
            r5 = 1
            X.1FS r13 = r6.A00
            r34 = 0
            X.1FI r20 = X.1FI.A0H
            r9 = 0
            java.lang.String r12 = r13.A0A
            X.1FQ r11 = r13.A05
            java.lang.String r1 = r13.A08
            r24 = r1
            X.0to r1 = r13.A03
            r35 = r1
            java.lang.String r1 = r13.A0C
            r25 = r1
            java.lang.String r1 = r13.A0B
            r26 = r1
            java.util.Map r4 = r13.A0E
            java.util.Map r2 = r13.A0D
            java.lang.String r1 = r13.A09
            int r3 = r13.A01
            r23 = r3
            java.lang.String r3 = r13.A07
            r21 = r3
            boolean r3 = r13.A00
            r19 = r3
            X.1FR r3 = r13.A02
            r18 = r3
            java.lang.Long r3 = r13.A06
            r22 = r3
            boolean r14 = r13.A0F
            X.0qQ.A0B(r12, r9)
        L_0x0068:
            r3 = 2
            X.C51973G9u.A0s(r3, r11, r4, r2)
            r13 = 9
            X.0qQ.A0B(r1, r13)
            X.1FS r17 = new X.1FS
            r27 = r1
            r28 = r21
            r29 = r4
            r30 = r2
            r31 = r23
            r32 = r19
            r33 = r14
            r19 = r35
            r21 = r11
            r23 = r12
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
            X.2lj r4 = r8.A00
            X.2ll r1 = r4.A0b
            java.lang.String r35 = "DEFERRED"
            java.lang.String r36 = "delivery_controller"
            r33 = r6
            r37 = r34
            r38 = r34
            r32 = r1
            r32.A05(r33, r34, r35, r36, r37, r38)
            java.lang.Integer r2 = r8.A01
            java.lang.Integer r1 = X.AnonymousClass05K.A15
            if (r2 != r1) goto L_0x012b
            com.instagram.common.session.UserSession r12 = r4.A0Q
            java.lang.Long r1 = X.C55282HfB.A00(r12)
            long r1 = r1.longValue()
            int r11 = (int) r1
            if (r11 == r3) goto L_0x00bb
            java.lang.Long r1 = X.C55282HfB.A00(r12)
            long r1 = r1.longValue()
            int r3 = (int) r1
            if (r3 != r15) goto L_0x014a
        L_0x00bb:
            java.util.List r1 = r0.A00()
            java.util.ArrayList r11 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r13 = r1.iterator()
            r12 = 0
        L_0x00c8:
            boolean r1 = r13.hasNext()
            if (r1 == 0) goto L_0x0141
            java.lang.Object r3 = r13.next()
            int r2 = r12 + 1
            if (r12 >= 0) goto L_0x00de
            X.0sr.A1T()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x00de:
            r1 = r3
            X.1Xg r1 = (X.1Xg) r1
            if (r12 > r10) goto L_0x00e9
            boolean r1 = X.AnonymousClass3VP.A01(r1)
            if (r1 != 0) goto L_0x00ec
        L_0x00e9:
            r11.add(r3)
        L_0x00ec:
            r12 = r2
            goto L_0x00c8
        L_0x00ee:
            r5 = 0
            X.1FS r13 = r6.A00
            r34 = 0
            X.1FI r20 = X.1FI.A0G
            r9 = 0
            java.lang.String r12 = r13.A0A
            X.1FQ r11 = r13.A05
            java.lang.String r1 = r13.A08
            r24 = r1
            X.0to r1 = r13.A03
            r35 = r1
            java.lang.String r1 = r13.A0C
            r25 = r1
            java.lang.String r1 = r13.A0B
            r26 = r1
            java.util.Map r4 = r13.A0E
            java.util.Map r2 = r13.A0D
            java.lang.String r1 = r13.A09
            int r3 = r13.A01
            r23 = r3
            java.lang.String r3 = r13.A07
            r21 = r3
            boolean r3 = r13.A00
            r19 = r3
            X.1FR r3 = r13.A02
            r18 = r3
            java.lang.Long r3 = r13.A06
            r22 = r3
            boolean r14 = r13.A0F
            X.0qQ.A0B(r12, r5)
            goto L_0x0068
        L_0x012b:
            if (r5 != 0) goto L_0x014a
            X.1FS r1 = r6.A00
            java.lang.String r2 = r1.A0A
            X.3kK r1 = r4.A0l
            java.lang.String r1 = r1.getSessionId()
            boolean r1 = X.0qQ.A0K(r2, r1)
            if (r1 != 0) goto L_0x014a
        L_0x013d:
            int r7 = r7 + 1
            goto L_0x000b
        L_0x0141:
            boolean r1 = r11.isEmpty()
            if (r1 != 0) goto L_0x013d
            r0.A01(r11)
        L_0x014a:
            X.3PG r19 = X.AnonymousClass3PG.NETWORK
            java.lang.Integer r21 = java.lang.Integer.valueOf(r7)
            r18 = r0
            r20 = r4
            r22 = r5
            r23 = r9
            r24 = r10
            X.C228472lj.A03(r17, r18, r19, r20, r21, r22, r23, r24)
            X.2lr r12 = r4.A0f
            long r2 = java.lang.System.currentTimeMillis()
            if (r5 == 0) goto L_0x0183
            com.instagram.common.session.UserSession r11 = r12.A0J
            X.3Yt r1 = new X.3Yt
            r1.<init>(r11, r2)
            r12.A07 = r1
        L_0x016e:
            X.2ls r11 = r12.A0S
            long r0 = r0.A00
            if (r5 == 0) goto L_0x0181
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
        L_0x0178:
            r11.A00 = r0
            if (r2 == 0) goto L_0x017e
            r11.A01 = r2
        L_0x017e:
            if (r7 != 0) goto L_0x013d
            goto L_0x018a
        L_0x0181:
            r2 = 0
            goto L_0x0178
        L_0x0183:
            X.3Yt r1 = r12.A07
            if (r1 == 0) goto L_0x016e
            r1.A00 = r2
            goto L_0x016e
        L_0x018a:
            X.2jw r1 = r4.A0n     // Catch:{ Exception -> 0x0197 }
            r1.A0V(r9, r9)     // Catch:{ Exception -> 0x0197 }
            X.1FS r0 = r6.A00     // Catch:{ Exception -> 0x0197 }
            java.lang.String r0 = r0.A09     // Catch:{ Exception -> 0x0197 }
            r1.A0U(r10, r0)     // Catch:{ Exception -> 0x0197 }
            goto L_0x013d
        L_0x0197:
            r2 = move-exception
            java.lang.Class<X.2lj> r1 = X.C228472lj.class
            java.lang.String r0 = "Exception in loadDeferredFeed "
            X.0KC.A05(r1, r0, r2)
            goto L_0x013d
        L_0x01a0:
            X.2lj r5 = r8.A00
            X.2lo r0 = r5.A0i
            r0.A00()
            com.instagram.common.session.UserSession r4 = r5.A0Q
            java.lang.Long r0 = X.C55282HfB.A00(r4)
            long r2 = r0.longValue()
            int r1 = (int) r2
            r0 = 3
            if (r1 == r0) goto L_0x01c0
            java.lang.Long r0 = X.C55282HfB.A00(r4)
            long r1 = r0.longValue()
            int r0 = (int) r1
            if (r0 != r15) goto L_0x01c9
        L_0x01c0:
            X.2wm r1 = r5.A0G
            if (r1 == 0) goto L_0x01c9
            r1.A03 = r10
            r0 = 0
            r1.A00 = r0
        L_0x01c9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C57960IjF.run():void");
    }
}
