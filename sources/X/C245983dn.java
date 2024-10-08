package X;

import android.os.Handler;
import android.os.Looper;

/* renamed from: X.3dn  reason: invalid class name and case insensitive filesystem */
public abstract class C245983dn {
    public static final AnonymousClass0eM A00;
    public static final AnonymousClass0eM A01;

    static {
        0eO r1 = 0eO.A04;
        A00 = AnonymousClass0eN.A00(r1, C245993do.A00);
        A01 = AnonymousClass0eN.A00(r1, C246003dp.A00);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0015, code lost:
        if (r2 == false) goto L_0x0017;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(java.util.concurrent.Future r7, int r8) {
        /*
            java.lang.String r5 = ", "
            java.lang.String r4 = "Unable to restore priority: "
            int r0 = android.os.Process.myTid()
            r6 = 1
            r3 = 0
            r2 = 0
            if (r8 == r0) goto L_0x000e
            r2 = 1
        L_0x000e:
            boolean r0 = r7.isDone()
            if (r0 != 0) goto L_0x0017
            r1 = 1
            if (r2 != 0) goto L_0x0018
        L_0x0017:
            r1 = 0
        L_0x0018:
            boolean r0 = A03()
            if (r0 == 0) goto L_0x0036
            if (r1 == 0) goto L_0x0036
            int r0 = android.os.Process.myTid()
            int r1 = android.os.Process.getThreadPriority(r0)
            int r3 = android.os.Process.getThreadPriority(r8)
            r0 = r1
        L_0x002d:
            if (r1 >= r3) goto L_0x0037
            android.os.Process.setThreadPriority(r8, r0)     // Catch:{ SecurityException -> 0x0033 }
            goto L_0x0037
        L_0x0033:
            int r0 = r0 + 1
            goto L_0x002d
        L_0x0036:
            r6 = 0
        L_0x0037:
            java.lang.Object r0 = r7.get()     // Catch:{ ExecutionException -> 0x0066, InterruptedException -> 0x005b, CancellationException -> 0x0059 }
            if (r6 == 0) goto L_0x0058
            android.os.Process.setThreadPriority(r8, r3)     // Catch:{ IllegalArgumentException -> 0x004c, SecurityException -> 0x0041 }
            goto L_0x0057
        L_0x0041:
            r2 = move-exception
            java.lang.String r1 = X.002.A02(r8, r3, r4, r5)
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1, r2)
            throw r0
        L_0x004c:
            r2 = move-exception
            java.lang.String r1 = X.002.A02(r8, r3, r4, r5)
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1, r2)
            throw r0
        L_0x0057:
            return r0
        L_0x0058:
            return r0
        L_0x0059:
            r1 = move-exception
            goto L_0x0079
        L_0x005b:
            r1 = move-exception
            java.lang.String r0 = r1.getMessage()     // Catch:{ all -> 0x0083 }
            java.lang.RuntimeException r2 = new java.lang.RuntimeException     // Catch:{ all -> 0x0083 }
            r2.<init>(r0, r1)     // Catch:{ all -> 0x0083 }
            goto L_0x0082
        L_0x0066:
            r1 = move-exception
            java.lang.Throwable r2 = r1.getCause()     // Catch:{ all -> 0x0083 }
            boolean r0 = r2 instanceof java.lang.RuntimeException     // Catch:{ all -> 0x0083 }
            if (r0 != 0) goto L_0x0082
            java.lang.String r0 = r1.getMessage()     // Catch:{ all -> 0x0083 }
            java.lang.RuntimeException r2 = new java.lang.RuntimeException     // Catch:{ all -> 0x0083 }
            r2.<init>(r0, r1)     // Catch:{ all -> 0x0083 }
            goto L_0x0082
        L_0x0079:
            java.lang.String r0 = r1.getMessage()     // Catch:{ all -> 0x0083 }
            java.lang.RuntimeException r2 = new java.lang.RuntimeException     // Catch:{ all -> 0x0083 }
            r2.<init>(r0, r1)     // Catch:{ all -> 0x0083 }
        L_0x0082:
            throw r2     // Catch:{ all -> 0x0083 }
        L_0x0083:
            r0 = move-exception
            if (r6 == 0) goto L_0x00a0
            android.os.Process.setThreadPriority(r8, r3)     // Catch:{ IllegalArgumentException -> 0x0095, SecurityException -> 0x008a }
            throw r0
        L_0x008a:
            r2 = move-exception
            java.lang.String r1 = X.002.A02(r8, r3, r4, r5)
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1, r2)
            throw r0
        L_0x0095:
            r2 = move-exception
            java.lang.String r1 = X.002.A02(r8, r3, r4, r5)
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1, r2)
            throw r0
        L_0x00a0:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C245983dn.A00(java.util.concurrent.Future, int):java.lang.Object");
    }

    public static final void A02(String str) {
        if (!AnonymousClass2SY.A02 && !A03()) {
            if (str == null) {
                str = 002.A0R("This must run on the main thread; but is running on ", Thread.currentThread().getName());
            }
            throw new IllegalStateException(str);
        }
    }

    public static final void A01(Runnable runnable) {
        if (A03()) {
            runnable.run();
        } else {
            ((Handler) A00.getValue()).post(runnable);
        }
    }

    public static final boolean A03() {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return true;
        }
        return false;
    }
}
