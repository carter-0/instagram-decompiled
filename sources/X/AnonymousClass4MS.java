package X;

import java.util.concurrent.TimeUnit;

/* renamed from: X.4MS  reason: invalid class name */
public final class AnonymousClass4MS {
    public long A00;
    public long A01;
    public boolean A02;
    public final AnonymousClass4MQ A03;

    public final long A00(TimeUnit timeUnit) {
        long j;
        if (this.A02) {
            j = (this.A03.A00() - this.A01) + this.A00;
        } else {
            j = this.A00;
        }
        return timeUnit.convert(j, TimeUnit.NANOSECONDS);
    }

    public final void A01() {
        this.A00 = 0;
        this.A02 = false;
    }

    public final void A02() {
        17k.A0H(!this.A02, "This stopwatch is already running.");
        this.A02 = true;
        this.A01 = this.A03.A00();
    }

    public final void A03() {
        long A002 = this.A03.A00();
        17k.A0H(this.A02, "This stopwatch is already stopped.");
        this.A02 = false;
        this.A00 += A002 - this.A01;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x004f, code lost:
        if (r6.convert(r3, r5) > 0) goto L_0x0051;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String toString() {
        /*
            r9 = this;
            boolean r0 = r9.A02
            if (r0 == 0) goto L_0x007e
            X.4MQ r0 = r9.A03
            long r3 = r0.A00()
            long r0 = r9.A01
            long r3 = r3 - r0
            long r0 = r9.A00
            long r3 = r3 + r0
        L_0x0010:
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.DAYS
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.NANOSECONDS
            long r1 = r6.convert(r3, r5)
            r7 = 0
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r0 > 0) goto L_0x0051
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.HOURS
            long r1 = r6.convert(r3, r5)
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r0 > 0) goto L_0x0051
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.MINUTES
            long r1 = r6.convert(r3, r5)
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r0 > 0) goto L_0x0051
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.SECONDS
            long r1 = r6.convert(r3, r5)
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r0 > 0) goto L_0x0051
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r1 = r6.convert(r3, r5)
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r0 > 0) goto L_0x0051
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.MICROSECONDS
            long r1 = r6.convert(r3, r5)
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            r7 = r5
            if (r0 <= 0) goto L_0x0052
        L_0x0051:
            r7 = r6
        L_0x0052:
            double r0 = (double) r3
            r2 = 1
            long r4 = r5.convert(r2, r7)
            double r2 = (double) r4
            double r0 = r0 / r2
            java.util.Locale r2 = java.util.Locale.ROOT
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            java.lang.Object[] r1 = new java.lang.Object[]{r0}
            java.lang.String r0 = "%.4g"
            java.lang.String r3 = java.lang.String.format(r2, r0, r1)
            java.lang.String r2 = " "
            int[] r1 = X.O42.A00
            int r0 = r7.ordinal()
            r0 = r1[r0]
            switch(r0) {
                case 1: goto L_0x0081;
                case 2: goto L_0x0084;
                case 3: goto L_0x0087;
                case 4: goto L_0x008a;
                case 5: goto L_0x008d;
                case 6: goto L_0x0090;
                case 7: goto L_0x0093;
                default: goto L_0x0078;
            }
        L_0x0078:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        L_0x007e:
            long r3 = r9.A00
            goto L_0x0010
        L_0x0081:
            java.lang.String r0 = "ns"
            goto L_0x0095
        L_0x0084:
            java.lang.String r0 = "μs"
            goto L_0x0095
        L_0x0087:
            java.lang.String r0 = "ms"
            goto L_0x0095
        L_0x008a:
            java.lang.String r0 = "s"
            goto L_0x0095
        L_0x008d:
            java.lang.String r0 = "min"
            goto L_0x0095
        L_0x0090:
            java.lang.String r0 = "h"
            goto L_0x0095
        L_0x0093:
            java.lang.String r0 = "d"
        L_0x0095:
            java.lang.String r0 = X.002.A0g(r3, r2, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4MS.toString():java.lang.String");
    }

    public AnonymousClass4MS(AnonymousClass4MQ r1) {
        this.A03 = r1;
    }

    public AnonymousClass4MS() {
        this.A03 = AnonymousClass4MQ.A00;
    }
}
