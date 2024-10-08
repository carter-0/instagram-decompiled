package X;

import android.hardware.Camera;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: X.9Rv  reason: invalid class name and case insensitive filesystem */
public final class C378949Rv {
    public final C378959Rw A00 = new C378959Rw();
    public final C3496981j A01 = new C3496981j();
    public final C3496981j A02 = new C3496981j();
    public volatile C341877nf A03;

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002d, code lost:
        if (r1 != false) goto L_0x002f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(android.hardware.Camera r6) {
        /*
            r5 = this;
            X.9Rw r2 = r5.A00
            java.util.concurrent.locks.ReentrantLock r4 = r2.A01
            r4.lock()
            if (r6 == 0) goto L_0x0073
            r4.lock()     // Catch:{ all -> 0x0067 }
            r4.lock()     // Catch:{ all -> 0x0062 }
            int r0 = r2.A00     // Catch:{ all -> 0x005d }
            r1 = 2
            r0 = r0 & 2
            boolean r0 = X.AnonymousClass7TF.A1S(r0, r1)
            r4.unlock()     // Catch:{ all -> 0x0062 }
            if (r0 != 0) goto L_0x002f
            r4.lock()     // Catch:{ all -> 0x0062 }
            int r0 = r2.A00     // Catch:{ all -> 0x005d }
            r1 = 4
            r0 = r0 & 4
            boolean r1 = X.AnonymousClass7TF.A1S(r0, r1)
            r4.unlock()     // Catch:{ all -> 0x0062 }
            r0 = 0
            if (r1 == 0) goto L_0x0030
        L_0x002f:
            r0 = 1
        L_0x0030:
            r4.unlock()     // Catch:{ all -> 0x0067 }
            if (r0 != 0) goto L_0x0073
            boolean r0 = r2.A00()     // Catch:{ all -> 0x0067 }
            if (r0 != 0) goto L_0x0073
            r4.lock()     // Catch:{ all -> 0x0067 }
            boolean r0 = r2.A01()     // Catch:{ all -> 0x0062 }
            if (r0 == 0) goto L_0x0055
            r0 = 1
            r2.A00 = r0     // Catch:{ all -> 0x0062 }
            r4.unlock()     // Catch:{ all -> 0x0067 }
            r2 = 32
            r1 = 0
            r0 = 0
            X.C340577lU.A00(r2, r1, r0)     // Catch:{ all -> 0x0067 }
            X.AnonymousClass0fI.A01(r6)     // Catch:{ all -> 0x0067 }
            goto L_0x0073
        L_0x0055:
            java.lang.String r1 = "Cannot progress to STARTING, not in STOPPED state"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0062 }
            r0.<init>(r1)     // Catch:{ all -> 0x0062 }
            goto L_0x0061
        L_0x005d:
            r0 = move-exception
            r4.unlock()     // Catch:{ all -> 0x0062 }
        L_0x0061:
            throw r0     // Catch:{ all -> 0x0062 }
        L_0x0062:
            r0 = move-exception
            r4.unlock()     // Catch:{ all -> 0x0067 }
            throw r0     // Catch:{ all -> 0x0067 }
        L_0x0067:
            r3 = move-exception
            r2 = 33
            r1 = 0
            r0 = 0
            X.C340577lU.A00(r2, r1, r0)
            r4.unlock()
            throw r3
        L_0x0073:
            r2 = 33
            r1 = 0
            r0 = 0
            X.C340577lU.A00(r2, r1, r0)
            r4.unlock()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C378949Rv.A00(android.hardware.Camera):void");
    }

    public final void A01(boolean z, Camera camera) {
        C378959Rw r1 = this.A00;
        ReentrantLock reentrantLock = r1.A01;
        reentrantLock.lock();
        if (camera != null) {
            try {
                if (!r1.A01()) {
                    AnonymousClass0fI.A02(camera);
                    reentrantLock.lock();
                    r1.A00 = 0;
                    reentrantLock.unlock();
                    C341877nf r12 = this.A03;
                    if (r12 != null && !r12.A00.isEmpty()) {
                        C342057ny.A00(new C365908ns(r12));
                    }
                    if (z) {
                        C3496981j r13 = this.A02;
                        if (!r13.A00.isEmpty()) {
                            C342057ny.A00(new C368268sL(this, r13.A00));
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            } finally {
            }
        }
        reentrantLock.unlock();
    }
}
