package X;

import java.util.List;

/* renamed from: X.8HL  reason: invalid class name */
public abstract class AnonymousClass8HL {
    public final float A00;
    public final float A01;

    public final int[] A01(List list, float f, float f2) {
        double ceil;
        int i;
        int[] iArr = new int[3];
        if (!list.isEmpty()) {
            float f3 = this.A01;
            float f4 = this.A00;
            boolean z = false;
            if (f3 > f4) {
                z = true;
            }
            if (f != -1.0f) {
                f3 = (Math.abs(f - f2) * f3) + f;
            }
            double size = (double) (((float) (list.size() - 1)) * f3);
            if (z) {
                ceil = Math.floor(size);
            } else {
                ceil = Math.ceil(size);
            }
            iArr[0] = (int) ceil;
            if (f2 != -1.0f) {
                f4 = f + (Math.abs(f - f2) * f4);
            }
            double size2 = (double) (((float) (list.size() - 1)) * f4);
            if (z) {
                int ceil2 = (int) Math.ceil(size2);
                iArr[1] = ceil2;
                i = ceil2 + 1;
            } else {
                int floor = (int) Math.floor(size2);
                iArr[1] = floor;
                i = floor - 1;
            }
            iArr[1] = i;
            iArr[2] = Math.abs(iArr[0] - i) + 1;
        }
        return iArr;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0036, code lost:
        if (r1 < ((float) r2)) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0038, code lost:
        r11.add(r10.get(java.lang.Math.round(r1)));
        r0 = java.lang.Math.abs(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0047, code lost:
        if (r3 == false) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0049, code lost:
        r1 = r1 - r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x004b, code lost:
        r1 = r1 + r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00ae, code lost:
        if (r7 == false) goto L_0x00b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00b3, code lost:
        if (r6 <= ((float) r5)) goto L_0x00bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00b5, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00b9, code lost:
        if (r6 < ((float) r5)) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00bb, code lost:
        r11.add(r10.get(java.lang.Math.round(r6)));
        r0 = java.lang.Math.abs((((r6 - r2) / ((float) r3)) * r4) + r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00d0, code lost:
        if (r7 == false) goto L_0x00d4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00d2, code lost:
        r6 = r6 - r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00d4, code lost:
        r6 = r6 + r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x002b, code lost:
        if (r3 == false) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0030, code lost:
        if (r1 <= ((float) r2)) goto L_0x0038;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(java.util.List r10, java.util.List r11, float r12, float r13, float r14) {
        /*
            r9 = this;
            boolean r0 = r9 instanceof X.AnonymousClass8HK
            if (r0 == 0) goto L_0x004d
            r2 = r9
            X.8HK r2 = (X.AnonymousClass8HK) r2
            float r1 = r2.A00
            float r1 = r1 * r12
            int[] r5 = r2.A01(r10, r13, r14)
            r0 = 2
            r0 = r5[r0]
            float r4 = (float) r0
            float r0 = r4 / r1
            int r0 = java.lang.Math.round(r0)
            float r0 = (float) r0
            float r4 = r4 / r0
            float r3 = r2.A01
            float r0 = r2.A00
            r2 = 1
            r1 = 0
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            r3 = 0
            if (r0 <= 0) goto L_0x0026
            r3 = 1
        L_0x0026:
            r0 = r5[r1]
            r2 = r5[r2]
            float r1 = (float) r0
            if (r3 != 0) goto L_0x0033
        L_0x002d:
            float r0 = (float) r2
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0038
        L_0x0032:
            return
        L_0x0033:
            float r0 = (float) r2
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x0032
        L_0x0038:
            int r0 = java.lang.Math.round(r1)
            java.lang.Object r0 = r10.get(r0)
            r11.add(r0)
            float r0 = java.lang.Math.abs(r4)
            if (r3 == 0) goto L_0x004b
            float r1 = r1 - r0
            goto L_0x0033
        L_0x004b:
            float r1 = r1 + r0
            goto L_0x002d
        L_0x004d:
            boolean r0 = r9 instanceof X.AnonymousClass8HN
            if (r0 == 0) goto L_0x0077
            r2 = r9
            X.8HN r2 = (X.AnonymousClass8HN) r2
            int[] r4 = r2.A01(r10, r13, r14)
            int r0 = r10.size()
            float r0 = (float) r0
            float r0 = r0 / r12
            int r0 = java.lang.Math.round(r0)
            float r1 = (float) r0
            float r0 = r2.A00
            float r1 = r1 * r0
            int r3 = (int) r1
            r2 = 0
            r1 = 0
        L_0x0069:
            if (r1 >= r3) goto L_0x0032
            r0 = r4[r2]
            java.lang.Object r0 = r10.get(r0)
            r11.add(r0)
            int r1 = r1 + 1
            goto L_0x0069
        L_0x0077:
            r1 = r9
            X.8HM r1 = (X.AnonymousClass8HM) r1
            int[] r5 = r1.A01(r10, r13, r14)
            float r2 = r1.A01
            float r2 = r2 * r12
            r0 = 2
            r0 = r5[r0]
            float r4 = (float) r0
            float r0 = r4 / r2
            int r0 = java.lang.Math.round(r0)
            float r0 = (float) r0
            float r8 = r4 / r0
            float r0 = r1.A00
            float r0 = r0 * r12
            float r0 = r4 / r0
            int r0 = java.lang.Math.round(r0)
            float r0 = (float) r0
            float r4 = r4 / r0
            float r4 = r4 - r8
            float r3 = r1.A01
            float r0 = r1.A00
            r2 = 1
            r1 = 0
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            r7 = 0
            if (r0 <= 0) goto L_0x00a6
            r7 = 1
        L_0x00a6:
            r0 = r5[r1]
            r5 = r5[r2]
            int r3 = r5 - r0
            float r2 = (float) r0
            r6 = r2
            if (r7 != 0) goto L_0x00b6
        L_0x00b0:
            float r0 = (float) r5
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x00bb
            return
        L_0x00b6:
            float r0 = (float) r5
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x0032
        L_0x00bb:
            int r0 = java.lang.Math.round(r6)
            java.lang.Object r0 = r10.get(r0)
            r11.add(r0)
            float r1 = r6 - r2
            float r0 = (float) r3
            float r1 = r1 / r0
            float r1 = r1 * r4
            float r1 = r1 + r8
            float r0 = java.lang.Math.abs(r1)
            if (r7 == 0) goto L_0x00d4
            float r6 = r6 - r0
            goto L_0x00b6
        L_0x00d4:
            float r6 = r6 + r0
            goto L_0x00b0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8HL.A00(java.util.List, java.util.List, float, float, float):void");
    }

    public AnonymousClass8HL(float f, float f2) {
        if (f < 0.0f || f > 1.0f) {
            throw new IllegalArgumentException("start must be 0.0f-1.0f");
        } else if (f2 < 0.0f || f2 > 1.0f) {
            throw new IllegalArgumentException("start must be 0.0f-1.0f");
        } else {
            this.A01 = f;
            this.A00 = f2;
        }
    }
}
