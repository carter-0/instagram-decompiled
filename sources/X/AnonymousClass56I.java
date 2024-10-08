package X;

import android.os.Process;

/* renamed from: X.56I  reason: invalid class name */
public final class AnonymousClass56I extends C274904pH implements C274924pJ {
    public int A00 = 0;
    public long[][] A01;
    public AnonymousClass56J A02 = new AnonymousClass56J(Process.myPid());
    public AnonymousClass56J A03;
    public final boolean A04;

    public final String getName() {
        return "io";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r1 = r7.A01;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A00() {
        /*
            r7 = this;
            boolean r0 = r7.A04
            if (r0 == 0) goto L_0x0032
            long[][] r1 = r7.A01
            int r6 = r1.length
            if (r6 == 0) goto L_0x0032
            X.56J r2 = r7.A02
            r2.A00()
            X.56J r5 = r7.A03
            r5.A00()
            int r0 = r7.A00
            r4 = r1[r0]
            long r0 = r2.A00
            r3 = 0
            r4[r3] = r0
            long[] r1 = r2.A02
            r2 = 2
            r0 = 1
            java.lang.System.arraycopy(r1, r3, r4, r0, r2)
            long[] r1 = r5.A02
            r0 = 3
            java.lang.System.arraycopy(r1, r3, r4, r0, r2)
            int r0 = r7.A00
            int r0 = r0 + 1
            r7.A00 = r0
            int r0 = r0 % r6
            r7.A00 = r0
        L_0x0032:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass56I.A00():void");
    }

    public final void AGZ(S3X s3x, StackTraceElement[] stackTraceElementArr) {
        if (this.A04) {
            A00();
        }
    }

    public final void update() {
        if (this.A04) {
            A00();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0022, code lost:
        if (r1.A01 == false) goto L_0x0024;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass56I() {
        /*
            r5 = this;
            r5.<init>()
            r4 = 0
            r5.A00 = r4
            int r1 = android.os.Process.myPid()
            X.56J r0 = new X.56J
            r0.<init>(r1)
            r5.A02 = r0
            X.56J r1 = new X.56J
            r1.<init>()
            r5.A03 = r1
            X.56J r0 = r5.A02
            boolean r0 = r0.A01
            r3 = 1
            if (r0 == 0) goto L_0x0024
            boolean r1 = r1.A01
            r0 = 1
            if (r1 != 0) goto L_0x0025
        L_0x0024:
            r0 = 0
        L_0x0025:
            r5.A04 = r0
            r1 = 2
            if (r0 == 0) goto L_0x003e
            r2 = 15
            r0 = 5
            int[] r1 = new int[r1]
            r1[r3] = r0
            r1[r4] = r2
        L_0x0033:
            java.lang.Class r0 = java.lang.Long.TYPE
            java.lang.Object r0 = java.lang.reflect.Array.newInstance(r0, r1)
            long[][] r0 = (long[][]) r0
            r5.A01 = r0
            return
        L_0x003e:
            int[] r1 = new int[r1]
            r1 = {0, 0} // fill-array
            goto L_0x0033
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass56I.<init>():void");
    }
}
