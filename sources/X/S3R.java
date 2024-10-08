package X;

public final class S3R {
    public float A00 = -3.4028235E38f;
    public float A01 = -3.4028235E38f;
    public float A02 = 1.0f;
    public int A03 = 0;
    public int A04 = 1;
    public int A05 = AnonymousClass972.MUTABLE_FLAG_MASK;
    public int A06 = 2;
    public int A07 = AnonymousClass972.MUTABLE_FLAG_MASK;
    public long A08 = 0;
    public long A09 = 0;
    public CharSequence A0A;

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0027, code lost:
        if (r2 != 5) goto L_0x0029;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x007d, code lost:
        if (r2 == 0) goto L_0x0055;
     */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.S3W A00() {
        /*
            r8 = this;
            float r3 = r8.A01
            r7 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            int r0 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r0 != 0) goto L_0x0015
            int r1 = r8.A06
            r0 = 4
            if (r1 == r0) goto L_0x008a
            r0 = 5
            r3 = 1065353216(0x3f800000, float:1.0)
            if (r1 == r0) goto L_0x0015
            r3 = 1056964608(0x3f000000, float:0.5)
        L_0x0015:
            int r1 = r8.A05
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 != r0) goto L_0x0029
            int r2 = r8.A06
            r1 = 1
            if (r2 == r1) goto L_0x0088
            r0 = 3
            if (r2 == r0) goto L_0x0086
            r0 = 4
            if (r2 == r0) goto L_0x0088
            r0 = 5
            if (r2 == r0) goto L_0x0086
        L_0x0029:
            X.S3W r4 = new X.S3W
            r4.<init>()
            int r2 = r8.A06
            r0 = 1
            if (r2 == r0) goto L_0x0083
            r0 = 2
            if (r2 == r0) goto L_0x0080
            r0 = 3
            if (r2 == r0) goto L_0x003c
            r0 = 4
            if (r2 == r0) goto L_0x0083
        L_0x003c:
            android.text.Layout$Alignment r0 = android.text.Layout.Alignment.ALIGN_OPPOSITE
        L_0x003e:
            r4.A0D = r0
            float r6 = r8.A00
            int r2 = r8.A04
            r5 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r0 == 0) goto L_0x0076
            if (r2 != 0) goto L_0x0076
            r0 = 0
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x0055
            int r0 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x0076
        L_0x0055:
            r6 = 1065353216(0x3f800000, float:1.0)
        L_0x0057:
            r4.A01 = r6
            r4.A07 = r2
            int r0 = r8.A03
            r4.A06 = r0
            r4.A02 = r3
            r4.A08 = r1
            float r2 = r8.A02
            if (r1 == 0) goto L_0x008c
            r0 = 1
            if (r1 == r0) goto L_0x008f
            r0 = 2
            if (r1 == r0) goto L_0x0098
            java.lang.String r0 = java.lang.String.valueOf(r1)
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        L_0x0076:
            int r0 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r0 != 0) goto L_0x0057
            r6 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            if (r2 != 0) goto L_0x0057
            goto L_0x0055
        L_0x0080:
            android.text.Layout$Alignment r0 = android.text.Layout.Alignment.ALIGN_CENTER
            goto L_0x003e
        L_0x0083:
            android.text.Layout$Alignment r0 = android.text.Layout.Alignment.ALIGN_NORMAL
            goto L_0x003e
        L_0x0086:
            r1 = 2
            goto L_0x0029
        L_0x0088:
            r1 = 0
            goto L_0x0029
        L_0x008a:
            r3 = 0
            goto L_0x0015
        L_0x008c:
            float r3 = r5 - r3
            goto L_0x0098
        L_0x008f:
            r0 = 1056964608(0x3f000000, float:0.5)
            r1 = 1073741824(0x40000000, float:2.0)
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x00a9
            float r3 = r3 * r1
        L_0x0098:
            float r0 = java.lang.Math.min(r2, r3)
            r4.A04 = r0
            int r0 = r8.A07
            r4.A0A = r0
            java.lang.CharSequence r0 = r8.A0A
            if (r0 == 0) goto L_0x00a8
            r4.A0E = r0
        L_0x00a8:
            return r4
        L_0x00a9:
            float r5 = r5 - r3
            float r3 = r5 * r1
            goto L_0x0098
        */
        throw new UnsupportedOperationException("Method not decompiled: X.S3R.A00():X.S3W");
    }
}
