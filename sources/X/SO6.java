package X;

import java.util.Locale;
import java.util.concurrent.TimeUnit;

public abstract class SO6 {
    public final C9105RPc A00;
    public volatile Object A01;

    public static Object A00(SO6 so6) {
        Object obj;
        Object obj2 = so6.A01;
        if (obj2 != null) {
            return obj2;
        }
        synchronized (so6) {
            obj = so6.A01;
            if (obj == null) {
                obj = Pxe.A0p();
                so6.A01 = obj;
            }
        }
        return obj;
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [X.R25, X.SO6] */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0014, code lost:
        if (java.lang.Double.isNaN(r13) != false) goto L_0x0016;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.SO6 create(double r13, X.C9105RPc r15) {
        /*
            X.R25 r7 = new X.R25
            r7.<init>(r15)
            r0 = 0
            r7.A03 = r0
            r11 = 0
            int r0 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r0 <= 0) goto L_0x0016
            boolean r0 = java.lang.Double.isNaN(r13)
            r1 = 1
            if (r0 == 0) goto L_0x0017
        L_0x0016:
            r1 = 0
        L_0x0017:
            java.lang.String r0 = "rate must be positive"
            X.17k.A0G(r1, r0)
            java.lang.Object r10 = A00(r7)
            monitor-enter(r10)
            X.RPc r0 = r7.A00     // Catch:{ all -> 0x0070 }
            X.R24 r0 = (X.R24) r0     // Catch:{ all -> 0x0070 }
            X.4MS r1 = r0.A00     // Catch:{ all -> 0x0070 }
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MICROSECONDS     // Catch:{ all -> 0x0070 }
            long r4 = r1.A00(r0)     // Catch:{ all -> 0x0070 }
            long r2 = r7.A03     // Catch:{ all -> 0x0070 }
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x0047
            long r0 = r4 - r2
            double r8 = (double) r0     // Catch:{ all -> 0x0070 }
            double r0 = r7.A01     // Catch:{ all -> 0x0070 }
            double r8 = r8 / r0
            double r2 = r7.A00     // Catch:{ all -> 0x0070 }
            double r0 = r7.A02     // Catch:{ all -> 0x0070 }
            double r0 = r0 + r8
            double r0 = java.lang.Math.min(r2, r0)     // Catch:{ all -> 0x0070 }
            r7.A02 = r0     // Catch:{ all -> 0x0070 }
            r7.A03 = r4     // Catch:{ all -> 0x0070 }
        L_0x0047:
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x0070 }
            r0 = 1
            long r2 = r2.toMicros(r0)     // Catch:{ all -> 0x0070 }
            double r0 = (double) r2     // Catch:{ all -> 0x0070 }
            double r0 = r0 / r13
            r7.A01 = r0     // Catch:{ all -> 0x0070 }
            double r5 = r7.A00     // Catch:{ all -> 0x0070 }
            r3 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r3 = r3 * r13
            r7.A00 = r3     // Catch:{ all -> 0x0070 }
            r1 = 9218868437227405312(0x7ff0000000000000, double:Infinity)
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0062
            r0 = r3
            goto L_0x006c
        L_0x0062:
            r0 = 0
            int r2 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r2 == 0) goto L_0x006c
            double r0 = r7.A02     // Catch:{ all -> 0x0070 }
            double r0 = r0 * r3
            double r0 = r0 / r5
        L_0x006c:
            r7.A02 = r0     // Catch:{ all -> 0x0070 }
            monitor-exit(r10)     // Catch:{ all -> 0x0070 }
            return r7
        L_0x0070:
            r0 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x0070 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SO6.create(double, X.RPc):X.SO6");
    }

    public final String toString() {
        double micros;
        Locale locale = Locale.ROOT;
        synchronized (A00(this)) {
            micros = ((double) TimeUnit.SECONDS.toMicros(1)) / ((R25) this).A01;
        }
        return String.format(locale, "RateLimiter[stableRate=%3.1fqps]", new Object[]{Double.valueOf(micros)});
    }

    public SO6(C9105RPc rPc) {
        rPc.getClass();
        this.A00 = rPc;
    }
}
