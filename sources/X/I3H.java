package X;

public abstract class I3H {
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0036, code lost:
        if (X.00k.A01(((X.C57539IcR) r1).A00) == 1) goto L_0x0038;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A02(X.C336547en r13, X.C54715HPu r14, X.0sP r15) {
        /*
            r5 = 1
            X.2V1 r0 = r13.A00
            X.IIT r3 = new X.IIT
            r3.<init>(r0)
            r15.invoke(r3)
            java.util.List r4 = r3.A02
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L_0x0052
            boolean r0 = r4.isEmpty()
            r2 = 0
            if (r0 != 0) goto L_0x0069
            int r0 = r4.size()
            if (r0 > r5) goto L_0x0069
            java.lang.Object r1 = r4.get(r2)
            X.JMO r1 = (X.JMO) r1
            boolean r0 = r1 instanceof X.C57538IcQ
            if (r0 != 0) goto L_0x0038
            boolean r0 = r1 instanceof X.C57539IcR
            if (r0 == 0) goto L_0x014a
            X.IcR r1 = (X.C57539IcR) r1
            java.lang.Iterable r0 = r1.A00
            int r0 = X.00k.A01(r0)
            if (r0 != r5) goto L_0x0069
        L_0x0038:
            java.lang.Object r4 = r4.get(r2)
            X.JMO r4 = (X.JMO) r4
            boolean r0 = r4 instanceof X.C57538IcQ
            if (r0 == 0) goto L_0x0053
            X.IcQ r4 = (X.C57538IcQ) r4
            X.3mp r1 = r4.A00
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            X.2Tp r2 = A00(r1, r3, r14, r0)
            r1 = 0
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r13.A00(r2, r1, r0, r0)
        L_0x0052:
            return
        L_0x0053:
            boolean r0 = r4 instanceof X.C57539IcR
            if (r0 == 0) goto L_0x0052
            r0 = r4
            X.IcR r0 = (X.C57539IcR) r0
            java.lang.Iterable r3 = r0.A00
            X.0sP r2 = r0.A01
            r1 = 11
            X.JG0 r0 = new X.JG0
            r0.<init>(r1, r14, r4)
            r13.A01(r3, r2, r0)
            return
        L_0x0069:
            int r12 = r4.size()
            java.util.Iterator r11 = r4.iterator()
            r1 = 0
        L_0x0072:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x0052
            java.lang.Object r6 = r11.next()
            int r10 = r1 + 1
            if (r1 >= 0) goto L_0x0088
            X.0sr.A1T()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0088:
            X.JMO r6 = (X.JMO) r6
            boolean r2 = X.AnonymousClass7TF.A1Q(r1)
            int r0 = r12 + -1
            boolean r1 = X.AnonymousClass7TF.A1S(r1, r0)
            if (r2 == 0) goto L_0x00ac
            boolean r0 = r6 instanceof X.C57538IcQ
            if (r0 == 0) goto L_0x00ac
            X.IcQ r6 = (X.C57538IcQ) r6
            X.3mp r1 = r6.A00
            java.lang.Integer r0 = X.AnonymousClass05K.A00
        L_0x00a0:
            X.2Tp r6 = A00(r1, r3, r14, r0)
            r0 = 0
        L_0x00a5:
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            r13.A00(r6, r0, r1, r1)
        L_0x00aa:
            r1 = r10
            goto L_0x0072
        L_0x00ac:
            if (r1 == 0) goto L_0x00b9
            boolean r0 = r6 instanceof X.C57538IcQ
            if (r0 == 0) goto L_0x00b9
            X.IcQ r6 = (X.C57538IcQ) r6
            X.3mp r1 = r6.A00
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            goto L_0x00a0
        L_0x00b9:
            if (r2 != 0) goto L_0x00bd
            if (r1 == 0) goto L_0x0122
        L_0x00bd:
            boolean r0 = r6 instanceof X.C57539IcR
            if (r0 == 0) goto L_0x0122
            r8 = r6
            X.IcR r8 = (X.C57539IcR) r8
            java.lang.Iterable r7 = r8.A00
            r4 = 0
            if (r2 == 0) goto L_0x0120
            java.lang.Object r9 = X.00k.A09(r7)
            java.util.List r7 = X.00k.A0c(r7, r5)
        L_0x00d1:
            if (r1 == 0) goto L_0x00e0
            java.lang.Object r4 = X.00k.A0B(r7)
            int r0 = X.00k.A01(r7)
            int r0 = r0 - r5
            java.util.List r7 = X.00k.A0d(r7, r0)
        L_0x00e0:
            if (r9 == 0) goto L_0x00fd
            X.0sL r1 = r8.A02
            X.7et r0 = r3.A01
            java.lang.Object r1 = r1.invoke(r0, r9)
            X.3mp r1 = (X.C251263mp) r1
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            X.2Tp r2 = A00(r1, r3, r14, r0)
            X.0sP r0 = r8.A01
            java.lang.Object r1 = r0.invoke(r9)
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r13.A00(r2, r1, r0, r0)
        L_0x00fd:
            X.0sP r2 = r8.A01
            r1 = 9
            X.JG0 r0 = new X.JG0
            r0.<init>(r1, r14, r6)
            r13.A01(r7, r2, r0)
            if (r4 == 0) goto L_0x00aa
            X.0sL r1 = r8.A02
            X.7et r0 = r3.A01
            java.lang.Object r1 = r1.invoke(r0, r4)
            X.3mp r1 = (X.C251263mp) r1
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            X.2Tp r6 = A00(r1, r3, r14, r0)
            java.lang.Object r0 = r2.invoke(r4)
            goto L_0x00a5
        L_0x0120:
            r9 = r4
            goto L_0x00d1
        L_0x0122:
            boolean r0 = r6 instanceof X.C57538IcQ
            if (r0 == 0) goto L_0x012e
            X.IcQ r6 = (X.C57538IcQ) r6
            X.3mp r1 = r6.A00
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            goto L_0x00a0
        L_0x012e:
            boolean r0 = r6 instanceof X.C57539IcR
            if (r0 == 0) goto L_0x00aa
            java.lang.String r0 = "null cannot be cast to non-null type com.meta.foa.cds.widgets.section.CdsSectionScope.SectionCall.Children<kotlin.Any?>"
            X.0qQ.A0C(r6, r0)
            r0 = r6
            X.IcR r0 = (X.C57539IcR) r0
            java.lang.Iterable r4 = r0.A00
            X.0sP r2 = r0.A01
            r1 = 10
            X.JG0 r0 = new X.JG0
            r0.<init>(r1, r14, r6)
            r13.A01(r4, r2, r0)
            goto L_0x00aa
        L_0x014a:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.I3H.A02(X.7en, X.HPu, X.0sP):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x007a, code lost:
        if (r6 == X.AnonymousClass05K.A0N) goto L_0x007c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0010, code lost:
        if (r6 == X.AnonymousClass05K.A0N) goto L_0x0012;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.2Tp A00(X.C251263mp r16, X.C70832Wc r17, X.C54715HPu r18, java.lang.Integer r19) {
        /*
            r4 = r18
            boolean r0 = r4 instanceof X.HHK
            r5 = 0
            r6 = r19
            if (r0 == 0) goto L_0x006f
            java.lang.Integer r1 = X.AnonymousClass05K.A00
            if (r6 == r1) goto L_0x0012
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            r3 = 0
            if (r6 != r0) goto L_0x0013
        L_0x0012:
            r3 = 1
        L_0x0013:
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r6 == r0) goto L_0x001b
            java.lang.Integer r2 = X.AnonymousClass05K.A0N
            if (r6 != r2) goto L_0x001c
        L_0x001b:
            r5 = 1
        L_0x001c:
            X.HHK r4 = (X.HHK) r4
            float r8 = r4.A00
            float r9 = r4.A01
            int r12 = r4.A03
            int r13 = r4.A02
            r10 = 0
            if (r3 != 0) goto L_0x0062
            r14 = 0
            if (r5 == 0) goto L_0x0067
            r15 = 1
        L_0x002d:
            X.Gaz r7 = new X.Gaz
            r11 = r10
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15)
        L_0x0033:
            X.3XV r2 = X.2WX.A02
            long r3 = X.C51970G9q.A0H()
            java.lang.Integer r6 = X.AnonymousClass05K.A04
            r5 = 0
            r2 = 0
            X.2WX r4 = X.AnonymousClass9JR.A00(r5, r6, r2, r3)
            r6 = r17
            X.2Wb r3 = X.C51973G9u.A0M(r6)
            r2 = 1065353216(0x3f800000, float:1.0)
            X.2WX r0 = X.G9t.A0x(r5, r0, r2)
            X.2WX r1 = X.G9t.A10(r0, r1, r7)
            X.2V1 r0 = r3.A00
            r2 = r16
            X.2Wb r0 = X.G9t.A0v(r2, r0)
            X.2Tp r0 = X.C243563Zg.A0B(r0, r3, r1)
            X.2Tp r0 = X.C51967G9n.A0Q(r0, r3, r6, r4)
            return r0
        L_0x0062:
            r14 = 1
            if (r5 != 0) goto L_0x0067
            r15 = 0
            goto L_0x002d
        L_0x0067:
            X.Gaz r7 = new X.Gaz
            r11 = r10
            r15 = r14
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15)
            goto L_0x0033
        L_0x006f:
            boolean r0 = r4 instanceof X.HHJ
            if (r0 == 0) goto L_0x00a6
            java.lang.Integer r1 = X.AnonymousClass05K.A00
            if (r6 == r1) goto L_0x007c
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            r3 = 0
            if (r6 != r0) goto L_0x007d
        L_0x007c:
            r3 = 1
        L_0x007d:
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r6 == r0) goto L_0x0085
            java.lang.Integer r2 = X.AnonymousClass05K.A0N
            if (r6 != r2) goto L_0x0086
        L_0x0085:
            r5 = 1
        L_0x0086:
            X.HHJ r4 = (X.HHJ) r4
            float r8 = r4.A01
            int r10 = r4.A02
            float r9 = r4.A00
            if (r3 != 0) goto L_0x009a
            r11 = 0
            if (r5 == 0) goto L_0x009f
            r12 = 1
        L_0x0094:
            X.Gcm r7 = new X.Gcm
            r7.<init>(r8, r9, r10, r11, r12)
            goto L_0x0033
        L_0x009a:
            r11 = 1
            if (r5 != 0) goto L_0x009f
            r12 = 0
            goto L_0x0094
        L_0x009f:
            X.Gcm r7 = new X.Gcm
            r12 = r11
            r7.<init>(r8, r9, r10, r11, r12)
            goto L_0x0033
        L_0x00a6:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.I3H.A00(X.3mp, X.2Wc, X.HPu, java.lang.Integer):X.2Tp");
    }

    public static final C54715HPu A01(AnonymousClass3Y5 r2, C54615HKy hKy) {
        return ((C56061HsA) AnonymousClass3Zw.A00(r2, C58687Ivw.A00(hKy, r2, 23), new Object[]{hKy})).A00;
    }
}
