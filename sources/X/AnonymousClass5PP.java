package X;

import android.view.Choreographer;

/* renamed from: X.5PP  reason: invalid class name */
public final class AnonymousClass5PP implements Runnable, Choreographer.FrameCallback {
    public final /* synthetic */ AnonymousClass5PM A00;

    public AnonymousClass5PP(AnonymousClass5PM r1) {
        this.A00 = r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001f, code lost:
        r1 = r2.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0023, code lost:
        if (r3 >= r1) goto L_0x0031;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0025, code lost:
        ((android.view.Choreographer.FrameCallback) r2.get(r3)).doFrame(r6);
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0031, code lost:
        r2.clear();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0034, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void doFrame(long r6) {
        /*
            r5 = this;
            X.5PM r4 = r5.A00
            android.os.Handler r0 = r4.A04
            r0.removeCallbacks(r5)
            X.AnonymousClass5PM.A00(r4)
            java.lang.Object r1 = r4.A08
            monitor-enter(r1)
            boolean r0 = r4.A02     // Catch:{ all -> 0x0035 }
            if (r0 != 0) goto L_0x0013
            monitor-exit(r1)
            return
        L_0x0013:
            r3 = 0
            r4.A02 = r3     // Catch:{ all -> 0x0035 }
            java.util.List r2 = r4.A01     // Catch:{ all -> 0x0035 }
            java.util.List r0 = r4.A00     // Catch:{ all -> 0x0035 }
            r4.A01 = r0     // Catch:{ all -> 0x0035 }
            r4.A00 = r2     // Catch:{ all -> 0x0035 }
            monitor-exit(r1)
            int r1 = r2.size()
        L_0x0023:
            if (r3 >= r1) goto L_0x0031
            java.lang.Object r0 = r2.get(r3)
            android.view.Choreographer$FrameCallback r0 = (android.view.Choreographer.FrameCallback) r0
            r0.doFrame(r6)
            int r3 = r3 + 1
            goto L_0x0023
        L_0x0031:
            r2.clear()
            return
        L_0x0035:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5PP.doFrame(long):void");
    }

    public final void run() {
        AnonymousClass5PM r2 = this.A00;
        AnonymousClass5PM.A00(r2);
        synchronized (r2.A08) {
            if (r2.A01.isEmpty()) {
                r2.A05.removeFrameCallback(this);
                r2.A02 = false;
            }
        }
    }
}
