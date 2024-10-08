package X;

import java.lang.reflect.Array;

/* renamed from: X.4pI  reason: invalid class name and case insensitive filesystem */
public final class C274914pI extends C274904pH implements C274924pJ {
    public int A00;
    public long[][] A01;
    public final C274934pK A02;
    public final boolean A03;

    public final String getName() {
        return "gc";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r1 = r6.A01;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A00() {
        /*
            r6 = this;
            X.4pK r4 = r6.A02
            if (r4 == 0) goto L_0x005c
            long[][] r1 = r6.A01
            int r3 = r1.length
            if (r3 == 0) goto L_0x005c
            int r0 = r6.A00
            r5 = r1[r0]
            r2 = 0
            long r0 = r4.A00
            r5[r2] = r0
            long r1 = r4.A05
            r0 = 1
            r5[r0] = r1
            r2 = 2
            long r0 = r4.A06
            r5[r2] = r0
            r2 = 3
            long r0 = r4.A02
            r5[r2] = r0
            r2 = 4
            long r0 = r4.A03
            r5[r2] = r0
            r2 = 5
            long r0 = r4.A01
            r5[r2] = r0
            r2 = 6
            long r0 = r4.A04
            r5[r2] = r0
            r2 = 7
            java.lang.Runtime r0 = java.lang.Runtime.getRuntime()
            long r0 = r0.totalMemory()
            r5[r2] = r0
            r2 = 8
            java.lang.Runtime r0 = java.lang.Runtime.getRuntime()
            long r0 = r0.freeMemory()
            r5[r2] = r0
            r2 = 9
            java.lang.Runtime r0 = java.lang.Runtime.getRuntime()
            long r0 = r0.maxMemory()
            r5[r2] = r0
            int r0 = r6.A00
            int r0 = r0 + 1
            r6.A00 = r0
            int r0 = r0 % r3
            r6.A00 = r0
        L_0x005c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C274914pI.A00():void");
    }

    public final void AGZ(S3X s3x, StackTraceElement[] stackTraceElementArr) {
        C274934pK r2 = this.A02;
        if (r2 != null) {
            r2.A00();
            if (this.A03) {
                A00();
            }
            s3x.A04 = r2.A05;
            s3x.A06 = r2.A06;
            s3x.A01 = r2.A02;
            s3x.A02 = r2.A03;
            s3x.A05 = r2.A07;
        }
    }

    public final void update() {
        C274934pK r1 = this.A02;
        if (r1 != null && this.A03) {
            r1.A00();
            A00();
        }
    }

    public C274914pI(boolean z) {
        this.A00 = 0;
        C274934pK r0 = C274934pK.A0E;
        if (r0 == null) {
            r0 = new C274934pK();
            C274934pK.A0E = r0;
        }
        this.A02 = r0;
        this.A03 = z;
        int[] iArr = {0, 0};
        if (z) {
            // fill-array-data instruction
            iArr[0] = 15;
            iArr[1] = 10;
        }
        this.A01 = (long[][]) Array.newInstance(Long.TYPE, iArr);
    }

    public C274914pI() {
        this(false);
    }
}
