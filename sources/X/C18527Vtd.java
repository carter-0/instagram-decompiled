package X;

/* renamed from: X.Vtd  reason: case insensitive filesystem */
public final class C18527Vtd {
    public static final C18527Vtd A00 = new Object();

    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00f5, code lost:
        if (r5 != 0) goto L_0x00f7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0102, code lost:
        if (r6 != 0) goto L_0x00f7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0105, code lost:
        r5 = r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C17606Vay A00(android.content.Context r15, X.C276544tV r16) {
        /*
            r14 = this;
            r4 = 1
            r0 = 94
            r1 = r16
            X.4tV r7 = r1.A07(r0)
            if (r7 == 0) goto L_0x011f
            int r10 = X.C14535Txv.A00(r1)
            int r1 = r7.A04
            r0 = 16373(0x3ff5, float:2.2943E-41)
            if (r1 == r0) goto L_0x0057
            r0 = 16483(0x4063, float:2.3098E-41)
            if (r1 != r0) goto L_0x0118
            java.lang.Integer r8 = X.AnonymousClass05K.A01
        L_0x001b:
            int r3 = r8.intValue()
            r0 = 0
            r1 = 41
            if (r3 == r0) goto L_0x0026
            r1 = 40
        L_0x0026:
            r0 = -1
            int r11 = r7.A03(r1, r0)
            if (r11 == r0) goto L_0x0110
            r1 = 36
            r2 = 0
            if (r3 == r2) goto L_0x004c
            java.lang.Integer r5 = java.lang.Integer.valueOf(r1)
            r0 = 35
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
        L_0x003c:
            int r0 = r5.intValue()
            int r6 = r1.intValue()
            java.lang.String r1 = r7.A0K(r0)
            r0 = 0
            if (r1 == 0) goto L_0x005e
            goto L_0x005a
        L_0x004c:
            r0 = 38
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto L_0x003c
        L_0x0057:
            java.lang.Integer r8 = X.AnonymousClass05K.A00
            goto L_0x001b
        L_0x005a:
            float r0 = X.AnonymousClass6Su.A01(r1)     // Catch:{ 3yO -> 0x0060 }
        L_0x005e:
            int r5 = (int) r0     // Catch:{ 3yO -> 0x0060 }
            goto L_0x006c
        L_0x0060:
            java.lang.String r0 = "Invalid pixel format for grid spacing "
            java.lang.String r1 = X.002.A0R(r0, r1)
            java.lang.String r0 = "GridCommonUtils"
            X.1Kn.A02(r0, r1)
            r5 = 0
        L_0x006c:
            java.lang.String r1 = r7.A0K(r6)
            r0 = 0
            if (r1 == 0) goto L_0x0077
            float r0 = X.AnonymousClass6Su.A01(r1)     // Catch:{ 3yO -> 0x0079 }
        L_0x0077:
            int r0 = (int) r0     // Catch:{ 3yO -> 0x0079 }
            goto L_0x0085
        L_0x0079:
            java.lang.String r0 = "Invalid pixel format for grid spacing "
            java.lang.String r1 = X.002.A0R(r0, r1)
            java.lang.String r0 = "GridCommonUtils"
            X.1Kn.A02(r0, r1)
            r0 = 0
        L_0x0085:
            if (r10 != r4) goto L_0x0107
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
        L_0x008f:
            int r12 = r1.intValue()
            int r13 = r0.intValue()
            r0 = 40
            if (r3 == r2) goto L_0x009d
            r0 = 38
        L_0x009d:
            X.4tV r1 = r7.A07(r0)
            if (r1 != 0) goto L_0x00c1
            android.graphics.Rect r6 = new android.graphics.Rect
            r6.<init>()
        L_0x00a8:
            r0 = 49
            java.lang.String r1 = r7.A0K(r0)
            java.lang.String r0 = "match_largest"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x00be
            java.lang.Integer r9 = X.AnonymousClass05K.A01
        L_0x00b8:
            X.Vay r5 = new X.Vay
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13)
            return r5
        L_0x00be:
            java.lang.Integer r9 = X.AnonymousClass05K.A00
            goto L_0x00b8
        L_0x00c1:
            r0 = 42
            float r0 = X.C16918VAv.A00(r1, r0)
            int r5 = (int) r0
            r0 = 40
            float r0 = X.C16918VAv.A00(r1, r0)
            int r4 = (int) r0
            r0 = 41
            float r0 = X.C16918VAv.A00(r1, r0)
            int r6 = (int) r0
            r0 = 35
            float r0 = X.C16918VAv.A00(r1, r0)
            int r3 = (int) r0
            r0 = 36
            float r0 = X.C16918VAv.A00(r1, r0)
            int r2 = (int) r0
            r0 = 38
            float r0 = X.C16918VAv.A00(r1, r0)
            int r1 = (int) r0
            boolean r0 = X.C16919VAw.A00(r15)
            if (r0 == 0) goto L_0x00fd
            r0 = r6
            if (r6 != 0) goto L_0x00f5
            r0 = r2
        L_0x00f5:
            if (r5 == 0) goto L_0x0105
        L_0x00f7:
            android.graphics.Rect r6 = new android.graphics.Rect
            r6.<init>(r0, r4, r5, r3)
            goto L_0x00a8
        L_0x00fd:
            r0 = r5
            if (r5 != 0) goto L_0x0101
            r0 = r2
        L_0x0101:
            r5 = r6
            if (r6 == 0) goto L_0x0105
            goto L_0x00f7
        L_0x0105:
            r5 = r1
            goto L_0x00f7
        L_0x0107:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x008f
        L_0x0110:
            java.lang.String r1 = "GridCommonUtils: span-count is required for grids"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x0118:
            java.lang.String r0 = "GridCommonUtils: Grid type is unknown for style "
            java.lang.IllegalArgumentException r0 = X.DbW.A0a(r0, r1)
            throw r0
        L_0x011f:
            java.lang.String r1 = "GridCommonUtils: grid layout config should be defined"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18527Vtd.A00(android.content.Context, X.4tV):X.Vay");
    }
}
