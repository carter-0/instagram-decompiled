package X;

public final class SFB {
    public S21 A00;
    public S21 A01;
    public final String A02;
    public final String A03;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: com.fbpay.w3c.W3CCardDetail} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: com.fbpay.w3c.W3CCardDetail} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v14, resolved type: com.fbpay.w3c.W3CCardDetail} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: com.fbpay.w3c.W3CCardDetail} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.S21 A00(X.SFB r15) {
        /*
            X.S21 r2 = r15.A00
            if (r2 == 0) goto L_0x000d
            java.lang.Throwable r1 = r2.A02
            if (r1 == 0) goto L_0x000d
        L_0x0008:
            X.S21 r0 = X.C11097S9y.A01(r1)
            return r0
        L_0x000d:
            X.S21 r0 = r15.A01
            if (r0 == 0) goto L_0x0016
            java.lang.Throwable r1 = r0.A02
            if (r1 == 0) goto L_0x0016
            goto L_0x0008
        L_0x0016:
            r3 = 0
            if (r2 == 0) goto L_0x009b
            if (r0 == 0) goto L_0x009b
            java.lang.Object r0 = r2.A01
            X.0qQ.A0A(r0)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r4 = r0.iterator()
        L_0x0026:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0040
            java.lang.Object r2 = r4.next()
            r0 = r2
            com.fbpay.w3c.W3CCardDetail r0 = (com.fbpay.w3c.W3CCardDetail) r0
            com.fbpay.w3c.CardDetails r0 = r0.A00
            java.lang.String r1 = r0.A08
            java.lang.String r0 = r15.A02
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0026
            r3 = r2
        L_0x0040:
            com.fbpay.w3c.W3CCardDetail r3 = (com.fbpay.w3c.W3CCardDetail) r3
            if (r3 == 0) goto L_0x0088
            X.S21 r0 = r15.A01
            X.0qQ.A0A(r0)
            java.lang.Object r12 = r0.A01
            X.0qQ.A0A(r12)
            java.lang.String r12 = (java.lang.String) r12
            java.lang.String r14 = r15.A03
            r0 = 1
            X.0qQ.A0B(r12, r0)
            r6 = 0
            com.fbpay.w3c.CardDetails r0 = r3.A00
            com.fbpay.w3c.Address r5 = r0.A00
            java.lang.Integer r9 = r0.A04
            java.lang.Integer r8 = r0.A03
            java.lang.String r10 = r0.A05
            java.lang.String r11 = r0.A06
            java.lang.String r13 = r0.A08
            com.fbpay.w3c.CardDetails r4 = new com.fbpay.w3c.CardDetails
            r7 = r6
            r15 = r6
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            boolean r2 = r3.A05
            java.lang.String r10 = r3.A02
            java.lang.String r0 = "latestBoundDevice"
            X.C11367SPk.A03(r10, r0)
            java.lang.String r1 = r3.A04
            java.lang.String r0 = r3.A03
            com.fbpay.w3c.W3CCardDetail r7 = new com.fbpay.w3c.W3CCardDetail
            r8 = r4
            r9 = r6
            r11 = r0
            r12 = r1
            r13 = r2
            r7.<init>(r8, r9, r10, r11, r12, r13)
            X.S21 r0 = X.C11097S9y.A00(r7)
            return r0
        L_0x0088:
            java.lang.String r2 = "Card id "
            java.lang.String r1 = r15.A02
            java.lang.String r0 = " is not found."
            java.lang.String r0 = X.002.A0g(r2, r1, r0)
            java.lang.RuntimeException r0 = X.AnonymousClass7TE.A15(r0)
            X.S21 r0 = X.C11097S9y.A01(r0)
            return r0
        L_0x009b:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SFB.A00(X.SFB):X.S21");
    }

    public SFB(String str, String str2) {
        this.A02 = str;
        this.A03 = str2;
    }
}
