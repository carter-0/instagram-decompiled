package X;

import android.view.Surface;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.8KT  reason: invalid class name */
public abstract class AnonymousClass8KT implements AnonymousClass8KU {
    public C345937uK A00;
    public Surface A01;
    public final AtomicBoolean A02 = new AtomicBoolean(false);
    public final AtomicBoolean A03 = new AtomicBoolean(false);
    public final AtomicReference A04 = new AtomicReference((Object) null);
    public volatile boolean A05 = true;

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0008, code lost:
        if (r2.A05 == false) goto L_0x000a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean AFP() {
        /*
            r2 = this;
            monitor-enter(r2)
            X.7uK r0 = r2.A00     // Catch:{ all -> 0x000d }
            if (r0 == 0) goto L_0x000a
            boolean r1 = r2.A05     // Catch:{ all -> 0x000d }
            r0 = 1
            if (r1 != 0) goto L_0x000b
        L_0x000a:
            r0 = 0
        L_0x000b:
            monitor-exit(r2)
            return r0
        L_0x000d:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8KT.AFP():boolean");
    }

    public final synchronized void setEnabled(boolean z) {
        this.A05 = z;
    }

    public final void CMn(Surface surface, C344557s3 r4) {
        if (this.A00 != null) {
            if (this.A01 == surface) {
                0KC.A0C("BaseVideoOutput", "GLSurface already created, high chance it might cause an issue");
                return;
            }
            release();
        }
        if (surface != null && surface.isValid()) {
            this.A00 = r4.AMY(surface);
            this.A01 = surface;
            this.A02.set(true);
        }
        this.A03.set(false);
    }

    public final /* synthetic */ boolean CdZ() {
        if (this instanceof AnonymousClass8KS) {
            return ((AnonymousClass8KS) this).A01;
        }
        return false;
    }

    public boolean ClU() {
        C345937uK r0 = this.A00;
        if (r0 != null) {
            return r0.A05();
        }
        return false;
    }

    public void Dpd() {
        this.A03.compareAndSet(false, true);
    }

    public int getHeight() {
        C345937uK r0 = this.A00;
        if (r0 != null) {
            return r0.A00();
        }
        return 0;
    }

    public int getWidth() {
        C345937uK r0 = this.A00;
        if (r0 != null) {
            return r0.A01();
        }
        return 0;
    }

    public void release() {
        C345937uK r0 = this.A00;
        if (r0 != null) {
            r0.A02();
            this.A00 = null;
        }
        this.A02.set(false);
        this.A01 = null;
    }

    public void swapBuffers() {
        C345937uK r0 = this.A00;
        if (r0 != null) {
            r0.A03();
        }
    }
}
