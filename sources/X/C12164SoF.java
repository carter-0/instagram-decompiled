package X;

import java.util.List;

/* renamed from: X.SoF  reason: case insensitive filesystem */
public final class C12164SoF implements C340147km {
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x004b, code lost:
        if (r1 == 270) goto L_0x004d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0103, code lost:
        if (r1 == null) goto L_0x0105;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C343137pj Ap9(X.C340177kp r17, X.C340177kp r18, java.util.List r19, java.util.List r20, java.util.List r21, java.util.List r22, int r23, int r24, int r25) {
        /*
            r16 = this;
            r6 = r23
            r14 = 0
            r7 = r19
            X.0qQ.A0B(r7, r14)
            r0 = r17
            r8 = r20
            r5 = r21
            X.C51974G9v.A1L(r8, r5, r0)
            r0 = 5
            r1 = r18
            java.util.ArrayList r13 = X.AnonymousClass7TF.A0q(r1, r0)
            java.util.HashSet r4 = X.C66580MXl.A12(r5)
            int r3 = r8.size()
            r2 = 0
        L_0x0021:
            if (r2 >= r3) goto L_0x0033
            java.lang.Object r1 = r8.get(r2)
            boolean r0 = r4.contains(r1)
            if (r0 == 0) goto L_0x0030
            r13.add(r1)
        L_0x0030:
            int r2 = r2 + 1
            goto L_0x0021
        L_0x0033:
            boolean r0 = r13.isEmpty()
            if (r0 == 0) goto L_0x003c
            r13.addAll(r5)
        L_0x003c:
            X.TLv r0 = X.C13112TLv.A00
            X.01V.A1D(r13, r0)
            r0 = 90
            r1 = r25
            if (r1 == r0) goto L_0x004d
            r0 = 270(0x10e, float:3.78E-43)
            r5 = r24
            if (r1 != r0) goto L_0x0050
        L_0x004d:
            r5 = r6
            r6 = r24
        L_0x0050:
            int r4 = r7.size()
            java.lang.Object r12 = r7.get(r14)
        L_0x0058:
            int r4 = r4 + -1
            if (r4 <= 0) goto L_0x0073
            java.lang.Object r3 = r7.get(r4)
            X.7pa r3 = (X.C343047pa) r3
            int r2 = r3.A02
            int r0 = r3.A01
            int r2 = r2 * r0
            r0 = r12
            X.7pa r0 = (X.C343047pa) r0
            int r1 = r0.A02
            int r0 = r0.A01
            int r1 = r1 * r0
            if (r2 <= r1) goto L_0x0058
            r12 = r3
            goto L_0x0058
        L_0x0073:
            float r11 = (float) r6
            float r0 = (float) r5
            float r11 = r11 / r0
            X.7pa r12 = (X.C343047pa) r12
            int r0 = r12.A02
            float r10 = (float) r0
            int r0 = r12.A01
            float r0 = (float) r0
            float r10 = r10 / r0
            int r4 = r13.size()
            java.util.ArrayList r9 = X.AnonymousClass7TE.A1C()
            r3 = 0
        L_0x0088:
            if (r3 >= r4) goto L_0x00b2
            java.lang.Object r2 = r13.get(r3)
            X.7pa r2 = (X.C343047pa) r2
            int r0 = r2.A02
            float r5 = (float) r0
            int r0 = r2.A01
            float r0 = (float) r0
            float r5 = r5 / r0
            r1 = 1080(0x438, float:1.513E-42)
            int r0 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r0 <= 0) goto L_0x00ab
            int r0 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r0 > 0) goto L_0x00a8
            int r0 = r2.A01
        L_0x00a3:
            if (r0 > r1) goto L_0x00a8
            r9.add(r2)
        L_0x00a8:
            int r3 = r3 + 1
            goto L_0x0088
        L_0x00ab:
            int r0 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r0 < 0) goto L_0x00a8
            int r0 = r2.A02
            goto L_0x00a3
        L_0x00b2:
            int r8 = r9.size()
            r7 = 0
            if (r8 == 0) goto L_0x0105
            java.lang.Object r1 = r9.get(r14)
            X.7pa r1 = (X.C343047pa) r1
            r6 = 1
        L_0x00c0:
            if (r6 >= r8) goto L_0x0103
            java.lang.Object r5 = r9.get(r6)
            X.0qQ.A07(r5)
            X.7pa r5 = (X.C343047pa) r5
            int r4 = r5.A02
            int r0 = r5.A01
            int r4 = r4 * r0
            if (r1 == 0) goto L_0x00fe
            int r3 = r1.A02
            int r0 = r1.A01
            int r3 = r3 * r0
            int r0 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r0 <= 0) goto L_0x00f1
            int r0 = r5.A01
            float r2 = (float) r0
            float r0 = r2 * r11
            float r2 = r2 * r0
            int r2 = (int) r2
            int r0 = r1.A01
            float r15 = (float) r0
            float r0 = r15 * r11
        L_0x00e7:
            float r15 = r15 * r0
            int r0 = (int) r15
            if (r2 < r0) goto L_0x00ee
            if (r4 > r3) goto L_0x00ee
            r1 = r5
        L_0x00ee:
            int r6 = r6 + 1
            goto L_0x00c0
        L_0x00f1:
            int r0 = r5.A02
            float r2 = (float) r0
            float r0 = r2 / r11
            float r2 = r2 * r0
            int r2 = (int) r2
            int r0 = r1.A02
            float r15 = (float) r0
            float r0 = r15 / r11
            goto L_0x00e7
        L_0x00fe:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0103:
            if (r1 != 0) goto L_0x010b
        L_0x0105:
            java.lang.Object r1 = r13.get(r14)
            X.7pa r1 = (X.C343047pa) r1
        L_0x010b:
            X.7pj r0 = new X.7pj
            r0.<init>(r1, r12, r1, r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12164SoF.Ap9(X.7kp, X.7kp, java.util.List, java.util.List, java.util.List, java.util.List, int, int, int):X.7pj");
    }

    public final C343137pj Bc4(C340177kp r2, List list, List list2, int i, int i2, int i3) {
        throw AnonymousClass7TE.A1B("method should never be called in feed camera");
    }

    public final C343137pj Bf6(List list, int i, int i2, int i3) {
        throw AnonymousClass7TE.A1B("method should never be called in feed camera");
    }

    public final C343137pj CEC(C340177kp r2, List list, List list2, int i, int i2, int i3) {
        throw AnonymousClass7TE.A1B("method should never be called in feed camera");
    }
}
