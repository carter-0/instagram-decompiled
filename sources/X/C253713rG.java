package X;

import android.view.View;

/* renamed from: X.3rG  reason: invalid class name and case insensitive filesystem */
public abstract class C253713rG {
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0110, code lost:
        if (r8 > r2) goto L_0x0112;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x011f, code lost:
        if (r8 > r2) goto L_0x0114;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(X.AnonymousClass2T3 r12, float r13, int r14, int r15) {
        /*
            r0 = 3
            X.0qQ.A0B(r12, r0)
            boolean r0 = java.lang.Float.isNaN(r13)
            r2 = 0
            r3 = 0
            if (r0 != 0) goto L_0x0023
            boolean r0 = java.lang.Float.isInfinite(r13)
            if (r0 != 0) goto L_0x0023
            int r0 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x0023
            r1 = 0
            int r0 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r0 > 0) goto L_0x0024
            java.lang.String r1 = "The aspect ratio must be a positive number"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x0023:
            r1 = 1
        L_0x0024:
            boolean r0 = X.2Sa.enableLoggingForInvalidAspectRatio
            if (r0 == 0) goto L_0x00df
            if (r1 == 0) goto L_0x00df
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            java.lang.StackTraceElement[] r5 = r0.getStackTrace()
            X.0qQ.A07(r5)
            int r4 = r5.length
            r2 = 0
        L_0x003c:
            if (r2 >= r4) goto L_0x0050
            r0 = r5[r2]
            java.lang.String r1 = r0.toString()
            r0 = 10
            java.lang.String r0 = X.002.A0C(r1, r0)
            r6.append(r0)
            int r2 = r2 + 1
            goto L_0x003c
        L_0x0050:
            java.lang.String r4 = r6.toString()
            X.0qQ.A07(r4)
            java.lang.String r9 = "Litho.DebugInfo"
            X.2SO r1 = X.2SO.A02
            long r7 = java.lang.System.currentTimeMillis()
            X.2SO r0 = X.2SN.A00()
            int r0 = r1.compareTo(r0)
            if (r0 < 0) goto L_0x00df
            java.util.Set r1 = X.2SN.A00
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x00df
            r0 = 0
            java.util.Iterator r6 = r1.iterator()
        L_0x0076:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L_0x009e
            java.lang.Object r5 = r6.next()
            r1 = r5
            X.2SM r1 = (X.2SM) r1
            java.lang.String[] r2 = r1.A00
            boolean r1 = X.03t.A0O(r9, r2)
            if (r1 != 0) goto L_0x0093
            java.lang.String r1 = "*"
            boolean r1 = X.03t.A0O(r1, r2)
            if (r1 == 0) goto L_0x0076
        L_0x0093:
            if (r0 != 0) goto L_0x009a
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L_0x009a:
            r0.add(r5)
            goto L_0x0076
        L_0x009e:
            if (r0 != 0) goto L_0x00a2
            X.0sn r0 = X.0sn.A00
        L_0x00a2:
            boolean r1 = r0.isEmpty()
            r1 = r1 ^ 1
            if (r1 == 0) goto L_0x00df
            java.util.LinkedHashMap r11 = new java.util.LinkedHashMap
            r11.<init>()
            java.lang.String r2 = "name"
            java.lang.String r1 = "INVALID_ASPECT_RATIO"
            r11.put(r2, r1)
            java.lang.Float r2 = java.lang.Float.valueOf(r13)
            java.lang.String r1 = "aspectRatio"
            r11.put(r1, r2)
            java.lang.String r1 = "source"
            r11.put(r1, r4)
            java.lang.String r10 = "-1"
            X.PzP r6 = new X.PzP
            r6.<init>(r7, r9, r10, r11)
            java.util.Iterator r1 = r0.iterator()
        L_0x00cf:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00df
            java.lang.Object r0 = r1.next()
            X.2SM r0 = (X.2SM) r0
            r0.A00(r6)
            goto L_0x00cf
        L_0x00df:
            int r6 = android.view.View.MeasureSpec.getMode(r14)
            int r5 = android.view.View.MeasureSpec.getSize(r14)
            int r4 = android.view.View.MeasureSpec.getMode(r15)
            int r2 = android.view.View.MeasureSpec.getSize(r15)
            float r0 = (float) r5
            float r0 = r0 / r13
            double r0 = (double) r0
            double r0 = java.lang.Math.ceil(r0)
            float r7 = (float) r0
            int r8 = (int) r7
            float r0 = (float) r2
            float r0 = r0 * r13
            double r0 = (double) r0
            double r0 = java.lang.Math.ceil(r0)
            float r7 = (float) r0
            int r7 = (int) r7
            if (r6 != 0) goto L_0x010a
            if (r4 != 0) goto L_0x010a
            r12.A01 = r3
            r12.A00 = r3
        L_0x0109:
            return
        L_0x010a:
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r6 != r1) goto L_0x0117
            if (r4 != r1) goto L_0x0117
            if (r8 <= r2) goto L_0x0134
        L_0x0112:
            r12.A01 = r7
        L_0x0114:
            r12.A00 = r2
            return
        L_0x0117:
            r0 = 1073741824(0x40000000, float:2.0)
            if (r6 != r0) goto L_0x0124
            r12.A01 = r5
            if (r4 == 0) goto L_0x0121
            if (r8 > r2) goto L_0x0114
        L_0x0121:
            r12.A00 = r8
            return
        L_0x0124:
            if (r4 != r0) goto L_0x012f
            r12.A00 = r2
            if (r6 == 0) goto L_0x0137
            if (r7 <= r5) goto L_0x0137
            r12.A01 = r5
            return
        L_0x012f:
            if (r6 == r1) goto L_0x0134
            if (r4 != r1) goto L_0x0109
            goto L_0x0112
        L_0x0134:
            r12.A01 = r5
            goto L_0x0121
        L_0x0137:
            r12.A01 = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C253713rG.A01(X.2T3, float, int, int):void");
    }

    public static final int A00(int i) {
        int mode = View.MeasureSpec.getMode(i);
        int i2 = AnonymousClass972.MUTABLE_FLAG_MASK;
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                return View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 0);
            }
            i2 = SN3.MAX_SIGNED_POWER_OF_TWO;
            if (mode != 1073741824) {
                throw new IllegalStateException("Unexpected size spec mode");
            }
        }
        return View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), i2);
    }
}
