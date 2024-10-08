package X;

import java.util.concurrent.Executor;

public final class Q4D implements AnonymousClass11X {
    public final Q3F A00;
    public final String A01;
    public final Executor A02;
    public final 1OC A03;

    public final int getRunnableId() {
        return -8;
    }

    public final void onCancel() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0032, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0033, code lost:
        X.1zE.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0036, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String A00(X.Q4E r2) {
        /*
            X.2ZL r0 = r2.A00
            r2 = 0
            X.1Qb r0 = r0.A00()
            if (r0 == 0) goto L_0x000d
            java.io.InputStream r2 = r0.AjD()
        L_0x000d:
            java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.UTF_8
            java.io.InputStreamReader r0 = new java.io.InputStreamReader
            r0.<init>(r2, r1)
            java.io.BufferedReader r2 = new java.io.BufferedReader
            r2.<init>(r0)
            java.lang.StringBuffer r1 = new java.lang.StringBuffer     // Catch:{ all -> 0x0030 }
            r1.<init>()     // Catch:{ all -> 0x0030 }
        L_0x001e:
            java.lang.String r0 = r2.readLine()     // Catch:{ all -> 0x0030 }
            if (r0 == 0) goto L_0x0028
            r1.append(r0)     // Catch:{ all -> 0x0030 }
            goto L_0x001e
        L_0x0028:
            java.lang.String r0 = X.DbT.A10(r1)     // Catch:{ all -> 0x0030 }
            r2.close()
            return r0
        L_0x0030:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0032 }
        L_0x0032:
            r0 = move-exception
            X.1zE.A00(r2, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Q4D.A00(X.Q4E):java.lang.String");
    }

    public final String getName() {
        return this.A03.A05;
    }

    public final void onFinish() {
        this.A03.onFinish();
    }

    public final void onStart() {
        this.A03.onStart();
    }

    public final void run() {
        this.A03.run();
    }

    public Q4D(1OC r3, Q3F q3f, String str, Executor executor) {
        this.A01 = str;
        this.A03 = r3;
        this.A02 = executor;
        this.A00 = q3f;
        r3.A00 = new C15621Ufn(this, 2);
    }
}
