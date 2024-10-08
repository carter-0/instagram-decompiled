package X;

import java.util.Map;

/* renamed from: X.5Wv  reason: invalid class name and case insensitive filesystem */
public abstract class C286545Wv {
    public final int A00;
    public final int A01;

    public String A00(int i) {
        return 002.A0I("IntParameter(", ')', i);
    }

    public String A01(int i) {
        return 002.A0I("ObjectParameter(", ')', i);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v71, resolved type: X.5R6} */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x0307, code lost:
        if ((r9[r1 + 1] & 201326592) == 0) goto L_0x0309;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A02(X.C286475Wm r24, X.C288455bw r25, X.AnonymousClass5X4 r26, X.C288475by r27) {
        /*
            r23 = this;
            r1 = r23
            r9 = r24
            r8 = r25
            r3 = r27
            boolean r0 = r1 instanceof X.C288485bz
            r4 = r26
            if (r0 == 0) goto L_0x0012
            X.AnonymousClass5XN.A01(r8, r4)
        L_0x0011:
            return
        L_0x0012:
            boolean r0 = r1 instanceof X.C286675Xi
            if (r0 == 0) goto L_0x0028
            X.5bx r3 = (X.C288465bx) r3
            X.5Wu r0 = r3.A03
            java.lang.Object[] r1 = r0.A07
            int r0 = r3.A01
            r2 = r1[r0]
            X.5bv r8 = (X.C288445bv) r8
            java.util.List r0 = r8.A05
        L_0x0024:
            r0.add(r2)
            return
        L_0x0028:
            boolean r0 = r1 instanceof X.C288495c0
            if (r0 == 0) goto L_0x003b
            X.5Wl r9 = (X.C286465Wl) r9
            java.lang.Object r1 = r9.A00
            java.lang.String r0 = "null cannot be cast to non-null type androidx.compose.runtime.ComposeNodeLifecycleCallback"
            X.0qQ.A0C(r1, r0)
            X.5R9 r1 = (X.AnonymousClass5R9) r1
            r1.Dfm()
            return
        L_0x003b:
            boolean r0 = r1 instanceof X.AnonymousClass5aP
            if (r0 == 0) goto L_0x0057
            X.5bx r3 = (X.C288465bx) r3
            X.5Wu r0 = r3.A03
            java.lang.Object[] r1 = r0.A07
            int r0 = r3.A01
            r2 = r1[r0]
            int r0 = r0 + 1
            r1 = r1[r0]
            X.0sL r1 = (X.0sL) r1
            X.5Wl r9 = (X.C286465Wl) r9
            java.lang.Object r0 = r9.A00
            r1.invoke(r0, r2)
            return
        L_0x0057:
            boolean r0 = r1 instanceof X.C288505c1
            if (r0 == 0) goto L_0x00ab
            X.5bx r3 = (X.C288465bx) r3
            X.5Wu r2 = r3.A03
            java.lang.Object[] r1 = r2.A07
            int r0 = r3.A01
            r6 = r1[r0]
            int[] r1 = r2.A05
            int r0 = r3.A00
            r5 = r1[r0]
            boolean r0 = r6 instanceof X.C286695Xk
            if (r0 == 0) goto L_0x007c
            r0 = r6
            X.5Xk r0 = (X.C286695Xk) r0
            X.2DP r1 = r0.A01
            r0 = r8
            X.5bv r0 = (X.C288445bv) r0
            java.util.List r0 = r0.A05
            r0.add(r1)
        L_0x007c:
            int r0 = r4.A00
            int r3 = r4.A0G(r0, r5)
            int r0 = r4.A0B
            if (r3 < r0) goto L_0x0089
            int r0 = r4.A09
            int r3 = r3 + r0
        L_0x0089:
            java.lang.Object[] r1 = r4.A0J
            r2 = r1[r3]
            r1[r3] = r6
            boolean r0 = r2 instanceof X.C286695Xk
            if (r0 == 0) goto L_0x0260
            int r1 = r1.length
            int r0 = r4.A09
            int r1 = r1 - r0
            int r0 = r4.A00
            int r0 = r4.A0G(r0, r5)
            int r1 = r1 - r0
            X.5Xk r2 = (X.C286695Xk) r2
            X.2DP r2 = r2.A01
            X.5bv r8 = (X.C288445bv) r8
            X.C288445bv.A00(r8, r1)
            java.util.List r0 = r8.A03
            goto L_0x0024
        L_0x00ab:
            boolean r0 = r1 instanceof X.C288515c2
            if (r0 == 0) goto L_0x00dd
            X.5bx r3 = (X.C288465bx) r3
            X.5Wu r0 = r3.A03
            int[] r1 = r0.A05
            int r0 = r3.A00
            r1 = r1[r0]
            if (r1 < 0) goto L_0x0271
            int r0 = r4.A06
            if (r0 > 0) goto L_0x026a
            if (r1 == 0) goto L_0x0011
            int r3 = r4.A00
            int r3 = r3 + r1
            int r2 = r4.A08
            if (r3 < r2) goto L_0x0443
            int r0 = r4.A01
            if (r3 > r0) goto L_0x0443
            r4.A00 = r3
            int[] r1 = r4.A0I
            int r0 = X.AnonymousClass5X4.A00(r4, r3)
            int r2 = X.AnonymousClass5X4.A01(r4, r1, r0)
            r4.A02 = r2
        L_0x00da:
            r4.A03 = r2
            return
        L_0x00dd:
            boolean r0 = r1 instanceof X.C287585aN
            if (r0 == 0) goto L_0x0123
            X.5bx r3 = (X.C288465bx) r3
            X.5Wu r5 = r3.A03
            java.lang.Object[] r1 = r5.A07
            int r0 = r3.A01
            r2 = r1[r0]
            X.5X7 r2 = (X.AnonymousClass5X7) r2
            int[] r1 = r5.A05
            int r0 = r3.A00
            r5 = r1[r0]
            r9.FJL()
            int r0 = r4.A0H(r2)
            int r3 = X.AnonymousClass5X4.A00(r4, r0)
            int[] r1 = r4.A0I
            boolean r0 = X.AnonymousClass5X6.A03(r1, r3)
            if (r0 == 0) goto L_0x0121
            java.lang.Object[] r2 = r4.A0J
            int r1 = X.AnonymousClass5X4.A01(r4, r1, r3)
            int r0 = r4.A0B
            if (r1 < r0) goto L_0x0113
            int r0 = r4.A09
            int r1 = r1 + r0
        L_0x0113:
            r1 = r2[r1]
        L_0x0115:
            X.5Wl r9 = (X.C286465Wl) r9
            X.5R6 r1 = (X.AnonymousClass5R6) r1
            java.lang.Object r0 = r9.A00
            X.5R6 r0 = (X.AnonymousClass5R6) r0
            r0.A0V(r1, r5)
            return
        L_0x0121:
            r1 = 0
            goto L_0x0115
        L_0x0123:
            boolean r0 = r1 instanceof X.C287575aM
            if (r0 == 0) goto L_0x0159
            X.5bx r3 = (X.C288465bx) r3
            X.5Wu r5 = r3.A03
            java.lang.Object[] r1 = r5.A07
            int r0 = r3.A01
            r0 = r1[r0]
            X.0sa r0 = (X.C62320sa) r0
            java.lang.Object r2 = r0.invoke()
            java.lang.Object[] r1 = r5.A07
            int r0 = r3.A01
            int r0 = r0 + 1
            r1 = r1[r0]
            X.5X7 r1 = (X.AnonymousClass5X7) r1
            java.lang.String r0 = "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>"
            X.0qQ.A0C(r9, r0)
            int r0 = r4.A0H(r1)
            X.AnonymousClass5X4.A0D(r4, r2, r0)
            X.5Wl r9 = (X.C286465Wl) r9
            java.util.List r1 = r9.A02
            java.lang.Object r0 = r9.A00
            r1.add(r0)
            r9.A00 = r2
            return
        L_0x0159:
            boolean r0 = r1 instanceof X.C288525c3
            if (r0 == 0) goto L_0x0183
            java.lang.String r0 = "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>"
            X.0qQ.A0C(r9, r0)
            r6 = 0
            X.5bx r3 = (X.C288465bx) r3
            X.5Wu r0 = r3.A03
            java.lang.Object[] r1 = r0.A07
            int r0 = r3.A01
            r5 = r1[r0]
            java.lang.Object[] r5 = (java.lang.Object[]) r5
            int r4 = r5.length
        L_0x0170:
            if (r6 >= r4) goto L_0x0011
            r3 = r5[r6]
            r2 = r9
            X.5Wl r2 = (X.C286465Wl) r2
            java.util.List r1 = r2.A02
            java.lang.Object r0 = r2.A00
            r1.add(r0)
            r2.A00 = r3
            int r6 = r6 + 1
            goto L_0x0170
        L_0x0183:
            boolean r0 = r1 instanceof X.C288535c4
            if (r0 == 0) goto L_0x019a
            r2 = 0
            X.5bx r3 = (X.C288465bx) r3
            X.5Wu r0 = r3.A03
            int[] r1 = r0.A05
            int r0 = r3.A00
            r0 = r1[r0]
        L_0x0192:
            if (r2 >= r0) goto L_0x0011
            r9.FJL()
            int r2 = r2 + 1
            goto L_0x0192
        L_0x019a:
            boolean r0 = r1 instanceof X.C288545c5
            if (r0 == 0) goto L_0x01ac
            X.5bx r3 = (X.C288465bx) r3
            X.5Wu r0 = r3.A03
            java.lang.Object[] r1 = r0.A07
            int r0 = r3.A01
            r0 = r1[r0]
            r4.A0O(r0)
            return
        L_0x01ac:
            boolean r0 = r1 instanceof X.C288555c6
            if (r0 == 0) goto L_0x01b4
            r4.A0K()
            return
        L_0x01b4:
            boolean r0 = r1 instanceof X.C300525xL
            if (r0 == 0) goto L_0x01d7
            X.5bx r3 = (X.C288465bx) r3
            X.5Wu r0 = r3.A03
            java.lang.Object[] r2 = r0.A07
            int r1 = r3.A01
            int r0 = r1 + 1
            r6 = r2[r0]
            X.5Wq r6 = (X.C286505Wq) r6
            r3 = r2[r1]
            X.5X7 r3 = (X.AnonymousClass5X7) r3
        L_0x01ca:
            r4.A0J()
            boolean r0 = r6.A07
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x0275
            java.lang.String r0 = "Use active SlotWriter to determine anchor location instead"
            goto L_0x0463
        L_0x01d7:
            boolean r0 = r1 instanceof X.C288565c7
            if (r0 == 0) goto L_0x01eb
            X.5bx r3 = (X.C288465bx) r3
            X.5Wu r0 = r3.A03
            java.lang.Object[] r1 = r0.A07
            int r0 = r3.A01
            r2 = r1[r0]
            X.5bv r8 = (X.C288445bv) r8
            java.util.List r0 = r8.A06
            goto L_0x0024
        L_0x01eb:
            boolean r0 = r1 instanceof X.C288575c8
            if (r0 == 0) goto L_0x0223
            X.5bx r3 = (X.C288465bx) r3
            X.5Wu r0 = r3.A03
            java.lang.Object[] r1 = r0.A07
            int r0 = r3.A01
            r0 = r1[r0]
            X.5X7 r0 = (X.AnonymousClass5X7) r0
            int r7 = r4.A0H(r0)
        L_0x01ff:
            int r6 = r4.A06
            if (r6 > 0) goto L_0x0440
            int r2 = r4.A08
            if (r2 == r7) goto L_0x0011
            if (r7 < r2) goto L_0x0437
            int r0 = r4.A01
            if (r7 >= r0) goto L_0x0437
            int r5 = r4.A00
            int r3 = r4.A02
            int r2 = r4.A03
            r4.A00 = r7
            r1 = 0
            if (r6 != 0) goto L_0x0434
            java.lang.Object r0 = X.AnonymousClass5XT.A00
            X.AnonymousClass5X4.A0E(r4, r0, r0, r1, r1)
            r4.A00 = r5
            r4.A02 = r3
            goto L_0x00da
        L_0x0223:
            boolean r0 = r1 instanceof X.C288585c9
            if (r0 == 0) goto L_0x022b
            X.AnonymousClass5XN.A02(r8, r4)
            return
        L_0x022b:
            boolean r0 = r1 instanceof X.C288385bp
            if (r0 == 0) goto L_0x024e
            r7 = 1
            X.5bx r3 = (X.C288465bx) r3
            X.5Wu r0 = r3.A03
            java.lang.Object[] r2 = r0.A07
            int r1 = r3.A01
            int r0 = r1 + 1
            r6 = r2[r0]
            X.5Wq r6 = (X.C286505Wq) r6
            r5 = 0
            r3 = r2[r1]
            X.5X7 r3 = (X.AnonymousClass5X7) r3
            int r0 = r1 + 2
            r2 = r2[r0]
            X.5X8 r2 = (X.AnonymousClass5X8) r2
            X.5X4 r1 = r6.A01()
            goto L_0x0250
        L_0x024e:
            r7 = 0
            goto L_0x01ff
        L_0x0250:
            X.5Wu r0 = r2.A01     // Catch:{ all -> 0x0475 }
            int r0 = r0.A02     // Catch:{ all -> 0x0475 }
            if (r0 != 0) goto L_0x046b
            X.5Wu r0 = r2.A00     // Catch:{ all -> 0x0475 }
            r0.A01(r9, r8, r1)     // Catch:{ all -> 0x0475 }
            r1.A0P(r7)
            goto L_0x01ca
        L_0x0260:
            boolean r0 = r2 instanceof X.C286625Xd
            if (r0 == 0) goto L_0x0011
            X.5Xd r2 = (X.C286625Xd) r2
            r2.A00()
            return
        L_0x026a:
            java.lang.String r0 = "Cannot call seek() while inserting"
            X.C18086VlG.A01(r0)
            goto L_0x0466
        L_0x0271:
            java.lang.String r0 = "Cannot seek backwards"
            goto L_0x0463
        L_0x0275:
            int r3 = r3.A00
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r3 == r0) goto L_0x042e
            int r1 = r4.A06
            r22 = 1
            r7 = 0
            r0 = 0
            if (r1 <= 0) goto L_0x0284
            r0 = 1
        L_0x0284:
            X.AnonymousClass5XN.A06(r0)
            if (r3 != 0) goto L_0x02dc
            int r0 = r4.A00
            if (r0 != 0) goto L_0x02dc
            X.5Wq r0 = r4.A0L
            int r0 = r0.A00
            if (r0 != 0) goto L_0x02dc
            int[] r14 = r6.A08
            r0 = 3
            r0 = r14[r0]
            int r11 = r6.A00
            if (r0 != r11) goto L_0x02dc
            int[] r12 = r4.A0I
            java.lang.Object[] r10 = r4.A0J
            java.util.ArrayList r9 = r4.A0F
            java.util.HashMap r8 = r4.A0G
            X.0yC r5 = r4.A0C
            java.lang.Object[] r13 = r6.A09
            int r3 = r6.A02
            java.util.HashMap r2 = r6.A06
            X.0yC r1 = r6.A04
            r4.A0I = r14
            r4.A0J = r13
            java.util.ArrayList r0 = r6.A05
            r4.A0F = r0
            r4.A05 = r11
            int r0 = r14.length
            int r0 = r0 / 5
            int r0 = r0 - r11
            r4.A04 = r0
            r4.A0B = r3
            int r0 = r13.length
            int r0 = r0 - r3
            r4.A09 = r0
            r4.A0A = r11
            r4.A0G = r2
            r4.A0C = r1
            r6.A08 = r12
            r6.A00 = r7
            r6.A09 = r10
            r6.A02 = r7
            r6.A05 = r9
            r6.A06 = r8
            r6.A04 = r5
        L_0x02d8:
            r4.A0L()
            return
        L_0x02dc:
            X.5X4 r6 = r6.A01()
            int[] r9 = r6.A0I     // Catch:{ all -> 0x0429 }
            int r8 = X.AnonymousClass5X4.A00(r6, r3)     // Catch:{ all -> 0x0429 }
            int r1 = r8 * 5
            int r0 = r1 + 3
            r5 = r9[r0]     // Catch:{ all -> 0x0429 }
            int r2 = r3 + r5
            int r12 = X.AnonymousClass5X4.A01(r6, r9, r8)     // Catch:{ all -> 0x0429 }
            int r0 = X.AnonymousClass5X4.A00(r6, r2)     // Catch:{ all -> 0x0429 }
            int r8 = X.AnonymousClass5X4.A01(r6, r9, r0)     // Catch:{ all -> 0x0429 }
            int r21 = r8 - r12
            if (r3 < 0) goto L_0x0309
            int r0 = r1 + 1
            r1 = r9[r0]     // Catch:{ all -> 0x0429 }
            r0 = 201326592(0xc000000, float:9.8607613E-32)
            r1 = r1 & r0
            r20 = 1
            if (r1 != 0) goto L_0x030b
        L_0x0309:
            r20 = 0
        L_0x030b:
            X.AnonymousClass5X4.A05(r4, r5)     // Catch:{ all -> 0x0429 }
            int r1 = r4.A00     // Catch:{ all -> 0x0429 }
            r0 = r21
            X.AnonymousClass5X4.A09(r4, r0, r1)     // Catch:{ all -> 0x0429 }
            int r0 = r6.A05     // Catch:{ all -> 0x0429 }
            if (r0 >= r2) goto L_0x031c
            X.AnonymousClass5X4.A06(r6, r2)     // Catch:{ all -> 0x0429 }
        L_0x031c:
            int r0 = r6.A0B     // Catch:{ all -> 0x0429 }
            if (r0 >= r8) goto L_0x0323
            X.AnonymousClass5X4.A0A(r6, r8, r2)     // Catch:{ all -> 0x0429 }
        L_0x0323:
            int[] r10 = r4.A0I     // Catch:{ all -> 0x0429 }
            int r11 = r4.A00     // Catch:{ all -> 0x0429 }
            int[] r13 = r6.A0I     // Catch:{ all -> 0x0429 }
            int r9 = r11 * 5
            int r1 = r3 * 5
            int r0 = r2 * 5
            X.0Yw.A0T(r13, r10, r9, r1, r0)     // Catch:{ all -> 0x0429 }
            java.lang.Object[] r1 = r4.A0J     // Catch:{ all -> 0x0429 }
            int r9 = r4.A02     // Catch:{ all -> 0x0429 }
            java.lang.Object[] r0 = r6.A0J     // Catch:{ all -> 0x0429 }
            X.0Yw.A0V(r0, r1, r9, r12, r8)     // Catch:{ all -> 0x0429 }
            int r8 = r4.A08     // Catch:{ all -> 0x0429 }
            int r19 = r11 * 5
            int r0 = r19 + 2
            r10[r0] = r8     // Catch:{ all -> 0x0429 }
            int r18 = r11 - r3
            int r5 = r5 + r11
            int r0 = X.AnonymousClass5X4.A01(r4, r10, r11)     // Catch:{ all -> 0x0429 }
            int r17 = r9 - r0
            int r15 = r4.A0A     // Catch:{ all -> 0x0429 }
            int r14 = r4.A09     // Catch:{ all -> 0x0429 }
            int r13 = r1.length     // Catch:{ all -> 0x0429 }
            r12 = r11
        L_0x0352:
            r0 = 0
            if (r12 >= r5) goto L_0x0380
            if (r12 == r11) goto L_0x0361
            int r1 = r12 * 5
            int r16 = r1 + 2
            r1 = r10[r16]     // Catch:{ all -> 0x0429 }
            int r1 = r1 + r18
            r10[r16] = r1     // Catch:{ all -> 0x0429 }
        L_0x0361:
            int r1 = X.AnonymousClass5X4.A01(r4, r10, r12)     // Catch:{ all -> 0x0429 }
            int r1 = r1 + r17
            if (r15 < r12) goto L_0x036b
            int r0 = r4.A0B     // Catch:{ all -> 0x0429 }
        L_0x036b:
            if (r1 <= r0) goto L_0x0373
            int r0 = r13 - r14
            int r0 = r0 - r1
            int r0 = r0 + 1
            int r1 = -r0
        L_0x0373:
            int r0 = r12 * 5
            int r0 = r0 + 4
            r10[r0] = r1     // Catch:{ all -> 0x0429 }
            if (r12 != r15) goto L_0x037d
            int r15 = r15 + 1
        L_0x037d:
            int r12 = r12 + 1
            goto L_0x0352
        L_0x0380:
            r4.A0A = r15     // Catch:{ all -> 0x0429 }
            java.util.ArrayList r13 = r6.A0F     // Catch:{ all -> 0x0429 }
            int[] r0 = r6.A0I     // Catch:{ all -> 0x0429 }
            int r0 = r0.length     // Catch:{ all -> 0x0429 }
            int r1 = r0 / 5
            int r0 = r6.A04     // Catch:{ all -> 0x0429 }
            int r1 = r1 - r0
            int r3 = X.AnonymousClass5X6.A01(r13, r3, r1)     // Catch:{ all -> 0x0429 }
            if (r3 >= 0) goto L_0x0395
            int r0 = r3 + 1
            int r3 = -r0
        L_0x0395:
            int r2 = X.AnonymousClass5X6.A01(r13, r2, r1)     // Catch:{ all -> 0x0429 }
            if (r2 >= 0) goto L_0x039e
            int r0 = r2 + 1
            int r2 = -r0
        L_0x039e:
            if (r3 >= r2) goto L_0x03dc
            int r0 = r2 - r3
            java.util.ArrayList r12 = new java.util.ArrayList     // Catch:{ all -> 0x0429 }
            r12.<init>(r0)     // Catch:{ all -> 0x0429 }
            r14 = r3
        L_0x03a8:
            if (r14 >= r2) goto L_0x03bc
            java.lang.Object r1 = r13.get(r14)     // Catch:{ all -> 0x0429 }
            X.5X7 r1 = (X.AnonymousClass5X7) r1     // Catch:{ all -> 0x0429 }
            int r0 = r1.A00     // Catch:{ all -> 0x0429 }
            int r0 = r0 + r18
            r1.A00 = r0     // Catch:{ all -> 0x0429 }
            r12.add(r1)     // Catch:{ all -> 0x0429 }
            int r14 = r14 + 1
            goto L_0x03a8
        L_0x03bc:
            java.util.ArrayList r1 = r4.A0F     // Catch:{ all -> 0x0429 }
            int r15 = r4.A00     // Catch:{ all -> 0x0429 }
            int[] r0 = r4.A0I     // Catch:{ all -> 0x0429 }
            int r0 = r0.length     // Catch:{ all -> 0x0429 }
            int r14 = r0 / 5
            int r0 = r4.A04     // Catch:{ all -> 0x0429 }
            int r14 = r14 - r0
            int r0 = X.AnonymousClass5X6.A01(r1, r15, r14)     // Catch:{ all -> 0x0429 }
            if (r0 >= 0) goto L_0x03d1
            int r0 = r0 + 1
            int r0 = -r0
        L_0x03d1:
            r1.addAll(r0, r12)     // Catch:{ all -> 0x0429 }
            java.util.List r0 = r13.subList(r3, r2)     // Catch:{ all -> 0x0429 }
            r0.clear()     // Catch:{ all -> 0x0429 }
            goto L_0x03de
        L_0x03dc:
            X.0sn r12 = X.0sn.A00     // Catch:{ all -> 0x0429 }
        L_0x03de:
            boolean r0 = r12.isEmpty()     // Catch:{ all -> 0x0429 }
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x03ff
            java.util.HashMap r3 = r6.A0G     // Catch:{ all -> 0x0429 }
            java.util.HashMap r0 = r4.A0G     // Catch:{ all -> 0x0429 }
            if (r3 == 0) goto L_0x03ff
            if (r0 == 0) goto L_0x03ff
            int r2 = r12.size()     // Catch:{ all -> 0x0429 }
            r1 = 0
        L_0x03f3:
            if (r1 >= r2) goto L_0x03ff
            java.lang.Object r0 = r12.get(r1)     // Catch:{ all -> 0x0429 }
            r3.get(r0)     // Catch:{ all -> 0x0429 }
            int r1 = r1 + 1
            goto L_0x03f3
        L_0x03ff:
            X.AnonymousClass5X4.A07(r4, r8)     // Catch:{ all -> 0x0429 }
            int r2 = r4.A07     // Catch:{ all -> 0x0429 }
            boolean r0 = X.AnonymousClass5X6.A03(r10, r11)     // Catch:{ all -> 0x0429 }
            if (r0 == 0) goto L_0x040c
            r1 = 1
            goto L_0x0414
        L_0x040c:
            int r0 = r19 + 1
            r1 = r10[r0]     // Catch:{ all -> 0x0429 }
            r0 = 67108863(0x3ffffff, float:1.5046327E-36)
            r1 = r1 & r0
        L_0x0414:
            int r2 = r2 + r1
            r4.A07 = r2     // Catch:{ all -> 0x0429 }
            r4.A00 = r5     // Catch:{ all -> 0x0429 }
            int r9 = r9 + r21
            r4.A02 = r9     // Catch:{ all -> 0x0429 }
            if (r20 == 0) goto L_0x0422
            X.AnonymousClass5X4.A08(r4, r8)     // Catch:{ all -> 0x0429 }
        L_0x0422:
            r0 = r22
            r6.A0P(r0)
            goto L_0x02d8
        L_0x0429:
            r0 = move-exception
            r6.A0P(r7)
            throw r0
        L_0x042e:
            java.lang.String r0 = "Anchor refers to a group that was removed"
            X.C18086VlG.A00(r0)
            goto L_0x0466
        L_0x0434:
            java.lang.String r0 = "Key must be supplied when inserting"
            goto L_0x0463
        L_0x0437:
            java.lang.String r1 = "Started group at "
            java.lang.String r0 = " must be a subgroup of the group at "
            java.lang.String r0 = X.002.A02(r7, r2, r1, r0)
            goto L_0x0463
        L_0x0440:
            java.lang.String r0 = "Cannot call ensureStarted() while inserting"
            goto L_0x0463
        L_0x0443:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Cannot seek outside the current group ("
            r1.append(r0)
            r1.append(r2)
            r0 = 45
            r1.append(r0)
            int r0 = r4.A01
            r1.append(r0)
            r0 = 41
            r1.append(r0)
            java.lang.String r0 = r1.toString()
        L_0x0463:
            X.AnonymousClass5XN.A03(r0)
        L_0x0466:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x046b:
            java.lang.String r0 = "FixupList has pending fixup operations that were not realized. Were there mismatched insertNode() and endNodeInsert() calls?"
            X.AnonymousClass5XN.A03(r0)     // Catch:{ all -> 0x0475 }
            X.00P r0 = X.AnonymousClass00P.createAndThrow()     // Catch:{ all -> 0x0475 }
            throw r0     // Catch:{ all -> 0x0475 }
        L_0x0475:
            r0 = move-exception
            r1.A0P(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C286545Wv.A02(X.5Wm, X.5bw, X.5X4, X.5by):void");
    }

    public C286545Wv(int i, int i2) {
        this.A00 = i;
        this.A01 = i2;
    }

    public final String toString() {
        Class<?> cls = getClass();
        Map map = 0Yh.A03;
        0qQ.A0B(cls, 1);
        String A012 = 0q1.A01(cls);
        if (A012 == null) {
            return "";
        }
        return A012;
    }
}
