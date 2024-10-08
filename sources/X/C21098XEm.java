package X;

/* renamed from: X.XEm  reason: case insensitive filesystem */
public final class C21098XEm {
    public int A00;
    public Object[] A01;
    public final Object[] A02;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(java.lang.Object r4) {
        /*
            r3 = this;
            r2 = 4
            int r1 = r3.A00
            if (r1 != r2) goto L_0x000f
            r0 = 5
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.Object[] r0 = r3.A01
            r0[r2] = r1
            r3.A01 = r1
            r1 = 0
        L_0x000f:
            java.lang.Object[] r0 = r3.A01
            r0[r1] = r4
            int r0 = r1 + 1
            r3.A00 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21098XEm.A01(java.lang.Object):void");
    }

    public final void A00(1aN r5) {
        for (Object[] objArr = this.A02; objArr != null; objArr = objArr[4]) {
            int i = 0;
            do {
                Object[] objArr2 = objArr[i];
                if (objArr2 == null) {
                    break;
                } else if (!r5.test(objArr2)) {
                    i++;
                } else {
                    return;
                }
            } while (i < 4);
        }
    }

    public C21098XEm() {
        Object[] objArr = new Object[5];
        this.A02 = objArr;
        this.A01 = objArr;
    }
}
