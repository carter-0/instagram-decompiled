package X;

public abstract class VIN {
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0044, code lost:
        r9 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0047, code lost:
        if (r3 <= r12) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0049, code lost:
        r12 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004c, code lost:
        if (r1 <= r6) goto L_0x004f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004e, code lost:
        r6 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004f, code lost:
        r2 = X.C13990Tnq.A0a(r15, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0057, code lost:
        if ((r3 - r10) <= 0.0f) goto L_0x008d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0065, code lost:
        if (android.text.TextUtils.isEmpty(X.00p.A0g(r2, "\n", "", false)) != false) goto L_0x008d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0067, code lost:
        r3 = new X.C306506Mk();
        r7.add(r3);
        r2 = r13 - r14;
        r0 = r9 - r14;
        r3.A02(r2, r0);
        r1 = r12 + r14;
        r3.A01(r1, r0);
        r0 = (0.55f * r14) + r6;
        r3.A01(r1, r0);
        r3.A01(r2, r0);
        r3.A00();
        r11 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x008a, code lost:
        r4 = r4 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x008d, code lost:
        r13 = 0.0f;
        r9 = 0.0f;
        r12 = 0.0f;
        r6 = 0.0f;
        r11 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x003e, code lost:
        if (r11 == false) goto L_0x0040;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0042, code lost:
        if (r2 < r9) goto L_0x0044;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.ArrayList A00(android.text.Layout r15, float r16) {
        /*
            r8 = 0
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r14 = 1053609165(0x3ecccccd, float:0.4)
            float r14 = r14 * r16
            float r13 = r15.getLineLeft(r8)
            int r0 = r15.getLineTop(r8)
            float r9 = (float) r0
            float r12 = r15.getLineRight(r8)
            int r0 = r15.getLineBottom(r8)
            float r6 = (float) r0
            int r5 = r15.getLineCount()
            r4 = 0
            r11 = 0
        L_0x0023:
            if (r4 >= r5) goto L_0x0093
            float r10 = r15.getLineLeft(r4)
            int r0 = r15.getLineTop(r4)
            float r2 = (float) r0
            float r3 = r15.getLineRight(r4)
            int r0 = r15.getLineBottom(r4)
            float r1 = (float) r0
            if (r11 != 0) goto L_0x003d
            int r0 = (r10 > r13 ? 1 : (r10 == r13 ? 0 : -1))
            if (r0 >= 0) goto L_0x0040
        L_0x003d:
            r13 = r10
            if (r11 != 0) goto L_0x0044
        L_0x0040:
            int r0 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r0 >= 0) goto L_0x0045
        L_0x0044:
            r9 = r2
        L_0x0045:
            int r0 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r0 <= 0) goto L_0x004a
            r12 = r3
        L_0x004a:
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 <= 0) goto L_0x004f
            r6 = r1
        L_0x004f:
            java.lang.String r2 = X.C13990Tnq.A0a(r15, r4)
            float r3 = r3 - r10
            r0 = 0
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x008d
            java.lang.String r1 = "\n"
            java.lang.String r0 = ""
            java.lang.String r0 = X.00p.A0g(r2, r1, r0, r8)
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x008d
            X.6Mk r3 = new X.6Mk
            r3.<init>()
            r7.add(r3)
            float r2 = r13 - r14
            float r0 = r9 - r14
            r3.A02(r2, r0)
            float r1 = r12 + r14
            r3.A01(r1, r0)
            r0 = 1057803469(0x3f0ccccd, float:0.55)
            float r0 = r0 * r14
            float r0 = r0 + r6
            r3.A01(r1, r0)
            r3.A01(r2, r0)
            r3.A00()
            r11 = 0
        L_0x008a:
            int r4 = r4 + 1
            goto L_0x0023
        L_0x008d:
            r13 = 0
            r9 = 0
            r12 = 0
            r6 = 0
            r11 = 1
            goto L_0x008a
        L_0x0093:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.VIN.A00(android.text.Layout, float):java.util.ArrayList");
    }
}
