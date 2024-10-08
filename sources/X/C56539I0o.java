package X;

/* renamed from: X.I0o  reason: case insensitive filesystem */
public final class C56539I0o {
    public final int A01(C244143ai r2, int[] iArr) {
        0qQ.A0B(iArr, 0);
        return iArr[A00(r2)];
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0012, code lost:
        if (r1 >= 4) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0014, code lost:
        r6[r1] = r7;
        r1 = r1 + 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02(X.C244143ai r5, int[] r6, int r7) {
        /*
            r4 = this;
            r3 = 0
            r2 = 1
            int r0 = r5.ordinal()
            r1 = 0
            switch(r0) {
                case 6: goto L_0x0019;
                case 7: goto L_0x001d;
                case 8: goto L_0x0014;
                default: goto L_0x000a;
            }
        L_0x000a:
            int r0 = A00(r5)
        L_0x000e:
            r6[r0] = r7
        L_0x0010:
            return
        L_0x0011:
            r0 = 4
            if (r1 >= r0) goto L_0x0010
        L_0x0014:
            r6[r1] = r7
            int r1 = r1 + 1
            goto L_0x0011
        L_0x0019:
            r6[r3] = r7
            r0 = 2
            goto L_0x000e
        L_0x001d:
            r6[r2] = r7
            r0 = 3
            goto L_0x000e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56539I0o.A02(X.3ai, int[], int):void");
    }

    public static final int A00(C244143ai r2) {
        switch (r2.ordinal()) {
            case 0:
            case 4:
                return 0;
            case 1:
                return 1;
            case 2:
            case 5:
                return 2;
            case 3:
                return 3;
            default:
                throw AnonymousClass7TF.A0W("Given unsupported edge ", r2.name());
        }
    }
}
