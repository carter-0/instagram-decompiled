package X;

/* renamed from: X.RiZ  reason: case insensitive filesystem */
public abstract class C9860RiZ {
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0047, code lost:
        if (r1 != false) goto L_0x0049;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.ArrayList A00(java.lang.String r11) {
        /*
            r9 = 1
            r8 = 0
            java.util.HashSet r7 = X.AnonymousClass7TE.A1F()
            java.util.HashSet r6 = X.AnonymousClass7TE.A1F()
            int r5 = android.media.MediaCodecList.getCodecCount()
            r4 = 0
        L_0x000f:
            if (r4 >= r5) goto L_0x0078
            android.media.MediaCodecInfo r10 = android.media.MediaCodecList.getCodecInfoAt(r4)
            boolean r0 = r10.isEncoder()
            if (r0 != r9) goto L_0x004d
            java.lang.String[] r1 = r10.getSupportedTypes()
            int r0 = r1.length
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r0)
            int r0 = r1.length
            java.util.HashSet r0 = X.C281945Ae.A01(r0)
            java.util.Collections.addAll(r0, r1)
            boolean r0 = r0.contains(r11)
            if (r0 == 0) goto L_0x004d
            java.lang.String r3 = r10.getName()
            X.0qQ.A07(r3)
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 29
            if (r1 < r0) goto L_0x0050
            r10.isSoftwareOnly()
            boolean r1 = r10.isSoftwareOnly()
        L_0x0046:
            r0 = r6
            if (r1 == 0) goto L_0x004a
        L_0x0049:
            r0 = r7
        L_0x004a:
            r0.add(r3)
        L_0x004d:
            int r4 = r4 + 1
            goto L_0x000f
        L_0x0050:
            java.lang.String r1 = r10.getName()
            X.0qQ.A07(r1)
            java.lang.String r2 = "google"
            boolean r0 = X.00l.A0d(r1, r2, r8)
            if (r0 != 0) goto L_0x0064
            java.lang.String r0 = "android"
            X.00l.A0d(r1, r0, r8)
        L_0x0064:
            java.lang.String r1 = r10.getName()
            X.0qQ.A07(r1)
            boolean r0 = X.00l.A0d(r1, r2, r8)
            if (r0 != 0) goto L_0x0049
            java.lang.String r0 = "android"
            boolean r1 = X.00l.A0d(r1, r0, r8)
            goto L_0x0046
        L_0x0078:
            r3 = 2
            java.lang.Iterable[] r2 = new java.lang.Iterable[]{r6, r7}
            r1 = 0
        L_0x007e:
            r0 = r2[r1]
            r0.getClass()
            int r1 = r1 + 1
            if (r1 < r3) goto L_0x007e
            X.PzY r0 = new X.PzY
            r0.<init>(r2)
            java.util.ArrayList r0 = X.C256393vh.A00(r0)
            X.0qQ.A0A(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9860RiZ.A00(java.lang.String):java.util.ArrayList");
    }
}
