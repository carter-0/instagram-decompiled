package X;

public final class S9E {
    /* JADX WARNING: type inference failed for: r3v3, types: [X.W0S] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C7842QbP A00(android.view.MotionEvent r7, X.C10226Rom r8, java.lang.Integer r9, float r10, float r11, int r12, int r13, long r14) {
        /*
            r0 = 7
            X.0qQ.A0B(r8, r0)
            X.0l2 r0 = X.C7842QbP.A05
            java.lang.Object r3 = r0.A7A()
            X.QbP r3 = (X.C7842QbP) r3
            if (r3 != 0) goto L_0x0013
            X.QbP r3 = new X.QbP
            r3.<init>()
        L_0x0013:
            X.0Sd.A00(r7)
            long r0 = r7.getEventTime()
            r3.A00 = r12
            r3.A02 = r13
            r3.A03 = r0
            r6 = 1
            r3.A04 = r6
            r2 = 0
            r4 = -9223372036854775808
            int r0 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1))
            boolean r1 = X.AnonymousClass7TF.A1P(r0)
            java.lang.String r0 = "Gesture start time must be initialized"
            X.S9A.A00(r1, r0)
            int r0 = r7.getAction()
            r1 = r0 & 255(0xff, float:3.57E-43)
            if (r1 == 0) goto L_0x0070
            if (r1 == r6) goto L_0x0069
            r0 = 2
            if (r1 == r0) goto L_0x0077
            r0 = 3
            if (r1 == r0) goto L_0x0069
            r0 = 5
            if (r1 == r0) goto L_0x0052
            r0 = 6
            if (r1 == r0) goto L_0x0052
            java.lang.String r0 = "Unhandled MotionEvent action: "
            java.lang.String r0 = X.002.A0O(r0, r1)
            java.lang.RuntimeException r0 = X.AnonymousClass7TE.A15(r0)
            throw r0
        L_0x0052:
            android.util.SparseIntArray r5 = r8.A00
            int r4 = (int) r14
            r1 = -1
            int r0 = r5.get(r4, r1)
            if (r0 == r1) goto L_0x0062
            int r0 = r0 + 1
            r5.put(r4, r0)
            goto L_0x0086
        L_0x0062:
            java.lang.String r0 = "Tried to increment non-existent cookie"
            java.lang.RuntimeException r0 = X.AnonymousClass7TE.A15(r0)
            throw r0
        L_0x0069:
            android.util.SparseIntArray r1 = r8.A00
            int r0 = (int) r14
            r1.delete(r0)
            goto L_0x0086
        L_0x0070:
            android.util.SparseIntArray r1 = r8.A00
            int r0 = (int) r14
            r1.put(r0, r2)
            goto L_0x0086
        L_0x0077:
            android.util.SparseIntArray r2 = r8.A00
            int r1 = (int) r14
            r0 = -1
            int r1 = r2.get(r1, r0)
            if (r1 == r0) goto L_0x0095
            r0 = 65535(0xffff, float:9.1834E-41)
            r0 = r0 & r1
            short r2 = (short) r0
        L_0x0086:
            android.view.MotionEvent r0 = android.view.MotionEvent.obtain(r7)
            r3.A02 = r0
            r3.A03 = r9
            r3.A04 = r2
            r3.A00 = r10
            r3.A01 = r11
            return r3
        L_0x0095:
            java.lang.String r0 = "Tried to get non-existent cookie"
            java.lang.RuntimeException r0 = X.AnonymousClass7TE.A15(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.S9E.A00(android.view.MotionEvent, X.Rom, java.lang.Integer, float, float, int, int, long):X.QbP");
    }
}
