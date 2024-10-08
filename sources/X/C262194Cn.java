package X;

import java.io.Serializable;

/* renamed from: X.4Cn  reason: invalid class name and case insensitive filesystem */
public final class C262194Cn implements C262094Cc, Serializable {
    public final C262084Cb A00;
    public final C262094Cc A01;

    public C262194Cn(C262084Cb r2, C262094Cc r3) {
        0qQ.A0B(r3, 1);
        this.A01 = r3;
        this.A00 = r2;
    }

    public final Object fold(Object obj, 0sL r4) {
        0qQ.A0B(r4, 1);
        return r4.invoke(this.A01.fold(obj, r4), this.A00);
    }

    public final C262084Cb get(C634312c r3) {
        0qQ.A0B(r3, 0);
        C262194Cn r1 = this;
        while (true) {
            C262084Cb r0 = r1.A00.get(r3);
            if (r0 != null) {
                return r0;
            }
            C262094Cc r12 = r1.A01;
            if (!(r12 instanceof C262194Cn)) {
                return r12.get(r3);
            }
            r1 = (C262194Cn) r12;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: X.4Cb} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: X.4Cn} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: X.4Cn} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: X.4Cn} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: X.4Cn} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C262094Cc minusKey(X.C634312c r4) {
        /*
            r3 = this;
            r0 = 0
            X.0qQ.A0B(r4, r0)
            X.4Cb r1 = r3.A00
            X.4Cb r0 = r1.get(r4)
            if (r0 == 0) goto L_0x000f
            X.4Cc r1 = r3.A01
            return r1
        L_0x000f:
            X.4Cc r0 = r3.A01
            X.4Cc r2 = r0.minusKey(r4)
            if (r2 != r0) goto L_0x001b
            r1 = r3
        L_0x0018:
            X.4Cc r1 = (X.C262094Cc) r1
            return r1
        L_0x001b:
            X.19B r0 = X.19B.A00
            if (r2 == r0) goto L_0x0018
            X.4Cn r0 = new X.4Cn
            r0.<init>(r1, r2)
            r1 = r0
            goto L_0x0018
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C262194Cn.minusKey(X.12c):X.4Cc");
    }

    public final C262094Cc plus(C262094Cc r3) {
        0qQ.A0B(r3, 1);
        if (r3 != 19B.A00) {
            return (C262094Cc) r3.fold(this, 19D.A00);
        }
        return this;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0028  */
    /* JADX WARNING: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            if (r4 == r5) goto L_0x0057
            boolean r0 = r5 instanceof X.C262194Cn
            if (r0 == 0) goto L_0x0059
            X.4Cn r5 = (X.C262194Cn) r5
            r3 = 2
            r1 = r5
        L_0x000a:
            X.4Cc r1 = r1.A01
            boolean r0 = r1 instanceof X.C262194Cn
            if (r0 == 0) goto L_0x0017
            X.4Cn r1 = (X.C262194Cn) r1
            if (r1 == 0) goto L_0x0017
            int r3 = r3 + 1
            goto L_0x000a
        L_0x0017:
            r2 = 2
            r1 = r4
        L_0x0019:
            X.4Cc r1 = r1.A01
            boolean r0 = r1 instanceof X.C262194Cn
            if (r0 == 0) goto L_0x0026
            X.4Cn r1 = (X.C262194Cn) r1
            if (r1 == 0) goto L_0x0026
            int r2 = r2 + 1
            goto L_0x0019
        L_0x0026:
            if (r3 != r2) goto L_0x0059
            r1 = r4
        L_0x0029:
            X.4Cb r2 = r1.A00
            X.12c r0 = r2.getKey()
            X.4Cb r0 = r5.get(r0)
            boolean r0 = X.0qQ.A0K(r0, r2)
            if (r0 == 0) goto L_0x0059
            X.4Cc r1 = r1.A01
            boolean r0 = r1 instanceof X.C262194Cn
            if (r0 == 0) goto L_0x0042
            X.4Cn r1 = (X.C262194Cn) r1
            goto L_0x0029
        L_0x0042:
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element"
            X.0qQ.A0C(r1, r0)
            X.4Cb r1 = (X.C262084Cb) r1
            X.12c r0 = r1.getKey()
            X.4Cb r0 = r5.get(r0)
            boolean r0 = X.0qQ.A0K(r0, r1)
            if (r0 == 0) goto L_0x0059
        L_0x0057:
            r0 = 1
            return r0
        L_0x0059:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C262194Cn.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return this.A01.hashCode() + this.A00.hashCode();
    }

    public final String toString() {
        return 002.A0E((String) fold("", C20793Wz5.A00), '[', ']');
    }
}
