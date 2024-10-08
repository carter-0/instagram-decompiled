package X;

/* renamed from: X.3AO  reason: invalid class name */
public final class AnonymousClass3AO {
    public final 01c A00 = new 01c();
    public final 01r A01 = new 01r(0);

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: X.3MZ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: X.3MZ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: X.3MZ} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(X.C241463Ph r4, X.C249703kE r5) {
        /*
            r3 = this;
            X.01r r2 = r3.A01
            java.lang.Object r1 = r2.get(r5)
            X.3MZ r1 = (X.AnonymousClass3MZ) r1
            if (r1 != 0) goto L_0x001c
            X.02U r0 = X.AnonymousClass3MZ.A03
            java.lang.Object r1 = r0.A7A()
            X.3MZ r1 = (X.AnonymousClass3MZ) r1
            if (r1 != 0) goto L_0x0019
            X.3MZ r1 = new X.3MZ
            r1.<init>()
        L_0x0019:
            r2.put(r5, r1)
        L_0x001c:
            r1.A01 = r4
            int r0 = r1.A00
            r0 = r0 | 8
            r1.A00 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3AO.A00(X.3Ph, X.3kE):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: X.3MZ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: X.3MZ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: X.3MZ} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(X.C241463Ph r4, X.C249703kE r5) {
        /*
            r3 = this;
            X.01r r2 = r3.A01
            java.lang.Object r1 = r2.get(r5)
            X.3MZ r1 = (X.AnonymousClass3MZ) r1
            if (r1 != 0) goto L_0x001c
            X.02U r0 = X.AnonymousClass3MZ.A03
            java.lang.Object r1 = r0.A7A()
            X.3MZ r1 = (X.AnonymousClass3MZ) r1
            if (r1 != 0) goto L_0x0019
            X.3MZ r1 = new X.3MZ
            r1.<init>()
        L_0x0019:
            r2.put(r5, r1)
        L_0x001c:
            r1.A02 = r4
            int r0 = r1.A00
            r0 = r0 | 4
            r1.A00 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3AO.A01(X.3Ph, X.3kE):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: X.3MZ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: X.3MZ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: X.3MZ} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02(X.C249703kE r4) {
        /*
            r3 = this;
            X.01r r2 = r3.A01
            java.lang.Object r1 = r2.get(r4)
            X.3MZ r1 = (X.AnonymousClass3MZ) r1
            if (r1 != 0) goto L_0x001c
            X.02U r0 = X.AnonymousClass3MZ.A03
            java.lang.Object r1 = r0.A7A()
            X.3MZ r1 = (X.AnonymousClass3MZ) r1
            if (r1 != 0) goto L_0x0019
            X.3MZ r1 = new X.3MZ
            r1.<init>()
        L_0x0019:
            r2.put(r4, r1)
        L_0x001c:
            int r0 = r1.A00
            r0 = r0 | 1
            r1.A00 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3AO.A02(X.3kE):void");
    }

    public final void A03(C249703kE r3) {
        AnonymousClass3MZ r1 = (AnonymousClass3MZ) this.A01.get(r3);
        if (r1 != null) {
            r1.A00 &= -2;
        }
    }

    public final void A04(C249703kE r6) {
        01c r4 = this.A00;
        int A002 = r4.A00();
        while (true) {
            A002--;
            if (A002 < 0) {
                break;
            } else if (r6 == r4.A04(A002)) {
                Object[] objArr = r4.A03;
                Object obj = objArr[A002];
                Object obj2 = AnonymousClass01d.A00;
                if (obj != obj2) {
                    objArr[A002] = obj2;
                    r4.A01 = true;
                }
            }
        }
        AnonymousClass3MZ r1 = (AnonymousClass3MZ) this.A01.remove(r6);
        if (r1 != null) {
            r1.A00 = 0;
            r1.A02 = null;
            r1.A01 = null;
            AnonymousClass3MZ.A03.ECR(r1);
        }
    }
}
