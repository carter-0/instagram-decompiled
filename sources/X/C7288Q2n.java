package X;

/* renamed from: X.Q2n  reason: case insensitive filesystem */
public abstract class C7288Q2n {
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001d, code lost:
        if (X.C276544tV.A00(r13, 153) != null) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C276544tV A01(X.C276634te r16, X.C13751TgN r17, X.C276544tV r18) {
        /*
            r3 = r17
            r15 = r18
            r0 = r16
            X.4tV r13 = r3.ABu(r0, r15)
            r0 = 0
            X.0qQ.A0B(r13, r0)
            r0 = 135(0x87, float:1.89E-43)
            java.lang.Object r0 = X.C276544tV.A00(r13, r0)
            if (r0 != 0) goto L_0x001f
            r0 = 153(0x99, float:2.14E-43)
            java.lang.Object r0 = X.C276544tV.A00(r13, r0)
            r12 = 0
            if (r0 == 0) goto L_0x0020
        L_0x001f:
            r12 = 1
        L_0x0020:
            X.C64361Kj.A00()
            int r1 = r13.A04
            boolean r11 = X.C250563lf.A0m(r1)
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            X.C64361Kj.A00()
            if (r11 == 0) goto L_0x003c
            int r0 = r13.A03
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.add(r0)
        L_0x003c:
            X.1Kj r0 = X.C64361Kj.A00()
            X.1KX r0 = r0.A03()
            int[] r6 = r0.A01(r1)
            r5 = 0
        L_0x0049:
            int r0 = r6.length
            if (r5 >= r0) goto L_0x0098
            r0 = r6[r5]
            X.4tV r1 = r13.A07(r0)
            if (r1 == 0) goto L_0x0095
            X.4te r0 = r13.A01
            X.4tV r7 = A01(r0, r3, r1)
            if (r7 == r1) goto L_0x0074
            if (r13 != r15) goto L_0x006f
            r16 = 0
            int r1 = r15.A03
            java.util.List r0 = r15.A09
            X.4te r14 = r15.A01
            X.4tV r13 = new X.4tV
            r17 = r0
            r18 = r1
            r13.<init>(r14, r15, r16, r17, r18)
        L_0x006f:
            r0 = r6[r5]
            r13.A0P(r0, r7)
        L_0x0074:
            int r4 = r7.A00
            r1 = 1
            r0 = r4 & 1
            if (r0 != 0) goto L_0x007c
            r1 = 0
        L_0x007c:
            r12 = r12 | r1
            r1 = r4 & 2
            r0 = 0
            if (r1 == 0) goto L_0x0083
            r0 = 1
        L_0x0083:
            r11 = r11 | r0
            java.util.Set r1 = r7.A02
            if (r1 != 0) goto L_0x008c
            java.util.Set r1 = java.util.Collections.emptySet()
        L_0x008c:
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0095
            r2.addAll(r1)
        L_0x0095:
            int r5 = r5 + 1
            goto L_0x0049
        L_0x0098:
            X.1Kj r0 = X.C64361Kj.A00()
            X.1KX r1 = r0.A03()
            int r0 = r13.A04
            int[] r6 = r1.A00(r0)
            r5 = 0
        L_0x00a7:
            int r0 = r6.length
            if (r5 >= r0) goto L_0x0113
            r0 = r6[r5]
            java.util.List r9 = r13.A0M(r0)
            r4 = r9
            r8 = 0
        L_0x00b2:
            int r0 = r9.size()
            if (r8 >= r0) goto L_0x00f6
            java.lang.Object r1 = r9.get(r8)
            X.4tV r1 = (X.C276544tV) r1
            if (r1 == 0) goto L_0x00f3
            X.4te r0 = r13.A01
            X.4tV r10 = A01(r0, r3, r1)
            if (r10 == r1) goto L_0x00d2
            if (r4 != r9) goto L_0x00cf
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r9)
        L_0x00cf:
            r4.set(r8, r10)
        L_0x00d2:
            int r7 = r10.A00
            r1 = 1
            r0 = r7 & 1
            if (r0 != 0) goto L_0x00da
            r1 = 0
        L_0x00da:
            r12 = r12 | r1
            r1 = r7 & 2
            r0 = 0
            if (r1 == 0) goto L_0x00e1
            r0 = 1
        L_0x00e1:
            r11 = r11 | r0
            java.util.Set r1 = r10.A02
            if (r1 != 0) goto L_0x00ea
            java.util.Set r1 = java.util.Collections.emptySet()
        L_0x00ea:
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x00f3
            r2.addAll(r1)
        L_0x00f3:
            int r8 = r8 + 1
            goto L_0x00b2
        L_0x00f6:
            if (r4 == r9) goto L_0x0110
            if (r13 != r15) goto L_0x010b
            r16 = 0
            int r1 = r15.A03
            java.util.List r0 = r15.A09
            X.4te r14 = r15.A01
            X.4tV r13 = new X.4tV
            r17 = r0
            r18 = r1
            r13.<init>(r14, r15, r16, r17, r18)
        L_0x010b:
            r0 = r6[r5]
            r13.A0P(r0, r4)
        L_0x0110:
            int r5 = r5 + 1
            goto L_0x00a7
        L_0x0113:
            if (r13 == r15) goto L_0x0130
            int r0 = r13.A00
            r1 = r0 & -2
            if (r12 == 0) goto L_0x011d
            r1 = r0 | 1
        L_0x011d:
            r13.A00 = r1
            r0 = r1 & -3
            if (r11 == 0) goto L_0x0125
            r0 = r1 | 2
        L_0x0125:
            r13.A00 = r0
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x012e
            r2 = 0
        L_0x012e:
            r13.A02 = r2
        L_0x0130:
            r3.Dve(r13)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7288Q2n.A01(X.4te, X.TgN, X.4tV):X.4tV");
    }

    public static C276544tV A00(C276634te r4, C13751TgN tgN, C276544tV r6) {
        C276694tk A00 = C276674ti.A00();
        if (A00 != null) {
            return (C276544tV) C276674ti.A01(C276704tl.UNBOUND, A00, new TPG(0, r4, tgN, r6));
        }
        return A01(r4, tgN, r6);
    }
}
