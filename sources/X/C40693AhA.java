package X;

import android.graphics.Bitmap;

/* renamed from: X.AhA  reason: case insensitive filesystem */
public final class C40693AhA implements C13824Thu {
    public Bitmap A00;
    public long A01 = -2147483648L;
    public long A02;
    public long A03 = -1;
    public boolean A04 = true;
    public final long A05;

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x007b, code lost:
        if ((X.AnonymousClass7TE.A0R(r13.get(r9)) - r5) < (r5 - X.AnonymousClass7TE.A0R(r13.get(r10)))) goto L_0x0032;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Long AVQ(java.util.List r13) {
        /*
            r12 = this;
            r1 = 0
            X.0qQ.A0B(r13, r1)
            boolean r0 = r13.isEmpty()
            r11 = 0
            if (r0 != 0) goto L_0x0056
            long r5 = r12.A05
            r10 = 0
            java.lang.Object r0 = r13.get(r1)
            long r1 = X.AnonymousClass7TE.A0R(r0)
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x007e
            int r0 = r13.size()
            int r0 = r0 + -1
            java.lang.Object r0 = r13.get(r0)
            long r1 = X.AnonymousClass7TE.A0R(r0)
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0057
            int r0 = r13.size()
            int r9 = r0 + -1
        L_0x0032:
            java.lang.Object r0 = r13.get(r9)
        L_0x0036:
            long r3 = X.AnonymousClass7TE.A0R(r0)
            long r0 = r3 - r5
            long r6 = java.lang.Math.abs(r0)
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.MICROSECONDS
            r1 = 250(0xfa, double:1.235E-321)
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r1 = r5.convert(r1, r0)
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0056
            r12.A03 = r3
            r12.A02 = r3
            java.lang.Long r11 = java.lang.Long.valueOf(r3)
        L_0x0056:
            return r11
        L_0x0057:
            java.lang.Long r0 = java.lang.Long.valueOf(r5)
            int r9 = java.util.Collections.binarySearch(r13, r0)
            if (r9 >= 0) goto L_0x0032
            int r0 = -r9
            int r9 = r0 + -1
            java.lang.Object r0 = r13.get(r9)
            long r7 = X.AnonymousClass7TE.A0R(r0)
            long r7 = r7 - r5
            int r10 = r9 + -1
            java.lang.Object r0 = r13.get(r10)
            long r3 = X.AnonymousClass7TE.A0R(r0)
            long r1 = r5 - r3
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x007e
            goto L_0x0032
        L_0x007e:
            java.lang.Object r0 = r13.get(r10)
            goto L_0x0036
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C40693AhA.AVQ(java.util.List):java.lang.Long");
    }

    public final boolean ErY(int i, long j) {
        return this.A01 == j + this.A02;
    }

    public final boolean Cqr() {
        return this.A04;
    }

    public final void CyD(long j, int i, Bitmap bitmap) {
        this.A00 = bitmap;
        this.A01 = j + this.A02;
    }

    public final void DKn(long j) {
        long j2 = j + this.A02;
        if (this.A03 == j2) {
            this.A01 = j2;
        } else {
            long j3 = this.A05;
            if (Math.abs(j3 - j2) < Math.abs(this.A01 - j3)) {
                this.A01 = j2;
                return;
            }
        }
        this.A04 = false;
    }

    public C40693AhA(long j, long j2) {
        this.A02 = j;
        this.A05 = j2;
    }
}
