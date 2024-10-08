package X;

import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: X.90c  reason: invalid class name and case insensitive filesystem */
public final class C3722590c {
    public static final 1K8 A02 = new 1K8(C3722590c.class);
    public C295595oY A00;
    public boolean A01;

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0019, code lost:
        if (r2 == null) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001b, code lost:
        A00(r2.A01, r2.A02);
        r2 = r2.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0025, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0010, code lost:
        if (r1 == null) goto L_0x0019;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0012, code lost:
        r0 = r1.A00;
        r1.A00 = r2;
        r2 = r1;
        r1 = r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01() {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.A01     // Catch:{ all -> 0x0026 }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r3)     // Catch:{ all -> 0x0026 }
            return
        L_0x0007:
            r0 = 1
            r3.A01 = r0     // Catch:{ all -> 0x0026 }
            X.5oY r1 = r3.A00     // Catch:{ all -> 0x0026 }
            r2 = 0
            r3.A00 = r2     // Catch:{ all -> 0x0026 }
            monitor-exit(r3)     // Catch:{ all -> 0x0026 }
        L_0x0010:
            if (r1 == 0) goto L_0x0019
            X.5oY r0 = r1.A00
            r1.A00 = r2
            r2 = r1
            r1 = r0
            goto L_0x0010
        L_0x0019:
            if (r2 == 0) goto L_0x0025
            java.lang.Runnable r1 = r2.A01
            java.util.concurrent.Executor r0 = r2.A02
            A00(r1, r0)
            X.5oY r2 = r2.A00
            goto L_0x0019
        L_0x0025:
            return
        L_0x0026:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0026 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3722590c.A01():void");
    }

    public final void A02(Runnable runnable, Executor executor) {
        17k.A07(runnable, "Runnable was null.");
        17k.A07(executor, "Executor was null.");
        synchronized (this) {
            if (!this.A01) {
                this.A00 = new C295595oY(this.A00, runnable, executor);
            } else {
                A00(runnable, executor);
            }
        }
    }

    public static void A00(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e) {
            Logger A002 = A02.A00();
            Level level = Level.SEVERE;
            StringBuilder sb = new StringBuilder();
            sb.append(AnonymousClass000.A00(1021));
            sb.append(runnable);
            sb.append(AnonymousClass000.A00(837));
            sb.append(executor);
            A002.log(level, sb.toString(), e);
        }
    }
}
