package X;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: X.OaX  reason: case insensitive filesystem */
public final class C71055OaX {
    public static final C71055OaX A00 = new Object();

    public static final Object A00(0lg r5, ExecutorService executorService, C62320sa r7) {
        long A01 = 182.A01(0Tu.A05, r5, 36605834465908036L);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        if (A01 <= 0) {
            return r7.invoke();
        }
        Future submit = executorService.submit(new C41369Asq((Object) r7, 13));
        try {
            return submit.get(A01, timeUnit);
        } catch (TimeoutException e) {
            submit.cancel(true);
            throw e;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0070, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        X.1zE.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0074, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0077, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        X.1zE.A00(r3, r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(android.net.Uri r7, X.0lg r8, boolean r9) {
        /*
            X.0Tu r2 = X.0Tu.A05
            r0 = 36321022298825752(0x8109c700002418, double:3.0328989825705635E-306)
            boolean r0 = X.182.A06(r2, r8, r0)
            if (r9 == 0) goto L_0x0097
            if (r0 == 0) goto L_0x0097
            java.io.File r4 = X.C69680Nq2.A00(r7)     // Catch:{ all -> 0x007c }
            long r5 = r4.length()     // Catch:{ all -> 0x007c }
            r1 = 0
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0021
            r4.getPath()     // Catch:{ all -> 0x007c }
            goto L_0x0082
        L_0x0021:
            java.lang.String r2 = r4.getParent()     // Catch:{ all -> 0x007c }
            java.lang.String r1 = r4.getName()     // Catch:{ all -> 0x007c }
            java.lang.String r0 = ".gz"
            java.lang.String r0 = X.002.A0R(r1, r0)     // Catch:{ all -> 0x007c }
            java.io.File r1 = new java.io.File     // Catch:{ all -> 0x007c }
            r1.<init>(r2, r0)     // Catch:{ all -> 0x007c }
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch:{ all -> 0x007c }
            r3.<init>(r4)     // Catch:{ all -> 0x007c }
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch:{ all -> 0x0075 }
            r0.<init>(r1)     // Catch:{ all -> 0x0075 }
            java.util.zip.GZIPOutputStream r2 = new java.util.zip.GZIPOutputStream     // Catch:{ all -> 0x0075 }
            r2.<init>(r0)     // Catch:{ all -> 0x0075 }
            X.C11108SAj.A00(r3, r2)     // Catch:{ all -> 0x006e }
            r2.close()     // Catch:{ all -> 0x0075 }
            r3.close()     // Catch:{ all -> 0x007c }
            r1.length()     // Catch:{ all -> 0x007c }
            r1.getName()     // Catch:{ all -> 0x007c }
            boolean r0 = r1.renameTo(r4)     // Catch:{ all -> 0x007c }
            if (r0 != 0) goto L_0x0082
            java.lang.String r3 = "Failed to rename "
            java.lang.String r2 = r1.getPath()     // Catch:{ all -> 0x007c }
            java.lang.String r1 = " to "
            java.lang.String r0 = r4.getPath()     // Catch:{ all -> 0x007c }
            java.lang.String r1 = X.002.A0u(r3, r2, r1, r0)     // Catch:{ all -> 0x007c }
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x007c }
            r0.<init>(r1)     // Catch:{ all -> 0x007c }
            goto L_0x007b
        L_0x006e:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0070 }
        L_0x0070:
            r0 = move-exception
            X.1zE.A00(r2, r1)     // Catch:{ all -> 0x0075 }
            throw r0     // Catch:{ all -> 0x0075 }
        L_0x0075:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0077 }
        L_0x0077:
            r0 = move-exception
            X.1zE.A00(r3, r1)     // Catch:{ all -> 0x007c }
        L_0x007b:
            throw r0     // Catch:{ all -> 0x007c }
        L_0x007c:
            r0 = move-exception
            X.0eQ r4 = new X.0eQ
            r4.<init>(r0)
        L_0x0082:
            java.lang.Throwable r2 = X.0eR.A00(r4)
            if (r2 == 0) goto L_0x0097
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "Failed to gzip attachment "
            java.lang.String r1 = X.AnonymousClass7TG.A0m(r7, r0, r1)
            java.lang.String r0 = "BugReporterFileUtil"
            X.0KC.A0G(r0, r1, r2)
        L_0x0097:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71055OaX.A01(android.net.Uri, X.0lg, boolean):void");
    }
}
