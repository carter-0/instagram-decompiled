package X;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* renamed from: X.TSk  reason: case insensitive filesystem */
public final class C13269TSk extends FutureTask implements C13987Tnd {
    public final C10415Rrr A00 = new C10415Rrr();

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0013, code lost:
        if (r1.isEmpty() != false) goto L_0x001f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0015, code lost:
        r1.poll();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001e, code lost:
        throw X.AnonymousClass7TE.A11("execute");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001f, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void done() {
        /*
            r3 = this;
            X.Rrr r2 = r3.A00
            java.util.Queue r1 = r2.A01
            monitor-enter(r1)
            boolean r0 = r2.A00     // Catch:{ all -> 0x0020 }
            if (r0 == 0) goto L_0x000b
            monitor-exit(r1)     // Catch:{ all -> 0x0020 }
            return
        L_0x000b:
            r0 = 1
            r2.A00 = r0     // Catch:{ all -> 0x0020 }
            monitor-exit(r1)     // Catch:{ all -> 0x0020 }
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x001f
            r1.poll()
            java.lang.String r0 = "execute"
            java.lang.NullPointerException r0 = X.AnonymousClass7TE.A11(r0)
            throw r0
        L_0x001f:
            return
        L_0x0020:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0020 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C13269TSk.done():void");
    }

    public C13269TSk(Runnable runnable, Object obj) {
        super(runnable, obj);
    }

    public C13269TSk(Callable callable) {
        super(callable);
    }
}
