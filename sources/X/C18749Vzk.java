package X;

/* renamed from: X.Vzk  reason: case insensitive filesystem */
public final class C18749Vzk {
    public static final ThreadLocal A03 = new ThreadLocal();
    public final int A00;
    public final C18470VsM A01;
    public volatile int A02 = 0;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: X.UEx} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: X.UEx} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: X.UEx} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C14914UEx A00(X.C18749Vzk r5) {
        /*
            java.lang.ThreadLocal r0 = A03
            java.lang.Object r4 = r0.get()
            X.UEx r4 = (X.C14914UEx) r4
            if (r4 != 0) goto L_0x0012
            X.UEx r4 = new X.UEx
            r4.<init>()
            r0.set(r4)
        L_0x0012:
            X.VsM r0 = r5.A01
            X.UEy r3 = r0.A02
            int r2 = r5.A00
            r0 = 6
            int r1 = r3.A00(r0)
            if (r1 == 0) goto L_0x003b
            int r0 = r3.A00
            int r1 = r1 + r0
            java.nio.ByteBuffer r0 = r3.A01
            int r0 = r0.getInt(r1)
            int r1 = r1 + r0
            int r1 = r1 + 4
            int r0 = r2 * 4
            int r1 = r1 + r0
            java.nio.ByteBuffer r0 = r3.A01
            int r0 = r0.getInt(r1)
            int r1 = r1 + r0
            java.nio.ByteBuffer r0 = r3.A01
            r4.A00 = r1
            r4.A01 = r0
        L_0x003b:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18749Vzk.A00(X.Vzk):X.UEx");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        sb.append(Integer.toHexString(C13992Tns.A01(A00(this))));
        sb.append(", codepoints:");
        C14914UEx A002 = A00(this);
        int A003 = A002.A00(16);
        if (A003 != 0) {
            int A032 = C13992Tns.A03(A002, A003);
            for (int i = 0; i < A032; i++) {
                sb.append(Integer.toHexString(C13992Tns.A02(A00(this), i)));
                sb.append(" ");
            }
        }
        return sb.toString();
    }

    public C18749Vzk(C18470VsM vsM, int i) {
        this.A01 = vsM;
        this.A00 = i;
    }
}
